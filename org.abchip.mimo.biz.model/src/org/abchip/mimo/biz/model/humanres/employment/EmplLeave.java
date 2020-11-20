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
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Leave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getLeaveType <em>Leave Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getApproverParty <em>Approver Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getEmplLeaveReasonType <em>Empl Leave Reason Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getLeaveStatus <em>Leave Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave()
 * @model annotation="mimo-ent-frame title='Employee Leave' formula='description'"
 * @generated
 */
public interface EmplLeave extends EntityTyped<EmplLeaveType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Leave Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leave Type</em>' reference.
	 * @see #setLeaveType(EmplLeaveType)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave_LeaveType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplLeaveType getLeaveType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getLeaveType <em>Leave Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leave Type</em>' reference.
	 * @see #getLeaveType()
	 * @generated
	 */
	void setLeaveType(EmplLeaveType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Empl Leave Reason Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Leave Reason Type</em>' reference.
	 * @see #setEmplLeaveReasonType(EmplLeaveReasonType)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave_EmplLeaveReasonType()
	 * @model
	 * @generated
	 */
	EmplLeaveReasonType getEmplLeaveReasonType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getEmplLeaveReasonType <em>Empl Leave Reason Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Leave Reason Type</em>' reference.
	 * @see #getEmplLeaveReasonType()
	 * @generated
	 */
	void setEmplLeaveReasonType(EmplLeaveReasonType value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Approver Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approver Party</em>' reference.
	 * @see #setApproverParty(Party)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave_ApproverParty()
	 * @model
	 * @generated
	 */
	Party getApproverParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getApproverParty <em>Approver Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver Party</em>' reference.
	 * @see #getApproverParty()
	 * @generated
	 */
	void setApproverParty(Party value);

	/**
	 * Returns the value of the '<em><b>Leave Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leave Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leave Status</em>' reference.
	 * @see #setLeaveStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave_LeaveStatus()
	 * @model
	 * @generated
	 */
	StatusItem getLeaveStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getLeaveStatus <em>Leave Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leave Status</em>' reference.
	 * @see #getLeaveStatus()
	 * @generated
	 */
	void setLeaveStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeave_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeave#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // EmplLeave
