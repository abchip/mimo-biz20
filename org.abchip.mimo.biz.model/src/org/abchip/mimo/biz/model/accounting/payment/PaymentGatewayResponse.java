/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.order.OrderPaymentPreference;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gateway Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getAltReference <em>Alt Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayAvsResult <em>Gateway Avs Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayCode <em>Gateway Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayCvResult <em>Gateway Cv Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayFlag <em>Gateway Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayMessage <em>Gateway Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayScoreResult <em>Gateway Score Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getOrderPaymentPreference <em>Order Payment Preference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getPaymentMethodType <em>Payment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getPaymentServiceTypeEnum <em>Payment Service Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getReferenceNum <em>Reference Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getResultBadCardNumber <em>Result Bad Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getResultBadExpire <em>Result Bad Expire</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getResultDeclined <em>Result Declined</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getResultNsf <em>Result Nsf</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getTransCodeEnum <em>Trans Code Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getTransactionDate <em>Transaction Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse()
 * @model
 * @generated
 */
public interface PaymentGatewayResponse extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Alt Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Reference</em>' attribute.
	 * @see #setAltReference(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_AltReference()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAltReference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getAltReference <em>Alt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Reference</em>' attribute.
	 * @see #getAltReference()
	 * @generated
	 */
	void setAltReference(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_CurrencyUom()
	 * @model
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Gateway Avs Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Avs Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Avs Result</em>' attribute.
	 * @see #setGatewayAvsResult(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayAvsResult()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayAvsResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayAvsResult <em>Gateway Avs Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Avs Result</em>' attribute.
	 * @see #getGatewayAvsResult()
	 * @generated
	 */
	void setGatewayAvsResult(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Code</em>' attribute.
	 * @see #setGatewayCode(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayCode <em>Gateway Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Code</em>' attribute.
	 * @see #getGatewayCode()
	 * @generated
	 */
	void setGatewayCode(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Cv Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Cv Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Cv Result</em>' attribute.
	 * @see #setGatewayCvResult(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayCvResult()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayCvResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayCvResult <em>Gateway Cv Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Cv Result</em>' attribute.
	 * @see #getGatewayCvResult()
	 * @generated
	 */
	void setGatewayCvResult(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Flag</em>' attribute.
	 * @see #setGatewayFlag(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayFlag()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayFlag <em>Gateway Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Flag</em>' attribute.
	 * @see #getGatewayFlag()
	 * @generated
	 */
	void setGatewayFlag(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Message</em>' attribute.
	 * @see #setGatewayMessage(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayMessage()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getGatewayMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayMessage <em>Gateway Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Message</em>' attribute.
	 * @see #getGatewayMessage()
	 * @generated
	 */
	void setGatewayMessage(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Score Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Score Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Score Result</em>' attribute.
	 * @see #setGatewayScoreResult(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayScoreResult()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayScoreResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getGatewayScoreResult <em>Gateway Score Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Score Result</em>' attribute.
	 * @see #getGatewayScoreResult()
	 * @generated
	 */
	void setGatewayScoreResult(String value);

	/**
	 * Returns the value of the '<em><b>Order Payment Preference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Payment Preference</em>' reference.
	 * @see #setOrderPaymentPreference(OrderPaymentPreference)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_OrderPaymentPreference()
	 * @model
	 * @generated
	 */
	OrderPaymentPreference getOrderPaymentPreference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getOrderPaymentPreference <em>Order Payment Preference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Payment Preference</em>' reference.
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	void setOrderPaymentPreference(OrderPaymentPreference value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' reference.
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_PaymentMethod()
	 * @model
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getPaymentMethod <em>Payment Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method</em>' reference.
	 * @see #getPaymentMethod()
	 * @generated
	 */
	void setPaymentMethod(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type</em>' reference.
	 * @see #setPaymentMethodType(PaymentMethodType)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_PaymentMethodType()
	 * @model
	 * @generated
	 */
	PaymentMethodType getPaymentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getPaymentMethodType <em>Payment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type</em>' reference.
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	void setPaymentMethodType(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Payment Service Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Service Type Enum</em>' reference.
	 * @see #setPaymentServiceTypeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_PaymentServiceTypeEnum()
	 * @model
	 * @generated
	 */
	Enumeration getPaymentServiceTypeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getPaymentServiceTypeEnum <em>Payment Service Type Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Service Type Enum</em>' reference.
	 * @see #getPaymentServiceTypeEnum()
	 * @generated
	 */
	void setPaymentServiceTypeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Reference Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Num</em>' attribute.
	 * @see #setReferenceNum(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ReferenceNum()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getReferenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getReferenceNum <em>Reference Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Num</em>' attribute.
	 * @see #getReferenceNum()
	 * @generated
	 */
	void setReferenceNum(String value);

	/**
	 * Returns the value of the '<em><b>Result Bad Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Bad Card Number</em>' attribute.
	 * @see #setResultBadCardNumber(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ResultBadCardNumber()
	 * @model
	 * @generated
	 */
	Boolean getResultBadCardNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getResultBadCardNumber <em>Result Bad Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Bad Card Number</em>' attribute.
	 * @see #getResultBadCardNumber()
	 * @generated
	 */
	void setResultBadCardNumber(Boolean value);

	/**
	 * Returns the value of the '<em><b>Result Bad Expire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Bad Expire</em>' attribute.
	 * @see #setResultBadExpire(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ResultBadExpire()
	 * @model
	 * @generated
	 */
	Boolean getResultBadExpire();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getResultBadExpire <em>Result Bad Expire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Bad Expire</em>' attribute.
	 * @see #getResultBadExpire()
	 * @generated
	 */
	void setResultBadExpire(Boolean value);

	/**
	 * Returns the value of the '<em><b>Result Declined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Declined</em>' attribute.
	 * @see #setResultDeclined(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ResultDeclined()
	 * @model
	 * @generated
	 */
	Boolean getResultDeclined();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getResultDeclined <em>Result Declined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Declined</em>' attribute.
	 * @see #getResultDeclined()
	 * @generated
	 */
	void setResultDeclined(Boolean value);

	/**
	 * Returns the value of the '<em><b>Result Nsf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Nsf</em>' attribute.
	 * @see #setResultNsf(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ResultNsf()
	 * @model
	 * @generated
	 */
	Boolean getResultNsf();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getResultNsf <em>Result Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Nsf</em>' attribute.
	 * @see #getResultNsf()
	 * @generated
	 */
	void setResultNsf(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Reference</em>' attribute.
	 * @see #setSubReference(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_SubReference()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSubReference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getSubReference <em>Sub Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Reference</em>' attribute.
	 * @see #getSubReference()
	 * @generated
	 */
	void setSubReference(String value);

	/**
	 * Returns the value of the '<em><b>Trans Code Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Code Enum</em>' reference.
	 * @see #setTransCodeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_TransCodeEnum()
	 * @model
	 * @generated
	 */
	Enumeration getTransCodeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getTransCodeEnum <em>Trans Code Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Code Enum</em>' reference.
	 * @see #getTransCodeEnum()
	 * @generated
	 */
	void setTransCodeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date</em>' attribute.
	 * @see #setTransactionDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_TransactionDate()
	 * @model
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Gateway Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Gateway Response Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Response Id</em>' attribute.
	 * @see #setPaymentGatewayResponseId(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayResponse_PaymentGatewayResponseId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentGatewayResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayResponse#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Response Id</em>' attribute.
	 * @see #getPaymentGatewayResponseId()
	 * @generated
	 */
	void setPaymentGatewayResponseId(String value);

} // PaymentGatewayResponse
