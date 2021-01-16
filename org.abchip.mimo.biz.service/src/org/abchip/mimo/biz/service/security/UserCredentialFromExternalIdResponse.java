/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security;

import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Credential From External Id Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse#getUser <em>User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getUserCredentialFromExternalIdResponse()
 * @model
 * @generated
 */
public interface UserCredentialFromExternalIdResponse extends ServiceResponse {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * The default value is <code>"@general/currency.uom.id.default"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getUserCredentialFromExternalIdResponse_User()
	 * @model default="@general/currency.uom.id.default" required="true"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>"@general/currency.uom.id.default"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getUserCredentialFromExternalIdResponse_Password()
	 * @model default="@general/currency.uom.id.default" required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalIdResponse#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // UserCredentialFromExternalIdResponse
