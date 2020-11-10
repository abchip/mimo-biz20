/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.request;

import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Item Work Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestItemWorkEffort#getCustRequest <em>Cust Request</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestItemWorkEffort#getWorkEffort <em>Work Effort</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestItemWorkEffort#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestItemWorkEffort()
 * @model
 * @generated
 */
public interface CustRequestItemWorkEffort extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Cust Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request</em>' reference.
	 * @see #setCustRequest(CustRequest)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestItemWorkEffort_CustRequest()
	 * @model keys="custRequestId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CustRequest getCustRequest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestItemWorkEffort#getCustRequest <em>Cust Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request</em>' reference.
	 * @see #getCustRequest()
	 * @generated
	 */
	void setCustRequest(CustRequest value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestItemWorkEffort_WorkEffort()
	 * @model keys="workEffortId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestItemWorkEffort#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #setCustRequestItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestItemWorkEffort_CustRequestItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCustRequestItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestItemWorkEffort#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 */
	void setCustRequestItemSeqId(String value);

} // CustRequestItemWorkEffort
