/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.employment;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Leave Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getLeaveTypeId <em>Leave Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeaveType()
 * @model annotation="mimo-ent-frame title='Employee Leave Type' dictionary='HumanResEntityLabels' formula='description'"
 * @generated
 */
public interface EmplLeaveType extends EntityType<EmplLeave>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeaveType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeaveType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(EmplLeaveType)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeaveType_ParentType()
	 * @model
	 * @generated
	 */
	EmplLeaveType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(EmplLeaveType value);

	/**
	 * Returns the value of the '<em><b>Leave Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leave Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leave Type Id</em>' attribute.
	 * @see #setLeaveTypeId(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getEmplLeaveType_LeaveTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getLeaveTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.EmplLeaveType#getLeaveTypeId <em>Leave Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leave Type Id</em>' attribute.
	 * @see #getLeaveTypeId()
	 * @generated
	 */
	void setLeaveTypeId(String value);

} // EmplLeaveType
