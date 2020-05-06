/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.content.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.content.content.ContentPackage;
import org.abchip.mimo.biz.model.content.content.ContentSearchConstraint;
import org.abchip.mimo.biz.model.content.content.ContentSearchResult;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Search Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getContentSearchResultId <em>Content Search Result Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getContentSearchConstraints <em>Content Search Constraints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getIsAscending <em>Is Ascending</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getNumResults <em>Num Results</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getOrderByName <em>Order By Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getSearchDate <em>Search Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getSecondsTotal <em>Seconds Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.impl.ContentSearchResultImpl#getVisitId <em>Visit Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentSearchResultImpl extends EntityIdentifiableImpl implements ContentSearchResult {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentSearchResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_SEARCH_RESULT;
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
	public String getContentSearchResultId() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentSearchResultId(String newContentSearchResultId) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_RESULT_ID, newContentSearchResultId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContentSearchConstraint> getContentSearchConstraints() {
		return (List<ContentSearchConstraint>)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__CONTENT_SEARCH_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsAscending() {
		return (Boolean)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__IS_ASCENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAscending(Boolean newIsAscending) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__IS_ASCENDING, newIsAscending);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumResults() {
		return (Long)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__NUM_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumResults(long newNumResults) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__NUM_RESULTS, newNumResults);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderByName() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__ORDER_BY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderByName(String newOrderByName) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__ORDER_BY_NAME, newOrderByName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSearchDate() {
		return (Date)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__SEARCH_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchDate(Date newSearchDate) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__SEARCH_DATE, newSearchDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSecondsTotal() {
		return (Double)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__SECONDS_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondsTotal(double newSecondsTotal) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__SECONDS_TOTAL, newSecondsTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return (String)eGet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		eSet(ContentPackage.Literals.CONTENT_SEARCH_RESULT__VISIT_ID, newVisitId);
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
				case ContentPackage.CONTENT_SEARCH_RESULT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case ContentPackage.CONTENT_SEARCH_RESULT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case ContentPackage.CONTENT_SEARCH_RESULT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case ContentPackage.CONTENT_SEARCH_RESULT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return ContentPackage.CONTENT_SEARCH_RESULT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return ContentPackage.CONTENT_SEARCH_RESULT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return ContentPackage.CONTENT_SEARCH_RESULT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return ContentPackage.CONTENT_SEARCH_RESULT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ContentSearchResultImpl
