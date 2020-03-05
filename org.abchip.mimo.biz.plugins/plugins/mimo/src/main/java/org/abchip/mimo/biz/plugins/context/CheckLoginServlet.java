/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.context;

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

public class CheckLoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CheckLoginServlet() {
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

		String provider = request.getParameter("provider");

//		LocalDispatcher dispatcher = (LocalDispatcher) request.getAttribute("dispatcher");
		// TODO 
		Delegator delegator = DelegatorFactory.getDelegator("default");
        LocalDispatcher dispatcher = WebAppUtil.makeWebappDispatcher(request.getSession().getServletContext(), delegator);
		
		Map<String, Object> createPersonResult;

		switch (provider) {
		case "GitHub":
			try {
				Map<String, Object> userInfo = UtilMisc.toMap("firstName", request.getParameter("firstName"));
				userInfo.put("lastName", request.getParameter("lastName"));
				userInfo.put("userId", request.getParameter("userId"));
				userInfo.put("email", request.getParameter("email"));
				userInfo.put("accessToken", request.getParameter("accessToken"));

				createPersonResult = dispatcher.runSync("checkLoginGitHubUser", userInfo);
				if (ServiceUtil.isError(createPersonResult)) {
					response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					return;
				}
			} catch (GenericServiceException e) {
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				return;
			}
			break;

		case "Google":
			try {
				Map<String, Object> userInfo = UtilMisc.toMap("firstName", request.getParameter("firstName"));
				userInfo.put("lastName", request.getParameter("lastName"));
				userInfo.put("userId", request.getParameter("userId"));
				userInfo.put("email", request.getParameter("email"));
				userInfo.put("accessToken", request.getParameter("accessToken"));

				createPersonResult = dispatcher.runSync("checkLoginGoogleUser", userInfo);
				if (ServiceUtil.isError(createPersonResult)) {
					response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					return;
				}
			} catch (GenericServiceException e) {
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				return;
			}
			break;

		case "LinkedIn":
			try {
				Map<String, Object> userInfo = UtilMisc.toMap("firstName", request.getParameter("firstName"));
				userInfo.put("lastName", request.getParameter("lastName"));
				userInfo.put("userId", request.getParameter("userId"));
				userInfo.put("email", request.getParameter("email"));
				userInfo.put("accessToken", request.getParameter("accessToken"));

				createPersonResult = dispatcher.runSync("checkLoginLinkedInUser", userInfo);
				if (ServiceUtil.isError(createPersonResult)) {
					response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
					return;
				}
			} catch (GenericServiceException e) {
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				return;
			}
			break;

		default:
			break;
		}
		response.setStatus(HttpServletResponse.SC_OK);
	}
}
