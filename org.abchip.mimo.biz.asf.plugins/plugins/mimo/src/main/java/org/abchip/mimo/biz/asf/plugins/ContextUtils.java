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

import org.abchip.mimo.biz.model.entity.tenant.Tenant;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.e4.E4Activator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;

public class ContextUtils {

	private static WeakHashMap<String, Context> contexts = new WeakHashMap<String, Context>();

	@SuppressWarnings("resource")
	public static Context getOrCreateContext(String tenantId) throws ResourceException {

		if (tenantId == null)
			return E4Activator.getApplication().getContext();

		Context context = contexts.get(tenantId);
		if (context != null)
			return context;

		synchronized (E4Activator.getApplication()) {
			context = contexts.get(tenantId);
			if (context == null) {

				ResourceManager resourceManager = E4Activator.getApplication().getContext().get(ResourceManager.class);

				Tenant tenant = resourceManager.getResourceReader(E4Activator.getApplication().getContext(), Tenant.class).lookup(tenantId);
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
}