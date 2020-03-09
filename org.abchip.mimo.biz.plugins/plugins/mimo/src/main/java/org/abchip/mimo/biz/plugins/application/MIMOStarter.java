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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationManager;
import org.abchip.mimo.application.ApplicationPaths;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.base.app.BaseApplicationManagerImpl;
import org.abchip.mimo.core.e4.E4ContextRootImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.osgi.launch.Equinox;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;
import org.osgi.framework.launch.Framework;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

public final class MIMOStarter {

	private static MIMOStarter instance = null;
	private Application application = null;

	private MIMOStarter() {
	}

	protected static MIMOStarter getInstance() {
		if (instance == null) {
			synchronized (MIMOStarter.class) {
				if (instance == null)
					instance = new MIMOStarter();
			}
		}
		return instance;
	}

	protected synchronized void start(String applicationData, String applicationConfig, String applicationName, String applicationPort, ServletContext servletContext) {

		// FrameworkFactory frameworkFactory =
		// ServiceLoader.load(FrameworkFactory.class).iterator().next();

		Map<String, String> config = new HashMap<String, String>();
		config.put(Constants.FRAMEWORK_STORAGE, applicationData);
		config.put(Constants.FRAMEWORK_STORAGE_CLEAN, "true");
		config.put("osgi.console", "1234");
		// config.put("org.osgi.framework.bootdelegation", "none");
		// config.put("osgi.parentClassloader", "ext");

		Framework framework = new Equinox(config);
		try {
			framework.init();

			framework.start();

			BundleContext bundleContext = framework.getBundleContext();
			load(bundleContext);

			// application manager
			ApplicationManager applicationManager = new BaseApplicationManagerImpl();
			bundleContext.registerService(ApplicationManager.class, applicationManager, null);

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());

			ResourceSet resourceSet = new ResourceSetImpl();
			URI uri = null;
			if (applicationConfig.startsWith("http"))
				uri = URI.createURI(applicationConfig);
			else
				uri = URI.createFileURI(new File(applicationConfig).getAbsolutePath());

			Resource resource = resourceSet.getResource(uri, true);
			resource.load(Collections.EMPTY_MAP);
			application = (Application) resource.getContents().get(0);

			if (applicationName != null)
				application.setName(applicationName);

			if (applicationPort != null)
				application.setPort(Integer.parseInt(applicationPort));

			// context
			@SuppressWarnings("resource")
			ContextRoot contextApplication = new E4ContextRootImpl(bundleContext, application.getContextDescription());
			contextApplication.set(Application.class, application);
			contextApplication.set(ApplicationPaths.class, application.getPaths());
			contextApplication.set(ContextRoot.class, contextApplication);
			contextApplication.set(HttpService.class, new TomcatHttpService(servletContext));

			application.setContext(contextApplication);

			System.out.println("Starting " + application);
			try {
				applicationManager.start(this.getClass(), application, System.out);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected ContextRoot getContext() {
		if (this.application != null)
			return application.getContext();
		else
			return null;
	}

	private void load(BundleContext bundleContext) throws IOException, BundleException {

		ArrayList<Bundle> availableBundles = new ArrayList<Bundle>();
		// get and open available bundles
		for (java.net.URI uri : getBundles()) {
			java.net.URL url = uri.toURL();
			Bundle bundle;
			try {
				System.out.println(url);
				bundle = bundleContext.installBundle(url.getFile(), url.openStream());
				availableBundles.add(bundle);
			} catch (BundleException e) {

				switch (e.getType()) {
				case BundleException.DUPLICATE_BUNDLE_ERROR:
					break;
				default:
					e.printStackTrace();
					throw e;
				}
			}
		}

		// start the bundles
		for (Bundle bundle : availableBundles) {
			try {
				bundle.start();
			} catch (BundleException ex) {
				System.out.println("Failed to start bundle " + bundle.getSymbolicName());
			}
		}
	}

	private List<java.net.URI> getBundles() {

		List<java.net.URI> bundles = new ArrayList<java.net.URI>();
		for (File file : new File("plugins/mimo/product/plugins").listFiles()) {
			if (file.getName().contains("source"))
				continue;
			if (!file.getName().endsWith(".jar"))
				continue;

			bundles.add(file.toURI());
		}

		return bundles;
	}

	private class TomcatHttpService implements HttpService {

		private ServletContext servletContext;

		public TomcatHttpService(ServletContext servletContext) {
			this.servletContext = servletContext;
		}

		@Override
		public HttpContext createDefaultHttpContext() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void registerResources(String arg0, String arg1, HttpContext arg2) throws NamespaceException {
			// TODO Auto-generated method stub

		}

		@SuppressWarnings("rawtypes")
		@Override
		public void registerServlet(String alias, Servlet servlet, Dictionary dictionary, HttpContext context) throws ServletException, NamespaceException {

			ServletRegistration servletRegistration = servletContext.addServlet(servlet.getClass().getSimpleName(), servlet);
			servletRegistration.addMapping(alias);
		}

		@Override
		public void unregister(String arg0) {
			// TODO Auto-generated method stub

		}

	}
}