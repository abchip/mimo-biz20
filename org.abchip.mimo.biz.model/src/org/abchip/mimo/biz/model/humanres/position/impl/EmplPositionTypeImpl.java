/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.position.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.humanres.position.EmplPosition;
import org.abchip.mimo.biz.model.humanres.position.EmplPositionType;
import org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass;
import org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate;
import org.abchip.mimo.biz.model.humanres.position.PositionPackage;
import org.abchip.mimo.biz.model.humanres.position.ValidResponsibility;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypeImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getEmplPositionTypeClasses <em>Empl Position Type Classes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getEmplPositionTypeRates <em>Empl Position Type Rates</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionTypeImpl#getValidResponsibilities <em>Valid Responsibilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplPositionTypeImpl extends EntityTypeImpl<EmplPosition> implements EmplPositionType {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PositionPackage.Literals.EMPL_POSITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
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
	public String getDescription() {
		return (String)eGet(PositionPackage.Literals.EMPL_POSITION_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PositionPackage.Literals.EMPL_POSITION_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EmplPositionTypeClass> getEmplPositionTypeClasses() {
		return (List<EmplPositionTypeClass>)eGet(PositionPackage.Literals.EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_CLASSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EmplPositionTypeRate> getEmplPositionTypeRates() {
		return (List<EmplPositionTypeRate>)eGet(PositionPackage.Literals.EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_RATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(PositionPackage.Literals.EMPL_POSITION_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(PositionPackage.Literals.EMPL_POSITION_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionType getParentType() {
		return (EmplPositionType)eGet(PositionPackage.Literals.EMPL_POSITION_TYPE__PARENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentType(EmplPositionType newParentType) {
		eSet(PositionPackage.Literals.EMPL_POSITION_TYPE__PARENT_TYPE, newParentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ValidResponsibility> getValidResponsibilities() {
		return (List<ValidResponsibility>)eGet(PositionPackage.Literals.EMPL_POSITION_TYPE__VALID_RESPONSIBILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplPositionTypeId() {
		return (String)eGet(PositionPackage.Literals.EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionTypeId(String newEmplPositionTypeId) {
		eSet(PositionPackage.Literals.EMPL_POSITION_TYPE__EMPL_POSITION_TYPE_ID, newEmplPositionTypeId);
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
				case PositionPackage.EMPL_POSITION_TYPE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case PositionPackage.EMPL_POSITION_TYPE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case PositionPackage.EMPL_POSITION_TYPE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case PositionPackage.EMPL_POSITION_TYPE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return PositionPackage.EMPL_POSITION_TYPE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return PositionPackage.EMPL_POSITION_TYPE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return PositionPackage.EMPL_POSITION_TYPE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return PositionPackage.EMPL_POSITION_TYPE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EmplPositionTypeImpl
