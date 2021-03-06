/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.tenant;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tenant Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getEntityGroupName <em>Entity Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getJdbcUri <em>Jdbc Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getJdbcUsername <em>Jdbc Username</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDataSource()
 * @model annotation="mimo-ent-frame help='There should be one record for each tenant and each group-map for the active delegator.\n            The jdbc fields will override the datasource -&gt; inline-jdbc values for the per-tenant delegator.'"
 * @generated
 */
public interface TenantDataSource extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' reference.
	 * @see #setTenant(Tenant)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDataSource_Tenant()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Tenant getTenant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getTenant <em>Tenant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' reference.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(Tenant value);

	/**
	 * Returns the value of the '<em><b>Entity Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Group Name</em>' attribute.
	 * @see #setEntityGroupName(String)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDataSource_EntityGroupName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getEntityGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getEntityGroupName <em>Entity Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Group Name</em>' attribute.
	 * @see #getEntityGroupName()
	 * @generated
	 */
	void setEntityGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Password</em>' attribute.
	 * @see #setJdbcPassword(String)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDataSource_JdbcPassword()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getJdbcPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getJdbcPassword <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Password</em>' attribute.
	 * @see #getJdbcPassword()
	 * @generated
	 */
	void setJdbcPassword(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Uri</em>' attribute.
	 * @see #setJdbcUri(String)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDataSource_JdbcUri()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getJdbcUri();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getJdbcUri <em>Jdbc Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Uri</em>' attribute.
	 * @see #getJdbcUri()
	 * @generated
	 */
	void setJdbcUri(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Username</em>' attribute.
	 * @see #setJdbcUsername(String)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDataSource_JdbcUsername()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getJdbcUsername();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantDataSource#getJdbcUsername <em>Jdbc Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Username</em>' attribute.
	 * @see #getJdbcUsername()
	 * @generated
	 */
	void setJdbcUsername(String value);

} // TenantDataSource
