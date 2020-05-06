/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.recruitment.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.Gender;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.humanres.ability.SkillType;
import org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Requisition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getDurationMonths <em>Duration Months</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getExamTypeEnumId <em>Exam Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getExperienceMonths <em>Experience Months</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getExperienceYears <em>Experience Years</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getJobLocation <em>Job Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getJobPostingTypeEnumId <em>Job Posting Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getJobRequisitionDate <em>Job Requisition Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getNoOfResources <em>No Of Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getRequiredOnDate <em>Required On Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl#getSkillTypeId <em>Skill Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobRequisitionImpl extends EntityIdentifiableImpl implements JobRequisition {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobRequisitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecruitmentPackage.Literals.JOB_REQUISITION;
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
	public long getAge() {
		return (Long)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__AGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(long newAge) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__AGE, newAge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDurationMonths() {
		return (Long)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__DURATION_MONTHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationMonths(long newDurationMonths) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__DURATION_MONTHS, newDurationMonths);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getExamTypeEnumId() {
		return (Enumeration)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__EXAM_TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExamTypeEnumId(Enumeration newExamTypeEnumId) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__EXAM_TYPE_ENUM_ID, newExamTypeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExperienceMonths() {
		return (Long)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__EXPERIENCE_MONTHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperienceMonths(long newExperienceMonths) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__EXPERIENCE_MONTHS, newExperienceMonths);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExperienceYears() {
		return (Long)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__EXPERIENCE_YEARS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperienceYears(long newExperienceYears) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__EXPERIENCE_YEARS, newExperienceYears);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gender getGender() {
		return (Gender)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__GENDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(Gender newGender) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__GENDER, newGender);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobLocation() {
		return (String)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__JOB_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobLocation(String newJobLocation) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__JOB_LOCATION, newJobLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getJobPostingTypeEnumId() {
		return (Enumeration)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobPostingTypeEnumId(Enumeration newJobPostingTypeEnumId) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID, newJobPostingTypeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getJobRequisitionDate() {
		return (Date)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__JOB_REQUISITION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRequisitionDate(Date newJobRequisitionDate) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__JOB_REQUISITION_DATE, newJobRequisitionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobRequisitionId() {
		return (String)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__JOB_REQUISITION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRequisitionId(String newJobRequisitionId) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__JOB_REQUISITION_ID, newJobRequisitionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNoOfResources() {
		return (Long)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__NO_OF_RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoOfResources(long newNoOfResources) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__NO_OF_RESOURCES, newNoOfResources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualification() {
		return (String)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__QUALIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualification(String newQualification) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__QUALIFICATION, newQualification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getRequiredOnDate() {
		return (Date)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__REQUIRED_ON_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredOnDate(Date newRequiredOnDate) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__REQUIRED_ON_DATE, newRequiredOnDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillType getSkillTypeId() {
		return (SkillType)eGet(RecruitmentPackage.Literals.JOB_REQUISITION__SKILL_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillTypeId(SkillType newSkillTypeId) {
		eSet(RecruitmentPackage.Literals.JOB_REQUISITION__SKILL_TYPE_ID, newSkillTypeId);
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
				case RecruitmentPackage.JOB_REQUISITION__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case RecruitmentPackage.JOB_REQUISITION__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case RecruitmentPackage.JOB_REQUISITION__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case RecruitmentPackage.JOB_REQUISITION__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return RecruitmentPackage.JOB_REQUISITION__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return RecruitmentPackage.JOB_REQUISITION__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return RecruitmentPackage.JOB_REQUISITION__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return RecruitmentPackage.JOB_REQUISITION__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //JobRequisitionImpl
