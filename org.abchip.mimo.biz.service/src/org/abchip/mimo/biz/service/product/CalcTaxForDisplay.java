/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import java.math.BigDecimal;
import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Tax For Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getBasePrice <em>Base Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getBillToPartyId <em>Bill To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getShippingPrice <em>Shipping Price</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplay()
 * @model
 * @generated
 */
public interface CalcTaxForDisplay extends ServiceRequest<CalcTaxForDisplayResponse> {
	/**
	 * Returns the value of the '<em><b>Base Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Price</em>' attribute.
	 * @see #setBasePrice(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplay_BasePrice()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getBasePrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getBasePrice <em>Base Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Price</em>' attribute.
	 * @see #getBasePrice()
	 * @generated
	 */
	void setBasePrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Bill To Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill To Party Id</em>' attribute.
	 * @see #setBillToPartyId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplay_BillToPartyId()
	 * @model required="true"
	 * @generated
	 */
	String getBillToPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getBillToPartyId <em>Bill To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill To Party Id</em>' attribute.
	 * @see #getBillToPartyId()
	 * @generated
	 */
	void setBillToPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplay_ProductId()
	 * @model required="true"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplay_ProductStoreId()
	 * @model required="true"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplay_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Price</em>' attribute.
	 * @see #setShippingPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTaxForDisplay_ShippingPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getShippingPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTaxForDisplay#getShippingPrice <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Price</em>' attribute.
	 * @see #getShippingPrice()
	 * @generated
	 */
	void setShippingPrice(BigDecimal value);

} // CalcTaxForDisplay
