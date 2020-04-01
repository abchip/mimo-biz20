/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.application;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import org.apache.ofbiz.base.start.Config;
import org.apache.ofbiz.base.start.StartupCommand;
import org.apache.ofbiz.base.start.StartupException;
import org.apache.ofbiz.base.start.StartupLoader;

public class BizClassLoaderImpl extends URLClassLoader {

	public BizClassLoaderImpl(ClassLoader parent) {
		super(new URL[0], parent);
	}

	@Override
	protected void addURL(URL url) {
		super.addURL(url);
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {

		if (name.equals("org.apache.ofbiz.base.container.ContainerLoader")) {
			return BizApplicationLoaderImpl.class;
		} else {
//			System.out.println(name);
			return super.loadClass(name);
		}
	}
	
	public static class BizApplicationLoaderImpl implements StartupLoader {

		@Override
		public synchronized void load(Config config, List<StartupCommand> ofbizCommands) throws StartupException {
		}

		@Override
		public void unload() throws StartupException {
		}
	}
}
