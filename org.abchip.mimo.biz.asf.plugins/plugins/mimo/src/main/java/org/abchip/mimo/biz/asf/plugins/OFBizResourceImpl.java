/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.asf.plugins.entity.EntityUtils;
import org.abchip.mimo.biz.asf.plugins.entity.ServiceUtils;
import org.abchip.mimo.biz.model.party.contact.EmailAddress;
import org.abchip.mimo.biz.model.party.contact.PartyContactMech;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.abchip.mimo.util.Logs;
import org.apache.ofbiz.base.util.GeneralException;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.model.ModelEntity;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelFieldTypeReader;
import org.apache.ofbiz.entity.transaction.GenericTransactionException;
import org.apache.ofbiz.entity.transaction.TransactionUtil;
import org.apache.ofbiz.entity.util.EntityQuery;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ModelParam;
import org.apache.ofbiz.service.ModelService;
import org.apache.ofbiz.service.ServiceUtil;
import org.osgi.service.log.Logger;

public class OFBizResourceImpl<E extends EntityIdentifiable> extends ResourceImpl<E> {

	private static final Logger LOGGER = Logs.getLogger(OFBizResourceImpl.class);

	private Frame<E> frame = null;

	private ModelFieldTypeReader modelHelper;

	public OFBizResourceImpl(Context context, Frame<E> frame) {
		super(context);

		this.frame = frame;

		Delegator delegator = ContextUtils.getDelegator(context.getTenant(), false);

		ModelEntity modelEntity = delegator.getModelEntity(frame.getName());
		this.modelHelper = delegator.getModelFieldTypeReader(modelEntity);
	}

	@Override
	public Frame<E> getFrame() {
		return this.frame;
	}

	@Override
	public void create(E entity, boolean update, boolean raw) throws ResourceException {

		if (entity.getResource() != null && this != entity.getResource()) {
			LOGGER.error("Invalid resource destination ofbiz/{} origin {}", this.getFrame().getName(), entity.getResource());
			return;
		}

		Delegator delegator = ContextUtils.getDelegator(getContext().getTenant(), raw);

		if (!raw && !useRaw()) {
			LocalDispatcher dispatcher = ContextUtils.getLocalDispatcher(delegator);
			String serviceName = "create" + this.getFrame().getName();
			try {
				ModelService service = dispatcher.getDispatchContext().getModelService(serviceName);

				try {
					Map<String, Object> context = ServiceUtils.toBizContext(this.getContext(), delegator, service, entity);
					context = dispatcher.runSync(serviceName, context);
					if (ServiceUtil.isError(context))
						throw new ResourceException(ServiceUtil.getErrorMessage(context));

					completeEntity(service, entity, context);

					if (entity.getResource() == null)
						this.attach(entity);

					return;
				} catch (GeneralException e) {
					throw new ResourceException(e);
				}
			} catch (GenericServiceException e) {
				// service not found
			}
		}

		boolean beganTransaction = false;

		try {
			beganTransaction = TransactionUtil.begin();

			this.doCreate(delegator, entity.isa(), entity, update);
			if (entity.getResource() == null)
				this.attach(entity);

			TransactionUtil.commit(beganTransaction);
		} catch (GeneralException e) {
			try {
				String errMsg = "Failure in create operation for entity [" + this.getFrame().getName() + "/" + entity.getID() + "]: " + e.toString() + ". Rolling back transaction.";
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}
	}

	@Override
	public String nextSequence() throws ResourceException {

		if (this.frame.getAllKeys().size() != 1)
			return null;

		// first level non abstract
		Frame<?> frame = this.frame;
		while (frame.getAko() != null && !frame.getAko().isAbstract())
			frame = frame.getAko();

		String nextSeq = null;

		boolean beganTransaction = false;

		try {
			beganTransaction = TransactionUtil.begin();

			nextSeq = ContextUtils.getDelegator(getContext().getTenant(), false).getNextSeqId(frame.getName());

			TransactionUtil.commit(beganTransaction);
		} catch (GenericEntityException e) {
			try {
				String errMsg = "General error in getting a sequenced ID for frame " + this.getFrame().getID();
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}
		return nextSeq;
	}

	@Override
	public E lookup(String name, String fields, boolean proxy) throws ResourceException {

		Delegator delegator = ContextUtils.getDelegator(getContext().getTenant(), false);

		OFBizQueryBuilder<E> queryBuilder = new OFBizQueryBuilder<E>(this.getContext(), frame, delegator, modelHelper);

		E entity = null;

		boolean beganTransaction = false;
		try {
			if (proxy)
				queryBuilder.addFields(this.getFrame().getAllKeySlots());
			else if (fields != null && !fields.isEmpty()) {
				queryBuilder.addFields(this.getFrame().getAllKeySlots());
				queryBuilder.addFieldsExpr(fields);
			}
			else {
				// .*
			}

			queryBuilder.addPrimaryKeyCondition(name);

			queryBuilder.addOrders(this.getFrame().getAllKeySlots());

			EntityQuery entityQuery = queryBuilder.buildEntityQuery();

			beganTransaction = TransactionUtil.begin();

			GenericValue genericValue = entityQuery.queryOne();
			if (genericValue != null) {
				if (proxy) {
					String id = getPkSlashValueString(genericValue);
					entity = this.createProxy(id);
				} else {
					entity = make();
					EntityUtils.completeEntity(getContext(), entity, genericValue);
				}
			}

			TransactionUtil.commit(beganTransaction);
		} catch (GeneralException e) {
			entity = null;
			try {
				String errMsg = "Failure in lookup operation for entity [" + this.getFrame().getName() + "/" + name + "]: " + e.toString() + ". Rolling back transaction.";
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}

		return entity;
	}

	@Override
	public List<E> find(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException {

		LOGGER.trace("Read frame {} filter {} fields {} order {} limit {} proxy {}", this.getFrame().getName(), filter, fields, order, limit, proxy);

		Delegator delegator = ContextUtils.getDelegator(getContext().getTenant(), false);

		OFBizQueryBuilder<E> queryBuilder = new OFBizQueryBuilder<E>(this.getContext(), frame, delegator, modelHelper);

		List<E> entities = new ArrayList<E>();

		boolean beganTransaction = false;
		try {
			if (proxy)
				queryBuilder.addFields(this.getFrame().getAllKeySlots());
			else if (fields != null && !fields.isEmpty()) {
				queryBuilder.addFields(this.getFrame().getAllKeySlots());
				queryBuilder.addFieldsExpr(fields);
			}
			else {
				// .*
			}

			if (filter != null && !filter.isEmpty())
				queryBuilder.addConditionsExpr(filter);

			if (order != null && !order.isEmpty()) {
				queryBuilder.addOrdersExpr(order);
				queryBuilder.addOrders(this.getFrame().getAllKeySlots());
			}
			else 
				queryBuilder.addOrders(this.getFrame().getAllKeySlots());

			EntityQuery entityQuery = queryBuilder.buildEntityQuery();
			if (limit > 0)
				entityQuery.maxRows(limit);

			beganTransaction = TransactionUtil.begin();
			for (GenericValue genericValue : entityQuery.queryList()) {
				E entity = null;
				if (proxy) {
					String id = getPkSlashValueString(genericValue);
					entity = this.createProxy(id);
				} else {
					entity = make();
					EntityUtils.completeEntity(getContext(), entity, genericValue);
				}
				entities.add(entity);
			}
			TransactionUtil.commit(beganTransaction);
		} catch (GeneralException e) {
			try {
				String errMsg = "Failure in find operation for entity [" + this.getFrame().getName() + "]: " + e.toString() + ". Rolling back transaction.";
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}

		LOGGER.trace("Read frame {} elements {}", this.getFrame().getName(), entities.size());

		return entities;
	}

	@Override
	public void update(E entity) throws ResourceException {

		if (this != entity.getResource()) {
			LOGGER.error("Invalid resource destination ofbiz/{} origin {}", this.getFrame().getName(), entity.getResource());
			return;
		}

		Delegator delegator = ContextUtils.getDelegator(getContext().getTenant(), false);

		if (!useRaw()) {
			LocalDispatcher dispatcher = ContextUtils.getLocalDispatcher(delegator);

			try {
				String serviceName = "update" + this.getFrame().getName();
				ModelService service = dispatcher.getDispatchContext().getModelService(serviceName);

				try {
					Map<String, Object> context = ServiceUtils.toBizContext(this.getContext(), delegator, service, entity);
					context = dispatcher.runSync(serviceName, context);
					if (ServiceUtil.isError(context))
						throw new ResourceException(ServiceUtil.getErrorMessage(context));

					completeEntity(service, entity, context);

					return;
				} catch (GeneralException e) {
					throw new ResourceException(e);
				}
			} catch (GenericServiceException e) {
				// service not found
			}
		}

		boolean beganTransaction = false;
		try {
			beganTransaction = TransactionUtil.begin();

			doUpdate(delegator, entity.isa(), entity);

			TransactionUtil.commit(beganTransaction);
		} catch (GeneralException e) {
			try {
				String errMsg = "Failure in update operation for entity [" + this.getFrame().getName() + "/" + entity.getID() + "]: " + e.toString() + ". Rolling back transaction.";
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}
	}

	@Override
	public void delete(E entity) throws ResourceException {

		if (this != entity.getResource()) {
			LOGGER.error("Invalid resource destination ofbiz/{} origin {}", this.getFrame().getName(), entity.getResource());
			return;
		}

		Delegator delegator = ContextUtils.getDelegator(getContext().getTenant(), false);

		if (!useRaw()) {
			LocalDispatcher dispatcher = ContextUtils.getLocalDispatcher(delegator);

			try {
				String serviceName = "delete" + this.getFrame().getName();
				ModelService service = dispatcher.getDispatchContext().getModelService(serviceName);

				try {
					Map<String, Object> context = ServiceUtils.toBizContext(this.getContext(), delegator, service, entity);
					context = dispatcher.runSync(serviceName, context);
					if (ServiceUtil.isError(context))
						throw new ResourceException(ServiceUtil.getErrorMessage(context));

					this.detach(entity);

					return;
				} catch (GeneralException e) {
					throw new ResourceException(e);
				}
			} catch (GenericServiceException e) {
				// service not found
			}
		}

		boolean beganTransaction = false;

		try {
			beganTransaction = TransactionUtil.begin();

			this.doDelete(delegator, entity.isa(), entity);
			this.detach(entity);

			TransactionUtil.commit(beganTransaction);
		} catch (GeneralException e) {
			try {
				String errMsg = "Failure in delete operation for entity [" + this.getFrame().getName() + "/" + entity.getID() + "]: " + e.toString() + ". Rolling back transaction.";
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}
	}

	private <K extends EntityIdentifiable> void doCreate(Delegator delegator, Frame<K> frame, K entity, boolean replace) throws GeneralException {

		if (delegator.getModelReader().getModelEntityNoCheck(frame.getName()) == null)
			return;

		@SuppressWarnings("unchecked")
		Frame<K> ako = (Frame<K>) frame.getAko();
		if (ako != null)
			doCreate(delegator, ako, entity, replace);

		GenericValue genericValue = EntityUtils.toBizEntity(delegator, frame, entity);
		if (replace)
			delegator.createOrStore(genericValue);
		else
			delegator.create(genericValue);
	}

	private <K extends EntityIdentifiable> void doUpdate(Delegator delegator, Frame<K> frame, K entity) throws GeneralException {

		if (delegator.getModelReader().getModelEntityNoCheck(frame.getName()) == null)
			return;

		@SuppressWarnings("unchecked")
		Frame<K> ako = (Frame<K>) frame.getAko();
		if (ako != null)
			doUpdate(delegator, ako, entity);

		GenericValue genericValue = EntityUtils.toBizEntity(delegator, frame, entity);
		delegator.store(genericValue);
	}

	private <K extends EntityIdentifiable> void doDelete(Delegator delegator, Frame<K> frame, K entity) throws GeneralException {

		if (delegator.getModelReader().getModelEntityNoCheck(frame.getName()) == null)
			return;

		GenericValue genericValue = EntityUtils.toBizEntity(delegator, frame, entity);
		delegator.removeValue(genericValue);

		@SuppressWarnings("unchecked")
		Frame<K> ako = (Frame<K>) frame.getAko();
		if (ako != null)
			doDelete(delegator, ako, entity);
	}

	private void completeEntity(ModelService service, E entity, Map<String, Object> context) {

		Frame<E> frame = entity.isa();
		for (ModelParam modelParam : service.getModelParamList()) {
			if (!modelParam.isOut())
				continue;
			if (modelParam.internal)
				continue;

			// if (!frame.getName().equals(modelParam.getEntityName()))
			// continue;
			// if (modelParam.getFieldName() == null)
			// continue;
			Slot slot = null;
			if (modelParam.getFieldName() == null || modelParam.getFieldName().isEmpty()) {
				slot = frame.getSlot(modelParam.getName());
			} else {
				slot = frame.getSlot(modelParam.getFieldName());
			}
			if (slot == null) {
				LOGGER.warn("Unknown output parameter {} for entity {}", modelParam.getName(), frame.getName());
				continue;
			}

			Object paramValue = context.get(modelParam.getName());
			if (paramValue == null && !modelParam.isOptional()) {
				LOGGER.warn("Null output parameter {} for entity {}", modelParam.getName(), frame.getName());
				continue;
			}

			entity.eSet(slot, paramValue);
		}
	}

	private String getPkSlashValueString(GenericValue genericValue) {
		StringBuilder sb = new StringBuilder();
		for (ModelField curPk : genericValue.getModelEntity().getPkFieldsUnmodifiable()) {
			if (sb.length() > 0) {
				sb.append("/");
			}
			sb.append(genericValue.get(curPk.getName()));
		}
		return sb.toString();
	}

	private boolean useRaw() {
		if (this.getFrame().getName().equals(PartyContactMech.class.getSimpleName()))
			return true;
		else if (this.getFrame().getName().equals(EmailAddress.class.getSimpleName()))
			return true;
		else
			return false;
	}
}