/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.application;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.edi.EDIPackage;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.language.LanguagePackage;
import org.abchip.mimo.ui.UIPackage;

public class MIMOStartupServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mimoOsgiData;
	private String mimoApplicationConfig;
	private String mimoApplicationName;
	private String mimoApplicationPort;
	
	public MIMOStartupServlet() {
		super();
	}
	

    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	
    	ServletContext servletContext = config.getServletContext();
    	
    	UIPackage.eINSTANCE.eClass();
		EntityPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		EDIPackage.eINSTANCE.eClass();
		BizPackage.eINSTANCE.eClass();

		mimoOsgiData = config.getInitParameter("mimo.osgi.data");
		mimoApplicationConfig = config.getInitParameter("mimo.application.config");
		mimoApplicationName = config.getInitParameter("mimo.application.name");
		mimoApplicationPort = config.getInitParameter("mimo.application.port");
		
		MIMOStarter.getInstance().start(mimoOsgiData, mimoApplicationConfig, mimoApplicationName, mimoApplicationPort, servletContext);

    }
}
