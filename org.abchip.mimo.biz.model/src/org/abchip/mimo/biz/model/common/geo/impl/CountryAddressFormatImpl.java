/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.geo.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.geo.CountryAddressFormat;
import org.abchip.mimo.biz.model.common.geo.GeoAssocType;
import org.abchip.mimo.biz.model.common.geo.GeoPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Address Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getAddressFormat <em>Address Format</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getHasPostalCodeExt <em>Has Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getPostalCodeRegex <em>Postal Code Regex</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getRequirePostalCode <em>Require Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getRequirePostalCodeExt <em>Require Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.impl.CountryAddressFormatImpl#getRequireStateProvinceId <em>Require State Province Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryAddressFormatImpl extends EntityIdentifiableImpl implements CountryAddressFormat {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryAddressFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddressFormat() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressFormat(String newAddressFormat) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT, newAddressFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCodeRegex() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeRegex(String newPostalCodeRegex) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX, newPostalCodeRegex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequirePostalCode() {
		return (Boolean)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePostalCode(Boolean newRequirePostalCode) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE, newRequirePostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequirePostalCodeExt() {
		return (Boolean)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePostalCodeExt(Boolean newRequirePostalCodeExt) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT, newRequirePostalCodeExt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequireStateProvinceId() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireStateProvinceId(String newRequireStateProvinceId) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID, newRequireStateProvinceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case GeoPackage.COUNTRY_ADDRESS_FORMAT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case GeoPackage.COUNTRY_ADDRESS_FORMAT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case GeoPackage.COUNTRY_ADDRESS_FORMAT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case GeoPackage.COUNTRY_ADDRESS_FORMAT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return GeoPackage.COUNTRY_ADDRESS_FORMAT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return GeoPackage.COUNTRY_ADDRESS_FORMAT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return GeoPackage.COUNTRY_ADDRESS_FORMAT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return GeoPackage.COUNTRY_ADDRESS_FORMAT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoAssocType getGeoAssocTypeId() {
		return (GeoAssocType)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoAssocTypeId(GeoAssocType newGeoAssocTypeId) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID, newGeoAssocTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasPostalCodeExt() {
		return (Boolean)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasPostalCodeExt(Boolean newHasPostalCodeExt) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT, newHasPostalCodeExt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoId() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(String newGeoId) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__GEO_ID, newGeoId);
	}

} //CountryAddressFormatImpl
