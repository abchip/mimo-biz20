/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.feature.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.product.feature.FeaturePackage;
import org.abchip.mimo.biz.model.product.feature.ProductFeature;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureCategory;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureIactn;
import org.abchip.mimo.biz.model.product.feature.ProductFeatureType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getAbbrev <em>Abbrev</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getDefaultAmount <em>Default Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getDefaultSequenceNum <em>Default Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getIdCode <em>Id Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getMainProductFeatureIactns <em>Main Product Feature Iactns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getNumberSpecified <em>Number Specified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getProductFeatureCategoryId <em>Product Feature Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getProductFeatureTypeId <em>Product Feature Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.feature.impl.ProductFeatureImpl#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureImpl extends EntityTypedImpl<ProductFeatureType> implements ProductFeature {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE;
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
	public String getAbbrev() {
		return (String)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__ABBREV, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbrev(String newAbbrev) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__ABBREV, newAbbrev);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDefaultAmount() {
		return (BigDecimal)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__DEFAULT_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultAmount(BigDecimal newDefaultAmount) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__DEFAULT_AMOUNT, newDefaultAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDefaultSequenceNum() {
		return (Long)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSequenceNum(long newDefaultSequenceNum) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__DEFAULT_SEQUENCE_NUM, newDefaultSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdCode() {
		return (String)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__ID_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdCode(String newIdCode) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__ID_CODE, newIdCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductFeatureIactn> getMainProductFeatureIactns() {
		return (List<ProductFeatureIactn>)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__MAIN_PRODUCT_FEATURE_IACTNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getNumberSpecified() {
		return (BigDecimal)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__NUMBER_SPECIFIED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberSpecified(BigDecimal newNumberSpecified) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__NUMBER_SPECIFIED, newNumberSpecified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		return (Uom)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__UOM_ID, newUomId);
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
				case FeaturePackage.PRODUCT_FEATURE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case FeaturePackage.PRODUCT_FEATURE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case FeaturePackage.PRODUCT_FEATURE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case FeaturePackage.PRODUCT_FEATURE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return FeaturePackage.PRODUCT_FEATURE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return FeaturePackage.PRODUCT_FEATURE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return FeaturePackage.PRODUCT_FEATURE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return FeaturePackage.PRODUCT_FEATURE__LAST_UPDATED_TX_STAMP;
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
	public ProductFeatureCategory getProductFeatureCategoryId() {
		return (ProductFeatureCategory)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureCategoryId(ProductFeatureCategory newProductFeatureCategoryId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_CATEGORY_ID, newProductFeatureCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureType getProductFeatureTypeId() {
		return (ProductFeatureType)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureTypeId(ProductFeatureType newProductFeatureTypeId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_TYPE_ID, newProductFeatureTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return (String)eGet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		eSet(FeaturePackage.Literals.PRODUCT_FEATURE__PRODUCT_FEATURE_ID, newProductFeatureId);
	}

} //ProductFeatureImpl
