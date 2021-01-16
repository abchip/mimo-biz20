/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.model.order.order.OrderItemPriceInfo;

import org.abchip.mimo.biz.service.product.CalculatePurchasePriceResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;

import org.abchip.mimo.service.impl.ServiceResponseImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculate Purchase Price Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalculatePurchasePriceResponseImpl#isValidPriceFound <em>Valid Price Found</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalculatePurchasePriceResponseImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalculatePurchasePriceResponseImpl#getOrderItemPriceInfos <em>Order Item Price Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatePurchasePriceResponseImpl extends ServiceResponseImpl implements CalculatePurchasePriceResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatePurchasePriceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.CALCULATE_PURCHASE_PRICE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidPriceFound() {
		return (Boolean)eGet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE_RESPONSE__VALID_PRICE_FOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidPriceFound(boolean newValidPriceFound) {
		eSet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE_RESPONSE__VALID_PRICE_FOUND, newValidPriceFound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPrice() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE_RESPONSE__PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(BigDecimal newPrice) {
		eSet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE_RESPONSE__PRICE, newPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderItemPriceInfo> getOrderItemPriceInfos() {
		return (List<OrderItemPriceInfo>)eGet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE_RESPONSE__ORDER_ITEM_PRICE_INFOS, true);
	}

} //CalculatePurchasePriceResponseImpl
