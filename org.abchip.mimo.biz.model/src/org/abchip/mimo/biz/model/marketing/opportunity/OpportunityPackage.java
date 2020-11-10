/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.opportunity;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.marketing.opportunity.OpportunityFactory
 * @model kind="package"
 * @generated
 */
public interface OpportunityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opportunity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/marketing/opportunity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-opportunity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpportunityPackage eINSTANCE = org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastImpl <em>Sales Forecast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecast()
	 * @generated
	 */
	int SALES_FORECAST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Forecast Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__SALES_FORECAST_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Best Case Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__BEST_CASE_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Closed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CLOSED_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CURRENCY_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Custom Time Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CUSTOM_TIME_PERIOD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Forecast Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__FORECAST_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Internal Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__INTERNAL_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__ORGANIZATION_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Parent Sales Forecast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__PARENT_SALES_FORECAST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Percent Of Quota Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Percent Of Quota Forecast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pipeline Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__PIPELINE_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Quota Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__QUOTA_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Sales Forecast Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__SALES_FORECAST_DETAILS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Sales Forecast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastDetailImpl <em>Sales Forecast Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastDetailImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecastDetail()
	 * @generated
	 */
	int SALES_FORECAST_DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Forecast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__SALES_FORECAST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sales Forecast Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__PRODUCT_CATEGORY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Quantity Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__QUANTITY_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Sales Forecast Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl <em>Sales Forecast History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecastHistory()
	 * @generated
	 */
	int SALES_FORECAST_HISTORY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Forecast History Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Best Case Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Change Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CHANGE_NOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Closed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CLOSED_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CURRENCY_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Custom Time Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Forecast Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__FORECAST_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Internal Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__INTERNAL_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Modified Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__ORGANIZATION_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Parent Sales Forecast Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Percent Of Quota Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Percent Of Quota Forecast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Quota Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__QUOTA_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Sales Forecast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__SALES_FORECAST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Sales Forecast History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl <em>Sales Opportunity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunity()
	 * @generated
	 */
	int SALES_OPPORTUNITY = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__CURRENCY_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__DATA_SOURCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Estimated Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__ESTIMATED_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Estimated Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Estimated Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__ESTIMATED_PROBABILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__MARKETING_CAMPAIGN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__NEXT_STEP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Next Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__NEXT_STEP_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Opportunity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__OPPORTUNITY_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Opportunity Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__OPPORTUNITY_STAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Competitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Quotes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Trck Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Work Efforts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__TYPE_ENUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Sales Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl <em>Sales Opportunity Competitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityCompetitor()
	 * @generated
	 */
	int SALES_OPPORTUNITY_COMPETITOR = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Competitor Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Position Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Strengths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__STRENGTHS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Weaknesses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Competitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityHistoryImpl <em>Sales Opportunity History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityHistoryImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityHistory()
	 * @generated
	 */
	int SALES_OPPORTUNITY_HISTORY = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Opportunity History Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Change Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Estimated Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Estimated Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Estimated Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Modified Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__NEXT_STEP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Opportunity Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Sales Opportunity History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityQuoteImpl <em>Sales Opportunity Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityQuoteImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityQuote()
	 * @generated
	 */
	int SALES_OPPORTUNITY_QUOTE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__QUOTE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityRoleImpl <em>Sales Opportunity Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityRoleImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityRole()
	 * @generated
	 */
	int SALES_OPPORTUNITY_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__SALES_OPPORTUNITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityStageImpl <em>Sales Opportunity Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityStageImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityStage()
	 * @generated
	 */
	int SALES_OPPORTUNITY_STAGE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opportunity Stage Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__OPPORTUNITY_STAGE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__DEFAULT_PROBABILITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__SEQUENCE_NUM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl <em>Sales Opportunity Trck Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityTrckCode()
	 * @generated
	 */
	int SALES_OPPORTUNITY_TRCK_CODE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tracking Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Received Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Trck Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl <em>Sales Opportunity Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityWorkEffort()
	 * @generated
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast <em>Sales Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Forecast</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast
	 * @generated
	 */
	EClass getSalesForecast();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getSalesForecastId <em>Sales Forecast Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Forecast Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getSalesForecastId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_SalesForecastId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getBestCaseAmount <em>Best Case Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Case Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getBestCaseAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_BestCaseAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getClosedAmount <em>Closed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getClosedAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_ClosedAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCreatedByUserLogin()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_CreatedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCurrencyUom()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_CurrencyUom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCustomTimePeriod <em>Custom Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Time Period</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getCustomTimePeriod()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_CustomTimePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getForecastAmount <em>Forecast Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forecast Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getForecastAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_ForecastAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getInternalParty <em>Internal Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Party</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getInternalParty()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_InternalParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getModifiedByUserLogin <em>Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getModifiedByUserLogin()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_ModifiedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getOrganizationParty <em>Organization Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getOrganizationParty()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_OrganizationParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getParentSalesForecast <em>Parent Sales Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Sales Forecast</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getParentSalesForecast()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_ParentSalesForecast();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Quota Closed</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPercentOfQuotaClosed()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_PercentOfQuotaClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Quota Forecast</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPercentOfQuotaForecast()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_PercentOfQuotaForecast();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPipelineAmount <em>Pipeline Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pipeline Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getPipelineAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_PipelineAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getQuotaAmount <em>Quota Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getQuotaAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_QuotaAmount();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getSalesForecastDetails <em>Sales Forecast Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Forecast Details</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecast#getSalesForecastDetails()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_SalesForecastDetails();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail <em>Sales Forecast Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Forecast Detail</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail
	 * @generated
	 */
	EClass getSalesForecastDetail();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getSalesForecast <em>Sales Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Forecast</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getSalesForecast()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EReference getSalesForecastDetail_SalesForecast();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getSalesForecastDetailId <em>Sales Forecast Detail Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Forecast Detail Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getSalesForecastDetailId()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EAttribute getSalesForecastDetail_SalesForecastDetailId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getAmount()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EAttribute getSalesForecastDetail_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getProduct()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EReference getSalesForecastDetail_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getProductCategory()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EReference getSalesForecastDetail_ProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getQuantity()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EAttribute getSalesForecastDetail_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getQuantityUom <em>Quantity Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Uom</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastDetail#getQuantityUom()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EReference getSalesForecastDetail_QuantityUom();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory <em>Sales Forecast History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Forecast History</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory
	 * @generated
	 */
	EClass getSalesForecastHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getSalesForecastHistoryId <em>Sales Forecast History Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Forecast History Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getSalesForecastHistoryId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_SalesForecastHistoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getBestCaseAmount <em>Best Case Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Case Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getBestCaseAmount()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_BestCaseAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getChangeNote <em>Change Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Note</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getChangeNote()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ChangeNote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getClosedAmount <em>Closed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getClosedAmount()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ClosedAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getCurrencyUom()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_CurrencyUom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getCustomTimePeriod <em>Custom Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Time Period</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getCustomTimePeriod()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_CustomTimePeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getForecastAmount <em>Forecast Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forecast Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getForecastAmount()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ForecastAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getInternalParty <em>Internal Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Party</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getInternalParty()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_InternalParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getModifiedByUserLogin <em>Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getModifiedByUserLogin()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_ModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getModifiedTimestamp <em>Modified Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Timestamp</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getModifiedTimestamp()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ModifiedTimestamp();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getOrganizationParty <em>Organization Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getOrganizationParty()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_OrganizationParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Sales Forecast Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getParentSalesForecastId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ParentSalesForecastId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Quota Closed</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaClosed()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_PercentOfQuotaClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Quota Forecast</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaForecast()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_PercentOfQuotaForecast();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getQuotaAmount <em>Quota Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getQuotaAmount()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_QuotaAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getSalesForecast <em>Sales Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Forecast</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesForecastHistory#getSalesForecast()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_SalesForecast();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity
	 * @generated
	 */
	EClass getSalesOpportunity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityId()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_SalesOpportunityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getCreatedByUserLogin()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_CreatedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getCurrencyUom()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getDataSourceId <em>Data Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getDataSourceId()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_DataSourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getDescription()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedAmount <em>Estimated Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedAmount()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_EstimatedAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedCloseDate <em>Estimated Close Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Close Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedCloseDate()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_EstimatedCloseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedProbability <em>Estimated Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Probability</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getEstimatedProbability()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_EstimatedProbability();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getMarketingCampaign <em>Marketing Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getMarketingCampaign()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_MarketingCampaign();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Step</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getNextStep()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_NextStep();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getNextStepDate <em>Next Step Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Step Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getNextStepDate()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_NextStepDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getOpportunityName <em>Opportunity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opportunity Name</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getOpportunityName()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_OpportunityName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getOpportunityStage <em>Opportunity Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opportunity Stage</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getOpportunityStage()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_OpportunityStage();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityCompetitors <em>Sales Opportunity Competitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Opportunity Competitors</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityCompetitors()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_SalesOpportunityCompetitors();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityQuotes <em>Sales Opportunity Quotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Opportunity Quotes</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityQuotes()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_SalesOpportunityQuotes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityTrckCodes <em>Sales Opportunity Trck Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Opportunity Trck Codes</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityTrckCodes()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_SalesOpportunityTrckCodes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityWorkEfforts <em>Sales Opportunity Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Opportunity Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getSalesOpportunityWorkEfforts()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_SalesOpportunityWorkEfforts();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getTypeEnum <em>Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Enum</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunity#getTypeEnum()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_TypeEnum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor <em>Sales Opportunity Competitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Competitor</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor
	 * @generated
	 */
	EClass getSalesOpportunityCompetitor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getSalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getSalesOpportunity()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EReference getSalesOpportunityCompetitor_SalesOpportunity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getCompetitorPartyId <em>Competitor Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Competitor Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getCompetitorPartyId()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EAttribute getSalesOpportunityCompetitor_CompetitorPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getPositionEnumId <em>Position Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Enum Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getPositionEnumId()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EAttribute getSalesOpportunityCompetitor_PositionEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getStrengths <em>Strengths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strengths</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getStrengths()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EAttribute getSalesOpportunityCompetitor_Strengths();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getWeaknesses <em>Weaknesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weaknesses</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityCompetitor#getWeaknesses()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EAttribute getSalesOpportunityCompetitor_Weaknesses();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory <em>Sales Opportunity History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity History</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory
	 * @generated
	 */
	EClass getSalesOpportunityHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunityHistoryId <em>Sales Opportunity History Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Opportunity History Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunityHistoryId()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_SalesOpportunityHistoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getChangeNote <em>Change Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Note</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getChangeNote()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_ChangeNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getCurrencyUom()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EReference getSalesOpportunityHistory_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getDescription()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedAmount <em>Estimated Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Amount</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedAmount()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_EstimatedAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedCloseDate <em>Estimated Close Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Close Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedCloseDate()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_EstimatedCloseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedProbability <em>Estimated Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Probability</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getEstimatedProbability()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_EstimatedProbability();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getModifiedByUserLogin <em>Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getModifiedByUserLogin()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EReference getSalesOpportunityHistory_ModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getModifiedTimestamp <em>Modified Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Timestamp</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getModifiedTimestamp()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_ModifiedTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Step</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getNextStep()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_NextStep();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getOpportunityStage <em>Opportunity Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opportunity Stage</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getOpportunityStage()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EReference getSalesOpportunityHistory_OpportunityStage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunity()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EReference getSalesOpportunityHistory_SalesOpportunity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote <em>Sales Opportunity Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Quote</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote
	 * @generated
	 */
	EClass getSalesOpportunityQuote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote#getSalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote#getSalesOpportunity()
	 * @see #getSalesOpportunityQuote()
	 * @generated
	 */
	EReference getSalesOpportunityQuote_SalesOpportunity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote#getQuote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityQuote#getQuote()
	 * @see #getSalesOpportunityQuote()
	 * @generated
	 */
	EReference getSalesOpportunityQuote_Quote();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole <em>Sales Opportunity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Role</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole
	 * @generated
	 */
	EClass getSalesOpportunityRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole#getSalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole#getSalesOpportunity()
	 * @see #getSalesOpportunityRole()
	 * @generated
	 */
	EReference getSalesOpportunityRole_SalesOpportunity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole#getParty()
	 * @see #getSalesOpportunityRole()
	 * @generated
	 */
	EReference getSalesOpportunityRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityRole#getRoleType()
	 * @see #getSalesOpportunityRole()
	 * @generated
	 */
	EReference getSalesOpportunityRole_RoleType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage <em>Sales Opportunity Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Stage</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage
	 * @generated
	 */
	EClass getSalesOpportunityStage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage#getOpportunityStageId <em>Opportunity Stage Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opportunity Stage Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage#getOpportunityStageId()
	 * @see #getSalesOpportunityStage()
	 * @generated
	 */
	EAttribute getSalesOpportunityStage_OpportunityStageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage#getDefaultProbability <em>Default Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Probability</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage#getDefaultProbability()
	 * @see #getSalesOpportunityStage()
	 * @generated
	 */
	EAttribute getSalesOpportunityStage_DefaultProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage#getDescription()
	 * @see #getSalesOpportunityStage()
	 * @generated
	 */
	EAttribute getSalesOpportunityStage_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityStage#getSequenceNum()
	 * @see #getSalesOpportunityStage()
	 * @generated
	 */
	EAttribute getSalesOpportunityStage_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode <em>Sales Opportunity Trck Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Trck Code</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode
	 * @generated
	 */
	EClass getSalesOpportunityTrckCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getSalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getSalesOpportunity()
	 * @see #getSalesOpportunityTrckCode()
	 * @generated
	 */
	EReference getSalesOpportunityTrckCode_SalesOpportunity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getTrackingCodeId <em>Tracking Code Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Code Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getTrackingCodeId()
	 * @see #getSalesOpportunityTrckCode()
	 * @generated
	 */
	EAttribute getSalesOpportunityTrckCode_TrackingCodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getReceivedDate <em>Received Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityTrckCode#getReceivedDate()
	 * @see #getSalesOpportunityTrckCode()
	 * @generated
	 */
	EAttribute getSalesOpportunityTrckCode_ReceivedDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort <em>Sales Opportunity Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort
	 * @generated
	 */
	EClass getSalesOpportunityWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort#getSalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort#getSalesOpportunity()
	 * @see #getSalesOpportunityWorkEffort()
	 * @generated
	 */
	EReference getSalesOpportunityWorkEffort_SalesOpportunity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.opportunity.SalesOpportunityWorkEffort#getWorkEffort()
	 * @see #getSalesOpportunityWorkEffort()
	 * @generated
	 */
	EReference getSalesOpportunityWorkEffort_WorkEffort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpportunityFactory getOpportunityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastImpl <em>Sales Forecast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecast()
		 * @generated
		 */
		EClass SALES_FORECAST = eINSTANCE.getSalesForecast();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__SALES_FORECAST_ID = eINSTANCE.getSalesForecast_SalesForecastId();

		/**
		 * The meta object literal for the '<em><b>Best Case Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__BEST_CASE_AMOUNT = eINSTANCE.getSalesForecast_BestCaseAmount();

		/**
		 * The meta object literal for the '<em><b>Closed Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__CLOSED_AMOUNT = eINSTANCE.getSalesForecast_ClosedAmount();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__CREATED_BY_USER_LOGIN = eINSTANCE.getSalesForecast_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__CURRENCY_UOM = eINSTANCE.getSalesForecast_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Custom Time Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__CUSTOM_TIME_PERIOD = eINSTANCE.getSalesForecast_CustomTimePeriod();

		/**
		 * The meta object literal for the '<em><b>Forecast Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__FORECAST_AMOUNT = eINSTANCE.getSalesForecast_ForecastAmount();

		/**
		 * The meta object literal for the '<em><b>Internal Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__INTERNAL_PARTY = eINSTANCE.getSalesForecast_InternalParty();

		/**
		 * The meta object literal for the '<em><b>Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__MODIFIED_BY_USER_LOGIN = eINSTANCE.getSalesForecast_ModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Organization Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__ORGANIZATION_PARTY = eINSTANCE.getSalesForecast_OrganizationParty();

		/**
		 * The meta object literal for the '<em><b>Parent Sales Forecast</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__PARENT_SALES_FORECAST = eINSTANCE.getSalesForecast_ParentSalesForecast();

		/**
		 * The meta object literal for the '<em><b>Percent Of Quota Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED = eINSTANCE.getSalesForecast_PercentOfQuotaClosed();

		/**
		 * The meta object literal for the '<em><b>Percent Of Quota Forecast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST = eINSTANCE.getSalesForecast_PercentOfQuotaForecast();

		/**
		 * The meta object literal for the '<em><b>Pipeline Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__PIPELINE_AMOUNT = eINSTANCE.getSalesForecast_PipelineAmount();

		/**
		 * The meta object literal for the '<em><b>Quota Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__QUOTA_AMOUNT = eINSTANCE.getSalesForecast_QuotaAmount();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__SALES_FORECAST_DETAILS = eINSTANCE.getSalesForecast_SalesForecastDetails();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastDetailImpl <em>Sales Forecast Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastDetailImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecastDetail()
		 * @generated
		 */
		EClass SALES_FORECAST_DETAIL = eINSTANCE.getSalesForecastDetail();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_DETAIL__SALES_FORECAST = eINSTANCE.getSalesForecastDetail_SalesForecast();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Detail Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID = eINSTANCE.getSalesForecastDetail_SalesForecastDetailId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_DETAIL__AMOUNT = eINSTANCE.getSalesForecastDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_DETAIL__PRODUCT = eINSTANCE.getSalesForecastDetail_Product();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_DETAIL__PRODUCT_CATEGORY = eINSTANCE.getSalesForecastDetail_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_DETAIL__QUANTITY = eINSTANCE.getSalesForecastDetail_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quantity Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_DETAIL__QUANTITY_UOM = eINSTANCE.getSalesForecastDetail_QuantityUom();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl <em>Sales Forecast History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesForecastHistoryImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecastHistory()
		 * @generated
		 */
		EClass SALES_FORECAST_HISTORY = eINSTANCE.getSalesForecastHistory();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast History Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID = eINSTANCE.getSalesForecastHistory_SalesForecastHistoryId();

		/**
		 * The meta object literal for the '<em><b>Best Case Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT = eINSTANCE.getSalesForecastHistory_BestCaseAmount();

		/**
		 * The meta object literal for the '<em><b>Change Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__CHANGE_NOTE = eINSTANCE.getSalesForecastHistory_ChangeNote();

		/**
		 * The meta object literal for the '<em><b>Closed Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__CLOSED_AMOUNT = eINSTANCE.getSalesForecastHistory_ClosedAmount();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__CURRENCY_UOM = eINSTANCE.getSalesForecastHistory_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Custom Time Period</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD = eINSTANCE.getSalesForecastHistory_CustomTimePeriod();

		/**
		 * The meta object literal for the '<em><b>Forecast Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__FORECAST_AMOUNT = eINSTANCE.getSalesForecastHistory_ForecastAmount();

		/**
		 * The meta object literal for the '<em><b>Internal Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__INTERNAL_PARTY = eINSTANCE.getSalesForecastHistory_InternalParty();

		/**
		 * The meta object literal for the '<em><b>Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN = eINSTANCE.getSalesForecastHistory_ModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Modified Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP = eINSTANCE.getSalesForecastHistory_ModifiedTimestamp();

		/**
		 * The meta object literal for the '<em><b>Organization Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__ORGANIZATION_PARTY = eINSTANCE.getSalesForecastHistory_OrganizationParty();

		/**
		 * The meta object literal for the '<em><b>Parent Sales Forecast Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID = eINSTANCE.getSalesForecastHistory_ParentSalesForecastId();

		/**
		 * The meta object literal for the '<em><b>Percent Of Quota Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED = eINSTANCE.getSalesForecastHistory_PercentOfQuotaClosed();

		/**
		 * The meta object literal for the '<em><b>Percent Of Quota Forecast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST = eINSTANCE.getSalesForecastHistory_PercentOfQuotaForecast();

		/**
		 * The meta object literal for the '<em><b>Quota Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__QUOTA_AMOUNT = eINSTANCE.getSalesForecastHistory_QuotaAmount();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__SALES_FORECAST = eINSTANCE.getSalesForecastHistory_SalesForecast();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl <em>Sales Opportunity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunity()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY = eINSTANCE.getSalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID = eINSTANCE.getSalesOpportunity_SalesOpportunityId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN = eINSTANCE.getSalesOpportunity_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__CURRENCY_UOM = eINSTANCE.getSalesOpportunity_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Data Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__DATA_SOURCE_ID = eINSTANCE.getSalesOpportunity_DataSourceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__DESCRIPTION = eINSTANCE.getSalesOpportunity_Description();

		/**
		 * The meta object literal for the '<em><b>Estimated Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__ESTIMATED_AMOUNT = eINSTANCE.getSalesOpportunity_EstimatedAmount();

		/**
		 * The meta object literal for the '<em><b>Estimated Close Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE = eINSTANCE.getSalesOpportunity_EstimatedCloseDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__ESTIMATED_PROBABILITY = eINSTANCE.getSalesOpportunity_EstimatedProbability();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__MARKETING_CAMPAIGN = eINSTANCE.getSalesOpportunity_MarketingCampaign();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__NEXT_STEP = eINSTANCE.getSalesOpportunity_NextStep();

		/**
		 * The meta object literal for the '<em><b>Next Step Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__NEXT_STEP_DATE = eINSTANCE.getSalesOpportunity_NextStepDate();

		/**
		 * The meta object literal for the '<em><b>Opportunity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__OPPORTUNITY_NAME = eINSTANCE.getSalesOpportunity_OpportunityName();

		/**
		 * The meta object literal for the '<em><b>Opportunity Stage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__OPPORTUNITY_STAGE = eINSTANCE.getSalesOpportunity_OpportunityStage();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Competitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS = eINSTANCE.getSalesOpportunity_SalesOpportunityCompetitors();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Quotes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES = eINSTANCE.getSalesOpportunity_SalesOpportunityQuotes();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Trck Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES = eINSTANCE.getSalesOpportunity_SalesOpportunityTrckCodes();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Work Efforts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS = eINSTANCE.getSalesOpportunity_SalesOpportunityWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Type Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__TYPE_ENUM = eINSTANCE.getSalesOpportunity_TypeEnum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl <em>Sales Opportunity Competitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityCompetitorImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityCompetitor()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_COMPETITOR = eINSTANCE.getSalesOpportunityCompetitor();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY = eINSTANCE.getSalesOpportunityCompetitor_SalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Competitor Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID = eINSTANCE.getSalesOpportunityCompetitor_CompetitorPartyId();

		/**
		 * The meta object literal for the '<em><b>Position Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID = eINSTANCE.getSalesOpportunityCompetitor_PositionEnumId();

		/**
		 * The meta object literal for the '<em><b>Strengths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_COMPETITOR__STRENGTHS = eINSTANCE.getSalesOpportunityCompetitor_Strengths();

		/**
		 * The meta object literal for the '<em><b>Weaknesses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES = eINSTANCE.getSalesOpportunityCompetitor_Weaknesses();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityHistoryImpl <em>Sales Opportunity History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityHistoryImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityHistory()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_HISTORY = eINSTANCE.getSalesOpportunityHistory();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity History Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID = eINSTANCE.getSalesOpportunityHistory_SalesOpportunityHistoryId();

		/**
		 * The meta object literal for the '<em><b>Change Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE = eINSTANCE.getSalesOpportunityHistory_ChangeNote();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM = eINSTANCE.getSalesOpportunityHistory_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__DESCRIPTION = eINSTANCE.getSalesOpportunityHistory_Description();

		/**
		 * The meta object literal for the '<em><b>Estimated Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT = eINSTANCE.getSalesOpportunityHistory_EstimatedAmount();

		/**
		 * The meta object literal for the '<em><b>Estimated Close Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE = eINSTANCE.getSalesOpportunityHistory_EstimatedCloseDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY = eINSTANCE.getSalesOpportunityHistory_EstimatedProbability();

		/**
		 * The meta object literal for the '<em><b>Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN = eINSTANCE.getSalesOpportunityHistory_ModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Modified Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP = eINSTANCE.getSalesOpportunityHistory_ModifiedTimestamp();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__NEXT_STEP = eINSTANCE.getSalesOpportunityHistory_NextStep();

		/**
		 * The meta object literal for the '<em><b>Opportunity Stage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE = eINSTANCE.getSalesOpportunityHistory_OpportunityStage();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY = eINSTANCE.getSalesOpportunityHistory_SalesOpportunity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityQuoteImpl <em>Sales Opportunity Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityQuoteImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityQuote()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_QUOTE = eINSTANCE.getSalesOpportunityQuote();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY = eINSTANCE.getSalesOpportunityQuote_SalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Quote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_QUOTE__QUOTE = eINSTANCE.getSalesOpportunityQuote_Quote();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityRoleImpl <em>Sales Opportunity Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityRoleImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityRole()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_ROLE = eINSTANCE.getSalesOpportunityRole();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_ROLE__SALES_OPPORTUNITY = eINSTANCE.getSalesOpportunityRole_SalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_ROLE__PARTY = eINSTANCE.getSalesOpportunityRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_ROLE__ROLE_TYPE = eINSTANCE.getSalesOpportunityRole_RoleType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityStageImpl <em>Sales Opportunity Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityStageImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityStage()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_STAGE = eINSTANCE.getSalesOpportunityStage();

		/**
		 * The meta object literal for the '<em><b>Opportunity Stage Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_STAGE__OPPORTUNITY_STAGE_ID = eINSTANCE.getSalesOpportunityStage_OpportunityStageId();

		/**
		 * The meta object literal for the '<em><b>Default Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_STAGE__DEFAULT_PROBABILITY = eINSTANCE.getSalesOpportunityStage_DefaultProbability();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_STAGE__DESCRIPTION = eINSTANCE.getSalesOpportunityStage_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_STAGE__SEQUENCE_NUM = eINSTANCE.getSalesOpportunityStage_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl <em>Sales Opportunity Trck Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityTrckCode()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_TRCK_CODE = eINSTANCE.getSalesOpportunityTrckCode();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY = eINSTANCE.getSalesOpportunityTrckCode_SalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID = eINSTANCE.getSalesOpportunityTrckCode_TrackingCodeId();

		/**
		 * The meta object literal for the '<em><b>Received Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE = eINSTANCE.getSalesOpportunityTrckCode_ReceivedDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl <em>Sales Opportunity Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl
		 * @see org.abchip.mimo.biz.model.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityWorkEffort()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_WORK_EFFORT = eINSTANCE.getSalesOpportunityWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY = eINSTANCE.getSalesOpportunityWorkEffort_SalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT = eINSTANCE.getSalesOpportunityWorkEffort_WorkEffort();

	}

} //OpportunityPackage
