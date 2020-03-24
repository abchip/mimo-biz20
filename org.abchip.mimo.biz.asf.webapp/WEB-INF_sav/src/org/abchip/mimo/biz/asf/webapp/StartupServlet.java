/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.webapp;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;

import org.eclipse.osgi.launch.Equinox;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.launch.Framework;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

public class StartupServlet extends HttpServlet {

	public static final String APPLICATION_ACTIVATOR = "org.abchip.mimo.application.activator";
	public static final String APPLICATION_ACTIVATOR_HOME = "org.abchip.mimo.application.home";
	public static final String APPLICATION_ACTIVATOR_CONFIG = "org.abchip.mimo.application.config";
	public static final String APPLICATION_ACTIVATOR_ADMIN_KEY = "org.abchip.mimo.application.admin.key";

	public static final String SERVLET_ALIAS = "org.abchip.mimo.servlet.alias";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		ServletContext servletContext = config.getServletContext();

		File workingDir = (File) servletContext.getAttribute(ServletContext.TEMPDIR);

		Map<String, String> frameworkConfig = new HashMap<String, String>();
		// config.put(Constants.FRAMEWORK_STORAGE, applicationData);
		frameworkConfig.put(Constants.FRAMEWORK_STORAGE_CLEAN, "true");
		frameworkConfig.put("osgi.console", "1234");
		frameworkConfig.put("osgi.configuration.area", Paths.get(workingDir.getAbsolutePath(), "osgi").toString());

		Framework framework = new Equinox(frameworkConfig);
		try {
			framework.init();
			framework.start();
		} catch (BundleException e) {
			e.printStackTrace();
		}

		BundleContext bundleContext = framework.getBundleContext();

		String mimoConfig = config.getInitParameter("mimo.config");
		String mimoHome = config.getInitParameter("mimo.home");
		String mimoAdminKey = config.getInitParameter("mimo.admin.key");

		Dictionary<String, Object> dictionary = new Hashtable<String, Object>();
		dictionary.put(APPLICATION_ACTIVATOR_CONFIG, servletContext.getRealPath("/") + mimoConfig);
		dictionary.put(APPLICATION_ACTIVATOR_HOME, mimoHome);
		if (mimoAdminKey != null)
			dictionary.put(APPLICATION_ACTIVATOR_ADMIN_KEY, mimoAdminKey);

		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(APPLICATION_ACTIVATOR, true);
		bundleContext.registerService(Dictionary.class, dictionary, properties);

		registerHttpService(bundleContext, servletContext);

		installBundles(bundleContext, servletContext);

		startBundles(bundleContext, servletContext);
	}

	private void registerHttpService(BundleContext bundleContext, ServletContext servletContext) {

		// register org.osgi.service.httpHttpService
		if (bundleContext.getServiceReference(HttpService.class) == null) {
			HttpService httpService = new HttpServiceImpl(servletContext);
			bundleContext.registerService(HttpService.class, httpService, null);

			try {
				for (ServiceReference<Servlet> serviceReference : bundleContext.getServiceReferences(Servlet.class, null)) {
					Object servletAlias = serviceReference.getProperty(SERVLET_ALIAS);
					if (servletAlias == null)
						continue;

					try {
						Servlet servlet = bundleContext.getService(serviceReference);
						httpService.registerServlet(servletAlias.toString(), servlet, serviceReference.getProperties(), null);
					} catch (ServletException | NamespaceException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (InvalidSyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void installBundles(BundleContext bundleContext, ServletContext servletContext) {

		ArrayList<Bundle> availableBundles = new ArrayList<Bundle>();
		for (File file : getBundles(servletContext)) {
			Bundle bundle;
			try {
				bundle = bundleContext.installBundle("reference:file:" + file.getAbsolutePath(), null);
				availableBundles.add(bundle);
			} catch (BundleException e) {

				switch (e.getType()) {
				case BundleException.DUPLICATE_BUNDLE_ERROR:
					break;
				default:
					e.printStackTrace();
				}
			}
		}

	}

	private void startBundles(BundleContext bundleContext, ServletContext servletContext) {
		for (Bundle bundle : bundleContext.getBundles()) {
			if (bundle.getSymbolicName().equals("org.eclipse.equinox.console") || bundle.getSymbolicName().equals("org.abchip.mimo.core.e4")) {
				try {
					bundle.start();
				} catch (BundleException e) {
					switch (e.getType()) {
					case BundleException.DUPLICATE_BUNDLE_ERROR:
						break;
					default:
						e.printStackTrace();
					}

				}
			}
		}
	}

	private List<File> getBundles(ServletContext servletContext) {

		List<File> bundles = new ArrayList<File>();

		String pluginsPath = servletContext.getRealPath("/application/product/plugins");
		for (File file : new File(pluginsPath).listFiles()) {

			if (file.isHidden())
				continue;

			bundles.add(file);
		}

		return bundles;
	}

	public class HttpServiceImpl implements HttpService {

		protected ServletContext servletContext;

		public HttpServiceImpl(ServletContext servletContext) {
			this.servletContext = servletContext;
		}

		@Override
		public HttpContext createDefaultHttpContext() {
			return null;
		}

		@Override
		public void registerResources(String arg0, String arg1, HttpContext arg2) throws NamespaceException {
		}

		@SuppressWarnings("rawtypes")
		@Override
		public void registerServlet(String alias, Servlet servlet, Dictionary dictionary, HttpContext context) throws ServletException, NamespaceException {

			ServletRegistration servletRegistration = servletContext.addServlet(servlet.getClass().getSimpleName(), servlet);
			servletRegistration.addMapping(alias);
		}

		@Override
		public void unregister(String servletName) {
		}
	}
}
