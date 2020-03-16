/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.feature.impl;

import java.util.Date;

import org.abchip.mimo.biz.model.impl.BizEntityImpl;
import org.abchip.mimo.biz.model.product.category.ProductCategory;
import org.abchip.mimo.biz.model.product.feature.FeaturePackage;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureCatGrpAppl;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureGroup;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature Cat Grp Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureCatGrpApplImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureCatGrpApplImpl#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureCatGrpApplImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureCatGrpApplImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureCatGrpApplImpl extends BizEntityImpl implements ProductFeatureCatGrpAppl {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureCatGrpApplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		return (ProductCategory)eGet(FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_CATEGORY_ID, newProductCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureGroup getProductFeatureGroupId() {
		return (ProductFeatureGroup)eGet(FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_FEATURE_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureGroupId(ProductFeatureGroup newProductFeatureGroupId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE_CAT_GRP_APPL__PRODUCT_FEATURE_GROUP_ID, newProductFeatureGroupId);
	}

} //ProductFeatureCatGrpApplImpl
