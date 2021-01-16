/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.picklist;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picklist Status History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getPicklist <em>Picklist</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getChangeUserLogin <em>Change User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getStatusIdTo <em>Status Id To</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistStatusHistory()
 * @model
 * @generated
 */
public interface PicklistStatusHistory extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Picklist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist</em>' reference.
	 * @see #setPicklist(Picklist)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistStatusHistory_Picklist()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Picklist getPicklist();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getPicklist <em>Picklist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist</em>' reference.
	 * @see #getPicklist()
	 * @generated
	 */
	void setPicklist(Picklist value);

	/**
	 * Returns the value of the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Date</em>' attribute.
	 * @see #setChangeDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistStatusHistory_ChangeDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getChangeDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getChangeDate <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Date</em>' attribute.
	 * @see #getChangeDate()
	 * @generated
	 */
	void setChangeDate(Date value);

	/**
	 * Returns the value of the '<em><b>Change User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change User Login</em>' reference.
	 * @see #setChangeUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistStatusHistory_ChangeUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getChangeUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getChangeUserLogin <em>Change User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change User Login</em>' reference.
	 * @see #getChangeUserLogin()
	 * @generated
	 */
	void setChangeUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistStatusHistory_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Status Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id To</em>' reference.
	 * @see #setStatusIdTo(StatusItem)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistStatusHistory_StatusIdTo()
	 * @model
	 * @generated
	 */
	StatusItem getStatusIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory#getStatusIdTo <em>Status Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id To</em>' reference.
	 * @see #getStatusIdTo()
	 * @generated
	 */
	void setStatusIdTo(StatusItem value);

} // PicklistStatusHistory
