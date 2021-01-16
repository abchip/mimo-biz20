/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ComponentStarting;
import org.abchip.mimo.application.ModuleStatus;
import org.abchip.mimo.biz.BizComponent;
import org.abchip.mimo.biz.BizModule;
import org.abchip.mimo.util.Logs;
import org.apache.ofbiz.base.component.ComponentConfig;
import org.apache.ofbiz.base.component.ComponentException;
import org.apache.ofbiz.base.start.Classpath;
import org.apache.ofbiz.base.util.FileUtil;
import org.osgi.service.log.Logger;

public class BizApplicationComponentHook {

	@Inject
	private ApplicationComponent component;

	private final Logger LOGGER = Logs.getLogger(BizApplicationComponentHook.class);

	private ComponentConfig componentConfig;

	@ComponentStarting
	private void starting() {
		if (!(component instanceof BizComponent))
			return;

		BizComponent bizComponent = (BizComponent) component;
		String componentLocation = BizApplicationHook.getApplication().locateBundle(bizComponent.getPlugin());

		LOGGER.info("Loading biz-component {}  from location {}", bizComponent.getName(), componentLocation);

		for (BizModule bizModule : bizComponent.getBizModules()) {
			if (bizModule.getStatus() != ModuleStatus.ACTIVE)
				continue;

			try {
				Path moduleLocation = Paths.get(componentLocation, bizComponent.getModulesDir(), bizModule.getName().toLowerCase());
				LOGGER.info("Load module {} from location {}", bizModule.getName(), moduleLocation);

				componentConfig = ComponentConfig.getComponentConfig(bizModule.getName(), moduleLocation.toString());

				if (componentConfig == null || !componentConfig.enabled())
					continue;

				Classpath classpath = buildClasspathFromComponentConfig(componentConfig);

				ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
				if (!(classLoader instanceof BizClassLoaderImpl)) {
					LOGGER.error("Unexpected condition {}", "9xm8ty98rtn743ytb7q94bv");
					return;
				}

				BizClassLoaderImpl bizClassLoader = (BizClassLoaderImpl) classLoader;

				for (URL url : classpath.getUrls()) {
					LOGGER.info("Append to classpath {}", url);
					bizClassLoader.addURL(url);
				}

			} catch (ComponentException | IOException e) {
				throw new RuntimeException(e);
			}
		}

		LOGGER.info("Loaded biz-component {}", bizComponent.getName());

	}

	private Classpath buildClasspathFromComponentConfig(ComponentConfig config) throws IOException {
		Classpath classPath = new Classpath();
		String configRoot = config.getRootLocation().replace('\\', '/');
		configRoot = configRoot.endsWith("/") ? configRoot : configRoot + "/";
		List<ComponentConfig.ClasspathInfo> classpathInfos = config.getClasspathInfos();

		for (ComponentConfig.ClasspathInfo cp : classpathInfos) {
			String location = cp.location.replace('\\', '/');
			if (!"jar".equals(cp.type) && !"dir".equals(cp.type)) {
				LOGGER.error("Classpath type '" + cp.type + "' is not supported; '" + location + "' not loaded");
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
				LOGGER.warn("Location '" + configRoot + dirLoc + "' does not exist");
			}
		}
		return classPath;
	}
}