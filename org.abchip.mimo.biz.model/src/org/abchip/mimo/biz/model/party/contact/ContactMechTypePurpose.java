/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.contact;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Mech Type Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.ContactMechTypePurpose#getContactMechType <em>Contact Mech Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.ContactMechTypePurpose#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getContactMechTypePurpose()
 * @model annotation="mimo-ent-frame help='Defines which ContactMechPurposeType entites apply to which ContactMechType' title='Contact Mechanism Type Purpose'"
 * @generated
 */
public interface ContactMechTypePurpose extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Contact Mech Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type</em>' reference.
	 * @see #setContactMechType(ContactMechType)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getContactMechTypePurpose_ContactMechType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMechType getContactMechType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.ContactMechTypePurpose#getContactMechType <em>Contact Mech Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type</em>' reference.
	 * @see #getContactMechType()
	 * @generated
	 */
	void setContactMechType(ContactMechType value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Purpose Type</em>' reference.
	 * @see #setContactMechPurposeType(ContactMechPurposeType)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getContactMechTypePurpose_ContactMechPurposeType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMechPurposeType getContactMechPurposeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.ContactMechTypePurpose#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Purpose Type</em>' reference.
	 * @see #getContactMechPurposeType()
	 * @generated
	 */
	void setContactMechPurposeType(ContactMechPurposeType value);

} // ContactMechTypePurpose
