/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.passport;

import java.util.Date;
import org.abchip.mimo.authentication.OAuth2;
import org.abchip.mimo.biz.model.product.store.ProductStore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth2 Git Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getClientId <em>Client Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2GitHub()
 * @model annotation="mimo-ent-frame help='Data Model Enhancements For Passport' title='GitHub OAuth Login Config'"
 * @generated
 */
public interface OAuth2GitHub extends OAuth2 {
	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2GitHub_ProductStore()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2GitHub_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Id</em>' attribute.
	 * @see #setClientId(String)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2GitHub_ClientId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getClientId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getClientId <em>Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Id</em>' attribute.
	 * @see #getClientId()
	 * @generated
	 */
	void setClientId(String value);

	/**
	 * Returns the value of the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Secret</em>' attribute.
	 * @see #setClientSecret(String)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2GitHub_ClientSecret()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getClientSecret();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getClientSecret <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Secret</em>' attribute.
	 * @see #getClientSecret()
	 * @generated
	 */
	void setClientSecret(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2GitHub_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Url</em>' attribute.
	 * @see #setReturnUrl(String)
	 * @see org.abchip.mimo.biz.model.passport.PassportPackage#getOAuth2GitHub_ReturnUrl()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getReturnUrl <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Url</em>' attribute.
	 * @see #getReturnUrl()
	 * @generated
	 */
	void setReturnUrl(String value);

} // OAuth2GitHub
