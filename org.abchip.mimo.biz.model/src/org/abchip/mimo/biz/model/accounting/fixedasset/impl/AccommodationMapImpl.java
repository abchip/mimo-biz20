/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationClass;
import org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap;
import org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMapType;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accommodation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationMapId <em>Accommodation Map Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationClassId <em>Accommodation Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getAccommodationMapTypeId <em>Accommodation Map Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.AccommodationMapImpl#getNumberOfSpaces <em>Number Of Spaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccommodationMapImpl extends EntityTypedImpl<AccommodationMapType> implements AccommodationMap {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccommodationMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.ACCOMMODATION_MAP;
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
	public String getAccommodationMapId() {
		return (String)eGet(FixedassetPackage.Literals.ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationMapId(String newAccommodationMapId) {
		eSet(FixedassetPackage.Literals.ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID, newAccommodationMapId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumberOfSpaces() {
		return (Long)eGet(FixedassetPackage.Literals.ACCOMMODATION_MAP__NUMBER_OF_SPACES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfSpaces(long newNumberOfSpaces) {
		eSet(FixedassetPackage.Literals.ACCOMMODATION_MAP__NUMBER_OF_SPACES, newNumberOfSpaces);
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
				case FixedassetPackage.ACCOMMODATION_MAP__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case FixedassetPackage.ACCOMMODATION_MAP__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case FixedassetPackage.ACCOMMODATION_MAP__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case FixedassetPackage.ACCOMMODATION_MAP__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return FixedassetPackage.ACCOMMODATION_MAP__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return FixedassetPackage.ACCOMMODATION_MAP__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return FixedassetPackage.ACCOMMODATION_MAP__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return FixedassetPackage.ACCOMMODATION_MAP__LAST_UPDATED_TX_STAMP;
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
	public AccommodationClass getAccommodationClassId() {
		return (AccommodationClass)eGet(FixedassetPackage.Literals.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationClassId(AccommodationClass newAccommodationClassId) {
		eSet(FixedassetPackage.Literals.ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID, newAccommodationClassId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAssetId() {
		return (FixedAsset)eGet(FixedassetPackage.Literals.ACCOMMODATION_MAP__FIXED_ASSET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		eSet(FixedassetPackage.Literals.ACCOMMODATION_MAP__FIXED_ASSET_ID, newFixedAssetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccommodationMapType getAccommodationMapTypeId() {
		return (AccommodationMapType)eGet(FixedassetPackage.Literals.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationMapTypeId(AccommodationMapType newAccommodationMapTypeId) {
		eSet(FixedassetPackage.Literals.ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID, newAccommodationMapTypeId);
	}

} //AccommodationMapImpl
