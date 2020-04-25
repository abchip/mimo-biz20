/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;

import org.abchip.mimo.biz.service.product.CalcTaxForDisplay;
import org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class CalcTaxForDisplayImpl extends BizServiceRequestImpl<CalcTaxForDisplayResponse> implements CalcTaxForDisplay {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getBasePrice() <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BASE_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePrice() <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal basePrice = BASE_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillToPartyId() <em>Bill To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillToPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_TO_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillToPartyId() <em>Bill To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillToPartyId()
	 * @generated
	 * @ordered
	 */
	protected String billToPartyId = BILL_TO_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShippingPrice() <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SHIPPING_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingPrice() <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal shippingPrice = SHIPPING_PRICE_EDEFAULT;

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
	@Override
	public BigDecimal getBasePrice() {
		return basePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePrice(BigDecimal newBasePrice) {
		BigDecimal oldBasePrice = basePrice;
		basePrice = newBasePrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY__BASE_PRICE, oldBasePrice, basePrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillToPartyId() {
		return billToPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillToPartyId(String newBillToPartyId) {
		String oldBillToPartyId = billToPartyId;
		billToPartyId = newBillToPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID, oldBillToPartyId, billToPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingPrice() {
		return shippingPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingPrice(BigDecimal newShippingPrice) {
		BigDecimal oldShippingPrice = shippingPrice;
		shippingPrice = newShippingPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE, oldShippingPrice, shippingPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.CALC_TAX_FOR_DISPLAY__BASE_PRICE:
				return getBasePrice();
			case ProductPackage.CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID:
				return getBillToPartyId();
			case ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_ID:
				return getProductId();
			case ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID:
				return getProductStoreId();
			case ProductPackage.CALC_TAX_FOR_DISPLAY__QUANTITY:
				return getQuantity();
			case ProductPackage.CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE:
				return getShippingPrice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.CALC_TAX_FOR_DISPLAY__BASE_PRICE:
				setBasePrice((BigDecimal)newValue);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID:
				setBillToPartyId((String)newValue);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE:
				setShippingPrice((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductPackage.CALC_TAX_FOR_DISPLAY__BASE_PRICE:
				setBasePrice(BASE_PRICE_EDEFAULT);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID:
				setBillToPartyId(BILL_TO_PARTY_ID_EDEFAULT);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE:
				setShippingPrice(SHIPPING_PRICE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductPackage.CALC_TAX_FOR_DISPLAY__BASE_PRICE:
				return BASE_PRICE_EDEFAULT == null ? basePrice != null : !BASE_PRICE_EDEFAULT.equals(basePrice);
			case ProductPackage.CALC_TAX_FOR_DISPLAY__BILL_TO_PARTY_ID:
				return BILL_TO_PARTY_ID_EDEFAULT == null ? billToPartyId != null : !BILL_TO_PARTY_ID_EDEFAULT.equals(billToPartyId);
			case ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case ProductPackage.CALC_TAX_FOR_DISPLAY__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case ProductPackage.CALC_TAX_FOR_DISPLAY__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case ProductPackage.CALC_TAX_FOR_DISPLAY__SHIPPING_PRICE:
				return SHIPPING_PRICE_EDEFAULT == null ? shippingPrice != null : !SHIPPING_PRICE_EDEFAULT.equals(shippingPrice);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (basePrice: ");
		result.append(basePrice);
		result.append(", billToPartyId: ");
		result.append(billToPartyId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", productStoreId: ");
		result.append(productStoreId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", shippingPrice: ");
		result.append(shippingPrice);
		result.append(')');
		return result.toString();
	}

} //CalcTaxForDisplayImpl
