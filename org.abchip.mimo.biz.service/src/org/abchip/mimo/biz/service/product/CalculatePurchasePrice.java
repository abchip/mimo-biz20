/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import java.math.BigDecimal;

import org.abchip.mimo.biz.model.product.product.Product;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculate Purchase Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePrice()
 * @model
 * @generated
 */
public interface CalculatePurchasePrice extends ServiceRequest<CalculatePurchasePriceResponse> {
	/**
	 * Returns the value of the '<em><b>Agreement Id</b></em>' attribute.
	 * The default value is <code>"@general/currency.uom.id.default"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Id</em>' attribute.
	 * @see #setAgreementId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePrice_AgreementId()
	 * @model default="@general/currency.uom.id.default" required="true"
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * The default value is <code>"@general/currency.uom.id.default"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePrice_CurrencyUomId()
	 * @model default="@general/currency.uom.id.default" required="true"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * The default value is <code>"@general/currency.uom.id.default"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePrice_PartyId()
	 * @model default="@general/currency.uom.id.default" required="true"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' containment reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePrice_Product()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getProduct <em>Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' containment reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalculatePurchasePrice_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalculatePurchasePrice#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

} // CalculatePurchasePrice
