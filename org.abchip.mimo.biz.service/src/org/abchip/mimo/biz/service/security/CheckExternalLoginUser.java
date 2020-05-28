/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check External Login User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getEmail <em>Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getUserId <em>User Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getCheckExternalLoginUser()
 * @model
 * @generated
 */
public interface CheckExternalLoginUser extends ServiceRequest<CheckExternalLoginUserResponse> {
	/**
	 * Returns the value of the '<em><b>Access Token</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token</em>' attribute.
	 * @see #setAccessToken(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getCheckExternalLoginUser_AccessToken()
	 * @model default="" required="true"
	 * @generated
	 */
	String getAccessToken();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getAccessToken <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token</em>' attribute.
	 * @see #getAccessToken()
	 * @generated
	 */
	void setAccessToken(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getCheckExternalLoginUser_Email()
	 * @model default="" required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getCheckExternalLoginUser_FirstName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getCheckExternalLoginUser_LastName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getCheckExternalLoginUser_Provider()
	 * @model default="" required="true"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getCheckExternalLoginUser_UserId()
	 * @model default="" required="true"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.CheckExternalLoginUser#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

} // CheckExternalLoginUser
