/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.test;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldId <em>Field Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldBlob <em>Field Blob</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldByteArray <em>Field Byte Array</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldComment <em>Field Comment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCreditCardDate <em>Field Credit Card Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCreditCardNumber <em>Field Credit Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCurrencyAmount <em>Field Currency Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCurrencyPrecise <em>Field Currency Precise</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDate <em>Field Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDateTime <em>Field Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDescription <em>Field Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldEmail <em>Field Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldFixedPoint <em>Field Fixed Point</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldFloatingPoint <em>Field Floating Point</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldIdLong <em>Field Id Long</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldIdVlong <em>Field Id Vlong</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#isFieldIndicator <em>Field Indicator</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldLongVarchar <em>Field Long Varchar</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldNumeric <em>Field Numeric</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldObject <em>Field Object</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldShortVarchar <em>Field Short Varchar</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldTelNumber <em>Field Tel Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldTime <em>Field Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldUrl <em>Field Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldValue <em>Field Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldVeryLong <em>Field Very Long</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldVeryShort <em>Field Very Short</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity()
 * @model annotation="mimo-ent-frame title='Test file for write'"
 * @generated
 */
public interface TestEntity extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Field Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Id</em>' attribute.
	 * @see #setFieldId(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFieldId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldId <em>Field Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Id</em>' attribute.
	 * @see #getFieldId()
	 * @generated
	 */
	void setFieldId(String value);

	/**
	 * Returns the value of the '<em><b>Field Blob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Blob</em>' attribute.
	 * @see #setFieldBlob(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldBlob()
	 * @model
	 * @generated
	 */
	String getFieldBlob();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldBlob <em>Field Blob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Blob</em>' attribute.
	 * @see #getFieldBlob()
	 * @generated
	 */
	void setFieldBlob(String value);

	/**
	 * Returns the value of the '<em><b>Field Byte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Byte Array</em>' attribute.
	 * @see #setFieldByteArray(byte[])
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldByteArray()
	 * @model
	 * @generated
	 */
	byte[] getFieldByteArray();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldByteArray <em>Field Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Byte Array</em>' attribute.
	 * @see #getFieldByteArray()
	 * @generated
	 */
	void setFieldByteArray(byte[] value);

	/**
	 * Returns the value of the '<em><b>Field Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Comment</em>' attribute.
	 * @see #setFieldComment(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldComment()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getFieldComment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldComment <em>Field Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Comment</em>' attribute.
	 * @see #getFieldComment()
	 * @generated
	 */
	void setFieldComment(String value);

	/**
	 * Returns the value of the '<em><b>Field Credit Card Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Credit Card Date</em>' attribute.
	 * @see #setFieldCreditCardDate(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldCreditCardDate()
	 * @model annotation="mimo-ent-format type='credit-card-date'"
	 * @generated
	 */
	String getFieldCreditCardDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCreditCardDate <em>Field Credit Card Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Credit Card Date</em>' attribute.
	 * @see #getFieldCreditCardDate()
	 * @generated
	 */
	void setFieldCreditCardDate(String value);

	/**
	 * Returns the value of the '<em><b>Field Credit Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Credit Card Number</em>' attribute.
	 * @see #setFieldCreditCardNumber(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldCreditCardNumber()
	 * @model annotation="mimo-ent-format type='credit-card-number'"
	 * @generated
	 */
	String getFieldCreditCardNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCreditCardNumber <em>Field Credit Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Credit Card Number</em>' attribute.
	 * @see #getFieldCreditCardNumber()
	 * @generated
	 */
	void setFieldCreditCardNumber(String value);

	/**
	 * Returns the value of the '<em><b>Field Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Currency Amount</em>' attribute.
	 * @see #setFieldCurrencyAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldCurrencyAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getFieldCurrencyAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCurrencyAmount <em>Field Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Currency Amount</em>' attribute.
	 * @see #getFieldCurrencyAmount()
	 * @generated
	 */
	void setFieldCurrencyAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Field Currency Precise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Currency Precise</em>' attribute.
	 * @see #setFieldCurrencyPrecise(BigDecimal)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldCurrencyPrecise()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getFieldCurrencyPrecise();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldCurrencyPrecise <em>Field Currency Precise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Currency Precise</em>' attribute.
	 * @see #getFieldCurrencyPrecise()
	 * @generated
	 */
	void setFieldCurrencyPrecise(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Field Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Date</em>' attribute.
	 * @see #setFieldDate(Date)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldDate()
	 * @model
	 * @generated
	 */
	Date getFieldDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDate <em>Field Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Date</em>' attribute.
	 * @see #getFieldDate()
	 * @generated
	 */
	void setFieldDate(Date value);

	/**
	 * Returns the value of the '<em><b>Field Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Date Time</em>' attribute.
	 * @see #setFieldDateTime(Date)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldDateTime()
	 * @model
	 * @generated
	 */
	Date getFieldDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDateTime <em>Field Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Date Time</em>' attribute.
	 * @see #getFieldDateTime()
	 * @generated
	 */
	void setFieldDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Field Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Description</em>' attribute.
	 * @see #setFieldDescription(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldDescription()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getFieldDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldDescription <em>Field Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Description</em>' attribute.
	 * @see #getFieldDescription()
	 * @generated
	 */
	void setFieldDescription(String value);

	/**
	 * Returns the value of the '<em><b>Field Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Email</em>' attribute.
	 * @see #setFieldEmail(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldEmail()
	 * @model annotation="mimo-ent-format type='email'"
	 * @generated
	 */
	String getFieldEmail();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldEmail <em>Field Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Email</em>' attribute.
	 * @see #getFieldEmail()
	 * @generated
	 */
	void setFieldEmail(String value);

	/**
	 * Returns the value of the '<em><b>Field Fixed Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Fixed Point</em>' attribute.
	 * @see #setFieldFixedPoint(BigDecimal)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldFixedPoint()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getFieldFixedPoint();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldFixedPoint <em>Field Fixed Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Fixed Point</em>' attribute.
	 * @see #getFieldFixedPoint()
	 * @generated
	 */
	void setFieldFixedPoint(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Field Floating Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Floating Point</em>' attribute.
	 * @see #setFieldFloatingPoint(double)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldFloatingPoint()
	 * @model
	 * @generated
	 */
	double getFieldFloatingPoint();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldFloatingPoint <em>Field Floating Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Floating Point</em>' attribute.
	 * @see #getFieldFloatingPoint()
	 * @generated
	 */
	void setFieldFloatingPoint(double value);

	/**
	 * Returns the value of the '<em><b>Field Id Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Id Long</em>' attribute.
	 * @see #setFieldIdLong(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldIdLong()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getFieldIdLong();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldIdLong <em>Field Id Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Id Long</em>' attribute.
	 * @see #getFieldIdLong()
	 * @generated
	 */
	void setFieldIdLong(String value);

	/**
	 * Returns the value of the '<em><b>Field Id Vlong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Id Vlong</em>' attribute.
	 * @see #setFieldIdVlong(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldIdVlong()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getFieldIdVlong();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldIdVlong <em>Field Id Vlong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Id Vlong</em>' attribute.
	 * @see #getFieldIdVlong()
	 * @generated
	 */
	void setFieldIdVlong(String value);

	/**
	 * Returns the value of the '<em><b>Field Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Indicator</em>' attribute.
	 * @see #setFieldIndicator(boolean)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldIndicator()
	 * @model required="true"
	 * @generated
	 */
	boolean isFieldIndicator();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#isFieldIndicator <em>Field Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Indicator</em>' attribute.
	 * @see #isFieldIndicator()
	 * @generated
	 */
	void setFieldIndicator(boolean value);

	/**
	 * Returns the value of the '<em><b>Field Long Varchar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Long Varchar</em>' attribute.
	 * @see #setFieldLongVarchar(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldLongVarchar()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getFieldLongVarchar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldLongVarchar <em>Field Long Varchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Long Varchar</em>' attribute.
	 * @see #getFieldLongVarchar()
	 * @generated
	 */
	void setFieldLongVarchar(String value);

	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Field Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Numeric</em>' attribute.
	 * @see #setFieldNumeric(long)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldNumeric()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getFieldNumeric();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldNumeric <em>Field Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Numeric</em>' attribute.
	 * @see #getFieldNumeric()
	 * @generated
	 */
	void setFieldNumeric(long value);

	/**
	 * Returns the value of the '<em><b>Field Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Object</em>' attribute.
	 * @see #setFieldObject(Object)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldObject()
	 * @model
	 * @generated
	 */
	Object getFieldObject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldObject <em>Field Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Object</em>' attribute.
	 * @see #getFieldObject()
	 * @generated
	 */
	void setFieldObject(Object value);

	/**
	 * Returns the value of the '<em><b>Field Short Varchar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Short Varchar</em>' attribute.
	 * @see #setFieldShortVarchar(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldShortVarchar()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getFieldShortVarchar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldShortVarchar <em>Field Short Varchar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Short Varchar</em>' attribute.
	 * @see #getFieldShortVarchar()
	 * @generated
	 */
	void setFieldShortVarchar(String value);

	/**
	 * Returns the value of the '<em><b>Field Tel Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Tel Number</em>' attribute.
	 * @see #setFieldTelNumber(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldTelNumber()
	 * @model annotation="mimo-ent-format type='tel-number'"
	 * @generated
	 */
	String getFieldTelNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldTelNumber <em>Field Tel Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Tel Number</em>' attribute.
	 * @see #getFieldTelNumber()
	 * @generated
	 */
	void setFieldTelNumber(String value);

	/**
	 * Returns the value of the '<em><b>Field Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Time</em>' attribute.
	 * @see #setFieldTime(Date)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldTime()
	 * @model
	 * @generated
	 */
	Date getFieldTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldTime <em>Field Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Time</em>' attribute.
	 * @see #getFieldTime()
	 * @generated
	 */
	void setFieldTime(Date value);

	/**
	 * Returns the value of the '<em><b>Field Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Url</em>' attribute.
	 * @see #setFieldUrl(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldUrl()
	 * @model annotation="mimo-ent-format type='url'"
	 * @generated
	 */
	String getFieldUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldUrl <em>Field Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Url</em>' attribute.
	 * @see #getFieldUrl()
	 * @generated
	 */
	void setFieldUrl(String value);

	/**
	 * Returns the value of the '<em><b>Field Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Value</em>' attribute.
	 * @see #setFieldValue(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldValue()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getFieldValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldValue <em>Field Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Value</em>' attribute.
	 * @see #getFieldValue()
	 * @generated
	 */
	void setFieldValue(String value);

	/**
	 * Returns the value of the '<em><b>Field Very Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Very Long</em>' attribute.
	 * @see #setFieldVeryLong(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldVeryLong()
	 * @model
	 * @generated
	 */
	String getFieldVeryLong();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldVeryLong <em>Field Very Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Very Long</em>' attribute.
	 * @see #getFieldVeryLong()
	 * @generated
	 */
	void setFieldVeryLong(String value);

	/**
	 * Returns the value of the '<em><b>Field Very Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Very Short</em>' attribute.
	 * @see #setFieldVeryShort(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestEntity_FieldVeryShort()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getFieldVeryShort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestEntity#getFieldVeryShort <em>Field Very Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Very Short</em>' attribute.
	 * @see #getFieldVeryShort()
	 * @generated
	 */
	void setFieldVeryShort(String value);

} // TestEntity
