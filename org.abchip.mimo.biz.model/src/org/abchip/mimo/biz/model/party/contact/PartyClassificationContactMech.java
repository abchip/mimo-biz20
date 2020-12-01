/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.contact;

import java.util.Date;

import org.abchip.mimo.biz.model.party.party.PartyClassificationGroup;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Classification Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PartyClassificationContactMech#getPartyClassificationGroup <em>Party Classification Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PartyClassificationContactMech#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PartyClassificationContactMech#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PartyClassificationContactMech#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPartyClassificationContactMech()
 * @model annotation="mimo-ent-frame title='Party Classification Contact Mechanism'"
 * @generated
 */
public interface PartyClassificationContactMech extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Party Classification Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Classification Group</em>' reference.
	 * @see #setPartyClassificationGroup(PartyClassificationGroup)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPartyClassificationContactMech_PartyClassificationGroup()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PartyClassificationGroup getPartyClassificationGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PartyClassificationContactMech#getPartyClassificationGroup <em>Party Classification Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Classification Group</em>' reference.
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	void setPartyClassificationGroup(PartyClassificationGroup value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPartyClassificationContactMech_ContactMech()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PartyClassificationContactMech#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPartyClassificationContactMech_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PartyClassificationContactMech#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPartyClassificationContactMech_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PartyClassificationContactMech#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // PartyClassificationContactMech
