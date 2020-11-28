/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.contact;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.EmailAddress#getEmailAddress <em>Email Address</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getEmailAddress()
 * @model annotation="mimo-ent-frame-type contactMechType='EMAIL_ADDRESS'"
 * @generated
 */
public interface EmailAddress extends ContactMech {
	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getEmailAddress_EmailAddress()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.EmailAddress#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

} // EmailAddress
