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
import org.abchip.mimo.biz.base.service.UomServices;
import org.abchip.mimo.biz.model.product.CalculateProductPrice;
import org.abchip.mimo.biz.model.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.service.Service;
import org.abchip.mimo.service.ServiceManager;
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

			CalculateProductPrice calculateProductPrice = serviceManager.prepare(context.get(), CalculateProductPrice.class);
			Product product = resourceManager.getFrame(context.get(), Product.class).createProxy("Marketing");
			calculateProductPrice.setProduct(product);
			calculateProductPrice.setCurrencyUomId(UomServices.getUom(context.get()).getID());

			// service
			Service<CalculateProductPrice, CalculateProductPriceResponse> service = serviceManager.getService(context.get(), calculateProductPrice);
			service.getName();

			service = serviceManager.getService(context.get(), CalculateProductPrice.class);
			service.getName();

			CalculateProductPriceResponse response = calculateProductPrice.call();
			response.toString();
			// executor.setCurrencyUomId("EUR");
			// executor.setPartyId("Company");
			// executor.setProduct(product);
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