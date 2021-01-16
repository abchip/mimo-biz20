/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.content;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.datasource.DataSource;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.content.data.CharacterSet;
import org.abchip.mimo.biz.model.content.data.DataResource;
import org.abchip.mimo.biz.model.content.data.MimeType;
import org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getChildBranchCount <em>Child Branch Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getChildLeafCount <em>Child Leaf Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getContentAttributes <em>Content Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getContentKeywords <em>Content Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getContentMetaDatas <em>Content Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getContentName <em>Content Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getContentPurposes <em>Content Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getContentRevisions <em>Content Revisions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getCustomMethod <em>Custom Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getDataResource <em>Data Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getDecoratorContent <em>Decorator Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getFromCommEventContentAssocs <em>From Comm Event Content Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getInstanceOfContent <em>Instance Of Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getOwnerContent <em>Owner Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getPrivilegeEnum <em>Privilege Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.Content#getTemplateDataResource <em>Template Data Resource</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent()
 * @model annotation="mimo-ent-frame dictionary='ContentEntityLabels' formula='description'"
 * @generated
 */
public interface Content extends EntityTyped<ContentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Child Branch Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Branch Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Branch Count</em>' attribute.
	 * @see #setChildBranchCount(long)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ChildBranchCount()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getChildBranchCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getChildBranchCount <em>Child Branch Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Branch Count</em>' attribute.
	 * @see #getChildBranchCount()
	 * @generated
	 */
	void setChildBranchCount(long value);

	/**
	 * Returns the value of the '<em><b>Child Leaf Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Leaf Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Leaf Count</em>' attribute.
	 * @see #setChildLeafCount(long)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ChildLeafCount()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getChildLeafCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getChildLeafCount <em>Child Leaf Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Leaf Count</em>' attribute.
	 * @see #getChildLeafCount()
	 * @generated
	 */
	void setChildLeafCount(long value);

	/**
	 * Returns the value of the '<em><b>Content Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.content.ContentAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ContentAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentAttribute> getContentAttributes();

	/**
	 * Returns the value of the '<em><b>Content Keywords</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.content.ContentKeyword}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Keywords</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ContentKeywords()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentKeyword> getContentKeywords();

	/**
	 * Returns the value of the '<em><b>Content Meta Datas</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.content.ContentMetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Meta Datas</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ContentMetaDatas()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentMetaData> getContentMetaDatas();

	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ContentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Character Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set</em>' reference.
	 * @see #setCharacterSet(CharacterSet)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_CharacterSet()
	 * @model
	 * @generated
	 */
	CharacterSet getCharacterSet();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getCharacterSet <em>Character Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set</em>' reference.
	 * @see #getCharacterSet()
	 * @generated
	 */
	void setCharacterSet(CharacterSet value);

	/**
	 * Returns the value of the '<em><b>Content Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Name</em>' attribute.
	 * @see #setContentName(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ContentName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getContentName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getContentName <em>Content Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Name</em>' attribute.
	 * @see #getContentName()
	 * @generated
	 */
	void setContentName(String value);

	/**
	 * Returns the value of the '<em><b>Content Purposes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.content.ContentPurpose}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Purposes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ContentPurposes()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentPurpose> getContentPurposes();

	/**
	 * Returns the value of the '<em><b>Content Revisions</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.content.ContentRevision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Revisions</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ContentRevisions()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentRevision> getContentRevisions();

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' reference.
	 * @see #setContentType(ContentType)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ContentType()
	 * @model
	 * @generated
	 */
	ContentType getContentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getContentType <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' reference.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(ContentType value);

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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_CreatedByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method</em>' reference.
	 * @see #setCustomMethod(CustomMethod)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_CustomMethod()
	 * @model
	 * @generated
	 */
	CustomMethod getCustomMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getCustomMethod <em>Custom Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method</em>' reference.
	 * @see #getCustomMethod()
	 * @generated
	 */
	void setCustomMethod(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource</em>' reference.
	 * @see #setDataResource(DataResource)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_DataResource()
	 * @model
	 * @generated
	 */
	DataResource getDataResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getDataResource <em>Data Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource</em>' reference.
	 * @see #getDataResource()
	 * @generated
	 */
	void setDataResource(DataResource value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see #setDataSource(DataSource)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_DataSource()
	 * @model
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getDataSource <em>Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Decorator Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorator Content</em>' reference.
	 * @see #setDecoratorContent(Content)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_DecoratorContent()
	 * @model
	 * @generated
	 */
	Content getDecoratorContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getDecoratorContent <em>Decorator Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorator Content</em>' reference.
	 * @see #getDecoratorContent()
	 * @generated
	 */
	void setDecoratorContent(Content value);

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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>From Comm Event Content Assocs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.party.communication.CommEventContentAssoc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Comm Event Content Assocs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_FromCommEventContentAssocs()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<CommEventContentAssoc> getFromCommEventContentAssocs();

	/**
	 * Returns the value of the '<em><b>Instance Of Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of Content</em>' reference.
	 * @see #setInstanceOfContent(Content)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_InstanceOfContent()
	 * @model
	 * @generated
	 */
	Content getInstanceOfContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getInstanceOfContent <em>Instance Of Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Content</em>' reference.
	 * @see #getInstanceOfContent()
	 * @generated
	 */
	void setInstanceOfContent(Content value);

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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_LastModifiedByUserLogin()
	 * @model
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_LocaleString()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getLocaleString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getLocaleString <em>Locale String</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_MimeType()
	 * @model
	 * @generated
	 */
	MimeType getMimeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getMimeType <em>Mime Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' reference.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(MimeType value);

	/**
	 * Returns the value of the '<em><b>Owner Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Content</em>' reference.
	 * @see #setOwnerContent(Content)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_OwnerContent()
	 * @model annotation="mimo-ent-slot help='Used for permissions checking'"
	 * @generated
	 */
	Content getOwnerContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getOwnerContent <em>Owner Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Content</em>' reference.
	 * @see #getOwnerContent()
	 * @generated
	 */
	void setOwnerContent(Content value);

	/**
	 * Returns the value of the '<em><b>Privilege Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege Enum</em>' reference.
	 * @see #setPrivilegeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_PrivilegeEnum()
	 * @model
	 * @generated
	 */
	Enumeration getPrivilegeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getPrivilegeEnum <em>Privilege Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege Enum</em>' reference.
	 * @see #getPrivilegeEnum()
	 * @generated
	 */
	void setPrivilegeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_ServiceName()
	 * @model annotation="mimo-ent-slot help='Deprecated : use customMethod pattern instead. Kept for backward compatibility'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Template Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Data Resource</em>' reference.
	 * @see #setTemplateDataResource(DataResource)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContent_TemplateDataResource()
	 * @model
	 * @generated
	 */
	DataResource getTemplateDataResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.Content#getTemplateDataResource <em>Template Data Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Data Resource</em>' reference.
	 * @see #getTemplateDataResource()
	 * @generated
	 */
	void setTemplateDataResource(DataResource value);

} // Content
