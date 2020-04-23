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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The cached value of the '{@link #getUserLogin() <em>User Login</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin userLogin;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	@Override
	public UserLogin getUserLogin() {
		if (userLogin != null && ((EObject)userLogin).eIsProxy()) {
			InternalEObject oldUserLogin = (InternalEObject)userLogin;
			userLogin = (UserLogin)eResolveProxy(oldUserLogin);
			if (userLogin != oldUserLogin) {
				InternalEObject newUserLogin = (InternalEObject)userLogin;
				NotificationChain msgs = oldUserLogin.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN, null, null);
				if (newUserLogin.eInternalContainer() == null) {
					msgs = newUserLogin.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN, oldUserLogin, userLogin));
			}
		}
		return userLogin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetUserLogin() {
		return userLogin;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserLogin(UserLogin newUserLogin, NotificationChain msgs) {
		UserLogin oldUserLogin = userLogin;
		userLogin = newUserLogin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN, oldUserLogin, newUserLogin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN:
				return basicSetUserLogin(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN:
				if (resolve) return getUserLogin();
				return basicGetUserLogin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BizServicePackage.BIZ_SERVICE_REQUEST__USER_LOGIN:
				return userLogin != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void init(Context context, String tenant) {
		if (isPrepared())
			throw new UnsupportedOperationException("Request already prepared");

		this.context = context;

		this.tenant = tenant;

		ContextDescription contextDescription = context.getContextDescription();
		this.locale = contextDescription.getLocale();
		this.userLogin = context.createProxy(UserLogin.class, contextDescription.getUser());
	}

	@Override
	public V prepareResponse() {

		// TODO
		return null;
	}

} // BizServiceRequestImpl
