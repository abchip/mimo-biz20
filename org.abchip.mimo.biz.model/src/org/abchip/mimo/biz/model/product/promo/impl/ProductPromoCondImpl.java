/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.promo.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.product.promo.ProductPromo;
import org.abchip.mimo.biz.model.product.promo.ProductPromoCond;
import org.abchip.mimo.biz.model.product.promo.PromoPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getProductPromo <em>Product Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getCustomMethod <em>Custom Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getInputParamEnum <em>Input Param Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getOperatorEnum <em>Operator Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.impl.ProductPromoCondImpl#getOtherValue <em>Other Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoCondImpl extends EntityIdentifiableImpl implements ProductPromoCond {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoCondImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO_COND;
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
		return (ProductPromo)eGet(PromoPackage.Literals.PRODUCT_PROMO_COND__PRODUCT_PROMO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromo(ProductPromo newProductPromo) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_COND__PRODUCT_PROMO, newProductPromo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondValue() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO_COND__COND_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondValue(String newCondValue) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_COND__COND_VALUE, newCondValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getCustomMethod() {
		return (CustomMethod)eGet(PromoPackage.Literals.PRODUCT_PROMO_COND__CUSTOM_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethod(CustomMethod newCustomMethod) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_COND__CUSTOM_METHOD, newCustomMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getInputParamEnum() {
		return (Enumeration)eGet(PromoPackage.Literals.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputParamEnum(Enumeration newInputParamEnum) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM, newInputParamEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getOperatorEnum() {
		return (Enumeration)eGet(PromoPackage.Literals.PRODUCT_PROMO_COND__OPERATOR_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorEnum(Enumeration newOperatorEnum) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_COND__OPERATOR_ENUM, newOperatorEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherValue() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO_COND__OTHER_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherValue(String newOtherValue) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_COND__OTHER_VALUE, newOtherValue);
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
				case PromoPackage.PRODUCT_PROMO_COND__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case PromoPackage.PRODUCT_PROMO_COND__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case PromoPackage.PRODUCT_PROMO_COND__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case PromoPackage.PRODUCT_PROMO_COND__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return PromoPackage.PRODUCT_PROMO_COND__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return PromoPackage.PRODUCT_PROMO_COND__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return PromoPackage.PRODUCT_PROMO_COND__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return PromoPackage.PRODUCT_PROMO_COND__LAST_UPDATED_TX_STAMP;
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
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCondSeqId(String newProductPromoCondSeqId) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID, newProductPromoCondSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoRuleId() {
		return (String)eGet(PromoPackage.Literals.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoRuleId(String newProductPromoRuleId) {
		eSet(PromoPackage.Literals.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID, newProductPromoRuleId);
	}

} //ProductPromoCondImpl
