/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.util.WeakHashMap;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.model.entity.tenant.Tenant;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.e4.E4Activator;
import org.abchip.mimo.resource.ResourceException;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceContainer;

public class ContextUtils {

	private static WeakHashMap<String, Context> contexts = new WeakHashMap<String, Context>();

	@SuppressWarnings("resource")
	public static Context getOrCreateContext(String tenantId) throws ResourceException {

		if (tenantId == null)
			return E4Activator.getApplication().getContext();

		Context context = contexts.get(tenantId);
		if (context != null)
			return context;

		Application application = E4Activator.getApplication();
		synchronized (application) {
			context = contexts.get(tenantId);
			if (context == null) {
				Tenant tenant = application.getContext().getResourceManager().getResourceReader(Tenant.class).lookup(tenantId);
				if (tenant == null)
					return null;

				context = E4Activator.getApplication().getContext().createChildContext(null).get();
				context.getContextDescription().setTenant(tenantId);
				context.getContextDescription().setUser(tenantId);
				contexts.put(tenantId, context);
			}
		}

		return context;
	}

	public static Delegator getDelegator(String tenantId, boolean raw) {

		String delegatorName = "default";
		if (raw)
			delegatorName = delegatorName + "-no-eca";

		Delegator delegator = null;
		if (tenantId != null)
			delegatorName = delegatorName + "#" + tenantId;

		delegator = DelegatorFactory.getDelegator(delegatorName);

		return delegator;
	}

	public static LocalDispatcher getLocalDispatcher(Delegator delegator) {
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(delegator.getDelegatorBaseName(), delegator);
		return dispatcher;
	}
}