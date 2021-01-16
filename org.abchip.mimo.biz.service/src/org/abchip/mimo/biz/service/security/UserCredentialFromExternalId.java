/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.security;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Credential From External Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalId#getUserId <em>User Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getUserCredentialFromExternalId()
 * @model
 * @generated
 */
public interface UserCredentialFromExternalId extends ServiceRequest<UserCredentialFromExternalIdResponse> {
	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see org.abchip.mimo.biz.service.security.SecurityPackage#getUserCredentialFromExternalId_UserId()
	 * @model default="" required="true"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.security.UserCredentialFromExternalId#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

} // UserCredentialFromExternalId
