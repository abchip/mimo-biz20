/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.tax.impl;

import java.math.BigDecimal;
import java.util.Date;
import org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateProduct;
import org.abchip.mimo.biz.model.accounting.tax.TaxAuthorityRateType;
import org.abchip.mimo.biz.model.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Authority Rate Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#isIsTaxInShippingPrice <em>Is Tax In Shipping Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getMinItemPrice <em>Min Item Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getMinPurchase <em>Min Purchase</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxAuthorityRateType <em>Tax Authority Rate Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#isTaxPromotions <em>Tax Promotions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#isTaxShipping <em>Tax Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.tax.impl.TaxAuthorityRateProductImpl#getTitleTransferEnumId <em>Title Transfer Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxAuthorityRateProductImpl extends EntityTypedImpl<TaxAuthorityRateType> implements TaxAuthorityRateProduct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxAuthorityRateProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsTaxInShippingPrice() {
		return (Boolean)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsTaxInShippingPrice(boolean newIsTaxInShippingPrice) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE, newIsTaxInShippingPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinItemPrice() {
		return (BigDecimal)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinItemPrice(BigDecimal newMinItemPrice) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE, newMinItemPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinPurchase() {
		return (BigDecimal)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinPurchase(BigDecimal newMinPurchase) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE, newMinPurchase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategory() {
		return (ProductCategory)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategory(ProductCategory newProductCategory) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY, newProductCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStore() {
		return (ProductStore)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStore(ProductStore newProductStore) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE, newProductStore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return (String)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID, newTaxAuthGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthPartyId() {
		return (String)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(String newTaxAuthPartyId) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID, newTaxAuthPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxAuthorityRateType getTaxAuthorityRateType() {
		return (TaxAuthorityRateType)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateType(TaxAuthorityRateType newTaxAuthorityRateType) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE, newTaxAuthorityRateType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTaxPercentage() {
		return (BigDecimal)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPercentage(BigDecimal newTaxPercentage) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE, newTaxPercentage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxPromotions() {
		return (Boolean)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPromotions(boolean newTaxPromotions) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS, newTaxPromotions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxShipping() {
		return (Boolean)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxShipping(boolean newTaxShipping) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING, newTaxShipping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleTransferEnumId() {
		return (String)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleTransferEnumId(String newTitleTransferEnumId) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID, newTitleTransferEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return TaxPackage.TAX_AUTHORITY_RATE_PRODUCT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthorityRateSeqId() {
		return (String)eGet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateSeqId(String newTaxAuthorityRateSeqId) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID, newTaxAuthorityRateSeqId);
	}

} //TaxAuthorityRateProductImpl
