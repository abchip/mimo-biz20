/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.order.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;
import org.abchip.mimo.biz.service.order.OrderPackage;
import org.abchip.mimo.biz.service.order.ReserveStoreInventory;
import org.abchip.mimo.biz.service.order.ReserveStoreInventoryResponse;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserve Store Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.order.impl.ReserveStoreInventoryImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReserveStoreInventoryImpl extends BizServiceRequestImpl<ReserveStoreInventoryResponse> implements ReserveStoreInventory {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReserveStoreInventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.RESERVE_STORE_INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return (String)eGet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		eSet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__FACILITY_ID, newFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return (String)eGet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		eSet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return (String)eGet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		eSet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return (String)eGet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__SHIP_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		eSet(OrderPackage.Literals.RESERVE_STORE_INVENTORY__SHIP_GROUP_SEQ_ID, newShipGroupSeqId);
	}

} //ReserveStoreInventoryImpl
