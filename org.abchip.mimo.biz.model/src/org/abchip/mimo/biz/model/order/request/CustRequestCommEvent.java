/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.request;

import org.abchip.mimo.biz.model.party.communication.CommunicationEvent;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Comm Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestCommEvent#getCustRequest <em>Cust Request</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.request.CustRequestCommEvent#getCommunicationEvent <em>Communication Event</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestCommEvent()
 * @model annotation="mimo-ent-frame title='Customer Request Communication Event'"
 * @generated
 */
public interface CustRequestCommEvent extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Cust Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request</em>' reference.
	 * @see #setCustRequest(CustRequest)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestCommEvent_CustRequest()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CustRequest getCustRequest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestCommEvent#getCustRequest <em>Cust Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request</em>' reference.
	 * @see #getCustRequest()
	 * @generated
	 */
	void setCustRequest(CustRequest value);

	/**
	 * Returns the value of the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event</em>' reference.
	 * @see #setCommunicationEvent(CommunicationEvent)
	 * @see org.abchip.mimo.biz.model.order.request.RequestPackage#getCustRequestCommEvent_CommunicationEvent()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CommunicationEvent getCommunicationEvent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.request.CustRequestCommEvent#getCommunicationEvent <em>Communication Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event</em>' reference.
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	void setCommunicationEvent(CommunicationEvent value);

} // CustRequestCommEvent
