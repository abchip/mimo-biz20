/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity;

import java.util.concurrent.Callable;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceRequest;
import org.abchip.mimo.service.ServiceResponse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Tenant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.CreateTenant#getDbType <em>Db Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.entity.CreateTenant#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getCreateTenant()
 * @model abstract="true" superTypes="org.abchip.mimo.service.ServiceRequest&lt;org.abchip.mimo.service.ServiceResponse&gt; org.abchip.mimo.java.JavaCallable&lt;org.abchip.mimo.service.ServiceResponse&gt;"
 * @generated
 */
public interface CreateTenant extends ServiceRequest<ServiceResponse>, Callable<ServiceResponse> {
	/**
	 * Returns the value of the '<em><b>Db Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.biz.service.entity.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Type</em>' attribute.
	 * @see org.abchip.mimo.biz.service.entity.DatabaseType
	 * @see #setDbType(DatabaseType)
	 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getCreateTenant_DbType()
	 * @model required="true"
	 * @generated
	 */
	DatabaseType getDbType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.entity.CreateTenant#getDbType <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Type</em>' attribute.
	 * @see org.abchip.mimo.biz.service.entity.DatabaseType
	 * @see #getDbType()
	 * @generated
	 */
	void setDbType(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see #setUpdate(boolean)
	 * @see org.abchip.mimo.biz.service.entity.EntityPackage#getCreateTenant_Update()
	 * @model
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.service.entity.CreateTenant#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getTenantId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getTenantName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.service.ServiceException" childContextRequired="true"
	 * @generated
	 */
	void loadSeeds(Context childContext) throws ServiceException;

} // CreateTenant
