/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.workeffort;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getWorkEffortAssocTypeAttrs <em>Work Effort Assoc Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssocType()
 * @model annotation="mimo-ent-frame title='Work Effort Association Type' dictionary='WorkEffortEntityLabels' formula='description'"
 * @generated
 */
public interface WorkEffortAssocType extends EntityType<WorkEffortAssoc>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssocType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssocType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentType(WorkEffortAssocType)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssocType_ParentType()
	 * @model keys="workEffortAssocTypeId"
	 * @generated
	 */
	WorkEffortAssocType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(WorkEffortAssocType value);

	/**
	 * Returns the value of the '<em><b>Work Effort Assoc Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Assoc Type Attrs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Assoc Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssocType_WorkEffortAssocTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortAssocTypeAttr> getWorkEffortAssocTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Work Effort Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Assoc Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Assoc Type Id</em>' attribute.
	 * @see #setWorkEffortAssocTypeId(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortAssocType_WorkEffortAssocTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWorkEffortAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAssocType#getWorkEffortAssocTypeId <em>Work Effort Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Assoc Type Id</em>' attribute.
	 * @see #getWorkEffortAssocTypeId()
	 * @generated
	 */
	void setWorkEffortAssocTypeId(String value);

} // WorkEffortAssocType
