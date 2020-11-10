/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.period;

import java.util.Date;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Time Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getIsClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getParentPeriod <em>Parent Period</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getPeriodName <em>Period Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getPeriodNum <em>Period Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getPeriodType <em>Period Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod()
 * @model
 * @generated
 */
public interface CustomTimePeriod extends EntityTyped<PeriodType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Closed</em>' attribute.
	 * @see #setIsClosed(Boolean)
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_IsClosed()
	 * @model
	 * @generated
	 */
	Boolean getIsClosed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getIsClosed <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Closed</em>' attribute.
	 * @see #getIsClosed()
	 * @generated
	 */
	void setIsClosed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_OrganizationParty()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Parent Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Period</em>' reference.
	 * @see #setParentPeriod(CustomTimePeriod)
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_ParentPeriod()
	 * @model keys="customTimePeriodId"
	 * @generated
	 */
	CustomTimePeriod getParentPeriod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getParentPeriod <em>Parent Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Period</em>' reference.
	 * @see #getParentPeriod()
	 * @generated
	 */
	void setParentPeriod(CustomTimePeriod value);

	/**
	 * Returns the value of the '<em><b>Period Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Name</em>' attribute.
	 * @see #setPeriodName(String)
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_PeriodName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getPeriodName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getPeriodName <em>Period Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Name</em>' attribute.
	 * @see #getPeriodName()
	 * @generated
	 */
	void setPeriodName(String value);

	/**
	 * Returns the value of the '<em><b>Period Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Num</em>' attribute.
	 * @see #setPeriodNum(long)
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_PeriodNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPeriodNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getPeriodNum <em>Period Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Num</em>' attribute.
	 * @see #getPeriodNum()
	 * @generated
	 */
	void setPeriodNum(long value);

	/**
	 * Returns the value of the '<em><b>Period Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Type</em>' reference.
	 * @see #setPeriodType(PeriodType)
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_PeriodType()
	 * @model keys="periodTypeId"
	 * @generated
	 */
	PeriodType getPeriodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getPeriodType <em>Period Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Type</em>' reference.
	 * @see #getPeriodType()
	 * @generated
	 */
	void setPeriodType(PeriodType value);

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
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Custom Time Period Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Time Period Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Time Period Id</em>' attribute.
	 * @see #setCustomTimePeriodId(String)
	 * @see org.abchip.mimo.biz.model.common.period.PeriodPackage#getCustomTimePeriod_CustomTimePeriodId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCustomTimePeriodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.period.CustomTimePeriod#getCustomTimePeriodId <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Time Period Id</em>' attribute.
	 * @see #getCustomTimePeriodId()
	 * @generated
	 */
	void setCustomTimePeriodId(String value);

} // CustomTimePeriod
