/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import java.math.BigDecimal;

import org.abchip.mimo.biz.service.BizServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Tax For Display Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getPriceWithTax <em>Price With Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getTaxTotal <em>Tax Total</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplayResponse()
 * @model
 * @generated
 */
public interface CalcTaxForDisplayResponse extends BizServiceResponse {
	/**
	 * Returns the value of the '<em><b>Price With Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price With Tax</em>' attribute.
	 * @see #setPriceWithTax(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplayResponse_PriceWithTax()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getPriceWithTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getPriceWithTax <em>Price With Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price With Tax</em>' attribute.
	 * @see #getPriceWithTax()
	 * @generated
	 */
	void setPriceWithTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Percentage</em>' attribute.
	 * @see #setTaxPercentage(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplayResponse_TaxPercentage()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getTaxPercentage <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Percentage</em>' attribute.
	 * @see #getTaxPercentage()
	 * @generated
	 */
	void setTaxPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Total</em>' attribute.
	 * @see #setTaxTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplayResponse_TaxTotal()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getTaxTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplayResponse#getTaxTotal <em>Tax Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Total</em>' attribute.
	 * @see #getTaxTotal()
	 * @generated
	 */
	void setTaxTotal(BigDecimal value);

} // CalcTaxForDisplayResponse
