/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accommodation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationClass#getAccommodationClassId <em>Accommodation Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationClass#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationClass#getParentClass <em>Parent Class</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationClass()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface AccommodationClass extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationClass_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationClass#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Class</em>' reference.
	 * @see #setParentClass(AccommodationClass)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationClass_ParentClass()
	 * @model
	 * @generated
	 */
	AccommodationClass getParentClass();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationClass#getParentClass <em>Parent Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Class</em>' reference.
	 * @see #getParentClass()
	 * @generated
	 */
	void setParentClass(AccommodationClass value);

	/**
	 * Returns the value of the '<em><b>Accommodation Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Class Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Class Id</em>' attribute.
	 * @see #setAccommodationClassId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationClass_AccommodationClassId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAccommodationClassId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationClass#getAccommodationClassId <em>Accommodation Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Class Id</em>' attribute.
	 * @see #getAccommodationClassId()
	 * @generated
	 */
	void setAccommodationClassId(String value);

} // AccommodationClass
