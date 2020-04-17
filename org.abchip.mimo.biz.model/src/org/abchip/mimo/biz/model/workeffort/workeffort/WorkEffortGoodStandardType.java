/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.workeffort;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort Good Standard Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortGoodStandardType#getWorkEffortGoodStdTypeId <em>Work Effort Good Std Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortGoodStandardType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortGoodStandardType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortGoodStandardType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortGoodStandardType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface WorkEffortGoodStandardType extends BizEntityType<WorkEffortGoodStandard> {
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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortGoodStandardType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortGoodStandardType#getDescription <em>Description</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortGoodStandardType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortGoodStandardType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(WorkEffortGoodStandardType)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortGoodStandardType_ParentTypeId()
	 * @model keys="workEffortGoodStdTypeId"
	 * @generated
	 */
	WorkEffortGoodStandardType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortGoodStandardType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(WorkEffortGoodStandardType value);

	/**
	 * Returns the value of the '<em><b>Work Effort Good Std Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Good Std Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Good Std Type Id</em>' attribute.
	 * @see #setWorkEffortGoodStdTypeId(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortGoodStandardType_WorkEffortGoodStdTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWorkEffortGoodStdTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortGoodStandardType#getWorkEffortGoodStdTypeId <em>Work Effort Good Std Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Good Std Type Id</em>' attribute.
	 * @see #getWorkEffortGoodStdTypeId()
	 * @generated
	 */
	void setWorkEffortGoodStdTypeId(String value);

} // WorkEffortGoodStandardType