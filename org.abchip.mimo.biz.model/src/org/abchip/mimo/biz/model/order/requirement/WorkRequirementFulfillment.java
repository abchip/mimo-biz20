/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.requirement;

import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Requirement Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getWorkEffort <em>Work Effort</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getWorkReqFulfType <em>Work Req Fulf Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getWorkRequirementFulfillment()
 * @model
 * @generated
 */
public interface WorkRequirementFulfillment extends EntityTyped<WorkReqFulfType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getWorkRequirementFulfillment_Requirement()
	 * @model keys="requirementId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getWorkRequirementFulfillment_WorkEffort()
	 * @model keys="workEffortId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Work Req Fulf Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Req Fulf Type</em>' reference.
	 * @see #setWorkReqFulfType(WorkReqFulfType)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getWorkRequirementFulfillment_WorkReqFulfType()
	 * @model keys="workReqFulfTypeId"
	 * @generated
	 */
	WorkReqFulfType getWorkReqFulfType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment#getWorkReqFulfType <em>Work Req Fulf Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Req Fulf Type</em>' reference.
	 * @see #getWorkReqFulfType()
	 * @generated
	 */
	void setWorkReqFulfType(WorkReqFulfType value);

} // WorkRequirementFulfillment
