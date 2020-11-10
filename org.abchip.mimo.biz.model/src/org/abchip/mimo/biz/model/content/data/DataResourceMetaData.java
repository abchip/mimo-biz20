/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.data;

import org.abchip.mimo.biz.model.common.datasource.DataSource;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getDataResource <em>Data Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getMetaDataPredicate <em>Meta Data Predicate</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getMetaDataValue <em>Meta Data Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResourceMetaData()
 * @model annotation="mimo-ent-frame title='Data Resource Meta-Data Predicate'"
 * @generated
 */
public interface DataResourceMetaData extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Data Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource</em>' reference.
	 * @see #setDataResource(DataResource)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResourceMetaData_DataResource()
	 * @model keys="dataResourceId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	DataResource getDataResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getDataResource <em>Data Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource</em>' reference.
	 * @see #getDataResource()
	 * @generated
	 */
	void setDataResource(DataResource value);

	/**
	 * Returns the value of the '<em><b>Meta Data Predicate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data Predicate</em>' reference.
	 * @see #setMetaDataPredicate(MetaDataPredicate)
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResourceMetaData_MetaDataPredicate()
	 * @model keys="metaDataPredicateId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	MetaDataPredicate getMetaDataPredicate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getMetaDataPredicate <em>Meta Data Predicate</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResourceMetaData_DataSource()
	 * @model keys="dataSourceId"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getDataSource <em>Data Source</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.content.data.DataPackage#getDataResourceMetaData_MetaDataValue()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMetaDataValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.data.DataResourceMetaData#getMetaDataValue <em>Meta Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data Value</em>' attribute.
	 * @see #getMetaDataValue()
	 * @generated
	 */
	void setMetaDataValue(String value);

} // DataResourceMetaData
