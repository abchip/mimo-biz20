/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.config.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.product.config.ConfigPackage;
import org.abchip.mimo.biz.model.product.config.ProductConfigItem;
import org.abchip.mimo.biz.model.product.config.ProductConfigOptionIactn;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Config Option Iactn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getConfigItem <em>Config Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getConfigItemIdTo <em>Config Item Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getConfigOptionId <em>Config Option Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getConfigOptionIdTo <em>Config Option Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getConfigIactnTypeId <em>Config Iactn Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.impl.ProductConfigOptionIactnImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductConfigOptionIactnImpl extends EntityIdentifiableImpl implements ProductConfigOptionIactn {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductConfigOptionIactnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN;
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
	public ProductConfigItem getConfigItem() {
		return (ProductConfigItem)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItem(ProductConfigItem newConfigItem) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM, newConfigItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigIactnTypeId() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigIactnTypeId(String newConfigIactnTypeId) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_IACTN_TYPE_ID, newConfigIactnTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigOptionId() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigOptionId(String newConfigOptionId) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID, newConfigOptionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigOptionIdTo() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigOptionIdTo(String newConfigOptionIdTo) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_OPTION_ID_TO, newConfigOptionIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__DESCRIPTION, newDescription);
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
				case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return ConfigPackage.PRODUCT_CONFIG_OPTION_IACTN__LAST_UPDATED_TX_STAMP;
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
	public long getSequenceNum() {
		return (Long)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConfigItem getConfigItemIdTo() {
		return (ProductConfigItem)eGet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigItemIdTo(ProductConfigItem newConfigItemIdTo) {
		eSet(ConfigPackage.Literals.PRODUCT_CONFIG_OPTION_IACTN__CONFIG_ITEM_ID_TO, newConfigItemIdTo);
	}

} //ProductConfigOptionIactnImpl
