/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.synchronization.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.entity.group.EntityGroup;
import org.abchip.mimo.biz.model.entity.synchronization.EntitySync;
import org.abchip.mimo.biz.model.entity.synchronization.EntitySyncIncludeGroup;
import org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync Include Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getEntityGroup <em>Entity Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getEntitySync <em>Entity Sync</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySyncIncludeGroupImpl extends EntityIdentifiableImpl implements EntitySyncIncludeGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySyncIncludeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE_GROUP;
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
	public EntityGroup getEntityGroup() {
		return (EntityGroup)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroup(EntityGroup newEntityGroup) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP, newEntityGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitySync getEntitySync() {
		return (EntitySync)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySync(EntitySync newEntitySync) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC, newEntitySync);
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
				case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntitySyncIncludeGroupImpl
