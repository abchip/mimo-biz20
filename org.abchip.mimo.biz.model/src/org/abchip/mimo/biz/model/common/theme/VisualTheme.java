/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.theme;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Theme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.theme.VisualTheme#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.theme.VisualTheme#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.theme.VisualTheme#getVisualThemeSet <em>Visual Theme Set</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualTheme()
 * @model annotation="mimo-ent-frame help='The VisualTheme entity contains one entry per visual theme.' title='Defines a Visual Theme' dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface VisualTheme extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualTheme_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.theme.VisualTheme#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Visual Theme Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Theme Set</em>' reference.
	 * @see #setVisualThemeSet(VisualThemeSet)
	 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualTheme_VisualThemeSet()
	 * @model keys="visualThemeSetId"
	 * @generated
	 */
	VisualThemeSet getVisualThemeSet();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.theme.VisualTheme#getVisualThemeSet <em>Visual Theme Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme Set</em>' reference.
	 * @see #getVisualThemeSet()
	 * @generated
	 */
	void setVisualThemeSet(VisualThemeSet value);

	/**
	 * Returns the value of the '<em><b>Visual Theme Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Theme Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Theme Id</em>' attribute.
	 * @see #setVisualThemeId(String)
	 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualTheme_VisualThemeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisualThemeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.theme.VisualTheme#getVisualThemeId <em>Visual Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme Id</em>' attribute.
	 * @see #getVisualThemeId()
	 * @generated
	 */
	void setVisualThemeId(String value);

} // VisualTheme
