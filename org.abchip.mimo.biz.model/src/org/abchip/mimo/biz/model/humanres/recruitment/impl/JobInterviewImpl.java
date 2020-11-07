/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.recruitment.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.humanres.recruitment.JobInterview;
import org.abchip.mimo.biz.model.humanres.recruitment.JobInterviewType;
import org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Interview</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewId <em>Job Interview Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getGradeSecuredEnumId <em>Grade Secured Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewDate <em>Job Interview Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewResult <em>Job Interview Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewTypeId <em>Job Interview Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getJobIntervieweePartyId <em>Job Interviewee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewerPartyId <em>Job Interviewer Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobInterviewImpl extends EntityTypedImpl<JobInterviewType> implements JobInterview {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobInterviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecruitmentPackage.Literals.JOB_INTERVIEW;
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
	public Enumeration getGradeSecuredEnumId() {
		return (Enumeration)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGradeSecuredEnumId(Enumeration newGradeSecuredEnumId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID, newGradeSecuredEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getJobInterviewDate() {
		return (Date)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewDate(Date newJobInterviewDate) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_DATE, newJobInterviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInterviewId() {
		return (String)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewId(String newJobInterviewId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_ID, newJobInterviewId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInterviewResult() {
		return (String)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewResult(String newJobInterviewResult) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_RESULT, newJobInterviewResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobInterviewType getJobInterviewTypeId() {
		return (JobInterviewType)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewTypeId(JobInterviewType newJobInterviewTypeId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID, newJobInterviewTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getJobIntervieweePartyId() {
		return (Party)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobIntervieweePartyId(Party newJobIntervieweePartyId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID, newJobIntervieweePartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getJobInterviewerPartyId() {
		return (Party)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewerPartyId(Party newJobInterviewerPartyId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID, newJobInterviewerPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobRequisition getJobRequisitionId() {
		return (JobRequisition)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_REQUISITION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRequisitionId(JobRequisition newJobRequisitionId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_REQUISITION_ID, newJobRequisitionId);
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
				case RecruitmentPackage.JOB_INTERVIEW__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case RecruitmentPackage.JOB_INTERVIEW__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case RecruitmentPackage.JOB_INTERVIEW__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case RecruitmentPackage.JOB_INTERVIEW__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return RecruitmentPackage.JOB_INTERVIEW__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return RecruitmentPackage.JOB_INTERVIEW__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return RecruitmentPackage.JOB_INTERVIEW__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return RecruitmentPackage.JOB_INTERVIEW__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JobInterviewImpl
