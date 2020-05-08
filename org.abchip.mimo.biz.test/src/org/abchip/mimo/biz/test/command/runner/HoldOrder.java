/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.service.order.ChangeOrderStatus;
import org.abchip.mimo.biz.service.order.ChangeOrderStatusResponse;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class HoldOrder implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(HoldOrder.class);
	Context context;
	String orderId;

	public HoldOrder(Context context, String orderId) {
		this.context = context;
		this.orderId = orderId;
	}

	@Override
	public Long call() throws Exception {
		ServiceManager serviceManager = context.getServiceManager();
		long time1 = System.currentTimeMillis();
		holdOrder(serviceManager);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void holdOrder(ServiceManager serviceManager) throws ResourceException, ServiceException {
		if (orderId == null) {
			LOGGER.error("Invalid order!!!");
			return;
		}

		// check Order
		ResourceReader<OrderHeader> orderHeaderReader = context.getResourceManager().getResourceReader(OrderHeader.class);
		OrderHeader orderHeaderEntity = orderHeaderReader.lookup(orderId);
		if (orderHeaderEntity == null) {
			LOGGER.error("Invalid order!!!");
			return;
		}

		if (!orderHeaderEntity.isHoldable()) {
			LOGGER.error("Hold order " + orderId + " not possible!!!");
			return;
		}

		ChangeOrderStatus changeOrderStatus = serviceManager.prepare(ChangeOrderStatus.class);
		changeOrderStatus.setOrderId(orderId);
		changeOrderStatus.setStatusId("ORDER_HOLD");
		changeOrderStatus.setSetItemStatus(true);
		ChangeOrderStatusResponse response = serviceManager.execute(changeOrderStatus);

		if (response.isError()) {
			LOGGER.error("Error in set status");
			return;
		}

		LOGGER.info("Order " + orderId + " holded");
	}
}
