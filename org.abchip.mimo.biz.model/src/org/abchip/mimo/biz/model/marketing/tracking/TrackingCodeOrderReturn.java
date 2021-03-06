/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.marketing.tracking;

import java.util.Date;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.return_.ReturnHeader;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracking Code Order Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getReturn <em>Return</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getTrackingCodeType <em>Tracking Code Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getHasExported <em>Has Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getIsBillable <em>Is Billable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getTrackingCode <em>Tracking Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn()
 * @model annotation="mimo-ent-frame title='Tracking Code And Order Return'"
 * @generated
 */
public interface TrackingCodeOrderReturn extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(ReturnHeader)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_Return()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ReturnHeader getReturn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_Order()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Tracking Code Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code Type</em>' reference.
	 * @see #setTrackingCodeType(TrackingCodeType)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_TrackingCodeType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TrackingCodeType getTrackingCodeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getTrackingCodeType <em>Tracking Code Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code Type</em>' reference.
	 * @see #getTrackingCodeType()
	 * @generated
	 */
	void setTrackingCodeType(TrackingCodeType value);

	/**
	 * Returns the value of the '<em><b>Affiliate Referred Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affiliate Referred Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliate Referred Time Stamp</em>' attribute.
	 * @see #setAffiliateReferredTimeStamp(Date)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_AffiliateReferredTimeStamp()
	 * @model
	 * @generated
	 */
	Date getAffiliateReferredTimeStamp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliate Referred Time Stamp</em>' attribute.
	 * @see #getAffiliateReferredTimeStamp()
	 * @generated
	 */
	void setAffiliateReferredTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Has Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Exported</em>' attribute.
	 * @see #setHasExported(Boolean)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_HasExported()
	 * @model
	 * @generated
	 */
	Boolean getHasExported();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getHasExported <em>Has Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Exported</em>' attribute.
	 * @see #getHasExported()
	 * @generated
	 */
	void setHasExported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Billable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Billable</em>' attribute.
	 * @see #setIsBillable(Boolean)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_IsBillable()
	 * @model
	 * @generated
	 */
	Boolean getIsBillable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getIsBillable <em>Is Billable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Billable</em>' attribute.
	 * @see #getIsBillable()
	 * @generated
	 */
	void setIsBillable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Id</em>' attribute.
	 * @see #setSiteId(String)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_SiteId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getSiteId <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Id</em>' attribute.
	 * @see #getSiteId()
	 * @generated
	 */
	void setSiteId(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code</em>' reference.
	 * @see #setTrackingCode(TrackingCode)
	 * @see org.abchip.mimo.biz.model.marketing.tracking.TrackingPackage#getTrackingCodeOrderReturn_TrackingCode()
	 * @model
	 * @generated
	 */
	TrackingCode getTrackingCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.marketing.tracking.TrackingCodeOrderReturn#getTrackingCode <em>Tracking Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code</em>' reference.
	 * @see #getTrackingCode()
	 * @generated
	 */
	void setTrackingCode(TrackingCode value);

} // TrackingCodeOrderReturn
