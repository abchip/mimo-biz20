/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.website;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Analytics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsType#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface WebAnalyticsType extends EntityType<WebAnalyticsConfig>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(WebAnalyticsType)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsType_ParentType()
	 * @model keys="webAnalyticsTypeId"
	 * @generated
	 */
	WebAnalyticsType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(WebAnalyticsType value);

	/**
	 * Returns the value of the '<em><b>Web Analytics Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Analytics Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Analytics Type Id</em>' attribute.
	 * @see #setWebAnalyticsTypeId(String)
	 * @see org.abchip.mimo.biz.model.content.website.WebsitePackage#getWebAnalyticsType_WebAnalyticsTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWebAnalyticsTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.website.WebAnalyticsType#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Analytics Type Id</em>' attribute.
	 * @see #getWebAnalyticsTypeId()
	 * @generated
	 */
	void setWebAnalyticsTypeId(String value);

} // WebAnalyticsType
