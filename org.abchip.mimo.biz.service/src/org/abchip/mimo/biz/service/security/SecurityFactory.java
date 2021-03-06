/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.service.security.SecurityPackage
 * @generated
 */
public interface SecurityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityFactory eINSTANCE = org.abchip.mimo.biz.service.security.impl.SecurityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Check External Login User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check External Login User</em>'.
	 * @generated
	 */
	CheckExternalLoginUser createCheckExternalLoginUser();

	/**
	 * Returns a new object of class '<em>Check External Login User Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check External Login User Response</em>'.
	 * @generated
	 */
	CheckExternalLoginUserResponse createCheckExternalLoginUserResponse();

	/**
	 * Returns a new object of class '<em>User Credential From External Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Credential From External Id</em>'.
	 * @generated
	 */
	UserCredentialFromExternalId createUserCredentialFromExternalId();

	/**
	 * Returns a new object of class '<em>User Credential From External Id Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Credential From External Id Response</em>'.
	 * @generated
	 */
	UserCredentialFromExternalIdResponse createUserCredentialFromExternalIdResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPackage getSecurityPackage();

} //SecurityFactory
