/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.shipment;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Shipment Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentBoxType#getShipmentBoxType <em>Shipment Box Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentBoxType#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentBoxType#getOversizeCode <em>Oversize Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentBoxType#getPackagingTypeCode <em>Packaging Type Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType()
 * @model annotation="mimo-ent-frame title='Carrier Shipment Method'"
 * @generated
 */
public interface CarrierShipmentBoxType extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Shipment Box Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Box Type</em>' reference.
	 * @see #setShipmentBoxType(ShipmentBoxType)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType_ShipmentBoxType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ShipmentBoxType getShipmentBoxType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentBoxType#getShipmentBoxType <em>Shipment Box Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Box Type</em>' reference.
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	void setShipmentBoxType(ShipmentBoxType value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentBoxType#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Oversize Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oversize Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oversize Code</em>' attribute.
	 * @see #setOversizeCode(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType_OversizeCode()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getOversizeCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentBoxType#getOversizeCode <em>Oversize Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oversize Code</em>' attribute.
	 * @see #getOversizeCode()
	 * @generated
	 */
	void setOversizeCode(String value);

	/**
	 * Returns the value of the '<em><b>Packaging Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaging Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging Type Code</em>' attribute.
	 * @see #setPackagingTypeCode(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType_PackagingTypeCode()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPackagingTypeCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.CarrierShipmentBoxType#getPackagingTypeCode <em>Packaging Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging Type Code</em>' attribute.
	 * @see #getPackagingTypeCode()
	 * @generated
	 */
	void setPackagingTypeCode(String value);

} // CarrierShipmentBoxType
