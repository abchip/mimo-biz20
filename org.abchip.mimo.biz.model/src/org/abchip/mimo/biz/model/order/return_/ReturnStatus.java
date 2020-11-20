/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturnStatusId <em>Return Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getChangeByUserLogin <em>Change By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturn <em>Return</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getStatusDatetime <em>Status Datetime</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnStatus()
 * @model annotation="mimo-ent-frame title='Return Status History'"
 * @generated
 */
public interface ReturnStatus extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #setReturnItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnStatus_ReturnItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnStatus_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Return Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Status Id</em>' attribute.
	 * @see #setReturnStatusId(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnStatus_ReturnStatusId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturnStatusId <em>Return Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Status Id</em>' attribute.
	 * @see #getReturnStatusId()
	 * @generated
	 */
	void setReturnStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login</em>' reference.
	 * @see #setChangeByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnStatus_ChangeByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getChangeByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getChangeByUserLogin <em>Change By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login</em>' reference.
	 * @see #getChangeByUserLogin()
	 * @generated
	 */
	void setChangeByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(ReturnHeader)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnStatus_Return()
	 * @model
	 * @generated
	 */
	ReturnHeader getReturn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Datetime</em>' attribute.
	 * @see #setStatusDatetime(Date)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnStatus_StatusDatetime()
	 * @model
	 * @generated
	 */
	Date getStatusDatetime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnStatus#getStatusDatetime <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Datetime</em>' attribute.
	 * @see #getStatusDatetime()
	 * @generated
	 */
	void setStatusDatetime(Date value);

} // ReturnStatus
