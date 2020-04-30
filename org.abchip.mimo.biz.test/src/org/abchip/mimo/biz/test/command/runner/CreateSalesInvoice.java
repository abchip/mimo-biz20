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
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.price.ProductPrice;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceManager;

public class CreateSalesInvoice implements Callable<Long> {

	Context context;
	GetCommonDefaultResponse commonDefault;
	GetPartyDefaultResponse partyDefault;

	Party party;
	List<ProductPrice> productPrices;

	public CreateSalesInvoice(Context context, Party party, List<ProductPrice> productPrices) {
		this.context = context;
		this.party = party;
		this.productPrices = productPrices;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(context, GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(context, GetPartyDefault.class);
		partyDefault = serviceManager.execute(getPartyDefault);

		long time1 = System.currentTimeMillis();
		createInvoice();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createInvoice() throws ResourceException {
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

		invoice.setInvoiceTypeId(context.getFrame(InvoiceType.class).createProxy("SALES_INVOICE", context.getTenant()));
		invoice.setInvoiceDate(new Date());
		invoice.setStatusId(context.getFrame(StatusItem.class).createProxy("INVOICE_IN_PROCESS", context.getTenant()));
		invoice.setCurrencyUomId(commonDefault.getCurrencyUom());
		invoice.setPartyId(party);
		invoice.setPartyIdFrom(company);
		invoice.setDescription("Sales invoice test for party " + party.getID());
		invoiceWriter.create(invoice);

		// InvoiceStatus
		ResourceWriter<InvoiceStatus> invoiceStatusWriter = resourceManager.getResourceWriter(context, InvoiceStatus.class);
		InvoiceStatus invoiceStatus = invoiceStatusWriter.make();
		invoiceStatus.setStatusId(context.getFrame(StatusItem.class).createProxy("INVOICE_IN_PROCESS", context.getTenant()));
		invoiceStatus.setInvoiceId(invoice);
		invoiceStatus.setStatusDate(new Date());
		invoiceStatusWriter.create(invoiceStatus);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = resourceManager.getResourceWriter(context, InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoiceId(invoice);
		invoiceContactMech.setContactMechPurposeTypeId(context.getFrame(ContactMechPurposeType.class).createProxy("PAYMENT_LOCATION", context.getTenant()));
		invoiceContactMech.setContactMechId(party.getPostalAddress());
		invoiceContactMechWriter.create(invoiceContactMech);

		// Roles
		ResourceWriter<InvoiceRole> invoiceRoleWriter = resourceManager.getResourceWriter(context, InvoiceRole.class);
		InvoiceRole invoiceRole = invoiceRoleWriter.make();
		invoiceRole.setInvoiceId(invoice);
		invoiceRole.setPartyId(company);
		invoiceRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("BILL_FROM_VENDOR", context.getTenant()));
		invoiceRoleWriter.create(invoiceRole);

		invoiceRole = invoiceRoleWriter.make();
		invoiceRole.setInvoiceId(invoice);
		invoiceRole.setPartyId(party);
		invoiceRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("BILL_TO_CUSTOMER", context.getTenant()));
		invoiceRoleWriter.create(invoiceRole);

		invoiceRole = invoiceRoleWriter.make();
		invoiceRole.setInvoiceId(invoice);
		invoiceRole.setPartyId(party);
		invoiceRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("SHIP_TO_CUSTOMER", context.getTenant()));
		invoiceRoleWriter.create(invoiceRole);

		invoiceRole = invoiceRoleWriter.make();
		invoiceRole.setInvoiceId(invoice);
		invoiceRole.setPartyId(party);
		invoiceRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("END_USER_CUSTOMER", context.getTenant()));
		invoiceRoleWriter.create(invoiceRole);

		invoiceRole = invoiceRoleWriter.make();
		invoiceRole.setInvoiceId(invoice);
		invoiceRole.setPartyId(party);
		invoiceRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("PLACING_CUSTOMER", context.getTenant()));
		invoiceRoleWriter.create(invoiceRole);

		// Items
		long i = 1;
		for (ProductPrice productPrice : this.productPrices) {
			createInvoiceItem(resourceManager, invoice, StressTestUtils.formatPaddedNumber(i++, 5), 1, productPrice);
		}
	}

	private void createInvoiceItem(ResourceManager resourceManager, Invoice invoice, String itemSeqiD, int quantity, ProductPrice productPrice) throws ResourceException {
		ResourceWriter<InvoiceItem> invoiceItemWriter = resourceManager.getResourceWriter(context, InvoiceItem.class);

		InvoiceItem invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);
		invoiceItem.setInvoiceItemSeqId(itemSeqiD);
		invoiceItem.setInvoiceItemTypeId(context.getFrame(InvoiceItemType.class).createProxy("INV_DPROD_ITEM", context.getTenant()));
		invoiceItem.setProductId(productPrice.getProductId());
		invoiceItem.setDescription(productPrice.getProductId().getProductName());
		invoiceItem.setQuantity(new BigDecimal(quantity));
		invoiceItem.setTaxableFlag(productPrice.getProductId().getTaxable());
		invoiceItem.setAmount(productPrice.getPrice());

		invoiceItemWriter.create(invoiceItem);

		// TODO service calcTaxForDisplay to add new row tax BizTestCommand
	}
}
