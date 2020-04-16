/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.authentication.AuthenticationException;
import org.abchip.mimo.authentication.AuthenticationFactory;
import org.abchip.mimo.authentication.AuthenticationManager;
import org.abchip.mimo.authentication.AuthenticationUserPassword;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.service.ServiceExecutor;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.service.ServiceResponse;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class ServiceTestCommands extends BaseCommands {

	@Inject
	private Application application;
	@Inject
	private ServiceManager serviceManager;
	@Inject
	private ResourceManager resourceManager;

	public void _st_product(CommandInterpreter interpreter) throws Exception {
		try (ContextProvider context = login()) {

//			CalculateProductPrice executor = serviceManager.getServiceExecutor(context.get(), CalculateProductPrice.class);

			ServiceExecutor executor = null;
//			executor.setCurrencyUomId("EUR");
//			executor.setPartyId("Company");
//			Product product = resourceManager.getFrame(context.get(), Product.class).createProxy("Marketing");
//			executor.setProduct(product);

			ServiceResponse response = executor.execute();
			response.toString();
		}
	}

	private ContextProvider login() throws AuthenticationException {

		AuthenticationUserPassword authentication = AuthenticationFactory.eINSTANCE.createAuthenticationUserPassword();
		authentication.setUser("abchip-test");
		authentication.setPassword("ofbiz");
		authentication.setTenant("test");
		AuthenticationManager authenticationManager = application.getContext().get(AuthenticationManager.class);

		ContextProvider contextProvider = authenticationManager.login(null, authentication);

		return contextProvider;
	}

	@Override
	public String getHelp() {
		return null;
	}
}