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

import org.abchip.mimo.biz.base.service.UomServices;
import org.abchip.mimo.biz.model.product.CalculateProductPrice;
import org.abchip.mimo.biz.model.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.service.Service;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.tester.base.BaseTestCommands;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class ServiceTestCommands extends BaseTestCommands {

	@Inject
	private ServiceManager serviceManager;

	public void _st_product(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		CalculateProductPrice calculateProductPrice = serviceManager.prepare(context, CalculateProductPrice.class);
		calculateProductPrice.setProduct(context.createProxy(Product.class, "Marketing"));
		calculateProductPrice.setCurrencyUomId(UomServices.getUom(context).getID());

		// service
		Service<CalculateProductPrice, CalculateProductPriceResponse> service = serviceManager.getService(context, calculateProductPrice);
		service.getName();

		CalculateProductPriceResponse response = calculateProductPrice.call();
		response.toString();
		// executor.setCurrencyUomId("EUR");
		// executor.setPartyId("Company");
		// executor.setProduct(product);
	}

	@Override
	public String getHelp() {
		return null;
	}
}