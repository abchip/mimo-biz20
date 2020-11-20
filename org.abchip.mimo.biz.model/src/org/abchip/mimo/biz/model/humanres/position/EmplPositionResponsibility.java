/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.position;

import java.util.Date;
import org.abchip.mimo.biz.model.humanres.ability.ResponsibilityType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Position Responsibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getEmplPosition <em>Empl Position</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getResponsibilityType <em>Responsibility Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionResponsibility()
 * @model
 * @generated
 */
public interface EmplPositionResponsibility extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Empl Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position</em>' reference.
	 * @see #setEmplPosition(EmplPosition)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionResponsibility_EmplPosition()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EmplPosition getEmplPosition();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getEmplPosition <em>Empl Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position</em>' reference.
	 * @see #getEmplPosition()
	 * @generated
	 */
	void setEmplPosition(EmplPosition value);

	/**
	 * Returns the value of the '<em><b>Responsibility Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsibility Type</em>' reference.
	 * @see #setResponsibilityType(ResponsibilityType)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionResponsibility_ResponsibilityType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ResponsibilityType getResponsibilityType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getResponsibilityType <em>Responsibility Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsibility Type</em>' reference.
	 * @see #getResponsibilityType()
	 * @generated
	 */
	void setResponsibilityType(ResponsibilityType value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionResponsibility_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

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
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionResponsibility_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionResponsibility_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionResponsibility#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // EmplPositionResponsibility
