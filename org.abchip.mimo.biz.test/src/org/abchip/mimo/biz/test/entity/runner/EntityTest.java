/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.entity.runner;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Date;

import javax.inject.Inject;

import org.abchip.mimo.biz.model.entity.test.TestEntity;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "TestEntity")
public class EntityTest {

	@Inject
	public transient TestAsserter testAsserter;
	@Inject
	private TestRunner testRunner;

	@TestStarted
	public void doTest() throws ResourceException {
		
		String var07 = generateRandomString(7, false);
		String var10 = generateRandomString(10, false);
		String var60 = generateRandomString(60, false);
		String var100 = generateRandomString(100, false);
		String var255 = generateRandomString(255, false);
		String var320 = generateRandomString(320, false);
		String var2000 = generateRandomString(2000, false);
		byte[] bytes = "String in byte".getBytes();
		Date date = new Date();
		BigDecimal currencyAmount = new BigDecimal("1234567890123456.00");
		BigDecimal currencyPrecise = new BigDecimal("123456789012345.120");
		BigDecimal fixedPoint = new BigDecimal("12345678901.123455");
		
		ResourceWriter<TestEntity> testEntityWriter = testRunner.getContext().getResourceManager().getResourceWriter(TestEntity.class);
		TestEntity testEntity = testEntityWriter.lookup("10000");
		testAsserter.assertNull("Null TestEntity 10000", testEntity);

		// Write
		testEntity = testEntityWriter.make();
		testEntity.setFieldId("10000");

//		testEntity.setFieldBlob("A");
//	    testEntity.setFieldByteArray(bytes);

	    testEntity.setFieldObject("A");
		// date
		testEntity.setFieldDateTime(date);
	    testEntity.setFieldDate(date);
	    testEntity.setFieldTime(date);
		// number
	    testEntity.setFieldCurrencyAmount(currencyAmount);
	    testEntity.setFieldCurrencyPrecise(currencyPrecise);
	    testEntity.setFieldFixedPoint(fixedPoint);
	    testEntity.setFieldFloatingPoint(Double.MAX_VALUE);
	    testEntity.setFieldNumeric(Long.MAX_VALUE);
	    // String
	    testEntity.setFieldIdLong(var60);
	    testEntity.setFieldIdVlong(var255);
	    testEntity.setFieldIndicator(true);
	    testEntity.setFieldVeryShort(var10);
	    testEntity.setFieldShortVarchar(var60);
	    testEntity.setFieldLongVarchar(var255);
	    testEntity.setFieldVeryLong(var07 + " " + var10 + " " + var60 + " " + var100 + " " + var255 + " " + var320 + " " + var2000);
	    testEntity.setFieldComment(var255);
	    testEntity.setFieldDescription(var255);
	    testEntity.setFieldName(var100);
	    testEntity.setFieldValue(var255);
	    testEntity.setFieldCreditCardNumber(var255);
//	    testEntity.setFieldCreditCardDate("12/2030");
	    testEntity.setFieldEmail(var320);
	    testEntity.setFieldUrl(var2000);
	    testEntity.setFieldTelNumber(var60);
	    testEntityWriter.create(testEntity);

	    testEntity = testEntityWriter.lookup("10000");
		testAsserter.assertNotNull("Not null TestEntity 10000", testEntity);
	    
		testAsserter.assertEquals("Id", "10000", testEntity.getFieldId());
		
		testAsserter.assertEquals("Blob", "A" , testEntity.getFieldBlob());
		testAsserter.assertEquals("Byte", bytes, testEntity.getFieldByteArray());

		testAsserter.assertEquals("Object", "A", testEntity.getFieldObject());
		// date
		testAsserter.assertEquals("DateTime", date, testEntity.getFieldDateTime());
		testAsserter.assertEquals("Date", date, testEntity.getFieldDate());
		testAsserter.assertEquals("Time", date, testEntity.getFieldTime());
		// number
		testAsserter.assertEquals("CurrencyAmount", currencyAmount, testEntity.getFieldCurrencyAmount());
		testAsserter.assertEquals("CurrencyPrecise", currencyPrecise, testEntity.getFieldCurrencyPrecise());
		testAsserter.assertEquals("FixedPoint", fixedPoint, testEntity.getFieldFixedPoint());
		testAsserter.assertEquals("FloatingPoint", Double.MAX_VALUE, testEntity.getFieldFloatingPoint());
		testAsserter.assertEquals("Numeric", Long.MAX_VALUE, testEntity.getFieldNumeric());
	    // String
		testAsserter.assertEquals("IdLong", var60, testEntity.getFieldIdLong());
		testAsserter.assertEquals("IdVlong", var255, testEntity.getFieldIdVlong());
		testAsserter.assertEquals("Indicator", true, testEntity.isFieldIndicator());
		testAsserter.assertEquals("VeryShort", var10, testEntity.getFieldVeryShort());
		testAsserter.assertEquals("ShortVarchar", var60, testEntity.getFieldShortVarchar());
		testAsserter.assertEquals("LongVarchar", var255, testEntity.getFieldLongVarchar());
		testAsserter.assertEquals("VeryLong", var07 + " " + var10 + " " + var60 + " " + var100 + " " + var255 + " " + var320 + " " + var2000, testEntity.getFieldVeryLong());
		testAsserter.assertEquals("Comment", var255, testEntity.getFieldComment());
		testAsserter.assertEquals("Description", var255, testEntity.getFieldDescription());
		testAsserter.assertEquals("Name", var100, testEntity.getFieldName());
		testAsserter.assertEquals("Value", var255, testEntity.getFieldValue());
		testAsserter.assertEquals("CreditCardNumber", var255, testEntity.getFieldCreditCardNumber());
		testAsserter.assertEquals("CreditCardDate", "12/2030", testEntity.getFieldCreditCardDate());
		testAsserter.assertEquals("Email", var320, testEntity.getFieldEmail());
		testAsserter.assertEquals("Url", var2000, testEntity.getFieldUrl());
		testAsserter.assertEquals("TelNumber", var60, testEntity.getFieldTelNumber());
		
	    // Delete
	    testEntityWriter.delete(testEntity);

		testEntity = testEntityWriter.lookup("10000");
		testAsserter.assertNull("Null TestEntity 10000", testEntity);
	}
	
	private static String generateRandomString(int length, boolean onlyNumbers) {
		// You can customize the characters that you want to add into
		// the random strings
		String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
		String CHAR_UPPER = CHAR_LOWER.toUpperCase();
		String NUMBER = "0123456789";

		String DATA_FOR_RANDOM_STRING = "";

		if (onlyNumbers) {
			DATA_FOR_RANDOM_STRING = NUMBER + NUMBER;
		} else {
			DATA_FOR_RANDOM_STRING = CHAR_UPPER + NUMBER;
		}
		SecureRandom random = new SecureRandom();

		if (length < 1)
			throw new IllegalArgumentException();

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