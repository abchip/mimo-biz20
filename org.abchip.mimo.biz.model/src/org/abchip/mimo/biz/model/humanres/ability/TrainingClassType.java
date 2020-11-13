/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.ability;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getTrainingClassTypeId <em>Training Class Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getTrainingClassType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface TrainingClassType extends EntityType<PersonTraining>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getTrainingClassType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getTrainingClassType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(TrainingClassType)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getTrainingClassType_ParentType()
	 * @model keys="trainingClassTypeId"
	 * @generated
	 */
	TrainingClassType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(TrainingClassType value);

	/**
	 * Returns the value of the '<em><b>Training Class Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Training Class Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Class Type Id</em>' attribute.
	 * @see #setTrainingClassTypeId(String)
	 * @see org.abchip.mimo.biz.model.humanres.ability.AbilityPackage#getTrainingClassType_TrainingClassTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTrainingClassTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.ability.TrainingClassType#getTrainingClassTypeId <em>Training Class Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Class Type Id</em>' attribute.
	 * @see #getTrainingClassTypeId()
	 * @generated
	 */
	void setTrainingClassTypeId(String value);

} // TrainingClassType
