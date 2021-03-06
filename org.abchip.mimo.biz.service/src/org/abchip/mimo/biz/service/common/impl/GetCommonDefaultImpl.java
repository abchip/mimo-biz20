/**
 * Copyright (c) 2017, 2021 ABChip and others.
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
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Get
 * Common Default</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetCommonDefaultImpl extends ServiceRequestImpl<GetCommonDefaultResponse> implements GetCommonDefault {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GetCommonDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.GET_COMMON_DEFAULT;
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
	public GetCommonDefaultResponse call() throws Exception {

		GetCommonDefaultResponse response = this.buildResponse();

		// currency
		SystemProperty currencyProp = getContext().createProxy(SystemProperty.class, "general/currency.uom.id.default");
		response.setCurrencyUom(getContext().createProxy(Uom.class, currencyProp.getSystemPropertyValue()));

		// country
		SystemProperty countryProp = getContext().createProxy(SystemProperty.class, "general/country.geo.id.default");
		response.setCountryGeo(getContext().createProxy(Geo.class, countryProp.getSystemPropertyValue()));

		return response;
	}

} // GetCommonDefaultImpl
