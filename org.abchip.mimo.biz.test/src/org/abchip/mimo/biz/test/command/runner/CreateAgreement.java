package org.abchip.mimo.biz.test.command.runner;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.accounting.invoice.InvoiceItemType;
import org.abchip.mimo.biz.party.agreement.Agreement;
import org.abchip.mimo.biz.party.agreement.AgreementItem;
import org.abchip.mimo.biz.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.party.agreement.AgreementProductAppl;
import org.abchip.mimo.biz.party.agreement.AgreementTerm;
import org.abchip.mimo.biz.party.agreement.AgreementType;
import org.abchip.mimo.biz.party.agreement.TermType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.price.ProductPrice;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateAgreement implements Callable<Long> {

	Context context;
	
	public CreateAgreement(Context context) {
        this.context = context;
    }
	
	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createAgreement();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createAgreement() {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		List<Party> parties = StressTestUtils.checkParty(context, resourceManager);
		if(parties.size() == 0) {
			System.err.println("Customer Party not found. Operation canceled.");
			return;
		}

		Map<Product, ProductPrice> productMap = StressTestUtils.checkProduct(context, resourceManager);
		if(productMap.isEmpty()) {
			System.err.println("Digital product and price not found. Operation canceled.");
			return;
		}

		// Create orders
		Iterator<Party> partyIt = parties.iterator();
		while(partyIt.hasNext()) {
			createPartyAgreement(resourceManager, partyIt.next(), productMap);
		}
	}

	private void createPartyAgreement(ResourceManager resourceManager, Party party, Map<Product, ProductPrice> productMap) {
		
		RoleType roleTypeFrom = resourceManager.getFrame(context, RoleType.class).createProxy("INTERNAL_ORGANIZATIO");
		RoleType roleTypeTo = resourceManager.getFrame(context, RoleType.class).createProxy("CUSTOMER");
		AgreementType agreementType = resourceManager.getFrame(context, AgreementType.class).createProxy("SALES_AGREEMENT");

		// Agreement
		ResourceWriter<Agreement> agreementWriter = resourceManager.getResourceWriter(context, Agreement.class);

		Agreement agreement = agreementWriter.make(true);
		agreement.setPartyIdFrom(StressTestUtils.getCompany(context, resourceManager));
		agreement.setPartyIdTo(party);

		agreement.setRoleTypeIdFrom(roleTypeFrom);
		agreement.setRoleTypeIdTo(roleTypeTo);
		agreement.setAgreementTypeId(agreementType);
		agreement.setAgreementDate(new Date());
		agreement.setFromDate(new Date());
		agreement.setDescription("Open new agreement for customer " + party.getID());
		agreementWriter.create(agreement, true);

		String agreementItemSeqId = createRow(resourceManager, agreement, "Agrement test opened in trial mode");
		
		// row product
		for(Entry<Product, ProductPrice> entry : productMap.entrySet()) {
			createRowProduct(resourceManager, agreement, entry.getKey(), entry.getValue(), agreementItemSeqId);
		}
	}
	
	private String createRow(ResourceManager resourceManager, Agreement agreement, String text) {

		AgreementItemType agreementType = resourceManager.getFrame(context, AgreementItemType.class).createProxy("AGREEMENT_PRICING_PR");
		TermType termType = resourceManager.getFrame(context, TermType.class).createProxy("FIN_PAYMENT_FIXDAY");
		InvoiceItemType invoiceItemType = resourceManager.getFrame(context, InvoiceItemType.class).createProxy("INV_DPROD_ITEM");

		// AgreementItem
		ResourceWriter<AgreementItem> agreementItemWriter = resourceManager.getResourceWriter(context, AgreementItem.class);

		AgreementItem agreementItem = agreementItemWriter.make();
		agreementItem.setAgreementId(agreement);
		String agreementItemSeqId = StressTestUtils.formatPaddedNumber(1, 5);
		agreementItem.setAgreementItemSeqId(agreementItemSeqId);
		agreementItem.setAgreementItemTypeId(agreementType);
		agreementItem.setCurrencyUomId("EUR");
		agreementItem.setAgreementText(text);
		agreementItemWriter.create(agreementItem, true);

		// AgreementTerm
		ResourceWriter<AgreementTerm> agreementTermWriter = resourceManager.getResourceWriter(context, AgreementTerm.class);
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
//		agreementTerm.setDescription();
		agreementTermWriter.create(agreementTerm, true);

		return agreementItemSeqId;
	}
	
	private void createRowProduct(ResourceManager resourceManager, Agreement agreement, Product product, ProductPrice price, String itemSeqId) {
		// AgreementProductAppl
		ResourceWriter<AgreementProductAppl> agreementProductApplWriter = resourceManager.getResourceWriter(context, AgreementProductAppl.class);
		AgreementProductAppl agreementProductAppl = agreementProductApplWriter.make();
		agreementProductAppl.setAgreementId(agreement);
		agreementProductAppl.setAgreementItemSeqId(itemSeqId);
		agreementProductAppl.setProductId(product);
		agreementProductAppl.setPrice(price.getPrice());
		agreementProductApplWriter.create(agreementProductAppl, true);
	}
}