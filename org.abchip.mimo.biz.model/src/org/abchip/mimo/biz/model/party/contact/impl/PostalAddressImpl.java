/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.contact.impl;

import java.util.List;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.geo.GeoPoint;
import org.abchip.mimo.biz.model.party.contact.ContactPackage;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.contact.PostalAddressBoundary;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getAttnName <em>Attn Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getCityGeo <em>City Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getCountryGeo <em>Country Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getCountyGeo <em>County Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getDirections <em>Directions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getGeoPoint <em>Geo Point</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getHouseNumberExt <em>House Number Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getMunicipalityGeo <em>Municipality Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getPostalAddressBoundaries <em>Postal Address Boundaries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getPostalCodeExt <em>Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getPostalCodeGeo <em>Postal Code Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getStateProvinceGeo <em>State Province Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.PostalAddressImpl#getToName <em>To Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalAddressImpl extends ContactMechImpl implements PostalAddress {
                  
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.POSTAL_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress1() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__ADDRESS1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress1(String newAddress1) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__ADDRESS1, newAddress1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress2() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__ADDRESS2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress2(String newAddress2) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__ADDRESS2, newAddress2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttnName() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__ATTN_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttnName(String newAttnName) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__ATTN_NAME, newAttnName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCityGeo() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__CITY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityGeo(Geo newCityGeo) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__CITY_GEO, newCityGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCountryGeo() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__COUNTRY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryGeo(Geo newCountryGeo) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__COUNTRY_GEO, newCountryGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCountyGeo() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__COUNTY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyGeo(Geo newCountyGeo) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__COUNTY_GEO, newCountyGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirections() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__DIRECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirections(String newDirections) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__DIRECTIONS, newDirections);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoPoint getGeoPoint() {
		return (GeoPoint)eGet(ContactPackage.Literals.POSTAL_ADDRESS__GEO_POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPoint(GeoPoint newGeoPoint) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__GEO_POINT, newGeoPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getHouseNumber() {
		return (Long)eGet(ContactPackage.Literals.POSTAL_ADDRESS__HOUSE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHouseNumber(long newHouseNumber) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__HOUSE_NUMBER, newHouseNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHouseNumberExt() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__HOUSE_NUMBER_EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHouseNumberExt(String newHouseNumberExt) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__HOUSE_NUMBER_EXT, newHouseNumberExt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getMunicipalityGeo() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__MUNICIPALITY_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMunicipalityGeo(Geo newMunicipalityGeo) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__MUNICIPALITY_GEO, newMunicipalityGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PostalAddressBoundary> getPostalAddressBoundaries() {
		return (List<PostalAddressBoundary>)eGet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE, newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCodeExt() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE_EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeExt(String newPostalCodeExt) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE_EXT, newPostalCodeExt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getPostalCodeGeo() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeGeo(Geo newPostalCodeGeo) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE_GEO, newPostalCodeGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getStateProvinceGeo() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__STATE_PROVINCE_GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateProvinceGeo(Geo newStateProvinceGeo) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__STATE_PROVINCE_GEO, newStateProvinceGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToName() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__TO_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToName(String newToName) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__TO_NAME, newToName);
	}

} //PostalAddressImpl
