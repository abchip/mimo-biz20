/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.position;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Position Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getEmplPositionType <em>Empl Position Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getEmplPositionClassType <em>Empl Position Class Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getStandardHoursPerWeek <em>Standard Hours Per Week</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionTypeClass()
 * @model
 * @generated
 */
public interface EmplPositionTypeClass extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Empl Position Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Type</em>' reference.
	 * @see #setEmplPositionType(EmplPositionType)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionTypeClass_EmplPositionType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplPositionType getEmplPositionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getEmplPositionType <em>Empl Position Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Type</em>' reference.
	 * @see #getEmplPositionType()
	 * @generated
	 */
	void setEmplPositionType(EmplPositionType value);

	/**
	 * Returns the value of the '<em><b>Empl Position Class Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Class Type</em>' reference.
	 * @see #setEmplPositionClassType(EmplPositionClassType)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionTypeClass_EmplPositionClassType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplPositionClassType getEmplPositionClassType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getEmplPositionClassType <em>Empl Position Class Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Class Type</em>' reference.
	 * @see #getEmplPositionClassType()
	 * @generated
	 */
	void setEmplPositionClassType(EmplPositionClassType value);

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
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionTypeClass_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Standard Hours Per Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Hours Per Week</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Hours Per Week</em>' attribute.
	 * @see #setStandardHoursPerWeek(double)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionTypeClass_StandardHoursPerWeek()
	 * @model
	 * @generated
	 */
	double getStandardHoursPerWeek();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getStandardHoursPerWeek <em>Standard Hours Per Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Hours Per Week</em>' attribute.
	 * @see #getStandardHoursPerWeek()
	 * @generated
	 */
	void setStandardHoursPerWeek(double value);

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
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionTypeClass_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // EmplPositionTypeClass
