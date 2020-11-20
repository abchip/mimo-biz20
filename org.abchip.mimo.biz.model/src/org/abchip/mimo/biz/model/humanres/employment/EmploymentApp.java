/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.employment;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.humanres.position.EmplPosition;
import org.abchip.mimo.biz.model.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employment App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplicationDate <em>Application Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplyingParty <em>Applying Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApproverParty <em>Approver Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getEmplPosition <em>Empl Position</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getEmploymentAppSourceType <em>Employment App Source Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getJobRequisition <em>Job Requisition</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getReferredByParty <em>Referred By Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp()
 * @model annotation="mimo-ent-frame title='Employment Application'"
 * @generated
 */
public interface EmploymentApp extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Application Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Date</em>' attribute.
	 * @see #setApplicationDate(Date)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_ApplicationDate()
	 * @model
	 * @generated
	 */
	Date getApplicationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplicationDate <em>Application Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Date</em>' attribute.
	 * @see #getApplicationDate()
	 * @generated
	 */
	void setApplicationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Applying Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applying Party</em>' reference.
	 * @see #setApplyingParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_ApplyingParty()
	 * @model
	 * @generated
	 */
	Party getApplyingParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplyingParty <em>Applying Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applying Party</em>' reference.
	 * @see #getApplyingParty()
	 * @generated
	 */
	void setApplyingParty(Party value);

	/**
	 * Returns the value of the '<em><b>Approver Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approver Party</em>' reference.
	 * @see #setApproverParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_ApproverParty()
	 * @model
	 * @generated
	 */
	Party getApproverParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApproverParty <em>Approver Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver Party</em>' reference.
	 * @see #getApproverParty()
	 * @generated
	 */
	void setApproverParty(Party value);

	/**
	 * Returns the value of the '<em><b>Empl Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position</em>' reference.
	 * @see #setEmplPosition(EmplPosition)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_EmplPosition()
	 * @model
	 * @generated
	 */
	EmplPosition getEmplPosition();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getEmplPosition <em>Empl Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position</em>' reference.
	 * @see #getEmplPosition()
	 * @generated
	 */
	void setEmplPosition(EmplPosition value);

	/**
	 * Returns the value of the '<em><b>Employment App Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment App Source Type</em>' reference.
	 * @see #setEmploymentAppSourceType(EmploymentAppSourceType)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_EmploymentAppSourceType()
	 * @model
	 * @generated
	 */
	EmploymentAppSourceType getEmploymentAppSourceType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getEmploymentAppSourceType <em>Employment App Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employment App Source Type</em>' reference.
	 * @see #getEmploymentAppSourceType()
	 * @generated
	 */
	void setEmploymentAppSourceType(EmploymentAppSourceType value);

	/**
	 * Returns the value of the '<em><b>Job Requisition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Requisition</em>' reference.
	 * @see #setJobRequisition(JobRequisition)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_JobRequisition()
	 * @model
	 * @generated
	 */
	JobRequisition getJobRequisition();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getJobRequisition <em>Job Requisition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Requisition</em>' reference.
	 * @see #getJobRequisition()
	 * @generated
	 */
	void setJobRequisition(JobRequisition value);

	/**
	 * Returns the value of the '<em><b>Referred By Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By Party</em>' reference.
	 * @see #setReferredByParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_ReferredByParty()
	 * @model
	 * @generated
	 */
	Party getReferredByParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getReferredByParty <em>Referred By Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred By Party</em>' reference.
	 * @see #getReferredByParty()
	 * @generated
	 */
	void setReferredByParty(Party value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Id</em>' attribute.
	 * @see #setApplicationId(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmploymentApp_ApplicationId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getApplicationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmploymentApp#getApplicationId <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Id</em>' attribute.
	 * @see #getApplicationId()
	 * @generated
	 */
	void setApplicationId(String value);

} // EmploymentApp
