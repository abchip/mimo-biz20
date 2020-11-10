/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.manufacturing.techdata.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek;
import org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarWeek;
import org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tech Data Calendar Exc Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getExceptionDateStart <em>Exception Date Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getCalendarWeek <em>Calendar Week</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechDataCalendarExcWeekImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechDataCalendarExcWeekImpl extends EntityIdentifiableImpl implements TechDataCalendarExcWeek {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechDataCalendarExcWeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK;
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
	public TechDataCalendar getCalendar() {
		return (TechDataCalendar)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendar(TechDataCalendar newCalendar) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR, newCalendar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExceptionDateStart() {
		return (Date)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionDateStart(Date newExceptionDateStart) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__EXCEPTION_DATE_START, newExceptionDateStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendarWeek getCalendarWeek() {
		return (TechDataCalendarWeek)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarWeek(TechDataCalendarWeek newCalendarWeek) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__CALENDAR_WEEK, newCalendarWeek);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TechdataPackage.Literals.TECH_DATA_CALENDAR_EXC_WEEK__DESCRIPTION, newDescription);
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
				case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return TechdataPackage.TECH_DATA_CALENDAR_EXC_WEEK__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TechDataCalendarExcWeekImpl
