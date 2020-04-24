/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.driver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

import javax.inject.Inject;

import org.abchip.mimo.biz.plugins.entity.EntityUtils;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceProviderImpl;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceContainer;

public class OFBizServiceProviderImpl extends ServiceProviderImpl {

	@Inject
	private ResourceManager resourceManager;

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> V execute(R request) throws ServiceException {

		LocalDispatcher dispatcher = getLocalDispatcher(request);

		try {
			Map<String, Object> context = toBizContext(dispatcher.getDelegator(), request);
			context = dispatcher.runSync(request.getServiceName(), context);

			V response = toResponse(request, context);

			return response;
		} catch (GenericServiceException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(R request) throws ServiceException {

		LocalDispatcher dispatcher = getLocalDispatcher(request);

		try {
			Map<String, Object> context = toBizContext(dispatcher.getDelegator(), request);
			dispatcher.runAsync(request.getServiceName(), context);

			return null;
		} catch (GenericServiceException e) {
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

	private Map<String, Object> toBizContext(Delegator delegator, ServiceRequest<?> request) {

		Map<String, Object> context = new HashMap<String, Object>();

		Frame<ServiceRequest<?>> frame = request.isa();

		for (Slot slot : frame.getSlots()) {
			if (slot.isTransient())
				continue;

			Object value = frame.getValue(request, slot.getName(), false, false);
			value = EntityUtils.toBizValue(delegator, slot, value);
			if (value != null)
				context.put(slot.getName(), value);
		}

		return context;
	}

	private <V extends ServiceResponse, R extends ServiceRequest<V>> V toResponse(R request, Map<String, Object> context) throws ServiceException {

		Frame<V> frame = resourceManager.getFrame(request.getContext(), request.getResponse());

		V response = frame.createEntity();
		for (Slot slot : frame.getSlots()) {
			Object value = context.get(slot.getName());
			if (value == null)
				continue;

			value = EntityUtils.toValue(slot, value);

			try {
				frame.setValue(response, slot.getName(), value);
			} catch (Exception e) {
				throw new ServiceException(e);
			}
		}

		return response;
	}
}