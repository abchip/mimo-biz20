/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.picklist;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picklist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getPicklistId <em>Picklist Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getPicklistDate <em>Picklist Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getPicklistStatusHistories <em>Picklist Status Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getShipmentMethodType <em>Shipment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Picklist extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

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
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_Facility()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Picklist Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Date</em>' attribute.
	 * @see #setPicklistDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_PicklistDate()
	 * @model
	 * @generated
	 */
	Date getPicklistDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getPicklistDate <em>Picklist Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Date</em>' attribute.
	 * @see #getPicklistDate()
	 * @generated
	 */
	void setPicklistDate(Date value);

	/**
	 * Returns the value of the '<em><b>Picklist Status Histories</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.shipment.picklist.PicklistStatusHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Status Histories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Status Histories</em>' reference list.
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_PicklistStatusHistories()
	 * @model derived="true"
	 * @generated
	 */
	List<PicklistStatusHistory> getPicklistStatusHistories();

	/**
	 * Returns the value of the '<em><b>Shipment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type</em>' reference.
	 * @see #setShipmentMethodType(ShipmentMethodType)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_ShipmentMethodType()
	 * @model keys="shipmentMethodTypeId"
	 * @generated
	 */
	ShipmentMethodType getShipmentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getShipmentMethodType <em>Shipment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type</em>' reference.
	 * @see #getShipmentMethodType()
	 * @generated
	 */
	void setShipmentMethodType(ShipmentMethodType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Picklist Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Id</em>' attribute.
	 * @see #setPicklistId(String)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklist_PicklistId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPicklistId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.Picklist#getPicklistId <em>Picklist Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Id</em>' attribute.
	 * @see #getPicklistId()
	 * @generated
	 */
	void setPicklistId(String value);

} // Picklist
