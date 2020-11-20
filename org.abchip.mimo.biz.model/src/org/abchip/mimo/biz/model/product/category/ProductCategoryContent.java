/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.category;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.content.content.Content;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getProdCatContentType <em>Prod Cat Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getUseDaysLimit <em>Use Days Limit</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent()
 * @model annotation="mimo-ent-frame title='Product Category Data Object' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductCategoryContent extends EntityTyped<ProductCategoryContentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' reference.
	 * @see #setProductCategory(ProductCategory)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_ProductCategory()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getProductCategory <em>Product Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_Content()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Prod Cat Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Cat Content Type</em>' reference.
	 * @see #setProdCatContentType(ProductCategoryContentType)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_ProdCatContentType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductCategoryContentType getProdCatContentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getProdCatContentType <em>Prod Cat Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Cat Content Type</em>' reference.
	 * @see #getProdCatContentType()
	 * @generated
	 */
	void setProdCatContentType(ProductCategoryContentType value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase From Date</em>' attribute.
	 * @see #setPurchaseFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_PurchaseFromDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getPurchaseFromDate <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase From Date</em>' attribute.
	 * @see #getPurchaseFromDate()
	 * @generated
	 */
	void setPurchaseFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #setPurchaseThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_PurchaseThruDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getPurchaseThruDate <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #getPurchaseThruDate()
	 * @generated
	 */
	void setPurchaseThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Count Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Count Limit</em>' attribute.
	 * @see #setUseCountLimit(long)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_UseCountLimit()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getUseCountLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getUseCountLimit <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Count Limit</em>' attribute.
	 * @see #getUseCountLimit()
	 * @generated
	 */
	void setUseCountLimit(long value);

	/**
	 * Returns the value of the '<em><b>Use Days Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Days Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Days Limit</em>' attribute.
	 * @see #setUseDaysLimit(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.category.CategoryPackage#getProductCategoryContent_UseDaysLimit()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getUseDaysLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.category.ProductCategoryContent#getUseDaysLimit <em>Use Days Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Days Limit</em>' attribute.
	 * @see #getUseDaysLimit()
	 * @generated
	 */
	void setUseDaysLimit(BigDecimal value);

} // ProductCategoryContent
