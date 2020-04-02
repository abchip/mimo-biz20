package org.abchip.mimo.biz.test.command.runner;

import java.security.SecureRandom;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.party.agreement.Agreement;
import org.abchip.mimo.biz.party.agreement.AgreementItem;
import org.abchip.mimo.biz.party.agreement.AgreementTerm;
import org.abchip.mimo.biz.party.agreement.TermType;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateInpsAgreement implements Callable<Long> {

	Context context;
	
	public CreateInpsAgreement(Context context) {
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
		createInpsAgreement(resourceManager);
	}

	private void createInpsAgreement(ResourceManager resourceManager) {
		String fiscalCode = generateRandomString(16, false);
		// Agreement
		ResourceWriter<Agreement> agreementWriter = resourceManager.getResourceWriter(context, Agreement.class);

		Agreement agreement = agreementWriter.make(true);

		agreement.setAgreementDate(new Date());
		agreement.setFromDate(new Date());
		agreement.setDescription("Risarcimento INPS 600€ per soggetto: " + fiscalCode);
		agreementWriter.create(agreement, true);
		
		int row = 1;
		createRow(resourceManager, agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Codice fiscale: " + fiscalCode);
		createRow(resourceManager, agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Telefono fisso: " + "0" + generateRandomString(2, true) + " " + generateRandomString(6, true));
		createRow(resourceManager, agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Telefono cellulare: " + "3" + generateRandomString(2, true) + " " + generateRandomString(7, true));
		createRow(resourceManager, agreement, StressTestUtils.formatPaddedNumber(row++, 5), "E-mail: " + fiscalCode + "@gmail.com");
		createRow(resourceManager, agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Iban: " + "IT" + generateRandomString(2, true) + generateRandomString(1, false) + generateRandomString(5, true) + generateRandomString(5, true) + generateRandomString(12, true));
		createRow(resourceManager, agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Flag gestione separata: SI");
		createRow(resourceManager, agreement, StressTestUtils.formatPaddedNumber(row++, 5), "Flag dichiarazioni non mendaci: SI");
		
		// AgreementTerm
		TermType termType = resourceManager.getFrame(context, TermType.class).createProxy("INDEMNIFICATION");
		ResourceWriter<AgreementTerm> agreementTermWriter = resourceManager.getResourceWriter(context, AgreementTerm.class);
		AgreementTerm agreementTerm = agreementTermWriter.make(true);
		agreementTerm.setTermTypeId(termType);
		agreementTerm.setAgreementId(agreement);
		agreementTerm.setAgreementItemSeqId("00001");
		Date date1 = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		cal.add(Calendar.MONTH, 1);
		Date date2 = cal.getTime();
		agreementTerm.setFromDate(date1);
		agreementTerm.setThruDate(date2);
//		agreementTerm.setDescription();
		agreementTermWriter.create(agreementTerm, true);
	}
	
	private void createRow(ResourceManager resourceManager, Agreement agreement, String seqId, String text) {
		// AgreementItem
		ResourceWriter<AgreementItem> agreementItemWriter = resourceManager.getResourceWriter(context, AgreementItem.class);
		AgreementItem agreementItem = agreementItemWriter.make();
		agreementItem.setAgreementId(agreement);
		agreementItem.setAgreementItemSeqId(seqId);
		agreementItem.setAgreementText(text);
		agreementItemWriter.create(agreementItem, true);
	}
	
	private static String generateRandomString(int length, boolean onlyNumbers) {
	    // You can customize the characters that you want to add into
	    // the random strings
	    String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	    String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	    String NUMBER = "0123456789";

	    String DATA_FOR_RANDOM_STRING = "";

	    if(onlyNumbers) {
	    	DATA_FOR_RANDOM_STRING = NUMBER + NUMBER;
	    } else {
	    	DATA_FOR_RANDOM_STRING = CHAR_UPPER + NUMBER;
	    }
	    SecureRandom random = new SecureRandom();

	    if (length < 1) throw new IllegalArgumentException();

	    StringBuilder sb = new StringBuilder(length);
	    
	    for (int i = 0; i < length; i++) {
	        // 0-62 (exclusive), random returns 0-61
	        int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
	        char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

	        sb.append(rndChar);
	    }

	    return sb.toString();
	}
}
