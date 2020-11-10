/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Type Gl Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getFixedAssetType <em>Fixed Asset Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getAccDepGlAccount <em>Acc Dep Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getAssetGlAccount <em>Asset Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getDepGlAccount <em>Dep Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getLossGlAccount <em>Loss Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getProfitGlAccount <em>Profit Gl Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetTypeGlAccountImpl extends EntityIdentifiableImpl implements FixedAssetTypeGlAccount {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetTypeGlAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT;
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
	public FixedAssetType getFixedAssetType() {
		return (FixedAssetType)eGet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetType(FixedAssetType newFixedAssetType) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE, newFixedAssetType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAsset() {
		return (FixedAsset)eGet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAsset(FixedAsset newFixedAsset) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET, newFixedAsset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganizationParty() {
		return (Party)eGet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationParty(Party newOrganizationParty) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY, newOrganizationParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getAccDepGlAccount() {
		return (GlAccount)eGet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccDepGlAccount(GlAccount newAccDepGlAccount) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT, newAccDepGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getAssetGlAccount() {
		return (GlAccount)eGet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetGlAccount(GlAccount newAssetGlAccount) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT, newAssetGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getDepGlAccount() {
		return (GlAccount)eGet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepGlAccount(GlAccount newDepGlAccount) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT, newDepGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getLossGlAccount() {
		return (GlAccount)eGet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLossGlAccount(GlAccount newLossGlAccount) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT, newLossGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getProfitGlAccount() {
		return (GlAccount)eGet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfitGlAccount(GlAccount newProfitGlAccount) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT, newProfitGlAccount);
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
				case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FixedAssetTypeGlAccountImpl
