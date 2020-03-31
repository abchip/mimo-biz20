/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.application;

import java.util.List;
import java.util.WeakHashMap;

import org.abchip.mimo.biz.entity.tenant.Tenant;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.e4.E4Activator;
import org.abchip.mimo.resource.ResourceManager;
import org.apache.ofbiz.base.container.Container;
import org.apache.ofbiz.base.container.ContainerException;
import org.apache.ofbiz.base.start.StartupCommand;

public class BizContainerImpl implements Container {

	private String name;

	private static WeakHashMap<String, Context> contexts = new WeakHashMap<String, Context>();

	@Override
	public void init(List<StartupCommand> ofbizCommands, String name, String configFile) throws ContainerException {
		this.name = name;
	}

	@Override
	public boolean start() throws ContainerException {
		return true;
	}

	@Override
	public void stop() throws ContainerException {
	}

	@Override
	public String getName() {
		return name;
	}

	@SuppressWarnings("resource")
	public static Context getOrCreateContext(String tenantId) {

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