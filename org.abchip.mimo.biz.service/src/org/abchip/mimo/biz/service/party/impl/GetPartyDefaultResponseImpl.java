/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party.impl;

import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.model.party.party.Party;

import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.party.PartyPackage;

import org.abchip.mimo.service.impl.ServiceResponseImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Party Default Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.GetPartyDefaultResponseImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.party.impl.GetPartyDefaultResponseImpl#getAccountingPreference <em>Accounting Preference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetPartyDefaultResponseImpl extends ServiceResponseImpl implements GetPartyDefaultResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetPartyDefaultResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.GET_PARTY_DEFAULT_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganization() {
		return (Party)eGet(PartyPackage.Literals.GET_PARTY_DEFAULT_RESPONSE__ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganization(Party newOrganization) {
		eSet(PartyPackage.Literals.GET_PARTY_DEFAULT_RESPONSE__ORGANIZATION, newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyAcctgPreference getAccountingPreference() {
		return (PartyAcctgPreference)eGet(PartyPackage.Literals.GET_PARTY_DEFAULT_RESPONSE__ACCOUNTING_PREFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountingPreference(PartyAcctgPreference newAccountingPreference) {
		eSet(PartyPackage.Literals.GET_PARTY_DEFAULT_RESPONSE__ACCOUNTING_PREFERENCE, newAccountingPreference);
	}

} //GetProductDefaultResponseImpl
