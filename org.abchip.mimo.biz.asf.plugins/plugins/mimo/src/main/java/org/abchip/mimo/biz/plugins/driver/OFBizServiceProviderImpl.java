/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.driver;

import java.util.concurrent.Future;

import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceProviderImpl;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceContainer;

public class OFBizServiceProviderImpl extends ServiceProviderImpl {

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> V execute(R request) throws ServiceException {

		LocalDispatcher dispatcher = getLocalDispatcher(request);
		return null;
	}

	@Override
	public <V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(R request) throws ServiceException {

		LocalDispatcher dispatcher = getLocalDispatcher(request);
		return null;
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
}
