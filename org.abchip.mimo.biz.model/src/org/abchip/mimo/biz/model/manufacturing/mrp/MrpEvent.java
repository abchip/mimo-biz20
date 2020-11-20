/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.manufacturing.mrp;

import java.util.Date;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mrp Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getMrpEventType <em>Mrp Event Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getEventDate <em>Event Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getMrpId <em>Mrp Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getFacilityIdTo <em>Facility Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getIsLate <em>Is Late</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent()
 * @model
 * @generated
 */
public interface MrpEvent extends EntityTyped<MrpEventType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_Product()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Mrp Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mrp Event Type</em>' reference.
	 * @see #setMrpEventType(MrpEventType)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_MrpEventType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	MrpEventType getMrpEventType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getMrpEventType <em>Mrp Event Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mrp Event Type</em>' reference.
	 * @see #getMrpEventType()
	 * @generated
	 */
	void setMrpEventType(MrpEventType value);

	/**
	 * Returns the value of the '<em><b>Mrp Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mrp Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mrp Id</em>' attribute.
	 * @see #setMrpId(String)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_MrpId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getMrpId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getMrpId <em>Mrp Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mrp Id</em>' attribute.
	 * @see #getMrpId()
	 * @generated
	 */
	void setMrpId(String value);

	/**
	 * Returns the value of the '<em><b>Event Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Date</em>' attribute.
	 * @see #setEventDate(Date)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_EventDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getEventDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getEventDate <em>Event Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Date</em>' attribute.
	 * @see #getEventDate()
	 * @generated
	 */
	void setEventDate(Date value);

	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see #setEventName(String)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_EventName()
	 * @model
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_Facility()
	 * @model
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Facility Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id To</em>' attribute.
	 * @see #setFacilityIdTo(String)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_FacilityIdTo()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFacilityIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getFacilityIdTo <em>Facility Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id To</em>' attribute.
	 * @see #getFacilityIdTo()
	 * @generated
	 */
	void setFacilityIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Is Late</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Late</em>' attribute.
	 * @see #setIsLate(Boolean)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_IsLate()
	 * @model
	 * @generated
	 */
	Boolean getIsLate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getIsLate <em>Is Late</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Late</em>' attribute.
	 * @see #getIsLate()
	 * @generated
	 */
	void setIsLate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(double)
	 * @see org.abchip.mimo.biz.model.manufacturing.mrp.MrpPackage#getMrpEvent_Quantity()
	 * @model
	 * @generated
	 */
	double getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.manufacturing.mrp.MrpEvent#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(double value);

} // MrpEvent
