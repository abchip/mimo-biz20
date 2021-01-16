/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.tax;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Authority Rate Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#isIsTaxInShippingPrice <em>Is Tax In Shipping Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getMinItemPrice <em>Min Item Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getMinPurchase <em>Min Purchase</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateType <em>Tax Authority Rate Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#isTaxPromotions <em>Tax Promotions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#isTaxShipping <em>Tax Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTitleTransferEnumId <em>Title Transfer Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct()
 * @model annotation="mimo-ent-frame title='Tax Authority Rate' formula='description'"
 * @generated
 */
public interface TaxAuthorityRateProduct extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Tax In Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tax In Shipping Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tax In Shipping Price</em>' attribute.
	 * @see #setIsTaxInShippingPrice(boolean)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_IsTaxInShippingPrice()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsTaxInShippingPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#isIsTaxInShippingPrice <em>Is Tax In Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tax In Shipping Price</em>' attribute.
	 * @see #isIsTaxInShippingPrice()
	 * @generated
	 */
	void setIsTaxInShippingPrice(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Item Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Item Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Item Price</em>' attribute.
	 * @see #setMinItemPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_MinItemPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getMinItemPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getMinItemPrice <em>Min Item Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Item Price</em>' attribute.
	 * @see #getMinItemPrice()
	 * @generated
	 */
	void setMinItemPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Min Purchase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Purchase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Purchase</em>' attribute.
	 * @see #setMinPurchase(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_MinPurchase()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getMinPurchase();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getMinPurchase <em>Min Purchase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Purchase</em>' attribute.
	 * @see #getMinPurchase()
	 * @generated
	 */
	void setMinPurchase(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' reference.
	 * @see #setProductCategory(ProductCategory)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_ProductCategory()
	 * @model
	 * @generated
	 */
	ProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getProductCategory <em>Product Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_ProductStore()
	 * @model
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #setTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxAuthGeoId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #setTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxAuthPartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #getTaxAuthPartyId()
	 * @generated
	 */
	void setTaxAuthPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Authority Rate Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Authority Rate Type</em>' reference.
	 * @see #setTaxAuthorityRateType(TaxAuthorityRateType)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxAuthorityRateType()
	 * @model
	 * @generated
	 */
	TaxAuthorityRateType getTaxAuthorityRateType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateType <em>Tax Authority Rate Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Authority Rate Type</em>' reference.
	 * @see #getTaxAuthorityRateType()
	 * @generated
	 */
	void setTaxAuthorityRateType(TaxAuthorityRateType value);

	/**
	 * Returns the value of the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Percentage</em>' attribute.
	 * @see #setTaxPercentage(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxPercentage()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxPercentage <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Percentage</em>' attribute.
	 * @see #getTaxPercentage()
	 * @generated
	 */
	void setTaxPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Promotions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Promotions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Promotions</em>' attribute.
	 * @see #setTaxPromotions(boolean)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxPromotions()
	 * @model required="true"
	 * @generated
	 */
	boolean isTaxPromotions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#isTaxPromotions <em>Tax Promotions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Promotions</em>' attribute.
	 * @see #isTaxPromotions()
	 * @generated
	 */
	void setTaxPromotions(boolean value);

	/**
	 * Returns the value of the '<em><b>Tax Shipping</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Shipping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Shipping</em>' attribute.
	 * @see #setTaxShipping(boolean)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxShipping()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isTaxShipping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#isTaxShipping <em>Tax Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Shipping</em>' attribute.
	 * @see #isTaxShipping()
	 * @generated
	 */
	void setTaxShipping(boolean value);

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
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Title Transfer Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Transfer Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Transfer Enum Id</em>' attribute.
	 * @see #setTitleTransferEnumId(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TitleTransferEnumId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTitleTransferEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTitleTransferEnumId <em>Title Transfer Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Transfer Enum Id</em>' attribute.
	 * @see #getTitleTransferEnumId()
	 * @generated
	 */
	void setTitleTransferEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Authority Rate Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Authority Rate Seq Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #setTaxAuthorityRateSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxAuthorityRateSeqId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTaxAuthorityRateSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 */
	void setTaxAuthorityRateSeqId(String value);

} // TaxAuthorityRateProduct
