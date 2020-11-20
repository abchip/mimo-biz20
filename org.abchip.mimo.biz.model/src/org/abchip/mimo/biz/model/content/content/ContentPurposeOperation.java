/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.content;

import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Purpose Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getContentPurposeType <em>Content Purpose Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getContentOperation <em>Content Operation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getPrivilegeEnum <em>Privilege Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentPurposeOperation()
 * @model annotation="mimo-ent-frame title='Content Purpose'"
 * @generated
 */
public interface ContentPurposeOperation extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Content Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Purpose Type</em>' reference.
	 * @see #setContentPurposeType(ContentPurposeType)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentPurposeOperation_ContentPurposeType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContentPurposeType getContentPurposeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getContentPurposeType <em>Content Purpose Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Purpose Type</em>' reference.
	 * @see #getContentPurposeType()
	 * @generated
	 */
	void setContentPurposeType(ContentPurposeType value);

	/**
	 * Returns the value of the '<em><b>Content Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Operation</em>' reference.
	 * @see #setContentOperation(ContentOperation)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentPurposeOperation_ContentOperation()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContentOperation getContentOperation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getContentOperation <em>Content Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Operation</em>' reference.
	 * @see #getContentOperation()
	 * @generated
	 */
	void setContentOperation(ContentOperation value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentPurposeOperation_RoleType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentPurposeOperation_Status()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Privilege Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege Enum</em>' reference.
	 * @see #setPrivilegeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentPurposeOperation_PrivilegeEnum()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Enumeration getPrivilegeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentPurposeOperation#getPrivilegeEnum <em>Privilege Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege Enum</em>' reference.
	 * @see #getPrivilegeEnum()
	 * @generated
	 */
	void setPrivilegeEnum(Enumeration value);

} // ContentPurposeOperation
