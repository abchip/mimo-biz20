/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.status;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Valid Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusValidChange#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusValidChange#getStatusIdTo <em>Status Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusValidChange#getConditionExpression <em>Condition Expression</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.status.StatusValidChange#getTransitionName <em>Transition Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusValidChange()
 * @model annotation="mimo-ent-frame dictionary='CommonEntityLabels'"
 * @generated
 */
public interface StatusValidChange extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusValidChange_Status()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusValidChange#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Condition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Expression</em>' attribute.
	 * @see #setConditionExpression(String)
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusValidChange_ConditionExpression()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConditionExpression();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusValidChange#getConditionExpression <em>Condition Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Expression</em>' attribute.
	 * @see #getConditionExpression()
	 * @generated
	 */
	void setConditionExpression(String value);

	/**
	 * Returns the value of the '<em><b>Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Name</em>' attribute.
	 * @see #setTransitionName(String)
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusValidChange_TransitionName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getTransitionName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusValidChange#getTransitionName <em>Transition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Name</em>' attribute.
	 * @see #getTransitionName()
	 * @generated
	 */
	void setTransitionName(String value);

	/**
	 * Returns the value of the '<em><b>Status Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id To</em>' reference.
	 * @see #setStatusIdTo(StatusItem)
	 * @see org.abchip.mimo.biz.model.common.status.StatusPackage#getStatusValidChange_StatusIdTo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	StatusItem getStatusIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.status.StatusValidChange#getStatusIdTo <em>Status Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id To</em>' reference.
	 * @see #getStatusIdTo()
	 * @generated
	 */
	void setStatusIdTo(StatusItem value);

} // StatusValidChange
