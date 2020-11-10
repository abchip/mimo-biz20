/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.survey;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getGeneralFeedback <em>General Feedback</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getReferenceId <em>Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getResponseDate <em>Response Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getSurvey <em>Survey</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse()
 * @model
 * @generated
 */
public interface SurveyResponse extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>General Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Feedback</em>' attribute.
	 * @see #setGeneralFeedback(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_GeneralFeedback()
	 * @model
	 * @generated
	 */
	String getGeneralFeedback();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getGeneralFeedback <em>General Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Feedback</em>' attribute.
	 * @see #getGeneralFeedback()
	 * @generated
	 */
	void setGeneralFeedback(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_Order()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Id</em>' attribute.
	 * @see #setReferenceId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_ReferenceId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getReferenceId <em>Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Id</em>' attribute.
	 * @see #getReferenceId()
	 * @generated
	 */
	void setReferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Date</em>' attribute.
	 * @see #setResponseDate(Date)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_ResponseDate()
	 * @model
	 * @generated
	 */
	Date getResponseDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getResponseDate <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Date</em>' attribute.
	 * @see #getResponseDate()
	 * @generated
	 */
	void setResponseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Survey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey</em>' reference.
	 * @see #setSurvey(Survey)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_Survey()
	 * @model keys="surveyId"
	 * @generated
	 */
	Survey getSurvey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getSurvey <em>Survey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey</em>' reference.
	 * @see #getSurvey()
	 * @generated
	 */
	void setSurvey(Survey value);

	/**
	 * Returns the value of the '<em><b>Survey Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response Id</em>' attribute.
	 * @see #setSurveyResponseId(String)
	 * @see org.abchip.mimo.biz.model.content.survey.SurveyPackage#getSurveyResponse_SurveyResponseId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSurveyResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.survey.SurveyResponse#getSurveyResponseId <em>Survey Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response Id</em>' attribute.
	 * @see #getSurveyResponseId()
	 * @generated
	 */
	void setSurveyResponseId(String value);

} // SurveyResponse
