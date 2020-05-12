/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

import org.abchip.mimo.biz.asf.plugins.entity.EntityUtils;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceProviderImpl;
import org.apache.ofbiz.base.util.GeneralException;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ModelParam;
import org.apache.ofbiz.service.ModelService;
import org.apache.ofbiz.service.ServiceContainer;
import org.apache.ofbiz.service.ServiceUtil;

public class OFBizServiceProviderImpl extends ServiceProviderImpl {

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> V execute(R request) throws ServiceException {

		LocalDispatcher dispatcher = getLocalDispatcher(request);

		try {
			ModelService modelService = dispatcher.getDispatchContext().getModelService(request.getServiceName());
			Map<String, Object> context = toBizContext(dispatcher.getDelegator(), modelService, request);
			context = dispatcher.runSync(request.getServiceName(), context);

			V response = toResponse(request, context);
			return response;
		} catch (GeneralException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(R request) throws ServiceException {

		LocalDispatcher dispatcher = getLocalDispatcher(request);

		try {
			ModelService modelService = dispatcher.getDispatchContext().getModelService(request.getServiceName());
			Map<String, Object> context = toBizContext(dispatcher.getDelegator(), modelService, request);
			dispatcher.runAsync(request.getServiceName(), context);

			return null;
		} catch (GeneralException e) {
			throw new ServiceException(e);
		}
	}

	private <V extends ServiceResponse, R extends ServiceRequest<V>> LocalDispatcher getLocalDispatcher(R request) throws ServiceException {

		Delegator delegator = null;
		if (request.getTenant() != null) {
			delegator = DelegatorFactory.getDelegator("default#" + request.getTenant());
		} else if (request.getContext().getContextDescription().isTenant()) {
			delegator = DelegatorFactory.getDelegator("default#" + request.getContext().getContextDescription().getTenant());
		} else
			delegator = DelegatorFactory.getDelegator(null);

		if (delegator == null)
			throw new ServiceException("Delegator not found for request: " + request.getServiceName());

		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorName(), delegator);
		if (dispatcher == null)
			throw new ServiceException("Dispatcher not found for request: " + request.getServiceName());

		return dispatcher;
	}

	private Map<String, Object> toBizContext(Delegator delegator, ModelService modelService, ServiceRequest<?> request) throws GeneralException {

		Map<String, Object> context = new HashMap<String, Object>();
		context.put("userLogin", EntityUtils.toBizEntity(delegator, request.getUserProfile()));
		context.put("locale", request.getLocale());

		Frame<ServiceRequest<?>> frame = request.isa();
		for (Slot slot : frame.getSlots()) {
			if (slot.isTransient())
				continue;

			ModelParam modelParam = modelService.getParam(slot.getName());
			if (modelParam == null)
				continue;

			Object value = frame.getValue(request, slot.getName(), false, false);
			value = EntityUtils.toBizValue(modelParam.getType(), slot, value);
			if (value == null)
				continue;

			context.put(slot.getName(), value);
		}

		return context;
	}

	private <V extends ServiceResponse, R extends ServiceRequest<V>> V toResponse(R request, Map<String, Object> context) throws ServiceException {

		V response = request.buildResponse();
		if (ServiceUtil.isError(context)) {
			response.setErrorMessage(ServiceUtil.getErrorMessage(context));
			return response;
		}

		Frame<V> frame = response.isa();
		for (Slot slot : frame.getSlots()) {
			Object value = context.get(slot.getName());
			if (value == null)
				continue;

			try {
				value = EntityUtils.toValue(slot, value);
				frame.setValue(response, slot.getName(), value);
			} catch (Exception e) {
				throw new ServiceException(e);
			}
		}

		return response;
	}
}