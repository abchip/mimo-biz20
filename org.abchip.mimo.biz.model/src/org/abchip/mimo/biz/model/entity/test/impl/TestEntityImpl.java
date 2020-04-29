/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.test.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;

import org.abchip.mimo.biz.model.entity.test.TestEntity;
import org.abchip.mimo.biz.model.entity.test.TestPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldId <em>Field Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldBlob <em>Field Blob</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldByteArray <em>Field Byte Array</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldComment <em>Field Comment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldCreditCardDate <em>Field Credit Card Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldCreditCardNumber <em>Field Credit Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldCurrencyAmount <em>Field Currency Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldCurrencyPrecise <em>Field Currency Precise</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldDate <em>Field Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldDateTime <em>Field Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldDescription <em>Field Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldEmail <em>Field Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldFixedPoint <em>Field Fixed Point</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldFloatingPoint <em>Field Floating Point</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldIdLong <em>Field Id Long</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldIdVlong <em>Field Id Vlong</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#isFieldIndicator <em>Field Indicator</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldLongVarchar <em>Field Long Varchar</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldNumeric <em>Field Numeric</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldObject <em>Field Object</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldShortVarchar <em>Field Short Varchar</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldTelNumber <em>Field Tel Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldTime <em>Field Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldUrl <em>Field Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldValue <em>Field Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldVeryLong <em>Field Very Long</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestEntityImpl#getFieldVeryShort <em>Field Very Short</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestEntityImpl extends BizEntityImpl implements TestEntity {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TEST_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldId() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldId(String newFieldId) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_ID, newFieldId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldBlob() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_BLOB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldBlob(String newFieldBlob) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_BLOB, newFieldBlob);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getFieldByteArray() {
		return (byte[])eGet(TestPackage.Literals.TEST_ENTITY__FIELD_BYTE_ARRAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldByteArray(byte[] newFieldByteArray) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_BYTE_ARRAY, newFieldByteArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldComment() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldComment(String newFieldComment) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_COMMENT, newFieldComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldCreditCardDate() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_CREDIT_CARD_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldCreditCardDate(String newFieldCreditCardDate) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_CREDIT_CARD_DATE, newFieldCreditCardDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldCreditCardNumber() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_CREDIT_CARD_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldCreditCardNumber(String newFieldCreditCardNumber) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_CREDIT_CARD_NUMBER, newFieldCreditCardNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFieldCurrencyAmount() {
		return (BigDecimal)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_CURRENCY_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldCurrencyAmount(BigDecimal newFieldCurrencyAmount) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_CURRENCY_AMOUNT, newFieldCurrencyAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFieldCurrencyPrecise() {
		return (BigDecimal)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_CURRENCY_PRECISE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldCurrencyPrecise(BigDecimal newFieldCurrencyPrecise) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_CURRENCY_PRECISE, newFieldCurrencyPrecise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFieldDate() {
		return (Date)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldDate(Date newFieldDate) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_DATE, newFieldDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFieldDateTime() {
		return (Date)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldDateTime(Date newFieldDateTime) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_DATE_TIME, newFieldDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldDescription() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldDescription(String newFieldDescription) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_DESCRIPTION, newFieldDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldEmail() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldEmail(String newFieldEmail) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_EMAIL, newFieldEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFieldFixedPoint() {
		return (BigDecimal)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_FIXED_POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldFixedPoint(BigDecimal newFieldFixedPoint) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_FIXED_POINT, newFieldFixedPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFieldFloatingPoint() {
		return (Double)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_FLOATING_POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldFloatingPoint(double newFieldFloatingPoint) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_FLOATING_POINT, newFieldFloatingPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldIdLong() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_ID_LONG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldIdLong(String newFieldIdLong) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_ID_LONG, newFieldIdLong);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldIdVlong() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_ID_VLONG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldIdVlong(String newFieldIdVlong) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_ID_VLONG, newFieldIdVlong);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFieldIndicator() {
		return (Boolean)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldIndicator(boolean newFieldIndicator) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_INDICATOR, newFieldIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldLongVarchar() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_LONG_VARCHAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldLongVarchar(String newFieldLongVarchar) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_LONG_VARCHAR, newFieldLongVarchar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldName() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldName(String newFieldName) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_NAME, newFieldName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getFieldNumeric() {
		return (Long)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_NUMERIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldNumeric(long newFieldNumeric) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_NUMERIC, newFieldNumeric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getFieldObject() {
		return (Object)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldObject(Object newFieldObject) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_OBJECT, newFieldObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldShortVarchar() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_SHORT_VARCHAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldShortVarchar(String newFieldShortVarchar) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_SHORT_VARCHAR, newFieldShortVarchar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldTelNumber() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_TEL_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldTelNumber(String newFieldTelNumber) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_TEL_NUMBER, newFieldTelNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFieldTime() {
		return (Date)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldTime(Date newFieldTime) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_TIME, newFieldTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldUrl() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldUrl(String newFieldUrl) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_URL, newFieldUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldValue() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldValue(String newFieldValue) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_VALUE, newFieldValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldVeryLong() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_VERY_LONG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldVeryLong(String newFieldVeryLong) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_VERY_LONG, newFieldVeryLong);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldVeryShort() {
		return (String)eGet(TestPackage.Literals.TEST_ENTITY__FIELD_VERY_SHORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldVeryShort(String newFieldVeryShort) {
		eSet(TestPackage.Literals.TEST_ENTITY__FIELD_VERY_SHORT, newFieldVeryShort);
	}

} //TestEntityImpl
