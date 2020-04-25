/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service;

import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.BizServiceRequest#getUserLogin <em>User Login</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.BizServicePackage#getBizServiceRequest()
 * @model abstract="true"
 * @generated
 */
public interface BizServiceRequest<V extends ServiceResponse> extends ServiceRequest<V> {

	/**
	 * Returns the value of the '<em><b>User Login</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login</em>' containment reference.
	 * @see #setUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.service.BizServicePackage#getBizServiceRequest_UserLogin()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	UserLogin getUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.BizServiceRequest#getUserLogin <em>User Login</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login</em>' containment reference.
	 * @see #getUserLogin()
	 * @generated
	 */
	void setUserLogin(UserLogin value);
} // BizServiceRequest
