/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.price;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.store.ProductStoreGroup;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getProductPriceType <em>Product Price Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getProductPricePurpose <em>Product Price Purpose</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getProductStoreGroup <em>Product Store Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getCustomPriceCalcService <em>Custom Price Calc Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getPriceWithTax <em>Price With Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getPriceWithoutTax <em>Price Without Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTaxAuthGeo <em>Tax Auth Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTaxAuthParty <em>Tax Auth Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#isTaxInPrice <em>Tax In Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTermUom <em>Term Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPrice extends EntityTyped<ProductPriceType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_Product()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Product Price Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Type</em>' reference.
	 * @see #setProductPriceType(ProductPriceType)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_ProductPriceType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPriceType getProductPriceType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getProductPriceType <em>Product Price Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Type</em>' reference.
	 * @see #getProductPriceType()
	 * @generated
	 */
	void setProductPriceType(ProductPriceType value);

	/**
	 * Returns the value of the '<em><b>Product Price Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Purpose</em>' reference.
	 * @see #setProductPricePurpose(ProductPricePurpose)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_ProductPricePurpose()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPricePurpose getProductPricePurpose();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getProductPricePurpose <em>Product Price Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Purpose</em>' reference.
	 * @see #getProductPricePurpose()
	 * @generated
	 */
	void setProductPricePurpose(ProductPricePurpose value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_CurrencyUom()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Product Store Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group</em>' reference.
	 * @see #setProductStoreGroup(ProductStoreGroup)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_ProductStoreGroup()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStoreGroup getProductStoreGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getProductStoreGroup <em>Product Store Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group</em>' reference.
	 * @see #getProductStoreGroup()
	 * @generated
	 */
	void setProductStoreGroup(ProductStoreGroup value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_CreatedByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Custom Price Calc Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Price Calc Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Price Calc Service</em>' reference.
	 * @see #setCustomPriceCalcService(CustomMethod)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_CustomPriceCalcService()
	 * @model annotation="mimo-ent-slot help='Points to a CustomMethod used to specify a service for the calculation of the unit price of the product (NOTE: a better name for this field might be priceCalcCustomMethodId)'"
	 * @generated
	 */
	CustomMethod getCustomPriceCalcService();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getCustomPriceCalcService <em>Custom Price Calc Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Price Calc Service</em>' reference.
	 * @see #getCustomPriceCalcService()
	 * @generated
	 */
	void setCustomPriceCalcService(CustomMethod value);

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
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #setLastModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_LastModifiedByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_Price()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Price With Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price With Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price With Tax</em>' attribute.
	 * @see #setPriceWithTax(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_PriceWithTax()
	 * @model annotation="mimo-ent-slot help='Always with tax if populated, regardless of if price does or does not include tax.'"
	 *        annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getPriceWithTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getPriceWithTax <em>Price With Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price With Tax</em>' attribute.
	 * @see #getPriceWithTax()
	 * @generated
	 */
	void setPriceWithTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Price Without Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Without Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Without Tax</em>' attribute.
	 * @see #setPriceWithoutTax(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_PriceWithoutTax()
	 * @model annotation="mimo-ent-slot help='Always without tax if populated, regardless of if price does or does not include tax.'"
	 *        annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getPriceWithoutTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getPriceWithoutTax <em>Price Without Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Without Tax</em>' attribute.
	 * @see #getPriceWithoutTax()
	 * @generated
	 */
	void setPriceWithoutTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Amount</em>' attribute.
	 * @see #setTaxAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_TaxAmount()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getTaxAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTaxAmount <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' attribute.
	 * @see #getTaxAmount()
	 * @generated
	 */
	void setTaxAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo</em>' reference.
	 * @see #setTaxAuthGeo(Geo)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_TaxAuthGeo()
	 * @model
	 * @generated
	 */
	Geo getTaxAuthGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTaxAuthGeo <em>Tax Auth Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo</em>' reference.
	 * @see #getTaxAuthGeo()
	 * @generated
	 */
	void setTaxAuthGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party</em>' reference.
	 * @see #setTaxAuthParty(Party)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_TaxAuthParty()
	 * @model
	 * @generated
	 */
	Party getTaxAuthParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTaxAuthParty <em>Tax Auth Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party</em>' reference.
	 * @see #getTaxAuthParty()
	 * @generated
	 */
	void setTaxAuthParty(Party value);

	/**
	 * Returns the value of the '<em><b>Tax In Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax In Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax In Price</em>' attribute.
	 * @see #setTaxInPrice(boolean)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_TaxInPrice()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If Y the price field has tax included for the given taxAuthPartyId/taxAuthGeoId at the taxPercentage.'"
	 * @generated
	 */
	boolean isTaxInPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#isTaxInPrice <em>Tax In Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax In Price</em>' attribute.
	 * @see #isTaxInPrice()
	 * @generated
	 */
	void setTaxInPrice(boolean value);

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
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_TaxPercentage()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTaxPercentage <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Percentage</em>' attribute.
	 * @see #getTaxPercentage()
	 * @generated
	 */
	void setTaxPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Term Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Uom</em>' reference.
	 * @see #setTermUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_TermUom()
	 * @model annotation="mimo-ent-slot help='Mainly used for recurring and usage prices to specify a time/freq measure, or a usage unit measure (bits, minutes, etc)'"
	 * @generated
	 */
	Uom getTermUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getTermUom <em>Term Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Uom</em>' reference.
	 * @see #getTermUom()
	 * @generated
	 */
	void setTermUom(Uom value);

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
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPrice_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPrice#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ProductPrice
