/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.geo;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Capital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryCapital#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryCapital#getCountryCapital <em>Country Capital</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryCapital()
 * @model
 * @generated
 */
public interface CountryCapital extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryCapital_CountryCode()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryCapital#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

	/**
	 * Returns the value of the '<em><b>Country Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Capital</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Capital</em>' attribute.
	 * @see #setCountryCapital(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryCapital_CountryCapital()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getCountryCapital();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryCapital#getCountryCapital <em>Country Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Capital</em>' attribute.
	 * @see #getCountryCapital()
	 * @generated
	 */
	void setCountryCapital(String value);

} // CountryCapital
