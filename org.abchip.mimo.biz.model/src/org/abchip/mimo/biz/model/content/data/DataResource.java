/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.data;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.datasource.DataSource;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.content.survey.Survey;
import org.abchip.mimo.biz.model.content.survey.SurveyResponse;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureDataResource;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataCategory <em>Data Category</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceAttributes <em>Data Resource Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceMetaDatas <em>Data Resource Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceName <em>Data Resource Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourcePurposes <em>Data Resource Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceType <em>Data Resource Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataTemplateType <em>Data Template Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getObjectInfo <em>Object Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getProductFeatureDataResources <em>Product Feature Data Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getRelatedDetailId <em>Related Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getSurvey <em>Survey</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResource#getSurveyResponse <em>Survey Response</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource()
 * @model annotation="mimo-ent-frame title='Data Object'"
 * @generated
 */
public interface DataResource extends EntityTyped<DataResourceType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Data Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Category</em>' reference.
	 * @see #setDataCategory(DataCategory)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataCategory()
	 * @model keys="dataCategoryId"
	 * @generated
	 */
	DataCategory getDataCategory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataCategory <em>Data Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Category</em>' reference.
	 * @see #getDataCategory()
	 * @generated
	 */
	void setDataCategory(DataCategory value);

	/**
	 * Returns the value of the '<em><b>Data Resource Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.data.DataResourceAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataResourceAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<DataResourceAttribute> getDataResourceAttributes();

	/**
	 * Returns the value of the '<em><b>Data Resource Meta Datas</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Meta Datas</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataResourceMetaDatas()
	 * @model derived="true"
	 * @generated
	 */
	List<DataResourceMetaData> getDataResourceMetaDatas();

	/**
	 * Returns the value of the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Id</em>' attribute.
	 * @see #setDataResourceId(String)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataResourceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceId <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Id</em>' attribute.
	 * @see #getDataResourceId()
	 * @generated
	 */
	void setDataResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Character Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set</em>' reference.
	 * @see #setCharacterSet(CharacterSet)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_CharacterSet()
	 * @model keys="characterSetId"
	 * @generated
	 */
	CharacterSet getCharacterSet();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getCharacterSet <em>Character Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set</em>' reference.
	 * @see #getCharacterSet()
	 * @generated
	 */
	void setCharacterSet(CharacterSet value);

	/**
	 * Returns the value of the '<em><b>Data Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Name</em>' attribute.
	 * @see #setDataResourceName(String)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataResourceName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDataResourceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceName <em>Data Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Name</em>' attribute.
	 * @see #getDataResourceName()
	 * @generated
	 */
	void setDataResourceName(String value);

	/**
	 * Returns the value of the '<em><b>Data Resource Purposes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.data.DataResourcePurpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Purposes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataResourcePurposes()
	 * @model derived="true"
	 * @generated
	 */
	List<DataResourcePurpose> getDataResourcePurposes();

	/**
	 * Returns the value of the '<em><b>Data Resource Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Type</em>' reference.
	 * @see #setDataResourceType(DataResourceType)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataResourceType()
	 * @model keys="dataResourceTypeId"
	 * @generated
	 */
	DataResourceType getDataResourceType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataResourceType <em>Data Resource Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Type</em>' reference.
	 * @see #getDataResourceType()
	 * @generated
	 */
	void setDataResourceType(DataResourceType value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see #setDataSource(DataSource)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataSource()
	 * @model keys="dataSourceId"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataSource <em>Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Data Template Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Template Type</em>' reference.
	 * @see #setDataTemplateType(DataTemplateType)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_DataTemplateType()
	 * @model keys="dataTemplateTypeId"
	 * @generated
	 */
	DataTemplateType getDataTemplateType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getDataTemplateType <em>Data Template Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Template Type</em>' reference.
	 * @see #getDataTemplateType()
	 * @generated
	 */
	void setDataTemplateType(DataTemplateType value);

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_IsPublic()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If this is set to Y then anyone can download it, otherwise the download is restricted.'"
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #setLastModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_LastModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

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
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Locale String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale String</em>' attribute.
	 * @see #setLocaleString(String)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_LocaleString()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getLocaleString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getLocaleString <em>Locale String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale String</em>' attribute.
	 * @see #getLocaleString()
	 * @generated
	 */
	void setLocaleString(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' reference.
	 * @see #setMimeType(MimeType)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_MimeType()
	 * @model keys="mimeTypeId"
	 * @generated
	 */
	MimeType getMimeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getMimeType <em>Mime Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' reference.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(MimeType value);

	/**
	 * Returns the value of the '<em><b>Object Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Info</em>' attribute.
	 * @see #setObjectInfo(String)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_ObjectInfo()
	 * @model annotation="mimo-ent-slot help='For Short Text the text goes here.'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getObjectInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getObjectInfo <em>Object Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Info</em>' attribute.
	 * @see #getObjectInfo()
	 * @generated
	 */
	void setObjectInfo(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Data Resources</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.feature.ProductFeatureDataResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Data Resources</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_ProductFeatureDataResources()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductFeatureDataResource> getProductFeatureDataResources();

	/**
	 * Returns the value of the '<em><b>Related Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Detail Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Detail Id</em>' attribute.
	 * @see #setRelatedDetailId(String)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_RelatedDetailId()
	 * @model annotation="mimo-ent-slot help='Depending on the dataResourceTypeId this can point to other entities, like: Survey, SurveyResponse, etc.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRelatedDetailId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getRelatedDetailId <em>Related Detail Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Detail Id</em>' attribute.
	 * @see #getRelatedDetailId()
	 * @generated
	 */
	void setRelatedDetailId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getStatus <em>Status</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_Survey()
	 * @model keys="surveyId"
	 * @generated
	 */
	Survey getSurvey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getSurvey <em>Survey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey</em>' reference.
	 * @see #getSurvey()
	 * @generated
	 */
	void setSurvey(Survey value);

	/**
	 * Returns the value of the '<em><b>Survey Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response</em>' reference.
	 * @see #setSurveyResponse(SurveyResponse)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResource_SurveyResponse()
	 * @model keys="surveyResponseId"
	 * @generated
	 */
	SurveyResponse getSurveyResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResource#getSurveyResponse <em>Survey Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response</em>' reference.
	 * @see #getSurveyResponse()
	 * @generated
	 */
	void setSurveyResponse(SurveyResponse value);

} // DataResource
