/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.security.securitygroup;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.security.securitygroup.SecuritygroupFactory
 * @model kind="package"
 * @generated
 */
public interface SecuritygroupPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "securitygroup";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/security/securitygroup";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-securitygroup";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecuritygroupPackage eINSTANCE = org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.ProtectedViewImpl <em>Protected View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.ProtectedViewImpl
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getProtectedView()
	 * @generated
	 */
	int PROTECTED_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__GROUP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Name Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__VIEW_NAME_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Hits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__MAX_HITS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Hits Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__MAX_HITS_DURATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tarpit Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW__TARPIT_DURATION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Protected View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTED_VIEW_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityGroupImpl
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getSecurityGroup()
	 * @generated
	 */
	int SECURITY_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__GROUP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__GROUP_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Protected Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__PROTECTED_VIEWS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security Group Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__SECURITY_GROUP_PERMISSIONS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityGroupPermissionImpl <em>Security Group Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityGroupPermissionImpl
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getSecurityGroupPermission()
	 * @generated
	 */
	int SECURITY_GROUP_PERMISSION = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION__GROUP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Permission Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION__PERMISSION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Security Group Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_PERMISSION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityPermissionImpl <em>Security Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityPermissionImpl
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getSecurityPermission()
	 * @generated
	 */
	int SECURITY_PERMISSION = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PERMISSION__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PERMISSION__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PERMISSION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PERMISSION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Permission Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PERMISSION__PERMISSION_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PERMISSION__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Security Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PERMISSION_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl <em>Tarpitted Login View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getTarpittedLoginView()
	 * @generated
	 */
	int TARPITTED_LOGIN_VIEW = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARPITTED_LOGIN_VIEW__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARPITTED_LOGIN_VIEW__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARPITTED_LOGIN_VIEW__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARPITTED_LOGIN_VIEW__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARPITTED_LOGIN_VIEW__USER_LOGIN_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Name Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARPITTED_LOGIN_VIEW__VIEW_NAME_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tarpit Release Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tarpitted Login View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARPITTED_LOGIN_VIEW_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.UserLoginSecurityGroupImpl <em>User Login Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.UserLoginSecurityGroupImpl
	 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getUserLoginSecurityGroup()
	 * @generated
	 */
	int USER_LOGIN_SECURITY_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP__USER_LOGIN_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP__GROUP_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>User Login Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_LOGIN_SECURITY_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.security.securitygroup.ProtectedView <em>Protected View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protected View</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.ProtectedView
	 * @generated
	 */
	EClass getProtectedView();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getGroupId()
	 * @see #getProtectedView()
	 * @generated
	 */
	EReference getProtectedView_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getViewNameId <em>View Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getViewNameId()
	 * @see #getProtectedView()
	 * @generated
	 */
	EAttribute getProtectedView_ViewNameId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getMaxHits <em>Max Hits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Hits</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getMaxHits()
	 * @see #getProtectedView()
	 * @generated
	 */
	EAttribute getProtectedView_MaxHits();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getMaxHitsDuration <em>Max Hits Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Hits Duration</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getMaxHitsDuration()
	 * @see #getProtectedView()
	 * @generated
	 */
	EAttribute getProtectedView_MaxHitsDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getTarpitDuration <em>Tarpit Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tarpit Duration</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.ProtectedView#getTarpitDuration()
	 * @see #getProtectedView()
	 * @generated
	 */
	EAttribute getProtectedView_TarpitDuration();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup
	 * @generated
	 */
	EClass getSecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getGroupId()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getDescription()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getGroupName()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_GroupName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getProtectedViews <em>Protected Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protected Views</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getProtectedViews()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_ProtectedViews();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getSecurityGroupPermissions <em>Security Group Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Group Permissions</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroup#getSecurityGroupPermissions()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_SecurityGroupPermissions();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission <em>Security Group Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group Permission</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission
	 * @generated
	 */
	EClass getSecurityGroupPermission();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getGroupId()
	 * @see #getSecurityGroupPermission()
	 * @generated
	 */
	EReference getSecurityGroupPermission_GroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getPermissionId <em>Permission Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Permission Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getPermissionId()
	 * @see #getSecurityGroupPermission()
	 * @generated
	 */
	EReference getSecurityGroupPermission_PermissionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getFromDate()
	 * @see #getSecurityGroupPermission()
	 * @generated
	 */
	EAttribute getSecurityGroupPermission_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityGroupPermission#getThruDate()
	 * @see #getSecurityGroupPermission()
	 * @generated
	 */
	EAttribute getSecurityGroupPermission_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityPermission <em>Security Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Permission</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityPermission
	 * @generated
	 */
	EClass getSecurityPermission();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityPermission#getPermissionId <em>Permission Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityPermission#getPermissionId()
	 * @see #getSecurityPermission()
	 * @generated
	 */
	EAttribute getSecurityPermission_PermissionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.SecurityPermission#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.SecurityPermission#getDescription()
	 * @see #getSecurityPermission()
	 * @generated
	 */
	EAttribute getSecurityPermission_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView <em>Tarpitted Login View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarpitted Login View</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView
	 * @generated
	 */
	EClass getTarpittedLoginView();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView#getViewNameId <em>View Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView#getViewNameId()
	 * @see #getTarpittedLoginView()
	 * @generated
	 */
	EAttribute getTarpittedLoginView_ViewNameId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView#getUserLoginId()
	 * @see #getTarpittedLoginView()
	 * @generated
	 */
	EAttribute getTarpittedLoginView_UserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView#getTarpitReleaseDateTime <em>Tarpit Release Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tarpit Release Date Time</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.TarpittedLoginView#getTarpitReleaseDateTime()
	 * @see #getTarpittedLoginView()
	 * @generated
	 */
	EAttribute getTarpittedLoginView_TarpitReleaseDateTime();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup <em>User Login Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Login Security Group</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup
	 * @generated
	 */
	EClass getUserLoginSecurityGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup#getUserLoginId()
	 * @see #getUserLoginSecurityGroup()
	 * @generated
	 */
	EReference getUserLoginSecurityGroup_UserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Id</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup#getGroupId()
	 * @see #getUserLoginSecurityGroup()
	 * @generated
	 */
	EReference getUserLoginSecurityGroup_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup#getFromDate()
	 * @see #getUserLoginSecurityGroup()
	 * @generated
	 */
	EAttribute getUserLoginSecurityGroup_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.security.securitygroup.UserLoginSecurityGroup#getThruDate()
	 * @see #getUserLoginSecurityGroup()
	 * @generated
	 */
	EAttribute getUserLoginSecurityGroup_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecuritygroupFactory getSecuritygroupFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.ProtectedViewImpl <em>Protected View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.ProtectedViewImpl
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getProtectedView()
		 * @generated
		 */
		EClass PROTECTED_VIEW = eINSTANCE.getProtectedView();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTED_VIEW__GROUP_ID = eINSTANCE.getProtectedView_GroupId();

		/**
		 * The meta object literal for the '<em><b>View Name Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTED_VIEW__VIEW_NAME_ID = eINSTANCE.getProtectedView_ViewNameId();

		/**
		 * The meta object literal for the '<em><b>Max Hits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTED_VIEW__MAX_HITS = eINSTANCE.getProtectedView_MaxHits();

		/**
		 * The meta object literal for the '<em><b>Max Hits Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTED_VIEW__MAX_HITS_DURATION = eINSTANCE.getProtectedView_MaxHitsDuration();

		/**
		 * The meta object literal for the '<em><b>Tarpit Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTED_VIEW__TARPIT_DURATION = eINSTANCE.getProtectedView_TarpitDuration();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityGroupImpl
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getSecurityGroup()
		 * @generated
		 */
		EClass SECURITY_GROUP = eINSTANCE.getSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__GROUP_ID = eINSTANCE.getSecurityGroup_GroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__DESCRIPTION = eINSTANCE.getSecurityGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__GROUP_NAME = eINSTANCE.getSecurityGroup_GroupName();

		/**
		 * The meta object literal for the '<em><b>Protected Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__PROTECTED_VIEWS = eINSTANCE.getSecurityGroup_ProtectedViews();

		/**
		 * The meta object literal for the '<em><b>Security Group Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__SECURITY_GROUP_PERMISSIONS = eINSTANCE.getSecurityGroup_SecurityGroupPermissions();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityGroupPermissionImpl <em>Security Group Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityGroupPermissionImpl
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getSecurityGroupPermission()
		 * @generated
		 */
		EClass SECURITY_GROUP_PERMISSION = eINSTANCE.getSecurityGroupPermission();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP_PERMISSION__GROUP_ID = eINSTANCE.getSecurityGroupPermission_GroupId();

		/**
		 * The meta object literal for the '<em><b>Permission Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP_PERMISSION__PERMISSION_ID = eINSTANCE.getSecurityGroupPermission_PermissionId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PERMISSION__FROM_DATE = eINSTANCE.getSecurityGroupPermission_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP_PERMISSION__THRU_DATE = eINSTANCE.getSecurityGroupPermission_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityPermissionImpl <em>Security Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecurityPermissionImpl
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getSecurityPermission()
		 * @generated
		 */
		EClass SECURITY_PERMISSION = eINSTANCE.getSecurityPermission();

		/**
		 * The meta object literal for the '<em><b>Permission Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_PERMISSION__PERMISSION_ID = eINSTANCE.getSecurityPermission_PermissionId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_PERMISSION__DESCRIPTION = eINSTANCE.getSecurityPermission_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl <em>Tarpitted Login View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.TarpittedLoginViewImpl
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getTarpittedLoginView()
		 * @generated
		 */
		EClass TARPITTED_LOGIN_VIEW = eINSTANCE.getTarpittedLoginView();

		/**
		 * The meta object literal for the '<em><b>View Name Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARPITTED_LOGIN_VIEW__VIEW_NAME_ID = eINSTANCE.getTarpittedLoginView_ViewNameId();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARPITTED_LOGIN_VIEW__USER_LOGIN_ID = eINSTANCE.getTarpittedLoginView_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>Tarpit Release Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARPITTED_LOGIN_VIEW__TARPIT_RELEASE_DATE_TIME = eINSTANCE.getTarpittedLoginView_TarpitReleaseDateTime();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.security.securitygroup.impl.UserLoginSecurityGroupImpl <em>User Login Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.UserLoginSecurityGroupImpl
		 * @see org.abchip.mimo.biz.model.security.securitygroup.impl.SecuritygroupPackageImpl#getUserLoginSecurityGroup()
		 * @generated
		 */
		EClass USER_LOGIN_SECURITY_GROUP = eINSTANCE.getUserLoginSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN_SECURITY_GROUP__USER_LOGIN_ID = eINSTANCE.getUserLoginSecurityGroup_UserLoginId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_LOGIN_SECURITY_GROUP__GROUP_ID = eINSTANCE.getUserLoginSecurityGroup_GroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_SECURITY_GROUP__FROM_DATE = eINSTANCE.getUserLoginSecurityGroup_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_LOGIN_SECURITY_GROUP__THRU_DATE = eINSTANCE.getUserLoginSecurityGroup_ThruDate();

	}

} //SecuritygroupPackage
