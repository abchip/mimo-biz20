/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.party.impl;

import org.abchip.mimo.biz.model.accounting.ledger.PartyAcctgPreference;
import org.abchip.mimo.biz.model.common.property.SystemProperty;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.party.PartyPackage;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Get
 * Party Default Default</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetPartyDefaultImpl extends ServiceRequestImpl<GetPartyDefaultResponse> implements GetPartyDefault {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GetPartyDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.GET_PARTY_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	@Override
	public GetPartyDefaultResponse call() throws Exception {

		GetPartyDefaultResponse response = this.buildResponse();

		// party
		SystemProperty currencyProp = getContext().createProxy(SystemProperty.class, "general/ORGANIZATION_PARTY");
		response.setOrganization(this.getContext().createProxy(Party.class, currencyProp.getSystemPropertyValue()));

		// accounting preference
		PartyAcctgPreference accountingPreference = getContext().createProxy(PartyAcctgPreference.class, response.getOrganization().getID());
		response.setAccountingPreference(accountingPreference);

		return response;
	}

} // GetProductDefaultImpl
