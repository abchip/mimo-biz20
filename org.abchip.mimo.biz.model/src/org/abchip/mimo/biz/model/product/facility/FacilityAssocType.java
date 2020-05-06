/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityAssocType#getFacilityAssocTypeId <em>Facility Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.FacilityAssocType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityAssocType()
 * @model annotation="mimo-ent-frame title='Define associations between facilities' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface FacilityAssocType extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Facility Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Assoc Type Id</em>' attribute.
	 * @see #setFacilityAssocTypeId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityAssocType_FacilityAssocTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFacilityAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityAssocType#getFacilityAssocTypeId <em>Facility Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Assoc Type Id</em>' attribute.
	 * @see #getFacilityAssocTypeId()
	 * @generated
	 */
	void setFacilityAssocTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getFacilityAssocType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.FacilityAssocType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // FacilityAssocType
