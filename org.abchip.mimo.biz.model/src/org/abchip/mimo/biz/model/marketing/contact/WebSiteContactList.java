/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.contact;

import java.util.Date;
import org.abchip.mimo.biz.model.webapp.website.WebSite;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site Contact List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList#getWebSite <em>Web Site</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList#getContactList <em>Contact List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getWebSiteContactList()
 * @model
 * @generated
 */
public interface WebSiteContactList extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site</em>' reference.
	 * @see #setWebSite(WebSite)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getWebSiteContactList_WebSite()
	 * @model keys="webSiteId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WebSite getWebSite();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList#getWebSite <em>Web Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site</em>' reference.
	 * @see #getWebSite()
	 * @generated
	 */
	void setWebSite(WebSite value);

	/**
	 * Returns the value of the '<em><b>Contact List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List</em>' reference.
	 * @see #setContactList(ContactList)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getWebSiteContactList_ContactList()
	 * @model keys="contactListId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContactList getContactList();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList#getContactList <em>Contact List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List</em>' reference.
	 * @see #getContactList()
	 * @generated
	 */
	void setContactList(ContactList value);

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
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getWebSiteContactList_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList#getFromDate <em>From Date</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage#getWebSiteContactList_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // WebSiteContactList
