/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.promo.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.promo.ProductPromo;
import org.abchip.mimo.biz.model.product.promo.ProductPromoProduct;
import org.abchip.mimo.biz.model.product.promo.PromoPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getProductPromo <em>Product Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoProductImpl#getProductPromoApplEnum <em>Product Promo Appl Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoProductImpl extends EntityIdentifiableImpl implements ProductPromoProduct {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO_PRODUCT;
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
	public ProductPromo getProductPromo() {
		return (ProductPromo)eGet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromo(ProductPromo newProductPromo) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO, newProductPromo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return (Product)eGet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoActionSeqId() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_ACTION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoActionSeqId(String newProductPromoActionSeqId) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_ACTION_SEQ_ID, newProductPromoActionSeqId);
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
				case PromoPackage.PRODUCT_PROMO_PRODUCT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case PromoPackage.PRODUCT_PROMO_PRODUCT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case PromoPackage.PRODUCT_PROMO_PRODUCT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case PromoPackage.PRODUCT_PROMO_PRODUCT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return PromoPackage.PRODUCT_PROMO_PRODUCT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return PromoPackage.PRODUCT_PROMO_PRODUCT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return PromoPackage.PRODUCT_PROMO_PRODUCT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return PromoPackage.PRODUCT_PROMO_PRODUCT__LAST_UPDATED_TX_STAMP;
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
	public String getProductPromoCondSeqId() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_COND_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCondSeqId(String newProductPromoCondSeqId) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_COND_SEQ_ID, newProductPromoCondSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoRuleId() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoRuleId(String newProductPromoRuleId) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_RULE_ID, newProductPromoRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getProductPromoApplEnum() {
		return (Enumeration)eGet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_APPL_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoApplEnum(Enumeration newProductPromoApplEnum) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_PRODUCT__PRODUCT_PROMO_APPL_ENUM, newProductPromoApplEnum);
	}

} //ProductPromoProductImpl
