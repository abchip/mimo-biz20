/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

import org.abchip.mimo.biz.model.party.communication.CommunicationEvent;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Event Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn#getReturn <em>Return</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn#getCommunicationEvent <em>Communication Event</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getCommunicationEventReturn()
 * @model
 * @generated
 */
public interface CommunicationEventReturn extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(ReturnHeader)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getCommunicationEventReturn_Return()
	 * @model keys="returnId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ReturnHeader getReturn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Communication Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event</em>' reference.
	 * @see #setCommunicationEvent(CommunicationEvent)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getCommunicationEventReturn_CommunicationEvent()
	 * @model keys="communicationEventId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	CommunicationEvent getCommunicationEvent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn#getCommunicationEvent <em>Communication Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event</em>' reference.
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	void setCommunicationEvent(CommunicationEvent value);

} // CommunicationEventReturn
