/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.abchip.mimo.biz.plugins.entity.EntityUtils;
import org.abchip.mimo.biz.plugins.entity.ModelUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.parser.sqlite.SQLiteLexer;
import org.abchip.mimo.parser.sqlite.SQLiteParser;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.impl.ResourceImpl;
import org.abchip.mimo.util.Logs;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericPK;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.condition.EntityCondition;
import org.apache.ofbiz.entity.condition.EntityJoinOperator;
import org.apache.ofbiz.entity.model.DynamicViewEntity;
import org.apache.ofbiz.entity.model.ModelEntity;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelKeyMap;
import org.apache.ofbiz.entity.transaction.GenericTransactionException;
import org.apache.ofbiz.entity.transaction.TransactionUtil;
import org.apache.ofbiz.entity.util.EntityQuery;
import org.osgi.service.log.Logger;

public class OFBizResourceImpl<E extends EntityIdentifiable> extends ResourceImpl<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logs.getLogger(OFBizResourceImpl.class);

	private Frame<E> frame = null;
	private Delegator delegator = null;

	private ModelEntity modelEntity = null;

	public OFBizResourceImpl(Context context, Frame<E> frame, Delegator delegator) {
		this.frame = frame;
		this.delegator = delegator;
		this.modelEntity = delegator.getModelEntity(frame.getName());
	}

	@Override
	public String getTenant() {
		return this.delegator.getDelegatorTenantId();
	}

	@Override
	public Frame<E> getFrame() {
		return this.frame;
	}

	@Override
	public void create(E entity, boolean update) throws ResourceException {
		boolean beganTransaction = false;

		try {
			beganTransaction = TransactionUtil.begin();

			this.doCreate(entity.isa(), entity, update);

			TransactionUtil.commit(beganTransaction);
		} catch (GenericEntityException e) {
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
	public void update(E entity) throws ResourceException {
		boolean beganTransaction = false;

		try {
			beganTransaction = TransactionUtil.begin();

			this.doUpdate(entity.isa(), entity);

			TransactionUtil.commit(beganTransaction);
		} catch (GenericEntityException e) {
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

		boolean beganTransaction = false;

		try {
			beganTransaction = TransactionUtil.begin();

			this.doDelete(entity.isa(), entity);

			TransactionUtil.commit(beganTransaction);
		} catch (GenericEntityException e) {
			try {
				String errMsg = "Failure in delete operation for entity [" + this.getFrame().getName() + "/" + entity.getID() + "]: " + e.toString() + ". Rolling back transaction.";
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}
	}

	@Override
	public String nextSequence() throws ResourceException {

		if (this.frame.getKeys().size() != 1)
			return null;

		// first level non abstract
		Frame<?> frame = this.frame;
		while (frame.ako() != null && !frame.ako().isAbstract())
			frame = frame.ako();

		String nextSeq = null;

		boolean beganTransaction = false;

		try {
			beganTransaction = TransactionUtil.begin();

			nextSeq = this.delegator.getNextSeqId(frame.getName());

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
	public E read(String name, String fields, boolean proxy) throws ResourceException {

		E entity = null;

		DynamicViewEntity dynamicViewEntity = buildDynamicView(this.modelEntity);

		EntityQuery eq = EntityQuery.use(delegator);
		eq = eq.from(dynamicViewEntity);

		GenericPK primaryKey = GenericPK.create(modelEntity);
		String[] keys = name.split("/");
		int i = 0;
		for (String key : keys) {
			Slot slot = this.getFrame().getSlot(this.modelEntity.getPkFieldNames().get(i));
			Object value = EntityUtils.toBizValue(slot, key);
			primaryKey.set(slot.getName(), value);
			i++;
		}

		eq = eq.where(EntityCondition.makeCondition(primaryKey, EntityJoinOperator.AND));

		boolean beganTransaction = false;
		try {
			beganTransaction = TransactionUtil.begin();
			GenericValue genericValue = eq.queryOne();
			if (genericValue != null) {
				entity = EntityUtils.toEntity(frame, genericValue);
				if (proxy)
					entity = frame.createProxy(entity.getID());
			}

			TransactionUtil.commit(beganTransaction);
		} catch (GenericEntityException e) {
			try {
				String errMsg = "Failure in read operation for entity [" + this.getFrame().getName() + "/" + name + "]: " + e.toString() + ". Rolling back transaction.";
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}

		return entity;
	}

	@Override
	public List<E> read(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException {

		LOGGER.trace("Read frame {} filter {} fields {} order {} limit {} proxy {}", this.getFrame().getName(), filter, fields, order, limit, proxy);

		DynamicViewEntity dynamicViewEntity = buildDynamicView(this.modelEntity);

		OFBizFilterAnalyzer analyzer = null;
		if (filter != null && !filter.isEmpty()) {
			analyzer = analyzeFilter(delegator, this.modelEntity.getEntityName(), filter);
			filter = analyzer.getStringFilter();
		}

		if (analyzer != null && analyzer.getListEntities().size() > 0) {
			for (String linkedName : analyzer.getListEntities()) {
				ModelEntity linkedEntity = delegator.getModelEntity(linkedName);
				dynamicViewEntity.addMemberEntity(linkedEntity.getEntityName(), linkedEntity.getEntityName());
				Iterator<ModelField> fieldIterator = linkedEntity.getFieldsIterator();
				while (fieldIterator.hasNext()) {
					ModelField field = fieldIterator.next();
					dynamicViewEntity.addAlias(linkedEntity.getEntityName(), field.getName());
				}

				dynamicViewEntity.addViewLink(this.modelEntity.getEntityName(), linkedEntity.getEntityName(), Boolean.TRUE,
						ModelKeyMap.makeKeyMapList(this.modelEntity.getFirstPkFieldName(), linkedEntity.getFirstPkFieldName()));
			}
		}

		EntityQuery eq = EntityQuery.use(delegator);

		// SELECT
		if (fields != null)
			eq = eq.select(fields.split(","));
		else if (proxy)
			eq = eq.select(new HashSet<String>(this.modelEntity.getPkFieldNames()));
		// FROM
		eq = eq.from(dynamicViewEntity);

		// WHERE
		if (filter != null && !filter.isEmpty())
			eq = eq.where(EntityCondition.makeConditionWhere(filter));

		// ORDER BY
		if (order != null)
			eq.orderBy(order);
		else
			eq = eq.orderBy(this.modelEntity.getPkFieldNames());

		// LIMIT
		if (limit > 0)
			eq.maxRows(limit);

		List<E> entities = new ArrayList<E>();

		boolean beganTransaction = false;
		try {
			beganTransaction = TransactionUtil.begin();
			for (GenericValue genericValue : eq.queryList()) {
				E entity = EntityUtils.toEntity(frame, genericValue);
				if (proxy)
					entity = frame.createProxy(entity.getID());

				entities.add(entity);
			}
			TransactionUtil.commit(beganTransaction);
		} catch (GenericEntityException e) {
			try {
				String errMsg = "Failure in read operation for entity [" + this.getFrame().getName() + "]: " + e.toString() + ". Rolling back transaction.";
				TransactionUtil.rollback(beganTransaction, errMsg, e);
			} catch (GenericTransactionException e1) {
				LOGGER.warn(e1.getMessage());
			}
			throw new ResourceException(e);
		}

		LOGGER.trace("Read frame {} elements {}", this.getFrame().getName(), entities.size());

		return entities;
	}

	private void doCreate(Frame<?> frame, EntityIdentifiable entity, boolean replace) throws GenericEntityException {

		if (this.delegator.getModelReader().getModelEntityNoCheck(frame.getName()) == null)
			return;

		Frame<?> ako = frame.ako();
		if (ako != null)
			doCreate(ako, entity, replace);

		GenericValue genericValue = EntityUtils.toBizEntity(this.delegator, frame, entity);
		if (replace)
			this.delegator.createOrStore(genericValue);
		else
			this.delegator.create(genericValue);
	}

	private void doDelete(Frame<?> frame, EntityIdentifiable entity) throws GenericEntityException {

		GenericValue genericValue = EntityUtils.toBizEntity(this.delegator, frame, entity);
		this.delegator.removeValue(genericValue);

		if (frame.ako() != null)
			doDelete(frame.ako(), entity);
	}

	private void doUpdate(Frame<?> frame, EntityIdentifiable entity) throws GenericEntityException {

		if (this.delegator.getModelReader().getModelEntityNoCheck(frame.getName()) == null)
			return;

		if (frame.ako() != null)
			doUpdate(frame.ako(), entity);

		GenericValue genericValue = EntityUtils.toBizEntity(this.delegator, frame, entity);
		this.delegator.store(genericValue);
	}

	private OFBizFilterAnalyzer analyzeFilter(Delegator delegator, String frame, String filter) {

		ANTLRInputStream input = new ANTLRInputStream(filter);
		SQLiteLexer SQLiteLexer = new SQLiteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(SQLiteLexer);
		SQLiteParser parser = new SQLiteParser(tokens);

		ParseTree tree = parser.expr();
		ParseTreeWalker walker = new ParseTreeWalker();
		OFBizFilterAnalyzer analyzer = new OFBizFilterAnalyzer(delegator, frame);
		walker.walk(analyzer, tree);

		return analyzer;
	}

	private void addSuperEntity(DynamicViewEntity dynamicView, ModelEntity modelEntity) {

		String superEntity = ModelUtils.getSuperEntity(delegator, modelEntity.getEntityName());
		if (superEntity == null)
			return;

		dynamicView.addMemberEntity(superEntity, superEntity);

		ModelEntity modelSuperEntity = delegator.getModelEntity(superEntity);
		Iterator<ModelField> fieldIterator = modelSuperEntity.getFieldsIterator();
		while (fieldIterator.hasNext()) {
			ModelField field = fieldIterator.next();
			dynamicView.addAlias(superEntity, field.getName());
		}
		dynamicView.addViewLink(modelEntity.getEntityName(), superEntity, Boolean.TRUE, ModelKeyMap.makeKeyMapList(modelEntity.getFirstPkFieldName(), modelSuperEntity.getFirstPkFieldName()));

		addSuperEntity(dynamicView, modelSuperEntity);
	}

	private DynamicViewEntity buildDynamicView(ModelEntity modelEntity) {

		DynamicViewEntity dynamicViewEntity = new DynamicViewEntity();
		dynamicViewEntity.addMemberEntity(modelEntity.getEntityName(), modelEntity.getEntityName());
		Iterator<ModelField> fieldIterator = modelEntity.getFieldsIterator();
		while (fieldIterator.hasNext()) {
			ModelField field = fieldIterator.next();
			dynamicViewEntity.addAlias(modelEntity.getEntityName(), field.getName());
		}
		addSuperEntity(dynamicViewEntity, modelEntity);

		return dynamicViewEntity;
	}
}
