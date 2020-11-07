/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.category.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.product.category.CategoryPackage;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.biz.model.product.category.ProductCategoryAttribute;
import org.abchip.mimo.biz.model.product.category.ProductCategoryLink;
import org.abchip.mimo.biz.model.product.category.ProductCategoryMember;
import org.abchip.mimo.biz.model.product.category.ProductCategoryRollup;
import org.abchip.mimo.biz.model.product.category.ProductCategoryType;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureCatGrpAppl;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureCategoryAppl;
import org.abchip.mimo.biz.model.product.supplier.MarketInterest;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getCategoryImageUrl <em>Category Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getCurrentProductCategoryRollups <em>Current Product Category Rollups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getDetailScreen <em>Detail Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getLinkOneImageUrl <em>Link One Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getLinkTwoImageUrl <em>Link Two Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getMarketInterests <em>Market Interests</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getPrimaryParentCategoryId <em>Primary Parent Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getProductCategoryAttributes <em>Product Category Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getProductCategoryLinks <em>Product Category Links</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getProductCategoryMembers <em>Product Category Members</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getProductCategoryTypeId <em>Product Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getProductFeatureCatGrpAppls <em>Product Feature Cat Grp Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getProductFeatureCategoryAppls <em>Product Feature Category Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.category.impl.ProductCategoryImpl#getShowInSelect <em>Show In Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryImpl extends EntityTypedImpl<ProductCategoryType> implements ProductCategory {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY;
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
	public String getCategoryImageUrl() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryImageUrl(String newCategoryImageUrl) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL, newCategoryImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryName() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__CATEGORY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryName(String newCategoryName) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__CATEGORY_NAME, newCategoryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategoryRollup> getCurrentProductCategoryRollups() {
		return (List<ProductCategoryRollup>)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__CURRENT_PRODUCT_CATEGORY_ROLLUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailScreen() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__DETAIL_SCREEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailScreen(String newDetailScreen) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__DETAIL_SCREEN, newDetailScreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkOneImageUrl() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkOneImageUrl(String newLinkOneImageUrl) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL, newLinkOneImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkTwoImageUrl() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTwoImageUrl(String newLinkTwoImageUrl) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL, newLinkTwoImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongDescription() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__LONG_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__LONG_DESCRIPTION, newLongDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MarketInterest> getMarketInterests() {
		return (List<MarketInterest>)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__MARKET_INTERESTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryType getProductCategoryTypeId() {
		return (ProductCategoryType)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryTypeId(ProductCategoryType newProductCategoryTypeId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID, newProductCategoryTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductFeatureCatGrpAppl> getProductFeatureCatGrpAppls() {
		return (List<ProductFeatureCatGrpAppl>)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_FEATURE_CAT_GRP_APPLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductFeatureCategoryAppl> getProductFeatureCategoryAppls() {
		return (List<ProductFeatureCategoryAppl>)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_FEATURE_CATEGORY_APPLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getShowInSelect() {
		return (Boolean)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__SHOW_IN_SELECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowInSelect(Boolean newShowInSelect) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__SHOW_IN_SELECT, newShowInSelect);
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
				case CategoryPackage.PRODUCT_CATEGORY__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case CategoryPackage.PRODUCT_CATEGORY__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case CategoryPackage.PRODUCT_CATEGORY__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case CategoryPackage.PRODUCT_CATEGORY__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return CategoryPackage.PRODUCT_CATEGORY__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return CategoryPackage.PRODUCT_CATEGORY__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return CategoryPackage.PRODUCT_CATEGORY__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return CategoryPackage.PRODUCT_CATEGORY__LAST_UPDATED_TX_STAMP;
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
	public ProductCategory getPrimaryParentCategoryId() {
		return (ProductCategory)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryParentCategoryId(ProductCategory newPrimaryParentCategoryId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID, newPrimaryParentCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategoryAttribute> getProductCategoryAttributes() {
		return (List<ProductCategoryAttribute>)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategoryLink> getProductCategoryLinks() {
		return (List<ProductCategoryLink>)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategoryMember> getProductCategoryMembers() {
		return (List<ProductCategoryMember>)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID, newProductCategoryId);
	}

} //ProductCategoryImpl
