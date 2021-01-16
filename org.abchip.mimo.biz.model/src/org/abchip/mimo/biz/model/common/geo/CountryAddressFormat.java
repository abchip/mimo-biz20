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
 * A representation of the model object '<em><b>Country Address Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getAddressFormat <em>Address Format</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getGeoAssocType <em>Geo Assoc Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getHasPostalCodeExt <em>Has Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getPostalCodeRegex <em>Postal Code Regex</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getRequirePostalCode <em>Require Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getRequirePostalCodeExt <em>Require Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getRequireStateProvinceId <em>Require State Province Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat()
 * @model annotation="mimo-ent-frame dictionary='CommonEntityLabels'"
 * @generated
 */
public interface CountryAddressFormat extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Address Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Format</em>' attribute.
	 * @see #setAddressFormat(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat_AddressFormat()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddressFormat();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getAddressFormat <em>Address Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Format</em>' attribute.
	 * @see #getAddressFormat()
	 * @generated
	 */
	void setAddressFormat(String value);

	/**
	 * Returns the value of the '<em><b>Geo Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Assoc Type</em>' reference.
	 * @see #setGeoAssocType(GeoAssocType)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat_GeoAssocType()
	 * @model
	 * @generated
	 */
	GeoAssocType getGeoAssocType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getGeoAssocType <em>Geo Assoc Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Assoc Type</em>' reference.
	 * @see #getGeoAssocType()
	 * @generated
	 */
	void setGeoAssocType(GeoAssocType value);

	/**
	 * Returns the value of the '<em><b>Postal Code Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code Regex</em>' attribute.
	 * @see #setPostalCodeRegex(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat_PostalCodeRegex()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPostalCodeRegex();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getPostalCodeRegex <em>Postal Code Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code Regex</em>' attribute.
	 * @see #getPostalCodeRegex()
	 * @generated
	 */
	void setPostalCodeRegex(String value);

	/**
	 * Returns the value of the '<em><b>Require Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Postal Code</em>' attribute.
	 * @see #setRequirePostalCode(Boolean)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat_RequirePostalCode()
	 * @model
	 * @generated
	 */
	Boolean getRequirePostalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getRequirePostalCode <em>Require Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Postal Code</em>' attribute.
	 * @see #getRequirePostalCode()
	 * @generated
	 */
	void setRequirePostalCode(Boolean value);

	/**
	 * Returns the value of the '<em><b>Require Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Postal Code Ext</em>' attribute.
	 * @see #setRequirePostalCodeExt(Boolean)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat_RequirePostalCodeExt()
	 * @model
	 * @generated
	 */
	Boolean getRequirePostalCodeExt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getRequirePostalCodeExt <em>Require Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Postal Code Ext</em>' attribute.
	 * @see #getRequirePostalCodeExt()
	 * @generated
	 */
	void setRequirePostalCodeExt(Boolean value);

	/**
	 * Returns the value of the '<em><b>Require State Province Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require State Province Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require State Province Id</em>' attribute.
	 * @see #setRequireStateProvinceId(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat_RequireStateProvinceId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRequireStateProvinceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getRequireStateProvinceId <em>Require State Province Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require State Province Id</em>' attribute.
	 * @see #getRequireStateProvinceId()
	 * @generated
	 */
	void setRequireStateProvinceId(String value);

	/**
	 * Returns the value of the '<em><b>Has Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Postal Code Ext</em>' attribute.
	 * @see #setHasPostalCodeExt(Boolean)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat_HasPostalCodeExt()
	 * @model
	 * @generated
	 */
	Boolean getHasPostalCodeExt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getHasPostalCodeExt <em>Has Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Postal Code Ext</em>' attribute.
	 * @see #getHasPostalCodeExt()
	 * @generated
	 */
	void setHasPostalCodeExt(Boolean value);

	/**
	 * Returns the value of the '<em><b>Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' attribute.
	 * @see #setGeoId(String)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getCountryAddressFormat_GeoId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.CountryAddressFormat#getGeoId <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' attribute.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(String value);

} // CountryAddressFormat
