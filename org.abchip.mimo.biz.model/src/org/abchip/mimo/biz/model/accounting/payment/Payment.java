/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getActualCurrencyAmount <em>Actual Currency Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getActualCurrencyUom <em>Actual Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getFinAccountTrans <em>Fin Account Trans</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getOverrideGlAccount <em>Override Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentAttributes <em>Payment Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentGatewayResponse <em>Payment Gateway Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentMethodType <em>Payment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentPreference <em>Payment Preference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentRefNum <em>Payment Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentType <em>Payment Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EntityTyped<PaymentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Actual Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Currency Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Currency Amount</em>' attribute.
	 * @see #setActualCurrencyAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_ActualCurrencyAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualCurrencyAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getActualCurrencyAmount <em>Actual Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Currency Amount</em>' attribute.
	 * @see #getActualCurrencyAmount()
	 * @generated
	 */
	void setActualCurrencyAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Currency Uom</em>' reference.
	 * @see #setActualCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_ActualCurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getActualCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getActualCurrencyUom <em>Actual Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Currency Uom</em>' reference.
	 * @see #getActualCurrencyUom()
	 * @generated
	 */
	void setActualCurrencyUom(Uom value);

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
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_EffectiveDate()
	 * @model
	 * @generated
	 */
	Date getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans</em>' reference.
	 * @see #setFinAccountTrans(FinAccountTrans)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_FinAccountTrans()
	 * @model keys="finAccountTransId"
	 * @generated
	 */
	FinAccountTrans getFinAccountTrans();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getFinAccountTrans <em>Fin Account Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans</em>' reference.
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	void setFinAccountTrans(FinAccountTrans value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account</em>' reference.
	 * @see #setOverrideGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_OverrideGlAccount()
	 * @model keys="glAccountId"
	 * @generated
	 */
	GlAccount getOverrideGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getOverrideGlAccount <em>Override Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account</em>' reference.
	 * @see #getOverrideGlAccount()
	 * @generated
	 */
	void setOverrideGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PartyIdFrom()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' reference.
	 * @see #setPartyIdTo(Party)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PartyIdTo()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPartyIdTo <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' reference.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(Party value);

	/**
	 * Returns the value of the '<em><b>Payment Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.payment.PaymentAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PaymentAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<PaymentAttribute> getPaymentAttributes();

	/**
	 * Returns the value of the '<em><b>Payment Gateway Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Response</em>' reference.
	 * @see #setPaymentGatewayResponse(PaymentGatewayResponse)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PaymentGatewayResponse()
	 * @model keys="paymentGatewayResponseId"
	 * @generated
	 */
	PaymentGatewayResponse getPaymentGatewayResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentGatewayResponse <em>Payment Gateway Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Response</em>' reference.
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	void setPaymentGatewayResponse(PaymentGatewayResponse value);

	/**
	 * Returns the value of the '<em><b>Payment Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method</em>' reference.
	 * @see #setPaymentMethod(PaymentMethod)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PaymentMethod()
	 * @model keys="paymentMethodId"
	 * @generated
	 */
	PaymentMethod getPaymentMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentMethod <em>Payment Method</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PaymentMethodType()
	 * @model keys="paymentMethodTypeId"
	 * @generated
	 */
	PaymentMethodType getPaymentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentMethodType <em>Payment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type</em>' reference.
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	void setPaymentMethodType(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Payment Preference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Preference</em>' reference.
	 * @see #setPaymentPreference(OrderPaymentPreference)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PaymentPreference()
	 * @model keys="orderPaymentPreferenceId"
	 * @generated
	 */
	OrderPaymentPreference getPaymentPreference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentPreference <em>Payment Preference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Preference</em>' reference.
	 * @see #getPaymentPreference()
	 * @generated
	 */
	void setPaymentPreference(OrderPaymentPreference value);

	/**
	 * Returns the value of the '<em><b>Payment Ref Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Ref Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Ref Num</em>' attribute.
	 * @see #setPaymentRefNum(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PaymentRefNum()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getPaymentRefNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentRefNum <em>Payment Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Ref Num</em>' attribute.
	 * @see #getPaymentRefNum()
	 * @generated
	 */
	void setPaymentRefNum(String value);

	/**
	 * Returns the value of the '<em><b>Payment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type</em>' reference.
	 * @see #setPaymentType(PaymentType)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PaymentType()
	 * @model keys="paymentTypeId"
	 * @generated
	 */
	PaymentType getPaymentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentType <em>Payment Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type</em>' reference.
	 * @see #getPaymentType()
	 * @generated
	 */
	void setPaymentType(PaymentType value);

	/**
	 * Returns the value of the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id To</em>' reference.
	 * @see #setRoleTypeIdTo(RoleType)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_RoleTypeIdTo()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getRoleTypeIdTo <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id To</em>' reference.
	 * @see #getRoleTypeIdTo()
	 * @generated
	 */
	void setRoleTypeIdTo(RoleType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' attribute.
	 * @see #setPaymentId(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPayment_PaymentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Payment#getPaymentId <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' attribute.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(String value);

} // Payment
