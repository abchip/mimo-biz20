/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import javax.annotation.PostConstruct;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceFactory;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.resource.impl.ResourceProviderImpl;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;

public class OFBizResourceProviderImpl extends ResourceProviderImpl {

	private ResourceConfig resourceConfig;

	@PostConstruct
	protected void init() {

		this.resourceConfig = ResourceFactory.eINSTANCE.createResourceConfig();
		this.resourceConfig.setLockSupport(false);
		this.resourceConfig.setOrderSupport(false);
	}

	@Override
	public <E extends EntityIdentifiable> Resource<E> doGetResource(ResourceSet resourceSet, Context context, Frame<E> frame, String tenant) {

		Delegator delegator = null;
		if (tenant != null) {
			delegator = DelegatorFactory.getDelegator("default#" + tenant);
		} else
			delegator = DelegatorFactory.getDelegator(null);

		if (delegator == null)
			return null;

		Resource<E> resource = new OFBizResourceImpl<E>(resourceSet, context, frame, delegator);
		resource.setResourceConfig(this.resourceConfig);

		return resource;
	}
}