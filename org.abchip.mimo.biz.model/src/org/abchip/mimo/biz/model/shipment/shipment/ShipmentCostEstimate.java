/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.shipment;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.price.QuantityBreak;
import org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Cost Estimate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getShipmentCostEstimateId <em>Shipment Cost Estimate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getFeaturePercent <em>Feature Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getFeaturePrice <em>Feature Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getGeoIdFrom <em>Geo Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOrderFlatPrice <em>Order Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOrderItemFlatPrice <em>Order Item Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOrderPricePercent <em>Order Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOversizePrice <em>Oversize Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOversizeUnit <em>Oversize Unit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getPriceBreak <em>Price Break</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getPriceUnitPrice <em>Price Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getPriceUom <em>Price Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getProductStoreShipMeth <em>Product Store Ship Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getQuantityBreak <em>Quantity Break</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getQuantityUnitPrice <em>Quantity Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getQuantityUom <em>Quantity Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getShippingPricePercent <em>Shipping Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getWeightBreak <em>Weight Break</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getWeightUnitPrice <em>Weight Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getWeightUom <em>Weight Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate()
 * @model
 * @generated
 */
public interface ShipmentCostEstimate extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Carrier Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #setCarrierPartyId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_CarrierPartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCarrierPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getCarrierPartyId <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #getCarrierPartyId()
	 * @generated
	 */
	void setCarrierPartyId(String value);

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
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_CarrierRoleTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCarrierRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 */
	void setCarrierRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Feature Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Percent</em>' attribute.
	 * @see #setFeaturePercent(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_FeaturePercent()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getFeaturePercent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getFeaturePercent <em>Feature Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Percent</em>' attribute.
	 * @see #getFeaturePercent()
	 * @generated
	 */
	void setFeaturePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Feature Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Price</em>' attribute.
	 * @see #setFeaturePrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_FeaturePrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getFeaturePrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getFeaturePrice <em>Feature Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Price</em>' attribute.
	 * @see #getFeaturePrice()
	 * @generated
	 */
	void setFeaturePrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Geo Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id From</em>' reference.
	 * @see #setGeoIdFrom(Geo)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_GeoIdFrom()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getGeoIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getGeoIdFrom <em>Geo Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id From</em>' reference.
	 * @see #getGeoIdFrom()
	 * @generated
	 */
	void setGeoIdFrom(Geo value);

	/**
	 * Returns the value of the '<em><b>Geo Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id To</em>' reference.
	 * @see #setGeoIdTo(Geo)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_GeoIdTo()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getGeoIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getGeoIdTo <em>Geo Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id To</em>' reference.
	 * @see #getGeoIdTo()
	 * @generated
	 */
	void setGeoIdTo(Geo value);

	/**
	 * Returns the value of the '<em><b>Order Flat Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Flat Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Flat Price</em>' attribute.
	 * @see #setOrderFlatPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OrderFlatPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getOrderFlatPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOrderFlatPrice <em>Order Flat Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Flat Price</em>' attribute.
	 * @see #getOrderFlatPrice()
	 * @generated
	 */
	void setOrderFlatPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Item Flat Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Flat Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Flat Price</em>' attribute.
	 * @see #setOrderItemFlatPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OrderItemFlatPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getOrderItemFlatPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOrderItemFlatPrice <em>Order Item Flat Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Flat Price</em>' attribute.
	 * @see #getOrderItemFlatPrice()
	 * @generated
	 */
	void setOrderItemFlatPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Price Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Price Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Price Percent</em>' attribute.
	 * @see #setOrderPricePercent(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OrderPricePercent()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getOrderPricePercent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOrderPricePercent <em>Order Price Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Price Percent</em>' attribute.
	 * @see #getOrderPricePercent()
	 * @generated
	 */
	void setOrderPricePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Oversize Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oversize Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oversize Price</em>' attribute.
	 * @see #setOversizePrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OversizePrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getOversizePrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOversizePrice <em>Oversize Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oversize Price</em>' attribute.
	 * @see #getOversizePrice()
	 * @generated
	 */
	void setOversizePrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Oversize Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oversize Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oversize Unit</em>' attribute.
	 * @see #setOversizeUnit(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OversizeUnit()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getOversizeUnit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getOversizeUnit <em>Oversize Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oversize Unit</em>' attribute.
	 * @see #getOversizeUnit()
	 * @generated
	 */
	void setOversizeUnit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Price Break</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Break</em>' reference.
	 * @see #setPriceBreak(QuantityBreak)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_PriceBreak()
	 * @model keys="quantityBreakId"
	 * @generated
	 */
	QuantityBreak getPriceBreak();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getPriceBreak <em>Price Break</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Break</em>' reference.
	 * @see #getPriceBreak()
	 * @generated
	 */
	void setPriceBreak(QuantityBreak value);

	/**
	 * Returns the value of the '<em><b>Price Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Unit Price</em>' attribute.
	 * @see #setPriceUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_PriceUnitPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getPriceUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getPriceUnitPrice <em>Price Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Unit Price</em>' attribute.
	 * @see #getPriceUnitPrice()
	 * @generated
	 */
	void setPriceUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Price Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Uom</em>' reference.
	 * @see #setPriceUom(Uom)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_PriceUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getPriceUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getPriceUom <em>Price Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Uom</em>' reference.
	 * @see #getPriceUom()
	 * @generated
	 */
	void setPriceUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Product Feature Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Group Id</em>' attribute.
	 * @see #setProductFeatureGroupId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ProductFeatureGroupId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductFeatureGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getProductFeatureGroupId <em>Product Feature Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Group Id</em>' attribute.
	 * @see #getProductFeatureGroupId()
	 * @generated
	 */
	void setProductFeatureGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ProductStoreId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Ship Meth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Ship Meth</em>' reference.
	 * @see #setProductStoreShipMeth(ProductStoreShipmentMeth)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ProductStoreShipMeth()
	 * @model keys="productStoreShipMethId"
	 * @generated
	 */
	ProductStoreShipmentMeth getProductStoreShipMeth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getProductStoreShipMeth <em>Product Store Ship Meth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Ship Meth</em>' reference.
	 * @see #getProductStoreShipMeth()
	 * @generated
	 */
	void setProductStoreShipMeth(ProductStoreShipmentMeth value);

	/**
	 * Returns the value of the '<em><b>Quantity Break</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Break</em>' reference.
	 * @see #setQuantityBreak(QuantityBreak)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_QuantityBreak()
	 * @model keys="quantityBreakId"
	 * @generated
	 */
	QuantityBreak getQuantityBreak();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getQuantityBreak <em>Quantity Break</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Break</em>' reference.
	 * @see #getQuantityBreak()
	 * @generated
	 */
	void setQuantityBreak(QuantityBreak value);

	/**
	 * Returns the value of the '<em><b>Quantity Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Unit Price</em>' attribute.
	 * @see #setQuantityUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_QuantityUnitPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getQuantityUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getQuantityUnitPrice <em>Quantity Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Unit Price</em>' attribute.
	 * @see #getQuantityUnitPrice()
	 * @generated
	 */
	void setQuantityUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Uom</em>' reference.
	 * @see #setQuantityUom(Uom)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_QuantityUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getQuantityUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getQuantityUom <em>Quantity Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Uom</em>' reference.
	 * @see #getQuantityUom()
	 * @generated
	 */
	void setQuantityUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_RoleType()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Shipment Cost Estimate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Cost Estimate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Cost Estimate Id</em>' attribute.
	 * @see #setShipmentCostEstimateId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ShipmentCostEstimateId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentCostEstimateId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getShipmentCostEstimateId <em>Shipment Cost Estimate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Cost Estimate Id</em>' attribute.
	 * @see #getShipmentCostEstimateId()
	 * @generated
	 */
	void setShipmentCostEstimateId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #setShipmentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ShipmentMethodTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 */
	void setShipmentMethodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Shipping Price Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Price Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Price Percent</em>' attribute.
	 * @see #setShippingPricePercent(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ShippingPricePercent()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getShippingPricePercent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getShippingPricePercent <em>Shipping Price Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Price Percent</em>' attribute.
	 * @see #getShippingPricePercent()
	 * @generated
	 */
	void setShippingPricePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Weight Break</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Break</em>' reference.
	 * @see #setWeightBreak(QuantityBreak)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_WeightBreak()
	 * @model keys="quantityBreakId"
	 * @generated
	 */
	QuantityBreak getWeightBreak();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getWeightBreak <em>Weight Break</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Break</em>' reference.
	 * @see #getWeightBreak()
	 * @generated
	 */
	void setWeightBreak(QuantityBreak value);

	/**
	 * Returns the value of the '<em><b>Weight Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Unit Price</em>' attribute.
	 * @see #setWeightUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_WeightUnitPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getWeightUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getWeightUnitPrice <em>Weight Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Unit Price</em>' attribute.
	 * @see #getWeightUnitPrice()
	 * @generated
	 */
	void setWeightUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Weight Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Uom</em>' reference.
	 * @see #setWeightUom(Uom)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentCostEstimate_WeightUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getWeightUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate#getWeightUom <em>Weight Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Uom</em>' reference.
	 * @see #getWeightUom()
	 * @generated
	 */
	void setWeightUom(Uom value);

} // ShipmentCostEstimate
