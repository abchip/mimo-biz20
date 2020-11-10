/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.subscription.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource;
import org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.model.product.subscription.SubscriptionResource;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Subscription Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getSubscriptionResource <em>Subscription Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#isAutomaticExtend <em>Automatic Extend</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getAvailableTimeUom <em>Available Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getCanclAutmExtTimeUom <em>Cancl Autm Ext Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getGracePeriodOnExpiryUom <em>Grace Period On Expiry Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getMaxLifeTimeUom <em>Max Life Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getUseRoleType <em>Use Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.impl.ProductSubscriptionResourceImpl#getUseTimeUom <em>Use Time Uom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSubscriptionResourceImpl extends EntityIdentifiableImpl implements ProductSubscriptionResource {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSubscriptionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE;
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
	public Product getProduct() {
		return (Product)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionResource getSubscriptionResource() {
		return (SubscriptionResource)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionResource(SubscriptionResource newSubscriptionResource) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE, newSubscriptionResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAvailableTime() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTime(long newAvailableTime) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME, newAvailableTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getAvailableTimeUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTimeUom(Uom newAvailableTimeUom) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM, newAvailableTimeUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCanclAutmExtTime() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTime(long newCanclAutmExtTime) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME, newCanclAutmExtTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCanclAutmExtTimeUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTimeUom(Uom newCanclAutmExtTimeUom) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM, newCanclAutmExtTimeUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutomaticExtend() {
		return (Boolean)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticExtend(boolean newAutomaticExtend) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND, newAutomaticExtend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getGracePeriodOnExpiry() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiry(long newGracePeriodOnExpiry) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY, newGracePeriodOnExpiry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getGracePeriodOnExpiryUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiryUom(Uom newGracePeriodOnExpiryUom) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM, newGracePeriodOnExpiryUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxLifeTime() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTime(long newMaxLifeTime) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME, newMaxLifeTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMaxLifeTimeUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTimeUom(Uom newMaxLifeTimeUom) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM, newMaxLifeTimeUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseFromDate() {
		return (Date)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseFromDate(Date newPurchaseFromDate) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE, newPurchaseFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseThruDate() {
		return (Date)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseThruDate(Date newPurchaseThruDate) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE, newPurchaseThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseCountLimit() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCountLimit(long newUseCountLimit) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT, newUseCountLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getUseRoleType() {
		return (RoleType)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseRoleType(RoleType newUseRoleType) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE, newUseRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseTime() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTime(long newUseTime) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME, newUseTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUseTimeUom() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeUom(Uom newUseTimeUom) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM, newUseTimeUom);
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
				case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProductSubscriptionResourceImpl
