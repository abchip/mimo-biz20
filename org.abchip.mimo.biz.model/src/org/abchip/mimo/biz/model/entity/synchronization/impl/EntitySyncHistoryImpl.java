/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.synchronization.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.entity.synchronization.EntitySync;
import org.abchip.mimo.biz.model.entity.synchronization.EntitySyncHistory;
import org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getEntitySync <em>Entity Sync</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getBeginningSynchTime <em>Beginning Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getLastCandidateEndTime <em>Last Candidate End Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getLastSplitStartTime <em>Last Split Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getPerSplitMaxItems <em>Per Split Max Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getPerSplitMaxMillis <em>Per Split Max Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getPerSplitMinItems <em>Per Split Min Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getPerSplitMinMillis <em>Per Split Min Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getRunStatusId <em>Run Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getRunningTimeMillis <em>Running Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getToCreateInserted <em>To Create Inserted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getToCreateNotUpdated <em>To Create Not Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getToCreateUpdated <em>To Create Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getToRemoveAlreadyDeleted <em>To Remove Already Deleted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getToRemoveDeleted <em>To Remove Deleted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getToStoreInserted <em>To Store Inserted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getToStoreNotUpdated <em>To Store Not Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getToStoreUpdated <em>To Store Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalRowsExported <em>Total Rows Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalRowsToCreate <em>Total Rows To Create</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalRowsToRemove <em>Total Rows To Remove</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalRowsToStore <em>Total Rows To Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalSplits <em>Total Splits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalStoreCalls <em>Total Store Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySyncHistoryImpl extends EntityIdentifiableImpl implements EntitySyncHistory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySyncHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY;
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
	public EntitySync getEntitySync() {
		return (EntitySync)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__ENTITY_SYNC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySync(EntitySync newEntitySync) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__ENTITY_SYNC, newEntitySync);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBeginningSynchTime() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginningSynchTime(Date newBeginningSynchTime) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME, newBeginningSynchTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastCandidateEndTime() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastCandidateEndTime(Date newLastCandidateEndTime) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME, newLastCandidateEndTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastSplitStartTime() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSplitStartTime(long newLastSplitStartTime) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME, newLastSplitStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastSuccessfulSynchTime() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSuccessfulSynchTime(Date newLastSuccessfulSynchTime) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME, newLastSuccessfulSynchTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerSplitMaxItems() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerSplitMaxItems(long newPerSplitMaxItems) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS, newPerSplitMaxItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerSplitMaxMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerSplitMaxMillis(long newPerSplitMaxMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS, newPerSplitMaxMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerSplitMinItems() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerSplitMinItems(long newPerSplitMinItems) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS, newPerSplitMinItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerSplitMinMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerSplitMinMillis(long newPerSplitMinMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS, newPerSplitMinMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunStatusId() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__RUN_STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunStatusId(String newRunStatusId) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__RUN_STATUS_ID, newRunStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRunningTimeMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningTimeMillis(long newRunningTimeMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS, newRunningTimeMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToCreateInserted() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToCreateInserted(long newToCreateInserted) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED, newToCreateInserted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToCreateNotUpdated() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToCreateNotUpdated(long newToCreateNotUpdated) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED, newToCreateNotUpdated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToCreateUpdated() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToCreateUpdated(long newToCreateUpdated) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED, newToCreateUpdated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToRemoveAlreadyDeleted() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToRemoveAlreadyDeleted(long newToRemoveAlreadyDeleted) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED, newToRemoveAlreadyDeleted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToRemoveDeleted() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToRemoveDeleted(long newToRemoveDeleted) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED, newToRemoveDeleted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToStoreInserted() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_STORE_INSERTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToStoreInserted(long newToStoreInserted) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_STORE_INSERTED, newToStoreInserted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToStoreNotUpdated() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToStoreNotUpdated(long newToStoreNotUpdated) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED, newToStoreNotUpdated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToStoreUpdated() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_STORE_UPDATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToStoreUpdated(long newToStoreUpdated) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TO_STORE_UPDATED, newToStoreUpdated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalRowsExported() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRowsExported(long newTotalRowsExported) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED, newTotalRowsExported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalRowsToCreate() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRowsToCreate(long newTotalRowsToCreate) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE, newTotalRowsToCreate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalRowsToRemove() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRowsToRemove(long newTotalRowsToRemove) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE, newTotalRowsToRemove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalRowsToStore() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRowsToStore(long newTotalRowsToStore) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE, newTotalRowsToStore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalSplits() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_SPLITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalSplits(long newTotalSplits) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_SPLITS, newTotalSplits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalStoreCalls() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalStoreCalls(long newTotalStoreCalls) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS, newTotalStoreCalls);
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
				case SynchronizationPackage.ENTITY_SYNC_HISTORY__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SynchronizationPackage.ENTITY_SYNC_HISTORY__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SynchronizationPackage.ENTITY_SYNC_HISTORY__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SynchronizationPackage.ENTITY_SYNC_HISTORY__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntitySyncHistoryImpl
