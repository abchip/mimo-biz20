/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.geo;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoAssoc#getGeo <em>Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoAssoc#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.geo.GeoAssoc#getGeoAssocType <em>Geo Assoc Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoAssoc()
 * @model annotation="mimo-ent-frame title='Geographic Boundary Association'"
 * @generated
 */
public interface GeoAssoc extends EntityTyped<GeoAssocType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(Geo)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoAssoc_Geo()
	 * @model keys="geoId" required="true"
	 *        annotation="mimo-ent-slot key='true' help='The enclosed geo'"
	 * @generated
	 */
	Geo getGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoAssoc#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Geo Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id To</em>' reference.
	 * @see #setGeoIdTo(Geo)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoAssoc_GeoIdTo()
	 * @model keys="geoId" required="true"
	 *        annotation="mimo-ent-slot key='true' help='The enclosing geo'"
	 * @generated
	 */
	Geo getGeoIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoAssoc#getGeoIdTo <em>Geo Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id To</em>' reference.
	 * @see #getGeoIdTo()
	 * @generated
	 */
	void setGeoIdTo(Geo value);

	/**
	 * Returns the value of the '<em><b>Geo Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Assoc Type</em>' reference.
	 * @see #setGeoAssocType(GeoAssocType)
	 * @see org.abchip.mimo.biz.model.common.geo.GeoPackage#getGeoAssoc_GeoAssocType()
	 * @model keys="geoAssocTypeId"
	 * @generated
	 */
	GeoAssocType getGeoAssocType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.geo.GeoAssoc#getGeoAssocType <em>Geo Assoc Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Assoc Type</em>' reference.
	 * @see #getGeoAssocType()
	 * @generated
	 */
	void setGeoAssocType(GeoAssocType value);

} // GeoAssoc
