/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.passport;

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
 * @see org.abchip.mimo.biz.model.passport.PassportFactory
 * @model kind="package"
 * @generated
 */
public interface PassportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "passport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/passport";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-passport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PassportPackage eINSTANCE = org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.passport.impl.GitHubUserImpl <em>Git Hub User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.passport.impl.GitHubUserImpl
	 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getGitHubUser()
	 * @generated
	 */
	int GIT_HUB_USER = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Git Hub User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__GIT_HUB_USER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__ACCESS_TOKEN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Env Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__ENV_PREFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__PRODUCT_STORE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER__TOKEN_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Git Hub User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_USER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.passport.impl.GoogleUserImpl <em>Google User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.passport.impl.GoogleUserImpl
	 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getGoogleUser()
	 * @generated
	 */
	int GOOGLE_USER = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Google User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__GOOGLE_USER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__ACCESS_TOKEN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Env Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__ENV_PREFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__PRODUCT_STORE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Token Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER__TOKEN_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Google User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOGLE_USER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.passport.impl.LinkedInUserImpl <em>Linked In User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.passport.impl.LinkedInUserImpl
	 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getLinkedInUser()
	 * @generated
	 */
	int LINKED_IN_USER = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Linked In User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__LINKED_IN_USER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__ACCESS_TOKEN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Env Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__ENV_PREFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER__PRODUCT_STORE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Linked In User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKED_IN_USER_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.passport.impl.OAuth2Impl <em>OAuth2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.passport.impl.OAuth2Impl
	 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getOAuth2()
	 * @generated
	 */
	int OAUTH2 = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__PRODUCT_STORE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__ICON_URL = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__LOCAL_REDIRECT_URI = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.passport.impl.OAuth2GitHubImpl <em>OAuth2 Git Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.passport.impl.OAuth2GitHubImpl
	 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getOAuth2GitHub()
	 * @generated
	 */
	int OAUTH2_GIT_HUB = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__CREATED_STAMP = OAUTH2__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__CREATED_TX_STAMP = OAUTH2__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__LAST_UPDATED_STAMP = OAUTH2__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__LAST_UPDATED_TX_STAMP = OAUTH2__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__PRODUCT_STORE = OAUTH2__PRODUCT_STORE;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__FROM_DATE = OAUTH2__FROM_DATE;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__ICON_URL = OAUTH2__ICON_URL;

	/**
	 * The feature id for the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__LOCAL_REDIRECT_URI = OAUTH2__LOCAL_REDIRECT_URI;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__THRU_DATE = OAUTH2__THRU_DATE;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__CLIENT_ID = OAUTH2_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__CLIENT_SECRET = OAUTH2_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB__RETURN_URL = OAUTH2_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OAuth2 Git Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GIT_HUB_FEATURE_COUNT = OAUTH2_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.passport.impl.OAuth2GoogleImpl <em>OAuth2 Google</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.passport.impl.OAuth2GoogleImpl
	 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getOAuth2Google()
	 * @generated
	 */
	int OAUTH2_GOOGLE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__CREATED_STAMP = OAUTH2__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__CREATED_TX_STAMP = OAUTH2__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__LAST_UPDATED_STAMP = OAUTH2__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__LAST_UPDATED_TX_STAMP = OAUTH2__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__PRODUCT_STORE = OAUTH2__PRODUCT_STORE;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__FROM_DATE = OAUTH2__FROM_DATE;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__ICON_URL = OAUTH2__ICON_URL;

	/**
	 * The feature id for the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__LOCAL_REDIRECT_URI = OAUTH2__LOCAL_REDIRECT_URI;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__THRU_DATE = OAUTH2__THRU_DATE;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__CLIENT_ID = OAUTH2_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__CLIENT_SECRET = OAUTH2_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE__RETURN_URL = OAUTH2_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OAuth2 Google</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_GOOGLE_FEATURE_COUNT = OAUTH2_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.passport.impl.OAuth2LinkedInImpl <em>OAuth2 Linked In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.passport.impl.OAuth2LinkedInImpl
	 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getOAuth2LinkedIn()
	 * @generated
	 */
	int OAUTH2_LINKED_IN = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__CREATED_STAMP = OAUTH2__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__CREATED_TX_STAMP = OAUTH2__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__LAST_UPDATED_STAMP = OAUTH2__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__LAST_UPDATED_TX_STAMP = OAUTH2__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__PRODUCT_STORE = OAUTH2__PRODUCT_STORE;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__FROM_DATE = OAUTH2__FROM_DATE;

	/**
	 * The feature id for the '<em><b>Icon Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__ICON_URL = OAUTH2__ICON_URL;

	/**
	 * The feature id for the '<em><b>Local Redirect Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__LOCAL_REDIRECT_URI = OAUTH2__LOCAL_REDIRECT_URI;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__THRU_DATE = OAUTH2__THRU_DATE;

	/**
	 * The feature id for the '<em><b>Api Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__API_KEY = OAUTH2_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Live Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__LIVE_RETURN_URL = OAUTH2_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__SECRET_KEY = OAUTH2_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN__TEST_RETURN_URL = OAUTH2_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OAuth2 Linked In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_LINKED_IN_FEATURE_COUNT = OAUTH2_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.passport.impl.ThirdPartyLoginImpl <em>Third Party Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.passport.impl.ThirdPartyLoginImpl
	 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getThirdPartyLogin()
	 * @generated
	 */
	int THIRD_PARTY_LOGIN = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__PRODUCT_STORE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Login Meth Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__LOGIN_METH_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Login Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__LOGIN_PROVIDER_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Third Party Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_PARTY_LOGIN_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.passport.GitHubUser <em>Git Hub User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Hub User</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GitHubUser
	 * @generated
	 */
	EClass getGitHubUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.GitHubUser#getGitHubUserId <em>Git Hub User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Git Hub User Id</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GitHubUser#getGitHubUserId()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EAttribute getGitHubUser_GitHubUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.GitHubUser#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GitHubUser#getAccessToken()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EAttribute getGitHubUser_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.GitHubUser#getEnvPrefix <em>Env Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Prefix</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GitHubUser#getEnvPrefix()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EAttribute getGitHubUser_EnvPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.passport.GitHubUser#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GitHubUser#getProductStore()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EReference getGitHubUser_ProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.GitHubUser#getTokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Type</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GitHubUser#getTokenType()
	 * @see #getGitHubUser()
	 * @generated
	 */
	EAttribute getGitHubUser_TokenType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.passport.GoogleUser <em>Google User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Google User</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GoogleUser
	 * @generated
	 */
	EClass getGoogleUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.GoogleUser#getGoogleUserId <em>Google User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Google User Id</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GoogleUser#getGoogleUserId()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EAttribute getGoogleUser_GoogleUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.GoogleUser#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GoogleUser#getAccessToken()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EAttribute getGoogleUser_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.GoogleUser#getEnvPrefix <em>Env Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Prefix</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GoogleUser#getEnvPrefix()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EAttribute getGoogleUser_EnvPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.passport.GoogleUser#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GoogleUser#getProductStore()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EReference getGoogleUser_ProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.GoogleUser#getTokenType <em>Token Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Type</em>'.
	 * @see org.abchip.mimo.biz.model.passport.GoogleUser#getTokenType()
	 * @see #getGoogleUser()
	 * @generated
	 */
	EAttribute getGoogleUser_TokenType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.passport.LinkedInUser <em>Linked In User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linked In User</em>'.
	 * @see org.abchip.mimo.biz.model.passport.LinkedInUser
	 * @generated
	 */
	EClass getLinkedInUser();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.LinkedInUser#getLinkedInUserId <em>Linked In User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linked In User Id</em>'.
	 * @see org.abchip.mimo.biz.model.passport.LinkedInUser#getLinkedInUserId()
	 * @see #getLinkedInUser()
	 * @generated
	 */
	EAttribute getLinkedInUser_LinkedInUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.LinkedInUser#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.abchip.mimo.biz.model.passport.LinkedInUser#getAccessToken()
	 * @see #getLinkedInUser()
	 * @generated
	 */
	EAttribute getLinkedInUser_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.LinkedInUser#getEnvPrefix <em>Env Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env Prefix</em>'.
	 * @see org.abchip.mimo.biz.model.passport.LinkedInUser#getEnvPrefix()
	 * @see #getLinkedInUser()
	 * @generated
	 */
	EAttribute getLinkedInUser_EnvPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.passport.LinkedInUser#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.passport.LinkedInUser#getProductStore()
	 * @see #getLinkedInUser()
	 * @generated
	 */
	EReference getLinkedInUser_ProductStore();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.passport.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2
	 * @generated
	 */
	EClass getOAuth2();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.passport.OAuth2#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2#getProductStore()
	 * @see #getOAuth2()
	 * @generated
	 */
	EReference getOAuth2_ProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2#getFromDate()
	 * @see #getOAuth2()
	 * @generated
	 */
	EAttribute getOAuth2_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2#getIconUrl <em>Icon Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Url</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2#getIconUrl()
	 * @see #getOAuth2()
	 * @generated
	 */
	EAttribute getOAuth2_IconUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2#getLocalRedirectUri <em>Local Redirect Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Redirect Uri</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2#getLocalRedirectUri()
	 * @see #getOAuth2()
	 * @generated
	 */
	EAttribute getOAuth2_LocalRedirectUri();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2#getThruDate()
	 * @see #getOAuth2()
	 * @generated
	 */
	EAttribute getOAuth2_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub <em>OAuth2 Git Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Git Hub</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2GitHub
	 * @generated
	 */
	EClass getOAuth2GitHub();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2GitHub#getClientId()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getClientSecret <em>Client Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Secret</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2GitHub#getClientSecret()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_ClientSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2GitHub#getReturnUrl <em>Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Url</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2GitHub#getReturnUrl()
	 * @see #getOAuth2GitHub()
	 * @generated
	 */
	EAttribute getOAuth2GitHub_ReturnUrl();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.passport.OAuth2Google <em>OAuth2 Google</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Google</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2Google
	 * @generated
	 */
	EClass getOAuth2Google();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2Google#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2Google#getClientId()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2Google#getClientSecret <em>Client Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Secret</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2Google#getClientSecret()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_ClientSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2Google#getReturnUrl <em>Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Url</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2Google#getReturnUrl()
	 * @see #getOAuth2Google()
	 * @generated
	 */
	EAttribute getOAuth2Google_ReturnUrl();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn <em>OAuth2 Linked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2 Linked In</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2LinkedIn
	 * @generated
	 */
	EClass getOAuth2LinkedIn();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getApiKey <em>Api Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Key</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getApiKey()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_ApiKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getLiveReturnUrl <em>Live Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Live Return Url</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getLiveReturnUrl()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_LiveReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getSecretKey <em>Secret Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret Key</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getSecretKey()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_SecretKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getTestReturnUrl <em>Test Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Return Url</em>'.
	 * @see org.abchip.mimo.biz.model.passport.OAuth2LinkedIn#getTestReturnUrl()
	 * @see #getOAuth2LinkedIn()
	 * @generated
	 */
	EAttribute getOAuth2LinkedIn_TestReturnUrl();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.passport.ThirdPartyLogin <em>Third Party Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third Party Login</em>'.
	 * @see org.abchip.mimo.biz.model.passport.ThirdPartyLogin
	 * @generated
	 */
	EClass getThirdPartyLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getProductStore()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EReference getThirdPartyLogin_ProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getLoginMethTypeId <em>Login Meth Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Meth Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getLoginMethTypeId()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_LoginMethTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getLoginProviderId <em>Login Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Provider Id</em>'.
	 * @see org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getLoginProviderId()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_LoginProviderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getFromDate()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getSequenceNum()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.passport.ThirdPartyLogin#getThruDate()
	 * @see #getThirdPartyLogin()
	 * @generated
	 */
	EAttribute getThirdPartyLogin_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PassportFactory getPassportFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.passport.impl.GitHubUserImpl <em>Git Hub User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.passport.impl.GitHubUserImpl
		 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getGitHubUser()
		 * @generated
		 */
		EClass GIT_HUB_USER = eINSTANCE.getGitHubUser();

		/**
		 * The meta object literal for the '<em><b>Git Hub User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_USER__GIT_HUB_USER_ID = eINSTANCE.getGitHubUser_GitHubUserId();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_USER__ACCESS_TOKEN = eINSTANCE.getGitHubUser_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Env Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_USER__ENV_PREFIX = eINSTANCE.getGitHubUser_EnvPrefix();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_HUB_USER__PRODUCT_STORE = eINSTANCE.getGitHubUser_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Token Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_USER__TOKEN_TYPE = eINSTANCE.getGitHubUser_TokenType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.passport.impl.GoogleUserImpl <em>Google User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.passport.impl.GoogleUserImpl
		 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getGoogleUser()
		 * @generated
		 */
		EClass GOOGLE_USER = eINSTANCE.getGoogleUser();

		/**
		 * The meta object literal for the '<em><b>Google User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_USER__GOOGLE_USER_ID = eINSTANCE.getGoogleUser_GoogleUserId();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_USER__ACCESS_TOKEN = eINSTANCE.getGoogleUser_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Env Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_USER__ENV_PREFIX = eINSTANCE.getGoogleUser_EnvPrefix();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOGLE_USER__PRODUCT_STORE = eINSTANCE.getGoogleUser_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Token Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOGLE_USER__TOKEN_TYPE = eINSTANCE.getGoogleUser_TokenType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.passport.impl.LinkedInUserImpl <em>Linked In User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.passport.impl.LinkedInUserImpl
		 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getLinkedInUser()
		 * @generated
		 */
		EClass LINKED_IN_USER = eINSTANCE.getLinkedInUser();

		/**
		 * The meta object literal for the '<em><b>Linked In User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKED_IN_USER__LINKED_IN_USER_ID = eINSTANCE.getLinkedInUser_LinkedInUserId();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKED_IN_USER__ACCESS_TOKEN = eINSTANCE.getLinkedInUser_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Env Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKED_IN_USER__ENV_PREFIX = eINSTANCE.getLinkedInUser_EnvPrefix();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKED_IN_USER__PRODUCT_STORE = eINSTANCE.getLinkedInUser_ProductStore();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.passport.impl.OAuth2Impl <em>OAuth2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.passport.impl.OAuth2Impl
		 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getOAuth2()
		 * @generated
		 */
		EClass OAUTH2 = eINSTANCE.getOAuth2();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH2__PRODUCT_STORE = eINSTANCE.getOAuth2_ProductStore();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2__FROM_DATE = eINSTANCE.getOAuth2_FromDate();

		/**
		 * The meta object literal for the '<em><b>Icon Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2__ICON_URL = eINSTANCE.getOAuth2_IconUrl();

		/**
		 * The meta object literal for the '<em><b>Local Redirect Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2__LOCAL_REDIRECT_URI = eINSTANCE.getOAuth2_LocalRedirectUri();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2__THRU_DATE = eINSTANCE.getOAuth2_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.passport.impl.OAuth2GitHubImpl <em>OAuth2 Git Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.passport.impl.OAuth2GitHubImpl
		 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getOAuth2GitHub()
		 * @generated
		 */
		EClass OAUTH2_GIT_HUB = eINSTANCE.getOAuth2GitHub();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__CLIENT_ID = eINSTANCE.getOAuth2GitHub_ClientId();

		/**
		 * The meta object literal for the '<em><b>Client Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__CLIENT_SECRET = eINSTANCE.getOAuth2GitHub_ClientSecret();

		/**
		 * The meta object literal for the '<em><b>Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GIT_HUB__RETURN_URL = eINSTANCE.getOAuth2GitHub_ReturnUrl();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.passport.impl.OAuth2GoogleImpl <em>OAuth2 Google</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.passport.impl.OAuth2GoogleImpl
		 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getOAuth2Google()
		 * @generated
		 */
		EClass OAUTH2_GOOGLE = eINSTANCE.getOAuth2Google();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__CLIENT_ID = eINSTANCE.getOAuth2Google_ClientId();

		/**
		 * The meta object literal for the '<em><b>Client Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__CLIENT_SECRET = eINSTANCE.getOAuth2Google_ClientSecret();

		/**
		 * The meta object literal for the '<em><b>Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_GOOGLE__RETURN_URL = eINSTANCE.getOAuth2Google_ReturnUrl();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.passport.impl.OAuth2LinkedInImpl <em>OAuth2 Linked In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.passport.impl.OAuth2LinkedInImpl
		 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getOAuth2LinkedIn()
		 * @generated
		 */
		EClass OAUTH2_LINKED_IN = eINSTANCE.getOAuth2LinkedIn();

		/**
		 * The meta object literal for the '<em><b>Api Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__API_KEY = eINSTANCE.getOAuth2LinkedIn_ApiKey();

		/**
		 * The meta object literal for the '<em><b>Live Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__LIVE_RETURN_URL = eINSTANCE.getOAuth2LinkedIn_LiveReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Secret Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__SECRET_KEY = eINSTANCE.getOAuth2LinkedIn_SecretKey();

		/**
		 * The meta object literal for the '<em><b>Test Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2_LINKED_IN__TEST_RETURN_URL = eINSTANCE.getOAuth2LinkedIn_TestReturnUrl();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.passport.impl.ThirdPartyLoginImpl <em>Third Party Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.passport.impl.ThirdPartyLoginImpl
		 * @see org.abchip.mimo.biz.model.passport.impl.PassportPackageImpl#getThirdPartyLogin()
		 * @generated
		 */
		EClass THIRD_PARTY_LOGIN = eINSTANCE.getThirdPartyLogin();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIRD_PARTY_LOGIN__PRODUCT_STORE = eINSTANCE.getThirdPartyLogin_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Login Meth Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__LOGIN_METH_TYPE_ID = eINSTANCE.getThirdPartyLogin_LoginMethTypeId();

		/**
		 * The meta object literal for the '<em><b>Login Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__LOGIN_PROVIDER_ID = eINSTANCE.getThirdPartyLogin_LoginProviderId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__FROM_DATE = eINSTANCE.getThirdPartyLogin_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__SEQUENCE_NUM = eINSTANCE.getThirdPartyLogin_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_PARTY_LOGIN__THRU_DATE = eINSTANCE.getThirdPartyLogin_ThruDate();

	}

} //PassportPackage
