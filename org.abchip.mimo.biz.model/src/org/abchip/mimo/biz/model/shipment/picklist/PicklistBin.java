/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.picklist;

import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picklist Bin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getPicklistBinId <em>Picklist Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getBinLocationNumber <em>Bin Location Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getPicklist <em>Picklist</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getPrimaryOrder <em>Primary Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistBin()
 * @model annotation="mimo-ent-frame title='Picklist'"
 * @generated
 */
public interface PicklistBin extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Bin Location Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Location Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Location Number</em>' attribute.
	 * @see #setBinLocationNumber(long)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistBin_BinLocationNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getBinLocationNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getBinLocationNumber <em>Bin Location Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Location Number</em>' attribute.
	 * @see #getBinLocationNumber()
	 * @generated
	 */
	void setBinLocationNumber(long value);

	/**
	 * Returns the value of the '<em><b>Picklist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist</em>' reference.
	 * @see #setPicklist(Picklist)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistBin_Picklist()
	 * @model keys="picklistId"
	 * @generated
	 */
	Picklist getPicklist();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getPicklist <em>Picklist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist</em>' reference.
	 * @see #getPicklist()
	 * @generated
	 */
	void setPicklist(Picklist value);

	/**
	 * Returns the value of the '<em><b>Primary Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Order</em>' reference.
	 * @see #setPrimaryOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistBin_PrimaryOrder()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getPrimaryOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getPrimaryOrder <em>Primary Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Order</em>' reference.
	 * @see #getPrimaryOrder()
	 * @generated
	 */
	void setPrimaryOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Picklist Bin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Bin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Bin Id</em>' attribute.
	 * @see #setPicklistBinId(String)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistBin_PicklistBinId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPicklistBinId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getPicklistBinId <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Bin Id</em>' attribute.
	 * @see #getPicklistBinId()
	 * @generated
	 */
	void setPicklistBinId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Ship Group Seq Id</em>' attribute.
	 * @see #setPrimaryShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.model.shipment.picklist.PicklistPackage#getPicklistBin_PrimaryShipGroupSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPrimaryShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.picklist.PicklistBin#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Ship Group Seq Id</em>' attribute.
	 * @see #getPrimaryShipGroupSeqId()
	 * @generated
	 */
	void setPrimaryShipGroupSeqId(String value);

} // PicklistBin
