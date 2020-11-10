/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.screen;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Screen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getCustomScreenId <em>Custom Screen Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getCustomScreenLocation <em>Custom Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getCustomScreenName <em>Custom Screen Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getCustomScreenType <em>Custom Screen Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.screen.ScreenPackage#getCustomScreen()
 * @model annotation="mimo-ent-frame dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface CustomScreen extends EntityTyped<CustomScreenType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Custom Screen Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Screen Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Screen Id</em>' attribute.
	 * @see #setCustomScreenId(String)
	 * @see org.abchip.mimo.biz.model.common.screen.ScreenPackage#getCustomScreen_CustomScreenId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCustomScreenId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getCustomScreenId <em>Custom Screen Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Screen Id</em>' attribute.
	 * @see #getCustomScreenId()
	 * @generated
	 */
	void setCustomScreenId(String value);

	/**
	 * Returns the value of the '<em><b>Custom Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Screen Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Screen Location</em>' attribute.
	 * @see #setCustomScreenLocation(String)
	 * @see org.abchip.mimo.biz.model.common.screen.ScreenPackage#getCustomScreen_CustomScreenLocation()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCustomScreenLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getCustomScreenLocation <em>Custom Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Screen Location</em>' attribute.
	 * @see #getCustomScreenLocation()
	 * @generated
	 */
	void setCustomScreenLocation(String value);

	/**
	 * Returns the value of the '<em><b>Custom Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Screen Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Screen Name</em>' attribute.
	 * @see #setCustomScreenName(String)
	 * @see org.abchip.mimo.biz.model.common.screen.ScreenPackage#getCustomScreen_CustomScreenName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCustomScreenName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getCustomScreenName <em>Custom Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Screen Name</em>' attribute.
	 * @see #getCustomScreenName()
	 * @generated
	 */
	void setCustomScreenName(String value);

	/**
	 * Returns the value of the '<em><b>Custom Screen Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Screen Type</em>' reference.
	 * @see #setCustomScreenType(CustomScreenType)
	 * @see org.abchip.mimo.biz.model.common.screen.ScreenPackage#getCustomScreen_CustomScreenType()
	 * @model keys="customScreenTypeId"
	 * @generated
	 */
	CustomScreenType getCustomScreenType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getCustomScreenType <em>Custom Screen Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Screen Type</em>' reference.
	 * @see #getCustomScreenType()
	 * @generated
	 */
	void setCustomScreenType(CustomScreenType value);

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
	 * @see org.abchip.mimo.biz.model.common.screen.ScreenPackage#getCustomScreen_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.screen.CustomScreen#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CustomScreen
