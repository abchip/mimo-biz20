/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.synchronization;

import org.abchip.mimo.biz.model.entity.group.EntityGroup;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Sync Include Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncIncludeGroup#getEntityGroup <em>Entity Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncIncludeGroup#getEntitySync <em>Entity Sync</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup()
 * @model annotation="mimo-ent-frame title='Entity Synchronization Include Entity Group'"
 * @generated
 */
public interface EntitySyncIncludeGroup extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Entity Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Group</em>' reference.
	 * @see #setEntityGroup(EntityGroup)
	 * @see org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup_EntityGroup()
	 * @model keys="entityGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EntityGroup getEntityGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncIncludeGroup#getEntityGroup <em>Entity Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Group</em>' reference.
	 * @see #getEntityGroup()
	 * @generated
	 */
	void setEntityGroup(EntityGroup value);

	/**
	 * Returns the value of the '<em><b>Entity Sync</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sync</em>' reference.
	 * @see #setEntitySync(EntitySync)
	 * @see org.abchip.mimo.biz.model.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup_EntitySync()
	 * @model keys="entitySyncId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EntitySync getEntitySync();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.synchronization.EntitySyncIncludeGroup#getEntitySync <em>Entity Sync</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Sync</em>' reference.
	 * @see #getEntitySync()
	 * @generated
	 */
	void setEntitySync(EntitySync value);

} // EntitySyncIncludeGroup
