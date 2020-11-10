/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.tracking.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.marketing.tracking.TrackingCode;
import org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrder;
import org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType;
import org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracking Code Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getTrackingCodeType <em>Tracking Code Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getHasExported <em>Has Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getIsBillable <em>Is Billable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderImpl#getTrackingCode <em>Tracking Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackingCodeOrderImpl extends EntityIdentifiableImpl implements TrackingCodeOrder {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackingCodeOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackingPackage.Literals.TRACKING_CODE_ORDER;
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
	public OrderHeader getOrder() {
		return (OrderHeader)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER__ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(OrderHeader newOrder) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER__ORDER, newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCodeType getTrackingCodeType() {
		return (TrackingCodeType)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER__TRACKING_CODE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeType(TrackingCodeType newTrackingCodeType) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER__TRACKING_CODE_TYPE, newTrackingCodeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAffiliateReferredTimeStamp() {
		return (Date)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliateReferredTimeStamp(Date newAffiliateReferredTimeStamp) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP, newAffiliateReferredTimeStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasExported() {
		return (Boolean)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER__HAS_EXPORTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasExported(Boolean newHasExported) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER__HAS_EXPORTED, newHasExported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsBillable() {
		return (Boolean)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER__IS_BILLABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBillable(Boolean newIsBillable) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER__IS_BILLABLE, newIsBillable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteId() {
		return (String)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER__SITE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteId(String newSiteId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER__SITE_ID, newSiteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCode getTrackingCode() {
		return (TrackingCode)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER__TRACKING_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCode(TrackingCode newTrackingCode) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER__TRACKING_CODE, newTrackingCode);
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
				case TrackingPackage.TRACKING_CODE_ORDER__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case TrackingPackage.TRACKING_CODE_ORDER__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case TrackingPackage.TRACKING_CODE_ORDER__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case TrackingPackage.TRACKING_CODE_ORDER__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return TrackingPackage.TRACKING_CODE_ORDER__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return TrackingPackage.TRACKING_CODE_ORDER__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return TrackingPackage.TRACKING_CODE_ORDER__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return TrackingPackage.TRACKING_CODE_ORDER__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TrackingCodeOrderImpl
