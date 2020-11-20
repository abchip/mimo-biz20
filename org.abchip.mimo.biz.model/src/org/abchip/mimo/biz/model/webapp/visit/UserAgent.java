/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.webapp.visit;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getUserAgentId <em>User Agent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getBrowserType <em>Browser Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getPlatformType <em>Platform Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getProtocolType <em>Protocol Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getUserAgentMethodType <em>User Agent Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getUserAgentType <em>User Agent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgent()
 * @model
 * @generated
 */
public interface UserAgent extends EntityTyped<UserAgentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>User Agent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Agent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Id</em>' attribute.
	 * @see #setUserAgentId(String)
	 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgent_UserAgentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getUserAgentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getUserAgentId <em>User Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Id</em>' attribute.
	 * @see #getUserAgentId()
	 * @generated
	 */
	void setUserAgentId(String value);

	/**
	 * Returns the value of the '<em><b>Browser Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browser Type</em>' reference.
	 * @see #setBrowserType(BrowserType)
	 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgent_BrowserType()
	 * @model
	 * @generated
	 */
	BrowserType getBrowserType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getBrowserType <em>Browser Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browser Type</em>' reference.
	 * @see #getBrowserType()
	 * @generated
	 */
	void setBrowserType(BrowserType value);

	/**
	 * Returns the value of the '<em><b>Platform Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Type</em>' reference.
	 * @see #setPlatformType(PlatformType)
	 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgent_PlatformType()
	 * @model
	 * @generated
	 */
	PlatformType getPlatformType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getPlatformType <em>Platform Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type</em>' reference.
	 * @see #getPlatformType()
	 * @generated
	 */
	void setPlatformType(PlatformType value);

	/**
	 * Returns the value of the '<em><b>Protocol Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Type</em>' reference.
	 * @see #setProtocolType(ProtocolType)
	 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgent_ProtocolType()
	 * @model
	 * @generated
	 */
	ProtocolType getProtocolType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getProtocolType <em>Protocol Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Type</em>' reference.
	 * @see #getProtocolType()
	 * @generated
	 */
	void setProtocolType(ProtocolType value);

	/**
	 * Returns the value of the '<em><b>User Agent Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Method Type</em>' reference.
	 * @see #setUserAgentMethodType(UserAgentMethodType)
	 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgent_UserAgentMethodType()
	 * @model
	 * @generated
	 */
	UserAgentMethodType getUserAgentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getUserAgentMethodType <em>User Agent Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Method Type</em>' reference.
	 * @see #getUserAgentMethodType()
	 * @generated
	 */
	void setUserAgentMethodType(UserAgentMethodType value);

	/**
	 * Returns the value of the '<em><b>User Agent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Type</em>' reference.
	 * @see #setUserAgentType(UserAgentType)
	 * @see org.abchip.mimo.biz.model.webapp.visit.VisitPackage#getUserAgent_UserAgentType()
	 * @model
	 * @generated
	 */
	UserAgentType getUserAgentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.visit.UserAgent#getUserAgentType <em>User Agent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Type</em>' reference.
	 * @see #getUserAgentType()
	 * @generated
	 */
	void setUserAgentType(UserAgentType value);

} // UserAgent
