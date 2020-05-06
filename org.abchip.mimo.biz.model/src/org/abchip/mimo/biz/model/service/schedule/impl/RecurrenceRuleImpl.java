/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.service.schedule.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.service.schedule.RecurrenceRule;
import org.abchip.mimo.biz.model.service.schedule.SchedulePackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurrence Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getRecurrenceRuleId <em>Recurrence Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getByDayList <em>By Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getByHourList <em>By Hour List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getByMinuteList <em>By Minute List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getByMonthDayList <em>By Month Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getByMonthList <em>By Month List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getBySecondList <em>By Second List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getBySetPosList <em>By Set Pos List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getByWeekNoList <em>By Week No List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getByYearDayList <em>By Year Day List</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getCountNumber <em>Count Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getIntervalNumber <em>Interval Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getUntilDateTime <em>Until Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getWeekStart <em>Week Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.impl.RecurrenceRuleImpl#getXName <em>XName</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecurrenceRuleImpl extends EntityIdentifiableImpl implements RecurrenceRule {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurrenceRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulePackage.Literals.RECURRENCE_RULE;
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
	public String getRecurrenceRuleId() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__RECURRENCE_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceRuleId(String newRecurrenceRuleId) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__RECURRENCE_RULE_ID, newRecurrenceRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByDayList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_DAY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByDayList(String newByDayList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_DAY_LIST, newByDayList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByHourList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_HOUR_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByHourList(String newByHourList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_HOUR_LIST, newByHourList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByMinuteList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_MINUTE_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByMinuteList(String newByMinuteList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_MINUTE_LIST, newByMinuteList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByMonthDayList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_MONTH_DAY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByMonthDayList(String newByMonthDayList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_MONTH_DAY_LIST, newByMonthDayList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByMonthList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_MONTH_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByMonthList(String newByMonthList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_MONTH_LIST, newByMonthList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBySecondList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_SECOND_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBySecondList(String newBySecondList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_SECOND_LIST, newBySecondList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBySetPosList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_SET_POS_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBySetPosList(String newBySetPosList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_SET_POS_LIST, newBySetPosList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByWeekNoList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_WEEK_NO_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByWeekNoList(String newByWeekNoList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_WEEK_NO_LIST, newByWeekNoList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByYearDayList() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__BY_YEAR_DAY_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByYearDayList(String newByYearDayList) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__BY_YEAR_DAY_LIST, newByYearDayList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCountNumber() {
		return (Long)eGet(SchedulePackage.Literals.RECURRENCE_RULE__COUNT_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountNumber(long newCountNumber) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__COUNT_NUMBER, newCountNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrequency() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__FREQUENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(String newFrequency) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__FREQUENCY, newFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIntervalNumber() {
		return (Long)eGet(SchedulePackage.Literals.RECURRENCE_RULE__INTERVAL_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntervalNumber(long newIntervalNumber) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__INTERVAL_NUMBER, newIntervalNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUntilDateTime() {
		return (Date)eGet(SchedulePackage.Literals.RECURRENCE_RULE__UNTIL_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUntilDateTime(Date newUntilDateTime) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__UNTIL_DATE_TIME, newUntilDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeekStart() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__WEEK_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeekStart(String newWeekStart) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__WEEK_START, newWeekStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXName() {
		return (String)eGet(SchedulePackage.Literals.RECURRENCE_RULE__XNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXName(String newXName) {
		eSet(SchedulePackage.Literals.RECURRENCE_RULE__XNAME, newXName);
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
				case SchedulePackage.RECURRENCE_RULE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SchedulePackage.RECURRENCE_RULE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SchedulePackage.RECURRENCE_RULE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SchedulePackage.RECURRENCE_RULE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SchedulePackage.RECURRENCE_RULE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SchedulePackage.RECURRENCE_RULE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SchedulePackage.RECURRENCE_RULE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SchedulePackage.RECURRENCE_RULE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RecurrenceRuleImpl
