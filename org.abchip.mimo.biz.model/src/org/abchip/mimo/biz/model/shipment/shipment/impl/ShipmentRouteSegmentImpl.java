/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.shipment.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.shipment.shipment.Delivery;
import org.abchip.mimo.biz.model.shipment.shipment.Shipment;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentMethodType;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment;
import org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Route Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualArrivalDate <em>Actual Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualOtherCost <em>Actual Other Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualServiceCost <em>Actual Service Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getActualTransportCost <em>Actual Transport Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getBillingWeight <em>Billing Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getBillingWeightUom <em>Billing Weight Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierDeliveryZone <em>Carrier Delivery Zone</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierParty <em>Carrier Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierRestrictionCodes <em>Carrier Restriction Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierRestrictionDesc <em>Carrier Restriction Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCarrierServiceStatus <em>Carrier Service Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestContactMech <em>Dest Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestFacility <em>Dest Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getDestTelecomNumber <em>Dest Telecom Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getHomeDeliveryDate <em>Home Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getHomeDeliveryType <em>Home Delivery Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getLastUpdatedDate <em>Last Updated Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginContactMech <em>Origin Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginFacility <em>Origin Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getOriginTelecomNumber <em>Origin Telecom Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getShipmentMethodType <em>Shipment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyAccountNumber <em>Third Party Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyCountryGeoCode <em>Third Party Country Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getThirdPartyPostalCode <em>Third Party Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getTrackingDigest <em>Tracking Digest</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getTrackingIdNumber <em>Tracking Id Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getUpdatedByUserLoginId <em>Updated By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentRouteSegmentImpl#getUpsHighValueReport <em>Ups High Value Report</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentRouteSegmentImpl extends EntityIdentifiableImpl implements ShipmentRouteSegment {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentRouteSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipment() {
		return (Shipment)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipment(Shipment newShipment) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT, newShipment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualArrivalDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualArrivalDate(Date newActualArrivalDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE, newActualArrivalDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCost(BigDecimal newActualCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST, newActualCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualOtherCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualOtherCost(BigDecimal newActualOtherCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST, newActualOtherCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualServiceCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualServiceCost(BigDecimal newActualServiceCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST, newActualServiceCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualStartDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualStartDate(Date newActualStartDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE, newActualStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualTransportCost() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualTransportCost(BigDecimal newActualTransportCost) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST, newActualTransportCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBillingWeight() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingWeight(BigDecimal newBillingWeight) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT, newBillingWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getBillingWeightUom() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingWeightUom(Uom newBillingWeightUom) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM, newBillingWeightUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierDeliveryZone() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierDeliveryZone(String newCarrierDeliveryZone) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE, newCarrierDeliveryZone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getCarrierParty() {
		return (Party)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierParty(Party newCarrierParty) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY, newCarrierParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRestrictionCodes() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRestrictionCodes(String newCarrierRestrictionCodes) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES, newCarrierRestrictionCodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRestrictionDesc() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRestrictionDesc(String newCarrierRestrictionDesc) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC, newCarrierRestrictionDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getCarrierServiceStatus() {
		return (StatusItem)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierServiceStatus(StatusItem newCarrierServiceStatus) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS, newCarrierServiceStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delivery getDelivery() {
		return (Delivery)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DELIVERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelivery(Delivery newDelivery) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DELIVERY, newDelivery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getDestContactMech() {
		return (ContactMech)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestContactMech(ContactMech newDestContactMech) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH, newDestContactMech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestFacility() {
		return (Facility)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestFacility(Facility newDestFacility) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY, newDestFacility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getDestTelecomNumber() {
		return (TelecomNumber)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestTelecomNumber(TelecomNumber newDestTelecomNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER, newDestTelecomNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedArrivalDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedArrivalDate(Date newEstimatedArrivalDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE, newEstimatedArrivalDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedStartDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedStartDate(Date newEstimatedStartDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE, newEstimatedStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getHomeDeliveryDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeDeliveryDate(Date newHomeDeliveryDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE, newHomeDeliveryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHomeDeliveryType() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeDeliveryType(String newHomeDeliveryType) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE, newHomeDeliveryType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedDate() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedDate(Date newLastUpdatedDate) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE, newLastUpdatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getOriginContactMech() {
		return (ContactMech)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMech(ContactMech newOriginContactMech) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH, newOriginContactMech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getOriginFacility() {
		return (Facility)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginFacility(Facility newOriginFacility) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY, newOriginFacility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecomNumber getOriginTelecomNumber() {
		return (TelecomNumber)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginTelecomNumber(TelecomNumber newOriginTelecomNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER, newOriginTelecomNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType getShipmentMethodType() {
		return (ShipmentMethodType)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodType(ShipmentMethodType newShipmentMethodType) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE, newShipmentMethodType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentRouteSegmentId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentRouteSegmentId(String newShipmentRouteSegmentId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID, newShipmentRouteSegmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyAccountNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyAccountNumber(String newThirdPartyAccountNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER, newThirdPartyAccountNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyCountryGeoCode() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyCountryGeoCode(String newThirdPartyCountryGeoCode) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE, newThirdPartyCountryGeoCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThirdPartyPostalCode() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdPartyPostalCode(String newThirdPartyPostalCode) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE, newThirdPartyPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingDigest() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingDigest(String newTrackingDigest) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST, newTrackingDigest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingIdNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingIdNumber(String newTrackingIdNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER, newTrackingIdNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpdatedByUserLoginId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedByUserLoginId(String newUpdatedByUserLoginId) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID, newUpdatedByUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getUpsHighValueReport() {
		return (byte[])eGet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpsHighValueReport(byte[] newUpsHighValueReport) {
		eSet(Shipment_Package.Literals.SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT, newUpsHighValueReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return Shipment_Package.SHIPMENT_ROUTE_SEGMENT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return Shipment_Package.SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ShipmentRouteSegmentImpl
