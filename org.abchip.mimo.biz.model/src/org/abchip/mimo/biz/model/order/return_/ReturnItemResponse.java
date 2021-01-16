/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.model.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.model.accounting.payment.Payment;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.order.OrderPaymentPreference;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getReturnItemResponseId <em>Return Item Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getBillingAccount <em>Billing Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getFinAccountTrans <em>Fin Account Trans</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getOrderPaymentPreference <em>Order Payment Preference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getReplacementOrder <em>Replacement Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getResponseAmount <em>Response Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getResponseDate <em>Response Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse()
 * @model annotation="mimo-ent-frame help='Records what was done with a return: whether a replacement order, a payment, or a billing account credit was issued' title='The Return Item Response'"
 * @generated
 */
public interface ReturnItemResponse extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Response Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Amount</em>' attribute.
	 * @see #setResponseAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse_ResponseAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getResponseAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getResponseAmount <em>Response Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Amount</em>' attribute.
	 * @see #getResponseAmount()
	 * @generated
	 */
	void setResponseAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Date</em>' attribute.
	 * @see #setResponseDate(Date)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse_ResponseDate()
	 * @model
	 * @generated
	 */
	Date getResponseDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getResponseDate <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Date</em>' attribute.
	 * @see #getResponseDate()
	 * @generated
	 */
	void setResponseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Return Item Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Response Id</em>' attribute.
	 * @see #setReturnItemResponseId(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse_ReturnItemResponseId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getReturnItemResponseId <em>Return Item Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Response Id</em>' attribute.
	 * @see #getReturnItemResponseId()
	 * @generated
	 */
	void setReturnItemResponseId(String value);

	/**
	 * Returns the value of the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account</em>' reference.
	 * @see #setBillingAccount(BillingAccount)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse_BillingAccount()
	 * @model
	 * @generated
	 */
	BillingAccount getBillingAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getBillingAccount <em>Billing Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account</em>' reference.
	 * @see #getBillingAccount()
	 * @generated
	 */
	void setBillingAccount(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans</em>' reference.
	 * @see #setFinAccountTrans(FinAccountTrans)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse_FinAccountTrans()
	 * @model
	 * @generated
	 */
	FinAccountTrans getFinAccountTrans();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getFinAccountTrans <em>Fin Account Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans</em>' reference.
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	void setFinAccountTrans(FinAccountTrans value);

	/**
	 * Returns the value of the '<em><b>Order Payment Preference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Payment Preference</em>' reference.
	 * @see #setOrderPaymentPreference(OrderPaymentPreference)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse_OrderPaymentPreference()
	 * @model
	 * @generated
	 */
	OrderPaymentPreference getOrderPaymentPreference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getOrderPaymentPreference <em>Order Payment Preference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Payment Preference</em>' reference.
	 * @see #getOrderPaymentPreference()
	 * @generated
	 */
	void setOrderPaymentPreference(OrderPaymentPreference value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(Payment)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse_Payment()
	 * @model
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Replacement Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Order</em>' reference.
	 * @see #setReplacementOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemResponse_ReplacementOrder()
	 * @model
	 * @generated
	 */
	OrderHeader getReplacementOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemResponse#getReplacementOrder <em>Replacement Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Order</em>' reference.
	 * @see #getReplacementOrder()
	 * @generated
	 */
	void setReplacementOrder(OrderHeader value);

} // ReturnItemResponse
