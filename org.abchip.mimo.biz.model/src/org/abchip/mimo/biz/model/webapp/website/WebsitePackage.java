/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.webapp.website;

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
 * @see org.abchip.mimo.biz.model.webapp.website.WebsiteFactory
 * @model kind="package"
 * @generated
 */
public interface WebsitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "website";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/webapp/website";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-website";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsitePackage eINSTANCE = org.abchip.mimo.biz.model.webapp.website.impl.WebsitePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.webapp.website.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.webapp.website.impl.WebPageImpl
	 * @see org.abchip.mimo.biz.model.webapp.website.impl.WebsitePackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Web Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WEB_PAGE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__CONTENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__PAGE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WEB_SITE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl <em>Web Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl
	 * @see org.abchip.mimo.biz.model.webapp.website.impl.WebsitePackageImpl#getWebSite()
	 * @generated
	 */
	int WEB_SITE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_SITE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allow Product Store Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cookie Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__COOKIE_DOMAIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Display Maintenance Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__DISPLAY_MAINTENANCE_PAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Enable Https</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__ENABLE_HTTPS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hosted Path Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HOSTED_PATH_ALIAS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Http Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HTTP_HOST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Http Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HTTP_PORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Https Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HTTPS_HOST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Https Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HTTPS_PORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__IS_DEFAULT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__PRODUCT_STORE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Secure Content Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__SECURE_CONTENT_PREFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__SITE_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Standard Content Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__STANDARD_CONTENT_PREFIX = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Visual Theme Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__VISUAL_THEME_SET = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Web Analytics Configs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_ANALYTICS_CONFIGS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Web Site Contact Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_SITE_CONTACT_LISTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Web Site Path Aliass</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_SITE_PATH_ALIASS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Webapp Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEBAPP_PATH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 24;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.webapp.website.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getWebPageId <em>Web Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Page Id</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebPage#getWebPageId()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WebPageId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebPage#getContent()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getPageName <em>Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Name</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebPage#getPageName()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_PageName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.webapp.website.WebPage#getWebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebPage#getWebSite()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_WebSite();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.webapp.website.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite
	 * @generated
	 */
	EClass getWebSite();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSiteId()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebSiteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isAllowProductStoreChange <em>Allow Product Store Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Product Store Change</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#isAllowProductStoreChange()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_AllowProductStoreChange();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getCookieDomain <em>Cookie Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookie Domain</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getCookieDomain()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_CookieDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isDisplayMaintenancePage <em>Display Maintenance Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Maintenance Page</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#isDisplayMaintenancePage()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_DisplayMaintenancePage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getEnableHttps <em>Enable Https</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Https</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getEnableHttps()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_EnableHttps();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHostedPathAlias <em>Hosted Path Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hosted Path Alias</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getHostedPathAlias()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HostedPathAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpHost <em>Http Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Host</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpHost()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HttpHost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpPort <em>Http Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Port</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpPort()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HttpPort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpsHost <em>Https Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Https Host</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpsHost()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HttpsHost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpsPort <em>Https Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Https Port</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpsPort()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HttpsPort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#isIsDefault()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_IsDefault();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getProductStore()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_ProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getSecureContentPrefix <em>Secure Content Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Content Prefix</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getSecureContentPrefix()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_SecureContentPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getSiteName <em>Site Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Name</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getSiteName()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_SiteName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getStandardContentPrefix <em>Standard Content Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Content Prefix</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getStandardContentPrefix()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_StandardContentPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getVisualThemeSet <em>Visual Theme Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visual Theme Set</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getVisualThemeSet()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_VisualThemeSet();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebAnalyticsConfigs <em>Web Analytics Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Web Analytics Configs</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getWebAnalyticsConfigs()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_WebAnalyticsConfigs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSiteContactLists <em>Web Site Contact Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Web Site Contact Lists</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSiteContactLists()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_WebSiteContactLists();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSitePathAliass <em>Web Site Path Aliass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Web Site Path Aliass</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSitePathAliass()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_WebSitePathAliass();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebappPath <em>Webapp Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webapp Path</em>'.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebSite#getWebappPath()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebappPath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebsiteFactory getWebsiteFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.webapp.website.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.webapp.website.impl.WebPageImpl
		 * @see org.abchip.mimo.biz.model.webapp.website.impl.WebsitePackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Web Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WEB_PAGE_ID = eINSTANCE.getWebPage_WebPageId();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__CONTENT = eINSTANCE.getWebPage_Content();

		/**
		 * The meta object literal for the '<em><b>Page Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__PAGE_NAME = eINSTANCE.getWebPage_PageName();

		/**
		 * The meta object literal for the '<em><b>Web Site</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__WEB_SITE = eINSTANCE.getWebPage_WebSite();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl <em>Web Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl
		 * @see org.abchip.mimo.biz.model.webapp.website.impl.WebsitePackageImpl#getWebSite()
		 * @generated
		 */
		EClass WEB_SITE = eINSTANCE.getWebSite();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_SITE_ID = eINSTANCE.getWebSite_WebSiteId();

		/**
		 * The meta object literal for the '<em><b>Allow Product Store Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE = eINSTANCE.getWebSite_AllowProductStoreChange();

		/**
		 * The meta object literal for the '<em><b>Cookie Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__COOKIE_DOMAIN = eINSTANCE.getWebSite_CookieDomain();

		/**
		 * The meta object literal for the '<em><b>Display Maintenance Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__DISPLAY_MAINTENANCE_PAGE = eINSTANCE.getWebSite_DisplayMaintenancePage();

		/**
		 * The meta object literal for the '<em><b>Enable Https</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__ENABLE_HTTPS = eINSTANCE.getWebSite_EnableHttps();

		/**
		 * The meta object literal for the '<em><b>Hosted Path Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HOSTED_PATH_ALIAS = eINSTANCE.getWebSite_HostedPathAlias();

		/**
		 * The meta object literal for the '<em><b>Http Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HTTP_HOST = eINSTANCE.getWebSite_HttpHost();

		/**
		 * The meta object literal for the '<em><b>Http Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HTTP_PORT = eINSTANCE.getWebSite_HttpPort();

		/**
		 * The meta object literal for the '<em><b>Https Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HTTPS_HOST = eINSTANCE.getWebSite_HttpsHost();

		/**
		 * The meta object literal for the '<em><b>Https Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HTTPS_PORT = eINSTANCE.getWebSite_HttpsPort();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__IS_DEFAULT = eINSTANCE.getWebSite_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__PRODUCT_STORE = eINSTANCE.getWebSite_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Secure Content Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__SECURE_CONTENT_PREFIX = eINSTANCE.getWebSite_SecureContentPrefix();

		/**
		 * The meta object literal for the '<em><b>Site Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__SITE_NAME = eINSTANCE.getWebSite_SiteName();

		/**
		 * The meta object literal for the '<em><b>Standard Content Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__STANDARD_CONTENT_PREFIX = eINSTANCE.getWebSite_StandardContentPrefix();

		/**
		 * The meta object literal for the '<em><b>Visual Theme Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__VISUAL_THEME_SET = eINSTANCE.getWebSite_VisualThemeSet();

		/**
		 * The meta object literal for the '<em><b>Web Analytics Configs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__WEB_ANALYTICS_CONFIGS = eINSTANCE.getWebSite_WebAnalyticsConfigs();

		/**
		 * The meta object literal for the '<em><b>Web Site Contact Lists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__WEB_SITE_CONTACT_LISTS = eINSTANCE.getWebSite_WebSiteContactLists();

		/**
		 * The meta object literal for the '<em><b>Web Site Path Aliass</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__WEB_SITE_PATH_ALIASS = eINSTANCE.getWebSite_WebSitePathAliass();

		/**
		 * The meta object literal for the '<em><b>Webapp Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEBAPP_PATH = eINSTANCE.getWebSite_WebappPath();

	}

} //WebsitePackage
