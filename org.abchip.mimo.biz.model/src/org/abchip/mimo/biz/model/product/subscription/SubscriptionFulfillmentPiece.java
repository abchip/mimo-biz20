/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.subscription;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Fulfillment Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionFulfillmentPiece#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionActivity <em>Subscription Activity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionFulfillmentPiece()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface SubscriptionFulfillmentPiece extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription</em>' reference.
	 * @see #setSubscription(Subscription)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionFulfillmentPiece_Subscription()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Subscription getSubscription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionFulfillmentPiece#getSubscription <em>Subscription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(Subscription value);

	/**
	 * Returns the value of the '<em><b>Subscription Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Activity</em>' reference.
	 * @see #setSubscriptionActivity(SubscriptionActivity)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionFulfillmentPiece_SubscriptionActivity()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SubscriptionActivity getSubscriptionActivity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionActivity <em>Subscription Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Activity</em>' reference.
	 * @see #getSubscriptionActivity()
	 * @generated
	 */
	void setSubscriptionActivity(SubscriptionActivity value);

} // SubscriptionFulfillmentPiece
