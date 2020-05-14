/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.model.party.agreement.Agreement;
import org.abchip.mimo.biz.model.party.agreement.AgreementItem;
import org.abchip.mimo.biz.model.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl;
import org.abchip.mimo.biz.model.party.agreement.AgreementTerm;
import org.abchip.mimo.biz.model.party.agreement.AgreementType;
import org.abchip.mimo.biz.model.party.agreement.TermType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.product.CalculateProductPrice;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class CreateAgreement implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(CreateAgreement.class);
	Context context;
	GetCommonDefaultResponse commonDefault;
	GetPartyDefaultResponse partyDefault;

	Party party;
	List<Product> products;

	public CreateAgreement(Context context, Party party, List<Product> products) {
		this.context = context;
		this.party = party;
		this.products = products;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(GetPartyDefault.class);
		partyDefault = serviceManager.execute(getPartyDefault);

		long time1 = System.currentTimeMillis();
		createAgreement(serviceManager);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createAgreement(ServiceManager serviceManager) throws ResourceException, ServiceException {

		RoleType roleTypeFrom = context.createProxy(RoleType.class, "INTERNAL_ORGANIZATIO");
		RoleType roleTypeTo = context.createProxy(RoleType.class, "CUSTOMER");
		AgreementType agreementType = context.createProxy(AgreementType.class, "SALES_AGREEMENT");

		// Agreement
		ResourceWriter<Agreement> agreementWriter = context.getResourceManager().getResourceWriter(Agreement.class);

		Agreement agreement = agreementWriter.make();
		agreement.setPartyIdFrom(partyDefault.getOrganization());
		agreement.setPartyIdTo(party);

		agreement.setRoleTypeIdFrom(roleTypeFrom);
		agreement.setRoleTypeIdTo(roleTypeTo);
		agreement.setAgreementTypeId(agreementType);
		agreement.setAgreementDate(new Date());
		agreement.setFromDate(new Date());
		agreement.setDescription("Open new agreement for customer " + party.getID());
		agreementWriter.create(agreement);

		String agreementItemSeqId = createRow(agreement);

		// row product
		for (Product product : this.products)
			createRowProduct(serviceManager, agreement, product, agreementItemSeqId);
	}

	private void createRowProduct(ServiceManager serviceManager, Agreement agreement, Product product, String itemSeqId) throws ResourceException, ServiceException {
		// AgreementProductAppl
		ResourceWriter<AgreementProductAppl> agreementProductApplWriter = context.getResourceManager().getResourceWriter(AgreementProductAppl.class);
		AgreementProductAppl agreementProductAppl = agreementProductApplWriter.make();
		agreementProductAppl.setAgreementId(agreement);
		agreementProductAppl.setAgreementItemSeqId(itemSeqId);
		agreementProductAppl.setProductId(product);

		// price calculation
		CalculateProductPrice calculateProductPrice = serviceManager.prepare(CalculateProductPrice.class);
		calculateProductPrice.setProduct(product);
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

		CalculateProductPriceResponse response = serviceManager.execute(calculateProductPrice);
		if (response.onError())
			LOGGER.info(response.getErrorMessage());

		if (response.isValidPriceFound()) {
			agreementProductAppl.setPrice(response.getBasePrice());
		} else
			LOGGER.info("Prezzo non valido per articolo " + product.getID());

		agreementProductApplWriter.create(agreementProductAppl);
	}

	private String createRow(Agreement agreement) throws ResourceException {

		AgreementItemType agreementType = context.createProxy(AgreementItemType.class, "AGREEMENT_PRICING_PR");
		TermType termType = context.createProxy(TermType.class, "FIN_PAYMENT_FIXDAY");
		InvoiceItemType invoiceItemType = context.createProxy(InvoiceItemType.class, "INV_DPROD_ITEM");

		// AgreementItem
		ResourceWriter<AgreementItem> agreementItemWriter = context.getResourceManager().getResourceWriter(AgreementItem.class);

		AgreementItem agreementItem = agreementItemWriter.make();
		agreementItem.setAgreementId(agreement);
		agreementItem.setAgreementItemTypeId(agreementType);
		agreementItem.setCurrencyUomId(commonDefault.getCurrencyUom().getID());
		agreementItem.setAgreementText("Agrement test opened in trial mode");
		agreementItemWriter.create(agreementItem);

		// get seq id
		String filter = "agreementId = \"" + agreement.getAgreementId() + "\"";
		String order = "-agreementItemSeqId";
		String agreementItemSeqId = "";
				
		try (EntityIterator<AgreementItem> agreementItems = agreementItemWriter.find(filter, null, order, 1)) {
			for (AgreementItem agreementItemRecord : agreementItems) {
				agreementItemSeqId = agreementItemRecord.getAgreementItemSeqId();
			}
		}
		
		// AgreementTerm
		ResourceWriter<AgreementTerm> agreementTermWriter = context.getResourceManager().getResourceWriter(AgreementTerm.class);
		AgreementTerm agreementTerm = agreementTermWriter.make();

		agreementTerm.setTermTypeId(termType);
		agreementTerm.setAgreementId(agreement);
		agreementTerm.setAgreementItemSeqId(agreementItemSeqId);
		agreementTerm.setInvoiceItemTypeId(invoiceItemType);
		Date date1 = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		cal.add(Calendar.MONTH, 1);
		Date date2 = cal.getTime();
		agreementTerm.setFromDate(date1);
		agreementTerm.setThruDate(date2);
		// agreementTerm.setDescription();
		agreementTermWriter.create(agreementTerm);

		return agreementItemSeqId;
	}
}
