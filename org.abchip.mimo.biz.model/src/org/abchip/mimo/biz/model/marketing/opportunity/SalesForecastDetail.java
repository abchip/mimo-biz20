/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Forecast Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getSalesForecast <em>Sales Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getSalesForecastDetailId <em>Sales Forecast Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getQuantityUom <em>Quantity Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastDetail()
 * @model annotation="mimo-ent-frame title='Stores Details of Resourses of Sales Forecast for simulation of MRP'"
 * @generated
 */
public interface SalesForecastDetail extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Sales Forecast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast</em>' reference.
	 * @see #setSalesForecast(SalesForecast)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_SalesForecast()
	 * @model keys="salesForecastId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SalesForecast getSalesForecast();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getSalesForecast <em>Sales Forecast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Forecast</em>' reference.
	 * @see #getSalesForecast()
	 * @generated
	 */
	void setSalesForecast(SalesForecast value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_Product()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' reference.
	 * @see #setProductCategory(ProductCategory)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_ProductCategory()
	 * @model keys="productCategoryId"
	 * @generated
	 */
	ProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getProductCategory <em>Product Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Uom</em>' reference.
	 * @see #setQuantityUom(Uom)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_QuantityUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getQuantityUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getQuantityUom <em>Quantity Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Uom</em>' reference.
	 * @see #getQuantityUom()
	 * @generated
	 */
	void setQuantityUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Sales Forecast Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Forecast Detail Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast Detail Id</em>' attribute.
	 * @see #setSalesForecastDetailId(String)
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_SalesForecastDetailId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSalesForecastDetailId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getSalesForecastDetailId <em>Sales Forecast Detail Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Forecast Detail Id</em>' attribute.
	 * @see #getSalesForecastDetailId()
	 * @generated
	 */
	void setSalesForecastDetailId(String value);

} // SalesForecastDetail
