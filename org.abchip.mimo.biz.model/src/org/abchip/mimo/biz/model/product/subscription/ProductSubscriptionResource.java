/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.subscription;

import java.util.Date;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Subscription Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getSubscriptionResource <em>Subscription Resource</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#isAutomaticExtend <em>Automatic Extend</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getAvailableTimeUom <em>Available Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getCanclAutmExtTimeUom <em>Cancl Autm Ext Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiryUom <em>Grace Period On Expiry Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getMaxLifeTimeUom <em>Max Life Time Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getUseRoleType <em>Use Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getUseTimeUom <em>Use Time Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductSubscriptionResource extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_Product()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Subscription Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Resource</em>' reference.
	 * @see #setSubscriptionResource(SubscriptionResource)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_SubscriptionResource()
	 * @model keys="subscriptionResourceId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SubscriptionResource getSubscriptionResource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getSubscriptionResource <em>Subscription Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Resource</em>' reference.
	 * @see #getSubscriptionResource()
	 * @generated
	 */
	void setSubscriptionResource(SubscriptionResource value);

	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Time</em>' attribute.
	 * @see #setAvailableTime(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_AvailableTime()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAvailableTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getAvailableTime <em>Available Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Time</em>' attribute.
	 * @see #getAvailableTime()
	 * @generated
	 */
	void setAvailableTime(long value);

	/**
	 * Returns the value of the '<em><b>Available Time Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Time Uom</em>' reference.
	 * @see #setAvailableTimeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_AvailableTimeUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getAvailableTimeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getAvailableTimeUom <em>Available Time Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Time Uom</em>' reference.
	 * @see #getAvailableTimeUom()
	 * @generated
	 */
	void setAvailableTimeUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Cancl Autm Ext Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancl Autm Ext Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancl Autm Ext Time</em>' attribute.
	 * @see #setCanclAutmExtTime(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_CanclAutmExtTime()
	 * @model annotation="mimo-ent-slot help='The time period (before the end of the thruDate) after which the automatic extension of the subscription will be executed.'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getCanclAutmExtTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancl Autm Ext Time</em>' attribute.
	 * @see #getCanclAutmExtTime()
	 * @generated
	 */
	void setCanclAutmExtTime(long value);

	/**
	 * Returns the value of the '<em><b>Cancl Autm Ext Time Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancl Autm Ext Time Uom</em>' reference.
	 * @see #setCanclAutmExtTimeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_CanclAutmExtTimeUom()
	 * @model keys="uomId"
	 *        annotation="mimo-ent-slot help='Unit Of Measure used for the automatic extension of the subscription.'"
	 * @generated
	 */
	Uom getCanclAutmExtTimeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getCanclAutmExtTimeUom <em>Cancl Autm Ext Time Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancl Autm Ext Time Uom</em>' reference.
	 * @see #getCanclAutmExtTimeUom()
	 * @generated
	 */
	void setCanclAutmExtTimeUom(Uom value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Automatic Extend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Extend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Extend</em>' attribute.
	 * @see #setAutomaticExtend(boolean)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_AutomaticExtend()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If this subscription is automatically extended with the same period as the initial period.'"
	 * @generated
	 */
	boolean isAutomaticExtend();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#isAutomaticExtend <em>Automatic Extend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Extend</em>' attribute.
	 * @see #isAutomaticExtend()
	 * @generated
	 */
	void setAutomaticExtend(boolean value);

	/**
	 * Returns the value of the '<em><b>Grace Period On Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grace Period On Expiry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grace Period On Expiry</em>' attribute.
	 * @see #setGracePeriodOnExpiry(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_GracePeriodOnExpiry()
	 * @model annotation="mimo-ent-slot help='The time period (after the end of the thruDate) after which the subscription will be expired.'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getGracePeriodOnExpiry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grace Period On Expiry</em>' attribute.
	 * @see #getGracePeriodOnExpiry()
	 * @generated
	 */
	void setGracePeriodOnExpiry(long value);

	/**
	 * Returns the value of the '<em><b>Grace Period On Expiry Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grace Period On Expiry Uom</em>' reference.
	 * @see #setGracePeriodOnExpiryUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_GracePeriodOnExpiryUom()
	 * @model keys="uomId"
	 *        annotation="mimo-ent-slot help='Unit Of Measure used for the grace period of the subscription.'"
	 * @generated
	 */
	Uom getGracePeriodOnExpiryUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiryUom <em>Grace Period On Expiry Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grace Period On Expiry Uom</em>' reference.
	 * @see #getGracePeriodOnExpiryUom()
	 * @generated
	 */
	void setGracePeriodOnExpiryUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Max Life Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Life Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Life Time</em>' attribute.
	 * @see #setMaxLifeTime(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_MaxLifeTime()
	 * @model annotation="mimo-ent-slot help='The length in time of the subscription'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxLifeTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getMaxLifeTime <em>Max Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Life Time</em>' attribute.
	 * @see #getMaxLifeTime()
	 * @generated
	 */
	void setMaxLifeTime(long value);

	/**
	 * Returns the value of the '<em><b>Max Life Time Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Life Time Uom</em>' reference.
	 * @see #setMaxLifeTimeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_MaxLifeTimeUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getMaxLifeTimeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getMaxLifeTimeUom <em>Max Life Time Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Life Time Uom</em>' reference.
	 * @see #getMaxLifeTimeUom()
	 * @generated
	 */
	void setMaxLifeTimeUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase From Date</em>' attribute.
	 * @see #setPurchaseFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_PurchaseFromDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getPurchaseFromDate <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase From Date</em>' attribute.
	 * @see #getPurchaseFromDate()
	 * @generated
	 */
	void setPurchaseFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #setPurchaseThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_PurchaseThruDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getPurchaseThruDate <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #getPurchaseThruDate()
	 * @generated
	 */
	void setPurchaseThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Count Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Count Limit</em>' attribute.
	 * @see #setUseCountLimit(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_UseCountLimit()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getUseCountLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getUseCountLimit <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Count Limit</em>' attribute.
	 * @see #getUseCountLimit()
	 * @generated
	 */
	void setUseCountLimit(long value);

	/**
	 * Returns the value of the '<em><b>Use Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Role Type</em>' reference.
	 * @see #setUseRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_UseRoleType()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getUseRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getUseRoleType <em>Use Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Role Type</em>' reference.
	 * @see #getUseRoleType()
	 * @generated
	 */
	void setUseRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time</em>' attribute.
	 * @see #setUseTime(long)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_UseTime()
	 * @model annotation="mimo-ent-slot help='The length of time this subscription can be used'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getUseTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getUseTime <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time</em>' attribute.
	 * @see #getUseTime()
	 * @generated
	 */
	void setUseTime(long value);

	/**
	 * Returns the value of the '<em><b>Use Time Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time Uom</em>' reference.
	 * @see #setUseTimeUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.subscription.SubscriptionPackage#getProductSubscriptionResource_UseTimeUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getUseTimeUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.subscription.ProductSubscriptionResource#getUseTimeUom <em>Use Time Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time Uom</em>' reference.
	 * @see #getUseTimeUom()
	 * @generated
	 */
	void setUseTimeUom(Uom value);

} // ProductSubscriptionResource
