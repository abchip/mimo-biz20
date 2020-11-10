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
import org.abchip.mimo.biz.model.humanres.employment.EmploymentApp;
import org.abchip.mimo.biz.model.humanres.employment.EmploymentAppSourceType;
import org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.model.humanres.position.EmplPosition;
import org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employment App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getApplicationDate <em>Application Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getApplyingParty <em>Applying Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getApproverParty <em>Approver Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getEmplPosition <em>Empl Position</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getEmploymentAppSourceType <em>Employment App Source Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getJobRequisition <em>Job Requisition</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getReferredByParty <em>Referred By Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.impl.EmploymentAppImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmploymentAppImpl extends EntityTypedImpl<EmploymentAppSourceType> implements EmploymentApp {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmploymentAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.EMPLOYMENT_APP;
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
	public Date getApplicationDate() {
		return (Date)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__APPLICATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationDate(Date newApplicationDate) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__APPLICATION_DATE, newApplicationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getApplyingParty() {
		return (Party)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__APPLYING_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplyingParty(Party newApplyingParty) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__APPLYING_PARTY, newApplyingParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getApproverParty() {
		return (Party)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__APPROVER_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproverParty(Party newApproverParty) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__APPROVER_PARTY, newApproverParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPosition getEmplPosition() {
		return (EmplPosition)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__EMPL_POSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPosition(EmplPosition newEmplPosition) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__EMPL_POSITION, newEmplPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmploymentAppSourceType getEmploymentAppSourceType() {
		return (EmploymentAppSourceType)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmploymentAppSourceType(EmploymentAppSourceType newEmploymentAppSourceType) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE, newEmploymentAppSourceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobRequisition getJobRequisition() {
		return (JobRequisition)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__JOB_REQUISITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRequisition(JobRequisition newJobRequisition) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__JOB_REQUISITION, newJobRequisition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getReferredByParty() {
		return (Party)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__REFERRED_BY_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferredByParty(Party newReferredByParty) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__REFERRED_BY_PARTY, newReferredByParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicationId() {
		return (String)eGet(EmploymentPackage.Literals.EMPLOYMENT_APP__APPLICATION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationId(String newApplicationId) {
		eSet(EmploymentPackage.Literals.EMPLOYMENT_APP__APPLICATION_ID, newApplicationId);
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
				case EmploymentPackage.EMPLOYMENT_APP__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case EmploymentPackage.EMPLOYMENT_APP__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case EmploymentPackage.EMPLOYMENT_APP__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case EmploymentPackage.EMPLOYMENT_APP__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return EmploymentPackage.EMPLOYMENT_APP__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return EmploymentPackage.EMPLOYMENT_APP__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return EmploymentPackage.EMPLOYMENT_APP__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return EmploymentPackage.EMPLOYMENT_APP__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EmploymentAppImpl
