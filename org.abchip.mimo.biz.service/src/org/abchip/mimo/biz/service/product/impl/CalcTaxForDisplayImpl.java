/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.service.product.CalcTaxForDisplay;
import org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Tax For Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl#getBillToPartyId <em>Bill To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayImpl#getShippingPrice <em>Shipping Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaxForDisplayImpl extends ServiceRequestImpl<CalcTaxForDisplayResponse> implements CalcTaxForDisplay {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaxForDisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.CALC_TAX_FOR_DISPLAY;
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
	public BigDecimal getBasePrice() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__BASE_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePrice(BigDecimal newBasePrice) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__BASE_PRICE, newBasePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillToPartyId() {
		return (String)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillToPartyId(String newBillToPartyId) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID, newBillToPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return (String)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingPrice() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingPrice(BigDecimal newShippingPrice) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE, newShippingPrice);
	}

} //CalcTaxForDisplayImpl
