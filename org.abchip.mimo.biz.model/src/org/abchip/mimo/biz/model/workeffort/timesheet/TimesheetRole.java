/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.timesheet;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timesheet Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getTimesheet <em>Timesheet</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getRoleType <em>Role Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheetRole()
 * @model
 * @generated
 */
public interface TimesheetRole extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Timesheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timesheet</em>' reference.
	 * @see #setTimesheet(Timesheet)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheetRole_Timesheet()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Timesheet getTimesheet();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getTimesheet <em>Timesheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timesheet</em>' reference.
	 * @see #getTimesheet()
	 * @generated
	 */
	void setTimesheet(Timesheet value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheetRole_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetPackage#getTimesheetRole_RoleType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.timesheet.TimesheetRole#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

} // TimesheetRole
