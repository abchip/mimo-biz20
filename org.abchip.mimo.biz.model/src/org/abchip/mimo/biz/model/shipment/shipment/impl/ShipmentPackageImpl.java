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
import org.abchip.mimo.biz.model.common.uom.Uom;

import org.abchip.mimo.biz.model.shipment.shipment.Shipment;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentBoxType;
import org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage;
import org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getBoxLength <em>Box Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getDimensionUomId <em>Dimension Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getInsuredValue <em>Insured Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.impl.ShipmentPackageImpl#getWeightUomId <em>Weight Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentPackageImpl extends EntityTypedImpl<ShipmentBoxType> implements ShipmentPackage {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_PACKAGE;
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
	public Shipment getShipmentId() {
		return (Shipment)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__SHIPMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__SHIPMENT_ID, newShipmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentPackageSeqId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentPackageSeqId(String newShipmentPackageSeqId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID, newShipmentPackageSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBoxHeight() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__BOX_HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxHeight(BigDecimal newBoxHeight) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__BOX_HEIGHT, newBoxHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBoxLength() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__BOX_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxLength(BigDecimal newBoxLength) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__BOX_LENGTH, newBoxLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBoxWidth() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__BOX_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoxWidth(BigDecimal newBoxWidth) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__BOX_WIDTH, newBoxWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateCreated() {
		return (Date)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__DATE_CREATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateCreated(Date newDateCreated) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__DATE_CREATED, newDateCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDimensionUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__DIMENSION_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimensionUomId(Uom newDimensionUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__DIMENSION_UOM_ID, newDimensionUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getInsuredValue() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__INSURED_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsuredValue(BigDecimal newInsuredValue) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__INSURED_VALUE, newInsuredValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentBoxType getShipmentBoxTypeId() {
		return (ShipmentBoxType)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentBoxTypeId(ShipmentBoxType newShipmentBoxTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID, newShipmentBoxTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getWeight() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(BigDecimal newWeight) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWeightUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_PACKAGE__WEIGHT_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUomId(Uom newWeightUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_PACKAGE__WEIGHT_UOM_ID, newWeightUomId);
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
				case Shipment_Package.SHIPMENT_PACKAGE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case Shipment_Package.SHIPMENT_PACKAGE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case Shipment_Package.SHIPMENT_PACKAGE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case Shipment_Package.SHIPMENT_PACKAGE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return Shipment_Package.SHIPMENT_PACKAGE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return Shipment_Package.SHIPMENT_PACKAGE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return Shipment_Package.SHIPMENT_PACKAGE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return Shipment_Package.SHIPMENT_PACKAGE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ShipmentPackageImpl
