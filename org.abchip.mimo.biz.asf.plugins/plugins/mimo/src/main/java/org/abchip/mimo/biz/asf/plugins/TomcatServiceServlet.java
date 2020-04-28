/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.util.Dictionary;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServlet;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.core.e4.E4Activator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;

public class TomcatServiceServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public TomcatServiceServlet() {
		super();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		ServletContext servletContext = config.getServletContext();

		try {
			// start framework
			Application application = E4Activator.getApplication();

			// register org.osgi.service.httpHttpService
			if (application.getContext().get(HttpService.class) == null) {
				HttpService httpService = new HttpServiceImpl(servletContext);
				application.getContext().set(HttpService.class, httpService);

				BundleContext bundleContext = application.getBundle().getBundleContext();
				for (ServiceReference<Servlet> serviceReference : bundleContext.getServiceReferences(Servlet.class, null)) {
					Object servletAlias = serviceReference.getProperty(MimoConstants.SERVLET_ALIAS);
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
			}

		} catch (InvalidSyntaxException e) {
			throw new ServletException(e);
		}
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
