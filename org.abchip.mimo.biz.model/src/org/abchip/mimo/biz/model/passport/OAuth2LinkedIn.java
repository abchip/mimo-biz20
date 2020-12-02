/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.passport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2 Linked In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getApiKey <em>Api Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getLiveReturnUrl <em>Live Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getTestReturnUrl <em>Test Return Url</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2LinkedIn()
 * @model annotation="mimo-ent-frame help='Data Model Enhancements For Passport' title='LinkedIn OAuth Login Config'"
 * @generated
 */
public interface OAuth2LinkedIn extends OAuth2 {
	/**
	 * Returns the value of the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Key</em>' attribute.
	 * @see #setApiKey(String)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2LinkedIn_ApiKey()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getApiKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getApiKey <em>Api Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Key</em>' attribute.
	 * @see #getApiKey()
	 * @generated
	 */
	void setApiKey(String value);

	/**
	 * Returns the value of the '<em><b>Live Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Live Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Live Return Url</em>' attribute.
	 * @see #setLiveReturnUrl(String)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2LinkedIn_LiveReturnUrl()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLiveReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getLiveReturnUrl <em>Live Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Live Return Url</em>' attribute.
	 * @see #getLiveReturnUrl()
	 * @generated
	 */
	void setLiveReturnUrl(String value);

	/**
	 * Returns the value of the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Key</em>' attribute.
	 * @see #setSecretKey(String)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2LinkedIn_SecretKey()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSecretKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getSecretKey <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key</em>' attribute.
	 * @see #getSecretKey()
	 * @generated
	 */
	void setSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Test Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Return Url</em>' attribute.
	 * @see #setTestReturnUrl(String)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2LinkedIn_TestReturnUrl()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTestReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getTestReturnUrl <em>Test Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Return Url</em>' attribute.
	 * @see #getTestReturnUrl()
	 * @generated
	 */
	void setTestReturnUrl(String value);

} // OAuth2LinkedIn
