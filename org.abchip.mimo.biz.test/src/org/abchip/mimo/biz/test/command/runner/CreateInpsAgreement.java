/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.party.agreement.Agreement;
import org.abchip.mimo.biz.model.party.agreement.AgreementItem;
import org.abchip.mimo.biz.model.party.agreement.AgreementTerm;
import org.abchip.mimo.biz.model.party.agreement.TermType;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateInpsAgreement implements Callable<Long> {

	Context context;

	public CreateInpsAgreement(Context context) {
		this.context = context;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createAgreement();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createAgreement() throws ResourceException {

		String fiscalCode = StressTestUtils.generateRandomString(16, false);

		// Agreement
		ResourceWriter<Agreement> agreementWriter = context.getResourceManager().getResourceWriter(Agreement.class);

		Agreement agreement = agreementWriter.make();

		agreement.setAgreementDate(new Date());
		agreement.setFromDate(new Date());
		agreement.setDescription("Risarcimento INPS 600€ per soggetto: " + fiscalCode);
		agreementWriter.create(agreement);

		int row = 1;
		createRow(agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Codice fiscale: " + fiscalCode);
		createRow(agreement, StressTestUtils.formatPaddedNumber(row++, 5),
				"Telefono fisso: " + "0" + StressTestUtils.generateRandomString(2, true) + " " + StressTestUtils.generateRandomString(6, true));
		createRow(agreement, StressTestUtils.formatPaddedNumber(row++, 5),
				"Telefono cellulare: " + "3" + StressTestUtils.generateRandomString(2, true) + " " + StressTestUtils.generateRandomString(7, true));
		createRow(agreement, StressTestUtils.formatPaddedNumber(row++, 5), "E-mail: " + fiscalCode + "@gmail.com");
		createRow(agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Iban: " + "IT" + StressTestUtils.generateRandomString(2, true) + StressTestUtils.generateRandomString(1, false)
				+ StressTestUtils.generateRandomString(5, true) + StressTestUtils.generateRandomString(5, true) + StressTestUtils.generateRandomString(12, true));
		createRow(agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Flag gestione separata: SI");
		createRow(agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Flag dichiarazioni non mendaci: SI");

		// AgreementTerm
		TermType termType = context.createProxy(TermType.class, "INDEMNIFICATION");
		ResourceWriter<AgreementTerm> agreementTermWriter = context.getResourceManager().getResourceWriter(AgreementTerm.class);
		AgreementTerm agreementTerm = agreementTermWriter.make(true);
		agreementTerm.setTermType(termType);
		agreementTerm.setAgreement(agreement);
		agreementTerm.setAgreementItemSeqId("00001");
		Date date1 = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		cal.add(Calendar.MONTH, 1);
		Date date2 = cal.getTime();
		agreementTerm.setFromDate(date1);
		agreementTerm.setThruDate(date2);
		// agreementTerm.setDescription();
		agreementTermWriter.create(agreementTerm);
	}

	private void createRow(Agreement agreement, String seqId, String text) throws ResourceException {
		// AgreementItem
		ResourceWriter<AgreementItem> agreementItemWriter = context.getResourceManager().getResourceWriter(AgreementItem.class);
		AgreementItem agreementItem = agreementItemWriter.make();
		agreementItem.setAgreement(agreement);
		agreementItem.setAgreementItemSeqId(seqId);
		agreementItem.setAgreementText(text);
		agreementItemWriter.create(agreementItem);
	}
}
