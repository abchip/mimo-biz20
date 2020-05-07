/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.model.party.contact.PostalAddress;

import org.abchip.mimo.biz.model.product.product.Product;

import org.abchip.mimo.service.ServiceRequest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc Tax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getBillToPartyId <em>Bill To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getItemAmountList <em>Item Amount List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getItemPriceList <em>Item Price List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getItemProductList <em>Item Product List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getItemQuantityList <em>Item Quantity List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getItemShippingList <em>Item Shipping List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getOrderShippingAmount <em>Order Shipping Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getPayToPartyId <em>Pay To Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getShippingAddress <em>Shipping Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.product.CalcTax#getOrderPromotionsAmount <em>Order Promotions Amount</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax()
 * @model
 * @generated
 */
public interface CalcTax extends ServiceRequest<CalcTaxResponse> {
	/**
	 * Returns the value of the '<em><b>Bill To Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill To Party Id</em>' attribute.
	 * @see #setBillToPartyId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_BillToPartyId()
	 * @model
	 * @generated
	 */
	String getBillToPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTax#getBillToPartyId <em>Bill To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill To Party Id</em>' attribute.
	 * @see #getBillToPartyId()
	 * @generated
	 */
	void setBillToPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' attribute.
	 * @see #setFacilityId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_FacilityId()
	 * @model
	 * @generated
	 */
	String getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTax#getFacilityId <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' attribute.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Item Amount List</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Amount List</em>' attribute list.
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_ItemAmountList()
	 * @model required="true"
	 * @generated
	 */
	List<BigDecimal> getItemAmountList();

	/**
	 * Returns the value of the '<em><b>Item Price List</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Price List</em>' attribute list.
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_ItemPriceList()
	 * @model required="true"
	 * @generated
	 */
	List<BigDecimal> getItemPriceList();

	/**
	 * Returns the value of the '<em><b>Item Product List</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.product.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Product List</em>' containment reference list.
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_ItemProductList()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	List<Product> getItemProductList();

	/**
	 * Returns the value of the '<em><b>Item Quantity List</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Quantity List</em>' attribute list.
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_ItemQuantityList()
	 * @model
	 * @generated
	 */
	List<BigDecimal> getItemQuantityList();

	/**
	 * Returns the value of the '<em><b>Item Shipping List</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Shipping List</em>' attribute list.
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_ItemShippingList()
	 * @model
	 * @generated
	 */
	List<BigDecimal> getItemShippingList();

	/**
	 * Returns the value of the '<em><b>Order Shipping Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Shipping Amount</em>' attribute.
	 * @see #setOrderShippingAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_OrderShippingAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getOrderShippingAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTax#getOrderShippingAmount <em>Order Shipping Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Shipping Amount</em>' attribute.
	 * @see #getOrderShippingAmount()
	 * @generated
	 */
	void setOrderShippingAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pay To Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Party Id</em>' attribute.
	 * @see #setPayToPartyId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_PayToPartyId()
	 * @model
	 * @generated
	 */
	String getPayToPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTax#getPayToPartyId <em>Pay To Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pay To Party Id</em>' attribute.
	 * @see #getPayToPartyId()
	 * @generated
	 */
	void setPayToPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_ProductStoreId()
	 * @model
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTax#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Shipping Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Address</em>' containment reference.
	 * @see #setShippingAddress(PostalAddress)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_ShippingAddress()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	PostalAddress getShippingAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTax#getShippingAddress <em>Shipping Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Address</em>' containment reference.
	 * @see #getShippingAddress()
	 * @generated
	 */
	void setShippingAddress(PostalAddress value);

	/**
	 * Returns the value of the '<em><b>Order Promotions Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Promotions Amount</em>' attribute.
	 * @see #setOrderPromotionsAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.service.product.ProductPackage#getCalcTax_OrderPromotionsAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getOrderPromotionsAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.product.CalcTax#getOrderPromotionsAmount <em>Order Promotions Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Promotions Amount</em>' attribute.
	 * @see #getOrderPromotionsAmount()
	 * @generated
	 */
	void setOrderPromotionsAmount(BigDecimal value);

} // CalcTax
