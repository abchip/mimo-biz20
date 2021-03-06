/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.receipt;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Receipt Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getReceipt <em>Receipt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getRoleTypeId <em>Role Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.receipt.ReceiptPackage#getShipmentReceiptRole()
 * @model
 * @generated
 */
public interface ShipmentReceiptRole extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt</em>' reference.
	 * @see #setReceipt(ShipmentReceipt)
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ReceiptPackage#getShipmentReceiptRole_Receipt()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ShipmentReceipt getReceipt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getReceipt <em>Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt</em>' reference.
	 * @see #getReceipt()
	 * @generated
	 */
	void setReceipt(ShipmentReceipt value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ReceiptPackage#getShipmentReceiptRole_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

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
	 * @see org.abchip.mimo.biz.model.shipment.receipt.ReceiptPackage#getShipmentReceiptRole_RoleTypeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceiptRole#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

} // ShipmentReceiptRole
