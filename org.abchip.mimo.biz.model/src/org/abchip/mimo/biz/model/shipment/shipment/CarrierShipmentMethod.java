/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.shipment;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Shipment Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getShipmentMethodType <em>Shipment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getCarrierServiceCode <em>Carrier Service Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentMethod()
 * @model
 * @generated
 */
public interface CarrierShipmentMethod extends EntityTyped<ShipmentMethodType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Shipment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type</em>' reference.
	 * @see #setShipmentMethodType(ShipmentMethodType)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentMethod_ShipmentMethodType()
	 * @model keys="shipmentMethodTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ShipmentMethodType getShipmentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getShipmentMethodType <em>Shipment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type</em>' reference.
	 * @see #getShipmentMethodType()
	 * @generated
	 */
	void setShipmentMethodType(ShipmentMethodType value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentMethod_Party()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Carrier Service Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Service Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Service Code</em>' attribute.
	 * @see #setCarrierServiceCode(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentMethod_CarrierServiceCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCarrierServiceCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getCarrierServiceCode <em>Carrier Service Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Service Code</em>' attribute.
	 * @see #getCarrierServiceCode()
	 * @generated
	 */
	void setCarrierServiceCode(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentMethod_RoleTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Number</em>' attribute.
	 * @see #setSequenceNumber(long)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentMethod_SequenceNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentMethod#getSequenceNumber <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Number</em>' attribute.
	 * @see #getSequenceNumber()
	 * @generated
	 */
	void setSequenceNumber(long value);

} // CarrierShipmentMethod
