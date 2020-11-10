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
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.model.product.price.QuantityBreak;
import org.abchip.mimo.biz.model.product.store.ProductStoreShipmentMeth;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentCostEstimate;
import org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Cost Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getShipmentCostEstimateId <em>Shipment Cost Estimate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getFeaturePercent <em>Feature Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getFeaturePrice <em>Feature Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getGeoIdFrom <em>Geo Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderFlatPrice <em>Order Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderItemFlatPrice <em>Order Item Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderPricePercent <em>Order Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getOversizePrice <em>Oversize Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getOversizeUnit <em>Oversize Unit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceBreak <em>Price Break</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceUnitPrice <em>Price Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceUom <em>Price Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductStoreShipMeth <em>Product Store Ship Meth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityBreak <em>Quantity Break</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityUnitPrice <em>Quantity Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityUom <em>Quantity Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getShippingPricePercent <em>Shipping Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightBreak <em>Weight Break</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightUnitPrice <em>Weight Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightUom <em>Weight Uom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentCostEstimateImpl extends EntityIdentifiableImpl implements ShipmentCostEstimate {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentCostEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE;
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
	public String getCarrierPartyId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(String newCarrierPartyId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID, newCarrierPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRoleTypeId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRoleTypeId(String newCarrierRoleTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID, newCarrierRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFeaturePercent() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturePercent(BigDecimal newFeaturePercent) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT, newFeaturePercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFeaturePrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturePrice(BigDecimal newFeaturePrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE, newFeaturePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoIdFrom() {
		return (Geo)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdFrom(Geo newGeoIdFrom) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM, newGeoIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoIdTo() {
		return (Geo)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__GEO_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdTo(Geo newGeoIdTo) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__GEO_ID_TO, newGeoIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderFlatPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderFlatPrice(BigDecimal newOrderFlatPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE, newOrderFlatPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderItemFlatPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemFlatPrice(BigDecimal newOrderItemFlatPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE, newOrderItemFlatPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderPricePercent() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPricePercent(BigDecimal newOrderPricePercent) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT, newOrderPricePercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOversizePrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversizePrice(BigDecimal newOversizePrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE, newOversizePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOversizeUnit() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversizeUnit(BigDecimal newOversizeUnit) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT, newOversizeUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getPriceBreak() {
		return (QuantityBreak)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_BREAK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceBreak(QuantityBreak newPriceBreak) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_BREAK, newPriceBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPriceUnitPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceUnitPrice(BigDecimal newPriceUnitPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE, newPriceUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getPriceUom() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceUom(Uom newPriceUom) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_UOM, newPriceUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureGroupId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureGroupId(String newProductFeatureGroupId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID, newProductFeatureGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreShipmentMeth getProductStoreShipMeth() {
		return (ProductStoreShipmentMeth)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreShipMeth(ProductStoreShipmentMeth newProductStoreShipMeth) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH, newProductStoreShipMeth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getQuantityBreak() {
		return (QuantityBreak)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityBreak(QuantityBreak newQuantityBreak) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK, newQuantityBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityUnitPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUnitPrice(BigDecimal newQuantityUnitPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE, newQuantityUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUom() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUom(Uom newQuantityUom) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM, newQuantityUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleType() {
		return (RoleType)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ROLE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleType(RoleType newRoleType) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ROLE_TYPE, newRoleType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentCostEstimateId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentCostEstimateId(String newShipmentCostEstimateId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID, newShipmentCostEstimateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentMethodTypeId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(String newShipmentMethodTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID, newShipmentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingPricePercent() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingPricePercent(BigDecimal newShippingPricePercent) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT, newShippingPricePercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getWeightBreak() {
		return (QuantityBreak)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightBreak(QuantityBreak newWeightBreak) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK, newWeightBreak);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getWeightUnitPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUnitPrice(BigDecimal newWeightUnitPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE, newWeightUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWeightUom() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUom(Uom newWeightUom) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM, newWeightUom);
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
				case Shipment_Package.SHIPMENT_COST_ESTIMATE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case Shipment_Package.SHIPMENT_COST_ESTIMATE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case Shipment_Package.SHIPMENT_COST_ESTIMATE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case Shipment_Package.SHIPMENT_COST_ESTIMATE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return Shipment_Package.SHIPMENT_COST_ESTIMATE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return Shipment_Package.SHIPMENT_COST_ESTIMATE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return Shipment_Package.SHIPMENT_COST_ESTIMATE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return Shipment_Package.SHIPMENT_COST_ESTIMATE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ShipmentCostEstimateImpl
