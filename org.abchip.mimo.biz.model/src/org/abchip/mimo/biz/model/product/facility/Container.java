/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.facility;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Container#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Container#getContainerGeoPoints <em>Container Geo Points</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Container#getContainerTypeId <em>Container Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Container#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.facility.Container#getFacilityId <em>Facility Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getContainer()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface Container extends EntityTyped<ContainerType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getContainer_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Container#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Container Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type Id</em>' reference.
	 * @see #setContainerTypeId(ContainerType)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getContainer_ContainerTypeId()
	 * @model keys="containerTypeId"
	 * @generated
	 */
	ContainerType getContainerTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Container#getContainerTypeId <em>Container Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Type Id</em>' reference.
	 * @see #getContainerTypeId()
	 * @generated
	 */
	void setContainerTypeId(ContainerType value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' reference.
	 * @see #setFacilityId(Facility)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getContainer_FacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Container#getFacilityId <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' reference.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Id</em>' attribute.
	 * @see #setContainerId(String)
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getContainer_ContainerId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContainerId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.facility.Container#getContainerId <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Id</em>' attribute.
	 * @see #getContainerId()
	 * @generated
	 */
	void setContainerId(String value);

	/**
	 * Returns the value of the '<em><b>Container Geo Points</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.facility.ContainerGeoPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Geo Points</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.facility.FacilityPackage#getContainer_ContainerGeoPoints()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ContainerGeoPoint> getContainerGeoPoints();

} // Container
