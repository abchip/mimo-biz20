/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.security.login;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.security.login.LoginPackage
 * @generated
 */
public interface LoginFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoginFactory eINSTANCE = org.abchip.mimo.biz.model.security.login.impl.LoginFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User Login</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Login</em>'.
	 * @generated
	 */
	UserLogin createUserLogin();

	/**
	 * Returns a new object of class '<em>User Login History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Login History</em>'.
	 * @generated
	 */
	UserLoginHistory createUserLoginHistory();

	/**
	 * Returns a new object of class '<em>User Login Password History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Login Password History</em>'.
	 * @generated
	 */
	UserLoginPasswordHistory createUserLoginPasswordHistory();

	/**
	 * Returns a new object of class '<em>User Login Security Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Login Security Question</em>'.
	 * @generated
	 */
	UserLoginSecurityQuestion createUserLoginSecurityQuestion();

	/**
	 * Returns a new object of class '<em>User Login Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Login Session</em>'.
	 * @generated
	 */
	UserLoginSession createUserLoginSession();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LoginPackage getLoginPackage();

} //LoginFactory
