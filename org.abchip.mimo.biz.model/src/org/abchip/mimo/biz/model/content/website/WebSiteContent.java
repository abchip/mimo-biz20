/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.website;

import java.util.Date;
import org.abchip.mimo.biz.model.content.content.Content;
import org.abchip.mimo.biz.model.webapp.website.WebSite;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getWebSite <em>Web Site</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getWebSiteContentType <em>Web Site Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebSiteContent()
 * @model annotation="mimo-ent-frame title='Web Site Content Associations'"
 * @generated
 */
public interface WebSiteContent extends EntityTyped<WebSiteContentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site</em>' reference.
	 * @see #setWebSite(WebSite)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebSiteContent_WebSite()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WebSite getWebSite();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getWebSite <em>Web Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site</em>' reference.
	 * @see #getWebSite()
	 * @generated
	 */
	void setWebSite(WebSite value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebSiteContent_Content()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Web Site Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Content Type</em>' reference.
	 * @see #setWebSiteContentType(WebSiteContentType)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebSiteContent_WebSiteContentType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WebSiteContentType getWebSiteContentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getWebSiteContentType <em>Web Site Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Content Type</em>' reference.
	 * @see #getWebSiteContentType()
	 * @generated
	 */
	void setWebSiteContentType(WebSiteContentType value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebSiteContent_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebSiteContent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebSiteContent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // WebSiteContent
