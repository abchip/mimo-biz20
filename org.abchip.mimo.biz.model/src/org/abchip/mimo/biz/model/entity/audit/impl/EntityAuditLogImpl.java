/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.audit.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.entity.audit.AuditPackage;
import org.abchip.mimo.biz.model.entity.audit.EntityAuditLog;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Audit Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getAuditHistorySeqId <em>Audit History Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getChangedByInfo <em>Changed By Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getChangedDate <em>Changed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getChangedEntityName <em>Changed Entity Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getChangedFieldName <em>Changed Field Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getChangedSessionInfo <em>Changed Session Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getNewValueText <em>New Value Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getOldValueText <em>Old Value Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.audit.impl.EntityAuditLogImpl#getPkCombinedValueText <em>Pk Combined Value Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityAuditLogImpl extends EntityIdentifiableImpl implements EntityAuditLog {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityAuditLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuditPackage.Literals.ENTITY_AUDIT_LOG;
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
	public String getAuditHistorySeqId() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditHistorySeqId(String newAuditHistorySeqId) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__AUDIT_HISTORY_SEQ_ID, newAuditHistorySeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedByInfo() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_BY_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedByInfo(String newChangedByInfo) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_BY_INFO, newChangedByInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangedDate() {
		return (Date)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedDate(Date newChangedDate) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_DATE, newChangedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedEntityName() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedEntityName(String newChangedEntityName) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_ENTITY_NAME, newChangedEntityName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedFieldName() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedFieldName(String newChangedFieldName) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_FIELD_NAME, newChangedFieldName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedSessionInfo() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedSessionInfo(String newChangedSessionInfo) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__CHANGED_SESSION_INFO, newChangedSessionInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewValueText() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewValueText(String newNewValueText) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__NEW_VALUE_TEXT, newNewValueText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldValueText() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldValueText(String newOldValueText) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__OLD_VALUE_TEXT, newOldValueText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPkCombinedValueText() {
		return (String)eGet(AuditPackage.Literals.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPkCombinedValueText(String newPkCombinedValueText) {
		eSet(AuditPackage.Literals.ENTITY_AUDIT_LOG__PK_COMBINED_VALUE_TEXT, newPkCombinedValueText);
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
				case AuditPackage.ENTITY_AUDIT_LOG__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case AuditPackage.ENTITY_AUDIT_LOG__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case AuditPackage.ENTITY_AUDIT_LOG__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case AuditPackage.ENTITY_AUDIT_LOG__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return AuditPackage.ENTITY_AUDIT_LOG__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return AuditPackage.ENTITY_AUDIT_LOG__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return AuditPackage.ENTITY_AUDIT_LOG__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return AuditPackage.ENTITY_AUDIT_LOG__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntityAuditLogImpl
