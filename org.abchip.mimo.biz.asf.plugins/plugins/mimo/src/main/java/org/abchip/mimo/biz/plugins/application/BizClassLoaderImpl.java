/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.application;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.util.Logs;
import org.apache.ofbiz.base.start.Config;
import org.apache.ofbiz.base.start.StartupCommand;
import org.apache.ofbiz.base.start.StartupException;
import org.apache.ofbiz.base.start.StartupLoader;
import org.osgi.service.log.Logger;

public class BizClassLoaderImpl extends ClassLoader {

	private static final Logger LOGGER = Logs.getLogger(BizClassLoaderImpl.class);

	private List<URL> urls = null;

	public BizClassLoaderImpl(ClassLoader parent) {
		super(parent);
		this.urls = new ArrayList<URL>();
	}

	protected void addURL(URL url) {
		this.urls.add(url);
	}

	@Override
	public URL findResource(String name) {

		if (name.contains("/"))
			return null;

		for (URL url : urls) {
			try {
				Path path = Paths.get(url.toURI()).resolve(name);

				if (Files.exists(path))
					return path.toUri().toURL();

			} catch (URISyntaxException | MalformedURLException e) {
				LOGGER.warn(e.getMessage());
				continue;
			}
		}

		return null;
	}

	@Override
	public Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {

		if (name.equals("org.apache.ofbiz.base.container.ContainerLoader"))
			return BizApplicationLoaderImpl.class;

		return super.loadClass(name, resolve);
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