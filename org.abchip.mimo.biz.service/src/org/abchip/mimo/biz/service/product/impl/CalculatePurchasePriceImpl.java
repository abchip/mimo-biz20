/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.model.product.product.Product;

import org.abchip.mimo.biz.service.product.CalculatePurchasePrice;
import org.abchip.mimo.biz.service.product.CalculatePurchasePriceResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;

import org.abchip.mimo.service.impl.ServiceRequestImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculate Purchase Price</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalculatePurchasePriceImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalculatePurchasePriceImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalculatePurchasePriceImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalculatePurchasePriceImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalculatePurchasePriceImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatePurchasePriceImpl extends ServiceRequestImpl<CalculatePurchasePriceResponse> implements CalculatePurchasePrice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatePurchasePriceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.CALCULATE_PURCHASE_PRICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 4;

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
	public String getAgreementId() {
		return (String)eGet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__AGREEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(String newAgreementId) {
		eSet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__AGREEMENT_ID, newAgreementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return (String)eGet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		eSet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return (Product)eGet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(ProductPackage.Literals.CALCULATE_PURCHASE_PRICE__QUANTITY, newQuantity);
	}

} //CalculatePurchasePriceImpl
