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

import org.eclipse.core.runtime.adaptor.EclipseStarter;
import org.osgi.framework.Constants;

@SuppressWarnings("restriction")
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
			Map<String, String> frameworkConfig = new HashMap<String, String>();
			frameworkConfig.put(Constants.FRAMEWORK_STORAGE, workingDir.getAbsolutePath());
			frameworkConfig.put("osgi.install.area", "/home/mattia/Dati/git/abchip/mimo-biz20/org.abchip.mimo.biz.asf.webapp/product/");
			frameworkConfig.put(Constants.FRAMEWORK_STORAGE_CLEAN, "true");
			frameworkConfig.put("osgi.console", "1234");

			List<String> args = new ArrayList<String>();
			addParameter(args, "product", "org.abchip.mimo.biz.asf.mimo-biz");
//			[-data, /home/mattia/Dati/eclipse/abchip/../runtime-abchip-biz-webapp.product, -dev, file:/home/mattia/Dati/eclipse/abchip/.metadata/.plugins/org.eclipse.pde.core/abchip-biz-webapp.product/dev.properties, -os, linux, -ws, gtk, -arch, x86_64, -consoleLog, -console, -clean, -mimo.config, /home/mattia/Dati/git/abchip/mimo-biz20/org.abchip.mimo.biz.asf.webapp/application/abchip-biz-webapp.xmi, -mimo.home, /mimo/abchip-biz-webapp]
			EclipseStarter.startup((String[]) args.toArray(), null);

		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void addParameter(List<String> args, String key, String value) {
		args.add("-" + key);
		if (value != null)
			args.add(value);
	}
}
