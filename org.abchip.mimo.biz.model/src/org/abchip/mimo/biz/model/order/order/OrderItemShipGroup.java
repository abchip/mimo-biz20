/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.order;

import java.util.Date;
import org.abchip.mimo.biz.model.party.agreement.Agreement;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Ship Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getGiftMessage <em>Gift Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getIsGift <em>Is Gift</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getMaySplit <em>May Split</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipAfterDate <em>Ship After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipByDate <em>Ship By Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipmentMethodType <em>Shipment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShippingInstructions <em>Shipping Instructions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getSupplierAgreement <em>Supplier Agreement</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getSupplierParty <em>Supplier Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getTelecomContactMech <em>Telecom Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getTrackingNumber <em>Tracking Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getVendorParty <em>Vendor Party</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup()
 * @model
 * @generated
 */
public interface OrderItemShipGroup extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_Order()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #setCarrierRoleTypeId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_CarrierRoleTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCarrierRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 */
	void setCarrierRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_ContactMech()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #setEstimatedDeliveryDate(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_EstimatedDeliveryDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedDeliveryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 */
	void setEstimatedDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ship Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #setEstimatedShipDate(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_EstimatedShipDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedShipDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getEstimatedShipDate <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #getEstimatedShipDate()
	 * @generated
	 */
	void setEstimatedShipDate(Date value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_Facility()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Gift Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gift Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gift Message</em>' attribute.
	 * @see #setGiftMessage(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_GiftMessage()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getGiftMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getGiftMessage <em>Gift Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gift Message</em>' attribute.
	 * @see #getGiftMessage()
	 * @generated
	 */
	void setGiftMessage(String value);

	/**
	 * Returns the value of the '<em><b>Is Gift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Gift</em>' attribute.
	 * @see #setIsGift(Boolean)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_IsGift()
	 * @model
	 * @generated
	 */
	Boolean getIsGift();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getIsGift <em>Is Gift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Gift</em>' attribute.
	 * @see #getIsGift()
	 * @generated
	 */
	void setIsGift(Boolean value);

	/**
	 * Returns the value of the '<em><b>May Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Split</em>' attribute.
	 * @see #setMaySplit(Boolean)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_MaySplit()
	 * @model
	 * @generated
	 */
	Boolean getMaySplit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getMaySplit <em>May Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>May Split</em>' attribute.
	 * @see #getMaySplit()
	 * @generated
	 */
	void setMaySplit(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ship After Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship After Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship After Date</em>' attribute.
	 * @see #setShipAfterDate(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_ShipAfterDate()
	 * @model
	 * @generated
	 */
	Date getShipAfterDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipAfterDate <em>Ship After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship After Date</em>' attribute.
	 * @see #getShipAfterDate()
	 * @generated
	 */
	void setShipAfterDate(Date value);

	/**
	 * Returns the value of the '<em><b>Ship By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship By Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship By Date</em>' attribute.
	 * @see #setShipByDate(Date)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_ShipByDate()
	 * @model
	 * @generated
	 */
	Date getShipByDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipByDate <em>Ship By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship By Date</em>' attribute.
	 * @see #getShipByDate()
	 * @generated
	 */
	void setShipByDate(Date value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type</em>' reference.
	 * @see #setShipmentMethodType(ShipmentMethodType)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_ShipmentMethodType()
	 * @model keys="shipmentMethodTypeId"
	 *        annotation="mimo-ent-slot audit='true'"
	 * @generated
	 */
	ShipmentMethodType getShipmentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipmentMethodType <em>Shipment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type</em>' reference.
	 * @see #getShipmentMethodType()
	 * @generated
	 */
	void setShipmentMethodType(ShipmentMethodType value);

	/**
	 * Returns the value of the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #setShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_ShipGroupSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party</em>' reference.
	 * @see #setCarrierParty(Party)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_CarrierParty()
	 * @model keys="partyId"
	 *        annotation="mimo-ent-slot audit='true'"
	 * @generated
	 */
	Party getCarrierParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getCarrierParty <em>Carrier Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party</em>' reference.
	 * @see #getCarrierParty()
	 * @generated
	 */
	void setCarrierParty(Party value);

	/**
	 * Returns the value of the '<em><b>Shipping Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Instructions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Instructions</em>' attribute.
	 * @see #setShippingInstructions(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_ShippingInstructions()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getShippingInstructions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getShippingInstructions <em>Shipping Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Instructions</em>' attribute.
	 * @see #getShippingInstructions()
	 * @generated
	 */
	void setShippingInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Agreement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Agreement</em>' reference.
	 * @see #setSupplierAgreement(Agreement)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_SupplierAgreement()
	 * @model keys="agreementId"
	 * @generated
	 */
	Agreement getSupplierAgreement();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getSupplierAgreement <em>Supplier Agreement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Agreement</em>' reference.
	 * @see #getSupplierAgreement()
	 * @generated
	 */
	void setSupplierAgreement(Agreement value);

	/**
	 * Returns the value of the '<em><b>Supplier Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Party</em>' reference.
	 * @see #setSupplierParty(Party)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_SupplierParty()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getSupplierParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getSupplierParty <em>Supplier Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Party</em>' reference.
	 * @see #getSupplierParty()
	 * @generated
	 */
	void setSupplierParty(Party value);

	/**
	 * Returns the value of the '<em><b>Telecom Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom Contact Mech</em>' reference.
	 * @see #setTelecomContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_TelecomContactMech()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getTelecomContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getTelecomContactMech <em>Telecom Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telecom Contact Mech</em>' reference.
	 * @see #getTelecomContactMech()
	 * @generated
	 */
	void setTelecomContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Tracking Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Number</em>' attribute.
	 * @see #setTrackingNumber(String)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_TrackingNumber()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTrackingNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getTrackingNumber <em>Tracking Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Number</em>' attribute.
	 * @see #getTrackingNumber()
	 * @generated
	 */
	void setTrackingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party</em>' reference.
	 * @see #setVendorParty(Party)
	 * @see org.abchip.mimo.biz.model.order.order.OrderPackage#getOrderItemShipGroup_VendorParty()
	 * @model keys="partyId"
	 *        annotation="mimo-ent-slot help='For use with multi-vendor stores, order will be split so that each ship group is associated with only one vendor (only if applicable)'"
	 * @generated
	 */
	Party getVendorParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.order.OrderItemShipGroup#getVendorParty <em>Vendor Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party</em>' reference.
	 * @see #getVendorParty()
	 * @generated
	 */
	void setVendorParty(Party value);

} // OrderItemShipGroup
