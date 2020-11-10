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
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getShipment <em>Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getBoxHeight <em>Box Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getBoxLength <em>Box Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getBoxWidth <em>Box Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getDimensionUom <em>Dimension Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getInsuredValue <em>Insured Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getShipmentBoxType <em>Shipment Box Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getWeightUom <em>Weight Uom</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage()
 * @model
 * @generated
 */
public interface ShipmentPackage extends EntityTyped<ShipmentBoxType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment</em>' reference.
	 * @see #setShipment(Shipment)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_Shipment()
	 * @model keys="shipmentId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Shipment getShipment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getShipment <em>Shipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment</em>' reference.
	 * @see #getShipment()
	 * @generated
	 */
	void setShipment(Shipment value);

	/**
	 * Returns the value of the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Package Seq Id</em>' attribute.
	 * @see #setShipmentPackageSeqId(String)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_ShipmentPackageSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipmentPackageSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Package Seq Id</em>' attribute.
	 * @see #getShipmentPackageSeqId()
	 * @generated
	 */
	void setShipmentPackageSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Box Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Height</em>' attribute.
	 * @see #setBoxHeight(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_BoxHeight()
	 * @model annotation="mimo-ent-slot help='This field store the height of package; if a shipmentBoxTypeId is specified then this overrides the dimension specified there; this field is meant to be used when there is no applicable ShipmentBoxType'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getBoxHeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getBoxHeight <em>Box Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Height</em>' attribute.
	 * @see #getBoxHeight()
	 * @generated
	 */
	void setBoxHeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Box Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Length</em>' attribute.
	 * @see #setBoxLength(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_BoxLength()
	 * @model annotation="mimo-ent-slot help='This field store the length of package; if a shipmentBoxTypeId is specified then this overrides the dimension specified there; this field is meant to be used when there is no applicable ShipmentBoxType'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getBoxLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getBoxLength <em>Box Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Length</em>' attribute.
	 * @see #getBoxLength()
	 * @generated
	 */
	void setBoxLength(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Box Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Width</em>' attribute.
	 * @see #setBoxWidth(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_BoxWidth()
	 * @model annotation="mimo-ent-slot help='This field store the width of package; if a shipmentBoxTypeId is specified then this overrides the dimension specified there; this field is meant to be used when there is no applicable ShipmentBoxType'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getBoxWidth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getBoxWidth <em>Box Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Width</em>' attribute.
	 * @see #getBoxWidth()
	 * @generated
	 */
	void setBoxWidth(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(Date)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_DateCreated()
	 * @model
	 * @generated
	 */
	Date getDateCreated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Dimension Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Uom</em>' reference.
	 * @see #setDimensionUom(Uom)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_DimensionUom()
	 * @model keys="uomId"
	 *        annotation="mimo-ent-slot help='This field store the unit of measurement of dimension (length, width and height)'"
	 * @generated
	 */
	Uom getDimensionUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getDimensionUom <em>Dimension Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Uom</em>' reference.
	 * @see #getDimensionUom()
	 * @generated
	 */
	void setDimensionUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Insured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insured Value</em>' attribute.
	 * @see #setInsuredValue(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_InsuredValue()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getInsuredValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getInsuredValue <em>Insured Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insured Value</em>' attribute.
	 * @see #getInsuredValue()
	 * @generated
	 */
	void setInsuredValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Shipment Box Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Box Type</em>' reference.
	 * @see #setShipmentBoxType(ShipmentBoxType)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_ShipmentBoxType()
	 * @model keys="shipmentBoxTypeId"
	 * @generated
	 */
	ShipmentBoxType getShipmentBoxType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getShipmentBoxType <em>Shipment Box Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Box Type</em>' reference.
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	void setShipmentBoxType(ShipmentBoxType value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_Weight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Weight Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Uom</em>' reference.
	 * @see #setWeightUom(Uom)
	 * @see org.abchip.mimo.biz.model.shipment.shipment.Shipment_Package#getShipmentPackage_WeightUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getWeightUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.shipment.shipment.ShipmentPackage#getWeightUom <em>Weight Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Uom</em>' reference.
	 * @see #getWeightUom()
	 * @generated
	 */
	void setWeightUom(Uom value);

} // ShipmentPackage
