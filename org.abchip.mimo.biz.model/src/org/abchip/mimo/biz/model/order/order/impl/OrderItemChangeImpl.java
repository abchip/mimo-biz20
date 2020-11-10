/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.order.OrderItemChange;
import org.abchip.mimo.biz.model.order.order.OrderPackage;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getOrderItemChangeId <em>Order Item Change Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getChangeComments <em>Change Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getChangeDatetime <em>Change Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getChangeTypeEnum <em>Change Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getChangeUserLogin <em>Change User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getReasonEnum <em>Reason Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemChangeImpl#getUnitPrice <em>Unit Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemChangeImpl extends EntityIdentifiableImpl implements OrderItemChange {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_CHANGE;
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
	public BigDecimal getCancelQuantity() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CANCEL_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelQuantity(BigDecimal newCancelQuantity) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CANCEL_QUANTITY, newCancelQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeComments() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CHANGE_COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeComments(String newChangeComments) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CHANGE_COMMENTS, newChangeComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangeDatetime() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CHANGE_DATETIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeDatetime(Date newChangeDatetime) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CHANGE_DATETIME, newChangeDatetime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getChangeTypeEnum() {
		return (Enumeration)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeTypeEnum(Enumeration newChangeTypeEnum) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CHANGE_TYPE_ENUM, newChangeTypeEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getChangeUserLogin() {
		return (UserLogin)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeUserLogin(UserLogin newChangeUserLogin) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__CHANGE_USER_LOGIN, newChangeUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemDescription() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__ITEM_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDescription(String newItemDescription) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__ITEM_DESCRIPTION, newItemDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrder() {
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(OrderHeader newOrder) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemChangeId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemChangeId(String newOrderItemChangeId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__ORDER_ITEM_CHANGE_ID, newOrderItemChangeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReasonEnum() {
		return (Enumeration)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__REASON_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnum(Enumeration newReasonEnum) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__REASON_ENUM, newReasonEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitPrice() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM_CHANGE__UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitPrice(BigDecimal newUnitPrice) {
		eSet(OrderPackage.Literals.ORDER_ITEM_CHANGE__UNIT_PRICE, newUnitPrice);
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
				case OrderPackage.ORDER_ITEM_CHANGE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case OrderPackage.ORDER_ITEM_CHANGE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case OrderPackage.ORDER_ITEM_CHANGE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case OrderPackage.ORDER_ITEM_CHANGE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return OrderPackage.ORDER_ITEM_CHANGE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return OrderPackage.ORDER_ITEM_CHANGE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return OrderPackage.ORDER_ITEM_CHANGE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return OrderPackage.ORDER_ITEM_CHANGE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OrderItemChangeImpl
