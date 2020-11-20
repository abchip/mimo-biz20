/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Account Group Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupMember#getGlAccount <em>Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupMember#getGlAccountGroupType <em>Gl Account Group Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupMember#getGlAccountGroup <em>Gl Account Group</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountGroupMember()
 * @model annotation="mimo-ent-frame title='General Ledger Account Group Member'"
 * @generated
 */
public interface GlAccountGroupMember extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account</em>' reference.
	 * @see #setGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountGroupMember_GlAccount()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GlAccount getGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupMember#getGlAccount <em>Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account</em>' reference.
	 * @see #getGlAccount()
	 * @generated
	 */
	void setGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Gl Account Group Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Group Type</em>' reference.
	 * @see #setGlAccountGroupType(GlAccountGroupType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountGroupMember_GlAccountGroupType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GlAccountGroupType getGlAccountGroupType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupMember#getGlAccountGroupType <em>Gl Account Group Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Group Type</em>' reference.
	 * @see #getGlAccountGroupType()
	 * @generated
	 */
	void setGlAccountGroupType(GlAccountGroupType value);

	/**
	 * Returns the value of the '<em><b>Gl Account Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Group</em>' reference.
	 * @see #setGlAccountGroup(GlAccountGroup)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountGroupMember_GlAccountGroup()
	 * @model
	 * @generated
	 */
	GlAccountGroup getGlAccountGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupMember#getGlAccountGroup <em>Gl Account Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Group</em>' reference.
	 * @see #getGlAccountGroup()
	 * @generated
	 */
	void setGlAccountGroup(GlAccountGroup value);

} // GlAccountGroupMember
