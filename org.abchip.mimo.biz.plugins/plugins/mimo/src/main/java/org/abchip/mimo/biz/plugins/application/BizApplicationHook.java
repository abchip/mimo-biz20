/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.application;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationStarted;
import org.abchip.mimo.application.ApplicationStarting;
import org.abchip.mimo.application.ApplicationStopped;
import org.abchip.mimo.application.ApplicationStopping;
import org.abchip.mimo.application.ComponentStatus;
import org.abchip.mimo.biz.BizComponent;
import org.abchip.mimo.biz.BizModule;
import org.apache.commons.io.FileUtils;
import org.apache.ofbiz.base.start.Start;
import org.apache.ofbiz.base.util.Debug;

public class BizApplicationHook {

	@Inject
	private static Application APPLICATION;

	private static String MODULE = null;

	protected static Application getApplication() {
		return APPLICATION;
	}

	@ApplicationStarting
	private void starting() {

		MODULE = "Application[" + APPLICATION.getName() + "]";

		ClassLoader parentLoader = Thread.currentThread().getContextClassLoader();
		ClassLoader bizLoader = new BizClassLoaderImpl(parentLoader);
		Thread.currentThread().setContextClassLoader(bizLoader);

		Path workPath = Paths.get(APPLICATION.getPaths().getWork(), "ofbiz");
		try {
			this.copyToWork(APPLICATION, workPath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty("ofbiz.home", workPath.toString());
		System.setProperty("ofbiz.log.dir", APPLICATION.getPaths().getLogs());
		System.setProperty("derby.system.home", APPLICATION.getPaths().getData() + "/derby");

		Start.main(new String[0]);
	}

	@ApplicationStarted
	private void started() {
	}

	@ApplicationStopping
	private void stopping() {
	}

	@ApplicationStopped
	private void stopped() {
		ClassLoader bizLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(bizLoader.getParent());
	}

	private void copyToWork(Application application, Path workPath) throws IOException {

		FileUtils.deleteDirectory(workPath.toFile());

		for (ApplicationComponent component : application.getComponents()) {
			if (component.getStatus() != ComponentStatus.ACTIVE)
				continue;
			if (!(component instanceof BizComponent))
				continue;

			BizComponent bizComponent = (BizComponent) component;

			Path componentPath = workPath.resolve(bizComponent.getModulesDir());

			String bundleLocation = application.getContext().locateBundle(bizComponent.getPlugin());

			Debug.logInfo("Copying component " + bizComponent.getName() + " from bundle " + bundleLocation + " to " + componentPath, MODULE);

			for (BizModule bizModule : bizComponent.getBizModules()) {
				Path moduleLocation = Paths.get(bundleLocation, bizComponent.getModulesDir(), bizModule.getName().toLowerCase());
				Debug.logInfo("Copy module " + bizModule.getName() + " from bundle " + moduleLocation, MODULE);

				Path moduleDest = componentPath.resolve(bizModule.getName().toLowerCase());
				FileUtils.copyDirectory(moduleLocation.toFile(), moduleDest.toFile());

				// remove src
				FileUtils.deleteDirectory(moduleDest.resolve("documents").toFile());
				FileUtils.deleteDirectory(moduleDest.resolve("src").toFile());
			}

			Debug.logInfo("Copied component " + bizComponent.getName(), MODULE);
		}
	}

	private class BizClassLoaderImpl extends ClassLoader {

		public BizClassLoaderImpl(ClassLoader originalLoader) {
			super(originalLoader);
		}

		@Override
		public Class<?> loadClass(String name) throws ClassNotFoundException {

			if (name.equals("org.apache.ofbiz.base.container.ContainerLoader")) {
				return BizApplicationLoaderImpl.class;
			} else {
				return super.loadClass(name);
			}
		}
	}
}
