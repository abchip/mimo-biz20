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
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.humanres.position.EmplPosition;
import org.abchip.mimo.biz.model.humanres.position.EmplPositionFulfillment;
import org.abchip.mimo.biz.model.humanres.position.EmplPositionReportingStruct;
import org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility;
import org.abchip.mimo.biz.model.humanres.position.EmplPositionType;
import org.abchip.mimo.biz.model.humanres.position.PositionPackage;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getActualFromDate <em>Actual From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getActualThruDate <em>Actual Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getEmplPositionFulfillments <em>Empl Position Fulfillments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getEmplPositionResponsibilities <em>Empl Position Responsibilities</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getEmplPositionType <em>Empl Position Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getEstimatedFromDate <em>Estimated From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getEstimatedThruDate <em>Estimated Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#isExemptFlag <em>Exempt Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#isFulltimeFlag <em>Fulltime Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getReportingToEmplPositionReportingStructs <em>Reporting To Empl Position Reporting Structs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#isSalaryFlag <em>Salary Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.impl.EmplPositionImpl#isTemporaryFlag <em>Temporary Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplPositionImpl extends EntityTypedImpl<EmplPositionType> implements EmplPosition {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PositionPackage.Literals.EMPL_POSITION;
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
	public Date getActualFromDate() {
		return (Date)eGet(PositionPackage.Literals.EMPL_POSITION__ACTUAL_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualFromDate(Date newActualFromDate) {
		eSet(PositionPackage.Literals.EMPL_POSITION__ACTUAL_FROM_DATE, newActualFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualThruDate() {
		return (Date)eGet(PositionPackage.Literals.EMPL_POSITION__ACTUAL_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualThruDate(Date newActualThruDate) {
		eSet(PositionPackage.Literals.EMPL_POSITION__ACTUAL_THRU_DATE, newActualThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return (String)eGet(PositionPackage.Literals.EMPL_POSITION__BUDGET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		eSet(PositionPackage.Literals.EMPL_POSITION__BUDGET_ID, newBudgetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetItemSeqId() {
		return (String)eGet(PositionPackage.Literals.EMPL_POSITION__BUDGET_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemSeqId(String newBudgetItemSeqId) {
		eSet(PositionPackage.Literals.EMPL_POSITION__BUDGET_ITEM_SEQ_ID, newBudgetItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EmplPositionFulfillment> getEmplPositionFulfillments() {
		return (List<EmplPositionFulfillment>)eGet(PositionPackage.Literals.EMPL_POSITION__EMPL_POSITION_FULFILLMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EmplPositionResponsibility> getEmplPositionResponsibilities() {
		return (List<EmplPositionResponsibility>)eGet(PositionPackage.Literals.EMPL_POSITION__EMPL_POSITION_RESPONSIBILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPositionType getEmplPositionType() {
		return (EmplPositionType)eGet(PositionPackage.Literals.EMPL_POSITION__EMPL_POSITION_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionType(EmplPositionType newEmplPositionType) {
		eSet(PositionPackage.Literals.EMPL_POSITION__EMPL_POSITION_TYPE, newEmplPositionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmplPositionId() {
		return (String)eGet(PositionPackage.Literals.EMPL_POSITION__EMPL_POSITION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionId(String newEmplPositionId) {
		eSet(PositionPackage.Literals.EMPL_POSITION__EMPL_POSITION_ID, newEmplPositionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedFromDate() {
		return (Date)eGet(PositionPackage.Literals.EMPL_POSITION__ESTIMATED_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedFromDate(Date newEstimatedFromDate) {
		eSet(PositionPackage.Literals.EMPL_POSITION__ESTIMATED_FROM_DATE, newEstimatedFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedThruDate() {
		return (Date)eGet(PositionPackage.Literals.EMPL_POSITION__ESTIMATED_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedThruDate(Date newEstimatedThruDate) {
		eSet(PositionPackage.Literals.EMPL_POSITION__ESTIMATED_THRU_DATE, newEstimatedThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExemptFlag() {
		return (Boolean)eGet(PositionPackage.Literals.EMPL_POSITION__EXEMPT_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExemptFlag(boolean newExemptFlag) {
		eSet(PositionPackage.Literals.EMPL_POSITION__EXEMPT_FLAG, newExemptFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFulltimeFlag() {
		return (Boolean)eGet(PositionPackage.Literals.EMPL_POSITION__FULLTIME_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFulltimeFlag(boolean newFulltimeFlag) {
		eSet(PositionPackage.Literals.EMPL_POSITION__FULLTIME_FLAG, newFulltimeFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(PositionPackage.Literals.EMPL_POSITION__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(PositionPackage.Literals.EMPL_POSITION__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EmplPositionReportingStruct> getReportingToEmplPositionReportingStructs() {
		return (List<EmplPositionReportingStruct>)eGet(PositionPackage.Literals.EMPL_POSITION__REPORTING_TO_EMPL_POSITION_REPORTING_STRUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSalaryFlag() {
		return (Boolean)eGet(PositionPackage.Literals.EMPL_POSITION__SALARY_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalaryFlag(boolean newSalaryFlag) {
		eSet(PositionPackage.Literals.EMPL_POSITION__SALARY_FLAG, newSalaryFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(PositionPackage.Literals.EMPL_POSITION__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(PositionPackage.Literals.EMPL_POSITION__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTemporaryFlag() {
		return (Boolean)eGet(PositionPackage.Literals.EMPL_POSITION__TEMPORARY_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporaryFlag(boolean newTemporaryFlag) {
		eSet(PositionPackage.Literals.EMPL_POSITION__TEMPORARY_FLAG, newTemporaryFlag);
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
				case PositionPackage.EMPL_POSITION__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case PositionPackage.EMPL_POSITION__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case PositionPackage.EMPL_POSITION__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case PositionPackage.EMPL_POSITION__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return PositionPackage.EMPL_POSITION__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return PositionPackage.EMPL_POSITION__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return PositionPackage.EMPL_POSITION__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return PositionPackage.EMPL_POSITION__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EmplPositionImpl
