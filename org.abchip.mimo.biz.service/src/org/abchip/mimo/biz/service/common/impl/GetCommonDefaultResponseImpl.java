/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.common.impl;

import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.service.common.CommonPackage;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;

import org.abchip.mimo.service.impl.ServiceResponseImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Common Default Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.common.impl.GetCommonDefaultResponseImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.common.impl.GetCommonDefaultResponseImpl#getCountryGeo <em>Country Geo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetCommonDefaultResponseImpl extends ServiceResponseImpl implements GetCommonDefaultResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetCommonDefaultResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.GET_COMMON_DEFAULT_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 4;

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
	public Uom getCurrencyUom() {
		return (Uom)eGet(CommonPackage.Literals.GET_COMMON_DEFAULT_RESPONSE__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(CommonPackage.Literals.GET_COMMON_DEFAULT_RESPONSE__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCountryGeo() {
		return (Geo)eGet(CommonPackage.Literals.GET_COMMON_DEFAULT_RESPONSE__COUNTRY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryGeo(Geo newCountryGeo) {
		eSet(CommonPackage.Literals.GET_COMMON_DEFAULT_RESPONSE__COUNTRY_GEO, newCountryGeo);
	}

} //GetCommonDefaultResponseImpl
