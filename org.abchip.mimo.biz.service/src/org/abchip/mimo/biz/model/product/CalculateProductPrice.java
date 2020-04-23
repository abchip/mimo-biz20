/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product;

import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.service.BizServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculate Product Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.CalculateProductPrice#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.CalculateProductPrice#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.ProductPackage#getCalculateProductPrice()
 * @model
 * @generated
 */
public interface CalculateProductPrice extends BizServiceRequest<CalculateProductPriceResponse> {

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.ProductPackage#getCalculateProductPrice_Product()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.CalculateProductPrice#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.model.product.ProductPackage#getCalculateProductPrice_CurrencyUomId()
	 * @model
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.CalculateProductPrice#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);
} // CalculateProductPrice
