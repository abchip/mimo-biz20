/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 */
package org.abchip.mimo.biz.asf.plugins.edi;

import java.util.HashMap;
import java.util.Map;

import org.abchip.mimo.biz.asf.plugins.ContextUtils;
import org.abchip.mimo.biz.asf.plugins.entity.EntityUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.edi.DataInterchangeException;
import org.abchip.mimo.edi.EdiManager;
import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.message.MessageType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.util.Logs;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.model.ModelReader;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.ServiceUtil;
import org.apache.ofbiz.service.calendar.RecurrenceRule;
import org.osgi.service.log.Logger;

public class EdiServices {

	private static final Logger LOGGER = Logs.getLogger(EdiServices.class);

	public enum Services {
		startEdiEngine, stopEdiEngine, createEdiEntity, updateEdiEntity, deleteEdiEntity, transmitMessages
	}

	public enum Operations {
		CRT, UPD, DLT
	}

	private static final String VALUEATTR = "entityInstance";

	public static Map<String, Object> startEdiEngine(DispatchContext ctx, Map<String, Object> params) throws ResourceException {

		Delegator delegator = ctx.getDelegator();
		Context context = ContextUtils.getOrCreateContext(delegator.getDelegatorTenantId());

		ModelReader modelReader = delegator.getModelReader();
		ResourceReader<EdiFrameSetup> setupReader = context.getResourceManager().getResourceReader(EdiFrameSetup.class);
		try (EntityIterator<EdiFrameSetup> setups = setupReader.find()) {
			for (EdiFrameSetup setup : setups) {
				if (modelReader.getModelEntityNoCheck(setup.getFrame()) == null)
					continue;

				EdiUtils.addEdiEca(delegator, setup);
			}
		}

		return ServiceUtil.returnSuccess();
	}

	// stop engine
	public static Map<String, Object> stopEdiEngine(DispatchContext ctx, Map<String, Object> params) {

		Delegator delegator = ctx.getDelegator();
		ModelReader modelReader = delegator.getModelReader();

		try {
			for (String frame : modelReader.getEntityNames())
				EdiUtils.removeEdiEca(delegator, frame);
		} catch (GenericEntityException e) {
			e.printStackTrace();
		}

		return ServiceUtil.returnSuccess();
	}

	public static Map<String, Object> transmitMessages(DispatchContext ctx, Map<String, Object> params) {

		LOGGER.trace("TODO transimit message {}", params.get("messageType"));

		return ServiceUtil.returnSuccess();
	}

	public static Map<String, Object> createEdiFrameSetup(DispatchContext ctx, Map<String, Object> params) throws ResourceException {
		return manageEdiFrameSetup(Operations.CRT, ctx, params);
	}

	public static Map<String, Object> updateEdiFrameSetup(DispatchContext ctx, Map<String, Object> params) throws ResourceException {
		return manageEdiFrameSetup(Operations.UPD, ctx, params);
	}

	public static Map<String, Object> deleteEdiFrameSetup(DispatchContext ctx, Map<String, Object> params) throws ResourceException {
		return manageEdiFrameSetup(Operations.DLT, ctx, params);
	}

	public static Map<String, Object> createMessageType(DispatchContext ctx, Map<String, Object> params) throws ResourceException {
		return manageMessageType(Operations.CRT, ctx, params);
	}

	public static Map<String, Object> updateMessageType(DispatchContext ctx, Map<String, Object> params) throws ResourceException {
		return manageMessageType(Operations.UPD, ctx, params);
	}

	public static Map<String, Object> deleteMessageType(DispatchContext ctx, Map<String, Object> params) throws ResourceException {
		return manageMessageType(Operations.DLT, ctx, params);
	}

	public static Map<String, Object> createEdiEntity(DispatchContext ctx, Map<String, Object> params) throws DataInterchangeException, ResourceException {
		return manageEdiEntity(Operations.CRT, ctx, params);
	}

	public static Map<String, Object> updateEdiEntity(DispatchContext ctx, Map<String, Object> params) throws DataInterchangeException, ResourceException {
		return manageEdiEntity(Operations.UPD, ctx, params);
	}

	public static Map<String, Object> deleteEntity(DispatchContext ctx, Map<String, Object> params) throws DataInterchangeException, ResourceException {
		return manageEdiEntity(Operations.DLT, ctx, params);
	}

	private static Map<String, Object> manageEdiFrameSetup(Operations operation, DispatchContext ctx, Map<String, Object> params) throws ResourceException {

		GenericValue ofbizEntity = (GenericValue) params.get(VALUEATTR);
		if (ofbizEntity == null) {
			return ServiceUtil.returnError("FrameSetup is null");
		}

		Delegator delegator = ctx.getDelegator();
		ModelReader modelReader = delegator.getModelReader();
		String resource = delegator.getDelegatorTenantId();

		Context context = ContextUtils.getOrCreateContext(delegator.getDelegatorTenantId());
		Resource<EdiFrameSetup> ediFrameSetupResource = context.getResourceSet().getResource(EdiFrameSetup.class);
		EdiFrameSetup ediFrameSetup = ediFrameSetupResource.make();
		EntityUtils.completeEntity(ediFrameSetup, ofbizEntity);
		EdiUtils.removeEdiEca(delegator, ediFrameSetup.getFrame());

		ResourceReader<EdiFrameSetup> setupReader = context.getResourceManager().getResourceReader(EdiFrameSetup.class, resource);
		try (EntityIterator<EdiFrameSetup> setups = setupReader.find()) {
			for (EdiFrameSetup setup : setups) {
				if (modelReader.getModelEntityNoCheck(setup.getFrame()) == null)
					continue;

				EdiUtils.addEdiEca(delegator, setup);
			}
		}

		return ServiceUtil.returnSuccess();
	}

	private static Map<String, Object> manageMessageType(Operations operation, DispatchContext ctx, Map<String, Object> params) throws ResourceException {

		GenericValue entityInstance = (GenericValue) params.get(VALUEATTR);
		if (entityInstance == null) {
			return ServiceUtil.returnError("MessageType is null");
		}

		Delegator delegator = ctx.getDelegator();
		Context context = ContextUtils.getOrCreateContext(delegator.getDelegatorTenantId());

		@SuppressWarnings("rawtypes")
		Resource<MessageType> resource = context.getResourceSet().getResource(MessageType.class);
		MessageType<?> messageType = resource.make();
		EntityUtils.completeEntity(messageType, entityInstance);

		try {
			long startTime = new java.util.Date().getTime();
			int frequency = RecurrenceRule.MINUTELY;
			int interval = 1;
			int count = -1;

			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("messageType", messageType.getName());

			ctx.getDispatcher().schedule(Services.transmitMessages.name(), parameters, startTime, frequency, interval, count);
			return ServiceUtil.returnSuccess();
		} catch (GenericServiceException e) {
			return ServiceUtil.returnError(e.getMessage());
		}
	}

	private static Map<String, Object> manageEdiEntity(Operations operation, DispatchContext ctx, Map<String, Object> params) throws DataInterchangeException, ResourceException {

		GenericValue ofbizEntity = (GenericValue) params.get(VALUEATTR);
		if (ofbizEntity == null)
			return ServiceUtil.returnError("Entity instance is null");

		Delegator delegator = ctx.getDelegator();
		Context context = ContextUtils.getOrCreateContext(delegator.getDelegatorTenantId());

		Resource<?> resource = context.getResourceSet().getResource(ofbizEntity.getEntityName());
		EntityIdentifiable entity = resource.make();
		EntityUtils.completeEntity(entity, ofbizEntity);

		EdiManager ediManager = context.get(EdiManager.class);
		ediManager.writeMessage(context, entity, EntityEvent.get(operation.name()));

		return ServiceUtil.returnSuccess();
	}
}