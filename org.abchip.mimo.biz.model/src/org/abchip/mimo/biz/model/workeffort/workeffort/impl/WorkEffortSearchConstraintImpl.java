/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.workeffort.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortSearchConstraint;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortSearchResult;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Search Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getWorkEffortSearchResult <em>Work Effort Search Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getConstraintSeqId <em>Constraint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getAnyPrefix <em>Any Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getAnySuffix <em>Any Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getIncludeSubWorkEfforts <em>Include Sub Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getIsAnd <em>Is And</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortSearchConstraintImpl#getRemoveStems <em>Remove Stems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortSearchConstraintImpl extends EntityIdentifiableImpl implements WorkEffortSearchConstraint {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortSearchConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT;
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
	public WorkEffortSearchResult getWorkEffortSearchResult() {
		return (WorkEffortSearchResult)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__WORK_EFFORT_SEARCH_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortSearchResult(WorkEffortSearchResult newWorkEffortSearchResult) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__WORK_EFFORT_SEARCH_RESULT, newWorkEffortSearchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintName() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintName(String newConstraintName) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_NAME, newConstraintName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintSeqId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintSeqId(String newConstraintSeqId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID, newConstraintSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnyPrefix() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__ANY_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnyPrefix(String newAnyPrefix) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__ANY_PREFIX, newAnyPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnySuffix() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__ANY_SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnySuffix(String newAnySuffix) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__ANY_SUFFIX, newAnySuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHighValue() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__HIGH_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHighValue(String newHighValue) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__HIGH_VALUE, newHighValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeSubWorkEfforts() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__INCLUDE_SUB_WORK_EFFORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeSubWorkEfforts(Boolean newIncludeSubWorkEfforts) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__INCLUDE_SUB_WORK_EFFORTS, newIncludeSubWorkEfforts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoString() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__INFO_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoString(String newInfoString) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__INFO_STRING, newInfoString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsAnd() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__IS_AND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAnd(Boolean newIsAnd) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__IS_AND, newIsAnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLowValue() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__LOW_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowValue(String newLowValue) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__LOW_VALUE, newLowValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRemoveStems() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__REMOVE_STEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveStems(Boolean newRemoveStems) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_SEARCH_CONSTRAINT__REMOVE_STEMS, newRemoveStems);
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
				case WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return WorkeffortPackage.WORK_EFFORT_SEARCH_CONSTRAINT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WorkEffortSearchConstraintImpl
