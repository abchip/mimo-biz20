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
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.accounting.payment.PaymentType;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.service.accounting.Addtax;
import org.abchip.mimo.biz.service.accounting.AddtaxResponse;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDefResponse;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.product.CalculateProductPrice;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
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

		Party company = partyDefault.getOrganization();

		// Invoice Header
		ResourceWriter<Invoice> invoiceWriter = context.getResourceManager().getResourceWriter(Invoice.class);
		Invoice invoice = invoiceWriter.make();
		invoice.setInvoiceTypeId(context.createProxy(InvoiceType.class, "PURCHASE_INVOICE"));
		invoice.setInvoiceDate(new Date());
		invoice.setStatusId(context.createProxy(StatusItem.class, "INVOICE_IN_PROCESS"));
		invoice.setCurrencyUomId(commonDefault.getCurrencyUom());
		invoice.setPartyId(company);
		invoice.setPartyIdFrom(party);
		invoice.setDescription("Purchase invoice test for party " + party.getID());
		invoiceWriter.create(invoice);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = context.getResourceManager().getResourceWriter(InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoiceId(invoice);
		invoiceContactMech.setContactMechPurposeTypeId(context.createProxy(ContactMechPurposeType.class, "PAYMENT_LOCATION"));
		invoiceContactMech.setContactMechId(company.getPostalAddress());
		invoiceContactMechWriter.create(invoiceContactMech);

		// Items
		for (Product product : this.products) {
			createInvoiceItem(serviceManager, invoice, 1, product);
		}
		
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

	private void createInvoiceItem(ServiceManager serviceManager, Invoice invoice, int quantity, Product product) throws ResourceException, ServiceException {
		ResourceWriter<InvoiceItem> invoiceItemWriter = context.getResourceManager().getResourceWriter(InvoiceItem.class);

		InvoiceItem invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);
		invoiceItem.setInvoiceItemTypeId(context.createProxy(InvoiceItemType.class, "INV_DPROD_ITEM"));
		invoiceItem.setProductId(product);
		invoiceItem.setDescription(product.getProductName());
		invoiceItem.setQuantity(new BigDecimal(quantity));
		invoiceItem.setTaxableFlag(product.getTaxable());

		// price calculation
		CalculateProductPrice calculateProductPrice = serviceManager.prepare(CalculateProductPrice.class);
		calculateProductPrice.setProduct(product);
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

		CalculateProductPriceResponse productPrice = serviceManager.execute(calculateProductPrice);
		if (productPrice.onError())
			LOGGER.error(productPrice.getErrorMessage());

		if (productPrice.isValidPriceFound()) {
			invoiceItem.setAmount(productPrice.getBasePrice());
		} else
			LOGGER.error("Prezzo non valido per articolo " + product.getID());

		invoiceItemWriter.create(invoiceItem);
	}
	
	private String createPaymentFromInvoice(ServiceManager serviceManager, Invoice invoice) throws ResourceException, ServiceException {

		PaymentMethod paymentMethod = invoice.getPartyId().getPaymentMethod("CREDIT_CARD");
		if (paymentMethod == null) {
			LOGGER.error("Payment method not found for party " + invoice.getPartyId().getID());
		}

		ResourceWriter<Payment> paymentWriter = context.getResourceManager().getResourceWriter(Payment.class);
		Payment payment = paymentWriter.make();
		payment.setAmount(invoice.getTotal());
		payment.setPartyIdTo(invoice.getPartyIdFrom());
		payment.setPartyIdFrom(invoice.getPartyId());
		payment.setPaymentTypeId(context.createProxy(PaymentType.class, "VENDOR_PAYMENT"));
		payment.setPaymentMethodTypeId(context.createProxy(PaymentMethodType.class, "CREDIT_CARD"));
		if(paymentMethod != null)
			payment.setPaymentMethodId(paymentMethod);
		payment.setCurrencyUomId(commonDefault.getCurrencyUom());
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
