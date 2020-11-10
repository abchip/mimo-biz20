/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountCategoryMember;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountGroupMember;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountOrganization;
import org.abchip.mimo.biz.model.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.model.accounting.ledger.GlBudgetXref;
import org.abchip.mimo.biz.model.accounting.ledger.GlResourceType;
import org.abchip.mimo.biz.model.accounting.ledger.GlXbrlClass;
import org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gl Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getAccountCode <em>Account Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getAccountName <em>Account Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlAccountCategoryMembers <em>Gl Account Category Members</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlAccountClass <em>Gl Account Class</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlAccountGroupMembers <em>Gl Account Group Members</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlAccountOrganizations <em>Gl Account Organizations</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlAccountType <em>Gl Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlBudgetXrefs <em>Gl Budget Xrefs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlResourceType <em>Gl Resource Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getGlXbrlClass <em>Gl Xbrl Class</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getParentGlAccount <em>Parent Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.impl.GlAccountImpl#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlAccountImpl extends EntityTypedImpl<GlAccountType> implements GlAccount {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.GL_ACCOUNT;
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
	public String getAccountCode() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountCode(String newAccountCode) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_CODE, newAccountCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountName() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountName(String newAccountName) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__ACCOUNT_NAME, newAccountName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__EXTERNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<GlAccountCategoryMember> getGlAccountCategoryMembers() {
		return (List<GlAccountCategoryMember>)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_CATEGORY_MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountClass getGlAccountClass() {
		return (GlAccountClass)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountClass(GlAccountClass newGlAccountClass) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_CLASS, newGlAccountClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__PRODUCT_ID, newProductId);
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
				case LedgerPackage.GL_ACCOUNT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case LedgerPackage.GL_ACCOUNT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case LedgerPackage.GL_ACCOUNT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case LedgerPackage.GL_ACCOUNT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return LedgerPackage.GL_ACCOUNT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return LedgerPackage.GL_ACCOUNT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return LedgerPackage.GL_ACCOUNT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return LedgerPackage.GL_ACCOUNT__LAST_UPDATED_TX_STAMP;
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
	@SuppressWarnings("unchecked")
	@Override
	public List<GlBudgetXref> getGlBudgetXrefs() {
		return (List<GlBudgetXref>)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_BUDGET_XREFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlResourceType getGlResourceType() {
		return (GlResourceType)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_RESOURCE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlResourceType(GlResourceType newGlResourceType) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_RESOURCE_TYPE, newGlResourceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlXbrlClass getGlXbrlClass() {
		return (GlXbrlClass)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_XBRL_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlXbrlClass(GlXbrlClass newGlXbrlClass) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_XBRL_CLASS, newGlXbrlClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getParentGlAccount() {
		return (GlAccount)eGet(LedgerPackage.Literals.GL_ACCOUNT__PARENT_GL_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentGlAccount(GlAccount newParentGlAccount) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__PARENT_GL_ACCOUNT, newParentGlAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<GlAccountGroupMember> getGlAccountGroupMembers() {
		return (List<GlAccountGroupMember>)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<GlAccountOrganization> getGlAccountOrganizations() {
		return (List<GlAccountOrganization>)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getGlAccountType() {
		return (GlAccountType)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountType(GlAccountType newGlAccountType) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_TYPE, newGlAccountType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountId() {
		return (String)eGet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(String newGlAccountId) {
		eSet(LedgerPackage.Literals.GL_ACCOUNT__GL_ACCOUNT_ID, newGlAccountId);
	}

} //GlAccountImpl
