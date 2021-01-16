/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.rate;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.period.PeriodType;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.humanres.position.EmplPositionType;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Amount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getRateType <em>Rate Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getRateCurrencyUom <em>Rate Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getWorkEffort <em>Work Effort</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getEmplPositionType <em>Empl Position Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getPeriodType <em>Period Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getRateAmount <em>Rate Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount()
 * @model
 * @generated
 */
public interface RateAmount extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Rate Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Type</em>' reference.
	 * @see #setRateType(RateType)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_RateType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RateType getRateType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getRateType <em>Rate Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Type</em>' reference.
	 * @see #getRateType()
	 * @generated
	 */
	void setRateType(RateType value);

	/**
	 * Returns the value of the '<em><b>Rate Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Currency Uom</em>' reference.
	 * @see #setRateCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_RateCurrencyUom()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Uom getRateCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getRateCurrencyUom <em>Rate Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Currency Uom</em>' reference.
	 * @see #getRateCurrencyUom()
	 * @generated
	 */
	void setRateCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_WorkEffort()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Empl Position Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Type</em>' reference.
	 * @see #setEmplPositionType(EmplPositionType)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_EmplPositionType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplPositionType getEmplPositionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getEmplPositionType <em>Empl Position Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Type</em>' reference.
	 * @see #getEmplPositionType()
	 * @generated
	 */
	void setEmplPositionType(EmplPositionType value);

	/**
	 * Returns the value of the '<em><b>Period Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Type</em>' reference.
	 * @see #setPeriodType(PeriodType)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_PeriodType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PeriodType getPeriodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getPeriodType <em>Period Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Type</em>' reference.
	 * @see #getPeriodType()
	 * @generated
	 */
	void setPeriodType(PeriodType value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='Describes when a rate amount will be valid. If null, valid immediately.'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Rate Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Amount</em>' attribute.
	 * @see #setRateAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_RateAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getRateAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getRateAmount <em>Rate Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Amount</em>' attribute.
	 * @see #getRateAmount()
	 * @generated
	 */
	void setRateAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.rate.RatePackage#getRateAmount_ThruDate()
	 * @model annotation="mimo-ent-slot help='Describes when a rate amount will be valid untl. If null, valid indefinitly.'"
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.rate.RateAmount#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // RateAmount
