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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.core.e4.E4Activator;
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
		
		File workingDir = (File)servletContext.getAttribute(ServletContext.TEMPDIR);
		System.out.println(workingDir);
		
		try {
			start();
		} catch (BundleException | IOException e) {
			throw new ServletException(e);
		}
	}
	

	public void start() throws BundleException, IOException {

		Map<String, String> config = new HashMap<String, String>();
		config.put(Constants.FRAMEWORK_STORAGE, applicationData);
		config.put(Constants.FRAMEWORK_STORAGE_CLEAN, "true");
		config.put("osgi.console", "1234");
		// config.put("org.osgi.framework.bootdelegation", "none");
		// config.put("osgi.parentClassloader", "ext");

		Framework framework = new Equinox(config);
		framework.init();

		framework.start();

		BundleContext bundleContext = framework.getBundleContext();
		load(bundleContext);

		Application application = E4Activator.loadApplication(applicationConfig);

		E4Activator.startApplication(application);

		return application;
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
}
