/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.model.party.contact.PostalAddress;

import org.abchip.mimo.biz.model.product.product.Product;

import org.abchip.mimo.biz.service.product.CalcTax;
import org.abchip.mimo.biz.service.product.CalcTaxResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;

import org.abchip.mimo.service.impl.ServiceRequestImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Tax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getBillToPartyId <em>Bill To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getItemAmountList <em>Item Amount List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getItemPriceList <em>Item Price List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getItemProductList <em>Item Product List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getItemQuantityList <em>Item Quantity List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getItemShippingList <em>Item Shipping List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getOrderShippingAmount <em>Order Shipping Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getPayToPartyId <em>Pay To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getShippingAddress <em>Shipping Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxImpl#getOrderPromotionsAmount <em>Order Promotions Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaxImpl extends ServiceRequestImpl<CalcTaxResponse> implements CalcTax {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.CALC_TAX;
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
	public String getBillToPartyId() {
		return (String)eGet(ProductPackage.Literals.CALC_TAX__BILL_TO_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillToPartyId(String newBillToPartyId) {
		eSet(ProductPackage.Literals.CALC_TAX__BILL_TO_PARTY_ID, newBillToPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return (String)eGet(ProductPackage.Literals.CALC_TAX__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		eSet(ProductPackage.Literals.CALC_TAX__FACILITY_ID, newFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BigDecimal> getItemAmountList() {
		return (List<BigDecimal>)eGet(ProductPackage.Literals.CALC_TAX__ITEM_AMOUNT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BigDecimal> getItemPriceList() {
		return (List<BigDecimal>)eGet(ProductPackage.Literals.CALC_TAX__ITEM_PRICE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getItemProductList() {
		return (List<Product>)eGet(ProductPackage.Literals.CALC_TAX__ITEM_PRODUCT_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BigDecimal> getItemQuantityList() {
		return (List<BigDecimal>)eGet(ProductPackage.Literals.CALC_TAX__ITEM_QUANTITY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BigDecimal> getItemShippingList() {
		return (List<BigDecimal>)eGet(ProductPackage.Literals.CALC_TAX__ITEM_SHIPPING_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderShippingAmount() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALC_TAX__ORDER_SHIPPING_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderShippingAmount(BigDecimal newOrderShippingAmount) {
		eSet(ProductPackage.Literals.CALC_TAX__ORDER_SHIPPING_AMOUNT, newOrderShippingAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayToPartyId() {
		return (String)eGet(ProductPackage.Literals.CALC_TAX__PAY_TO_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayToPartyId(String newPayToPartyId) {
		eSet(ProductPackage.Literals.CALC_TAX__PAY_TO_PARTY_ID, newPayToPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return (String)eGet(ProductPackage.Literals.CALC_TAX__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		eSet(ProductPackage.Literals.CALC_TAX__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddress getShippingAddress() {
		return (PostalAddress)eGet(ProductPackage.Literals.CALC_TAX__SHIPPING_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingAddress(PostalAddress newShippingAddress) {
		eSet(ProductPackage.Literals.CALC_TAX__SHIPPING_ADDRESS, newShippingAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderPromotionsAmount() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALC_TAX__ORDER_PROMOTIONS_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPromotionsAmount(BigDecimal newOrderPromotionsAmount) {
		eSet(ProductPackage.Literals.CALC_TAX__ORDER_PROMOTIONS_AMOUNT, newOrderPromotionsAmount);
	}

} //CalcTaxImpl
