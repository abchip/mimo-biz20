/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.security.securitygroup.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupPackage;
import org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarpitted Login View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl#getViewNameId <em>View Name Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl#getTarpitReleaseDateTime <em>Tarpit Release Date Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TarpittedLoginViewImpl extends EntityIdentifiableImpl implements TarpittedLoginView {


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TarpittedLoginViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW;
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
	public long getTarpitReleaseDateTime() {
		return (Long)eGet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarpitReleaseDateTime(long newTarpitReleaseDateTime) {
		eSet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME, newTarpitReleaseDateTime);
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
				case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SecuritygroupPackage.TARPITTED_LOGIN_VIEW__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SecuritygroupPackage.TARPITTED_LOGIN_VIEW__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SecuritygroupPackage.TARPITTED_LOGIN_VIEW__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SecuritygroupPackage.TARPITTED_LOGIN_VIEW__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SecuritygroupPackage.TARPITTED_LOGIN_VIEW__LAST_UPDATED_TX_STAMP;
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
	public String getUserLoginId() {
		return (String)eGet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		eSet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__USER_LOGIN_ID, newUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewNameId() {
		return (String)eGet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__VIEW_NAME_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewNameId(String newViewNameId) {
		eSet(SecuritygroupPackage.Literals.TARPITTED_LOGIN_VIEW__VIEW_NAME_ID, newViewNameId);
	}

} //TarpittedLoginViewImpl
