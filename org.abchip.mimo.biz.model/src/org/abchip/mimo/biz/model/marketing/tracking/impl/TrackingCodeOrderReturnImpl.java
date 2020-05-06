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
import org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn;
import org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeType;
import org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.return_.ReturnHeader;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracking Code Order Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getHasExported <em>Has Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getIsBillable <em>Is Billable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackingCodeOrderReturnImpl extends EntityIdentifiableImpl implements TrackingCodeOrderReturn {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackingCodeOrderReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN;
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
	public Date getAffiliateReferredTimeStamp() {
		return (Date)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__AFFILIATE_REFERRED_TIME_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliateReferredTimeStamp(Date newAffiliateReferredTimeStamp) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__AFFILIATE_REFERRED_TIME_STAMP, newAffiliateReferredTimeStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasExported() {
		return (Boolean)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__HAS_EXPORTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasExported(Boolean newHasExported) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__HAS_EXPORTED, newHasExported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsBillable() {
		return (Boolean)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__IS_BILLABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBillable(Boolean newIsBillable) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__IS_BILLABLE, newIsBillable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeader getReturnId() {
		return (ReturnHeader)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__RETURN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(ReturnHeader newReturnId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__RETURN_ID, newReturnId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteId() {
		return (String)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__SITE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteId(String newSiteId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__SITE_ID, newSiteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCode getTrackingCodeId() {
		return (TrackingCode)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeId(TrackingCode newTrackingCodeId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_ID, newTrackingCodeId);
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
				case TrackingPackage.TRACKING_CODE_ORDER_RETURN__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case TrackingPackage.TRACKING_CODE_ORDER_RETURN__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case TrackingPackage.TRACKING_CODE_ORDER_RETURN__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case TrackingPackage.TRACKING_CODE_ORDER_RETURN__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return TrackingPackage.TRACKING_CODE_ORDER_RETURN__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return TrackingPackage.TRACKING_CODE_ORDER_RETURN__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return TrackingPackage.TRACKING_CODE_ORDER_RETURN__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return TrackingPackage.TRACKING_CODE_ORDER_RETURN__LAST_UPDATED_TX_STAMP;
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
	public TrackingCodeType getTrackingCodeTypeId() {
		return (TrackingCodeType)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeTypeId(TrackingCodeType newTrackingCodeTypeId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_TYPE_ID, newTrackingCodeTypeId);
	}

} //TrackingCodeOrderReturnImpl
