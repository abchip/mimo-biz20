/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.survey.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.content.survey.SurveyPackage;
import org.abchip.mimo.biz.model.content.survey.SurveyQuestion;
import org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory;
import org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption;
import org.abchip.mimo.biz.model.content.survey.SurveyQuestionType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getSurveyQuestionId <em>Survey Question Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getEnumTypeId <em>Enum Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getSurveyQuestionCategoryId <em>Survey Question Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getSurveyQuestionOptions <em>Survey Question Options</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl#getSurveyQuestionTypeId <em>Survey Question Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyQuestionImpl extends EntityTypedImpl<SurveyQuestionType> implements SurveyQuestion {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_QUESTION;
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
	public String getDescription() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnumTypeId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION__ENUM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumTypeId(String newEnumTypeId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__ENUM_TYPE_ID, newEnumTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormatString() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION__FORMAT_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatString(String newFormatString) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__FORMAT_STRING, newFormatString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoId() {
		return (Geo)eGet(SurveyPackage.Literals.SURVEY_QUESTION__GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(Geo newGeoId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__GEO_ID, newGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHint() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION__HINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHint(String newHint) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__HINT, newHint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuestion() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION__QUESTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(String newQuestion) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__QUESTION, newQuestion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestionCategory getSurveyQuestionCategoryId() {
		return (SurveyQuestionCategory)eGet(SurveyPackage.Literals.SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionCategoryId(SurveyQuestionCategory newSurveyQuestionCategoryId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY_ID, newSurveyQuestionCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SurveyQuestionOption> getSurveyQuestionOptions() {
		return (List<SurveyQuestionOption>)eGet(SurveyPackage.Literals.SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyQuestionId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION__SURVEY_QUESTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionId(String newSurveyQuestionId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__SURVEY_QUESTION_ID, newSurveyQuestionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestionType getSurveyQuestionTypeId() {
		return (SurveyQuestionType)eGet(SurveyPackage.Literals.SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestionTypeId(SurveyQuestionType newSurveyQuestionTypeId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION__SURVEY_QUESTION_TYPE_ID, newSurveyQuestionTypeId);
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
				case SurveyPackage.SURVEY_QUESTION__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SurveyPackage.SURVEY_QUESTION__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SurveyPackage.SURVEY_QUESTION__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SurveyPackage.SURVEY_QUESTION__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SurveyPackage.SURVEY_QUESTION__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SurveyPackage.SURVEY_QUESTION__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SurveyPackage.SURVEY_QUESTION__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SurveyPackage.SURVEY_QUESTION__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SurveyQuestionImpl
