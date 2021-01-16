/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party;

import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.model.party.party.Party;

import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Party Default Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.party.GetPartyDefaultResponse#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.GetPartyDefaultResponse#getAccountingPreference <em>Accounting Preference</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.party.PartyPackage#getGetPartyDefaultResponse()
 * @model
 * @generated
 */
public interface GetPartyDefaultResponse extends ServiceResponse {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Party)
	 * @see org.abchip.mimo.biz.service.party.PartyPackage#getGetPartyDefaultResponse_Organization()
	 * @model required="true"
	 * @generated
	 */
	Party getOrganization();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.party.GetPartyDefaultResponse#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Party value);

	/**
	 * Returns the value of the '<em><b>Accounting Preference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Preference</em>' reference.
	 * @see #setAccountingPreference(PartyAcctgPreference)
	 * @see org.abchip.mimo.biz.service.party.PartyPackage#getGetPartyDefaultResponse_AccountingPreference()
	 * @model required="true"
	 * @generated
	 */
	PartyAcctgPreference getAccountingPreference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.party.GetPartyDefaultResponse#getAccountingPreference <em>Accounting Preference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Preference</em>' reference.
	 * @see #getAccountingPreference()
	 * @generated
	 */
	void setAccountingPreference(PartyAcctgPreference value);

} // GetPartyDefaultResponse
