/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.webapp.website;

import java.util.List;
import org.abchip.mimo.biz.model.common.theme.VisualThemeSet;
import org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig;
import org.abchip.mimo.biz.model.content.website.WebSitePathAlias;
import org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList;
import org.abchip.mimo.biz.model.product.store.ProductStore;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isAllowProductStoreChange <em>Allow Product Store Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getCookieDomain <em>Cookie Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isDisplayMaintenancePage <em>Display Maintenance Page</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getEnableHttps <em>Enable Https</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHostedPathAlias <em>Hosted Path Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpHost <em>Http Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpPort <em>Http Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpsHost <em>Https Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpsPort <em>Https Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getSecureContentPrefix <em>Secure Content Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getStandardContentPrefix <em>Standard Content Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getVisualThemeSet <em>Visual Theme Set</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebAnalyticsConfigs <em>Web Analytics Configs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSiteContactLists <em>Web Site Contact Lists</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSitePathAliass <em>Web Site Path Aliass</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebappPath <em>Webapp Path</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite()
 * @model
 * @generated
 */
public interface WebSite extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Id</em>' attribute.
	 * @see #setWebSiteId(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_WebSiteId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebSiteId <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' attribute.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(String value);

	/**
	 * Returns the value of the '<em><b>Allow Product Store Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Product Store Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Product Store Change</em>' attribute.
	 * @see #setAllowProductStoreChange(boolean)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_AllowProductStoreChange()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Allow change of ProductStore for this WebSite (webapp). Defaults to N (no).'"
	 * @generated
	 */
	boolean isAllowProductStoreChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isAllowProductStoreChange <em>Allow Product Store Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Product Store Change</em>' attribute.
	 * @see #isAllowProductStoreChange()
	 * @generated
	 */
	void setAllowProductStoreChange(boolean value);

	/**
	 * Returns the value of the '<em><b>Cookie Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookie Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookie Domain</em>' attribute.
	 * @see #setCookieDomain(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_CookieDomain()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCookieDomain();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getCookieDomain <em>Cookie Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookie Domain</em>' attribute.
	 * @see #getCookieDomain()
	 * @generated
	 */
	void setCookieDomain(String value);

	/**
	 * Returns the value of the '<em><b>Display Maintenance Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Maintenance Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Maintenance Page</em>' attribute.
	 * @see #setDisplayMaintenancePage(boolean)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_DisplayMaintenancePage()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If set to Y, redirect user to site maintenance page'"
	 * @generated
	 */
	boolean isDisplayMaintenancePage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isDisplayMaintenancePage <em>Display Maintenance Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Maintenance Page</em>' attribute.
	 * @see #isDisplayMaintenancePage()
	 * @generated
	 */
	void setDisplayMaintenancePage(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Https</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Https</em>' attribute.
	 * @see #setEnableHttps(Boolean)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_EnableHttps()
	 * @model
	 * @generated
	 */
	Boolean getEnableHttps();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getEnableHttps <em>Enable Https</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Https</em>' attribute.
	 * @see #getEnableHttps()
	 * @generated
	 */
	void setEnableHttps(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hosted Path Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Path Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Path Alias</em>' attribute.
	 * @see #setHostedPathAlias(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_HostedPathAlias()
	 * @model annotation="mimo-ent-slot help='For WebSites hosted on webapp using the WebSiteFilter, indicates the path this WebSite will be hosted on'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getHostedPathAlias();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHostedPathAlias <em>Hosted Path Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosted Path Alias</em>' attribute.
	 * @see #getHostedPathAlias()
	 * @generated
	 */
	void setHostedPathAlias(String value);

	/**
	 * Returns the value of the '<em><b>Http Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Host</em>' attribute.
	 * @see #setHttpHost(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_HttpHost()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getHttpHost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpHost <em>Http Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Host</em>' attribute.
	 * @see #getHttpHost()
	 * @generated
	 */
	void setHttpHost(String value);

	/**
	 * Returns the value of the '<em><b>Http Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Port</em>' attribute.
	 * @see #setHttpPort(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_HttpPort()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getHttpPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpPort <em>Http Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Port</em>' attribute.
	 * @see #getHttpPort()
	 * @generated
	 */
	void setHttpPort(String value);

	/**
	 * Returns the value of the '<em><b>Https Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Https Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Https Host</em>' attribute.
	 * @see #setHttpsHost(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_HttpsHost()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getHttpsHost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpsHost <em>Https Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Https Host</em>' attribute.
	 * @see #getHttpsHost()
	 * @generated
	 */
	void setHttpsHost(String value);

	/**
	 * Returns the value of the '<em><b>Https Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Https Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Https Port</em>' attribute.
	 * @see #setHttpsPort(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_HttpsPort()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getHttpsPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getHttpsPort <em>Https Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Https Port</em>' attribute.
	 * @see #getHttpsPort()
	 * @generated
	 */
	void setHttpsPort(String value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_IsDefault()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If Y then it is default WebSite'"
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_ProductStore()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Secure Content Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Content Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Content Prefix</em>' attribute.
	 * @see #setSecureContentPrefix(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_SecureContentPrefix()
	 * @model annotation="mimo-ent-format type='url'"
	 * @generated
	 */
	String getSecureContentPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getSecureContentPrefix <em>Secure Content Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Content Prefix</em>' attribute.
	 * @see #getSecureContentPrefix()
	 * @generated
	 */
	void setSecureContentPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Name</em>' attribute.
	 * @see #setSiteName(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_SiteName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getSiteName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getSiteName <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Name</em>' attribute.
	 * @see #getSiteName()
	 * @generated
	 */
	void setSiteName(String value);

	/**
	 * Returns the value of the '<em><b>Standard Content Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Content Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Content Prefix</em>' attribute.
	 * @see #setStandardContentPrefix(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_StandardContentPrefix()
	 * @model annotation="mimo-ent-format type='url'"
	 * @generated
	 */
	String getStandardContentPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getStandardContentPrefix <em>Standard Content Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Content Prefix</em>' attribute.
	 * @see #getStandardContentPrefix()
	 * @generated
	 */
	void setStandardContentPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Visual Theme Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Theme Set</em>' reference.
	 * @see #setVisualThemeSet(VisualThemeSet)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_VisualThemeSet()
	 * @model keys="visualThemeSetId"
	 * @generated
	 */
	VisualThemeSet getVisualThemeSet();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getVisualThemeSet <em>Visual Theme Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme Set</em>' reference.
	 * @see #getVisualThemeSet()
	 * @generated
	 */
	void setVisualThemeSet(VisualThemeSet value);

	/**
	 * Returns the value of the '<em><b>Web Analytics Configs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.website.WebAnalyticsConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Analytics Configs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_WebAnalyticsConfigs()
	 * @model derived="true"
	 * @generated
	 */
	List<WebAnalyticsConfig> getWebAnalyticsConfigs();

	/**
	 * Returns the value of the '<em><b>Web Site Contact Lists</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.marketing.contact.WebSiteContactList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Contact Lists</em>' reference list.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_WebSiteContactLists()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraint fromDate='*NOW'"
	 * @generated
	 */
	List<WebSiteContactList> getWebSiteContactLists();

	/**
	 * Returns the value of the '<em><b>Web Site Path Aliass</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.content.website.WebSitePathAlias}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Path Aliass</em>' reference list.
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_WebSitePathAliass()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraint fromDate='*NOW'"
	 * @generated
	 */
	List<WebSitePathAlias> getWebSitePathAliass();

	/**
	 * Returns the value of the '<em><b>Webapp Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webapp Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webapp Path</em>' attribute.
	 * @see #setWebappPath(String)
	 * @see org.abchip.mimo.biz.model.webapp.website.WebsitePackage#getWebSite_WebappPath()
	 * @model annotation="mimo-ent-slot help='Set to your webapp for this website if it\'s hidden by a httpd frontend; set to / if you have a reverse proxy which hides your website webapp'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getWebappPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.webapp.website.WebSite#getWebappPath <em>Webapp Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webapp Path</em>' attribute.
	 * @see #getWebappPath()
	 * @generated
	 */
	void setWebappPath(String value);

} // WebSite
