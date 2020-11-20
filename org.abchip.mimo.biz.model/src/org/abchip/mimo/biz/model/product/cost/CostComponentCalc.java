/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.cost;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Component Calc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostComponentCalcId <em>Cost Component Calc Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostCustomMethod <em>Cost Custom Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostGlAccountType <em>Cost Gl Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getFixedCost <em>Fixed Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getOffsettingGlAccountType <em>Offsetting Gl Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getPerMilliSecond <em>Per Milli Second</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getVariableCost <em>Variable Cost</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc()
 * @model annotation="mimo-ent-frame title='Cost Component Calculation' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface CostComponentCalc extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Cost</em>' attribute.
	 * @see #setFixedCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_FixedCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getFixedCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getFixedCost <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Cost</em>' attribute.
	 * @see #getFixedCost()
	 * @generated
	 */
	void setFixedCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Offsetting Gl Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offsetting Gl Account Type</em>' reference.
	 * @see #setOffsettingGlAccountType(GlAccountType)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_OffsettingGlAccountType()
	 * @model
	 * @generated
	 */
	GlAccountType getOffsettingGlAccountType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getOffsettingGlAccountType <em>Offsetting Gl Account Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offsetting Gl Account Type</em>' reference.
	 * @see #getOffsettingGlAccountType()
	 * @generated
	 */
	void setOffsettingGlAccountType(GlAccountType value);

	/**
	 * Returns the value of the '<em><b>Per Milli Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Milli Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Milli Second</em>' attribute.
	 * @see #setPerMilliSecond(long)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_PerMilliSecond()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPerMilliSecond();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getPerMilliSecond <em>Per Milli Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Milli Second</em>' attribute.
	 * @see #getPerMilliSecond()
	 * @generated
	 */
	void setPerMilliSecond(long value);

	/**
	 * Returns the value of the '<em><b>Variable Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Cost</em>' attribute.
	 * @see #setVariableCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_VariableCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getVariableCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getVariableCost <em>Variable Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Cost</em>' attribute.
	 * @see #getVariableCost()
	 * @generated
	 */
	void setVariableCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Cost Component Calc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Calc Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Calc Id</em>' attribute.
	 * @see #setCostComponentCalcId(String)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_CostComponentCalcId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCostComponentCalcId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostComponentCalcId <em>Cost Component Calc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Calc Id</em>' attribute.
	 * @see #getCostComponentCalcId()
	 * @generated
	 */
	void setCostComponentCalcId(String value);

	/**
	 * Returns the value of the '<em><b>Cost Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Custom Method</em>' reference.
	 * @see #setCostCustomMethod(CustomMethod)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_CostCustomMethod()
	 * @model
	 * @generated
	 */
	CustomMethod getCostCustomMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostCustomMethod <em>Cost Custom Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Custom Method</em>' reference.
	 * @see #getCostCustomMethod()
	 * @generated
	 */
	void setCostCustomMethod(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Cost Gl Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Gl Account Type</em>' reference.
	 * @see #setCostGlAccountType(GlAccountType)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_CostGlAccountType()
	 * @model
	 * @generated
	 */
	GlAccountType getCostGlAccountType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCostGlAccountType <em>Cost Gl Account Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Gl Account Type</em>' reference.
	 * @see #getCostGlAccountType()
	 * @generated
	 */
	void setCostGlAccountType(GlAccountType value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponentCalc_CurrencyUom()
	 * @model
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponentCalc#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

} // CostComponentCalc
