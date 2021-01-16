/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.util.Date;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.party.agreement.Agreement;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class ExpireAgreement implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(ExpireAgreement.class);
	Context context;

	String agreementId;
	
	public ExpireAgreement(Context context, String agreementId) {
		this.context = context;
		this.agreementId = agreementId;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		expireAgreement();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void expireAgreement() throws ResourceException, ServiceException {
		if (agreementId == null) {
			LOGGER.error("Invalid agreement!!!");
			return;
		}

		// check
		ResourceReader<Agreement> agreementReader = context.getResourceManager().getResourceReader(Agreement.class);
		Agreement agreementEntity = agreementReader.lookup(agreementId);
		if (agreementEntity == null) {
			LOGGER.error("Invalid agreement!!!");
			return;
		}

		if (agreementEntity.getThruDate() != null) {
			LOGGER.error("Expire agreement " + agreementId + " not possible!!!");
			return;
		}

		ResourceWriter<Agreement> agreementWriter = context.getResourceManager().getResourceWriter(Agreement.class);
		agreementEntity.setThruDate(new Date());
		agreementWriter.update(agreementEntity);

		LOGGER.info("Agreement " + agreementId + " expired");
	}
}
