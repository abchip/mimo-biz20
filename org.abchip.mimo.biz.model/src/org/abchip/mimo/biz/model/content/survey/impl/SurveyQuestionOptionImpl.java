/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.survey.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.content.survey.SurveyPackage;
import org.abchip.mimo.biz.model.content.survey.SurveyQuestion;
import org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey Question Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getSurveyQuestion <em>Survey Question</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getSurveyOptionSeqId <em>Survey Option Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getAmountBase <em>Amount Base</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getAmountBaseUomId <em>Amount Base Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getDurationUomId <em>Duration Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl#getWeightFactor <em>Weight Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyQuestionOptionImpl extends EntityIdentifiableImpl implements SurveyQuestionOption {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyQuestionOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY_QUESTION_OPTION;
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
	public SurveyQuestion getSurveyQuestion() {
		return (SurveyQuestion)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SURVEY_QUESTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyQuestion(SurveyQuestion newSurveyQuestion) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SURVEY_QUESTION, newSurveyQuestion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmountBase() {
		return (BigDecimal)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__AMOUNT_BASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountBase(BigDecimal newAmountBase) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__AMOUNT_BASE, newAmountBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAmountBaseUomId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountBaseUomId(String newAmountBaseUomId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID, newAmountBaseUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDuration() {
		return (Long)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(long newDuration) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDurationUomId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DURATION_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationUomId(String newDurationUomId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__DURATION_UOM_ID, newDurationUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyOptionSeqId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyOptionSeqId(String newSurveyOptionSeqId) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID, newSurveyOptionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeightFactor() {
		return (Double)eGet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__WEIGHT_FACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightFactor(double newWeightFactor) {
		eSet(SurveyPackage.Literals.SURVEY_QUESTION_OPTION__WEIGHT_FACTOR, newWeightFactor);
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
				case SurveyPackage.SURVEY_QUESTION_OPTION__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SurveyPackage.SURVEY_QUESTION_OPTION__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SurveyPackage.SURVEY_QUESTION_OPTION__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SurveyPackage.SURVEY_QUESTION_OPTION__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SurveyPackage.SURVEY_QUESTION_OPTION__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SurveyPackage.SURVEY_QUESTION_OPTION__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SurveyPackage.SURVEY_QUESTION_OPTION__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SurveyPackage.SURVEY_QUESTION_OPTION__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SurveyQuestionOptionImpl
