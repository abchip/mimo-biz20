/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;
import org.abchip.mimo.service.impl.ServiceResponseImpl;
import org.eclipse.emf.ecore.EClass;

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
public class CalcTaxForDisplayResponseImpl extends ServiceResponseImpl implements CalcTaxForDisplayResponse {

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
	public BigDecimal getPriceWithTax() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceWithTax(BigDecimal newPriceWithTax) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY_RESPONSE__PRICE_WITH_TAX, newPriceWithTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTaxPercentage() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPercentage(BigDecimal newTaxPercentage) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_PERCENTAGE, newTaxPercentage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTaxTotal() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxTotal(BigDecimal newTaxTotal) {
		eSet(ProductPackage.Literals.CALC_TAX_FOR_DISPLAY_RESPONSE__TAX_TOTAL, newTaxTotal);
	}

} //CalcTaxForDisplayResponseImpl
