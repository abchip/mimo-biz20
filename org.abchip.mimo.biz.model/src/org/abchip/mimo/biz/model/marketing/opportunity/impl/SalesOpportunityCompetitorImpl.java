/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity Competitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getSalesOpportunity <em>Sales Opportunity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getCompetitorPartyId <em>Competitor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getPositionEnumId <em>Position Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getStrengths <em>Strengths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl#getWeaknesses <em>Weaknesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityCompetitorImpl extends EntityIdentifiableImpl implements SalesOpportunityCompetitor {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityCompetitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR;
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
	public SalesOpportunity getSalesOpportunity() {
		return (SalesOpportunity)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunity(SalesOpportunity newSalesOpportunity) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY, newSalesOpportunity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompetitorPartyId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompetitorPartyId(String newCompetitorPartyId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID, newCompetitorPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionEnumId() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionEnumId(String newPositionEnumId) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID, newPositionEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrengths() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrengths(String newStrengths) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__STRENGTHS, newStrengths);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeaknesses() {
		return (String)eGet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeaknesses(String newWeaknesses) {
		eSet(OpportunityPackage.Literals.SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES, newWeaknesses);
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
				case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return OpportunityPackage.SALES_OPPORTUNITY_COMPETITOR__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SalesOpportunityCompetitorImpl
