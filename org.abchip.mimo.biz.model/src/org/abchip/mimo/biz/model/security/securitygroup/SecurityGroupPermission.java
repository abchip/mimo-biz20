/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.security.securitygroup;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getGroup <em>Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getPermission <em>Permission</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission()
 * @model annotation="mimo-ent-frame help='Defines a permission available to a security group; there is no FK to SecurityPermission because we want to leave open the possibility of ad-hoc permissions, especially for the Entity Data Maintenance pages which have TONS of permissions' title='Security Component - Security Group Permission'"
 * @generated
 */
public interface SecurityGroupPermission extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(SecurityGroup)
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission_Group()
	 * @model keys="groupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SecurityGroup getGroup();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(SecurityGroup value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' reference.
	 * @see #setPermission(SecurityPermission)
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission_Permission()
	 * @model keys="permissionId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SecurityPermission getPermission();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getPermission <em>Permission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' reference.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(SecurityPermission value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupPackage#getSecurityGroupPermission_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // SecurityGroupPermission
