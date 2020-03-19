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
import java.util.ArrayList;
import java.util.HashMap;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		ServletContext servletContext = config.getServletContext();

		System.out.println(servletContext.getRealPath("/"));

		File workingDir = (File) servletContext.getAttribute(ServletContext.TEMPDIR);
		System.out.println(workingDir);

		Map<String, String> frameworkConfig = new HashMap<String, String>();
		// config.put(Constants.FRAMEWORK_STORAGE, applicationData);
		frameworkConfig.put(Constants.FRAMEWORK_STORAGE_CLEAN, "true");
		frameworkConfig.put("osgi.console", "1234");
		// config.put("org.osgi.framework.bootdelegation", "none");
		// config.put("osgi.parentClassloader", "ext");

		try {
			Framework framework = new Equinox(frameworkConfig);
			framework.init();

			framework.start();

			BundleContext bundleContext = framework.getBundleContext();
			
			
			
//			bundleContext.registerService(String.class, service, properties)
			ArrayList<Bundle> availableBundles = new ArrayList<Bundle>();
			// get and open available bundles
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
		} catch (BundleException e) {
			throw new ServletException(e);
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
