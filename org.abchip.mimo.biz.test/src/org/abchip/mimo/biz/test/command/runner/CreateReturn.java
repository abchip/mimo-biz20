/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.util.Date;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.base.service.PartyServices;
import org.abchip.mimo.biz.base.service.UomServices;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.order.return_.ReturnHeader;
import org.abchip.mimo.biz.model.order.return_.ReturnHeaderType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateReturn implements Callable<Long> {

	Context context;
	Party party;

	public CreateReturn(Context context, Party party) {
		this.context = context;
		this.party = party;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createReturn();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	public void createReturn() throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Create ReturnHeader
		ResourceWriter<ReturnHeader> returnHeaderWriter = resourceManager.getResourceWriter(context, ReturnHeader.class);
		ReturnHeader returnHeader = returnHeaderWriter.make(true);
		
		returnHeader.setReturnHeaderTypeId(context.createProxy(ReturnHeaderType.class, "CUSTOMER_RETURN"));
		returnHeader.setStatusId(context.createProxy(StatusItem.class, "RETURN_REQUESTED"));
		returnHeader.setFromPartyId(party);
		returnHeader.setToPartyId(PartyServices.getCompany(context));
		returnHeader.setCurrencyUomId(UomServices.getUom(context));
		returnHeader.setEntryDate(new Date());
		returnHeaderWriter.create(returnHeader);
	}
}
