/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.product.CalculateProductPriceResponse;
import org.abchip.mimo.biz.model.product.ProductPackage;
import org.abchip.mimo.biz.service.impl.BizServiceResponseImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculate Product Price Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.impl.CalculateProductPriceResponseImpl#isValidPriceFound <em>Valid Price Found</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.impl.CalculateProductPriceResponseImpl#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.impl.CalculateProductPriceResponseImpl#getListPrice <em>List Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculateProductPriceResponseImpl extends BizServiceResponseImpl implements CalculateProductPriceResponse {
	/**
	 * The default value of the '{@link #isValidPriceFound() <em>Valid Price Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidPriceFound()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_PRICE_FOUND_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isValidPriceFound() <em>Valid Price Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidPriceFound()
	 * @generated
	 * @ordered
	 */
	protected boolean validPriceFound = VALID_PRICE_FOUND_EDEFAULT;
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
	 * The default value of the '{@link #getListPrice() <em>List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LIST_PRICE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getListPrice() <em>List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal listPrice = LIST_PRICE_EDEFAULT;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculateProductPriceResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.CALCULATE_PRODUCT_PRICE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidPriceFound() {
		return validPriceFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidPriceFound(boolean newValidPriceFound) {
		boolean oldValidPriceFound = validPriceFound;
		validPriceFound = newValidPriceFound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND, oldValidPriceFound, validPriceFound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE, oldBasePrice, basePrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getListPrice() {
		return listPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListPrice(BigDecimal newListPrice) {
		BigDecimal oldListPrice = listPrice;
		listPrice = newListPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE, oldListPrice, listPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND:
				return isValidPriceFound();
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE:
				return getBasePrice();
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE:
				return getListPrice();
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
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND:
				setValidPriceFound((Boolean)newValue);
				return;
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE:
				setBasePrice((BigDecimal)newValue);
				return;
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE:
				setListPrice((BigDecimal)newValue);
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
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND:
				setValidPriceFound(VALID_PRICE_FOUND_EDEFAULT);
				return;
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE:
				setBasePrice(BASE_PRICE_EDEFAULT);
				return;
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE:
				setListPrice(LIST_PRICE_EDEFAULT);
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
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND:
				return validPriceFound != VALID_PRICE_FOUND_EDEFAULT;
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE:
				return BASE_PRICE_EDEFAULT == null ? basePrice != null : !BASE_PRICE_EDEFAULT.equals(basePrice);
			case ProductPackage.CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE:
				return LIST_PRICE_EDEFAULT == null ? listPrice != null : !LIST_PRICE_EDEFAULT.equals(listPrice);
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
		result.append(" (validPriceFound: ");
		result.append(validPriceFound);
		result.append(", basePrice: ");
		result.append(basePrice);
		result.append(", listPrice: ");
		result.append(listPrice);
		result.append(')');
		return result.toString();
	}

} //CalculateProductPriceResponseImpl
