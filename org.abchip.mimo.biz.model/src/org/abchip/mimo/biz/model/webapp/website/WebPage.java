/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.webapp.website;

import org.abchip.mimo.biz.model.content.content.Content;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getWebPageId <em>Web Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getPageName <em>Page Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getWebSite <em>Web Site</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebPage()
 * @model
 * @generated
 */
public interface WebPage extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Web Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Page Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Page Id</em>' attribute.
	 * @see #setWebPageId(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebPage_WebPageId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWebPageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getWebPageId <em>Web Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Page Id</em>' attribute.
	 * @see #getWebPageId()
	 * @generated
	 */
	void setWebPageId(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebPage_Content()
	 * @model
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Name</em>' attribute.
	 * @see #setPageName(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebPage_PageName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getPageName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getPageName <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Name</em>' attribute.
	 * @see #getPageName()
	 * @generated
	 */
	void setPageName(String value);

	/**
	 * Returns the value of the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site</em>' reference.
	 * @see #setWebSite(WebSite)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebPage_WebSite()
	 * @model
	 * @generated
	 */
	WebSite getWebSite();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getWebSite <em>Web Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site</em>' reference.
	 * @see #getWebSite()
	 * @generated
	 */
	void setWebSite(WebSite value);

} // WebPage
