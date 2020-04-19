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

import org.abchip.mimo.service.impl.ServiceResponseImpl;

import org.eclipse.emf.ecore.EClass;

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
public class CalculateProductPriceResponseImpl extends ServiceResponseImpl implements CalculateProductPriceResponse {
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
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidPriceFound() {
		return (Boolean)eGet(ProductPackage.Literals.CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidPriceFound(boolean newValidPriceFound) {
		eSet(ProductPackage.Literals.CALCULATE_PRODUCT_PRICE_RESPONSE__VALID_PRICE_FOUND, newValidPriceFound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBasePrice() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePrice(BigDecimal newBasePrice) {
		eSet(ProductPackage.Literals.CALCULATE_PRODUCT_PRICE_RESPONSE__BASE_PRICE, newBasePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getListPrice() {
		return (BigDecimal)eGet(ProductPackage.Literals.CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListPrice(BigDecimal newListPrice) {
		eSet(ProductPackage.Literals.CALCULATE_PRODUCT_PRICE_RESPONSE__LIST_PRICE, newListPrice);
	}

} //CalculateProductPriceResponseImpl