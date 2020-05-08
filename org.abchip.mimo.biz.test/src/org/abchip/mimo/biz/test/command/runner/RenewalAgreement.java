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
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.model.accounting.payment.CreditCard;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.accounting.payment.PaymentType;
import org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.agreement.Agreement;
import org.abchip.mimo.biz.model.party.agreement.AgreementItem;
import org.abchip.mimo.biz.model.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.model.party.agreement.AgreementProductAppl;
import org.abchip.mimo.biz.model.party.agreement.AgreementTerm;
import org.abchip.mimo.biz.model.party.agreement.TermType;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.service.accounting.SetInvoiceStatus;
import org.abchip.mimo.biz.service.accounting.SetInvoiceStatusResponse;
import org.abchip.mimo.biz.service.accounting.SetPaymentStatus;
import org.abchip.mimo.biz.service.accounting.SetPaymentStatusResponse;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDef;
import org.abchip.mimo.biz.service.accounting.UpdatePaymentApplicationDefResponse;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.product.CalcTaxForDisplay;
import org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse;
import org.abchip.mimo.biz.service.product.CalculateProductPrice;
import org.abchip.mimo.biz.service.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.test.accounting.StripePaymentManager;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public class RenewalAgreement implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(RenewalAgreement.class);
	Context context;
	GetCommonDefaultResponse commonDefault;
	GetPartyDefaultResponse partyDefault;
	
	String agreementId;
	long invoiceSeq = 1;

	public RenewalAgreement(Context context, String agreementId) {
		this.context = context;
		this.agreementId = agreementId;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(GetPartyDefault.class);
		partyDefault = serviceManager.execute(getPartyDefault);

		long time1 = System.currentTimeMillis();
		renewalAgreement(serviceManager);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void renewalAgreement(ServiceManager serviceManager) throws ResourceException, ServiceException, StripeException {
		/*
		 * il rinnovo del contratto avviene quando questo è ancora aperto (Agreement) ed
		 * i termini della varie righe sono scaduti. verrà presa l'ultima riga e copiata
		 * in una nuova con nuove date di termine.
		 */
		Timestamp timeStamp = new java.sql.Timestamp(System.currentTimeMillis());

		// TODO gestione della where con date validità da rivedere
		// TODO In EntityUtils dalla specifica 123 alla 141 ci sono i metodi che
		// utilizza Biz per le where con le date

		String filter = "(thruDate IS NULL OR thruDate > '" + timeStamp + "') AND (fromDate IS NULL OR fromDate <= '" + timeStamp + "')";
		if (agreementId != null)
			filter = filter + "AND agreementId = '" + agreementId + "'";

		ResourceReader<Agreement> agreementReader = context.getResourceManager().getResourceReader(Agreement.class);
		// ResourceReader<AgreementItem> agreementItemReader =
		// context.getResourceManager().getResourceReader(AgreementItem.class);
		ResourceReader<AgreementTerm> agreementTermReader = context.getResourceManager().getResourceReader(AgreementTerm.class);
		ResourceReader<AgreementProductAppl> agreementProductApplReader = context.getResourceManager().getResourceReader(AgreementProductAppl.class);

		try (EntityIterator<Agreement> agreements = agreementReader.find(filter)) {
			for (Agreement agreement : agreements) {
				LOGGER.info("Verify agreement " + agreement.getAgreementId());

				String termFilter = "agreementId = '" + agreement.getAgreementId() + "'";

				int open = 0;
				int close = 0;

				AgreementTerm agreementTermLast = null;
				try (EntityIterator<AgreementTerm> agreementTerms = agreementTermReader.find(termFilter)) {
					for (AgreementTerm agreementTerm : agreementTerms) {
						Date date = new Date();
						if (agreementTerm.getThruDate().compareTo(date) < 0) {
							close++;
						} else {
							open++;
						}
						agreementTermLast = agreementTerm;
					}
				}

				// Eseguo rinnovo dall'ultima riga;
				if (open == 0 && close > 0) {
					
					String agreementItemSeqId = getNewSeqId(agreementTermLast.getAgreementItemSeqId());
					
					
					createRow(agreement, "Renewal agreement", agreementItemSeqId);

					// Leggo i prodotti dalla riga precedente
					String productFilter = "agreementId = '" + agreement.getAgreementId() + "' AND agreementItemSeqId = '" + agreementTermLast.getAgreementItemSeqId() + "'";

					try (EntityIterator<AgreementProductAppl> agreementProducts = agreementProductApplReader.find(productFilter)) {
						for (AgreementProductAppl agreementProduct : agreementProducts) {
							createRowProduct(agreement, agreementProduct.getProductId(), agreementItemSeqId);
						}
					}

					// Creo la fattura dalla nuova riga
					Invoice invoice = createInvoice(agreement.getPartyIdTo(), "Agreement renewal - reference " + agreement.getID() + "/" + agreementItemSeqId);

					// leggo la riga appena creata
					productFilter = "agreementId = '" + agreement.getAgreementId() + "' AND agreementItemSeqId = '" + agreementItemSeqId + "'";
					try (EntityIterator<AgreementProductAppl> agreementProducts = agreementProductApplReader.find(productFilter)) {
						for (AgreementProductAppl agreementProduct : agreementProducts) {
							createInvoiceItem(invoice, agreementProduct.getProductId(), 1, agreementTermLast.getInvoiceItemTypeId().getID());
						}
					}

					LOGGER.info("Creata fattura numero " + invoice.getInvoiceId());
					// Creazione pagamento
					String paymentId = createPaymentFromInvoice(invoice);
					LOGGER.info("Creato pagamento " + paymentId);

					// Effettuo pagamento Tramite Stripe
					CreditCard creditCard = invoice.getPartyId().getCreditCard();
					if (creditCard != null) {
						Stripe.apiKey = StripePaymentManager.API_KEY;

						String description = "Payment invoice nr. " + invoice.getID() + " - customer " + invoice.getPartyId().getID();
						PaymentIntent intent = StripePaymentManager.createPaymentIntent("card", invoice.getTotal(), invoice.getCurrencyUomId().getID(), description);
						String[] values = creditCard.getExpireDate().split("/");
						com.stripe.model.PaymentMethod paymentMethod = StripePaymentManager.createPaymentCardMethod(creditCard.getCardNumber(), Integer.parseInt(values[0]),
								Integer.parseInt(values[1]), creditCard.getDescription());
						PaymentIntent confirm = StripePaymentManager.confirm(intent.getId(), paymentMethod.getId());
						LOGGER.info("Transaction " + confirm.getId() + " " + confirm.getStatus());
						if (confirm.getStatus().contentEquals("succeeded")) {
							// Receive payment (PMNT_RECEIVED)
							if (setPaymentStatus(paymentId, "PMNT_RECEIVED")) {
								setPaymentStatus(paymentId, "PMNT_CONFIRMED");
							}
							// TODO Update payment with transaction id

							// Approve Invoice
							setInvoiceStatus(invoice.getID(), "INVOICE_APPROVED");
						} else {
							LOGGER.error("Error in credit card payment");
						}
					} else {
						LOGGER.error("Invalid transaction - credit card not found");
					}
				}
			}
		}
	}
	
	private void createRow(Agreement agreement, String text, String agreementItemSeqId) throws ResourceException {

		AgreementItemType agreementType = context.createProxy(AgreementItemType.class, "AGREEMENT_PRICING_PR");
		TermType termType = context.createProxy(TermType.class, "FIN_PAYMENT_FIXDAY");
		InvoiceItemType invoiceItemType = context.createProxy(InvoiceItemType.class, "INV_DPROD_ITEM");

		// AgreementItem
		ResourceWriter<AgreementItem> agreementItemWriter = context.getResourceManager().getResourceWriter(AgreementItem.class);

		AgreementItem agreementItem = agreementItemWriter.make();
		agreementItem.setAgreementId(agreement);
		agreementItem.setAgreementItemSeqId(agreementItemSeqId);
		agreementItem.setAgreementItemTypeId(agreementType);
		agreementItem.setCurrencyUomId(commonDefault.getCurrencyUom().getID());
		agreementItem.setAgreementText(text);
		agreementItemWriter.create(agreementItem);
		// AgreementTerm
		ResourceWriter<AgreementTerm> agreementTermWriter = context.getResourceManager().getResourceWriter(AgreementTerm.class);
		AgreementTerm agreementTerm = agreementTermWriter.make(true);

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
	}

	private void createRowProduct(Agreement agreement, Product product, String itemSeqId)
			throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

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
		if (response.isError())
			LOGGER.error("Errore in recupero prezzo articolo " + product.getID());

		if (response.isValidPriceFound()) {
			agreementProductAppl.setPrice(response.getBasePrice());
		} else
			LOGGER.warn("Prezzo non valido per articolo " + product.getID());

		agreementProductApplWriter.create(agreementProductAppl);
	}

	private Invoice createInvoice(Party party, String description) throws ResourceException {
		// Invoice Header
		ResourceWriter<Invoice> invoiceWriter = context.getResourceManager().getResourceWriter(Invoice.class);
		PartyAcctgPreference partyAcctgPreference = partyDefault.getAccountingPreference();
		Invoice invoice = invoiceWriter.make(true);
		String invoiceId = invoice.getInvoiceId();
		if (partyAcctgPreference != null && partyAcctgPreference.getInvoiceIdPrefix() != null) {
			invoice.setInvoiceId(partyAcctgPreference.getInvoiceIdPrefix() + invoiceId);
		}
		invoice.setInvoiceTypeId(context.createProxy(InvoiceType.class, "SALES_INVOICE"));
		invoice.setInvoiceDate(new Date());
		invoice.setStatusId(context.createProxy(StatusItem.class, "INVOICE_IN_PROCESS"));
		invoice.setCurrencyUomId(commonDefault.getCurrencyUom());
		invoice.setPartyId(party);
		invoice.setPartyIdFrom(partyDefault.getOrganization());
		if (!description.isEmpty())
			invoice.setDescription(description);
		invoiceWriter.create(invoice);

		// InvoiceStatus
		ResourceWriter<InvoiceStatus> invoiceStatusWriter = context.getResourceManager().getResourceWriter(InvoiceStatus.class);
		InvoiceStatus invoiceStatus = invoiceStatusWriter.make();
		invoiceStatus.setStatusId(context.createProxy(StatusItem.class, "INVOICE_IN_PROCESS"));
		invoiceStatus.setInvoiceId(invoice);
		invoiceStatus.setStatusDate(new Date());
		invoiceStatusWriter.create(invoiceStatus);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = context.getResourceManager().getResourceWriter(InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoiceId(invoice);
		invoiceContactMech.setContactMechPurposeTypeId(context.createProxy(ContactMechPurposeType.class, "PAYMENT_LOCATION"));
		invoiceContactMech.setContactMechId(party.getPostalAddress());
		invoiceContactMechWriter.create(invoiceContactMech);

		return invoice;
	}
	
	private void createInvoiceItem(Invoice invoice, Product product, int quantity, String itemType)
			throws ResourceException, ServiceException {
		ServiceManager serviceManager = context.getServiceManager();

		ResourceWriter<InvoiceItem> invoiceItemWriter = context.getResourceManager().getResourceWriter(InvoiceItem.class);
		InvoiceItem invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);
		invoiceItem.setInvoiceItemSeqId(StressTestUtils.formatPaddedNumber(invoiceSeq++, 5));
		invoiceItem.setInvoiceItemTypeId(context.createProxy(InvoiceItemType.class, itemType));
		invoiceItem.setProductId(product);
		invoiceItem.setDescription(product.getProductName());
		invoiceItem.setQuantity(new BigDecimal(quantity));

		// price calculation
		CalculateProductPrice calculateProductPrice = serviceManager.prepare(CalculateProductPrice.class);
		calculateProductPrice.setProduct(product);
		calculateProductPrice.setCurrencyUomId(commonDefault.getCurrencyUom().getID());

		CalculateProductPriceResponse productPrice = serviceManager.execute(calculateProductPrice);
		if (productPrice.isError())
			LOGGER.error("Errore in recupero prezzo articolo " + product.getID());

		if (productPrice.isValidPriceFound()) {
			invoiceItem.setAmount(productPrice.getBasePrice());
		} else
			LOGGER.warn("Prezzo non valido per articolo " + product.getID());

		invoiceItemWriter.create(invoiceItem);

		//
		String saveInvoiceItemSeqId = invoiceItem.getInvoiceItemSeqId();

		// check taxable
		ProductStore productStore = StressTestUtils.getProductStore(context);

		String filterTaxAuth = "taxAuthPartyId = '" + productStore.getVatTaxAuthPartyId() + "' AND taxAuthGeoId = '" + productStore.getVatTaxAuthGeoId() + "'";

		ResourceReader<TaxAuthorityRateProduct> taxAuthorityRateProductReader = context.getResourceManager().getResourceReader(TaxAuthorityRateProduct.class);
		String taxAuthPartyId = "";
		String taxAuthGeoId = "";
		String taxAuthorityRateSeqId = "";

		TaxAuthorityRateProduct taxAuthorityRateProductRec = null;
		try (EntityIterator<TaxAuthorityRateProduct> taxAuthorityRateProducts = taxAuthorityRateProductReader.find(filterTaxAuth, null, null, 1)) {
			for (TaxAuthorityRateProduct taxAuthorityRateProduct : taxAuthorityRateProducts) {
				taxAuthPartyId = taxAuthorityRateProduct.getTaxAuthPartyId();
				taxAuthGeoId = taxAuthorityRateProduct.getTaxAuthGeoId();
				taxAuthorityRateSeqId = taxAuthorityRateProduct.getTaxAuthorityRateSeqId();
				taxAuthorityRateProductRec = taxAuthorityRateProduct;
			}
		}

		if (taxAuthPartyId == null || taxAuthPartyId.isEmpty())
			taxAuthPartyId = "ITA-ADE";

		if (taxAuthGeoId == null || taxAuthGeoId.isEmpty())
			taxAuthGeoId = commonDefault.getCountryGeo().getID();

		CalcTaxForDisplay calcTaxForDisplay = serviceManager.prepare(CalcTaxForDisplay.class);
		calcTaxForDisplay.setBasePrice(productPrice.getBasePrice());
		calcTaxForDisplay.setProductId(product.getID());
		calcTaxForDisplay.setProductStoreId(productStore.getID());
		CalcTaxForDisplayResponse taxForDisplay = serviceManager.execute(calcTaxForDisplay);
		if (taxForDisplay.isError()) {
			LOGGER.error("Errore in recupero tasse per articolo " + product.getID());
			return;
		}

		Party taxAutPartyId = context.createProxy(Party.class, taxAuthPartyId);
		Geo taxAutGeo = context.createProxy(Geo.class, taxAuthGeoId);

		invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);
		invoiceItem.setInvoiceItemSeqId(StressTestUtils.formatPaddedNumber(invoiceSeq++, 5));
		invoiceItem.setInvoiceItemTypeId(context.createProxy(InvoiceItemType.class, "ITM_SALES_TAX"));
		invoiceItem.setProductId(product);
		invoiceItem.setParentInvoiceId(invoice.getID());
		invoiceItem.setParentInvoiceItemSeqId(saveInvoiceItemSeqId);
		invoiceItem.setQuantity(new BigDecimal(quantity));
		invoiceItem.setAmount((taxForDisplay.getTaxTotal()));

		// TODO verify
		invoiceItem.setTaxAuthPartyId(taxAutPartyId);
		invoiceItem.setTaxAuthGeoId(taxAutGeo);
		if (!taxAuthorityRateSeqId.isEmpty()) {
			invoiceItem.setTaxAuthorityRateSeqId(taxAuthorityRateProductRec);
		}

		invoiceItemWriter.create(invoiceItem);
	}
	
	private String createPaymentFromInvoice(Invoice invoice)
			throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		PaymentMethod paymentMethod = invoice.getPartyId().getPaymentMethod("CREDIT_CARD");
		if (paymentMethod == null) {
			LOGGER.warn("Payment method not found for party " + invoice.getPartyId().getID());
		}

		ResourceWriter<Payment> paymentWriter = context.getResourceManager().getResourceWriter(Payment.class);
		Payment payment = paymentWriter.make(true);
		payment.setAmount(invoice.getTotal());
		payment.setPartyIdTo(invoice.getPartyIdFrom());
		payment.setPartyIdFrom(invoice.getPartyId());
		payment.setPaymentTypeId(context.createProxy(PaymentType.class, "CUSTOMER_PAYMENT"));
		payment.setPaymentMethodTypeId(context.createProxy(PaymentMethodType.class, "CREDIT_CARD"));
		payment.setCurrencyUomId(commonDefault.getCurrencyUom());
		payment.setPaymentRefNum("Invoice number " + invoice.getID());

		paymentWriter.create(payment);

		// applicazione pagamento
		UpdatePaymentApplicationDef updatePaymentApplicationDef = serviceManager.prepare(UpdatePaymentApplicationDef.class);
		updatePaymentApplicationDef.setInvoiceId(invoice.getID());
		updatePaymentApplicationDef.setPaymentId(payment.getID());
		UpdatePaymentApplicationDefResponse response = serviceManager.execute(updatePaymentApplicationDef);
		if (response.isError()) {
			LOGGER.error("Error in payment application: " + payment.getID());
			return payment.getID();
		}
		LOGGER.info("Pagamento applicato");

		return payment.getID();
	}
	
	private boolean setPaymentStatus(String paymentId, String statusPaymentId) throws ResourceException, ServiceException {

		ServiceManager serviceManager = context.getServiceManager();

		SetPaymentStatus setPaymentStatus = serviceManager.prepare(SetPaymentStatus.class);
		setPaymentStatus.setPaymentId(paymentId);
		setPaymentStatus.setStatusId(statusPaymentId);
		SetPaymentStatusResponse response = serviceManager.execute(setPaymentStatus);
		if (response.isError()) {
			LOGGER.error("Error in receive payment");
			return false;
		}

		return true;
	}

	private boolean setInvoiceStatus(String invoiceId, String status) throws ResourceException, ServiceException {
		ServiceManager serviceManager = context.getServiceManager();

		SetInvoiceStatus setInvoiceStatus = serviceManager.prepare(SetInvoiceStatus.class);
		setInvoiceStatus.setInvoiceId(invoiceId);
		setInvoiceStatus.setStatusId(status);
		setInvoiceStatus.setPaidDate(new Date());
		setInvoiceStatus.setStatusDate(new Date());

		SetInvoiceStatusResponse response = serviceManager.execute(setInvoiceStatus);
		if (response.isError()) {
			LOGGER.error("Error in approve invoice");
			return false;
		}

		return true;
	}
	
	private String getNewSeqId(String agreementItemSeqId) {
		int i = Integer.parseInt(agreementItemSeqId);
		i++;
		return StressTestUtils.formatPaddedNumber(i, 5);
	}
}
