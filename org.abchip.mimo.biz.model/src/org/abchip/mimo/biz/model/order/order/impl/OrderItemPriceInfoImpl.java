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
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo;
import org.abchip.mimo.biz.model.order.order.OrderPackage;
import org.abchip.mimo.biz.model.product.price.ProductPriceRule;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Price Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getOrderItemPriceInfoId <em>Order Item Price Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getModifyAmount <em>Modify Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.impl.OrderItemPriceInfoImpl#getRateCode <em>Rate Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemPriceInfoImpl extends EntityIdentifiableImpl implements OrderItemPriceInfo {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemPriceInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_PRICE_INFO;
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
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getModifyAmount() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifyAmount(BigDecimal newModifyAmount) {
		eSet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__MODIFY_AMOUNT, newModifyAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemPriceInfoId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemPriceInfoId(String newOrderItemPriceInfoId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_PRICE_INFO_ID, newOrderItemPriceInfoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceActionSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceActionSeqId(String newProductPriceActionSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_ACTION_SEQ_ID, newProductPriceActionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceRule getProductPriceRuleId() {
		return (ProductPriceRule)eGet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceRuleId(ProductPriceRule newProductPriceRuleId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__PRODUCT_PRICE_RULE_ID, newProductPriceRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateCode() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__RATE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateCode(String newRateCode) {
		eSet(OrderPackage.Literals.ORDER_ITEM_PRICE_INFO__RATE_CODE, newRateCode);
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
				case OrderPackage.ORDER_ITEM_PRICE_INFO__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case OrderPackage.ORDER_ITEM_PRICE_INFO__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case OrderPackage.ORDER_ITEM_PRICE_INFO__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case OrderPackage.ORDER_ITEM_PRICE_INFO__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return OrderPackage.ORDER_ITEM_PRICE_INFO__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return OrderPackage.ORDER_ITEM_PRICE_INFO__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return OrderPackage.ORDER_ITEM_PRICE_INFO__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return OrderPackage.ORDER_ITEM_PRICE_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OrderItemPriceInfoImpl
