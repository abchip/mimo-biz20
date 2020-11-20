/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import java.math.BigDecimal;
import java.util.List;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.agreement.TermType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billing Account Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getBillingAccountTermId <em>Billing Account Term Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getBillingAccount <em>Billing Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getBillingAccountTermAttrs <em>Billing Account Term Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getTermDays <em>Term Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getTermType <em>Term Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getTermValue <em>Term Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getBillingAccountTerm()
 * @model
 * @generated
 */
public interface BillingAccountTerm extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Days</em>' attribute.
	 * @see #setTermDays(long)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getBillingAccountTerm_TermDays()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTermDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getTermDays <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Days</em>' attribute.
	 * @see #getTermDays()
	 * @generated
	 */
	void setTermDays(long value);

	/**
	 * Returns the value of the '<em><b>Term Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Type</em>' reference.
	 * @see #setTermType(TermType)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getBillingAccountTerm_TermType()
	 * @model
	 * @generated
	 */
	TermType getTermType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getTermType <em>Term Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Type</em>' reference.
	 * @see #getTermType()
	 * @generated
	 */
	void setTermType(TermType value);

	/**
	 * Returns the value of the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Value</em>' attribute.
	 * @see #setTermValue(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getBillingAccountTerm_TermValue()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getTermValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getTermValue <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Value</em>' attribute.
	 * @see #getTermValue()
	 * @generated
	 */
	void setTermValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' reference.
	 * @see #setUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getBillingAccountTerm_Uom()
	 * @model
	 * @generated
	 */
	Uom getUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getUom <em>Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' reference.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Billing Account Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Term Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Term Id</em>' attribute.
	 * @see #setBillingAccountTermId(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getBillingAccountTerm_BillingAccountTermId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBillingAccountTermId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getBillingAccountTermId <em>Billing Account Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Term Id</em>' attribute.
	 * @see #getBillingAccountTermId()
	 * @generated
	 */
	void setBillingAccountTermId(String value);

	/**
	 * Returns the value of the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account</em>' reference.
	 * @see #setBillingAccount(BillingAccount)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getBillingAccountTerm_BillingAccount()
	 * @model
	 * @generated
	 */
	BillingAccount getBillingAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTerm#getBillingAccount <em>Billing Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account</em>' reference.
	 * @see #getBillingAccount()
	 * @generated
	 */
	void setBillingAccount(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Billing Account Term Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.payment.BillingAccountTermAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Term Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getBillingAccountTerm_BillingAccountTermAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<BillingAccountTermAttr> getBillingAccountTermAttrs();

} // BillingAccountTerm
