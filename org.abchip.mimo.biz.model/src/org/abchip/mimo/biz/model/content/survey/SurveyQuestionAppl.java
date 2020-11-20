/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.survey;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Question Appl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurvey <em>Survey</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyQuestion <em>Survey Question</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getExternalFieldRef <em>External Field Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getRequiredField <em>Required Field</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyPageSeqId <em>Survey Page Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getWithSurveyOptionSeqId <em>With Survey Option Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getWithSurveyQuestionId <em>With Survey Question Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl()
 * @model annotation="mimo-ent-frame title='Survey Question Application'"
 * @generated
 */
public interface SurveyQuestionAppl extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey</em>' reference.
	 * @see #setSurvey(Survey)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_Survey()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Survey getSurvey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurvey <em>Survey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey</em>' reference.
	 * @see #getSurvey()
	 * @generated
	 */
	void setSurvey(Survey value);

	/**
	 * Returns the value of the '<em><b>Survey Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question</em>' reference.
	 * @see #setSurveyQuestion(SurveyQuestion)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyQuestion()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SurveyQuestion getSurveyQuestion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyQuestion <em>Survey Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question</em>' reference.
	 * @see #getSurveyQuestion()
	 * @generated
	 */
	void setSurveyQuestion(SurveyQuestion value);

	/**
	 * Returns the value of the '<em><b>External Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Field Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Field Ref</em>' attribute.
	 * @see #setExternalFieldRef(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_ExternalFieldRef()
	 * @model annotation="mimo-ent-slot help='External field ID/reference; for AcroForms used to track the field ID'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getExternalFieldRef();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getExternalFieldRef <em>External Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Field Ref</em>' attribute.
	 * @see #getExternalFieldRef()
	 * @generated
	 */
	void setExternalFieldRef(String value);

	/**
	 * Returns the value of the '<em><b>Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Field</em>' attribute.
	 * @see #setRequiredField(Boolean)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_RequiredField()
	 * @model
	 * @generated
	 */
	Boolean getRequiredField();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getRequiredField <em>Required Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Field</em>' attribute.
	 * @see #getRequiredField()
	 * @generated
	 */
	void setRequiredField(Boolean value);

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
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Survey Multi Resp Col Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Multi Resp Col Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Multi Resp Col Id</em>' attribute.
	 * @see #setSurveyMultiRespColId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyMultiRespColId()
	 * @model annotation="mimo-ent-slot help='Used to optionally associate this question to a specific column in the Multi-Response set; with this you can associate a single question to each cell in the question/column grid; this is useful for AcroForm round trips where the target PDF needs a question associated with each cell, or even the same question applied with different externalFieldRef values.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyMultiRespColId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyMultiRespColId <em>Survey Multi Resp Col Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Multi Resp Col Id</em>' attribute.
	 * @see #getSurveyMultiRespColId()
	 * @generated
	 */
	void setSurveyMultiRespColId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Multi Resp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Multi Resp Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Multi Resp Id</em>' attribute.
	 * @see #setSurveyMultiRespId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyMultiRespId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyMultiRespId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyMultiRespId <em>Survey Multi Resp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Multi Resp Id</em>' attribute.
	 * @see #getSurveyMultiRespId()
	 * @generated
	 */
	void setSurveyMultiRespId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Page Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Page Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Page Seq Id</em>' attribute.
	 * @see #setSurveyPageSeqId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_SurveyPageSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyPageSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getSurveyPageSeqId <em>Survey Page Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Page Seq Id</em>' attribute.
	 * @see #getSurveyPageSeqId()
	 * @generated
	 */
	void setSurveyPageSeqId(String value);

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
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>With Survey Option Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Survey Option Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Survey Option Seq Id</em>' attribute.
	 * @see #setWithSurveyOptionSeqId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_WithSurveyOptionSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWithSurveyOptionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getWithSurveyOptionSeqId <em>With Survey Option Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Survey Option Seq Id</em>' attribute.
	 * @see #getWithSurveyOptionSeqId()
	 * @generated
	 */
	void setWithSurveyOptionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>With Survey Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Survey Question Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Survey Question Id</em>' attribute.
	 * @see #setWithSurveyQuestionId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyQuestionAppl_WithSurveyQuestionId()
	 * @model annotation="mimo-ent-slot help='These two with* fields are used to specify that this question should only appear if the with option has been selected for the with question.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWithSurveyQuestionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyQuestionAppl#getWithSurveyQuestionId <em>With Survey Question Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Survey Question Id</em>' attribute.
	 * @see #getWithSurveyQuestionId()
	 * @generated
	 */
	void setWithSurveyQuestionId(String value);

} // SurveyQuestionAppl
