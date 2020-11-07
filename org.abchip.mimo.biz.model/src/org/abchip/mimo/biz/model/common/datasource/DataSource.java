/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.common.datasource;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.common.datasource.DataSource#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.datasource.DataSource#getDataSourceTypeId <em>Data Source Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.common.datasource.DataSource#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.common.datasource.DatasourcePackage#getDataSource()
 * @model annotation="mimo-ent-frame dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface DataSource extends EntityTyped<DataSourceType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' attribute.
	 * @see #setDataSourceId(String)
	 * @see org.abchip.mimo.biz.model.common.datasource.DatasourcePackage#getDataSource_DataSourceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.datasource.DataSource#getDataSourceId <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' attribute.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(String value);

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
	 * @see org.abchip.mimo.biz.model.common.datasource.DatasourcePackage#getDataSource_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.datasource.DataSource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Type Id</em>' reference.
	 * @see #setDataSourceTypeId(DataSourceType)
	 * @see org.abchip.mimo.biz.model.common.datasource.DatasourcePackage#getDataSource_DataSourceTypeId()
	 * @model keys="dataSourceTypeId"
	 * @generated
	 */
	DataSourceType getDataSourceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.common.datasource.DataSource#getDataSourceTypeId <em>Data Source Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Type Id</em>' reference.
	 * @see #getDataSourceTypeId()
	 * @generated
	 */
	void setDataSourceTypeId(DataSourceType value);

} // DataSource
