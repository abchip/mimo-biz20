/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.timesheet;

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
 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetFactory
 * @model kind="package"
 * @generated
 */
public interface TimesheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timesheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/workeffort/timesheet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-timesheet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimesheetPackage eINSTANCE = org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimeEntryImpl <em>Time Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimeEntryImpl
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetPackageImpl#getTimeEntry()
	 * @generated
	 */
	int TIME_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Entry Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__TIME_ENTRY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__HOURS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rate Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__RATE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Timesheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__TIMESHEET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Time Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetImpl <em>Timesheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetImpl
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetPackageImpl#getTimesheet()
	 * @generated
	 */
	int TIMESHEET = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timesheet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__TIMESHEET_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Approved By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__APPROVED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Client Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__CLIENT_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Timesheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetRoleImpl
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetPackageImpl#getTimesheetRole()
	 * @generated
	 */
	int TIMESHEET_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timesheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__TIMESHEET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry <em>Time Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Entry</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry
	 * @generated
	 */
	EClass getTimeEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getTimeEntryId <em>Time Entry Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Entry Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getTimeEntryId()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_TimeEntryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getComments()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getFromDate()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getHours()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_Hours();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getInvoice()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getInvoiceItemSeqId()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getParty()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getRateType <em>Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rate Type</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getRateType()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_RateType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getThruDate()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EAttribute getTimeEntry_ThruDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getTimesheet <em>Timesheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timesheet</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getTimesheet()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_Timesheet();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getWorkEffort()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_WorkEffort();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet <em>Timesheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timesheet</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet
	 * @generated
	 */
	EClass getTimesheet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getTimesheetId <em>Timesheet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timesheet Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getTimesheetId()
	 * @see #getTimesheet()
	 * @generated
	 */
	EAttribute getTimesheet_TimesheetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getApprovedByUserLogin <em>Approved By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approved By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getApprovedByUserLogin()
	 * @see #getTimesheet()
	 * @generated
	 */
	EReference getTimesheet_ApprovedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getClientParty <em>Client Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Party</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getClientParty()
	 * @see #getTimesheet()
	 * @generated
	 */
	EReference getTimesheet_ClientParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getComments()
	 * @see #getTimesheet()
	 * @generated
	 */
	EAttribute getTimesheet_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getFromDate()
	 * @see #getTimesheet()
	 * @generated
	 */
	EAttribute getTimesheet_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getParty()
	 * @see #getTimesheet()
	 * @generated
	 */
	EReference getTimesheet_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getStatus()
	 * @see #getTimesheet()
	 * @generated
	 */
	EReference getTimesheet_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getThruDate()
	 * @see #getTimesheet()
	 * @generated
	 */
	EAttribute getTimesheet_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole
	 * @generated
	 */
	EClass getTimesheetRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getTimesheet <em>Timesheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timesheet</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getTimesheet()
	 * @see #getTimesheetRole()
	 * @generated
	 */
	EReference getTimesheetRole_Timesheet();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getParty()
	 * @see #getTimesheetRole()
	 * @generated
	 */
	EReference getTimesheetRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getRoleType()
	 * @see #getTimesheetRole()
	 * @generated
	 */
	EReference getTimesheetRole_RoleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimesheetFactory getTimesheetFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimeEntryImpl <em>Time Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimeEntryImpl
		 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetPackageImpl#getTimeEntry()
		 * @generated
		 */
		EClass TIME_ENTRY = eINSTANCE.getTimeEntry();

		/**
		 * The meta object literal for the '<em><b>Time Entry Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__TIME_ENTRY_ID = eINSTANCE.getTimeEntry_TimeEntryId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__COMMENTS = eINSTANCE.getTimeEntry_Comments();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__FROM_DATE = eINSTANCE.getTimeEntry_FromDate();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__HOURS = eINSTANCE.getTimeEntry_Hours();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__INVOICE = eINSTANCE.getTimeEntry_Invoice();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__INVOICE_ITEM_SEQ_ID = eINSTANCE.getTimeEntry_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__PARTY = eINSTANCE.getTimeEntry_Party();

		/**
		 * The meta object literal for the '<em><b>Rate Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__RATE_TYPE = eINSTANCE.getTimeEntry_RateType();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__THRU_DATE = eINSTANCE.getTimeEntry_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Timesheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__TIMESHEET = eINSTANCE.getTimeEntry_Timesheet();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__WORK_EFFORT = eINSTANCE.getTimeEntry_WorkEffort();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetImpl <em>Timesheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetImpl
		 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetPackageImpl#getTimesheet()
		 * @generated
		 */
		EClass TIMESHEET = eINSTANCE.getTimesheet();

		/**
		 * The meta object literal for the '<em><b>Timesheet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESHEET__TIMESHEET_ID = eINSTANCE.getTimesheet_TimesheetId();

		/**
		 * The meta object literal for the '<em><b>Approved By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET__APPROVED_BY_USER_LOGIN = eINSTANCE.getTimesheet_ApprovedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Client Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET__CLIENT_PARTY = eINSTANCE.getTimesheet_ClientParty();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESHEET__COMMENTS = eINSTANCE.getTimesheet_Comments();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESHEET__FROM_DATE = eINSTANCE.getTimesheet_FromDate();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET__PARTY = eINSTANCE.getTimesheet_Party();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET__STATUS = eINSTANCE.getTimesheet_Status();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESHEET__THRU_DATE = eINSTANCE.getTimesheet_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetRoleImpl
		 * @see org.abchip.mimo.biz.model.workeffort.timesheet.impl.TimesheetPackageImpl#getTimesheetRole()
		 * @generated
		 */
		EClass TIMESHEET_ROLE = eINSTANCE.getTimesheetRole();

		/**
		 * The meta object literal for the '<em><b>Timesheet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET_ROLE__TIMESHEET = eINSTANCE.getTimesheetRole_Timesheet();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET_ROLE__PARTY = eINSTANCE.getTimesheetRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET_ROLE__ROLE_TYPE = eINSTANCE.getTimesheetRole_RoleType();

	}

} //TimesheetPackage
