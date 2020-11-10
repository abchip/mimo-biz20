/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.cost.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.cost.CostComponent;
import org.abchip.mimo.biz.model.product.cost.CostComponentAttribute;
import org.abchip.mimo.biz.model.product.cost.CostComponentCalc;
import org.abchip.mimo.biz.model.product.cost.CostComponentType;
import org.abchip.mimo.biz.model.product.cost.CostPackage;
import org.abchip.mimo.biz.model.product.feature.ProductFeature;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getCostComponentId <em>Cost Component Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getCostComponentAttributes <em>Cost Component Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getCostComponentCalc <em>Cost Component Calc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getCostComponentType <em>Cost Component Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getCostUom <em>Cost Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getGeo <em>Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getProductFeature <em>Product Feature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.impl.CostComponentImpl#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostComponentImpl extends EntityTypedImpl<CostComponentType> implements CostComponent {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CostPackage.Literals.COST_COMPONENT;
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
	public BigDecimal getCost() {
		return (BigDecimal)eGet(CostPackage.Literals.COST_COMPONENT__COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(BigDecimal newCost) {
		eSet(CostPackage.Literals.COST_COMPONENT__COST, newCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CostComponentAttribute> getCostComponentAttributes() {
		return (List<CostComponentAttribute>)eGet(CostPackage.Literals.COST_COMPONENT__COST_COMPONENT_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentCalc getCostComponentCalc() {
		return (CostComponentCalc)eGet(CostPackage.Literals.COST_COMPONENT__COST_COMPONENT_CALC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentCalc(CostComponentCalc newCostComponentCalc) {
		eSet(CostPackage.Literals.COST_COMPONENT__COST_COMPONENT_CALC, newCostComponentCalc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostComponentType getCostComponentType() {
		return (CostComponentType)eGet(CostPackage.Literals.COST_COMPONENT__COST_COMPONENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentType(CostComponentType newCostComponentType) {
		eSet(CostPackage.Literals.COST_COMPONENT__COST_COMPONENT_TYPE, newCostComponentType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCostUom() {
		return (Uom)eGet(CostPackage.Literals.COST_COMPONENT__COST_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostUom(Uom newCostUom) {
		eSet(CostPackage.Literals.COST_COMPONENT__COST_UOM, newCostUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAsset() {
		return (FixedAsset)eGet(CostPackage.Literals.COST_COMPONENT__FIXED_ASSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAsset(FixedAsset newFixedAsset) {
		eSet(CostPackage.Literals.COST_COMPONENT__FIXED_ASSET, newFixedAsset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(CostPackage.Literals.COST_COMPONENT__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(CostPackage.Literals.COST_COMPONENT__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeo() {
		return (Geo)eGet(CostPackage.Literals.COST_COMPONENT__GEO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeo(Geo newGeo) {
		eSet(CostPackage.Literals.COST_COMPONENT__GEO, newGeo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(CostPackage.Literals.COST_COMPONENT__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(CostPackage.Literals.COST_COMPONENT__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return (Product)eGet(CostPackage.Literals.COST_COMPONENT__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(CostPackage.Literals.COST_COMPONENT__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeature getProductFeature() {
		return (ProductFeature)eGet(CostPackage.Literals.COST_COMPONENT__PRODUCT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeature(ProductFeature newProductFeature) {
		eSet(CostPackage.Literals.COST_COMPONENT__PRODUCT_FEATURE, newProductFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(CostPackage.Literals.COST_COMPONENT__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(CostPackage.Literals.COST_COMPONENT__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffort() {
		return (WorkEffort)eGet(CostPackage.Literals.COST_COMPONENT__WORK_EFFORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffort(WorkEffort newWorkEffort) {
		eSet(CostPackage.Literals.COST_COMPONENT__WORK_EFFORT, newWorkEffort);
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
				case CostPackage.COST_COMPONENT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case CostPackage.COST_COMPONENT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case CostPackage.COST_COMPONENT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case CostPackage.COST_COMPONENT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return CostPackage.COST_COMPONENT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return CostPackage.COST_COMPONENT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return CostPackage.COST_COMPONENT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return CostPackage.COST_COMPONENT__LAST_UPDATED_TX_STAMP;
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
	public String getCostComponentId() {
		return (String)eGet(CostPackage.Literals.COST_COMPONENT__COST_COMPONENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCostComponentId(String newCostComponentId) {
		eSet(CostPackage.Literals.COST_COMPONENT__COST_COMPONENT_ID, newCostComponentId);
	}

} //CostComponentImpl
