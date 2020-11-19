/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.supplier.impl;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.product.supplier.SupplierPackage;
import org.abchip.mimo.biz.model.product.supplier.SupplierPrefOrder;
import org.abchip.mimo.biz.model.product.supplier.SupplierProduct;
import org.abchip.mimo.biz.model.product.supplier.SupplierRatingType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getAvailableFromDate <em>Available From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getAvailableThruDate <em>Available Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#isCanDropShip <em>Can Drop Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getLastPrice <em>Last Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getOrderQtyIncrements <em>Order Qty Increments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getQuantityUom <em>Quantity Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getShippingPrice <em>Shipping Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getStandardLeadTimeDays <em>Standard Lead Time Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getSupplierPrefOrder <em>Supplier Pref Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getSupplierProductId <em>Supplier Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getSupplierProductName <em>Supplier Product Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getSupplierRatingType <em>Supplier Rating Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.supplier.impl.SupplierProductImpl#getUnitsIncluded <em>Units Included</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierProductImpl extends EntityIdentifiableImpl implements SupplierProduct {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplierPackage.Literals.SUPPLIER_PRODUCT;
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
	public Product getProduct() {
		return (Product)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getParty() {
		return (Party)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParty(Party newParty) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__PARTY, newParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementId() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AGREEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(String newAgreementId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AGREEMENT_ID, newAgreementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementItemSeqId() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemSeqId(String newAgreementItemSeqId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID, newAgreementItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAvailableFromDate() {
		return (Date)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableFromDate(Date newAvailableFromDate) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE, newAvailableFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAvailableThruDate() {
		return (Date)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableThruDate(Date newAvailableThruDate) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE, newAvailableThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanDropShip() {
		return (Boolean)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__CAN_DROP_SHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanDropShip(boolean newCanDropShip) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__CAN_DROP_SHIP, newCanDropShip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLastPrice() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__LAST_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPrice(BigDecimal newLastPrice) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__LAST_PRICE, newLastPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinimumOrderQuantity() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumOrderQuantity(BigDecimal newMinimumOrderQuantity) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY, newMinimumOrderQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderQtyIncrements() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderQtyIncrements(BigDecimal newOrderQtyIncrements) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS, newOrderQtyIncrements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUom() {
		return (Uom)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__QUANTITY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUom(Uom newQuantityUom) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__QUANTITY_UOM, newQuantityUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingPrice() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SHIPPING_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingPrice(BigDecimal newShippingPrice) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SHIPPING_PRICE, newShippingPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStandardLeadTimeDays() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardLeadTimeDays(BigDecimal newStandardLeadTimeDays) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS, newStandardLeadTimeDays);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierPrefOrder getSupplierPrefOrder() {
		return (SupplierPrefOrder)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierPrefOrder(SupplierPrefOrder newSupplierPrefOrder) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER, newSupplierPrefOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierProductId() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierProductId(String newSupplierProductId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID, newSupplierProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierProductName() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierProductName(String newSupplierProductName) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME, newSupplierProductName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierRatingType getSupplierRatingType() {
		return (SupplierRatingType)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierRatingType(SupplierRatingType newSupplierRatingType) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE, newSupplierRatingType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitsIncluded() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__UNITS_INCLUDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsIncluded(BigDecimal newUnitsIncluded) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__UNITS_INCLUDED, newUnitsIncluded);
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
				case SupplierPackage.SUPPLIER_PRODUCT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case SupplierPackage.SUPPLIER_PRODUCT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case SupplierPackage.SUPPLIER_PRODUCT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case SupplierPackage.SUPPLIER_PRODUCT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return SupplierPackage.SUPPLIER_PRODUCT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return SupplierPackage.SUPPLIER_PRODUCT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return SupplierPackage.SUPPLIER_PRODUCT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return SupplierPackage.SUPPLIER_PRODUCT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SupplierProductImpl
