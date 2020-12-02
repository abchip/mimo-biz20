/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.passport.impl;

import org.abchip.mimo.biz.model.passport.OAuth2LinkedIn;
import org.abchip.mimo.biz.model.passport.PassportPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OAuth2 Linked In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.passport.impl.OAuth2LinkedInImpl#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.impl.OAuth2LinkedInImpl#getLiveReturnUrl <em>Live Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.impl.OAuth2LinkedInImpl#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.impl.OAuth2LinkedInImpl#getTestReturnUrl <em>Test Return Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OAuth2LinkedInImpl extends OAuth2Impl implements OAuth2LinkedIn {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuth2LinkedInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PassportPackage.Literals.OAUTH2_LINKED_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiKey() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__API_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiKey(String newApiKey) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__API_KEY, newApiKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiveReturnUrl() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__LIVE_RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiveReturnUrl(String newLiveReturnUrl) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__LIVE_RETURN_URL, newLiveReturnUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecretKey() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__SECRET_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecretKey(String newSecretKey) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__SECRET_KEY, newSecretKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestReturnUrl() {
		return (String)eGet(PassportPackage.Literals.OAUTH2_LINKED_IN__TEST_RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestReturnUrl(String newTestReturnUrl) {
		eSet(PassportPackage.Literals.OAUTH2_LINKED_IN__TEST_RETURN_URL, newTestReturnUrl);
	}

} //OAuth2LinkedInImpl
