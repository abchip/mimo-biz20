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
import java.util.List;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.order.return_.ReturnHeader;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.shipment.picklist.PicklistBin;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getAdditionalShippingCharge <em>Additional Shipping Charge</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getAddtlShippingChargeDesc <em>Addtl Shipping Charge Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getDestinationContactMech <em>Destination Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getDestinationFacility <em>Destination Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getDestinationTelecomNumber <em>Destination Telecom Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedArrivalWorkEff <em>Estimated Arrival Work Eff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedReadyDate <em>Estimated Ready Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedShipCost <em>Estimated Ship Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedShipWorkEff <em>Estimated Ship Work Eff</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getHandlingInstructions <em>Handling Instructions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getLatestCancelDate <em>Latest Cancel Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getOriginContactMech <em>Origin Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getOriginFacility <em>Origin Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getOriginTelecomNumber <em>Origin Telecom Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPicklistBin <em>Picklist Bin</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPrimaryOrder <em>Primary Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPrimaryReturn <em>Primary Return</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentAttributes <em>Shipment Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentContactMechs <em>Shipment Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentItems <em>Shipment Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentPackages <em>Shipment Packages</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentRouteSegments <em>Shipment Route Segments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentStatuses <em>Shipment Statuses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentType <em>Shipment Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment()
 * @model
 * @generated
 */
public interface Shipment extends EntityTyped<ShipmentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Additional Shipping Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Shipping Charge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Shipping Charge</em>' attribute.
	 * @see #setAdditionalShippingCharge(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_AdditionalShippingCharge()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAdditionalShippingCharge();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getAdditionalShippingCharge <em>Additional Shipping Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Shipping Charge</em>' attribute.
	 * @see #getAdditionalShippingCharge()
	 * @generated
	 */
	void setAdditionalShippingCharge(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Addtl Shipping Charge Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addtl Shipping Charge Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addtl Shipping Charge Desc</em>' attribute.
	 * @see #setAddtlShippingChargeDesc(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_AddtlShippingChargeDesc()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddtlShippingChargeDesc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getAddtlShippingChargeDesc <em>Addtl Shipping Charge Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addtl Shipping Charge Desc</em>' attribute.
	 * @see #getAddtlShippingChargeDesc()
	 * @generated
	 */
	void setAddtlShippingChargeDesc(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Destination Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Contact Mech</em>' reference.
	 * @see #setDestinationContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_DestinationContactMech()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getDestinationContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getDestinationContactMech <em>Destination Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Contact Mech</em>' reference.
	 * @see #getDestinationContactMech()
	 * @generated
	 */
	void setDestinationContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Destination Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Facility</em>' reference.
	 * @see #setDestinationFacility(Facility)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_DestinationFacility()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getDestinationFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getDestinationFacility <em>Destination Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Facility</em>' reference.
	 * @see #getDestinationFacility()
	 * @generated
	 */
	void setDestinationFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Destination Telecom Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Telecom Number</em>' reference.
	 * @see #setDestinationTelecomNumber(TelecomNumber)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_DestinationTelecomNumber()
	 * @model keys="contactMechId"
	 * @generated
	 */
	TelecomNumber getDestinationTelecomNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getDestinationTelecomNumber <em>Destination Telecom Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Telecom Number</em>' reference.
	 * @see #getDestinationTelecomNumber()
	 * @generated
	 */
	void setDestinationTelecomNumber(TelecomNumber value);

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
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_EstimatedArrivalDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedArrivalDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Date</em>' attribute.
	 * @see #getEstimatedArrivalDate()
	 * @generated
	 */
	void setEstimatedArrivalDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Arrival Work Eff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Arrival Work Eff</em>' reference.
	 * @see #setEstimatedArrivalWorkEff(WorkEffort)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_EstimatedArrivalWorkEff()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getEstimatedArrivalWorkEff();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedArrivalWorkEff <em>Estimated Arrival Work Eff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Work Eff</em>' reference.
	 * @see #getEstimatedArrivalWorkEff()
	 * @generated
	 */
	void setEstimatedArrivalWorkEff(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Estimated Ready Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ready Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ready Date</em>' attribute.
	 * @see #setEstimatedReadyDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_EstimatedReadyDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedReadyDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedReadyDate <em>Estimated Ready Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ready Date</em>' attribute.
	 * @see #getEstimatedReadyDate()
	 * @generated
	 */
	void setEstimatedReadyDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ship Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Cost</em>' attribute.
	 * @see #setEstimatedShipCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_EstimatedShipCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getEstimatedShipCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedShipCost <em>Estimated Ship Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Cost</em>' attribute.
	 * @see #getEstimatedShipCost()
	 * @generated
	 */
	void setEstimatedShipCost(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_EstimatedShipDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedShipDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedShipDate <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #getEstimatedShipDate()
	 * @generated
	 */
	void setEstimatedShipDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Ship Work Eff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Work Eff</em>' reference.
	 * @see #setEstimatedShipWorkEff(WorkEffort)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_EstimatedShipWorkEff()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getEstimatedShipWorkEff();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getEstimatedShipWorkEff <em>Estimated Ship Work Eff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Work Eff</em>' reference.
	 * @see #getEstimatedShipWorkEff()
	 * @generated
	 */
	void setEstimatedShipWorkEff(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Handling Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handling Instructions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handling Instructions</em>' attribute.
	 * @see #setHandlingInstructions(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_HandlingInstructions()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getHandlingInstructions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getHandlingInstructions <em>Handling Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Instructions</em>' attribute.
	 * @see #getHandlingInstructions()
	 * @generated
	 */
	void setHandlingInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Latest Cancel Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Cancel Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Cancel Date</em>' attribute.
	 * @see #setLatestCancelDate(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_LatestCancelDate()
	 * @model
	 * @generated
	 */
	Date getLatestCancelDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getLatestCancelDate <em>Latest Cancel Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Cancel Date</em>' attribute.
	 * @see #getLatestCancelDate()
	 * @generated
	 */
	void setLatestCancelDate(Date value);

	/**
	 * Returns the value of the '<em><b>Origin Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Contact Mech</em>' reference.
	 * @see #setOriginContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_OriginContactMech()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getOriginContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getOriginContactMech <em>Origin Contact Mech</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_OriginFacility()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getOriginFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getOriginFacility <em>Origin Facility</em>}' reference.
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
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_OriginTelecomNumber()
	 * @model keys="contactMechId"
	 * @generated
	 */
	TelecomNumber getOriginTelecomNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getOriginTelecomNumber <em>Origin Telecom Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Telecom Number</em>' reference.
	 * @see #getOriginTelecomNumber()
	 * @generated
	 */
	void setOriginTelecomNumber(TelecomNumber value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_PartyIdFrom()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' reference.
	 * @see #setPartyIdTo(Party)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_PartyIdTo()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPartyIdTo <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' reference.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(Party value);

	/**
	 * Returns the value of the '<em><b>Picklist Bin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Bin</em>' reference.
	 * @see #setPicklistBin(PicklistBin)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_PicklistBin()
	 * @model keys="picklistBinId"
	 * @generated
	 */
	PicklistBin getPicklistBin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPicklistBin <em>Picklist Bin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Bin</em>' reference.
	 * @see #getPicklistBin()
	 * @generated
	 */
	void setPicklistBin(PicklistBin value);

	/**
	 * Returns the value of the '<em><b>Primary Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Order</em>' reference.
	 * @see #setPrimaryOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_PrimaryOrder()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getPrimaryOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPrimaryOrder <em>Primary Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Order</em>' reference.
	 * @see #getPrimaryOrder()
	 * @generated
	 */
	void setPrimaryOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Primary Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Return</em>' reference.
	 * @see #setPrimaryReturn(ReturnHeader)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_PrimaryReturn()
	 * @model keys="returnId"
	 * @generated
	 */
	ReturnHeader getPrimaryReturn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPrimaryReturn <em>Primary Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Return</em>' reference.
	 * @see #getPrimaryReturn()
	 * @generated
	 */
	void setPrimaryReturn(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Primary Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Ship Group Seq Id</em>' attribute.
	 * @see #setPrimaryShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_PrimaryShipGroupSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPrimaryShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Ship Group Seq Id</em>' attribute.
	 * @see #getPrimaryShipGroupSeqId()
	 * @generated
	 */
	void setPrimaryShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_ShipmentAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentAttribute> getShipmentAttributes();

	/**
	 * Returns the value of the '<em><b>Shipment Contact Mechs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentContactMech}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Contact Mechs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_ShipmentContactMechs()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentContactMech> getShipmentContactMechs();

	/**
	 * Returns the value of the '<em><b>Shipment Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_ShipmentItems()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentItem> getShipmentItems();

	/**
	 * Returns the value of the '<em><b>Shipment Packages</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Packages</em>' reference list.
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_ShipmentPackages()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentPackage> getShipmentPackages();

	/**
	 * Returns the value of the '<em><b>Shipment Route Segments</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentRouteSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Route Segments</em>' reference list.
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_ShipmentRouteSegments()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentRouteSegment> getShipmentRouteSegments();

	/**
	 * Returns the value of the '<em><b>Shipment Statuses</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Statuses</em>' reference list.
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_ShipmentStatuses()
	 * @model derived="true"
	 * @generated
	 */
	List<ShipmentStatus> getShipmentStatuses();

	/**
	 * Returns the value of the '<em><b>Shipment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Type</em>' reference.
	 * @see #setShipmentType(ShipmentType)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_ShipmentType()
	 * @model keys="shipmentTypeId"
	 * @generated
	 */
	ShipmentType getShipmentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentType <em>Shipment Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Type</em>' reference.
	 * @see #getShipmentType()
	 * @generated
	 */
	void setShipmentType(ShipmentType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' attribute.
	 * @see #setShipmentId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipment_ShipmentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.Shipment#getShipmentId <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' attribute.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(String value);

} // Shipment
