/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.price.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.product.price.PricePackage;
import org.abchip.mimo.biz.model.product.price.ProductPriceChange;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getProductPriceChangeId <em>Product Price Change Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getChangedByUserLogin <em>Changed By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getChangedDate <em>Changed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getOldPrice <em>Old Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getProductPriceTypeId <em>Product Price Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.impl.ProductPriceChangeImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPriceChangeImpl extends EntityIdentifiableImpl implements ProductPriceChange {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPriceChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_PRICE_CHANGE;
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
	public UserLogin getChangedByUserLogin() {
		return (UserLogin)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedByUserLogin(UserLogin newChangedByUserLogin) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN, newChangedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangedDate() {
		return (Date)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__CHANGED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedDate(Date newChangedDate) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__CHANGED_DATE, newChangedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldPrice() {
		return (BigDecimal)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__OLD_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldPrice(BigDecimal newOldPrice) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__OLD_PRICE, newOldPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPrice() {
		return (BigDecimal)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(BigDecimal newPrice) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRICE, newPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceChangeId() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceChangeId(String newProductPriceChangeId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID, newProductPriceChangeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPricePurposeId() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPricePurposeId(String newProductPricePurposeId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID, newProductPricePurposeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceTypeId() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceTypeId(String newProductPriceTypeId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID, newProductPriceTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreGroupId() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupId(String newProductStoreGroupId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID, newProductStoreGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_CHANGE__THRU_DATE, newThruDate);
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
				case PricePackage.PRODUCT_PRICE_CHANGE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case PricePackage.PRODUCT_PRICE_CHANGE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case PricePackage.PRODUCT_PRICE_CHANGE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case PricePackage.PRODUCT_PRICE_CHANGE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return PricePackage.PRODUCT_PRICE_CHANGE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return PricePackage.PRODUCT_PRICE_CHANGE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return PricePackage.PRODUCT_PRICE_CHANGE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return PricePackage.PRODUCT_PRICE_CHANGE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProductPriceChangeImpl
