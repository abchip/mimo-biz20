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
import org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.service.product.CalculateProductPrice;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.tester.base.BaseTestCommands;
import org.abchip.mimo.util.Logs;
import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.osgi.service.log.Logger;

public class ServiceTestCommands extends BaseTestCommands {

	private static final Logger LOGGER = Logs.getLogger(ServiceTestCommands.class);

	@Inject
	private ServiceManager serviceManager;

	public void _st_product(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String product = this.nextArgument(interpreter, "Marketing");

		CalculateProductPrice calculateProductPrice = serviceManager.prepare(context, CalculateProductPrice.class);
		calculateProductPrice.setProduct(context.createProxy(Product.class, product));
		calculateProductPrice.setCurrencyUomId(UomServices.getUom(context).getID());

		try {
			CalculateProductPriceResponse response = serviceManager.execute(calculateProductPrice);

			if (response.isError()) {
				interpreter.println(response.getErrorMessage());
				return;
			}

			if (!response.isValidPriceFound()) {
				interpreter.println(response.getResponseMessage());
				return;
			}

			interpreter.println(response.getSuccessMessage());

			interpreter.println(response.getBasePrice());
			interpreter.println(response.getListPrice());

			for (OrderItemPriceInfo orderItemPriceInfo : response.getOrderItemPriceInfos())
				interpreter.println(orderItemPriceInfo);

		} catch (ServiceException e) {
			LOGGER.error(e.getMessage());
		}
	}

	@Override
	public String getHelp() {
		return null;
	}
}