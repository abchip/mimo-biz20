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

import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.accounting.payment.PaymentType;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.service.accounting.Addtax;
import org.abchip.mimo.biz.service.accounting.AddtaxResponse;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDefResponse;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class CreateCustomerReturnInvoice implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(CreatePurchaseInvoice.class);
	Context context;
	GetCommonDefaultResponse commonDefault;
	GetPartyDefaultResponse partyDefault;

	Party party;

	public CreateCustomerReturnInvoice(Context context, Party party) {
		this.context = context;
		this.party = party;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(GetPartyDefault.class);
		partyDefault = serviceManager.execute(getPartyDefault);

		long time1 = System.currentTimeMillis();
		createInvoice(serviceManager);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createInvoice(ServiceManager serviceManager) throws ResourceException, ServiceException {
		
		ResourceWriter<Invoice> invoiceWriter = context.getResourceManager().getResourceWriter(Invoice.class);
		
		// Search Sales invoice from customer 
		String filter = "partyId = '" + party.getID() + "' and invoiceTypeId = 'SALES_INVOICE'" ;
		String order = "-invoiceDate";
		Invoice invoiceReference = null;
				
		try (EntityIterator<Invoice> invoices = invoiceWriter.find(filter, null, order, 1)) {
			for (Invoice invoice : invoices) {
				invoiceReference = invoice;
			}
		}
		if(invoiceReference == null) {
			LOGGER.info("No invoices found for party " + party.getID());
			return;
		}
			
		Party company = partyDefault.getOrganization();
		// Invoice Header
		Invoice invoice = invoiceWriter.make();
		invoice.setInvoiceType(context.createProxy(InvoiceType.class, "CUST_RTN_INVOICE"));
		invoice.setInvoiceDate(new Date());
		invoice.setStatus(context.createProxy(StatusItem.class, "INVOICE_IN_PROCESS"));
		invoice.setCurrencyUom(commonDefault.getCurrencyUom());
		invoice.setParty(company);
		invoice.setPartyIdFrom(party);
		invoice.setDescription("Customer return invoice test for party " + party.getID());
		invoice.setReferenceNumber(invoiceReference.getID());
		invoiceWriter.create(invoice);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = context.getResourceManager().getResourceWriter(InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoice(invoice);
		invoiceContactMech.setContactMechPurposeType(context.createProxy(ContactMechPurposeType.class, "PAYMENT_LOCATION"));
		invoiceContactMech.setContactMech(company.getPostalAddress());
		invoiceContactMechWriter.create(invoiceContactMech);

		// Items
		createInvoiceItem(invoice, invoiceReference);
		
		// Add tax
		Addtax addtax = serviceManager.prepare(Addtax.class);
		addtax.setInvoiceId(invoice.getID());
		AddtaxResponse addTaxresponse = serviceManager.execute(addtax);
		if (addTaxresponse.onError()) {
			LOGGER.error(addTaxresponse.getErrorMessage());
		}
		
		// Payment
		createPaymentFromInvoice(serviceManager, invoice);
	}

	private void createInvoiceItem(Invoice invoice, Invoice invoiceRef) throws ResourceException, ServiceException {
		
		ResourceWriter<InvoiceItem> invoiceItemWriter = context.getResourceManager().getResourceWriter(InvoiceItem.class);
		
		String filter = "invoiceId = '" + invoiceRef.getID() + "' and invoiceItemTypeId = 'INV_DPROD_ITEM'" ;
		try (EntityIterator<InvoiceItem> invoiceItems = invoiceItemWriter.find(filter)) {
			for (InvoiceItem invoiceItemRef : invoiceItems) {

				InvoiceItem invoiceItem = invoiceItemWriter.make();
				invoiceItem.setInvoice(invoice);
				invoiceItem.setInvoiceItemType(context.createProxy(InvoiceItemType.class, "CRT_FPROD_ITEM"));
				invoiceItem.setProduct(invoiceItemRef.getProduct());
				invoiceItem.setDescription(invoiceItemRef.getDescription());
				invoiceItem.setQuantity(invoiceItemRef.getQuantity());
				invoiceItem.setTaxableFlag(invoiceItemRef.isTaxableFlag());
				invoiceItem.setAmount(invoiceItemRef.getAmount());
				invoiceItemWriter.create(invoiceItem);
			}
		}
	}
	
	private String createPaymentFromInvoice(ServiceManager serviceManager, Invoice invoice) throws ResourceException, ServiceException {

		PaymentMethod paymentMethod = invoice.getParty().getPaymentMethod("CREDIT_CARD");
		if (paymentMethod == null) {
			LOGGER.error("Payment method not found for party " + invoice.getParty().getID());
		}

		ResourceWriter<Payment> paymentWriter = context.getResourceManager().getResourceWriter(Payment.class);
		Payment payment = paymentWriter.make();
		payment.setAmount(invoice.getTotal());
		payment.setPartyIdTo(invoice.getPartyIdFrom());
		payment.setPartyIdFrom(invoice.getParty());
		payment.setPaymentType(context.createProxy(PaymentType.class, "VENDOR_PAYMENT"));
		payment.setPaymentMethodType(context.createProxy(PaymentMethodType.class, "CREDIT_CARD"));
		if(paymentMethod != null)
			payment.setPaymentMethod(paymentMethod);
		payment.setCurrencyUom(commonDefault.getCurrencyUom());
		payment.setPaymentRefNum("Invoice number " + invoice.getID());

		paymentWriter.create(payment);

		// applicazione pagamento
		UpdatePaymentApplicationDef updatePaymentApplicationDef = serviceManager.prepare(UpdatePaymentApplicationDef.class);
		updatePaymentApplicationDef.setInvoiceId(invoice.getID());
		updatePaymentApplicationDef.setPaymentId(payment.getID());
		UpdatePaymentApplicationDefResponse response = serviceManager.execute(updatePaymentApplicationDef);
		if (response.onError()) {
			LOGGER.error(response.getErrorMessage());
			return payment.getID();
		}
		return payment.getID();
	}
}
