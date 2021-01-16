/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.common;

import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Common Default Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.common.GetCommonDefaultResponse#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.common.GetCommonDefaultResponse#getCountryGeo <em>Country Geo</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.common.CommonPackage#getGetCommonDefaultResponse()
 * @model
 * @generated
 */
public interface GetCommonDefaultResponse extends ServiceResponse {

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.service.common.CommonPackage#getGetCommonDefaultResponse_CurrencyUom()
	 * @model required="true"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.common.GetCommonDefaultResponse#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Country Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Geo</em>' reference.
	 * @see #setCountryGeo(Geo)
	 * @see org.abchip.mimo.biz.service.common.CommonPackage#getGetCommonDefaultResponse_CountryGeo()
	 * @model required="true"
	 * @generated
	 */
	Geo getCountryGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.common.GetCommonDefaultResponse#getCountryGeo <em>Country Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Geo</em>' reference.
	 * @see #getCountryGeo()
	 * @generated
	 */
	void setCountryGeo(Geo value);
} // GetCommonDefaultResponse
