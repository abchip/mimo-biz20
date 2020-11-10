/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.cost.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.product.cost.CostComponentCalc;
import org.abchip.mimo.biz.model.product.cost.CostPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Component Calc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getCostCustomMethod <em>Cost Custom Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getCostGlAccountType <em>Cost Gl Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getFixedCost <em>Fixed Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getOffsettingGlAccountType <em>Offsetting Gl Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getPerMilliSecond <em>Per Milli Second</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentCalcImpl#getVariableCost <em>Variable Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostComponentCalcImpl extends EntityIdentifiableImpl implements CostComponentCalc {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostComponentCalcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CostPackage.Literals.COST_COMPONENT_CALC;
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
	public String getDescription() {
		return (String)eGet(CostPackage.Literals.COST_COMPONENT_CALC__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFixedCost() {
		return (BigDecimal)eGet(CostPackage.Literals.COST_COMPONENT_CALC__FIXED_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedCost(BigDecimal newFixedCost) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__FIXED_COST, newFixedCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getOffsettingGlAccountType() {
		return (GlAccountType)eGet(CostPackage.Literals.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffsettingGlAccountType(GlAccountType newOffsettingGlAccountType) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__OFFSETTING_GL_ACCOUNT_TYPE, newOffsettingGlAccountType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerMilliSecond() {
		return (Long)eGet(CostPackage.Literals.COST_COMPONENT_CALC__PER_MILLI_SECOND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerMilliSecond(long newPerMilliSecond) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__PER_MILLI_SECOND, newPerMilliSecond);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVariableCost() {
		return (BigDecimal)eGet(CostPackage.Literals.COST_COMPONENT_CALC__VARIABLE_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableCost(BigDecimal newVariableCost) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__VARIABLE_COST, newVariableCost);
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
				case CostPackage.COST_COMPONENT_CALC__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case CostPackage.COST_COMPONENT_CALC__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case CostPackage.COST_COMPONENT_CALC__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case CostPackage.COST_COMPONENT_CALC__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return CostPackage.COST_COMPONENT_CALC__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return CostPackage.COST_COMPONENT_CALC__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return CostPackage.COST_COMPONENT_CALC__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return CostPackage.COST_COMPONENT_CALC__LAST_UPDATED_TX_STAMP;
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
	public String getCostComponentCalcId() {
		return (String)eGet(CostPackage.Literals.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentCalcId(String newCostComponentCalcId) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__COST_COMPONENT_CALC_ID, newCostComponentCalcId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getCostCustomMethod() {
		return (CustomMethod)eGet(CostPackage.Literals.COST_COMPONENT_CALC__COST_CUSTOM_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostCustomMethod(CustomMethod newCostCustomMethod) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__COST_CUSTOM_METHOD, newCostCustomMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getCostGlAccountType() {
		return (GlAccountType)eGet(CostPackage.Literals.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostGlAccountType(GlAccountType newCostGlAccountType) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__COST_GL_ACCOUNT_TYPE, newCostGlAccountType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(CostPackage.Literals.COST_COMPONENT_CALC__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(CostPackage.Literals.COST_COMPONENT_CALC__CURRENCY_UOM, newCurrencyUom);
	}

} //CostComponentCalcImpl
