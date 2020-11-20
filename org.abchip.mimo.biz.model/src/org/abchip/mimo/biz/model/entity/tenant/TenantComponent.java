/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 * A representation of the model object '<em><b>Tenant Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantComponent#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantComponent#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.tenant.TenantComponent#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantComponent()
 * @model
 * @generated
 */
public interface TenantComponent extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' reference.
	 * @see #setTenant(Tenant)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantComponent_Tenant()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Tenant getTenant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantComponent#getTenant <em>Tenant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' reference.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(Tenant value);

	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' reference.
	 * @see #setComponentName(Component)
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantComponent_ComponentName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Component getComponentName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantComponent#getComponentName <em>Component Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' reference.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(Component value);

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
	 * @see org.abchip.mimo.biz.model.entity.tenant.TenantPackage#getTenantComponent_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.tenant.TenantComponent#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

} // TenantComponent
