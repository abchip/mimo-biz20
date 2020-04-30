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
import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.service.party.PartyPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Get
 * Party Default Default</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetPartyDefaultImpl extends BizServiceRequestImpl<GetPartyDefaultResponse> implements GetPartyDefault {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GetPartyDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.GET_PARTY_DEFAULT;
	}

	@Override
	public GetPartyDefaultResponse call() throws Exception {

		GetPartyDefaultResponse response = this.buildResponse();

		// party
		SystemProperty currencyProp = getContext().createProxy(SystemProperty.class, "general/ORGANIZATION_PARTY", this.getTenant());
		response.setOrganization(this.getContext().createProxy(Party.class, currencyProp.getSystemPropertyValue(), this.getTenant()));

		// accounting preference
		PartyAcctgPreference accountingPreference = getContext().createProxy(PartyAcctgPreference.class, response.getOrganization().getID(), this.getTenant());
		response.setAccountingPreference(accountingPreference);

		return response;
	}

} // GetProductDefaultImpl
