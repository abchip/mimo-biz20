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
import org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.entity.ExportEntities;
import org.abchip.mimo.biz.service.product.CalculateProductPrice;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.tester.base.BaseTestCommands;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class ServiceTestCommands extends BaseTestCommands {

	@Inject
	public ServiceTestCommands(Application application) {
		super(application);
	}

	public void _st_ecore(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		ExportEntities request = serviceManager.prepare(ExportEntities.class);
		request.setPathTo(this.nextArgument(interpreter, "/home/mattia/ofbiz/"));
		serviceManager.submit(request);
	}

	public void _st_product(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext(interpreter);
		ServiceManager serviceManager = context.getServiceManager();

		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		GetCommonDefaultResponse commonDefault = serviceManager.execute(getCommonDefault);

		String product = this.nextArgument(interpreter, "Marketing");

		CalculateProductPrice calculateProductPrice = serviceManager.prepare(CalculateProductPrice.class);
		calculateProductPrice.setProduct(context.createProxy(Product.class, product));
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

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
	}

	@Override
	public String getHelp() {
		return null;
	}
}