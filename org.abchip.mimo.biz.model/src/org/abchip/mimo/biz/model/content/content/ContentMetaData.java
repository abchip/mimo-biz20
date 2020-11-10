/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.content;

import org.abchip.mimo.biz.model.common.datasource.DataSource;
import org.abchip.mimo.biz.model.content.data.MetaDataPredicate;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getMetaDataPredicate <em>Meta Data Predicate</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getMetaDataValue <em>Meta Data Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentMetaData()
 * @model annotation="mimo-ent-frame title='Content Meta-Data Predicate'"
 * @generated
 */
public interface ContentMetaData extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentMetaData_Content()
	 * @model keys="contentId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Meta Data Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Predicate</em>' reference.
	 * @see #setMetaDataPredicate(MetaDataPredicate)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentMetaData_MetaDataPredicate()
	 * @model keys="metaDataPredicateId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	MetaDataPredicate getMetaDataPredicate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getMetaDataPredicate <em>Meta Data Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Predicate</em>' reference.
	 * @see #getMetaDataPredicate()
	 * @generated
	 */
	void setMetaDataPredicate(MetaDataPredicate value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' reference.
	 * @see #setDataSource(DataSource)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentMetaData_DataSource()
	 * @model keys="dataSourceId"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getDataSource <em>Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Meta Data Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Value</em>' attribute.
	 * @see #setMetaDataValue(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentMetaData_MetaDataValue()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMetaDataValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentMetaData#getMetaDataValue <em>Meta Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Value</em>' attribute.
	 * @see #getMetaDataValue()
	 * @generated
	 */
	void setMetaDataValue(String value);

} // ContentMetaData
