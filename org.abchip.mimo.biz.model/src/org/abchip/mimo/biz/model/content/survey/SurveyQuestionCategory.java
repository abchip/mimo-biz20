/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.survey;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Question Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getSurveyQuestionCategoryId <em>Survey Question Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getParentCategory <em>Parent Category</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionCategory()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SurveyQuestionCategory extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionCategory_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category</em>' reference.
	 * @see #setParentCategory(SurveyQuestionCategory)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionCategory_ParentCategory()
	 * @model
	 * @generated
	 */
	SurveyQuestionCategory getParentCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getParentCategory <em>Parent Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Category</em>' reference.
	 * @see #getParentCategory()
	 * @generated
	 */
	void setParentCategory(SurveyQuestionCategory value);

	/**
	 * Returns the value of the '<em><b>Survey Question Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Question Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Category Id</em>' attribute.
	 * @see #setSurveyQuestionCategoryId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionCategory_SurveyQuestionCategoryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyQuestionCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getSurveyQuestionCategoryId <em>Survey Question Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Category Id</em>' attribute.
	 * @see #getSurveyQuestionCategoryId()
	 * @generated
	 */
	void setSurveyQuestionCategoryId(String value);

} // SurveyQuestionCategory
