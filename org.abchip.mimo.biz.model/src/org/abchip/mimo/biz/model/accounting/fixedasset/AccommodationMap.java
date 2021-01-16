/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accommodation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getAccommodationMapId <em>Accommodation Map Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getAccommodationClass <em>Accommodation Class</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getAccommodationMapType <em>Accommodation Map Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getNumberOfSpaces <em>Number Of Spaces</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationMap()
 * @model
 * @generated
 */
public interface AccommodationMap extends EntityTyped<AccommodationMapType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Accommodation Map Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accommodation Map Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Map Id</em>' attribute.
	 * @see #setAccommodationMapId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationMap_AccommodationMapId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAccommodationMapId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getAccommodationMapId <em>Accommodation Map Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Map Id</em>' attribute.
	 * @see #getAccommodationMapId()
	 * @generated
	 */
	void setAccommodationMapId(String value);

	/**
	 * Returns the value of the '<em><b>Accommodation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Class</em>' reference.
	 * @see #setAccommodationClass(AccommodationClass)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationMap_AccommodationClass()
	 * @model
	 * @generated
	 */
	AccommodationClass getAccommodationClass();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getAccommodationClass <em>Accommodation Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Class</em>' reference.
	 * @see #getAccommodationClass()
	 * @generated
	 */
	void setAccommodationClass(AccommodationClass value);

	/**
	 * Returns the value of the '<em><b>Accommodation Map Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Map Type</em>' reference.
	 * @see #setAccommodationMapType(AccommodationMapType)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationMap_AccommodationMapType()
	 * @model
	 * @generated
	 */
	AccommodationMapType getAccommodationMapType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getAccommodationMapType <em>Accommodation Map Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Map Type</em>' reference.
	 * @see #getAccommodationMapType()
	 * @generated
	 */
	void setAccommodationMapType(AccommodationMapType value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset</em>' reference.
	 * @see #setFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationMap_FixedAsset()
	 * @model
	 * @generated
	 */
	FixedAsset getFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getFixedAsset <em>Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset</em>' reference.
	 * @see #getFixedAsset()
	 * @generated
	 */
	void setFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Number Of Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Spaces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Spaces</em>' attribute.
	 * @see #setNumberOfSpaces(long)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getAccommodationMap_NumberOfSpaces()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumberOfSpaces();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap#getNumberOfSpaces <em>Number Of Spaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Spaces</em>' attribute.
	 * @see #getNumberOfSpaces()
	 * @generated
	 */
	void setNumberOfSpaces(long value);

} // AccommodationMap
