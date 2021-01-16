/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.recruitment;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Interview</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewId <em>Job Interview Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getGradeSecuredEnum <em>Grade Secured Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewDate <em>Job Interview Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewResult <em>Job Interview Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewType <em>Job Interview Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobIntervieweeParty <em>Job Interviewee Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewerParty <em>Job Interviewer Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobRequisition <em>Job Requisition</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview()
 * @model annotation="mimo-ent-frame title='Entity for storing data about Interviews conducted'"
 * @generated
 */
public interface JobInterview extends EntityTyped<JobInterviewType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Job Interview Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interview Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Date</em>' attribute.
	 * @see #setJobInterviewDate(Date)
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewDate()
	 * @model
	 * @generated
	 */
	Date getJobInterviewDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewDate <em>Job Interview Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Date</em>' attribute.
	 * @see #getJobInterviewDate()
	 * @generated
	 */
	void setJobInterviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Job Interview Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interview Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Id</em>' attribute.
	 * @see #setJobInterviewId(String)
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getJobInterviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewId <em>Job Interview Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Id</em>' attribute.
	 * @see #getJobInterviewId()
	 * @generated
	 */
	void setJobInterviewId(String value);

	/**
	 * Returns the value of the '<em><b>Grade Secured Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade Secured Enum</em>' reference.
	 * @see #setGradeSecuredEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview_GradeSecuredEnum()
	 * @model
	 * @generated
	 */
	Enumeration getGradeSecuredEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getGradeSecuredEnum <em>Grade Secured Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade Secured Enum</em>' reference.
	 * @see #getGradeSecuredEnum()
	 * @generated
	 */
	void setGradeSecuredEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Job Interview Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interview Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Result</em>' attribute.
	 * @see #setJobInterviewResult(String)
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewResult()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getJobInterviewResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewResult <em>Job Interview Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Result</em>' attribute.
	 * @see #getJobInterviewResult()
	 * @generated
	 */
	void setJobInterviewResult(String value);

	/**
	 * Returns the value of the '<em><b>Job Interview Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Type</em>' reference.
	 * @see #setJobInterviewType(JobInterviewType)
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewType()
	 * @model
	 * @generated
	 */
	JobInterviewType getJobInterviewType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewType <em>Job Interview Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Type</em>' reference.
	 * @see #getJobInterviewType()
	 * @generated
	 */
	void setJobInterviewType(JobInterviewType value);

	/**
	 * Returns the value of the '<em><b>Job Interviewee Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interviewee Party</em>' reference.
	 * @see #setJobIntervieweeParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview_JobIntervieweeParty()
	 * @model
	 * @generated
	 */
	Party getJobIntervieweeParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobIntervieweeParty <em>Job Interviewee Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interviewee Party</em>' reference.
	 * @see #getJobIntervieweeParty()
	 * @generated
	 */
	void setJobIntervieweeParty(Party value);

	/**
	 * Returns the value of the '<em><b>Job Interviewer Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interviewer Party</em>' reference.
	 * @see #setJobInterviewerParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewerParty()
	 * @model
	 * @generated
	 */
	Party getJobInterviewerParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobInterviewerParty <em>Job Interviewer Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interviewer Party</em>' reference.
	 * @see #getJobInterviewerParty()
	 * @generated
	 */
	void setJobInterviewerParty(Party value);

	/**
	 * Returns the value of the '<em><b>Job Requisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Requisition</em>' reference.
	 * @see #setJobRequisition(JobRequisition)
	 * @see org.abchip.mimo.biz.model.humanres.recruitment.RecruitmentPackage#getJobInterview_JobRequisition()
	 * @model
	 * @generated
	 */
	JobRequisition getJobRequisition();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.recruitment.JobInterview#getJobRequisition <em>Job Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Requisition</em>' reference.
	 * @see #getJobRequisition()
	 * @generated
	 */
	void setJobRequisition(JobRequisition value);

} // JobInterview
