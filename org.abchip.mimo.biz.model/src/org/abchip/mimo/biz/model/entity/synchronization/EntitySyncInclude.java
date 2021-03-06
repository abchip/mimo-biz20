/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.synchronization;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Sync Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncInclude#getEntitySync <em>Entity Sync</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncInclude#getEntityOrPackage <em>Entity Or Package</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncInclude#getApplEnumId <em>Appl Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage#getEntitySyncInclude()
 * @model annotation="mimo-ent-frame title='Entity Synchronization Include'"
 * @generated
 */
public interface EntitySyncInclude extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Entity Sync</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sync</em>' reference.
	 * @see #setEntitySync(EntitySync)
	 * @see org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage#getEntitySyncInclude_EntitySync()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EntitySync getEntitySync();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncInclude#getEntitySync <em>Entity Sync</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Sync</em>' reference.
	 * @see #getEntitySync()
	 * @generated
	 */
	void setEntitySync(EntitySync value);

	/**
	 * Returns the value of the '<em><b>Appl Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appl Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appl Enum Id</em>' attribute.
	 * @see #setApplEnumId(String)
	 * @see org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage#getEntitySyncInclude_ApplEnumId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getApplEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncInclude#getApplEnumId <em>Appl Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appl Enum Id</em>' attribute.
	 * @see #getApplEnumId()
	 * @generated
	 */
	void setApplEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Entity Or Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Or Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Or Package</em>' attribute.
	 * @see #setEntityOrPackage(String)
	 * @see org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage#getEntitySyncInclude_EntityOrPackage()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getEntityOrPackage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncInclude#getEntityOrPackage <em>Entity Or Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Or Package</em>' attribute.
	 * @see #getEntityOrPackage()
	 * @generated
	 */
	void setEntityOrPackage(String value);

} // EntitySyncInclude
