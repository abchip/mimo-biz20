/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.catalog.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.product.catalog.CatalogPackage;
import org.abchip.mimo.biz.model.product.catalog.ProdCatalog;
import org.abchip.mimo.biz.model.product.catalog.ProdCatalogInvFacility;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prod Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getCatalogName <em>Catalog Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getContentPathPrefix <em>Content Path Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getHeaderLogo <em>Header Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getProdCatalogInvFacilities <em>Prod Catalog Inv Facilities</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#isPurchaseAllowPermReqd <em>Purchase Allow Perm Reqd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getStyleSheet <em>Style Sheet</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#getTemplatePathPrefix <em>Template Path Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#isUseQuickAdd <em>Use Quick Add</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.catalog.impl.ProdCatalogImpl#isViewAllowPermReqd <em>View Allow Perm Reqd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProdCatalogImpl extends EntityIdentifiableImpl implements ProdCatalog {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProdCatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.PROD_CATALOG;
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
	public String getCatalogName() {
		return (String)eGet(CatalogPackage.Literals.PROD_CATALOG__CATALOG_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalogName(String newCatalogName) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__CATALOG_NAME, newCatalogName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentPathPrefix() {
		return (String)eGet(CatalogPackage.Literals.PROD_CATALOG__CONTENT_PATH_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPathPrefix(String newContentPathPrefix) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__CONTENT_PATH_PREFIX, newContentPathPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderLogo() {
		return (String)eGet(CatalogPackage.Literals.PROD_CATALOG__HEADER_LOGO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderLogo(String newHeaderLogo) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__HEADER_LOGO, newHeaderLogo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProdCatalogInvFacility> getProdCatalogInvFacilities() {
		return (List<ProdCatalogInvFacility>)eGet(CatalogPackage.Literals.PROD_CATALOG__PROD_CATALOG_INV_FACILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPurchaseAllowPermReqd() {
		return (Boolean)eGet(CatalogPackage.Literals.PROD_CATALOG__PURCHASE_ALLOW_PERM_REQD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseAllowPermReqd(boolean newPurchaseAllowPermReqd) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__PURCHASE_ALLOW_PERM_REQD, newPurchaseAllowPermReqd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleSheet() {
		return (String)eGet(CatalogPackage.Literals.PROD_CATALOG__STYLE_SHEET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleSheet(String newStyleSheet) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__STYLE_SHEET, newStyleSheet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplatePathPrefix() {
		return (String)eGet(CatalogPackage.Literals.PROD_CATALOG__TEMPLATE_PATH_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplatePathPrefix(String newTemplatePathPrefix) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__TEMPLATE_PATH_PREFIX, newTemplatePathPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseQuickAdd() {
		return (Boolean)eGet(CatalogPackage.Literals.PROD_CATALOG__USE_QUICK_ADD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseQuickAdd(boolean newUseQuickAdd) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__USE_QUICK_ADD, newUseQuickAdd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isViewAllowPermReqd() {
		return (Boolean)eGet(CatalogPackage.Literals.PROD_CATALOG__VIEW_ALLOW_PERM_REQD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewAllowPermReqd(boolean newViewAllowPermReqd) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__VIEW_ALLOW_PERM_REQD, newViewAllowPermReqd);
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
				case CatalogPackage.PROD_CATALOG__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case CatalogPackage.PROD_CATALOG__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case CatalogPackage.PROD_CATALOG__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case CatalogPackage.PROD_CATALOG__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return CatalogPackage.PROD_CATALOG__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return CatalogPackage.PROD_CATALOG__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return CatalogPackage.PROD_CATALOG__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return CatalogPackage.PROD_CATALOG__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdCatalogId() {
		return (String)eGet(CatalogPackage.Literals.PROD_CATALOG__PROD_CATALOG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogId(String newProdCatalogId) {
		eSet(CatalogPackage.Literals.PROD_CATALOG__PROD_CATALOG_ID, newProdCatalogId);
	}

} //ProdCatalogImpl
