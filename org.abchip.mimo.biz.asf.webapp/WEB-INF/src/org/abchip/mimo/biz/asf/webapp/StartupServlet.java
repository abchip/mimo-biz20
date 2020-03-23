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

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.eclipse.osgi.launch.Equinox;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;
import org.osgi.framework.launch.Framework;

public class StartupServlet extends HttpServlet {

	public static final String APPLICATION_ACTIVATOR = "org.abchip.mimo.application.activator";
	public static final String APPLICATION_ACTIVATOR_HOME = "org.abchip.mimo.application.home";
	public static final String APPLICATION_ACTIVATOR_CONFIG = "org.abchip.mimo.application.config";
	public static final String APPLICATION_ACTIVATOR_ADMIN_KEY = "org.abchip.mimo.application.admin.key";

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

		installBundles(bundleContext, servletContext);

		startBundles(bundleContext, servletContext);		
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
}
