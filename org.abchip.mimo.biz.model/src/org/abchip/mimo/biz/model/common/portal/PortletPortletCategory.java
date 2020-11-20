/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.portal;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portlet Portlet Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.portal.PortletPortletCategory#getPortalPortlet <em>Portal Portlet</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.portal.PortletPortletCategory#getPortletCategory <em>Portlet Category</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.portal.PortalPackage#getPortletPortletCategory()
 * @model annotation="mimo-ent-frame title='Defines Portlets included into Categories'"
 * @generated
 */
public interface PortletPortletCategory extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Portal Portlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Portlet</em>' reference.
	 * @see #setPortalPortlet(PortalPortlet)
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPackage#getPortletPortletCategory_PortalPortlet()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PortalPortlet getPortalPortlet();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.portal.PortletPortletCategory#getPortalPortlet <em>Portal Portlet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Portlet</em>' reference.
	 * @see #getPortalPortlet()
	 * @generated
	 */
	void setPortalPortlet(PortalPortlet value);

	/**
	 * Returns the value of the '<em><b>Portlet Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portlet Category</em>' reference.
	 * @see #setPortletCategory(PortletCategory)
	 * @see org.abchip.mimo.biz.model.common.portal.PortalPackage#getPortletPortletCategory_PortletCategory()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PortletCategory getPortletCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.portal.PortletPortletCategory#getPortletCategory <em>Portlet Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portlet Category</em>' reference.
	 * @see #getPortletCategory()
	 * @generated
	 */
	void setPortletCategory(PortletCategory value);

} // PortletPortletCategory
