/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import java.math.BigDecimal;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Deduction#getDeductionId <em>Deduction Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Deduction#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Deduction#getDeductionType <em>Deduction Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.Deduction#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getDeduction()
 * @model
 * @generated
 */
public interface Deduction extends EntityTyped<DeductionType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getDeduction_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Deduction#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Deduction Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Type</em>' reference.
	 * @see #setDeductionType(DeductionType)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getDeduction_DeductionType()
	 * @model
	 * @generated
	 */
	DeductionType getDeductionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Deduction#getDeductionType <em>Deduction Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Type</em>' reference.
	 * @see #getDeductionType()
	 * @generated
	 */
	void setDeductionType(DeductionType value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(Payment)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getDeduction_Payment()
	 * @model
	 * @generated
	 */
	Payment getPayment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Deduction#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(Payment value);

	/**
	 * Returns the value of the '<em><b>Deduction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deduction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Id</em>' attribute.
	 * @see #setDeductionId(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getDeduction_DeductionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDeductionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.Deduction#getDeductionId <em>Deduction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Id</em>' attribute.
	 * @see #getDeductionId()
	 * @generated
	 */
	void setDeductionId(String value);

} // Deduction
