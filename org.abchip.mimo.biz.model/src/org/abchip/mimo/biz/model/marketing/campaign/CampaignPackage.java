/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.campaign;

import org.abchip.mimo.biz.BizPackage;
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
 * @see org.abchip.mimo.biz.model.marketing.campaign.CampaignFactory
 * @model kind="package"
 * @generated
 */
public interface CampaignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "campaign";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/marketing/campaign";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-campaign";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CampaignPackage eINSTANCE = org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl <em>Marketing Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaign()
	 * @generated
	 */
	int MARKETING_CAMPAIGN = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__ACTUAL_COST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Budgeted Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__BUDGETED_COST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Campaign Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CAMPAIGN_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Campaign Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Converted Leads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CONVERTED_LEADS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CURRENCY_UOM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__ESTIMATED_COST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Expected Response Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Expected Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__EXPECTED_REVENUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__IS_ACTIVE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Prices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_PRICES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Promos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_PROMOS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Num Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__NUM_SENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Parent Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__PARENT_CAMPAIGN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__START_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Marketing Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignNoteImpl <em>Marketing Campaign Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignNoteImpl
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignNote()
	 * @generated
	 */
	int MARKETING_CAMPAIGN_NOTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__MARKETING_CAMPAIGN = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marketing Campaign Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignPriceImpl <em>Marketing Campaign Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignPriceImpl
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignPrice()
	 * @generated
	 */
	int MARKETING_CAMPAIGN_PRICE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__MARKETING_CAMPAIGN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Price Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__PRODUCT_PRICE_RULE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Marketing Campaign Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignPromoImpl <em>Marketing Campaign Promo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignPromoImpl
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignPromo()
	 * @generated
	 */
	int MARKETING_CAMPAIGN_PROMO = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Marketing Campaign Promo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignRoleImpl <em>Marketing Campaign Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignRoleImpl
	 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignRole()
	 * @generated
	 */
	int MARKETING_CAMPAIGN_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__MARKETING_CAMPAIGN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__FROM_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__THRU_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Marketing Campaign Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign <em>Marketing Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign
	 * @generated
	 */
	EClass getMarketingCampaign();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getMarketingCampaignId <em>Marketing Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marketing Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getMarketingCampaignId()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_MarketingCampaignId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getActualCost <em>Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Cost</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getActualCost()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ActualCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getBudgetedCost <em>Budgeted Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budgeted Cost</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getBudgetedCost()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_BudgetedCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getCampaignName <em>Campaign Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Campaign Name</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getCampaignName()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_CampaignName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getCampaignSummary <em>Campaign Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Campaign Summary</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getCampaignSummary()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_CampaignSummary();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getConvertedLeads <em>Converted Leads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted Leads</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getConvertedLeads()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ConvertedLeads();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getCreatedByUserLogin()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_CreatedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getCurrencyUom()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getEstimatedCost <em>Estimated Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Cost</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getEstimatedCost()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_EstimatedCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getExpectedResponsePercent <em>Expected Response Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Response Percent</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getExpectedResponsePercent()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ExpectedResponsePercent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getExpectedRevenue <em>Expected Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Revenue</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getExpectedRevenue()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ExpectedRevenue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getFromDate()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#isIsActive()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getLastModifiedByUserLogin()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getMarketingCampaignNotes <em>Marketing Campaign Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Marketing Campaign Notes</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getMarketingCampaignNotes()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_MarketingCampaignNotes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getMarketingCampaignPrices <em>Marketing Campaign Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Marketing Campaign Prices</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getMarketingCampaignPrices()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_MarketingCampaignPrices();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getMarketingCampaignPromos <em>Marketing Campaign Promos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Marketing Campaign Promos</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getMarketingCampaignPromos()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_MarketingCampaignPromos();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getNumSent <em>Num Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Sent</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getNumSent()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_NumSent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getParentCampaign <em>Parent Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Campaign</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getParentCampaign()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_ParentCampaign();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getStartDate()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_StartDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getStatus()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaign#getThruDate()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignNote <em>Marketing Campaign Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign Note</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignNote
	 * @generated
	 */
	EClass getMarketingCampaignNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignNote#getMarketingCampaign <em>Marketing Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignNote#getMarketingCampaign()
	 * @see #getMarketingCampaignNote()
	 * @generated
	 */
	EReference getMarketingCampaignNote_MarketingCampaign();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice <em>Marketing Campaign Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign Price</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice
	 * @generated
	 */
	EClass getMarketingCampaignPrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice#getMarketingCampaign <em>Marketing Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice#getMarketingCampaign()
	 * @see #getMarketingCampaignPrice()
	 * @generated
	 */
	EReference getMarketingCampaignPrice_MarketingCampaign();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice#getProductPriceRule <em>Product Price Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Rule</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice#getProductPriceRule()
	 * @see #getMarketingCampaignPrice()
	 * @generated
	 */
	EReference getMarketingCampaignPrice_ProductPriceRule();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice#getFromDate()
	 * @see #getMarketingCampaignPrice()
	 * @generated
	 */
	EAttribute getMarketingCampaignPrice_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPrice#getThruDate()
	 * @see #getMarketingCampaignPrice()
	 * @generated
	 */
	EAttribute getMarketingCampaignPrice_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo <em>Marketing Campaign Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign Promo</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo
	 * @generated
	 */
	EClass getMarketingCampaignPromo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo#getMarketingCampaign <em>Marketing Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo#getMarketingCampaign()
	 * @see #getMarketingCampaignPromo()
	 * @generated
	 */
	EReference getMarketingCampaignPromo_MarketingCampaign();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo#getProductPromo <em>Product Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo#getProductPromo()
	 * @see #getMarketingCampaignPromo()
	 * @generated
	 */
	EReference getMarketingCampaignPromo_ProductPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo#getFromDate()
	 * @see #getMarketingCampaignPromo()
	 * @generated
	 */
	EAttribute getMarketingCampaignPromo_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignPromo#getThruDate()
	 * @see #getMarketingCampaignPromo()
	 * @generated
	 */
	EAttribute getMarketingCampaignPromo_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole <em>Marketing Campaign Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign Role</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole
	 * @generated
	 */
	EClass getMarketingCampaignRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getMarketingCampaign <em>Marketing Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getMarketingCampaign()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EReference getMarketingCampaignRole_MarketingCampaign();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getParty()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EReference getMarketingCampaignRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getRoleType()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EReference getMarketingCampaignRole_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getFromDate()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EAttribute getMarketingCampaignRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignRole#getThruDate()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EAttribute getMarketingCampaignRole_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CampaignFactory getCampaignFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl <em>Marketing Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignImpl
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaign()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN = eINSTANCE.getMarketingCampaign();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID = eINSTANCE.getMarketingCampaign_MarketingCampaignId();

		/**
		 * The meta object literal for the '<em><b>Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__ACTUAL_COST = eINSTANCE.getMarketingCampaign_ActualCost();

		/**
		 * The meta object literal for the '<em><b>Budgeted Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__BUDGETED_COST = eINSTANCE.getMarketingCampaign_BudgetedCost();

		/**
		 * The meta object literal for the '<em><b>Campaign Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__CAMPAIGN_NAME = eINSTANCE.getMarketingCampaign_CampaignName();

		/**
		 * The meta object literal for the '<em><b>Campaign Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY = eINSTANCE.getMarketingCampaign_CampaignSummary();

		/**
		 * The meta object literal for the '<em><b>Converted Leads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__CONVERTED_LEADS = eINSTANCE.getMarketingCampaign_ConvertedLeads();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN = eINSTANCE.getMarketingCampaign_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__CURRENCY_UOM = eINSTANCE.getMarketingCampaign_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Estimated Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__ESTIMATED_COST = eINSTANCE.getMarketingCampaign_EstimatedCost();

		/**
		 * The meta object literal for the '<em><b>Expected Response Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT = eINSTANCE.getMarketingCampaign_ExpectedResponsePercent();

		/**
		 * The meta object literal for the '<em><b>Expected Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__EXPECTED_REVENUE = eINSTANCE.getMarketingCampaign_ExpectedRevenue();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__FROM_DATE = eINSTANCE.getMarketingCampaign_FromDate();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__IS_ACTIVE = eINSTANCE.getMarketingCampaign_IsActive();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getMarketingCampaign_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES = eINSTANCE.getMarketingCampaign_MarketingCampaignNotes();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Prices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_PRICES = eINSTANCE.getMarketingCampaign_MarketingCampaignPrices();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Promos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_PROMOS = eINSTANCE.getMarketingCampaign_MarketingCampaignPromos();

		/**
		 * The meta object literal for the '<em><b>Num Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__NUM_SENT = eINSTANCE.getMarketingCampaign_NumSent();

		/**
		 * The meta object literal for the '<em><b>Parent Campaign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__PARENT_CAMPAIGN = eINSTANCE.getMarketingCampaign_ParentCampaign();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__START_DATE = eINSTANCE.getMarketingCampaign_StartDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__STATUS = eINSTANCE.getMarketingCampaign_Status();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__THRU_DATE = eINSTANCE.getMarketingCampaign_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignNoteImpl <em>Marketing Campaign Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignNoteImpl
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignNote()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN_NOTE = eINSTANCE.getMarketingCampaignNote();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_NOTE__MARKETING_CAMPAIGN = eINSTANCE.getMarketingCampaignNote_MarketingCampaign();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignPriceImpl <em>Marketing Campaign Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignPriceImpl
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignPrice()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN_PRICE = eINSTANCE.getMarketingCampaignPrice();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_PRICE__MARKETING_CAMPAIGN = eINSTANCE.getMarketingCampaignPrice_MarketingCampaign();

		/**
		 * The meta object literal for the '<em><b>Product Price Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_PRICE__PRODUCT_PRICE_RULE = eINSTANCE.getMarketingCampaignPrice_ProductPriceRule();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_PRICE__FROM_DATE = eINSTANCE.getMarketingCampaignPrice_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_PRICE__THRU_DATE = eINSTANCE.getMarketingCampaignPrice_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignPromoImpl <em>Marketing Campaign Promo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignPromoImpl
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignPromo()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN_PROMO = eINSTANCE.getMarketingCampaignPromo();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN = eINSTANCE.getMarketingCampaignPromo_MarketingCampaign();

		/**
		 * The meta object literal for the '<em><b>Product Promo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO = eINSTANCE.getMarketingCampaignPromo_ProductPromo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_PROMO__FROM_DATE = eINSTANCE.getMarketingCampaignPromo_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_PROMO__THRU_DATE = eINSTANCE.getMarketingCampaignPromo_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignRoleImpl <em>Marketing Campaign Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.MarketingCampaignRoleImpl
		 * @see org.abchip.mimo.biz.model.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignRole()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN_ROLE = eINSTANCE.getMarketingCampaignRole();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_ROLE__MARKETING_CAMPAIGN = eINSTANCE.getMarketingCampaignRole_MarketingCampaign();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_ROLE__PARTY = eINSTANCE.getMarketingCampaignRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_ROLE__ROLE_TYPE = eINSTANCE.getMarketingCampaignRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_ROLE__FROM_DATE = eINSTANCE.getMarketingCampaignRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_ROLE__THRU_DATE = eINSTANCE.getMarketingCampaignRole_ThruDate();

	}

} //CampaignPackage
