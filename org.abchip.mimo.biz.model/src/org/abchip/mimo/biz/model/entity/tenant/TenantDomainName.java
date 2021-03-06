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
 * A representation of the model object '<em><b>Tenant Domain Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantDomainName#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantDomainName#getTenant <em>Tenant</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDomainName()
 * @model annotation="mimo-ent-frame title='Tenant and its Domain Name'"
 * @generated
 */
public interface TenantDomainName extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDomainName_DomainName()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantDomainName#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' reference.
	 * @see #setTenant(Tenant)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantDomainName_Tenant()
	 * @model
	 * @generated
	 */
	Tenant getTenant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantDomainName#getTenant <em>Tenant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' reference.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(Tenant value);

} // TenantDomainName
