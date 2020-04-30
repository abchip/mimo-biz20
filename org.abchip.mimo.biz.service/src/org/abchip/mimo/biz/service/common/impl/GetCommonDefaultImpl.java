/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.common.impl;

import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.property.SystemProperty;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.service.common.CommonPackage;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;
import org.abchip.mimo.resource.ResourceException;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Get
 * Common Default</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetCommonDefaultImpl extends BizServiceRequestImpl<GetCommonDefaultResponse> implements GetCommonDefault {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GetCommonDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.GET_COMMON_DEFAULT;
	}

	@Override
	public GetCommonDefaultResponse call() throws ResourceException {

		GetCommonDefaultResponse response = this.buildResponse();

		// currency
		SystemProperty currencyProp = getContext().getFrame(SystemProperty.class).createProxy("general/currency.uom.id.default", this.getTenant());
		response.setCurrencyUom(this.getContext().getFrame(Uom.class).createProxy(currencyProp.getSystemPropertyValue(), this.getTenant()));

		// country
		SystemProperty countryProp = getContext().getFrame(SystemProperty.class).createProxy("general/country.geo.id.default", this.getTenant());
		response.setCountryGeo(this.getContext().getFrame(Geo.class).createProxy(countryProp.getSystemPropertyValue(), this.getTenant()));

		return response;
	}

} // GetCommonDefaultImpl
