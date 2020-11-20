/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.timesheet;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timesheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getTimesheetId <em>Timesheet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getApprovedByUserLogin <em>Approved By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getClientParty <em>Client Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet()
 * @model
 * @generated
 */
public interface Timesheet extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

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
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

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
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Timesheet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timesheet Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timesheet Id</em>' attribute.
	 * @see #setTimesheetId(String)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet_TimesheetId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTimesheetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getTimesheetId <em>Timesheet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timesheet Id</em>' attribute.
	 * @see #getTimesheetId()
	 * @generated
	 */
	void setTimesheetId(String value);

	/**
	 * Returns the value of the '<em><b>Approved By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved By User Login</em>' reference.
	 * @see #setApprovedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet_ApprovedByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getApprovedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getApprovedByUserLogin <em>Approved By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved By User Login</em>' reference.
	 * @see #getApprovedByUserLogin()
	 * @generated
	 */
	void setApprovedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Client Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Party</em>' reference.
	 * @see #setClientParty(Party)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheet_ClientParty()
	 * @model
	 * @generated
	 */
	Party getClientParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getClientParty <em>Client Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Party</em>' reference.
	 * @see #getClientParty()
	 * @generated
	 */
	void setClientParty(Party value);

} // Timesheet
