/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.service.impl.BizServiceResponseImpl;

import org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Tax For Display Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayResponseImpl#getPriceWithTax <em>Price With Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayResponseImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.impl.CalcTaxForDisplayResponseImpl#getTaxTotal <em>Tax Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcTaxForDisplayResponseImpl extends BizServiceResponseImpl implements CalcTaxForDisplayResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPriceWithTax() <em>Price With Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceWithTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRICE_WITH_TAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriceWithTax() <em>Price With Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceWithTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal priceWithTax = PRICE_WITH_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxPercentage = TAX_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxTotal() <em>Tax Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxTotal() <em>Tax Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxTotal = TAX_TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalcTaxForDisplayResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.CALC_TAX_FOR_DISPLAY_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPriceWithTax() {
		return priceWithTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceWithTax(BigDecimal newPriceWithTax) {
		BigDecimal oldPriceWithTax = priceWithTax;
		priceWithTax = newPriceWithTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX, oldPriceWithTax, priceWithTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTaxPercentage() {
		return taxPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPercentage(BigDecimal newTaxPercentage) {
		BigDecimal oldTaxPercentage = taxPercentage;
		taxPercentage = newTaxPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE, oldTaxPercentage, taxPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTaxTotal() {
		return taxTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxTotal(BigDecimal newTaxTotal) {
		BigDecimal oldTaxTotal = taxTotal;
		taxTotal = newTaxTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL, oldTaxTotal, taxTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX:
				return getPriceWithTax();
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE:
				return getTaxPercentage();
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL:
				return getTaxTotal();
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
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX:
				setPriceWithTax((BigDecimal)newValue);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE:
				setTaxPercentage((BigDecimal)newValue);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL:
				setTaxTotal((BigDecimal)newValue);
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
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX:
				setPriceWithTax(PRICE_WITH_TAX_EDEFAULT);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE:
				setTaxPercentage(TAX_PERCENTAGE_EDEFAULT);
				return;
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL:
				setTaxTotal(TAX_TOTAL_EDEFAULT);
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
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX:
				return PRICE_WITH_TAX_EDEFAULT == null ? priceWithTax != null : !PRICE_WITH_TAX_EDEFAULT.equals(priceWithTax);
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE:
				return TAX_PERCENTAGE_EDEFAULT == null ? taxPercentage != null : !TAX_PERCENTAGE_EDEFAULT.equals(taxPercentage);
			case ProductPackage.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL:
				return TAX_TOTAL_EDEFAULT == null ? taxTotal != null : !TAX_TOTAL_EDEFAULT.equals(taxTotal);
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
		result.append(" (priceWithTax: ");
		result.append(priceWithTax);
		result.append(", taxPercentage: ");
		result.append(taxPercentage);
		result.append(", taxTotal: ");
		result.append(taxTotal);
		result.append(')');
		return result.toString();
	}

} //CalcTaxForDisplayResponseImpl
