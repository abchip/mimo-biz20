/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Gl Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getGlAccountType <em>Gl Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getGlAccount <em>Gl Account</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyGlAccount()
 * @model
 * @generated
 */
public interface PartyGlAccount extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyGlAccount_OrganizationParty()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyGlAccount_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyGlAccount_RoleType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Gl Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Type</em>' reference.
	 * @see #setGlAccountType(GlAccountType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyGlAccount_GlAccountType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GlAccountType getGlAccountType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getGlAccountType <em>Gl Account Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Type</em>' reference.
	 * @see #getGlAccountType()
	 * @generated
	 */
	void setGlAccountType(GlAccountType value);

	/**
	 * Returns the value of the '<em><b>Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account</em>' reference.
	 * @see #setGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getPartyGlAccount_GlAccount()
	 * @model
	 * @generated
	 */
	GlAccount getGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.PartyGlAccount#getGlAccount <em>Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account</em>' reference.
	 * @see #getGlAccount()
	 * @generated
	 */
	void setGlAccount(GlAccount value);

} // PartyGlAccount
