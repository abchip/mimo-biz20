/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.manufacturing.bom.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.manufacturing.bom.BomPackage;
import org.abchip.mimo.biz.model.manufacturing.bom.ProductManufacturingRule;
import org.abchip.mimo.biz.model.product.feature.ProductFeature;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Manufacturing Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getRuleId <em>Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductFeature <em>Product Feature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdFor <em>Product Id For</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdIn <em>Product Id In</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getProductIdInSubst <em>Product Id In Subst</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getRuleOperator <em>Rule Operator</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getRuleSeqId <em>Rule Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.bom.impl.ProductManufacturingRuleImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductManufacturingRuleImpl extends EntityIdentifiableImpl implements ProductManufacturingRule {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductManufacturingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BomPackage.Literals.PRODUCT_MANUFACTURING_RULE;
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
	public String getRuleId() {
		return (String)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleId(String newRuleId) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_ID, newRuleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return (Product)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeature getProductFeature() {
		return (ProductFeature)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeature(ProductFeature newProductFeature) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_FEATURE, newProductFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdFor() {
		return (Product)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdFor(Product newProductIdFor) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_FOR, newProductIdFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdIn() {
		return (Product)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdIn(Product newProductIdIn) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN, newProductIdIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductIdInSubst() {
		return (Product)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductIdInSubst(Product newProductIdInSubst) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__PRODUCT_ID_IN_SUBST, newProductIdInSubst);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getQuantity() {
		return (Double)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(double newQuantity) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleOperator() {
		return (String)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleOperator(String newRuleOperator) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_OPERATOR, newRuleOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleSeqId() {
		return (String)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleSeqId(String newRuleSeqId) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__RULE_SEQ_ID, newRuleSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(BomPackage.Literals.PRODUCT_MANUFACTURING_RULE__THRU_DATE, newThruDate);
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
				case BomPackage.PRODUCT_MANUFACTURING_RULE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case BomPackage.PRODUCT_MANUFACTURING_RULE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case BomPackage.PRODUCT_MANUFACTURING_RULE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case BomPackage.PRODUCT_MANUFACTURING_RULE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return BomPackage.PRODUCT_MANUFACTURING_RULE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return BomPackage.PRODUCT_MANUFACTURING_RULE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return BomPackage.PRODUCT_MANUFACTURING_RULE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return BomPackage.PRODUCT_MANUFACTURING_RULE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProductManufacturingRuleImpl
