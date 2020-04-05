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
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ApplicationStarted;
import org.abchip.mimo.application.ApplicationStarting;
import org.abchip.mimo.application.ApplicationStopped;
import org.abchip.mimo.application.ApplicationStopping;
import org.abchip.mimo.application.ComponentStatus;
import org.abchip.mimo.application.ModuleStatus;
import org.abchip.mimo.biz.BizComponent;
import org.abchip.mimo.biz.BizModule;
import org.apache.commons.io.FileUtils;
import org.apache.ofbiz.base.component.ComponentConfig;
import org.apache.ofbiz.base.container.Container;
import org.apache.ofbiz.base.container.ContainerConfig;
import org.apache.ofbiz.base.container.ContainerException;
import org.apache.ofbiz.base.start.Config;
import org.apache.ofbiz.base.start.Start;
import org.apache.ofbiz.base.start.StartupCommand;
import org.apache.ofbiz.base.start.StartupException;
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilValidate;

import edu.emory.mathcs.backport.java.util.Collections;

public class BizApplicationHook {

	@Inject
	private static Application APPLICATION;

	protected static String MODULE = null;

	protected static List<Container> CONTAINERS = new LinkedList<>();

	protected static Application getApplication() {
		return APPLICATION;
	}

	@ApplicationStarting
	private void starting() {

		MODULE = "Application[" + APPLICATION.getName() + "]";

		Path workPath = Paths.get(APPLICATION.getPaths().getWork(), "ofbiz");

		System.setProperty("ofbiz.home", workPath.toString());
		System.setProperty("ofbiz.log.dir", APPLICATION.getPaths().getLogs());
		System.setProperty("derby.system.home", APPLICATION.getPaths().getData() + "/derby");

		try {
			Debug.logInfo("Starting application: " + APPLICATION.getName(), MODULE);
			this.copyToWork(APPLICATION, workPath);
		} catch (Exception e) {
			e.printStackTrace();
		}

		ClassLoader parentLoader = Thread.currentThread().getContextClassLoader();
		ClassLoader bizLoader = new BizClassLoaderImpl(parentLoader);
		Thread.currentThread().setContextClassLoader(bizLoader);

		Start.main(new String[0]);
	}

	@ApplicationStarted
	private void started() throws StartupException {

		Config config = Start.getInstance().getConfig();
		List<ContainerConfig.Configuration> componentContainerConfigs = filterContainersHavingMatchingLoaders(config.loaders, ComponentConfig.getAllConfigurations());
		BizApplicationHook.CONTAINERS.addAll(loadContainersFromConfigurations(componentContainerConfigs, config, new ArrayList<StartupCommand>()));

		for (Container container : CONTAINERS) {
			Debug.logInfo("Starting container " + container.getName(), MODULE);
			try {
				container.start();
			} catch (ContainerException e) {
				throw new StartupException("Cannot start() " + container.getClass().getName(), e);
			}
			Debug.logInfo("Started container " + container.getName(), MODULE);
		}

		Debug.logInfo("Started application: " + APPLICATION.getName(), MODULE);
	}

	private List<ContainerConfig.Configuration> filterContainersHavingMatchingLoaders(List<String> loaders, Collection<ContainerConfig.Configuration> containerConfigs) {
		return containerConfigs.stream().filter(
				containerCfg -> UtilValidate.isEmpty(containerCfg.loaders) && UtilValidate.isEmpty(loaders) || containerCfg.loaders.stream().anyMatch(loader -> loaders.contains(loader)))
				.collect(Collectors.toList());
	}

	private List<Container> loadContainersFromConfigurations(List<ContainerConfig.Configuration> containerConfigs, Config config, List<StartupCommand> ofbizCommands) throws StartupException {

		List<Container> loadContainers = new ArrayList<>();
		for (ContainerConfig.Configuration containerCfg : containerConfigs) {
			Debug.logInfo("Loading container: " + containerCfg.name, MODULE);
			Container tmpContainer = loadContainer(config.containerConfig, containerCfg, ofbizCommands);
			loadContainers.add(tmpContainer);
			Debug.logInfo("Loaded container: " + containerCfg.name, MODULE);
		}
		return loadContainers;
	}

	private Container loadContainer(String configFile, ContainerConfig.Configuration containerCfg, List<StartupCommand> ofbizCommands) throws StartupException {
		// load the container class
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class<?> containerClass;
		try {
			containerClass = loader.loadClass(containerCfg.className);
		} catch (ClassNotFoundException e) {
			throw new StartupException("Cannot locate container class", e);
		}
		if (containerClass == null) {
			throw new StartupException("Component container class not loaded");
		}

		// create a new instance of the container object
		Container containerObj;
		try {
			containerObj = (Container) containerClass.getDeclaredConstructor().newInstance();
		} catch (ReflectiveOperationException e) {
			throw new StartupException("Cannot create " + containerCfg.name, e);
		}
		if (containerObj == null) {
			throw new StartupException("Unable to create instance of component container");
		}

		// initialize the container object
		try {
			containerObj.init(ofbizCommands, containerCfg.name, configFile);
		} catch (ContainerException e) {
			throw new StartupException("Cannot init() " + containerCfg.name, e);
		}

		return containerObj;
	}

	@ApplicationStopping
	private void stopping() {

		Debug.logInfo("Stopping application", MODULE);

		List<Container> reversedContainerList = new ArrayList<>(CONTAINERS);
		Collections.reverse(reversedContainerList);

		for (Container loadedContainer : reversedContainerList) {
			Debug.logInfo("Stopping container " + loadedContainer.getName(), MODULE);
			try {
				loadedContainer.stop();
			} catch (ContainerException e) {
				Debug.logError(e, MODULE);
			}
			Debug.logInfo("Stopped container " + loadedContainer.getName(), MODULE);
		}

		Debug.logInfo("Stopped application", MODULE);

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

			String bundleLocation = application.locateBundle(bizComponent.getPlugin());

			Debug.logInfo("Copying component " + bizComponent.getName() + " from bundle " + bundleLocation + " to " + componentPath, MODULE);

			for (BizModule bizModule : bizComponent.getBizModules()) {
				if (bizModule.getStatus() != ModuleStatus.ACTIVE)
					continue;

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
}