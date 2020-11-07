/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.return_.ReturnHeader;
import org.abchip.mimo.biz.model.order.return_.ReturnItem;
import org.abchip.mimo.biz.model.order.return_.ReturnItemResponse;
import org.abchip.mimo.biz.model.order.return_.ReturnItemType;
import org.abchip.mimo.biz.model.order.return_.ReturnPackage;
import org.abchip.mimo.biz.model.order.return_.ReturnReason;
import org.abchip.mimo.biz.model.order.return_.ReturnType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getExpectedItemStatus <em>Expected Item Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReceivedQuantity <em>Received Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReturnItemResponseId <em>Return Item Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReturnItemTypeId <em>Return Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReturnPrice <em>Return Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReturnQuantity <em>Return Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReturnReasonId <em>Return Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getReturnTypeId <em>Return Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnItemImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnItemImpl extends EntityTypedImpl<ReturnItemType> implements ReturnItem {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ITEM__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getExpectedItemStatus() {
		return (StatusItem)eGet(ReturnPackage.Literals.RETURN_ITEM__EXPECTED_ITEM_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedItemStatus(StatusItem newExpectedItemStatus) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__EXPECTED_ITEM_STATUS, newExpectedItemStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(ReturnPackage.Literals.RETURN_ITEM__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ITEM__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(ReturnPackage.Literals.RETURN_ITEM__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReceivedQuantity() {
		return (BigDecimal)eGet(ReturnPackage.Literals.RETURN_ITEM__RECEIVED_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedQuantity(BigDecimal newReceivedQuantity) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RECEIVED_QUANTITY, newReceivedQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeader getReturnId() {
		return (ReturnHeader)eGet(ReturnPackage.Literals.RETURN_ITEM__RETURN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(ReturnHeader newReturnId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RETURN_ID, newReturnId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItemResponse getReturnItemResponseId() {
		return (ReturnItemResponse)eGet(ReturnPackage.Literals.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemResponseId(ReturnItemResponse newReturnItemResponseId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RETURN_ITEM_RESPONSE_ID, newReturnItemResponseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemSeqId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_ITEM__RETURN_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemSeqId(String newReturnItemSeqId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RETURN_ITEM_SEQ_ID, newReturnItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnItemType getReturnItemTypeId() {
		return (ReturnItemType)eGet(ReturnPackage.Literals.RETURN_ITEM__RETURN_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemTypeId(ReturnItemType newReturnItemTypeId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RETURN_ITEM_TYPE_ID, newReturnItemTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReturnPrice() {
		return (BigDecimal)eGet(ReturnPackage.Literals.RETURN_ITEM__RETURN_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnPrice(BigDecimal newReturnPrice) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RETURN_PRICE, newReturnPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReturnQuantity() {
		return (BigDecimal)eGet(ReturnPackage.Literals.RETURN_ITEM__RETURN_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnQuantity(BigDecimal newReturnQuantity) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RETURN_QUANTITY, newReturnQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnReason getReturnReasonId() {
		return (ReturnReason)eGet(ReturnPackage.Literals.RETURN_ITEM__RETURN_REASON_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnReasonId(ReturnReason newReturnReasonId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RETURN_REASON_ID, newReturnReasonId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getReturnTypeId() {
		return (ReturnType)eGet(ReturnPackage.Literals.RETURN_ITEM__RETURN_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnTypeId(ReturnType newReturnTypeId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__RETURN_TYPE_ID, newReturnTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(ReturnPackage.Literals.RETURN_ITEM__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(ReturnPackage.Literals.RETURN_ITEM__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case ReturnPackage.RETURN_ITEM__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case ReturnPackage.RETURN_ITEM__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case ReturnPackage.RETURN_ITEM__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case ReturnPackage.RETURN_ITEM__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return ReturnPackage.RETURN_ITEM__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return ReturnPackage.RETURN_ITEM__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return ReturnPackage.RETURN_ITEM__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return ReturnPackage.RETURN_ITEM__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReturnItemImpl
