/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ofbiz.base.util.UtilMisc;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceUtil;
import org.apache.ofbiz.webapp.WebAppUtil;

public class ExternalCredentialServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExternalCredentialServlet() {
		super();
	}

	@Override
	public final void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public final void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userId");
//		LocalDispatcher dispatcher = (LocalDispatcher) request.getAttribute("dispatcher");
		// TODO 
		Delegator delegator = DelegatorFactory.getDelegator("default");
        LocalDispatcher dispatcher = WebAppUtil.makeWebappDispatcher(request.getSession().getServletContext(), delegator);


		Map<String, Object> credential;
		try {
			Map<String, Object> userInfo = UtilMisc.toMap("userId", userId);

			credential = dispatcher.runSync("getUserCredentialFromExternalId", userInfo);
			if (ServiceUtil.isError(credential)) {
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				return;
			}
			
			response.setHeader("user", (String) credential.get("user"));
			response.setHeader("password", (String) credential.get("password"));

		} catch (GenericServiceException e) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		}
		response.setStatus(HttpServletResponse.SC_OK);
	}
}
