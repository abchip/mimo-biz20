/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.survey;

import java.util.List;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getEnumTypeId <em>Enum Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getGeo <em>Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getHint <em>Hint</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionCategory <em>Survey Question Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionOptions <em>Survey Question Options</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionType <em>Survey Question Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SurveyQuestion extends EntityTyped<SurveyQuestionType>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Enum Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Type Id</em>' attribute.
	 * @see #setEnumTypeId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_EnumTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEnumTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getEnumTypeId <em>Enum Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Type Id</em>' attribute.
	 * @see #getEnumTypeId()
	 * @generated
	 */
	void setEnumTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format String</em>' attribute.
	 * @see #setFormatString(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_FormatString()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getFormatString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getFormatString <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format String</em>' attribute.
	 * @see #getFormatString()
	 * @generated
	 */
	void setFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(Geo)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_Geo()
	 * @model
	 * @generated
	 */
	Geo getGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' attribute.
	 * @see #setHint(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_Hint()
	 * @model
	 * @generated
	 */
	String getHint();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getHint <em>Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' attribute.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(String value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Survey Question Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Category</em>' reference.
	 * @see #setSurveyQuestionCategory(SurveyQuestionCategory)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_SurveyQuestionCategory()
	 * @model
	 * @generated
	 */
	SurveyQuestionCategory getSurveyQuestionCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionCategory <em>Survey Question Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Category</em>' reference.
	 * @see #getSurveyQuestionCategory()
	 * @generated
	 */
	void setSurveyQuestionCategory(SurveyQuestionCategory value);

	/**
	 * Returns the value of the '<em><b>Survey Question Options</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Options</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_SurveyQuestionOptions()
	 * @model derived="true"
	 * @generated
	 */
	List<SurveyQuestionOption> getSurveyQuestionOptions();

	/**
	 * Returns the value of the '<em><b>Survey Question Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Type</em>' reference.
	 * @see #setSurveyQuestionType(SurveyQuestionType)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_SurveyQuestionType()
	 * @model
	 * @generated
	 */
	SurveyQuestionType getSurveyQuestionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionType <em>Survey Question Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Type</em>' reference.
	 * @see #getSurveyQuestionType()
	 * @generated
	 */
	void setSurveyQuestionType(SurveyQuestionType value);

	/**
	 * Returns the value of the '<em><b>Survey Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Question Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Id</em>' attribute.
	 * @see #setSurveyQuestionId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestion_SurveyQuestionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyQuestionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionId <em>Survey Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Id</em>' attribute.
	 * @see #getSurveyQuestionId()
	 * @generated
	 */
	void setSurveyQuestionId(String value);

} // SurveyQuestion
