/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.impl;

import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.biz.service.BizServicePackage;
import org.abchip.mimo.biz.service.BizServiceRequest;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Request</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.impl.BizServiceRequestImpl#getUserLogin <em>User Login</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BizServiceRequestImpl<V extends ServiceResponse> extends ServiceRequestImpl<V> implements BizServiceRequest<V> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BizServiceRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BizServicePackage.Literals.BIZ_SERVICE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLogin() {
		return (UserLogin)eGet(BizServicePackage.Literals.BIZ_SERVICE_REQUEST__USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLogin(UserLogin newUserLogin) {
		eSet(BizServicePackage.Literals.BIZ_SERVICE_REQUEST__USER_LOGIN, newUserLogin);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void init(Context context, String tenant) {

		super.init(context, tenant);

		ContextDescription contextDescription = context.getContextDescription();
		this.setUserLogin(context.createProxy(UserLogin.class, contextDescription.getUser(), tenant));
	}
} // BizServiceRequestImpl
