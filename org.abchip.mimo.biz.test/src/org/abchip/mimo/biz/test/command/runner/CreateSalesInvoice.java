package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.accounting.invoice.InvoiceStatus;
import org.abchip.mimo.biz.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.base.service.ContactMechServices;
import org.abchip.mimo.biz.base.service.PartyServices;
import org.abchip.mimo.biz.base.service.SystemDefault;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateSalesInvoice implements Callable<Long> {

	Context context;
	Party party;
	List<ProductPrice> productPrices;

	public CreateSalesInvoice(Context context, Party party, List<ProductPrice> productPrices) {
		this.context = context;
		this.party = party;
		this.productPrices = productPrices;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createInvoice();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createInvoice() throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Invoice Header
		ResourceWriter<Invoice> invoiceWriter = resourceManager.getResourceWriter(context, Invoice.class);
		PartyAcctgPreference partyAcctgPreference = PartyServices.getPartyAcctgPreference(context);

		Invoice invoice = invoiceWriter.make(true);
		String invoiceId = invoice.getInvoiceId();
		if (partyAcctgPreference != null && partyAcctgPreference.getInvoiceIdPrefix() != null) {
			invoice.setInvoiceId(partyAcctgPreference.getInvoiceIdPrefix() + invoiceId);
		}
		
		invoice.setInvoiceTypeId(resourceManager.getFrame(context, InvoiceType.class).createProxy("SALES_INVOICE"));
		invoice.setInvoiceDate(new Date());
		invoice.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("INVOICE_IN_PROCESS"));
		invoice.setCurrencyUomId(SystemDefault.getUom(context));
		invoice.setPartyId(party);
		invoice.setPartyIdFrom(SystemDefault.getCompany(context));
		invoice.setDescription("Sales invoice test for party " + party.getID());
		invoiceWriter.create(invoice);

		// InvoiceStatus
		ResourceWriter<InvoiceStatus> invoiceStatusWriter = resourceManager.getResourceWriter(context, InvoiceStatus.class);
		InvoiceStatus invoiceStatus = invoiceStatusWriter.make();
		invoiceStatus.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("INVOICE_IN_PROCESS"));
		invoiceStatus.setInvoiceId(invoice);
		invoiceStatus.setStatusDate(new Date());
		invoiceStatusWriter.create(invoiceStatus);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = resourceManager.getResourceWriter(context, InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoiceId(invoice);
		invoiceContactMech.setContactMechPurposeTypeId(resourceManager.getFrame(context, ContactMechPurposeType.class).createProxy("PAYMENT_LOCATION"));
		invoiceContactMech.setContactMechId(ContactMechServices.getLatestPostaAddress(context, party.getID()));
		invoiceContactMechWriter.create(invoiceContactMech);

		// OrderItem
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
		invoiceItem.setInvoiceItemTypeId(resourceManager.getFrame(context, InvoiceItemType.class).createProxy("INV_DPROD_ITEM"));

		invoiceItem.setProductId(productPrice.getProductId());
		invoiceItem.setDescription(productPrice.getProductId().getProductName());
		invoiceItem.setQuantity(new BigDecimal(quantity));
		invoiceItem.setTaxableFlag(productPrice.getProductId().isTaxable());
		invoiceItem.setAmount(productPrice.getPrice());

		invoiceItemWriter.create(invoiceItem);

		// TODO service calcTaxForDisplay to add new row tax BizTestCommand
	}
}
