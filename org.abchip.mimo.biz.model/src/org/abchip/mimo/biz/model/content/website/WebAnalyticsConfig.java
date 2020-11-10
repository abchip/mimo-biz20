/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.website;

import org.abchip.mimo.biz.model.webapp.website.WebSite;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Analytics Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig#getWebAnalyticsType <em>Web Analytics Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig#getWebSite <em>Web Site</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig#getWebAnalyticsCode <em>Web Analytics Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsConfig()
 * @model annotation="mimo-ent-frame title='Web Analytics Configuration'"
 * @generated
 */
public interface WebAnalyticsConfig extends EntityTyped<WebAnalyticsType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Web Analytics Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Analytics Type</em>' reference.
	 * @see #setWebAnalyticsType(WebAnalyticsType)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsConfig_WebAnalyticsType()
	 * @model keys="webAnalyticsTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WebAnalyticsType getWebAnalyticsType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig#getWebAnalyticsType <em>Web Analytics Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Analytics Type</em>' reference.
	 * @see #getWebAnalyticsType()
	 * @generated
	 */
	void setWebAnalyticsType(WebAnalyticsType value);

	/**
	 * Returns the value of the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site</em>' reference.
	 * @see #setWebSite(WebSite)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsConfig_WebSite()
	 * @model keys="webSiteId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WebSite getWebSite();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig#getWebSite <em>Web Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site</em>' reference.
	 * @see #getWebSite()
	 * @generated
	 */
	void setWebSite(WebSite value);

	/**
	 * Returns the value of the '<em><b>Web Analytics Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Analytics Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Analytics Code</em>' attribute.
	 * @see #setWebAnalyticsCode(String)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsConfig_WebAnalyticsCode()
	 * @model annotation="mimo-ent-slot help='copy in here the analitics javascript code without the beginning- and end&lt;script&gt; tags'"
	 * @generated
	 */
	String getWebAnalyticsCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig#getWebAnalyticsCode <em>Web Analytics Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Analytics Code</em>' attribute.
	 * @see #getWebAnalyticsCode()
	 * @generated
	 */
	void setWebAnalyticsCode(String value);

} // WebAnalyticsConfig
