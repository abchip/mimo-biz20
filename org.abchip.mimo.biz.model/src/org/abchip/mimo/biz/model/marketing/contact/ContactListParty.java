/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.contact;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact List Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getContactList <em>Contact List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getPreferredContactMech <em>Preferred Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListParty()
 * @model
 * @generated
 */
public interface ContactListParty extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Contact List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List</em>' reference.
	 * @see #setContactList(ContactList)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListParty_ContactList()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactList getContactList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getContactList <em>Contact List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List</em>' reference.
	 * @see #getContactList()
	 * @generated
	 */
	void setContactList(ContactList value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListParty_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListParty_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Preferred Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Contact Mech</em>' reference.
	 * @see #setPreferredContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListParty_PreferredContactMech()
	 * @model
	 * @generated
	 */
	ContactMech getPreferredContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getPreferredContactMech <em>Preferred Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Contact Mech</em>' reference.
	 * @see #getPreferredContactMech()
	 * @generated
	 */
	void setPreferredContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListParty_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getContactListParty_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.ContactListParty#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ContactListParty
