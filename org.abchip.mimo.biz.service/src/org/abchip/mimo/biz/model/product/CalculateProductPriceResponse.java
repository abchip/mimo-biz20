/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product;

import java.math.BigDecimal;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculate Product Price Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.CalculateProductPriceResponse#isValidPriceFound <em>Valid Price Found</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.CalculateProductPriceResponse#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.CalculateProductPriceResponse#getListPrice <em>List Price</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.ProductPackage#getCalculateProductPriceResponse()
 * @model
 * @generated
 */
public interface CalculateProductPriceResponse extends ServiceResponse {

	/**
	 * Returns the value of the '<em><b>Valid Price Found</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Price Found</em>' attribute.
	 * @see #setValidPriceFound(boolean)
	 * @see org.abchip.mimo.biz.model.product.ProductPackage#getCalculateProductPriceResponse_ValidPriceFound()
	 * @model required="true"
	 * @generated
	 */
	boolean isValidPriceFound();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.CalculateProductPriceResponse#isValidPriceFound <em>Valid Price Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Price Found</em>' attribute.
	 * @see #isValidPriceFound()
	 * @generated
	 */
	void setValidPriceFound(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Price</em>' attribute.
	 * @see #setBasePrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.ProductPackage#getCalculateProductPriceResponse_BasePrice()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getBasePrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.CalculateProductPriceResponse#getBasePrice <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' attribute.
	 * @see #getBasePrice()
	 * @generated
	 */
	void setBasePrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>List Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Price</em>' attribute.
	 * @see #setListPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.ProductPackage#getCalculateProductPriceResponse_ListPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getListPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.CalculateProductPriceResponse#getListPrice <em>List Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Price</em>' attribute.
	 * @see #getListPrice()
	 * @generated
	 */
	void setListPrice(BigDecimal value);
} // CalculateProductPriceResponse
