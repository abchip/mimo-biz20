/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.shipment;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Gateway Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfigType#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfigType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfigType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfigType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ShipmentGatewayConfigType extends EntityType<ShipmentGatewayConfig>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfigType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType_HasTable()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfigType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(ShipmentGatewayConfigType)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType_ParentType()
	 * @model keys="shipmentGatewayConfTypeId"
	 * @generated
	 */
	ShipmentGatewayConfigType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfigType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(ShipmentGatewayConfigType value);

	/**
	 * Returns the value of the '<em><b>Shipment Gateway Conf Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Gateway Conf Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Gateway Conf Type Id</em>' attribute.
	 * @see #setShipmentGatewayConfTypeId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentGatewayConfigType_ShipmentGatewayConfTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentGatewayConfTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentGatewayConfigType#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Gateway Conf Type Id</em>' attribute.
	 * @see #getShipmentGatewayConfTypeId()
	 * @generated
	 */
	void setShipmentGatewayConfTypeId(String value);

} // ShipmentGatewayConfigType
