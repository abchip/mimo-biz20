/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.subscription;

import org.abchip.mimo.biz.model.content.content.Content;
import org.abchip.mimo.biz.model.webapp.website.WebSite;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getParentResource <em>Parent Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getServiceNameOnExpiry <em>Service Name On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getWebSite <em>Web Site</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionResource()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface SubscriptionResource extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionResource_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Resource</em>' reference.
	 * @see #setParentResource(SubscriptionResource)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionResource_ParentResource()
	 * @model keys="subscriptionResourceId"
	 * @generated
	 */
	SubscriptionResource getParentResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getParentResource <em>Parent Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource</em>' reference.
	 * @see #getParentResource()
	 * @generated
	 */
	void setParentResource(SubscriptionResource value);

	/**
	 * Returns the value of the '<em><b>Service Name On Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name On Expiry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name On Expiry</em>' attribute.
	 * @see #setServiceNameOnExpiry(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionResource_ServiceNameOnExpiry()
	 * @model annotation="mimo-ent-slot help='Name of service which will run on subscription expiration.'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getServiceNameOnExpiry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getServiceNameOnExpiry <em>Service Name On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name On Expiry</em>' attribute.
	 * @see #getServiceNameOnExpiry()
	 * @generated
	 */
	void setServiceNameOnExpiry(String value);

	/**
	 * Returns the value of the '<em><b>Web Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site</em>' reference.
	 * @see #setWebSite(WebSite)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionResource_WebSite()
	 * @model keys="webSiteId"
	 *        annotation="mimo-ent-slot help='Optional (use if applicable) ID of a WebSite record that this would represent a subscription to.'"
	 * @generated
	 */
	WebSite getWebSite();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getWebSite <em>Web Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site</em>' reference.
	 * @see #getWebSite()
	 * @generated
	 */
	void setWebSite(WebSite value);

	/**
	 * Returns the value of the '<em><b>Subscription Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Resource Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Resource Id</em>' attribute.
	 * @see #setSubscriptionResourceId(String)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionResource_SubscriptionResourceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSubscriptionResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getSubscriptionResourceId <em>Subscription Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Resource Id</em>' attribute.
	 * @see #getSubscriptionResourceId()
	 * @generated
	 */
	void setSubscriptionResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getSubscriptionResource_Content()
	 * @model keys="contentId"
	 *        annotation="mimo-ent-slot help='Optional (use if applicable) ID of a Content record that this would represent a subscription to.'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.SubscriptionResource#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

} // SubscriptionResource
