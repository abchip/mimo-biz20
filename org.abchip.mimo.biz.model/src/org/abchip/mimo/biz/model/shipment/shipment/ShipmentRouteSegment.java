/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.shipment;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Route Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualArrivalDate <em>Actual Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualOtherCost <em>Actual Other Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualServiceCost <em>Actual Service Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualTransportCost <em>Actual Transport Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getBillingWeight <em>Billing Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getBillingWeightUom <em>Billing Weight Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierDeliveryZone <em>Carrier Delivery Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionCodes <em>Carrier Restriction Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionDesc <em>Carrier Restriction Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierServiceStatus <em>Carrier Service Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getDestContactMech <em>Dest Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getDestFacility <em>Dest Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getDestTelecomNumber <em>Dest Telecom Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryDate <em>Home Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryType <em>Home Delivery Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getLastUpdatedDate <em>Last Updated Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getOriginContactMech <em>Origin Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getOriginFacility <em>Origin Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getOriginTelecomNumber <em>Origin Telecom Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getShipmentMethodType <em>Shipment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getThirdPartyAccountNumber <em>Third Party Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getThirdPartyCountryGeoCode <em>Third Party Country Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getThirdPartyPostalCode <em>Third Party Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getTrackingDigest <em>Tracking Digest</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getTrackingIdNumber <em>Tracking Id Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getUpdatedByUserLoginId <em>Updated By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getUpsHighValueReport <em>Ups High Value Report</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment()
 * @model
 * @generated
 */
public interface ShipmentRouteSegment extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment</em>' reference.
	 * @see #setShipment(Shipment)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_Shipment()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Shipment getShipment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getShipment <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' reference.
	 * @see #getShipment()
	 * @generated
	 */
	void setShipment(Shipment value);

	/**
	 * Returns the value of the '<em><b>Actual Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Arrival Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Arrival Date</em>' attribute.
	 * @see #setActualArrivalDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualArrivalDate()
	 * @model
	 * @generated
	 */
	Date getActualArrivalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualArrivalDate <em>Actual Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Arrival Date</em>' attribute.
	 * @see #getActualArrivalDate()
	 * @generated
	 */
	void setActualArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Cost</em>' attribute.
	 * @see #setActualCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualCost <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Cost</em>' attribute.
	 * @see #getActualCost()
	 * @generated
	 */
	void setActualCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Other Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Other Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Other Cost</em>' attribute.
	 * @see #setActualOtherCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualOtherCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualOtherCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualOtherCost <em>Actual Other Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Other Cost</em>' attribute.
	 * @see #getActualOtherCost()
	 * @generated
	 */
	void setActualOtherCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Service Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Service Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Service Cost</em>' attribute.
	 * @see #setActualServiceCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualServiceCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualServiceCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualServiceCost <em>Actual Service Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Service Cost</em>' attribute.
	 * @see #getActualServiceCost()
	 * @generated
	 */
	void setActualServiceCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Start Date</em>' attribute.
	 * @see #setActualStartDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualStartDate()
	 * @model
	 * @generated
	 */
	Date getActualStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualStartDate <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start Date</em>' attribute.
	 * @see #getActualStartDate()
	 * @generated
	 */
	void setActualStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Transport Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Transport Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Transport Cost</em>' attribute.
	 * @see #setActualTransportCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ActualTransportCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getActualTransportCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getActualTransportCost <em>Actual Transport Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Transport Cost</em>' attribute.
	 * @see #getActualTransportCost()
	 * @generated
	 */
	void setActualTransportCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Billing Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Weight</em>' attribute.
	 * @see #setBillingWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_BillingWeight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getBillingWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getBillingWeight <em>Billing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Weight</em>' attribute.
	 * @see #getBillingWeight()
	 * @generated
	 */
	void setBillingWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Billing Weight Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Weight Uom</em>' reference.
	 * @see #setBillingWeightUom(Uom)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_BillingWeightUom()
	 * @model
	 * @generated
	 */
	Uom getBillingWeightUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getBillingWeightUom <em>Billing Weight Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Weight Uom</em>' reference.
	 * @see #getBillingWeightUom()
	 * @generated
	 */
	void setBillingWeightUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Carrier Delivery Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Delivery Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Delivery Zone</em>' attribute.
	 * @see #setCarrierDeliveryZone(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierDeliveryZone()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCarrierDeliveryZone();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierDeliveryZone <em>Carrier Delivery Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Delivery Zone</em>' attribute.
	 * @see #getCarrierDeliveryZone()
	 * @generated
	 */
	void setCarrierDeliveryZone(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party</em>' reference.
	 * @see #setCarrierParty(Party)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierParty()
	 * @model
	 * @generated
	 */
	Party getCarrierParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierParty <em>Carrier Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party</em>' reference.
	 * @see #getCarrierParty()
	 * @generated
	 */
	void setCarrierParty(Party value);

	/**
	 * Returns the value of the '<em><b>Carrier Restriction Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Restriction Codes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Restriction Codes</em>' attribute.
	 * @see #setCarrierRestrictionCodes(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierRestrictionCodes()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCarrierRestrictionCodes();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionCodes <em>Carrier Restriction Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Restriction Codes</em>' attribute.
	 * @see #getCarrierRestrictionCodes()
	 * @generated
	 */
	void setCarrierRestrictionCodes(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Restriction Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Restriction Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Restriction Desc</em>' attribute.
	 * @see #setCarrierRestrictionDesc(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierRestrictionDesc()
	 * @model
	 * @generated
	 */
	String getCarrierRestrictionDesc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionDesc <em>Carrier Restriction Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Restriction Desc</em>' attribute.
	 * @see #getCarrierRestrictionDesc()
	 * @generated
	 */
	void setCarrierRestrictionDesc(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Service Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Service Status</em>' reference.
	 * @see #setCarrierServiceStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CarrierServiceStatus()
	 * @model
	 * @generated
	 */
	StatusItem getCarrierServiceStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCarrierServiceStatus <em>Carrier Service Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Service Status</em>' reference.
	 * @see #getCarrierServiceStatus()
	 * @generated
	 */
	void setCarrierServiceStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_CurrencyUom()
	 * @model
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Delivery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery</em>' reference.
	 * @see #setDelivery(Delivery)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_Delivery()
	 * @model
	 * @generated
	 */
	Delivery getDelivery();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getDelivery <em>Delivery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery</em>' reference.
	 * @see #getDelivery()
	 * @generated
	 */
	void setDelivery(Delivery value);

	/**
	 * Returns the value of the '<em><b>Dest Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Contact Mech</em>' reference.
	 * @see #setDestContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_DestContactMech()
	 * @model
	 * @generated
	 */
	ContactMech getDestContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getDestContactMech <em>Dest Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Contact Mech</em>' reference.
	 * @see #getDestContactMech()
	 * @generated
	 */
	void setDestContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Dest Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Facility</em>' reference.
	 * @see #setDestFacility(Facility)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_DestFacility()
	 * @model
	 * @generated
	 */
	Facility getDestFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getDestFacility <em>Dest Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Facility</em>' reference.
	 * @see #getDestFacility()
	 * @generated
	 */
	void setDestFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Dest Telecom Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest Telecom Number</em>' reference.
	 * @see #setDestTelecomNumber(TelecomNumber)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_DestTelecomNumber()
	 * @model
	 * @generated
	 */
	TelecomNumber getDestTelecomNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getDestTelecomNumber <em>Dest Telecom Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest Telecom Number</em>' reference.
	 * @see #getDestTelecomNumber()
	 * @generated
	 */
	void setDestTelecomNumber(TelecomNumber value);

	/**
	 * Returns the value of the '<em><b>Estimated Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Arrival Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Arrival Date</em>' attribute.
	 * @see #setEstimatedArrivalDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_EstimatedArrivalDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedArrivalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Date</em>' attribute.
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 */
	void setEstimatedArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #setEstimatedStartDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_EstimatedStartDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getEstimatedStartDate <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #getEstimatedStartDate()
	 * @generated
	 */
	void setEstimatedStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Home Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Delivery Date</em>' attribute.
	 * @see #setHomeDeliveryDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_HomeDeliveryDate()
	 * @model
	 * @generated
	 */
	Date getHomeDeliveryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryDate <em>Home Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Delivery Date</em>' attribute.
	 * @see #getHomeDeliveryDate()
	 * @generated
	 */
	void setHomeDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Home Delivery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Delivery Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Delivery Type</em>' attribute.
	 * @see #setHomeDeliveryType(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_HomeDeliveryType()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getHomeDeliveryType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryType <em>Home Delivery Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Delivery Type</em>' attribute.
	 * @see #getHomeDeliveryType()
	 * @generated
	 */
	void setHomeDeliveryType(String value);

	/**
	 * Returns the value of the '<em><b>Last Updated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Updated Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated Date</em>' attribute.
	 * @see #setLastUpdatedDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_LastUpdatedDate()
	 * @model
	 * @generated
	 */
	Date getLastUpdatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getLastUpdatedDate <em>Last Updated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated Date</em>' attribute.
	 * @see #getLastUpdatedDate()
	 * @generated
	 */
	void setLastUpdatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Origin Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Contact Mech</em>' reference.
	 * @see #setOriginContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_OriginContactMech()
	 * @model
	 * @generated
	 */
	ContactMech getOriginContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getOriginContactMech <em>Origin Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Contact Mech</em>' reference.
	 * @see #getOriginContactMech()
	 * @generated
	 */
	void setOriginContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Origin Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Facility</em>' reference.
	 * @see #setOriginFacility(Facility)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_OriginFacility()
	 * @model
	 * @generated
	 */
	Facility getOriginFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getOriginFacility <em>Origin Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Facility</em>' reference.
	 * @see #getOriginFacility()
	 * @generated
	 */
	void setOriginFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Origin Telecom Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Telecom Number</em>' reference.
	 * @see #setOriginTelecomNumber(TelecomNumber)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_OriginTelecomNumber()
	 * @model
	 * @generated
	 */
	TelecomNumber getOriginTelecomNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getOriginTelecomNumber <em>Origin Telecom Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Telecom Number</em>' reference.
	 * @see #getOriginTelecomNumber()
	 * @generated
	 */
	void setOriginTelecomNumber(TelecomNumber value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type</em>' reference.
	 * @see #setShipmentMethodType(ShipmentMethodType)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ShipmentMethodType()
	 * @model
	 * @generated
	 */
	ShipmentMethodType getShipmentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getShipmentMethodType <em>Shipment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type</em>' reference.
	 * @see #getShipmentMethodType()
	 * @generated
	 */
	void setShipmentMethodType(ShipmentMethodType value);

	/**
	 * Returns the value of the '<em><b>Shipment Route Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Route Segment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Route Segment Id</em>' attribute.
	 * @see #setShipmentRouteSegmentId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ShipmentRouteSegmentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentRouteSegmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Route Segment Id</em>' attribute.
	 * @see #getShipmentRouteSegmentId()
	 * @generated
	 */
	void setShipmentRouteSegmentId(String value);

	/**
	 * Returns the value of the '<em><b>Third Party Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Party Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Party Account Number</em>' attribute.
	 * @see #setThirdPartyAccountNumber(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ThirdPartyAccountNumber()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getThirdPartyAccountNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getThirdPartyAccountNumber <em>Third Party Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Party Account Number</em>' attribute.
	 * @see #getThirdPartyAccountNumber()
	 * @generated
	 */
	void setThirdPartyAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Third Party Country Geo Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Party Country Geo Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Party Country Geo Code</em>' attribute.
	 * @see #setThirdPartyCountryGeoCode(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ThirdPartyCountryGeoCode()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getThirdPartyCountryGeoCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getThirdPartyCountryGeoCode <em>Third Party Country Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Party Country Geo Code</em>' attribute.
	 * @see #getThirdPartyCountryGeoCode()
	 * @generated
	 */
	void setThirdPartyCountryGeoCode(String value);

	/**
	 * Returns the value of the '<em><b>Third Party Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Third Party Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Third Party Postal Code</em>' attribute.
	 * @see #setThirdPartyPostalCode(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_ThirdPartyPostalCode()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getThirdPartyPostalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getThirdPartyPostalCode <em>Third Party Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Third Party Postal Code</em>' attribute.
	 * @see #getThirdPartyPostalCode()
	 * @generated
	 */
	void setThirdPartyPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Digest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Digest</em>' attribute.
	 * @see #setTrackingDigest(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_TrackingDigest()
	 * @model
	 * @generated
	 */
	String getTrackingDigest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getTrackingDigest <em>Tracking Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Digest</em>' attribute.
	 * @see #getTrackingDigest()
	 * @generated
	 */
	void setTrackingDigest(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Id Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Id Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Id Number</em>' attribute.
	 * @see #setTrackingIdNumber(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_TrackingIdNumber()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTrackingIdNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getTrackingIdNumber <em>Tracking Id Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Id Number</em>' attribute.
	 * @see #getTrackingIdNumber()
	 * @generated
	 */
	void setTrackingIdNumber(String value);

	/**
	 * Returns the value of the '<em><b>Updated By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated By User Login Id</em>' attribute.
	 * @see #setUpdatedByUserLoginId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_UpdatedByUserLoginId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getUpdatedByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getUpdatedByUserLoginId <em>Updated By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated By User Login Id</em>' attribute.
	 * @see #getUpdatedByUserLoginId()
	 * @generated
	 */
	void setUpdatedByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Ups High Value Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ups High Value Report</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ups High Value Report</em>' attribute.
	 * @see #setUpsHighValueReport(byte[])
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentRouteSegment_UpsHighValueReport()
	 * @model
	 * @generated
	 */
	byte[] getUpsHighValueReport();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment#getUpsHighValueReport <em>Ups High Value Report</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ups High Value Report</em>' attribute.
	 * @see #getUpsHighValueReport()
	 * @generated
	 */
	void setUpsHighValueReport(byte[] value);

} // ShipmentRouteSegment
