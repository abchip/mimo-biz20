/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__INVOICE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rate Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__RATE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Timesheet Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__TIMESHEET_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ENTRY__WORK_EFFORT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

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
	 * The feature id for the '<em><b>Approved By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__APPROVED_BY_USER_LOGIN_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Client Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__CLIENT_PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET__STATUS_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

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
	 * The feature id for the '<em><b>Timesheet Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__TIMESHEET_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESHEET_ROLE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

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
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getInvoiceId()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_InvoiceId();

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
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getPartyId()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getRateTypeId <em>Rate Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rate Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getRateTypeId()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_RateTypeId();

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
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getTimesheetId <em>Timesheet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timesheet Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getTimesheetId()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_TimesheetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimeEntry#getWorkEffortId()
	 * @see #getTimeEntry()
	 * @generated
	 */
	EReference getTimeEntry_WorkEffortId();

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
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getApprovedByUserLoginId <em>Approved By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approved By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getApprovedByUserLoginId()
	 * @see #getTimesheet()
	 * @generated
	 */
	EReference getTimesheet_ApprovedByUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getClientPartyId <em>Client Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getClientPartyId()
	 * @see #getTimesheet()
	 * @generated
	 */
	EReference getTimesheet_ClientPartyId();

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
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getPartyId()
	 * @see #getTimesheet()
	 * @generated
	 */
	EReference getTimesheet_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.Timesheet#getStatusId()
	 * @see #getTimesheet()
	 * @generated
	 */
	EReference getTimesheet_StatusId();

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
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getTimesheetId <em>Timesheet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timesheet Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getTimesheetId()
	 * @see #getTimesheetRole()
	 * @generated
	 */
	EReference getTimesheetRole_TimesheetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getPartyId()
	 * @see #getTimesheetRole()
	 * @generated
	 */
	EReference getTimesheetRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getRoleTypeId()
	 * @see #getTimesheetRole()
	 * @generated
	 */
	EReference getTimesheetRole_RoleTypeId();

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
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__INVOICE_ID = eINSTANCE.getTimeEntry_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__INVOICE_ITEM_SEQ_ID = eINSTANCE.getTimeEntry_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__PARTY_ID = eINSTANCE.getTimeEntry_PartyId();

		/**
		 * The meta object literal for the '<em><b>Rate Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__RATE_TYPE_ID = eINSTANCE.getTimeEntry_RateTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ENTRY__THRU_DATE = eINSTANCE.getTimeEntry_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Timesheet Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__TIMESHEET_ID = eINSTANCE.getTimeEntry_TimesheetId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ENTRY__WORK_EFFORT_ID = eINSTANCE.getTimeEntry_WorkEffortId();

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
		 * The meta object literal for the '<em><b>Approved By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET__APPROVED_BY_USER_LOGIN_ID = eINSTANCE.getTimesheet_ApprovedByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Client Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET__CLIENT_PARTY_ID = eINSTANCE.getTimesheet_ClientPartyId();

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
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET__PARTY_ID = eINSTANCE.getTimesheet_PartyId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET__STATUS_ID = eINSTANCE.getTimesheet_StatusId();

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
		 * The meta object literal for the '<em><b>Timesheet Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET_ROLE__TIMESHEET_ID = eINSTANCE.getTimesheetRole_TimesheetId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET_ROLE__PARTY_ID = eINSTANCE.getTimesheetRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMESHEET_ROLE__ROLE_TYPE_ID = eINSTANCE.getTimesheetRole_RoleTypeId();

	}

} //TimesheetPackage
