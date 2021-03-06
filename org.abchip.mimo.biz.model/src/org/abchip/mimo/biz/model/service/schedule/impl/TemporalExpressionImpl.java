/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.service.schedule.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.service.schedule.SchedulePackage;
import org.abchip.mimo.biz.model.service.schedule.TemporalExpression;
import org.abchip.mimo.biz.model.service.schedule.TemporalExpressionAssoc;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getTempExprId <em>Temp Expr Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getDate1 <em>Date1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getDate2 <em>Date2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getFromTemporalExpressionAssocs <em>From Temporal Expression Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getInteger1 <em>Integer1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getInteger2 <em>Integer2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getString1 <em>String1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getString2 <em>String2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.TemporalExpressionImpl#getTempExprTypeId <em>Temp Expr Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalExpressionImpl extends EntityIdentifiableImpl implements TemporalExpression {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.TEMPORAL_EXPRESSION;
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
	public String getTempExprId() {
		return (String)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__TEMP_EXPR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempExprId(String newTempExprId) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__TEMP_EXPR_ID, newTempExprId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate1() {
		return (Date)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__DATE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate1(Date newDate1) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__DATE1, newDate1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate2() {
		return (Date)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__DATE2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate2(Date newDate2) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__DATE2, newDate2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TemporalExpressionAssoc> getFromTemporalExpressionAssocs() {
		return (List<TemporalExpressionAssoc>)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__FROM_TEMPORAL_EXPRESSION_ASSOCS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInteger1() {
		return (Long)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__INTEGER1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteger1(long newInteger1) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__INTEGER1, newInteger1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInteger2() {
		return (Long)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__INTEGER2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInteger2(long newInteger2) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__INTEGER2, newInteger2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getString1() {
		return (String)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__STRING1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setString1(String newString1) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__STRING1, newString1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getString2() {
		return (String)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__STRING2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setString2(String newString2) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__STRING2, newString2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTempExprTypeId() {
		return (String)eGet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__TEMP_EXPR_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempExprTypeId(String newTempExprTypeId) {
		eSet(SchedulePackage.Literals.TEMPORAL_EXPRESSION__TEMP_EXPR_TYPE_ID, newTempExprTypeId);
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
				case SchedulePackage.TEMPORAL_EXPRESSION__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SchedulePackage.TEMPORAL_EXPRESSION__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SchedulePackage.TEMPORAL_EXPRESSION__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SchedulePackage.TEMPORAL_EXPRESSION__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SchedulePackage.TEMPORAL_EXPRESSION__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SchedulePackage.TEMPORAL_EXPRESSION__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SchedulePackage.TEMPORAL_EXPRESSION__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SchedulePackage.TEMPORAL_EXPRESSION__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TemporalExpressionImpl
