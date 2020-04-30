/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.product.CalculateProductPrice;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class CreatePurchaseInvoice implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(CreatePurchaseInvoice.class);
	Context context;
	GetCommonDefaultResponse commonDefault;
	GetPartyDefaultResponse partyDefault;

	Party party;
	List<Product> products;

	public CreatePurchaseInvoice(Context context, Party party, List<Product> products) {
		this.context = context;
		this.party = party;
		this.products = products;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(context, GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(context, GetPartyDefault.class);
		partyDefault = serviceManager.execute(getPartyDefault);

		long time1 = System.currentTimeMillis();
		createInvoice(serviceManager);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createInvoice(ServiceManager serviceManager) throws ResourceException, ServiceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		Party company = partyDefault.getOrganization();

		// Invoice Header
		ResourceWriter<Invoice> invoiceWriter = resourceManager.getResourceWriter(context, Invoice.class);
		PartyAcctgPreference partyAcctgPreference = partyDefault.getAccountingPreference();
		Invoice invoice = invoiceWriter.make(true);
		String invoiceId = invoice.getInvoiceId();
		if (partyAcctgPreference != null && partyAcctgPreference.getInvoiceIdPrefix() != null) {
			invoice.setInvoiceId(partyAcctgPreference.getInvoiceIdPrefix() + invoiceId);
		}
		invoice.setInvoiceTypeId(context.createProxy(InvoiceType.class, "PURCHASE_INVOICE"));
		invoice.setInvoiceDate(new Date());
		invoice.setStatusId(context.createProxy(StatusItem.class, "INVOICE_IN_PROCESS"));
		invoice.setCurrencyUomId(commonDefault.getCurrencyUom());
		invoice.setPartyId(company);
		invoice.setPartyIdFrom(party);
		invoice.setDescription("Purchase invoice test for party " + party.getID());
		invoiceWriter.create(invoice);

		// InvoiceStatus
		ResourceWriter<InvoiceStatus> invoiceStatusWriter = resourceManager.getResourceWriter(context, InvoiceStatus.class);
		InvoiceStatus invoiceStatus = invoiceStatusWriter.make();
		invoiceStatus.setStatusId(context.createProxy(StatusItem.class, "INVOICE_IN_PROCESS"));
		invoiceStatus.setInvoiceId(invoice);
		invoiceStatus.setStatusDate(new Date());
		invoiceStatusWriter.create(invoiceStatus);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = resourceManager.getResourceWriter(context, InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoiceId(invoice);
		invoiceContactMech.setContactMechPurposeTypeId(context.createProxy(ContactMechPurposeType.class, "PAYMENT_LOCATION"));
		invoiceContactMech.setContactMechId(company.getPostalAddress());
		invoiceContactMechWriter.create(invoiceContactMech);

		// Items
		long i = 1;
		for (Product product : this.products) {
			createInvoiceItem(resourceManager, serviceManager, invoice, StressTestUtils.formatPaddedNumber(i++, 5), 1, product);
		}
	}

	private void createInvoiceItem(ResourceManager resourceManager, ServiceManager serviceManager, Invoice invoice, String itemSeqiD, int quantity, Product product) throws ResourceException, ServiceException {
		ResourceWriter<InvoiceItem> invoiceItemWriter = resourceManager.getResourceWriter(context, InvoiceItem.class);

		InvoiceItem invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);
		invoiceItem.setInvoiceItemSeqId(itemSeqiD);
		invoiceItem.setInvoiceItemTypeId(context.createProxy(InvoiceItemType.class, "INV_DPROD_ITEM"));

		invoiceItem.setProductId(product);
		invoiceItem.setDescription(product.getProductName());
		invoiceItem.setQuantity(new BigDecimal(quantity));
		invoiceItem.setTaxableFlag(product.getTaxable());
		
		// price calculation
		CalculateProductPrice calculateProductPrice = serviceManager.prepare(context, CalculateProductPrice.class);
		calculateProductPrice.setProduct(product);
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

		CalculateProductPriceResponse productPrice = serviceManager.execute(calculateProductPrice);
		if (productPrice.isError())
			LOGGER.error("Errore in recupero prezzo articolo " + product.getID());

		if (productPrice.isValidPriceFound()) {
			invoiceItem.setAmount(productPrice.getBasePrice());
		} else
			LOGGER.error("Prezzo non valido per articolo " + product.getID());

		invoiceItemWriter.create(invoiceItem);

		// TODO service calcTaxForDisplay to add new row tax BizTestCommand
	}
}
