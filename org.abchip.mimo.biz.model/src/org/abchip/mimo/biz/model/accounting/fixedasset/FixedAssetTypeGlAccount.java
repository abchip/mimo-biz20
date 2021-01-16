/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset;

import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset Type Gl Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetType <em>Fixed Asset Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getAccDepGlAccount <em>Acc Dep Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getAssetGlAccount <em>Asset Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getDepGlAccount <em>Dep Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getLossGlAccount <em>Loss Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getProfitGlAccount <em>Profit Gl Account</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount()
 * @model annotation="mimo-ent-frame title='Gl Account Mapping For Fixed Asset Or Fixed Asset Types'"
 * @generated
 */
public interface FixedAssetTypeGlAccount extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Fixed Asset Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type</em>' reference.
	 * @see #setFixedAssetType(FixedAssetType)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_FixedAssetType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='The fixed asset type for the mappings. This field can be set to _NA_ in order to define a mapping for all types or for a specific asset (specified by the id in the fixedAssetId field).'"
	 * @generated
	 */
	FixedAssetType getFixedAssetType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetType <em>Fixed Asset Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Type</em>' reference.
	 * @see #getFixedAssetType()
	 * @generated
	 */
	void setFixedAssetType(FixedAssetType value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset</em>' reference.
	 * @see #setFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_FixedAsset()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='The fixed asset id for the mappings. This field can be set to _NA_ in order to define a mapping for all assets of a given type (specified by the id in the fixedAssetTypeId field).'"
	 * @generated
	 */
	FixedAsset getFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAsset <em>Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset</em>' reference.
	 * @see #getFixedAsset()
	 * @generated
	 */
	void setFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_OrganizationParty()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Acc Dep Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acc Dep Gl Account</em>' reference.
	 * @see #setAccDepGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_AccDepGlAccount()
	 * @model annotation="mimo-ent-slot help='The (credit) account for the accumulated depreciation'"
	 * @generated
	 */
	GlAccount getAccDepGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getAccDepGlAccount <em>Acc Dep Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acc Dep Gl Account</em>' reference.
	 * @see #getAccDepGlAccount()
	 * @generated
	 */
	void setAccDepGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Asset Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Gl Account</em>' reference.
	 * @see #setAssetGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_AssetGlAccount()
	 * @model annotation="mimo-ent-slot help='The (debit) account for the initial asset value (purchase cost)'"
	 * @generated
	 */
	GlAccount getAssetGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getAssetGlAccount <em>Asset Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Gl Account</em>' reference.
	 * @see #getAssetGlAccount()
	 * @generated
	 */
	void setAssetGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Dep Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep Gl Account</em>' reference.
	 * @see #setDepGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_DepGlAccount()
	 * @model annotation="mimo-ent-slot help='The (debit) account for the depreciation expense (matches the accDepGlAccountId)'"
	 * @generated
	 */
	GlAccount getDepGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getDepGlAccount <em>Dep Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep Gl Account</em>' reference.
	 * @see #getDepGlAccount()
	 * @generated
	 */
	void setDepGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Loss Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss Gl Account</em>' reference.
	 * @see #setLossGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_LossGlAccount()
	 * @model annotation="mimo-ent-slot help='The (debit) account for the eventual loss derived from the sale of the asset'"
	 * @generated
	 */
	GlAccount getLossGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getLossGlAccount <em>Loss Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Gl Account</em>' reference.
	 * @see #getLossGlAccount()
	 * @generated
	 */
	void setLossGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Profit Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profit Gl Account</em>' reference.
	 * @see #setProfitGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_ProfitGlAccount()
	 * @model annotation="mimo-ent-slot help='The (credit) account for the eventual profit derived from the sale of the asset'"
	 * @generated
	 */
	GlAccount getProfitGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetTypeGlAccount#getProfitGlAccount <em>Profit Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profit Gl Account</em>' reference.
	 * @see #getProfitGlAccount()
	 * @generated
	 */
	void setProfitGlAccount(GlAccount value);

} // FixedAssetTypeGlAccount
