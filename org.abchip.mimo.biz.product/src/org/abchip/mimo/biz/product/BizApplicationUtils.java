/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.product;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ComponentStatus;
import org.abchip.mimo.biz.BizComponent;
import org.abchip.mimo.biz.BizModule;
import org.abchip.mimo.biz.plugins.entity.EntityConverter;
import org.apache.catalina.webresources.TomcatURLStreamHandlerFactory;
import org.apache.commons.io.FileUtils;
import org.apache.ofbiz.base.conversion.Converters;
import org.apache.ofbiz.base.util.Debug;
import org.eclipse.osgi.internal.url.EquinoxFactoryManager;
import org.eclipse.osgi.internal.url.URLStreamHandlerFactoryImpl;

@SuppressWarnings("restriction")
public class BizApplicationUtils {

	private static final String module = "BizApplication";

	public static void loadConverters() {
		/*
		 * Converters.loadContainedConverters(Converters.class);
		 * Converters.loadContainedConverters(BooleanConverters.class);
		 * Converters.loadContainedConverters(CollectionConverters.class);
		 * Converters.loadContainedConverters(DateTimeConverters.class);
		 * Converters.loadContainedConverters(JSONConverters.class);
		 * Converters.loadContainedConverters(MiscConverters.class);
		 * Converters.loadContainedConverters(NetConverters.class);
		 * Converters.loadContainedConverters(NumberConverters.class);
		 */

		Converters.registerConverter(new EntityConverter<>());
	}

	public static void setURLStreamHandlerFactory() {
		try {
			Field field = EquinoxFactoryManager.getField(URL.class, URLStreamHandlerFactory.class, false);
			Object value = field.get(null);

			if (!(value instanceof URLStreamHandlerFactoryImpl))
				return;

			URLStreamHandlerFactoryImpl currentFactory = (URLStreamHandlerFactoryImpl) value;
			currentFactory.setParentFactory(TomcatURLStreamHandlerFactory.getInstance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void setClassLoader(Application application) {
		BizApplicationLoaderImpl.setApplication(application);

		ClassLoader bizLoader = new BizClassLoaderImpl(Thread.currentThread().getContextClassLoader(), application);

		Thread.currentThread().setContextClassLoader(bizLoader);

/*		try {
			EquinoxBundle bizBundle = (EquinoxBundle) FrameworkUtil.getBundle(DispatchContext.class);

			ModuleWiring wiring = bizBundle.getModule().getCurrentRevision().getWiring();
			if (wiring != null) {
				BundleLoader bundleLoader = (BundleLoader) wiring.getModuleLoader();
				Field field = bundleLoader.getClass().getDeclaredField("parent");
				field.setAccessible(true);
				field.set(bundleLoader, bizLoader);
			}

			bizBundle.toString();
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}*/ 
	}

	public static void copyToWork(Application application, Path workPath) throws IOException {

		FileUtils.deleteDirectory(workPath.toFile());

		for (ApplicationComponent component : application.getComponents()) {
			if (component.getStatus() != ComponentStatus.ACTIVE)
				continue;
			if (!(component instanceof BizComponent))
				continue;

			BizComponent bizComponent = (BizComponent) component;

			Path componentPath = workPath.resolve(bizComponent.getModulesDir());

			String bundleLocation = application.getContext().locateBundle(bizComponent.getPlugin());

			Debug.logInfo("Copying component " + bizComponent.getName() + " from bundle " + bundleLocation + " to " + componentPath, module);

			for (BizModule bizModule : bizComponent.getBizModules()) {
				Path moduleLocation = Paths.get(bundleLocation, bizComponent.getModulesDir(), bizModule.getName().toLowerCase());
				Debug.logInfo("Copy module " + bizModule.getName() + " from bundle " + moduleLocation, module);

				Path moduleDest = componentPath.resolve(bizModule.getName().toLowerCase());
				FileUtils.copyDirectory(moduleLocation.toFile(), moduleDest.toFile());

				// remove src
				FileUtils.deleteDirectory(moduleDest.resolve("documents").toFile());
				FileUtils.deleteDirectory(moduleDest.resolve("src").toFile());
			}

			Debug.logInfo("Copied component " + bizComponent.getName(), module);
		}
	}
}
