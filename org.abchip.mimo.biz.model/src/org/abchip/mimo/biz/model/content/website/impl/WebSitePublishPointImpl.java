/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.website.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.content.website.WebSitePublishPoint;
import org.abchip.mimo.biz.model.content.website.WebsitePackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site Publish Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getAboutContentId <em>About Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getContentDept <em>Content Dept</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getLeftBarId <em>Left Bar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getLineLogo <em>Line Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getLogo <em>Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getMedallionLogo <em>Medallion Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getRightBarId <em>Right Bar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getStyleSheetFile <em>Style Sheet File</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.website.impl.WebSitePublishPointImpl#getTemplateTitle <em>Template Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSitePublishPointImpl extends EntityIdentifiableImpl implements WebSitePublishPoint {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSitePublishPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT;
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
	public String getAboutContentId() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAboutContentId(String newAboutContentId) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID, newAboutContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentDept() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__CONTENT_DEPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentDept(String newContentDept) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__CONTENT_DEPT, newContentDept);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__CONTENT_ID, newContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLeftBarId() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftBarId(String newLeftBarId) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID, newLeftBarId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineLogo() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__LINE_LOGO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineLogo(String newLineLogo) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__LINE_LOGO, newLineLogo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogo() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__LOGO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogo(String newLogo) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__LOGO, newLogo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMedallionLogo() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedallionLogo(String newMedallionLogo) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO, newMedallionLogo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRightBarId() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightBarId(String newRightBarId) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID, newRightBarId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleSheetFile() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleSheetFile(String newStyleSheetFile) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE, newStyleSheetFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateTitle() {
		return (String)eGet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateTitle(String newTemplateTitle) {
		eSet(WebsitePackage.Literals.WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE, newTemplateTitle);
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
				case WebsitePackage.WEB_SITE_PUBLISH_POINT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case WebsitePackage.WEB_SITE_PUBLISH_POINT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case WebsitePackage.WEB_SITE_PUBLISH_POINT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case WebsitePackage.WEB_SITE_PUBLISH_POINT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return WebsitePackage.WEB_SITE_PUBLISH_POINT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return WebsitePackage.WEB_SITE_PUBLISH_POINT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return WebsitePackage.WEB_SITE_PUBLISH_POINT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return WebsitePackage.WEB_SITE_PUBLISH_POINT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WebSitePublishPointImpl
