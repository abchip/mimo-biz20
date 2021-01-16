/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.webapp.visit.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.webapp.visit.ServerHitBin;
import org.abchip.mimo.biz.model.webapp.visit.ServerHitType;
import org.abchip.mimo.biz.model.webapp.visit.VisitPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Hit Bin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getServerHitBinId <em>Server Hit Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getBinEndDateTime <em>Bin End Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getBinStartDateTime <em>Bin Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getHitType <em>Hit Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getInternalContentId <em>Internal Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getMaxTimeMillis <em>Max Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getMinTimeMillis <em>Min Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getNumberHits <em>Number Hits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.visit.impl.ServerHitBinImpl#getTotalTimeMillis <em>Total Time Millis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerHitBinImpl extends EntityIdentifiableImpl implements ServerHitBin {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerHitBinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.SERVER_HIT_BIN;
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
	public String getServerHitBinId() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_HIT_BIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerHitBinId(String newServerHitBinId) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_HIT_BIN_ID, newServerHitBinId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBinEndDateTime() {
		return (Date)eGet(VisitPackage.Literals.SERVER_HIT_BIN__BIN_END_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinEndDateTime(Date newBinEndDateTime) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__BIN_END_DATE_TIME, newBinEndDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBinStartDateTime() {
		return (Date)eGet(VisitPackage.Literals.SERVER_HIT_BIN__BIN_START_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinStartDateTime(Date newBinStartDateTime) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__BIN_START_DATE_TIME, newBinStartDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__CONTENT_ID, newContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerHitType getHitType() {
		return (ServerHitType)eGet(VisitPackage.Literals.SERVER_HIT_BIN__HIT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHitType(ServerHitType newHitType) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__HIT_TYPE, newHitType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternalContentId() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__INTERNAL_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalContentId(String newInternalContentId) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__INTERNAL_CONTENT_ID, newInternalContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxTimeMillis() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT_BIN__MAX_TIME_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTimeMillis(long newMaxTimeMillis) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__MAX_TIME_MILLIS, newMaxTimeMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMinTimeMillis() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT_BIN__MIN_TIME_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTimeMillis(long newMinTimeMillis) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__MIN_TIME_MILLIS, newMinTimeMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumberHits() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT_BIN__NUMBER_HITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberHits(long newNumberHits) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__NUMBER_HITS, newNumberHits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerHostName() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_HOST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerHostName(String newServerHostName) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_HOST_NAME, newServerHostName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerIpAddress() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_IP_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerIpAddress(String newServerIpAddress) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_IP_ADDRESS, newServerIpAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalTimeMillis() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT_BIN__TOTAL_TIME_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalTimeMillis(long newTotalTimeMillis) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__TOTAL_TIME_MILLIS, newTotalTimeMillis);
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
				case VisitPackage.SERVER_HIT_BIN__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case VisitPackage.SERVER_HIT_BIN__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case VisitPackage.SERVER_HIT_BIN__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case VisitPackage.SERVER_HIT_BIN__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return VisitPackage.SERVER_HIT_BIN__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return VisitPackage.SERVER_HIT_BIN__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return VisitPackage.SERVER_HIT_BIN__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return VisitPackage.SERVER_HIT_BIN__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ServerHitBinImpl
