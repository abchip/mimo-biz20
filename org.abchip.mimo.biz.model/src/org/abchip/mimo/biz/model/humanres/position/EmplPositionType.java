/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.position;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeId <em>Empl Position Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeClasses <em>Empl Position Type Classes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeRates <em>Empl Position Type Rates</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getValidResponsibilities <em>Valid Responsibilities</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface EmplPositionType extends EntityType<EmplPosition>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Empl Position Type Classes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Type Classes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionType_EmplPositionTypeClasses()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<EmplPositionTypeClass> getEmplPositionTypeClasses();

	/**
	 * Returns the value of the '<em><b>Empl Position Type Rates</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.humanres.position.EmplPositionTypeRate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Type Rates</em>' reference list.
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionType_EmplPositionTypeRates()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<EmplPositionTypeRate> getEmplPositionTypeRates();

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionType_HasTable()
	 * @model required="true"
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(EmplPositionType)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionType_ParentType()
	 * @model keys="emplPositionTypeId"
	 * @generated
	 */
	EmplPositionType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(EmplPositionType value);

	/**
	 * Returns the value of the '<em><b>Valid Responsibilities</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.humanres.position.ValidResponsibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Responsibilities</em>' reference list.
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionType_ValidResponsibilities()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<ValidResponsibility> getValidResponsibilities();

	/**
	 * Returns the value of the '<em><b>Empl Position Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Position Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Position Type Id</em>' attribute.
	 * @see #setEmplPositionTypeId(String)
	 * @see org.abchip.mimo.biz.model.humanres.position.PositionPackage#getEmplPositionType_EmplPositionTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEmplPositionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.position.EmplPositionType#getEmplPositionTypeId <em>Empl Position Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Position Type Id</em>' attribute.
	 * @see #getEmplPositionTypeId()
	 * @generated
	 */
	void setEmplPositionTypeId(String value);

} // EmplPositionType
