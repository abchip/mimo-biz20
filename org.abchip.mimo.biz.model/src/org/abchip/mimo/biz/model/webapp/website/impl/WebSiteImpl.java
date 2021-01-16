/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.webapp.website.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.theme.VisualThemeSet;
import org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig;
import org.abchip.mimo.biz.model.content.website.WebSitePathAlias;
import org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.biz.model.webapp.website.WebSite;
import org.abchip.mimo.biz.model.webapp.website.WebsitePackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#isAllowProductStoreChange <em>Allow Product Store Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getCookieDomain <em>Cookie Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#isDisplayMaintenancePage <em>Display Maintenance Page</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getEnableHttps <em>Enable Https</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getHostedPathAlias <em>Hosted Path Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getHttpHost <em>Http Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getHttpPort <em>Http Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getHttpsHost <em>Https Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getHttpsPort <em>Https Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getSecureContentPrefix <em>Secure Content Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getStandardContentPrefix <em>Standard Content Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getVisualThemeSet <em>Visual Theme Set</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getWebAnalyticsConfigs <em>Web Analytics Configs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getWebSiteContactLists <em>Web Site Contact Lists</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getWebSitePathAliass <em>Web Site Path Aliass</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.impl.WebSiteImpl#getWebappPath <em>Webapp Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSiteImpl extends EntityIdentifiableImpl implements WebSite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebSiteId() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__WEB_SITE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteId(String newWebSiteId) {
		eSet(WebsitePackage.Literals.WEB_SITE__WEB_SITE_ID, newWebSiteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowProductStoreChange() {
		return (Boolean)eGet(WebsitePackage.Literals.WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowProductStoreChange(boolean newAllowProductStoreChange) {
		eSet(WebsitePackage.Literals.WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE, newAllowProductStoreChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCookieDomain() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__COOKIE_DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCookieDomain(String newCookieDomain) {
		eSet(WebsitePackage.Literals.WEB_SITE__COOKIE_DOMAIN, newCookieDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisplayMaintenancePage() {
		return (Boolean)eGet(WebsitePackage.Literals.WEB_SITE__DISPLAY_MAINTENANCE_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayMaintenancePage(boolean newDisplayMaintenancePage) {
		eSet(WebsitePackage.Literals.WEB_SITE__DISPLAY_MAINTENANCE_PAGE, newDisplayMaintenancePage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnableHttps() {
		return (Boolean)eGet(WebsitePackage.Literals.WEB_SITE__ENABLE_HTTPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableHttps(Boolean newEnableHttps) {
		eSet(WebsitePackage.Literals.WEB_SITE__ENABLE_HTTPS, newEnableHttps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostedPathAlias() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__HOSTED_PATH_ALIAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostedPathAlias(String newHostedPathAlias) {
		eSet(WebsitePackage.Literals.WEB_SITE__HOSTED_PATH_ALIAS, newHostedPathAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpHost() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__HTTP_HOST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpHost(String newHttpHost) {
		eSet(WebsitePackage.Literals.WEB_SITE__HTTP_HOST, newHttpHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpPort() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__HTTP_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpPort(String newHttpPort) {
		eSet(WebsitePackage.Literals.WEB_SITE__HTTP_PORT, newHttpPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpsHost() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__HTTPS_HOST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpsHost(String newHttpsHost) {
		eSet(WebsitePackage.Literals.WEB_SITE__HTTPS_HOST, newHttpsHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpsPort() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__HTTPS_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpsPort(String newHttpsPort) {
		eSet(WebsitePackage.Literals.WEB_SITE__HTTPS_PORT, newHttpsPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDefault() {
		return (Boolean)eGet(WebsitePackage.Literals.WEB_SITE__IS_DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(boolean newIsDefault) {
		eSet(WebsitePackage.Literals.WEB_SITE__IS_DEFAULT, newIsDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStore() {
		return (ProductStore)eGet(WebsitePackage.Literals.WEB_SITE__PRODUCT_STORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStore(ProductStore newProductStore) {
		eSet(WebsitePackage.Literals.WEB_SITE__PRODUCT_STORE, newProductStore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecureContentPrefix() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__SECURE_CONTENT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureContentPrefix(String newSecureContentPrefix) {
		eSet(WebsitePackage.Literals.WEB_SITE__SECURE_CONTENT_PREFIX, newSecureContentPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteName() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__SITE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteName(String newSiteName) {
		eSet(WebsitePackage.Literals.WEB_SITE__SITE_NAME, newSiteName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardContentPrefix() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__STANDARD_CONTENT_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardContentPrefix(String newStandardContentPrefix) {
		eSet(WebsitePackage.Literals.WEB_SITE__STANDARD_CONTENT_PREFIX, newStandardContentPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualThemeSet getVisualThemeSet() {
		return (VisualThemeSet)eGet(WebsitePackage.Literals.WEB_SITE__VISUAL_THEME_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeSet(VisualThemeSet newVisualThemeSet) {
		eSet(WebsitePackage.Literals.WEB_SITE__VISUAL_THEME_SET, newVisualThemeSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WebAnalyticsConfig> getWebAnalyticsConfigs() {
		return (List<WebAnalyticsConfig>)eGet(WebsitePackage.Literals.WEB_SITE__WEB_ANALYTICS_CONFIGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WebSiteContactList> getWebSiteContactLists() {
		return (List<WebSiteContactList>)eGet(WebsitePackage.Literals.WEB_SITE__WEB_SITE_CONTACT_LISTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WebSitePathAlias> getWebSitePathAliass() {
		return (List<WebSitePathAlias>)eGet(WebsitePackage.Literals.WEB_SITE__WEB_SITE_PATH_ALIASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebappPath() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE__WEBAPP_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebappPath(String newWebappPath) {
		eSet(WebsitePackage.Literals.WEB_SITE__WEBAPP_PATH, newWebappPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.WEB_SITE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case WebsitePackage.WEB_SITE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case WebsitePackage.WEB_SITE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case WebsitePackage.WEB_SITE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return WebsitePackage.WEB_SITE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return WebsitePackage.WEB_SITE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return WebsitePackage.WEB_SITE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return WebsitePackage.WEB_SITE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WebSiteImpl
