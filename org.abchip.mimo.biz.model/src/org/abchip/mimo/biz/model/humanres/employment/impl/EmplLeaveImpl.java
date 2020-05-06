/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.employment.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.humanres.employment.EmplLeave;
import org.abchip.mimo.biz.model.humanres.employment.EmplLeaveReasonType;
import org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType;
import org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Leave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getLeaveTypeId <em>Leave Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getApproverPartyId <em>Approver Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getEmplLeaveReasonTypeId <em>Empl Leave Reason Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getLeaveStatus <em>Leave Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmplLeaveImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplLeaveImpl extends EntityTypedImpl<EmplLeaveType> implements EmplLeave {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplLeaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.EMPL_LEAVE;
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
	public Party getApproverPartyId() {
		return (Party)eGet(EmploymentPackage.Literals.EMPL_LEAVE__APPROVER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproverPartyId(Party newApproverPartyId) {
		eSet(EmploymentPackage.Literals.EMPL_LEAVE__APPROVER_PARTY_ID, newApproverPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(EmploymentPackage.Literals.EMPL_LEAVE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(EmploymentPackage.Literals.EMPL_LEAVE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplLeaveReasonType getEmplLeaveReasonTypeId() {
		return (EmplLeaveReasonType)eGet(EmploymentPackage.Literals.EMPL_LEAVE__EMPL_LEAVE_REASON_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplLeaveReasonTypeId(EmplLeaveReasonType newEmplLeaveReasonTypeId) {
		eSet(EmploymentPackage.Literals.EMPL_LEAVE__EMPL_LEAVE_REASON_TYPE_ID, newEmplLeaveReasonTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(EmploymentPackage.Literals.EMPL_LEAVE__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(EmploymentPackage.Literals.EMPL_LEAVE__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getLeaveStatus() {
		return (StatusItem)eGet(EmploymentPackage.Literals.EMPL_LEAVE__LEAVE_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaveStatus(StatusItem newLeaveStatus) {
		eSet(EmploymentPackage.Literals.EMPL_LEAVE__LEAVE_STATUS, newLeaveStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplLeaveType getLeaveTypeId() {
		return (EmplLeaveType)eGet(EmploymentPackage.Literals.EMPL_LEAVE__LEAVE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaveTypeId(EmplLeaveType newLeaveTypeId) {
		eSet(EmploymentPackage.Literals.EMPL_LEAVE__LEAVE_TYPE_ID, newLeaveTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(EmploymentPackage.Literals.EMPL_LEAVE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(EmploymentPackage.Literals.EMPL_LEAVE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(EmploymentPackage.Literals.EMPL_LEAVE__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(EmploymentPackage.Literals.EMPL_LEAVE__THRU_DATE, newThruDate);
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
				case EmploymentPackage.EMPL_LEAVE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case EmploymentPackage.EMPL_LEAVE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case EmploymentPackage.EMPL_LEAVE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case EmploymentPackage.EMPL_LEAVE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return EmploymentPackage.EMPL_LEAVE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return EmploymentPackage.EMPL_LEAVE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return EmploymentPackage.EMPL_LEAVE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return EmploymentPackage.EMPL_LEAVE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EmplLeaveImpl
