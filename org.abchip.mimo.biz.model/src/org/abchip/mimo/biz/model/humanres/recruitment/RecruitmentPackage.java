/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.recruitment;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentFactory
 * @model kind="package"
 * @generated
 */
public interface RecruitmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "recruitment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/humanres/recruitment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-recruitment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecruitmentPackage eINSTANCE = org.abchip.mimo.biz.model.humanres.recruitment.impl.RecruitmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl <em>Job Interview</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.RecruitmentPackageImpl#getJobInterview()
	 * @generated
	 */
	int JOB_INTERVIEW = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Job Interview Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__JOB_INTERVIEW_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grade Secured Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__GRADE_SECURED_ENUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Job Interview Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__JOB_INTERVIEW_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Job Interview Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__JOB_INTERVIEW_RESULT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Job Interview Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__JOB_INTERVIEW_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Job Interviewee Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Job Interviewer Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__JOB_INTERVIEWER_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Job Requisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW__JOB_REQUISITION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Job Interview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewTypeImpl <em>Job Interview Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewTypeImpl
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.RecruitmentPackageImpl#getJobInterviewType()
	 * @generated
	 */
	int JOB_INTERVIEW_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Job Interview Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_TYPE__JOB_INTERVIEW_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Job Interview Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_INTERVIEW_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl <em>Job Requisition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.RecruitmentPackageImpl#getJobRequisition()
	 * @generated
	 */
	int JOB_REQUISITION = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Job Requisition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__JOB_REQUISITION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__AGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Duration Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__DURATION_MONTHS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exam Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__EXAM_TYPE_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Experience Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__EXPERIENCE_MONTHS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Experience Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__EXPERIENCE_YEARS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__GENDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Job Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__JOB_LOCATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Job Posting Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__JOB_POSTING_TYPE_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Job Requisition Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__JOB_REQUISITION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>No Of Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__NO_OF_RESOURCES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__QUALIFICATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Required On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__REQUIRED_ON_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Skill Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION__SKILL_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Job Requisition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_REQUISITION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview <em>Job Interview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Interview</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview
	 * @generated
	 */
	EClass getJobInterview();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewId <em>Job Interview Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Interview Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewId()
	 * @see #getJobInterview()
	 * @generated
	 */
	EAttribute getJobInterview_JobInterviewId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getGradeSecuredEnum <em>Grade Secured Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grade Secured Enum</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getGradeSecuredEnum()
	 * @see #getJobInterview()
	 * @generated
	 */
	EReference getJobInterview_GradeSecuredEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewDate <em>Job Interview Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Interview Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewDate()
	 * @see #getJobInterview()
	 * @generated
	 */
	EAttribute getJobInterview_JobInterviewDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewResult <em>Job Interview Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Interview Result</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewResult()
	 * @see #getJobInterview()
	 * @generated
	 */
	EAttribute getJobInterview_JobInterviewResult();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewType <em>Job Interview Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Interview Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewType()
	 * @see #getJobInterview()
	 * @generated
	 */
	EReference getJobInterview_JobInterviewType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobIntervieweeParty <em>Job Interviewee Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Interviewee Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobIntervieweeParty()
	 * @see #getJobInterview()
	 * @generated
	 */
	EReference getJobInterview_JobIntervieweeParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewerParty <em>Job Interviewer Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Interviewer Party</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewerParty()
	 * @see #getJobInterview()
	 * @generated
	 */
	EReference getJobInterview_JobInterviewerParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobRequisition <em>Job Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Requisition</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobRequisition()
	 * @see #getJobInterview()
	 * @generated
	 */
	EReference getJobInterview_JobRequisition();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterviewType <em>Job Interview Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Interview Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterviewType
	 * @generated
	 */
	EClass getJobInterviewType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterviewType#getJobInterviewTypeId <em>Job Interview Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Interview Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterviewType#getJobInterviewTypeId()
	 * @see #getJobInterviewType()
	 * @generated
	 */
	EAttribute getJobInterviewType_JobInterviewTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterviewType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobInterviewType#getDescription()
	 * @see #getJobInterviewType()
	 * @generated
	 */
	EAttribute getJobInterviewType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition <em>Job Requisition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Requisition</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition
	 * @generated
	 */
	EClass getJobRequisition();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getJobRequisitionId <em>Job Requisition Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Requisition Id</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getJobRequisitionId()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_JobRequisitionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getAge()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getDurationMonths <em>Duration Months</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Months</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getDurationMonths()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_DurationMonths();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getExamTypeEnum <em>Exam Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exam Type Enum</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getExamTypeEnum()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EReference getJobRequisition_ExamTypeEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getExperienceMonths <em>Experience Months</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experience Months</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getExperienceMonths()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_ExperienceMonths();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getExperienceYears <em>Experience Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experience Years</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getExperienceYears()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_ExperienceYears();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getGender()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getJobLocation <em>Job Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Location</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getJobLocation()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_JobLocation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getJobPostingTypeEnum <em>Job Posting Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Posting Type Enum</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getJobPostingTypeEnum()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EReference getJobRequisition_JobPostingTypeEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getJobRequisitionDate <em>Job Requisition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Requisition Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getJobRequisitionDate()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_JobRequisitionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getNoOfResources <em>No Of Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Of Resources</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getNoOfResources()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_NoOfResources();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getQualification()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_Qualification();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getRequiredOnDate <em>Required On Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required On Date</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getRequiredOnDate()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EAttribute getJobRequisition_RequiredOnDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getSkillType <em>Skill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Type</em>'.
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition#getSkillType()
	 * @see #getJobRequisition()
	 * @generated
	 */
	EReference getJobRequisition_SkillType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecruitmentFactory getRecruitmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl <em>Job Interview</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewImpl
		 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.RecruitmentPackageImpl#getJobInterview()
		 * @generated
		 */
		EClass JOB_INTERVIEW = eINSTANCE.getJobInterview();

		/**
		 * The meta object literal for the '<em><b>Job Interview Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_INTERVIEW__JOB_INTERVIEW_ID = eINSTANCE.getJobInterview_JobInterviewId();

		/**
		 * The meta object literal for the '<em><b>Grade Secured Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_INTERVIEW__GRADE_SECURED_ENUM = eINSTANCE.getJobInterview_GradeSecuredEnum();

		/**
		 * The meta object literal for the '<em><b>Job Interview Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_INTERVIEW__JOB_INTERVIEW_DATE = eINSTANCE.getJobInterview_JobInterviewDate();

		/**
		 * The meta object literal for the '<em><b>Job Interview Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_INTERVIEW__JOB_INTERVIEW_RESULT = eINSTANCE.getJobInterview_JobInterviewResult();

		/**
		 * The meta object literal for the '<em><b>Job Interview Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_INTERVIEW__JOB_INTERVIEW_TYPE = eINSTANCE.getJobInterview_JobInterviewType();

		/**
		 * The meta object literal for the '<em><b>Job Interviewee Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY = eINSTANCE.getJobInterview_JobIntervieweeParty();

		/**
		 * The meta object literal for the '<em><b>Job Interviewer Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_INTERVIEW__JOB_INTERVIEWER_PARTY = eINSTANCE.getJobInterview_JobInterviewerParty();

		/**
		 * The meta object literal for the '<em><b>Job Requisition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_INTERVIEW__JOB_REQUISITION = eINSTANCE.getJobInterview_JobRequisition();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewTypeImpl <em>Job Interview Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.JobInterviewTypeImpl
		 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.RecruitmentPackageImpl#getJobInterviewType()
		 * @generated
		 */
		EClass JOB_INTERVIEW_TYPE = eINSTANCE.getJobInterviewType();

		/**
		 * The meta object literal for the '<em><b>Job Interview Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_INTERVIEW_TYPE__JOB_INTERVIEW_TYPE_ID = eINSTANCE.getJobInterviewType_JobInterviewTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_INTERVIEW_TYPE__DESCRIPTION = eINSTANCE.getJobInterviewType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl <em>Job Requisition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.JobRequisitionImpl
		 * @see org.abchip.mimo.biz.model.humanres.recruitment.impl.RecruitmentPackageImpl#getJobRequisition()
		 * @generated
		 */
		EClass JOB_REQUISITION = eINSTANCE.getJobRequisition();

		/**
		 * The meta object literal for the '<em><b>Job Requisition Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__JOB_REQUISITION_ID = eINSTANCE.getJobRequisition_JobRequisitionId();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__AGE = eINSTANCE.getJobRequisition_Age();

		/**
		 * The meta object literal for the '<em><b>Duration Months</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__DURATION_MONTHS = eINSTANCE.getJobRequisition_DurationMonths();

		/**
		 * The meta object literal for the '<em><b>Exam Type Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REQUISITION__EXAM_TYPE_ENUM = eINSTANCE.getJobRequisition_ExamTypeEnum();

		/**
		 * The meta object literal for the '<em><b>Experience Months</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__EXPERIENCE_MONTHS = eINSTANCE.getJobRequisition_ExperienceMonths();

		/**
		 * The meta object literal for the '<em><b>Experience Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__EXPERIENCE_YEARS = eINSTANCE.getJobRequisition_ExperienceYears();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__GENDER = eINSTANCE.getJobRequisition_Gender();

		/**
		 * The meta object literal for the '<em><b>Job Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__JOB_LOCATION = eINSTANCE.getJobRequisition_JobLocation();

		/**
		 * The meta object literal for the '<em><b>Job Posting Type Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REQUISITION__JOB_POSTING_TYPE_ENUM = eINSTANCE.getJobRequisition_JobPostingTypeEnum();

		/**
		 * The meta object literal for the '<em><b>Job Requisition Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__JOB_REQUISITION_DATE = eINSTANCE.getJobRequisition_JobRequisitionDate();

		/**
		 * The meta object literal for the '<em><b>No Of Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__NO_OF_RESOURCES = eINSTANCE.getJobRequisition_NoOfResources();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__QUALIFICATION = eINSTANCE.getJobRequisition_Qualification();

		/**
		 * The meta object literal for the '<em><b>Required On Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_REQUISITION__REQUIRED_ON_DATE = eINSTANCE.getJobRequisition_RequiredOnDate();

		/**
		 * The meta object literal for the '<em><b>Skill Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB_REQUISITION__SKILL_TYPE = eINSTANCE.getJobRequisition_SkillType();

	}

} //RecruitmentPackage
