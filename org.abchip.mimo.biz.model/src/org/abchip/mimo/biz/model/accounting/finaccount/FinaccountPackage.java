/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.finaccount;

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
 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountFactory
 * @model kind="package"
 * @generated
 */
public interface FinaccountPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finaccount";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/accounting/finaccount";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-finaccount";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinaccountPackage eINSTANCE = org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountImpl <em>Fin Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccount()
	 * @generated
	 */
	int FIN_ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__ACTUAL_BALANCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Available Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__AVAILABLE_BALANCE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fin Account Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fin Account Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_CODE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fin Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fin Account Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_PIN = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fin Account Statuses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_STATUSES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fin Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Refundable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__IS_REFUNDABLE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__ORGANIZATION_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Owner Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__OWNER_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Post To Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__POST_TO_GL_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Replenish Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__REPLENISH_LEVEL = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Replenish Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__REPLENISH_PAYMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__STATUS_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Fin Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountAttributeImpl <em>Fin Account Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountAttributeImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountAttribute()
	 * @generated
	 */
	int FIN_ACCOUNT_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__FIN_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Fin Account Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountAuthImpl <em>Fin Account Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountAuthImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountAuth()
	 * @generated
	 */
	int FIN_ACCOUNT_AUTH = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Auth Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Authorization Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__FIN_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Fin Account Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountRoleImpl <em>Fin Account Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountRoleImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountRole()
	 * @generated
	 */
	int FIN_ACCOUNT_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__FIN_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Fin Account Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountStatusImpl <em>Fin Account Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountStatusImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountStatus()
	 * @generated
	 */
	int FIN_ACCOUNT_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__FIN_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__STATUS_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__CHANGE_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__STATUS_END_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Fin Account Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl <em>Fin Account Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTrans()
	 * @generated
	 */
	int FIN_ACCOUNT_TRANS = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__COMMENTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__ENTRY_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fin Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__FIN_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Gl Reconciliation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__GL_RECONCILIATION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__ORDER_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__PAYMENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Performed By Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reason Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__REASON_ENUM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__TRANSACTION_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Fin Account Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransAttributeImpl <em>Fin Account Trans Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransAttributeImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransAttribute()
	 * @generated
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__FIN_ACCOUNT_TRANS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Fin Account Trans Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransTypeImpl <em>Fin Account Trans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransTypeImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransType()
	 * @generated
	 */
	int FIN_ACCOUNT_TRANS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Fin Account Trans Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransTypeAttrImpl <em>Fin Account Trans Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransTypeAttr()
	 * @generated
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__FIN_ACCOUNT_TRANS_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fin Account Trans Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeImpl <em>Fin Account Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountType()
	 * @generated
	 */
	int FIN_ACCOUNT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fin Account Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fin Account Type Gl Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Refundable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__IS_REFUNDABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Replenish Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__REPLENISH_ENUM = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Fin Account Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeAttrImpl <em>Fin Account Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTypeAttr()
	 * @generated
	 */
	int FIN_ACCOUNT_TYPE_ATTR = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__FIN_ACCOUNT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Fin Account Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeGlAccountImpl <em>Fin Account Type Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeGlAccountImpl
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTypeGlAccount()
	 * @generated
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__FIN_ACCOUNT_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__GL_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fin Account Type Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount
	 * @generated
	 */
	EClass getFinAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FinAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getActualBalance <em>Actual Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Balance</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getActualBalance()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_ActualBalance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getAvailableBalance <em>Available Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Balance</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getAvailableBalance()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_AvailableBalance();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getCurrencyUom()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_CurrencyUom();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountAttributes <em>Fin Account Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountAttributes()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_FinAccountAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountCode <em>Fin Account Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Code</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountCode()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FinAccountCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountName <em>Fin Account Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountName()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FinAccountName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountPin <em>Fin Account Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Pin</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountPin()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FinAccountPin();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountStatuses <em>Fin Account Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Statuses</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountStatuses()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_FinAccountStatuses();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountType <em>Fin Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFinAccountType()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_FinAccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getFromDate()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#isIsRefundable <em>Is Refundable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Refundable</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#isIsRefundable()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_IsRefundable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getOrganizationParty <em>Organization Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getOrganizationParty()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_OrganizationParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getOwnerParty <em>Owner Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getOwnerParty()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_OwnerParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getPostToGlAccount <em>Post To Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post To Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getPostToGlAccount()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_PostToGlAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getReplenishLevel <em>Replenish Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replenish Level</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getReplenishLevel()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_ReplenishLevel();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getReplenishPayment <em>Replenish Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replenish Payment</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getReplenishPayment()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_ReplenishPayment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getStatusId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccount#getThruDate()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute <em>Fin Account Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute
	 * @generated
	 */
	EClass getFinAccountAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute#getFinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute#getFinAccount()
	 * @see #getFinAccountAttribute()
	 * @generated
	 */
	EReference getFinAccountAttribute_FinAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute#getAttrName()
	 * @see #getFinAccountAttribute()
	 * @generated
	 */
	EAttribute getFinAccountAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute#getAttrDescription()
	 * @see #getFinAccountAttribute()
	 * @generated
	 */
	EAttribute getFinAccountAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAttribute#getAttrValue()
	 * @see #getFinAccountAttribute()
	 * @generated
	 */
	EAttribute getFinAccountAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth <em>Fin Account Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Auth</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth
	 * @generated
	 */
	EClass getFinAccountAuth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getFinAccountAuthId <em>Fin Account Auth Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Auth Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getFinAccountAuthId()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_FinAccountAuthId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getAmount()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getAuthorizationDate <em>Authorization Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getAuthorizationDate()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_AuthorizationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getCurrencyUomId()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_CurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getFinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getFinAccount()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EReference getFinAccountAuth_FinAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getFromDate()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountAuth#getThruDate()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole <em>Fin Account Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Role</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole
	 * @generated
	 */
	EClass getFinAccountRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getFinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getFinAccount()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EReference getFinAccountRole_FinAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getParty()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EReference getFinAccountRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getRoleType()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EReference getFinAccountRole_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getFromDate()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EAttribute getFinAccountRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountRole#getThruDate()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EAttribute getFinAccountRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus <em>Fin Account Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Status</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus
	 * @generated
	 */
	EClass getFinAccountStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getFinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getFinAccount()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EReference getFinAccountStatus_FinAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatus()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EReference getFinAccountStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatusDate()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EAttribute getFinAccountStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getChangeByUserLogin <em>Change By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getChangeByUserLogin()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EReference getFinAccountStatus_ChangeByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatusEndDate <em>Status End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status End Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountStatus#getStatusEndDate()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EAttribute getFinAccountStatus_StatusEndDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans <em>Fin Account Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Trans</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans
	 * @generated
	 */
	EClass getFinAccountTrans();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransId <em>Fin Account Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Trans Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_FinAccountTransId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getAmount()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getComments()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getEntryDate <em>Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getEntryDate()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_EntryDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccount()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_FinAccount();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransAttributes <em>Fin Account Trans Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Trans Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransAttributes()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_FinAccountTransAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransType <em>Fin Account Trans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getFinAccountTransType()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_FinAccountTransType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getGlReconciliation <em>Gl Reconciliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Reconciliation</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getGlReconciliation()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_GlReconciliation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getOrderId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getOrderItemSeqId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getParty()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getPayment()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_Payment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getPerformedByParty <em>Performed By Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Performed By Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getPerformedByParty()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_PerformedByParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getReasonEnum <em>Reason Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason Enum</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getReasonEnum()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_ReasonEnum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getStatus()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTrans#getTransactionDate()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_TransactionDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute <em>Fin Account Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Trans Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute
	 * @generated
	 */
	EClass getFinAccountTransAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute#getFinAccountTrans <em>Fin Account Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute#getFinAccountTrans()
	 * @see #getFinAccountTransAttribute()
	 * @generated
	 */
	EReference getFinAccountTransAttribute_FinAccountTrans();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute#getAttrName()
	 * @see #getFinAccountTransAttribute()
	 * @generated
	 */
	EAttribute getFinAccountTransAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute#getAttrDescription()
	 * @see #getFinAccountTransAttribute()
	 * @generated
	 */
	EAttribute getFinAccountTransAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransAttribute#getAttrValue()
	 * @see #getFinAccountTransAttribute()
	 * @generated
	 */
	EAttribute getFinAccountTransAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType <em>Fin Account Trans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Trans Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType
	 * @generated
	 */
	EClass getFinAccountTransType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Trans Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeId()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EAttribute getFinAccountTransType_FinAccountTransTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getDescription()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EAttribute getFinAccountTransType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeAttrs <em>Fin Account Trans Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Trans Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeAttrs()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EReference getFinAccountTransType_FinAccountTransTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getHasTable()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EAttribute getFinAccountTransType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getParentType()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EReference getFinAccountTransType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr <em>Fin Account Trans Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Trans Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr
	 * @generated
	 */
	EClass getFinAccountTransTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr#getFinAccountTransType <em>Fin Account Trans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr#getFinAccountTransType()
	 * @see #getFinAccountTransTypeAttr()
	 * @generated
	 */
	EReference getFinAccountTransTypeAttr_FinAccountTransType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr#getAttrName()
	 * @see #getFinAccountTransTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTransTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr#getDescription()
	 * @see #getFinAccountTransTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTransTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType <em>Fin Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType
	 * @generated
	 */
	EClass getFinAccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getFinAccountTypeId <em>Fin Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getFinAccountTypeId()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EAttribute getFinAccountType_FinAccountTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getDescription()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EAttribute getFinAccountType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getFinAccountTypeAttrs <em>Fin Account Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getFinAccountTypeAttrs()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EReference getFinAccountType_FinAccountTypeAttrs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getFinAccountTypeGlAccounts <em>Fin Account Type Gl Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Type Gl Accounts</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getFinAccountTypeGlAccounts()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EReference getFinAccountType_FinAccountTypeGlAccounts();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getHasTable()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EAttribute getFinAccountType_HasTable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getIsRefundable <em>Is Refundable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Refundable</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getIsRefundable()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EAttribute getFinAccountType_IsRefundable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getParentType()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EReference getFinAccountType_ParentType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getReplenishEnum <em>Replenish Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replenish Enum</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountType#getReplenishEnum()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EReference getFinAccountType_ReplenishEnum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr <em>Fin Account Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr
	 * @generated
	 */
	EClass getFinAccountTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr#getFinAccountType <em>Fin Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr#getFinAccountType()
	 * @see #getFinAccountTypeAttr()
	 * @generated
	 */
	EReference getFinAccountTypeAttr_FinAccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr#getAttrName()
	 * @see #getFinAccountTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr#getAttrValue()
	 * @see #getFinAccountTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTypeAttr_AttrValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeAttr#getDescription()
	 * @see #getFinAccountTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount <em>Fin Account Type Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Type Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount
	 * @generated
	 */
	EClass getFinAccountTypeGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getFinAccountType <em>Fin Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getFinAccountType()
	 * @see #getFinAccountTypeGlAccount()
	 * @generated
	 */
	EReference getFinAccountTypeGlAccount_FinAccountType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getOrganizationParty <em>Organization Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getOrganizationParty()
	 * @see #getFinAccountTypeGlAccount()
	 * @generated
	 */
	EReference getFinAccountTypeGlAccount_OrganizationParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getGlAccount <em>Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTypeGlAccount#getGlAccount()
	 * @see #getFinAccountTypeGlAccount()
	 * @generated
	 */
	EReference getFinAccountTypeGlAccount_GlAccount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FinaccountFactory getFinaccountFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountImpl <em>Fin Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccount()
		 * @generated
		 */
		EClass FIN_ACCOUNT = eINSTANCE.getFinAccount();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FIN_ACCOUNT_ID = eINSTANCE.getFinAccount_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>Actual Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__ACTUAL_BALANCE = eINSTANCE.getFinAccount_ActualBalance();

		/**
		 * The meta object literal for the '<em><b>Available Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__AVAILABLE_BALANCE = eINSTANCE.getFinAccount_AvailableBalance();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__CURRENCY_UOM = eINSTANCE.getFinAccount_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Fin Account Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES = eINSTANCE.getFinAccount_FinAccountAttributes();

		/**
		 * The meta object literal for the '<em><b>Fin Account Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FIN_ACCOUNT_CODE = eINSTANCE.getFinAccount_FinAccountCode();

		/**
		 * The meta object literal for the '<em><b>Fin Account Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FIN_ACCOUNT_NAME = eINSTANCE.getFinAccount_FinAccountName();

		/**
		 * The meta object literal for the '<em><b>Fin Account Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FIN_ACCOUNT_PIN = eINSTANCE.getFinAccount_FinAccountPin();

		/**
		 * The meta object literal for the '<em><b>Fin Account Statuses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__FIN_ACCOUNT_STATUSES = eINSTANCE.getFinAccount_FinAccountStatuses();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__FIN_ACCOUNT_TYPE = eINSTANCE.getFinAccount_FinAccountType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FROM_DATE = eINSTANCE.getFinAccount_FromDate();

		/**
		 * The meta object literal for the '<em><b>Is Refundable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__IS_REFUNDABLE = eINSTANCE.getFinAccount_IsRefundable();

		/**
		 * The meta object literal for the '<em><b>Organization Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__ORGANIZATION_PARTY = eINSTANCE.getFinAccount_OrganizationParty();

		/**
		 * The meta object literal for the '<em><b>Owner Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__OWNER_PARTY = eINSTANCE.getFinAccount_OwnerParty();

		/**
		 * The meta object literal for the '<em><b>Post To Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__POST_TO_GL_ACCOUNT = eINSTANCE.getFinAccount_PostToGlAccount();

		/**
		 * The meta object literal for the '<em><b>Replenish Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__REPLENISH_LEVEL = eINSTANCE.getFinAccount_ReplenishLevel();

		/**
		 * The meta object literal for the '<em><b>Replenish Payment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__REPLENISH_PAYMENT = eINSTANCE.getFinAccount_ReplenishPayment();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__STATUS_ID = eINSTANCE.getFinAccount_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__THRU_DATE = eINSTANCE.getFinAccount_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountAttributeImpl <em>Fin Account Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountAttributeImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountAttribute()
		 * @generated
		 */
		EClass FIN_ACCOUNT_ATTRIBUTE = eINSTANCE.getFinAccountAttribute();

		/**
		 * The meta object literal for the '<em><b>Fin Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_ATTRIBUTE__FIN_ACCOUNT = eINSTANCE.getFinAccountAttribute_FinAccount();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getFinAccountAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getFinAccountAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getFinAccountAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountAuthImpl <em>Fin Account Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountAuthImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountAuth()
		 * @generated
		 */
		EClass FIN_ACCOUNT_AUTH = eINSTANCE.getFinAccountAuth();

		/**
		 * The meta object literal for the '<em><b>Fin Account Auth Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID = eINSTANCE.getFinAccountAuth_FinAccountAuthId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__AMOUNT = eINSTANCE.getFinAccountAuth_Amount();

		/**
		 * The meta object literal for the '<em><b>Authorization Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE = eINSTANCE.getFinAccountAuth_AuthorizationDate();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID = eINSTANCE.getFinAccountAuth_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Fin Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_AUTH__FIN_ACCOUNT = eINSTANCE.getFinAccountAuth_FinAccount();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__FROM_DATE = eINSTANCE.getFinAccountAuth_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__THRU_DATE = eINSTANCE.getFinAccountAuth_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountRoleImpl <em>Fin Account Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountRoleImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountRole()
		 * @generated
		 */
		EClass FIN_ACCOUNT_ROLE = eINSTANCE.getFinAccountRole();

		/**
		 * The meta object literal for the '<em><b>Fin Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_ROLE__FIN_ACCOUNT = eINSTANCE.getFinAccountRole_FinAccount();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_ROLE__PARTY = eINSTANCE.getFinAccountRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_ROLE__ROLE_TYPE = eINSTANCE.getFinAccountRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ROLE__FROM_DATE = eINSTANCE.getFinAccountRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ROLE__THRU_DATE = eINSTANCE.getFinAccountRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountStatusImpl <em>Fin Account Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountStatusImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountStatus()
		 * @generated
		 */
		EClass FIN_ACCOUNT_STATUS = eINSTANCE.getFinAccountStatus();

		/**
		 * The meta object literal for the '<em><b>Fin Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_STATUS__FIN_ACCOUNT = eINSTANCE.getFinAccountStatus_FinAccount();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_STATUS__STATUS = eINSTANCE.getFinAccountStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_STATUS__STATUS_DATE = eINSTANCE.getFinAccountStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Change By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_STATUS__CHANGE_BY_USER_LOGIN = eINSTANCE.getFinAccountStatus_ChangeByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Status End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_STATUS__STATUS_END_DATE = eINSTANCE.getFinAccountStatus_StatusEndDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl <em>Fin Account Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTrans()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TRANS = eINSTANCE.getFinAccountTrans();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID = eINSTANCE.getFinAccountTrans_FinAccountTransId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__AMOUNT = eINSTANCE.getFinAccountTrans_Amount();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__COMMENTS = eINSTANCE.getFinAccountTrans_Comments();

		/**
		 * The meta object literal for the '<em><b>Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__ENTRY_DATE = eINSTANCE.getFinAccountTrans_EntryDate();

		/**
		 * The meta object literal for the '<em><b>Fin Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__FIN_ACCOUNT = eINSTANCE.getFinAccountTrans_FinAccount();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES = eINSTANCE.getFinAccountTrans_FinAccountTransAttributes();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE = eINSTANCE.getFinAccountTrans_FinAccountTransType();

		/**
		 * The meta object literal for the '<em><b>Gl Reconciliation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__GL_RECONCILIATION = eINSTANCE.getFinAccountTrans_GlReconciliation();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__ORDER_ID = eINSTANCE.getFinAccountTrans_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID = eINSTANCE.getFinAccountTrans_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__PARTY = eINSTANCE.getFinAccountTrans_Party();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__PAYMENT = eINSTANCE.getFinAccountTrans_Payment();

		/**
		 * The meta object literal for the '<em><b>Performed By Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY = eINSTANCE.getFinAccountTrans_PerformedByParty();

		/**
		 * The meta object literal for the '<em><b>Reason Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__REASON_ENUM = eINSTANCE.getFinAccountTrans_ReasonEnum();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__STATUS = eINSTANCE.getFinAccountTrans_Status();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__TRANSACTION_DATE = eINSTANCE.getFinAccountTrans_TransactionDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransAttributeImpl <em>Fin Account Trans Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransAttributeImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransAttribute()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TRANS_ATTRIBUTE = eINSTANCE.getFinAccountTransAttribute();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS_ATTRIBUTE__FIN_ACCOUNT_TRANS = eINSTANCE.getFinAccountTransAttribute_FinAccountTrans();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_NAME = eINSTANCE.getFinAccountTransAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getFinAccountTransAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getFinAccountTransAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransTypeImpl <em>Fin Account Trans Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransTypeImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransType()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TRANS_TYPE = eINSTANCE.getFinAccountTransType();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID = eINSTANCE.getFinAccountTransType_FinAccountTransTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION = eINSTANCE.getFinAccountTransType_Description();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS = eINSTANCE.getFinAccountTransType_FinAccountTransTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE = eINSTANCE.getFinAccountTransType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE = eINSTANCE.getFinAccountTransType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransTypeAttrImpl <em>Fin Account Trans Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTransTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransTypeAttr()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TRANS_TYPE_ATTR = eINSTANCE.getFinAccountTransTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS_TYPE_ATTR__FIN_ACCOUNT_TRANS_TYPE = eINSTANCE.getFinAccountTransTypeAttr_FinAccountTransType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE_ATTR__ATTR_NAME = eINSTANCE.getFinAccountTransTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE_ATTR__DESCRIPTION = eINSTANCE.getFinAccountTransTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeImpl <em>Fin Account Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountType()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TYPE = eINSTANCE.getFinAccountType();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID = eINSTANCE.getFinAccountType_FinAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE__DESCRIPTION = eINSTANCE.getFinAccountType_Description();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS = eINSTANCE.getFinAccountType_FinAccountTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Gl Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS = eINSTANCE.getFinAccountType_FinAccountTypeGlAccounts();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE__HAS_TABLE = eINSTANCE.getFinAccountType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Is Refundable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE__IS_REFUNDABLE = eINSTANCE.getFinAccountType_IsRefundable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE__PARENT_TYPE = eINSTANCE.getFinAccountType_ParentType();

		/**
		 * The meta object literal for the '<em><b>Replenish Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE__REPLENISH_ENUM = eINSTANCE.getFinAccountType_ReplenishEnum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeAttrImpl <em>Fin Account Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTypeAttr()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TYPE_ATTR = eINSTANCE.getFinAccountTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE_ATTR__FIN_ACCOUNT_TYPE = eINSTANCE.getFinAccountTypeAttr_FinAccountType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getFinAccountTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE_ATTR__ATTR_VALUE = eINSTANCE.getFinAccountTypeAttr_AttrValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getFinAccountTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeGlAccountImpl <em>Fin Account Type Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinAccountTypeGlAccountImpl
		 * @see org.abchip.mimo.biz.model.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTypeGlAccount()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TYPE_GL_ACCOUNT = eINSTANCE.getFinAccountTypeGlAccount();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE_GL_ACCOUNT__FIN_ACCOUNT_TYPE = eINSTANCE.getFinAccountTypeGlAccount_FinAccountType();

		/**
		 * The meta object literal for the '<em><b>Organization Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY = eINSTANCE.getFinAccountTypeGlAccount_OrganizationParty();

		/**
		 * The meta object literal for the '<em><b>Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE_GL_ACCOUNT__GL_ACCOUNT = eINSTANCE.getFinAccountTypeGlAccount_GlAccount();

	}

} //FinaccountPackage
