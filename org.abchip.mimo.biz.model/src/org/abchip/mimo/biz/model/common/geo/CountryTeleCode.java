/**
 * Copyright (c) 2017, 2021 ABChip and others.
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
 * A representation of the model object '<em><b>Country Tele Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryTeleCode#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryTeleCode#getTeleCode <em>Tele Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryTeleCode()
 * @model annotation="mimo-ent-frame title='Telephone Country Code'"
 * @generated
 */
public interface CountryTeleCode extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryTeleCode_CountryCode()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryTeleCode#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

	/**
	 * Returns the value of the '<em><b>Tele Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tele Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tele Code</em>' attribute.
	 * @see #setTeleCode(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryTeleCode_TeleCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTeleCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryTeleCode#getTeleCode <em>Tele Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tele Code</em>' attribute.
	 * @see #getTeleCode()
	 * @generated
	 */
	void setTeleCode(String value);

} // CountryTeleCode
