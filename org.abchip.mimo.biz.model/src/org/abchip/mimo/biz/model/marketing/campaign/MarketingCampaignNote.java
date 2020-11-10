/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.campaign;

import org.abchip.mimo.biz.BizEntityNote;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketing Campaign Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignNote#getMarketingCampaign <em>Marketing Campaign</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.campaign.CampaignPackage#getMarketingCampaignNote()
 * @model
 * @generated
 */
public interface MarketingCampaignNote extends BizEntityNote {
	/**
	 * Returns the value of the '<em><b>Marketing Campaign</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Campaign</em>' reference.
	 * @see #setMarketingCampaign(MarketingCampaign)
	 * @see org.abchip.mimo.biz.model.marketing.campaign.CampaignPackage#getMarketingCampaignNote_MarketingCampaign()
	 * @model keys="marketingCampaignId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	MarketingCampaign getMarketingCampaign();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.campaign.MarketingCampaignNote#getMarketingCampaign <em>Marketing Campaign</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Campaign</em>' reference.
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	void setMarketingCampaign(MarketingCampaign value);

} // MarketingCampaignNote
