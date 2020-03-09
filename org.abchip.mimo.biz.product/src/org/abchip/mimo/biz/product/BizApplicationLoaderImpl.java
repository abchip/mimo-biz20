/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.product;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ComponentStatus;
import org.abchip.mimo.biz.BizComponent;
import org.abchip.mimo.biz.BizModule;
import org.apache.ofbiz.base.component.ComponentConfig;
import org.apache.ofbiz.base.component.ComponentException;
import org.apache.ofbiz.base.container.Container;
import org.apache.ofbiz.base.container.ContainerConfig;
import org.apache.ofbiz.base.container.ContainerException;
import org.apache.ofbiz.base.start.Classpath;
import org.apache.ofbiz.base.start.Config;
import org.apache.ofbiz.base.start.StartupCommand;
import org.apache.ofbiz.base.start.StartupException;
import org.apache.ofbiz.base.start.StartupLoader;
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.FileUtil;
import org.apache.ofbiz.base.util.UtilValidate;

import edu.emory.mathcs.backport.java.util.Collections;

public class BizApplicationLoaderImpl implements StartupLoader {

	public static final String module = "ApplicationLoader";

	private final List<Classpath> componentsClassPath = new ArrayList<>();
	private final List<Container> loadedContainers = new LinkedList<>();

	protected static Application application;

	protected static void setApplication(Application application) {
		BizApplicationLoaderImpl.application = application;
	}

	/**
	 * @see org.apache.ofbiz.base.start.StartupLoader#load(Config, List)
	 */
	@Override
	public synchronized void load(Config config, List<StartupCommand> ofbizCommands) throws StartupException {

		Debug.logInfo("Loading application: " + application.getName(), module);

		for (ApplicationComponent component : BizApplicationLoaderImpl.application.getComponents()) {
			if (component.getStatus() != ComponentStatus.ACTIVE)
				continue;
			if (!(component instanceof BizComponent))
				continue;

			BizComponent bizComponent = (BizComponent) component;
			String componentLocation = BizApplicationLoaderImpl.application.getContext().locateBundle(bizComponent.getPlugin());

			Debug.logInfo("Loading component : " + bizComponent.getName() + " from location: " + componentLocation, module);

			for (BizModule bizModule : bizComponent.getBizModules()) {
				try {
					Path moduleLocation = Paths.get(componentLocation, bizComponent.getModulesDir(), bizModule.getName().toLowerCase());
					Debug.logInfo("Load module : " + bizModule.getName() + " from location: " + moduleLocation, module);

					ComponentConfig componentConfig = ComponentConfig.getComponentConfig(bizModule.getName(), moduleLocation.toString());
					if (componentConfig.enabled())
						componentsClassPath.add(buildClasspathFromComponentConfig(componentConfig));

				} catch (IOException | ComponentException e) {
					throw new StartupException(e);
				}
			}

			Debug.logInfo("Loaded component : " + bizComponent.getName(), module);
		}

		loadClassPathForAllComponents(componentsClassPath);

		List<String> loaders = config.loaders;

		List<ContainerConfig.Configuration> componentContainerConfigs = filterContainersHavingMatchingLoaders(loaders, ComponentConfig.getAllConfigurations());
		loadedContainers.addAll(loadContainersFromConfigurations(componentContainerConfigs, config, ofbizCommands));

		// Start all containers
		startLoadedContainers();

		Debug.logInfo("Loaded application: " + application.getName(), module);
	}

	private Classpath buildClasspathFromComponentConfig(ComponentConfig config) throws IOException {
		Classpath classPath = new Classpath();
		String configRoot = config.getRootLocation().replace('\\', '/');
		configRoot = configRoot.endsWith("/") ? configRoot : configRoot + "/";
		List<ComponentConfig.ClasspathInfo> classpathInfos = config.getClasspathInfos();

		for (ComponentConfig.ClasspathInfo cp : classpathInfos) {
			String location = cp.location.replace('\\', '/');
			if (!"jar".equals(cp.type) && !"dir".equals(cp.type)) {
				Debug.logError("Classpath type '" + cp.type + "' is not supported; '" + location + "' not loaded", module);
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
				Debug.logWarning("Location '" + configRoot + dirLoc + "' does not exist", module);
			}
		}
		return classPath;
	}

	@SuppressWarnings("resource")
	private void loadClassPathForAllComponents(List<Classpath> componentsClassPath) {
		List<URL> allComponentUrls = new ArrayList<>();
		for (Classpath classPath : componentsClassPath) {
			try {
				allComponentUrls.addAll(Arrays.asList(classPath.getUrls()));
			} catch (MalformedURLException e) {
				Debug.logError("Unable to load component classpath" + classPath.toString(), module);
				Debug.logError(e.getMessage(), module);
			}
		}
		URL[] componentURLs = allComponentUrls.toArray(new URL[allComponentUrls.size()]);
		URLClassLoader classLoader = new URLClassLoader(componentURLs, Thread.currentThread().getContextClassLoader());
		Thread.currentThread().setContextClassLoader(classLoader);
	}

	private List<ContainerConfig.Configuration> filterContainersHavingMatchingLoaders(List<String> loaders, Collection<ContainerConfig.Configuration> containerConfigs) {
		return containerConfigs.stream().filter(
				containerCfg -> UtilValidate.isEmpty(containerCfg.loaders) && UtilValidate.isEmpty(loaders) || containerCfg.loaders.stream().anyMatch(loader -> loaders.contains(loader)))
				.collect(Collectors.toList());
	}

	private List<Container> loadContainersFromConfigurations(List<ContainerConfig.Configuration> containerConfigs, Config config, List<StartupCommand> ofbizCommands) throws StartupException {

		List<Container> loadContainers = new ArrayList<>();
		for (ContainerConfig.Configuration containerCfg : containerConfigs) {
			Debug.logInfo("Loading container: " + containerCfg.name, module);
			Container tmpContainer = loadContainer(config.containerConfig, containerCfg, ofbizCommands);
			loadContainers.add(tmpContainer);
			Debug.logInfo("Loaded container: " + containerCfg.name, module);
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

	private void startLoadedContainers() throws StartupException {

		for (Container container : loadedContainers) {
			Debug.logInfo("Starting container " + container.getName(), module);
			try {
				container.start();
			} catch (ContainerException e) {
				throw new StartupException("Cannot start() " + container.getClass().getName(), e);
			}
			Debug.logInfo("Started container " + container.getName(), module);
		}
	}

	/**
	 * @see org.apache.ofbiz.base.start.StartupLoader#unload()
	 */
	@Override
	public synchronized void unload() throws StartupException {

		Debug.logInfo("Unloading application", module);

		List<Container> reversedContainerList = new ArrayList<>(loadedContainers);
		Collections.reverse(reversedContainerList);

		for (Container loadedContainer : reversedContainerList) {
			Debug.logInfo("Stopping container " + loadedContainer.getName(), module);
			try {
				loadedContainer.stop();
			} catch (ContainerException e) {
				Debug.logError(e, module);
			}
			Debug.logInfo("Stopped container " + loadedContainer.getName(), module);
		}

		Debug.logInfo("Unoloaded application", module);
	}
}
