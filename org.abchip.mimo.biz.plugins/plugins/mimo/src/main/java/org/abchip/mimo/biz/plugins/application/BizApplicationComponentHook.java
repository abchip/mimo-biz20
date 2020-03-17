/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.application.ComponentStarting;
import org.abchip.mimo.biz.BizComponent;
import org.abchip.mimo.biz.BizModule;
import org.apache.ofbiz.base.component.ComponentConfig;
import org.apache.ofbiz.base.component.ComponentException;
import org.apache.ofbiz.base.start.Classpath;
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.FileUtil;

public class BizApplicationComponentHook {

	@Inject
	private ApplicationComponent component;
	
	@SuppressWarnings("resource")
	@ComponentStarting
	private void starting() {
		if (!(component instanceof BizComponent))
			return;

		BizComponent bizComponent = (BizComponent) component;
		String componentLocation = BizApplicationHook.getApplication().getContext().locateBundle(bizComponent.getPlugin());

		Debug.logInfo("Loading component : " + bizComponent.getName() + " from location: " + componentLocation, BizApplicationHook.MODULE);

		for (BizModule bizModule : bizComponent.getBizModules()) {
			try {
				Path moduleLocation = Paths.get(componentLocation, bizComponent.getModulesDir(), bizModule.getName().toLowerCase());
				Debug.logInfo("Load module : " + bizModule.getName() + " from location: " + moduleLocation, BizApplicationHook.MODULE);

				ComponentConfig componentConfig = ComponentConfig.getComponentConfig(bizModule.getName(), moduleLocation.toString());

				if (!componentConfig.enabled())
					continue;

				Classpath classpath = buildClasspathFromComponentConfig(componentConfig);

				BizClassLoaderImpl bizClassLoader = null;
				ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
				if (classLoader instanceof BizClassLoaderImpl) {
					bizClassLoader = (BizClassLoaderImpl) classLoader;

					for (URL url : classpath.getUrls()) {
						bizClassLoader.addURL(url);
					}
				} 
			} catch (IOException | ComponentException e) {
				throw new RuntimeException(e);
			}
		}

		Debug.logInfo("Loaded component : " + bizComponent.getName(), BizApplicationHook.MODULE);

	}

	private Classpath buildClasspathFromComponentConfig(ComponentConfig config) throws IOException {
		Classpath classPath = new Classpath();
		String configRoot = config.getRootLocation().replace('\\', '/');
		configRoot = configRoot.endsWith("/") ? configRoot : configRoot + "/";
		List<ComponentConfig.ClasspathInfo> classpathInfos = config.getClasspathInfos();

		for (ComponentConfig.ClasspathInfo cp : classpathInfos) {
			String location = cp.location.replace('\\', '/');
			if (!"jar".equals(cp.type) && !"dir".equals(cp.type)) {
				Debug.logError("Classpath type '" + cp.type + "' is not supported; '" + location + "' not loaded", BizApplicationHook.MODULE);
				continue;
			}

			location = location.startsWith("/") ? location.substring(1) : location;
			String dirLoc = location.endsWith("/*") ? location.substring(0, location.length() - 2) : location;
			File path = FileUtil.getFile(configRoot + dirLoc);

			if (path.exists()) {
				classPath.addComponent(configRoot + location);
				if (path.isDirectory() && "dir".equals(cp.type)) {
					classPath.addFilesFromPath(path);
				}
			} else {
				Debug.logWarning("Location '" + configRoot + dirLoc + "' does not exist", BizApplicationHook.MODULE);
			}
		}
		return classPath;
	}

	@ComponentStarted
	private void started() {
		if (!(component instanceof BizComponent))
			return;
		
		
	}
}