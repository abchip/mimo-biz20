/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.theme;

import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Theme Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.theme.VisualThemeResource#getVisualTheme <em>Visual Theme</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.theme.VisualThemeResource#getResourceTypeEnum <em>Resource Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.theme.VisualThemeResource#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.theme.VisualThemeResource#getResourceValue <em>Resource Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualThemeResource()
 * @model annotation="mimo-ent-frame help='The VisualThemeResource entity contains visual theme\n          resources. Each visual theme can have any number of resources.' title='Contains All Visual Theme Resources'"
 * @generated
 */
public interface VisualThemeResource extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Visual Theme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Theme</em>' reference.
	 * @see #setVisualTheme(VisualTheme)
	 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualThemeResource_VisualTheme()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	VisualTheme getVisualTheme();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.theme.VisualThemeResource#getVisualTheme <em>Visual Theme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme</em>' reference.
	 * @see #getVisualTheme()
	 * @generated
	 */
	void setVisualTheme(VisualTheme value);

	/**
	 * Returns the value of the '<em><b>Resource Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type Enum</em>' reference.
	 * @see #setResourceTypeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualThemeResource_ResourceTypeEnum()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Enumeration getResourceTypeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.theme.VisualThemeResource#getResourceTypeEnum <em>Resource Type Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type Enum</em>' reference.
	 * @see #getResourceTypeEnum()
	 * @generated
	 */
	void setResourceTypeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Resource Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Value</em>' attribute.
	 * @see #setResourceValue(String)
	 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualThemeResource_ResourceValue()
	 * @model annotation="mimo-ent-slot help='Contains the resource value'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getResourceValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.theme.VisualThemeResource#getResourceValue <em>Resource Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Value</em>' attribute.
	 * @see #getResourceValue()
	 * @generated
	 */
	void setResourceValue(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Id</em>' attribute.
	 * @see #setSequenceId(String)
	 * @see org.abchip.mimo.biz.model.common.theme.ThemePackage#getVisualThemeResource_SequenceId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='Controls the loading order of duplicate resource types'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSequenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.theme.VisualThemeResource#getSequenceId <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Id</em>' attribute.
	 * @see #getSequenceId()
	 * @generated
	 */
	void setSequenceId(String value);

} // VisualThemeResource
