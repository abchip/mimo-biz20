/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.finaccount;

import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin Account Type Gl Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getFinAccountType <em>Fin Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getGlAccount <em>Gl Account</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTypeGlAccount()
 * @model annotation="mimo-ent-frame title='Financial Account Type GL Account'"
 * @generated
 */
public interface FinAccountTypeGlAccount extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Fin Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Type</em>' reference.
	 * @see #setFinAccountType(FinAccountType)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTypeGlAccount_FinAccountType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FinAccountType getFinAccountType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getFinAccountType <em>Fin Account Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Type</em>' reference.
	 * @see #getFinAccountType()
	 * @generated
	 */
	void setFinAccountType(FinAccountType value);

	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTypeGlAccount_OrganizationParty()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account</em>' reference.
	 * @see #setGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTypeGlAccount_GlAccount()
	 * @model
	 * @generated
	 */
	GlAccount getGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getGlAccount <em>Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account</em>' reference.
	 * @see #getGlAccount()
	 * @generated
	 */
	void setGlAccount(GlAccount value);

} // FinAccountTypeGlAccount
