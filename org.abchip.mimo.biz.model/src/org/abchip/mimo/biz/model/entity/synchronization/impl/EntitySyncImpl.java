/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.synchronization.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.entity.synchronization.EntitySync;
import org.abchip.mimo.biz.model.entity.synchronization.EntitySyncHistory;
import org.abchip.mimo.biz.model.entity.synchronization.EntitySyncInclude;
import org.abchip.mimo.biz.model.entity.synchronization.EntitySyncIncludeGroup;
import org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getEntitySyncId <em>Entity Sync Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getEntitySyncHistories <em>Entity Sync Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getEntitySyncIncludeGroups <em>Entity Sync Include Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getEntitySyncIncludes <em>Entity Sync Includes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getForPullOnly <em>For Pull Only</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getForPushOnly <em>For Push Only</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getKeepRemoveInfoHours <em>Keep Remove Info Hours</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getLastHistoryStartDate <em>Last History Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getMaxRunningNoUpdateMillis <em>Max Running No Update Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getOfflineSyncSplitMillis <em>Offline Sync Split Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getPreOfflineSynchTime <em>Pre Offline Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getRunStatusId <em>Run Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getSyncEndBufferMillis <em>Sync End Buffer Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getSyncSplitMillis <em>Sync Split Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getTargetDelegatorName <em>Target Delegator Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncImpl#getTargetServiceName <em>Target Service Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySyncImpl extends EntityIdentifiableImpl implements EntitySync {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySyncImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynchronizationPackage.Literals.ENTITY_SYNC;
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
	public String getEntitySyncId() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncId(String newEntitySyncId) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_ID, newEntitySyncId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EntitySyncHistory> getEntitySyncHistories() {
		return (List<EntitySyncHistory>)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_HISTORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EntitySyncIncludeGroup> getEntitySyncIncludeGroups() {
		return (List<EntitySyncIncludeGroup>)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_INCLUDE_GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EntitySyncInclude> getEntitySyncIncludes() {
		return (List<EntitySyncInclude>)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_INCLUDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getForPullOnly() {
		return (Boolean)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__FOR_PULL_ONLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForPullOnly(Boolean newForPullOnly) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__FOR_PULL_ONLY, newForPullOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getForPushOnly() {
		return (Boolean)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__FOR_PUSH_ONLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForPushOnly(Boolean newForPushOnly) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__FOR_PUSH_ONLY, newForPushOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getKeepRemoveInfoHours() {
		return (Double)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepRemoveInfoHours(double newKeepRemoveInfoHours) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS, newKeepRemoveInfoHours);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastHistoryStartDate() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__LAST_HISTORY_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastHistoryStartDate(Date newLastHistoryStartDate) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__LAST_HISTORY_START_DATE, newLastHistoryStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastSuccessfulSynchTime() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSuccessfulSynchTime(Date newLastSuccessfulSynchTime) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME, newLastSuccessfulSynchTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxRunningNoUpdateMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRunningNoUpdateMillis(long newMaxRunningNoUpdateMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS, newMaxRunningNoUpdateMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getOfflineSyncSplitMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfflineSyncSplitMillis(long newOfflineSyncSplitMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS, newOfflineSyncSplitMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPreOfflineSynchTime() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreOfflineSynchTime(Date newPreOfflineSynchTime) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME, newPreOfflineSynchTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunStatusId() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__RUN_STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunStatusId(String newRunStatusId) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__RUN_STATUS_ID, newRunStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSyncEndBufferMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__SYNC_END_BUFFER_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncEndBufferMillis(long newSyncEndBufferMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__SYNC_END_BUFFER_MILLIS, newSyncEndBufferMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSyncSplitMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__SYNC_SPLIT_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncSplitMillis(long newSyncSplitMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__SYNC_SPLIT_MILLIS, newSyncSplitMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetDelegatorName() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__TARGET_DELEGATOR_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDelegatorName(String newTargetDelegatorName) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__TARGET_DELEGATOR_NAME, newTargetDelegatorName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetServiceName() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__TARGET_SERVICE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetServiceName(String newTargetServiceName) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__TARGET_SERVICE_NAME, newTargetServiceName);
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
				case SynchronizationPackage.ENTITY_SYNC__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SynchronizationPackage.ENTITY_SYNC__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SynchronizationPackage.ENTITY_SYNC__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SynchronizationPackage.ENTITY_SYNC__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SynchronizationPackage.ENTITY_SYNC__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SynchronizationPackage.ENTITY_SYNC__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SynchronizationPackage.ENTITY_SYNC__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SynchronizationPackage.ENTITY_SYNC__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntitySyncImpl
