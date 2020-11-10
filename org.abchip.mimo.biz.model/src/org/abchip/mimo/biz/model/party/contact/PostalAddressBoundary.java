/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.contact;

import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddressBoundary#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.PostalAddressBoundary#getGeo <em>Geo</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddressBoundary()
 * @model
 * @generated
 */
public interface PostalAddressBoundary extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(PostalAddress)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddressBoundary_ContactMech()
	 * @model keys="contactMechId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PostalAddress getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddressBoundary#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(PostalAddress value);

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(Geo)
	 * @see org.abchip.mimo.biz.model.party.contact.ContactPackage#getPostalAddressBoundary_Geo()
	 * @model keys="geoId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Geo getGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.party.contact.PostalAddressBoundary#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(Geo value);

} // PostalAddressBoundary
