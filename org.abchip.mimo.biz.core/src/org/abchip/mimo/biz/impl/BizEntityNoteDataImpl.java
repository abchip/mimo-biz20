/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.impl;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityNoteData;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biz Entity Note Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getNoteId <em>Note Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getMoreInfoItemId <em>More Info Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getMoreInfoItemName <em>More Info Item Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getMoreInfoUrl <em>More Info Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getNoteDateTime <em>Note Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getNoteInfo <em>Note Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getNoteName <em>Note Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizEntityNoteDataImpl#getNoteParty <em>Note Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BizEntityNoteDataImpl extends EntityIdentifiableImpl implements BizEntityNoteData {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BizEntityNoteDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BizPackage.Literals.BIZ_ENTITY_NOTE_DATA;
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
	public String getNoteId() {
		return (String)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteId(String newNoteId) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_ID, newNoteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoItemId() {
		return (String)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoItemId(String newMoreInfoItemId) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_ID, newMoreInfoItemId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoItemName() {
		return (String)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoItemName(String newMoreInfoItemName) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_NAME, newMoreInfoItemName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMoreInfoUrl() {
		return (String)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__MORE_INFO_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoreInfoUrl(String newMoreInfoUrl) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__MORE_INFO_URL, newMoreInfoUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNoteDateTime() {
		return (Date)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteDateTime(Date newNoteDateTime) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_DATE_TIME, newNoteDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteInfo() {
		return (String)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteInfo(String newNoteInfo) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_INFO, newNoteInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteName() {
		return (String)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteName(String newNoteName) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_NAME, newNoteName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteParty() {
		return (String)eGet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteParty(String newNoteParty) {
		eSet(BizPackage.Literals.BIZ_ENTITY_NOTE_DATA__NOTE_PARTY, newNoteParty);
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
				case BizPackage.BIZ_ENTITY_NOTE_DATA__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case BizPackage.BIZ_ENTITY_NOTE_DATA__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case BizPackage.BIZ_ENTITY_NOTE_DATA__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case BizPackage.BIZ_ENTITY_NOTE_DATA__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return BizPackage.BIZ_ENTITY_NOTE_DATA__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return BizPackage.BIZ_ENTITY_NOTE_DATA__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return BizPackage.BIZ_ENTITY_NOTE_DATA__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return BizPackage.BIZ_ENTITY_NOTE_DATA__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BizEntityNoteDataImpl
