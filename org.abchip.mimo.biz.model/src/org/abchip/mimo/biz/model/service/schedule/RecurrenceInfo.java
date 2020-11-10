/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.service.schedule;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurrence Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getRecurrenceInfoId <em>Recurrence Info Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getExceptionDateTimes <em>Exception Date Times</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getExceptionRule <em>Exception Rule</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getRecurrenceCount <em>Recurrence Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getRecurrenceDateTimes <em>Recurrence Date Times</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getRecurrenceRule <em>Recurrence Rule</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getStartDateTime <em>Start Date Time</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getRecurrenceInfo()
 * @model
 * @generated
 */
public interface RecurrenceInfo extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Recurrence Info Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Info Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info Id</em>' attribute.
	 * @see #setRecurrenceInfoId(String)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getRecurrenceInfo_RecurrenceInfoId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRecurrenceInfoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getRecurrenceInfoId <em>Recurrence Info Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info Id</em>' attribute.
	 * @see #getRecurrenceInfoId()
	 * @generated
	 */
	void setRecurrenceInfoId(String value);

	/**
	 * Returns the value of the '<em><b>Exception Date Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Date Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Date Times</em>' attribute.
	 * @see #setExceptionDateTimes(String)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getRecurrenceInfo_ExceptionDateTimes()
	 * @model
	 * @generated
	 */
	String getExceptionDateTimes();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getExceptionDateTimes <em>Exception Date Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Date Times</em>' attribute.
	 * @see #getExceptionDateTimes()
	 * @generated
	 */
	void setExceptionDateTimes(String value);

	/**
	 * Returns the value of the '<em><b>Exception Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Rule</em>' reference.
	 * @see #setExceptionRule(RecurrenceRule)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getRecurrenceInfo_ExceptionRule()
	 * @model keys="recurrenceRuleId"
	 * @generated
	 */
	RecurrenceRule getExceptionRule();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getExceptionRule <em>Exception Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Rule</em>' reference.
	 * @see #getExceptionRule()
	 * @generated
	 */
	void setExceptionRule(RecurrenceRule value);

	/**
	 * Returns the value of the '<em><b>Recurrence Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Count</em>' attribute.
	 * @see #setRecurrenceCount(long)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getRecurrenceInfo_RecurrenceCount()
	 * @model annotation="mimo-ent-slot help='Not recommended - more than one process could be using this RecurrenceInfo'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getRecurrenceCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getRecurrenceCount <em>Recurrence Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Count</em>' attribute.
	 * @see #getRecurrenceCount()
	 * @generated
	 */
	void setRecurrenceCount(long value);

	/**
	 * Returns the value of the '<em><b>Recurrence Date Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence Date Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Date Times</em>' attribute.
	 * @see #setRecurrenceDateTimes(String)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getRecurrenceInfo_RecurrenceDateTimes()
	 * @model
	 * @generated
	 */
	String getRecurrenceDateTimes();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getRecurrenceDateTimes <em>Recurrence Date Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Date Times</em>' attribute.
	 * @see #getRecurrenceDateTimes()
	 * @generated
	 */
	void setRecurrenceDateTimes(String value);

	/**
	 * Returns the value of the '<em><b>Recurrence Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Rule</em>' reference.
	 * @see #setRecurrenceRule(RecurrenceRule)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getRecurrenceInfo_RecurrenceRule()
	 * @model keys="recurrenceRuleId"
	 * @generated
	 */
	RecurrenceRule getRecurrenceRule();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getRecurrenceRule <em>Recurrence Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Rule</em>' reference.
	 * @see #getRecurrenceRule()
	 * @generated
	 */
	void setRecurrenceRule(RecurrenceRule value);

	/**
	 * Returns the value of the '<em><b>Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date Time</em>' attribute.
	 * @see #setStartDateTime(Date)
	 * @see org.abchip.mimo.biz.model.service.schedule.SchedulePackage#getRecurrenceInfo_StartDateTime()
	 * @model
	 * @generated
	 */
	Date getStartDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo#getStartDateTime <em>Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date Time</em>' attribute.
	 * @see #getStartDateTime()
	 * @generated
	 */
	void setStartDateTime(Date value);

} // RecurrenceInfo
