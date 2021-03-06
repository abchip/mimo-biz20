/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.contact;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.marketing.contact.ContactPackage
 * @generated
 */
public interface ContactFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContactFactory eINSTANCE = org.abchip.mimo.biz.model.marketing.contact.impl.ContactFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	ContactList createContactList();

	/**
	 * Returns a new object of class '<em>List Comm Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Comm Status</em>'.
	 * @generated
	 */
	ContactListCommStatus createContactListCommStatus();

	/**
	 * Returns a new object of class '<em>List Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Party</em>'.
	 * @generated
	 */
	ContactListParty createContactListParty();

	/**
	 * Returns a new object of class '<em>List Party Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Party Status</em>'.
	 * @generated
	 */
	ContactListPartyStatus createContactListPartyStatus();

	/**
	 * Returns a new object of class '<em>List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Type</em>'.
	 * @generated
	 */
	ContactListType createContactListType();

	/**
	 * Returns a new object of class '<em>Web Site Contact List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site Contact List</em>'.
	 * @generated
	 */
	WebSiteContactList createWebSiteContactList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContactPackage getContactPackage();

} //ContactFactory
