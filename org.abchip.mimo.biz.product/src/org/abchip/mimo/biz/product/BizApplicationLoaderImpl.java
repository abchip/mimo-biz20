/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.abchip.mimo.application.Application;
import org.apache.ofbiz.base.component.ComponentConfig;
import org.apache.ofbiz.base.container.ComponentContainer;
import org.apache.ofbiz.base.container.Container;
import org.apache.ofbiz.base.container.ContainerConfig;
import org.apache.ofbiz.base.container.ContainerException;
import org.apache.ofbiz.base.container.ContainerLoader;
import org.apache.ofbiz.base.start.Config;
import org.apache.ofbiz.base.start.StartupCommand;
import org.apache.ofbiz.base.start.StartupException;
import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.base.util.UtilValidate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import edu.emory.mathcs.backport.java.util.Collections;

public class BizApplicationLoaderImpl extends ContainerLoader {

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

		Debug.logInfo("[Startup] Loading application: " + application.getName(), module);

		Document document = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		factory.setValidating(true);
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			document = builder.newDocument();
		} catch (Exception e) {
			Debug.logError(e, module);
		}

		// initialize the container object
		try {
			ComponentContainer componentContainer = new ComponentContainer();

//			Element configElement = document.createElement("container");
//			ContainerConfig.Configuration containerConfig = new ContainerConfig.Configuration(configElement);
			componentContainer.init(ofbizCommands, "component-container", null);
		} catch (ContainerException e) {
			throw new StartupException("Cannot init() " + "component-container", e);
		}

		// loaders defined in startup (e.g. main, test, load-data, etc ...)
		List<String> loaders = config.loaders;

		// load containers defined in ofbiz-containers.xml
//		Debug.logInfo("[Startup] Loading containers...", module);
//		List<ContainerConfig.Configuration> ofbizContainerConfigs = filterContainersHavingMatchingLoaders(loaders, retrieveOfbizContainers(config.containerConfig));
//		loadedContainers.addAll(loadContainersFromConfigurations(ofbizContainerConfigs, config, ofbizCommands));

		// load containers defined in components
		Debug.logInfo("[Startup] Loading component containers...", module);
		List<ContainerConfig.Configuration> componentContainerConfigs = filterContainersHavingMatchingLoaders(loaders, ComponentConfig.getAllConfigurations());
		loadedContainers.addAll(loadContainersFromConfigurations(componentContainerConfigs, config, ofbizCommands));

		// Start all containers loaded from above steps
		startLoadedContainers();
	}

	private Collection<ContainerConfig.Configuration> retrieveOfbizContainers(String configFile) throws StartupException {
		try {
			return ContainerConfig.getConfigurations(configFile);
		} catch (ContainerException e) {
			throw new StartupException(e);
		}
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
		Debug.logInfo("[Startup] Starting containers...", module);
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
		Debug.logInfo("Shutting down containers", module);

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
	}
}
