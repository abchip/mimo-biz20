/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getReturn <em>Return</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnContactMech()
 * @model annotation="mimo-ent-frame title='Retrun Contact Mechanism'"
 * @generated
 */
public interface ReturnContactMech extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(ReturnHeader)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnContactMech_Return()
	 * @model keys="returnId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ReturnHeader getReturn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnContactMech_ContactMech()
	 * @model keys="contactMechId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Purpose Type</em>' reference.
	 * @see #setContactMechPurposeType(ContactMechPurposeType)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnContactMech_ContactMechPurposeType()
	 * @model keys="contactMechPurposeTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMechPurposeType getContactMechPurposeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnContactMech#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Purpose Type</em>' reference.
	 * @see #getContactMechPurposeType()
	 * @generated
	 */
	void setContactMechPurposeType(ContactMechPurposeType value);

} // ReturnContactMech
