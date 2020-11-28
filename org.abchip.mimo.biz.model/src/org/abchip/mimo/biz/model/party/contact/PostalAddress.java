/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.contact;

import java.util.List;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.geo.GeoPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getAttnName <em>Attn Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getCityGeo <em>City Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getCountryGeo <em>Country Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getCountyGeo <em>County Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getDirections <em>Directions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getGeoPoint <em>Geo Point</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getHouseNumberExt <em>House Number Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getMunicipalityGeo <em>Municipality Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getPostalAddressBoundaries <em>Postal Address Boundaries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getPostalCodeExt <em>Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getPostalCodeGeo <em>Postal Code Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getStateProvinceGeo <em>State Province Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getToName <em>To Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress()
 * @model annotation="mimo-ent-frame-type contactMechType='POSTAL_ADDRESS'"
 * @generated
 */
public interface PostalAddress extends ContactMech {
	/**
	 * Returns the value of the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address1</em>' attribute.
	 * @see #setAddress1(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_Address1()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddress1();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getAddress1 <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address1</em>' attribute.
	 * @see #getAddress1()
	 * @generated
	 */
	void setAddress1(String value);

	/**
	 * Returns the value of the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address2</em>' attribute.
	 * @see #setAddress2(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_Address2()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddress2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getAddress2 <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address2</em>' attribute.
	 * @see #getAddress2()
	 * @generated
	 */
	void setAddress2(String value);

	/**
	 * Returns the value of the '<em><b>Attn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attn Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attn Name</em>' attribute.
	 * @see #setAttnName(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_AttnName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getAttnName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getAttnName <em>Attn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attn Name</em>' attribute.
	 * @see #getAttnName()
	 * @generated
	 */
	void setAttnName(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_City()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>City Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Geo</em>' reference.
	 * @see #setCityGeo(Geo)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_CityGeo()
	 * @model
	 * @generated
	 */
	Geo getCityGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getCityGeo <em>City Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Geo</em>' reference.
	 * @see #getCityGeo()
	 * @generated
	 */
	void setCityGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Country Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Geo</em>' reference.
	 * @see #setCountryGeo(Geo)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_CountryGeo()
	 * @model
	 * @generated
	 */
	Geo getCountryGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getCountryGeo <em>Country Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Geo</em>' reference.
	 * @see #getCountryGeo()
	 * @generated
	 */
	void setCountryGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>County Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Geo</em>' reference.
	 * @see #setCountyGeo(Geo)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_CountyGeo()
	 * @model
	 * @generated
	 */
	Geo getCountyGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getCountyGeo <em>County Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Geo</em>' reference.
	 * @see #getCountyGeo()
	 * @generated
	 */
	void setCountyGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directions</em>' attribute.
	 * @see #setDirections(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_Directions()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDirections();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getDirections <em>Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directions</em>' attribute.
	 * @see #getDirections()
	 * @generated
	 */
	void setDirections(String value);

	/**
	 * Returns the value of the '<em><b>Geo Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point</em>' reference.
	 * @see #setGeoPoint(GeoPoint)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_GeoPoint()
	 * @model
	 * @generated
	 */
	GeoPoint getGeoPoint();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getGeoPoint <em>Geo Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point</em>' reference.
	 * @see #getGeoPoint()
	 * @generated
	 */
	void setGeoPoint(GeoPoint value);

	/**
	 * Returns the value of the '<em><b>House Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Number</em>' attribute.
	 * @see #setHouseNumber(long)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_HouseNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getHouseNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getHouseNumber <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House Number</em>' attribute.
	 * @see #getHouseNumber()
	 * @generated
	 */
	void setHouseNumber(long value);

	/**
	 * Returns the value of the '<em><b>House Number Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House Number Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Number Ext</em>' attribute.
	 * @see #setHouseNumberExt(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_HouseNumberExt()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getHouseNumberExt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getHouseNumberExt <em>House Number Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House Number Ext</em>' attribute.
	 * @see #getHouseNumberExt()
	 * @generated
	 */
	void setHouseNumberExt(String value);

	/**
	 * Returns the value of the '<em><b>Municipality Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Municipality Geo</em>' reference.
	 * @see #setMunicipalityGeo(Geo)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_MunicipalityGeo()
	 * @model
	 * @generated
	 */
	Geo getMunicipalityGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getMunicipalityGeo <em>Municipality Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Municipality Geo</em>' reference.
	 * @see #getMunicipalityGeo()
	 * @generated
	 */
	void setMunicipalityGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Postal Address Boundaries</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.contact.PostalAddressBoundary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Address Boundaries</em>' reference list.
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_PostalAddressBoundaries()
	 * @model derived="true"
	 * @generated
	 */
	List<PostalAddressBoundary> getPostalAddressBoundaries();

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_PostalCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code Ext</em>' attribute.
	 * @see #setPostalCodeExt(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_PostalCodeExt()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getPostalCodeExt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getPostalCodeExt <em>Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code Ext</em>' attribute.
	 * @see #getPostalCodeExt()
	 * @generated
	 */
	void setPostalCodeExt(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code Geo</em>' reference.
	 * @see #setPostalCodeGeo(Geo)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_PostalCodeGeo()
	 * @model
	 * @generated
	 */
	Geo getPostalCodeGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getPostalCodeGeo <em>Postal Code Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code Geo</em>' reference.
	 * @see #getPostalCodeGeo()
	 * @generated
	 */
	void setPostalCodeGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>State Province Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Province Geo</em>' reference.
	 * @see #setStateProvinceGeo(Geo)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_StateProvinceGeo()
	 * @model
	 * @generated
	 */
	Geo getStateProvinceGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getStateProvinceGeo <em>State Province Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Province Geo</em>' reference.
	 * @see #getStateProvinceGeo()
	 * @generated
	 */
	void setStateProvinceGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Name</em>' attribute.
	 * @see #setToName(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddress_ToName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getToName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddress#getToName <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Name</em>' attribute.
	 * @see #getToName()
	 * @generated
	 */
	void setToName(String value);

} // PostalAddress
