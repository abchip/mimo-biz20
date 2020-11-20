/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import org.abchip.mimo.biz.model.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gl Account Type Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGlAccountTypeMap#getPaymentType <em>Payment Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGlAccountTypeMap#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGlAccountTypeMap#getGlAccountType <em>Gl Account Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGlAccountTypeMap()
 * @model annotation="mimo-ent-frame title='Maps PaymentTypes to GlAccountTypes, allowing user to configure payments and gl accounts'"
 * @generated
 */
public interface PaymentGlAccountTypeMap extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Payment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type</em>' reference.
	 * @see #setPaymentType(PaymentType)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGlAccountTypeMap_PaymentType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PaymentType getPaymentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGlAccountTypeMap#getPaymentType <em>Payment Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type</em>' reference.
	 * @see #getPaymentType()
	 * @generated
	 */
	void setPaymentType(PaymentType value);

	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGlAccountTypeMap_OrganizationParty()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGlAccountTypeMap#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Gl Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Type</em>' reference.
	 * @see #setGlAccountType(GlAccountType)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGlAccountTypeMap_GlAccountType()
	 * @model
	 * @generated
	 */
	GlAccountType getGlAccountType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGlAccountTypeMap#getGlAccountType <em>Gl Account Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Type</em>' reference.
	 * @see #getGlAccountType()
	 * @generated
	 */
	void setGlAccountType(GlAccountType value);

} // PaymentGlAccountTypeMap
