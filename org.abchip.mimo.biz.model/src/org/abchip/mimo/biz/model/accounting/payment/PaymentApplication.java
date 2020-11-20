/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getPaymentApplicationId <em>Payment Application Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getAmountApplied <em>Amount Applied</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getBillingAccount <em>Billing Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getOverrideGlAccount <em>Override Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getPayment <em>Payment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getTaxAuthGeo <em>Tax Auth Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getToPayment <em>To Payment</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication()
 * @model
 * @generated
 */
public interface PaymentApplication extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Amount Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Applied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Applied</em>' attribute.
	 * @see #setAmountApplied(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_AmountApplied()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmountApplied();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getAmountApplied <em>Amount Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Applied</em>' attribute.
	 * @see #getAmountApplied()
	 * @generated
	 */
	void setAmountApplied(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account</em>' reference.
	 * @see #setBillingAccount(BillingAccount)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_BillingAccount()
	 * @model
	 * @generated
	 */
	BillingAccount getBillingAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getBillingAccount <em>Billing Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account</em>' reference.
	 * @see #getBillingAccount()
	 * @generated
	 */
	void setBillingAccount(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' reference.
	 * @see #setInvoice(Invoice)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_Invoice()
	 * @model
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getInvoice <em>Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice</em>' reference.
	 * @see #getInvoice()
	 * @generated
	 */
	void setInvoice(Invoice value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #setInvoiceItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_InvoiceItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 */
	void setInvoiceItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account</em>' reference.
	 * @see #setOverrideGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_OverrideGlAccount()
	 * @model annotation="mimo-ent-slot help='If filled in, payment is applied directly against this GL account'"
	 * @generated
	 */
	GlAccount getOverrideGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getOverrideGlAccount <em>Override Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account</em>' reference.
	 * @see #getOverrideGlAccount()
	 * @generated
	 */
	void setOverrideGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(Payment)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_Payment()
	 * @model
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo</em>' reference.
	 * @see #setTaxAuthGeo(Geo)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_TaxAuthGeo()
	 * @model
	 * @generated
	 */
	Geo getTaxAuthGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getTaxAuthGeo <em>Tax Auth Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo</em>' reference.
	 * @see #getTaxAuthGeo()
	 * @generated
	 */
	void setTaxAuthGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>To Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Payment</em>' reference.
	 * @see #setToPayment(Payment)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_ToPayment()
	 * @model
	 * @generated
	 */
	Payment getToPayment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getToPayment <em>To Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Payment</em>' reference.
	 * @see #getToPayment()
	 * @generated
	 */
	void setToPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Payment Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Application Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Application Id</em>' attribute.
	 * @see #setPaymentApplicationId(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentApplication_PaymentApplicationId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentApplicationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentApplication#getPaymentApplicationId <em>Payment Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Application Id</em>' attribute.
	 * @see #getPaymentApplicationId()
	 * @generated
	 */
	void setPaymentApplicationId(String value);

} // PaymentApplication
