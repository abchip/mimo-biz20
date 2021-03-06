/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.survey;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.content.survey.SurveyFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "survey";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/content/survey";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-survey";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyPackage eINSTANCE = org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SURVEY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Acro Form Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__ACRO_FORM_CONTENT_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__ALLOW_MULTIPLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Allow Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__ALLOW_UPDATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__COMMENTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__IS_ANONYMOUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Response Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__RESPONSE_SERVICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Submit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SUBMIT_CAPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Survey Multi Resps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SURVEY_MULTI_RESPS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Survey Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SURVEY_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Survey Pages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SURVEY_PAGES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Survey Question Appls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SURVEY_QUESTION_APPLS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Survey Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SURVEY_TRIGGERS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyApplTypeImpl <em>Appl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyApplTypeImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyApplType()
	 * @generated
	 */
	int SURVEY_APPL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_APPL_TYPE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_APPL_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_APPL_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_APPL_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Appl Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_APPL_TYPE__SURVEY_APPL_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_APPL_TYPE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Appl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_APPL_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyMultiRespImpl <em>Multi Resp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyMultiRespImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyMultiResp()
	 * @generated
	 */
	int SURVEY_MULTI_RESP = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP__SURVEY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Survey Multi Resp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP__SURVEY_MULTI_RESP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Multi Resp Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP__MULTI_RESP_TITLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Multi Resp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyMultiRespColumnImpl <em>Multi Resp Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyMultiRespColumnImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyMultiRespColumn()
	 * @generated
	 */
	int SURVEY_MULTI_RESP_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__SURVEY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Survey Multi Resp Col Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Survey Multi Resp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Column Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Multi Resp Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_MULTI_RESP_COLUMN_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyPageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPageImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyPage()
	 * @generated
	 */
	int SURVEY_PAGE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__SURVEY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Survey Page Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__SURVEY_PAGE_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__PAGE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_PAGE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestion()
	 * @generated
	 */
	int SURVEY_QUESTION = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__SURVEY_QUESTION_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Enum Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__ENUM_TYPE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__FORMAT_STRING = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__GEO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__HINT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__QUESTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Survey Question Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Survey Question Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Survey Question Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION__SURVEY_QUESTION_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionApplImpl <em>Question Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionApplImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestionAppl()
	 * @generated
	 */
	int SURVEY_QUESTION_APPL = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__SURVEY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Survey Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__SURVEY_QUESTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>External Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__EXTERNAL_FIELD_REF = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__REQUIRED_FIELD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Survey Multi Resp Col Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_COL_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Survey Multi Resp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Survey Page Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__SURVEY_PAGE_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>With Survey Option Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__WITH_SURVEY_OPTION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>With Survey Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL__WITH_SURVEY_QUESTION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Question Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_APPL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionCategoryImpl <em>Question Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionCategoryImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestionCategory()
	 * @generated
	 */
	int SURVEY_QUESTION_CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_CATEGORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_CATEGORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_CATEGORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_CATEGORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Question Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_CATEGORY__SURVEY_QUESTION_CATEGORY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_CATEGORY__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_CATEGORY__PARENT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Question Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_CATEGORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl <em>Question Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestionOption()
	 * @generated
	 */
	int SURVEY_QUESTION_OPTION = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__SURVEY_QUESTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Survey Option Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Amount Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__AMOUNT_BASE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Amount Base Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__DURATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Duration Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__DURATION_UOM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Weight Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION__WEIGHT_FACTOR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Question Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_OPTION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionTypeImpl <em>Question Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionTypeImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestionType()
	 * @generated
	 */
	int SURVEY_QUESTION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Question Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_TYPE__SURVEY_QUESTION_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Question Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_QUESTION_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyResponseImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyResponse()
	 * @generated
	 */
	int SURVEY_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__SURVEY_RESPONSE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>General Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__GENERAL_FEEDBACK = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__LAST_MODIFIED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__REFERENCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__RESPONSE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE__SURVEY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyResponseAnswerImpl <em>Response Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyResponseAnswerImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyResponseAnswer()
	 * @generated
	 */
	int SURVEY_RESPONSE_ANSWER = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Survey Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Survey Multi Resp Col Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Amount Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__AMOUNT_BASE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Amount Base Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Answered Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__ANSWERED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Boolean Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Currency Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__DURATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Duration Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Float Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Numeric Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Survey Multi Resp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Survey Option Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Text Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Weight Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Response Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_RESPONSE_ANSWER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyTriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyTriggerImpl
	 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyTrigger()
	 * @generated
	 */
	int SURVEY_TRIGGER = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER__SURVEY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Survey Appl Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER__SURVEY_APPL_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_TRIGGER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#getSurveyId <em>Survey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getSurveyId()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_SurveyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#getAcroFormContentId <em>Acro Form Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acro Form Content Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getAcroFormContentId()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_AcroFormContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#isAllowMultiple <em>Allow Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Multiple</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#isAllowMultiple()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_AllowMultiple();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#isAllowUpdate <em>Allow Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Update</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#isAllowUpdate()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_AllowUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getComments()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getDescription()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#isIsAnonymous <em>Is Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Anonymous</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#isIsAnonymous()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_IsAnonymous();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#getResponseService <em>Response Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Service</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getResponseService()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_ResponseService();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#getSubmitCaption <em>Submit Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Caption</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getSubmitCaption()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_SubmitCaption();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.survey.Survey#getSurveyMultiResps <em>Survey Multi Resps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Multi Resps</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getSurveyMultiResps()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_SurveyMultiResps();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.Survey#getSurveyName <em>Survey Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getSurveyName()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_SurveyName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.survey.Survey#getSurveyPages <em>Survey Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Pages</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getSurveyPages()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_SurveyPages();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.survey.Survey#getSurveyQuestionAppls <em>Survey Question Appls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Question Appls</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getSurveyQuestionAppls()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_SurveyQuestionAppls();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.survey.Survey#getSurveyTriggers <em>Survey Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Triggers</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.Survey#getSurveyTriggers()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_SurveyTriggers();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyApplType <em>Appl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appl Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyApplType
	 * @generated
	 */
	EClass getSurveyApplType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyApplType#getSurveyApplTypeId <em>Survey Appl Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Appl Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyApplType#getSurveyApplTypeId()
	 * @see #getSurveyApplType()
	 * @generated
	 */
	EAttribute getSurveyApplType_SurveyApplTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyApplType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyApplType#getDescription()
	 * @see #getSurveyApplType()
	 * @generated
	 */
	EAttribute getSurveyApplType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiResp <em>Multi Resp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Resp</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiResp
	 * @generated
	 */
	EClass getSurveyMultiResp();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiResp#getSurvey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiResp#getSurvey()
	 * @see #getSurveyMultiResp()
	 * @generated
	 */
	EReference getSurveyMultiResp_Survey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiResp#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Multi Resp Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiResp#getSurveyMultiRespId()
	 * @see #getSurveyMultiResp()
	 * @generated
	 */
	EAttribute getSurveyMultiResp_SurveyMultiRespId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiResp#getMultiRespTitle <em>Multi Resp Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Resp Title</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiResp#getMultiRespTitle()
	 * @see #getSurveyMultiResp()
	 * @generated
	 */
	EAttribute getSurveyMultiResp_MultiRespTitle();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn <em>Multi Resp Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Resp Column</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn
	 * @generated
	 */
	EClass getSurveyMultiRespColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getSurveyId <em>Survey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getSurveyId()
	 * @see #getSurveyMultiRespColumn()
	 * @generated
	 */
	EAttribute getSurveyMultiRespColumn_SurveyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Multi Resp Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getSurveyMultiRespId()
	 * @see #getSurveyMultiRespColumn()
	 * @generated
	 */
	EAttribute getSurveyMultiRespColumn_SurveyMultiRespId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Multi Resp Col Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getSurveyMultiRespColId()
	 * @see #getSurveyMultiRespColumn()
	 * @generated
	 */
	EAttribute getSurveyMultiRespColumn_SurveyMultiRespColId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getColumnTitle <em>Column Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Title</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getColumnTitle()
	 * @see #getSurveyMultiRespColumn()
	 * @generated
	 */
	EAttribute getSurveyMultiRespColumn_ColumnTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyMultiRespColumn#getSequenceNum()
	 * @see #getSurveyMultiRespColumn()
	 * @generated
	 */
	EAttribute getSurveyMultiRespColumn_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPage
	 * @generated
	 */
	EClass getSurveyPage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyPage#getSurvey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPage#getSurvey()
	 * @see #getSurveyPage()
	 * @generated
	 */
	EReference getSurveyPage_Survey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyPage#getSurveyPageSeqId <em>Survey Page Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Page Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPage#getSurveyPageSeqId()
	 * @see #getSurveyPage()
	 * @generated
	 */
	EAttribute getSurveyPage_SurveyPageSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyPage#getPageName <em>Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Name</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPage#getPageName()
	 * @see #getSurveyPage()
	 * @generated
	 */
	EAttribute getSurveyPage_PageName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyPage#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPage#getSequenceNum()
	 * @see #getSurveyPage()
	 * @generated
	 */
	EAttribute getSurveyPage_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion
	 * @generated
	 */
	EClass getSurveyQuestion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionId <em>Survey Question Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Question Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionId()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EAttribute getSurveyQuestion_SurveyQuestionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getDescription()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EAttribute getSurveyQuestion_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getEnumTypeId <em>Enum Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getEnumTypeId()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EAttribute getSurveyQuestion_EnumTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getFormatString <em>Format String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format String</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getFormatString()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EAttribute getSurveyQuestion_FormatString();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getGeo()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EReference getSurveyQuestion_Geo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getHint()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EAttribute getSurveyQuestion_Hint();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getQuestion()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EAttribute getSurveyQuestion_Question();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionCategory <em>Survey Question Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Question Category</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionCategory()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EReference getSurveyQuestion_SurveyQuestionCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionOptions <em>Survey Question Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Survey Question Options</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionOptions()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EReference getSurveyQuestion_SurveyQuestionOptions();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionType <em>Survey Question Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Question Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestion#getSurveyQuestionType()
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	EReference getSurveyQuestion_SurveyQuestionType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl <em>Question Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Appl</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl
	 * @generated
	 */
	EClass getSurveyQuestionAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurvey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurvey()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EReference getSurveyQuestionAppl_Survey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyQuestion <em>Survey Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Question</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyQuestion()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EReference getSurveyQuestionAppl_SurveyQuestion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getFromDate()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getExternalFieldRef <em>External Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Field Ref</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getExternalFieldRef()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_ExternalFieldRef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getRequiredField <em>Required Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Field</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getRequiredField()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_RequiredField();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSequenceNum()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Multi Resp Col Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyMultiRespColId()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_SurveyMultiRespColId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Multi Resp Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyMultiRespId()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_SurveyMultiRespId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyPageSeqId <em>Survey Page Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Page Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyPageSeqId()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_SurveyPageSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getThruDate()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getWithSurveyOptionSeqId <em>With Survey Option Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Survey Option Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getWithSurveyOptionSeqId()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_WithSurveyOptionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getWithSurveyQuestionId <em>With Survey Question Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Survey Question Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getWithSurveyQuestionId()
	 * @see #getSurveyQuestionAppl()
	 * @generated
	 */
	EAttribute getSurveyQuestionAppl_WithSurveyQuestionId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory <em>Question Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Category</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory
	 * @generated
	 */
	EClass getSurveyQuestionCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getSurveyQuestionCategoryId <em>Survey Question Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Question Category Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getSurveyQuestionCategoryId()
	 * @see #getSurveyQuestionCategory()
	 * @generated
	 */
	EAttribute getSurveyQuestionCategory_SurveyQuestionCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getDescription()
	 * @see #getSurveyQuestionCategory()
	 * @generated
	 */
	EAttribute getSurveyQuestionCategory_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Category</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionCategory#getParentCategory()
	 * @see #getSurveyQuestionCategory()
	 * @generated
	 */
	EReference getSurveyQuestionCategory_ParentCategory();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption <em>Question Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Option</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption
	 * @generated
	 */
	EClass getSurveyQuestionOption();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getSurveyQuestion <em>Survey Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Question</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getSurveyQuestion()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EReference getSurveyQuestionOption_SurveyQuestion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getSurveyOptionSeqId <em>Survey Option Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Option Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getSurveyOptionSeqId()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EAttribute getSurveyQuestionOption_SurveyOptionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getAmountBase <em>Amount Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Base</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getAmountBase()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EAttribute getSurveyQuestionOption_AmountBase();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getAmountBaseUomId <em>Amount Base Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Base Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getAmountBaseUomId()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EAttribute getSurveyQuestionOption_AmountBaseUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getDescription()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EAttribute getSurveyQuestionOption_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getDuration()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EAttribute getSurveyQuestionOption_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getDurationUomId <em>Duration Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getDurationUomId()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EAttribute getSurveyQuestionOption_DurationUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getSequenceNum()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EAttribute getSurveyQuestionOption_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getWeightFactor <em>Weight Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Factor</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionOption#getWeightFactor()
	 * @see #getSurveyQuestionOption()
	 * @generated
	 */
	EAttribute getSurveyQuestionOption_WeightFactor();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionType <em>Question Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionType
	 * @generated
	 */
	EClass getSurveyQuestionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionType#getSurveyQuestionTypeId <em>Survey Question Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Question Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionType#getSurveyQuestionTypeId()
	 * @see #getSurveyQuestionType()
	 * @generated
	 */
	EAttribute getSurveyQuestionType_SurveyQuestionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyQuestionType#getDescription()
	 * @see #getSurveyQuestionType()
	 * @generated
	 */
	EAttribute getSurveyQuestionType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse
	 * @generated
	 */
	EClass getSurveyResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getSurveyResponseId <em>Survey Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Response Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getSurveyResponseId()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EAttribute getSurveyResponse_SurveyResponseId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getGeneralFeedback <em>General Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Feedback</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getGeneralFeedback()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EAttribute getSurveyResponse_GeneralFeedback();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getLastModifiedDate()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EAttribute getSurveyResponse_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getOrder()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EReference getSurveyResponse_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getOrderItemSeqId()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EAttribute getSurveyResponse_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getParty()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EReference getSurveyResponse_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getReferenceId <em>Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getReferenceId()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EAttribute getSurveyResponse_ReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getResponseDate <em>Response Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getResponseDate()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EAttribute getSurveyResponse_ResponseDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getStatus()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EReference getSurveyResponse_Status();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getSurvey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponse#getSurvey()
	 * @see #getSurveyResponse()
	 * @generated
	 */
	EReference getSurveyResponse_Survey();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer <em>Response Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Answer</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer
	 * @generated
	 */
	EClass getSurveyResponseAnswer();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyResponse <em>Survey Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Response</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyResponse()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EReference getSurveyResponseAnswer_SurveyResponse();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyQuestion <em>Survey Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Question</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyQuestion()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EReference getSurveyResponseAnswer_SurveyQuestion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Multi Resp Col Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyMultiRespColId()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_SurveyMultiRespColId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getAmountBase <em>Amount Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Base</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getAmountBase()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_AmountBase();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getAmountBaseUomId <em>Amount Base Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Base Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getAmountBaseUomId()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_AmountBaseUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getAnsweredDate <em>Answered Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answered Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getAnsweredDate()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_AnsweredDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getBooleanResponse <em>Boolean Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Response</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getBooleanResponse()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_BooleanResponse();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getContent()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EReference getSurveyResponseAnswer_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getCurrencyResponse <em>Currency Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Response</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getCurrencyResponse()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_CurrencyResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getDuration()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getDurationUomId <em>Duration Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getDurationUomId()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_DurationUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getFloatResponse <em>Float Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Response</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getFloatResponse()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_FloatResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getNumericResponse <em>Numeric Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Response</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getNumericResponse()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_NumericResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSequenceNum()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Multi Resp Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyMultiRespId()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_SurveyMultiRespId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyOptionSeqId <em>Survey Option Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Option Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getSurveyOptionSeqId()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_SurveyOptionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getTextResponse <em>Text Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Response</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getTextResponse()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_TextResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getWeightFactor <em>Weight Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Factor</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyResponseAnswer#getWeightFactor()
	 * @see #getSurveyResponseAnswer()
	 * @generated
	 */
	EAttribute getSurveyResponseAnswer_WeightFactor();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.content.survey.SurveyTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyTrigger
	 * @generated
	 */
	EClass getSurveyTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyTrigger#getSurvey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyTrigger#getSurvey()
	 * @see #getSurveyTrigger()
	 * @generated
	 */
	EReference getSurveyTrigger_Survey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.content.survey.SurveyTrigger#getSurveyApplType <em>Survey Appl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Appl Type</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyTrigger#getSurveyApplType()
	 * @see #getSurveyTrigger()
	 * @generated
	 */
	EReference getSurveyTrigger_SurveyApplType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyTrigger#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyTrigger#getFromDate()
	 * @see #getSurveyTrigger()
	 * @generated
	 */
	EAttribute getSurveyTrigger_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.content.survey.SurveyTrigger#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyTrigger#getThruDate()
	 * @see #getSurveyTrigger()
	 * @generated
	 */
	EAttribute getSurveyTrigger_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurveyFactory getSurveyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Survey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__SURVEY_ID = eINSTANCE.getSurvey_SurveyId();

		/**
		 * The meta object literal for the '<em><b>Acro Form Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__ACRO_FORM_CONTENT_ID = eINSTANCE.getSurvey_AcroFormContentId();

		/**
		 * The meta object literal for the '<em><b>Allow Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__ALLOW_MULTIPLE = eINSTANCE.getSurvey_AllowMultiple();

		/**
		 * The meta object literal for the '<em><b>Allow Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__ALLOW_UPDATE = eINSTANCE.getSurvey_AllowUpdate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__COMMENTS = eINSTANCE.getSurvey_Comments();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__DESCRIPTION = eINSTANCE.getSurvey_Description();

		/**
		 * The meta object literal for the '<em><b>Is Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__IS_ANONYMOUS = eINSTANCE.getSurvey_IsAnonymous();

		/**
		 * The meta object literal for the '<em><b>Response Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__RESPONSE_SERVICE = eINSTANCE.getSurvey_ResponseService();

		/**
		 * The meta object literal for the '<em><b>Submit Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__SUBMIT_CAPTION = eINSTANCE.getSurvey_SubmitCaption();

		/**
		 * The meta object literal for the '<em><b>Survey Multi Resps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__SURVEY_MULTI_RESPS = eINSTANCE.getSurvey_SurveyMultiResps();

		/**
		 * The meta object literal for the '<em><b>Survey Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__SURVEY_NAME = eINSTANCE.getSurvey_SurveyName();

		/**
		 * The meta object literal for the '<em><b>Survey Pages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__SURVEY_PAGES = eINSTANCE.getSurvey_SurveyPages();

		/**
		 * The meta object literal for the '<em><b>Survey Question Appls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__SURVEY_QUESTION_APPLS = eINSTANCE.getSurvey_SurveyQuestionAppls();

		/**
		 * The meta object literal for the '<em><b>Survey Triggers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__SURVEY_TRIGGERS = eINSTANCE.getSurvey_SurveyTriggers();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyApplTypeImpl <em>Appl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyApplTypeImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyApplType()
		 * @generated
		 */
		EClass SURVEY_APPL_TYPE = eINSTANCE.getSurveyApplType();

		/**
		 * The meta object literal for the '<em><b>Survey Appl Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_APPL_TYPE__SURVEY_APPL_TYPE_ID = eINSTANCE.getSurveyApplType_SurveyApplTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_APPL_TYPE__DESCRIPTION = eINSTANCE.getSurveyApplType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyMultiRespImpl <em>Multi Resp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyMultiRespImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyMultiResp()
		 * @generated
		 */
		EClass SURVEY_MULTI_RESP = eINSTANCE.getSurveyMultiResp();

		/**
		 * The meta object literal for the '<em><b>Survey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_MULTI_RESP__SURVEY = eINSTANCE.getSurveyMultiResp_Survey();

		/**
		 * The meta object literal for the '<em><b>Survey Multi Resp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_MULTI_RESP__SURVEY_MULTI_RESP_ID = eINSTANCE.getSurveyMultiResp_SurveyMultiRespId();

		/**
		 * The meta object literal for the '<em><b>Multi Resp Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_MULTI_RESP__MULTI_RESP_TITLE = eINSTANCE.getSurveyMultiResp_MultiRespTitle();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyMultiRespColumnImpl <em>Multi Resp Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyMultiRespColumnImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyMultiRespColumn()
		 * @generated
		 */
		EClass SURVEY_MULTI_RESP_COLUMN = eINSTANCE.getSurveyMultiRespColumn();

		/**
		 * The meta object literal for the '<em><b>Survey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_MULTI_RESP_COLUMN__SURVEY_ID = eINSTANCE.getSurveyMultiRespColumn_SurveyId();

		/**
		 * The meta object literal for the '<em><b>Survey Multi Resp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_ID = eINSTANCE.getSurveyMultiRespColumn_SurveyMultiRespId();

		/**
		 * The meta object literal for the '<em><b>Survey Multi Resp Col Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_MULTI_RESP_COLUMN__SURVEY_MULTI_RESP_COL_ID = eINSTANCE.getSurveyMultiRespColumn_SurveyMultiRespColId();

		/**
		 * The meta object literal for the '<em><b>Column Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_MULTI_RESP_COLUMN__COLUMN_TITLE = eINSTANCE.getSurveyMultiRespColumn_ColumnTitle();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_MULTI_RESP_COLUMN__SEQUENCE_NUM = eINSTANCE.getSurveyMultiRespColumn_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyPageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPageImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyPage()
		 * @generated
		 */
		EClass SURVEY_PAGE = eINSTANCE.getSurveyPage();

		/**
		 * The meta object literal for the '<em><b>Survey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_PAGE__SURVEY = eINSTANCE.getSurveyPage_Survey();

		/**
		 * The meta object literal for the '<em><b>Survey Page Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_PAGE__SURVEY_PAGE_SEQ_ID = eINSTANCE.getSurveyPage_SurveyPageSeqId();

		/**
		 * The meta object literal for the '<em><b>Page Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_PAGE__PAGE_NAME = eINSTANCE.getSurveyPage_PageName();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_PAGE__SEQUENCE_NUM = eINSTANCE.getSurveyPage_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestion()
		 * @generated
		 */
		EClass SURVEY_QUESTION = eINSTANCE.getSurveyQuestion();

		/**
		 * The meta object literal for the '<em><b>Survey Question Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION__SURVEY_QUESTION_ID = eINSTANCE.getSurveyQuestion_SurveyQuestionId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION__DESCRIPTION = eINSTANCE.getSurveyQuestion_Description();

		/**
		 * The meta object literal for the '<em><b>Enum Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION__ENUM_TYPE_ID = eINSTANCE.getSurveyQuestion_EnumTypeId();

		/**
		 * The meta object literal for the '<em><b>Format String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION__FORMAT_STRING = eINSTANCE.getSurveyQuestion_FormatString();

		/**
		 * The meta object literal for the '<em><b>Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_QUESTION__GEO = eINSTANCE.getSurveyQuestion_Geo();

		/**
		 * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION__HINT = eINSTANCE.getSurveyQuestion_Hint();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION__QUESTION = eINSTANCE.getSurveyQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Survey Question Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_QUESTION__SURVEY_QUESTION_CATEGORY = eINSTANCE.getSurveyQuestion_SurveyQuestionCategory();

		/**
		 * The meta object literal for the '<em><b>Survey Question Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_QUESTION__SURVEY_QUESTION_OPTIONS = eINSTANCE.getSurveyQuestion_SurveyQuestionOptions();

		/**
		 * The meta object literal for the '<em><b>Survey Question Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_QUESTION__SURVEY_QUESTION_TYPE = eINSTANCE.getSurveyQuestion_SurveyQuestionType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionApplImpl <em>Question Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionApplImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestionAppl()
		 * @generated
		 */
		EClass SURVEY_QUESTION_APPL = eINSTANCE.getSurveyQuestionAppl();

		/**
		 * The meta object literal for the '<em><b>Survey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_QUESTION_APPL__SURVEY = eINSTANCE.getSurveyQuestionAppl_Survey();

		/**
		 * The meta object literal for the '<em><b>Survey Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_QUESTION_APPL__SURVEY_QUESTION = eINSTANCE.getSurveyQuestionAppl_SurveyQuestion();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__FROM_DATE = eINSTANCE.getSurveyQuestionAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>External Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__EXTERNAL_FIELD_REF = eINSTANCE.getSurveyQuestionAppl_ExternalFieldRef();

		/**
		 * The meta object literal for the '<em><b>Required Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__REQUIRED_FIELD = eINSTANCE.getSurveyQuestionAppl_RequiredField();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__SEQUENCE_NUM = eINSTANCE.getSurveyQuestionAppl_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Survey Multi Resp Col Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_COL_ID = eINSTANCE.getSurveyQuestionAppl_SurveyMultiRespColId();

		/**
		 * The meta object literal for the '<em><b>Survey Multi Resp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__SURVEY_MULTI_RESP_ID = eINSTANCE.getSurveyQuestionAppl_SurveyMultiRespId();

		/**
		 * The meta object literal for the '<em><b>Survey Page Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__SURVEY_PAGE_SEQ_ID = eINSTANCE.getSurveyQuestionAppl_SurveyPageSeqId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__THRU_DATE = eINSTANCE.getSurveyQuestionAppl_ThruDate();

		/**
		 * The meta object literal for the '<em><b>With Survey Option Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__WITH_SURVEY_OPTION_SEQ_ID = eINSTANCE.getSurveyQuestionAppl_WithSurveyOptionSeqId();

		/**
		 * The meta object literal for the '<em><b>With Survey Question Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_APPL__WITH_SURVEY_QUESTION_ID = eINSTANCE.getSurveyQuestionAppl_WithSurveyQuestionId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionCategoryImpl <em>Question Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionCategoryImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestionCategory()
		 * @generated
		 */
		EClass SURVEY_QUESTION_CATEGORY = eINSTANCE.getSurveyQuestionCategory();

		/**
		 * The meta object literal for the '<em><b>Survey Question Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_CATEGORY__SURVEY_QUESTION_CATEGORY_ID = eINSTANCE.getSurveyQuestionCategory_SurveyQuestionCategoryId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_CATEGORY__DESCRIPTION = eINSTANCE.getSurveyQuestionCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_QUESTION_CATEGORY__PARENT_CATEGORY = eINSTANCE.getSurveyQuestionCategory_ParentCategory();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl <em>Question Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionOptionImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestionOption()
		 * @generated
		 */
		EClass SURVEY_QUESTION_OPTION = eINSTANCE.getSurveyQuestionOption();

		/**
		 * The meta object literal for the '<em><b>Survey Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_QUESTION_OPTION__SURVEY_QUESTION = eINSTANCE.getSurveyQuestionOption_SurveyQuestion();

		/**
		 * The meta object literal for the '<em><b>Survey Option Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_OPTION__SURVEY_OPTION_SEQ_ID = eINSTANCE.getSurveyQuestionOption_SurveyOptionSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_OPTION__AMOUNT_BASE = eINSTANCE.getSurveyQuestionOption_AmountBase();

		/**
		 * The meta object literal for the '<em><b>Amount Base Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_OPTION__AMOUNT_BASE_UOM_ID = eINSTANCE.getSurveyQuestionOption_AmountBaseUomId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_OPTION__DESCRIPTION = eINSTANCE.getSurveyQuestionOption_Description();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_OPTION__DURATION = eINSTANCE.getSurveyQuestionOption_Duration();

		/**
		 * The meta object literal for the '<em><b>Duration Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_OPTION__DURATION_UOM_ID = eINSTANCE.getSurveyQuestionOption_DurationUomId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_OPTION__SEQUENCE_NUM = eINSTANCE.getSurveyQuestionOption_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Weight Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_OPTION__WEIGHT_FACTOR = eINSTANCE.getSurveyQuestionOption_WeightFactor();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionTypeImpl <em>Question Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyQuestionTypeImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyQuestionType()
		 * @generated
		 */
		EClass SURVEY_QUESTION_TYPE = eINSTANCE.getSurveyQuestionType();

		/**
		 * The meta object literal for the '<em><b>Survey Question Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_TYPE__SURVEY_QUESTION_TYPE_ID = eINSTANCE.getSurveyQuestionType_SurveyQuestionTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_QUESTION_TYPE__DESCRIPTION = eINSTANCE.getSurveyQuestionType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyResponseImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyResponse()
		 * @generated
		 */
		EClass SURVEY_RESPONSE = eINSTANCE.getSurveyResponse();

		/**
		 * The meta object literal for the '<em><b>Survey Response Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE__SURVEY_RESPONSE_ID = eINSTANCE.getSurveyResponse_SurveyResponseId();

		/**
		 * The meta object literal for the '<em><b>General Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE__GENERAL_FEEDBACK = eINSTANCE.getSurveyResponse_GeneralFeedback();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE__LAST_MODIFIED_DATE = eINSTANCE.getSurveyResponse_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_RESPONSE__ORDER = eINSTANCE.getSurveyResponse_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE__ORDER_ITEM_SEQ_ID = eINSTANCE.getSurveyResponse_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_RESPONSE__PARTY = eINSTANCE.getSurveyResponse_Party();

		/**
		 * The meta object literal for the '<em><b>Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE__REFERENCE_ID = eINSTANCE.getSurveyResponse_ReferenceId();

		/**
		 * The meta object literal for the '<em><b>Response Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE__RESPONSE_DATE = eINSTANCE.getSurveyResponse_ResponseDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_RESPONSE__STATUS = eINSTANCE.getSurveyResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Survey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_RESPONSE__SURVEY = eINSTANCE.getSurveyResponse_Survey();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyResponseAnswerImpl <em>Response Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyResponseAnswerImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyResponseAnswer()
		 * @generated
		 */
		EClass SURVEY_RESPONSE_ANSWER = eINSTANCE.getSurveyResponseAnswer();

		/**
		 * The meta object literal for the '<em><b>Survey Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_RESPONSE_ANSWER__SURVEY_RESPONSE = eINSTANCE.getSurveyResponseAnswer_SurveyResponse();

		/**
		 * The meta object literal for the '<em><b>Survey Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_RESPONSE_ANSWER__SURVEY_QUESTION = eINSTANCE.getSurveyResponseAnswer_SurveyQuestion();

		/**
		 * The meta object literal for the '<em><b>Survey Multi Resp Col Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_COL_ID = eINSTANCE.getSurveyResponseAnswer_SurveyMultiRespColId();

		/**
		 * The meta object literal for the '<em><b>Amount Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__AMOUNT_BASE = eINSTANCE.getSurveyResponseAnswer_AmountBase();

		/**
		 * The meta object literal for the '<em><b>Amount Base Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__AMOUNT_BASE_UOM_ID = eINSTANCE.getSurveyResponseAnswer_AmountBaseUomId();

		/**
		 * The meta object literal for the '<em><b>Answered Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__ANSWERED_DATE = eINSTANCE.getSurveyResponseAnswer_AnsweredDate();

		/**
		 * The meta object literal for the '<em><b>Boolean Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__BOOLEAN_RESPONSE = eINSTANCE.getSurveyResponseAnswer_BooleanResponse();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_RESPONSE_ANSWER__CONTENT = eINSTANCE.getSurveyResponseAnswer_Content();

		/**
		 * The meta object literal for the '<em><b>Currency Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__CURRENCY_RESPONSE = eINSTANCE.getSurveyResponseAnswer_CurrencyResponse();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__DURATION = eINSTANCE.getSurveyResponseAnswer_Duration();

		/**
		 * The meta object literal for the '<em><b>Duration Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__DURATION_UOM_ID = eINSTANCE.getSurveyResponseAnswer_DurationUomId();

		/**
		 * The meta object literal for the '<em><b>Float Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__FLOAT_RESPONSE = eINSTANCE.getSurveyResponseAnswer_FloatResponse();

		/**
		 * The meta object literal for the '<em><b>Numeric Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__NUMERIC_RESPONSE = eINSTANCE.getSurveyResponseAnswer_NumericResponse();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__SEQUENCE_NUM = eINSTANCE.getSurveyResponseAnswer_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Survey Multi Resp Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__SURVEY_MULTI_RESP_ID = eINSTANCE.getSurveyResponseAnswer_SurveyMultiRespId();

		/**
		 * The meta object literal for the '<em><b>Survey Option Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__SURVEY_OPTION_SEQ_ID = eINSTANCE.getSurveyResponseAnswer_SurveyOptionSeqId();

		/**
		 * The meta object literal for the '<em><b>Text Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__TEXT_RESPONSE = eINSTANCE.getSurveyResponseAnswer_TextResponse();

		/**
		 * The meta object literal for the '<em><b>Weight Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_RESPONSE_ANSWER__WEIGHT_FACTOR = eINSTANCE.getSurveyResponseAnswer_WeightFactor();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.content.survey.impl.SurveyTriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyTriggerImpl
		 * @see org.abchip.mimo.biz.model.content.survey.impl.SurveyPackageImpl#getSurveyTrigger()
		 * @generated
		 */
		EClass SURVEY_TRIGGER = eINSTANCE.getSurveyTrigger();

		/**
		 * The meta object literal for the '<em><b>Survey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_TRIGGER__SURVEY = eINSTANCE.getSurveyTrigger_Survey();

		/**
		 * The meta object literal for the '<em><b>Survey Appl Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY_TRIGGER__SURVEY_APPL_TYPE = eINSTANCE.getSurveyTrigger_SurveyApplType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_TRIGGER__FROM_DATE = eINSTANCE.getSurveyTrigger_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY_TRIGGER__THRU_DATE = eINSTANCE.getSurveyTrigger_ThruDate();

	}

} //SurveyPackage
