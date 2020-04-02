package org.abchip.mimo.biz.test.command.runner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItem;
import org.abchip.mimo.biz.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.accounting.invoice.InvoiceStatus;
import org.abchip.mimo.biz.accounting.invoice.InvoiceType;
import org.abchip.mimo.biz.base.service.ContactMechServices;
import org.abchip.mimo.biz.base.service.SystemDefault;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateInvoice implements Callable<Long> {

	Context context;
	
	public CreateInvoice(Context context) {
        this.context = context;
    }
	
	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createInvoice();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createInvoice() {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		List<Party> parties = StressTestUtils.getEnabledCustomers(context, resourceManager);
		if(parties.size() == 0) {
			System.err.println("Customer Party not found. Operation canceled.");
			return;
		}

		Map<Product, ProductPrice> productMap = StressTestUtils.getDigitalProducts(context, resourceManager);
		if(productMap.isEmpty()) {
			System.err.println("Digital product and price not found. Operation canceled.");
			return;
		}

		// Create orders
		Iterator<Party> partyIt = parties.iterator();
		while(partyIt.hasNext()) {
			createPartyInvoice(resourceManager, partyIt.next(), productMap);
		}
	}

	private void createPartyInvoice(ResourceManager resourceManager, Party party, Map<Product, ProductPrice> productMap) {
		// Invoice Header
		ResourceWriter<Invoice> invoiceWriter = resourceManager.getResourceWriter(context, Invoice.class);
		Invoice invoice = invoiceWriter.make(true);
		invoice.setInvoiceTypeId(resourceManager.getFrame(context, InvoiceType.class).createProxy("SALES_INVOICE"));
		invoice.setInvoiceDate(new Date());
		invoice.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("INVOICE_IN_PROCESS"));
		invoice.setCurrencyUomId(SystemDefault.getUom(context));
		invoice.setPartyId(party);
		invoice.setPartyIdFrom(SystemDefault.getCompany(context));
		invoice.setDescription("Invoice test for party " + party.getID());
		invoiceWriter.create(invoice, true);

		// InvoiceStatus
		ResourceWriter<InvoiceStatus> invoiceStatusWriter = resourceManager.getResourceWriter(context, InvoiceStatus.class);
		InvoiceStatus invoiceStatus = invoiceStatusWriter.make();
		invoiceStatus.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("INVOICE_IN_PROCESS"));
		invoiceStatus.setInvoiceId(invoice);
		invoiceStatus.setStatusDate(new Date());
		invoiceStatusWriter.create(invoiceStatus, true);

		// InvoiceContactMech
		ResourceWriter<InvoiceContactMech> invoiceContactMechWriter = resourceManager.getResourceWriter(context, InvoiceContactMech.class);
		InvoiceContactMech invoiceContactMech = invoiceContactMechWriter.make();
		invoiceContactMech.setInvoiceId(invoice);
		invoiceContactMech.setContactMechPurposeTypeId(resourceManager.getFrame(context, ContactMechPurposeType.class).createProxy("PAYMENT_LOCATION"));
		invoiceContactMech.setContactMechId(ContactMechServices.getLatestPostaAddress(context, party.getID()));
		invoiceContactMechWriter.create(invoiceContactMech, true);
		
		// OrderItem
		long i = 1;
		for(Entry<Product, ProductPrice> entry : productMap.entrySet()) {
			createInvoiceItem(resourceManager, invoice, StressTestUtils.formatPaddedNumber(i++, 5), entry.getKey(), 1, entry.getValue());
		}
	}

	private void createInvoiceItem(ResourceManager resourceManager, Invoice invoice, String itemSeqiD, Product product, int quantity, ProductPrice price) {
		ResourceWriter<InvoiceItem> invoiceItemWriter = resourceManager.getResourceWriter(context, InvoiceItem.class);

		InvoiceItem invoiceItem = invoiceItemWriter.make();
		invoiceItem.setInvoiceId(invoice);
		invoiceItem.setInvoiceItemSeqId(itemSeqiD);
		invoiceItem.setInvoiceItemTypeId(resourceManager.getFrame(context, InvoiceItemType.class).createProxy("INV_DPROD_ITEM"));

		invoiceItem.setProductId(product);
		invoiceItem.setDescription(product.getProductName());
		invoiceItem.setQuantity(new BigDecimal(quantity));
		invoiceItem.setTaxableFlag(product.isTaxable());
		invoiceItem.setAmount(price.getPrice());

		invoiceItemWriter.create(invoiceItem, true);

		// TODO service calcTaxForDisplay to add new row tax BizTestCommand
	}
}
