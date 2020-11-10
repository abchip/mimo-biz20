/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.manufacturing.techdata;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Data Calendar Exc Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek#getCalendar <em>Calendar</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek#getExceptionDateStart <em>Exception Date Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarWeek <em>Calendar Week</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek()
 * @model annotation="mimo-ent-frame help='Used to defined some weeks which differ from the normal week defined in the calendar.' title='Calendar Exception Week' formula='description'"
 * @generated
 */
public interface TechDataCalendarExcWeek extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Calendar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar</em>' reference.
	 * @see #setCalendar(TechDataCalendar)
	 * @see org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek_Calendar()
	 * @model keys="calendarId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TechDataCalendar getCalendar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek#getCalendar <em>Calendar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar</em>' reference.
	 * @see #getCalendar()
	 * @generated
	 */
	void setCalendar(TechDataCalendar value);

	/**
	 * Returns the value of the '<em><b>Exception Date Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Date Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Date Start</em>' attribute.
	 * @see #setExceptionDateStart(Date)
	 * @see org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek_ExceptionDateStart()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getExceptionDateStart();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek#getExceptionDateStart <em>Exception Date Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Date Start</em>' attribute.
	 * @see #getExceptionDateStart()
	 * @generated
	 */
	void setExceptionDateStart(Date value);

	/**
	 * Returns the value of the '<em><b>Calendar Week</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Week</em>' reference.
	 * @see #setCalendarWeek(TechDataCalendarWeek)
	 * @see org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek_CalendarWeek()
	 * @model keys="calendarWeekId"
	 * @generated
	 */
	TechDataCalendarWeek getCalendarWeek();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek#getCalendarWeek <em>Calendar Week</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Week</em>' reference.
	 * @see #getCalendarWeek()
	 * @generated
	 */
	void setCalendarWeek(TechDataCalendarWeek value);

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
	 * @see org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage#getTechDataCalendarExcWeek_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.techdata.TechDataCalendarExcWeek#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // TechDataCalendarExcWeek
