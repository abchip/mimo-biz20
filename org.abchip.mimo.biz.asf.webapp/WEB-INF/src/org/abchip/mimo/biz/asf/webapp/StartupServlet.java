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
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.eclipse.osgi.launch.Equinox;
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

		try {
			start();
		} catch (BundleException | IOException e) {
			throw new ServletException(e);
		}
	}

	public void start() throws BundleException, IOException {

		Map<String, String> config = new HashMap<String, String>();
//		config.put(Constants.FRAMEWORK_STORAGE, applicationData);
		config.put(Constants.FRAMEWORK_STORAGE_CLEAN, "true");
		config.put("osgi.console", "1234");
		// config.put("org.osgi.framework.bootdelegation", "none");
		// config.put("osgi.parentClassloader", "ext");

		Framework framework = new Equinox(config);
		framework.init();

		framework.start();
	}
}
