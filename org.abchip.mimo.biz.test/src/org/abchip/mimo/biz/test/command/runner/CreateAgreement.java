package org.abchip.mimo.biz.test.command.runner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.base.service.SystemDefault;
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
import org.abchip.mimo.biz.model.product.price.ProductPrice;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateAgreement implements Callable<Long> {

	Context context;
	Party party;
	List<ProductPrice> productPrices;

	public CreateAgreement(Context context, Party party, List<ProductPrice> productPrices) {
		this.context = context;
		this.party = party;
		this.productPrices = productPrices;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();
		createAgreement();
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	private void createAgreement() throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		RoleType roleTypeFrom = resourceManager.getFrame(context, RoleType.class).createProxy("INTERNAL_ORGANIZATIO");
		RoleType roleTypeTo = resourceManager.getFrame(context, RoleType.class).createProxy("CUSTOMER");
		AgreementType agreementType = resourceManager.getFrame(context, AgreementType.class).createProxy("SALES_AGREEMENT");

		// Agreement
		ResourceWriter<Agreement> agreementWriter = resourceManager.getResourceWriter(context, Agreement.class);

		Agreement agreement = agreementWriter.make(true);
		agreement.setPartyIdFrom(SystemDefault.getCompany(context));
		agreement.setPartyIdTo(party);

		agreement.setRoleTypeIdFrom(roleTypeFrom);
		agreement.setRoleTypeIdTo(roleTypeTo);
		agreement.setAgreementTypeId(agreementType);
		agreement.setAgreementDate(new Date());
		agreement.setFromDate(new Date());
		agreement.setDescription("Open new agreement for customer " + party.getID());
		agreementWriter.create(agreement);

		String agreementItemSeqId = createRow(resourceManager, agreement);

		// row product
		for (ProductPrice productPrice : this.productPrices)
			createRowProduct(resourceManager, agreement, productPrice, agreementItemSeqId);
	}

	private void createRowProduct(ResourceManager resourceManager, Agreement agreement, ProductPrice productPrice, String itemSeqId) throws ResourceException {
		// AgreementProductAppl
		ResourceWriter<AgreementProductAppl> agreementProductApplWriter = resourceManager.getResourceWriter(context, AgreementProductAppl.class);
		AgreementProductAppl agreementProductAppl = agreementProductApplWriter.make();
		agreementProductAppl.setAgreementId(agreement);
		agreementProductAppl.setAgreementItemSeqId(itemSeqId);
		agreementProductAppl.setProductId(productPrice.getProductId());
		agreementProductAppl.setPrice(productPrice.getPrice());
		agreementProductApplWriter.create(agreementProductAppl);
	}

	private String createRow(ResourceManager resourceManager, Agreement agreement) throws ResourceException {

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
		agreementItem.setCurrencyUomId(SystemDefault.getUom(context).getID());
		agreementItem.setAgreementText("Agrement test opened in trial mode");
		agreementItemWriter.create(agreementItem);

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
		// agreementTerm.setDescription();
		agreementTermWriter.create(agreementTerm);

		return agreementItemSeqId;
	}
}
