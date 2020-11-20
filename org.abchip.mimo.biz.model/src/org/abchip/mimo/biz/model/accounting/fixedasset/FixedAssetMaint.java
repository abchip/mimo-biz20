/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.fixedasset;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.product.product.ProductMaintType;
import org.abchip.mimo.biz.model.product.product.ProductMeterType;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset Maint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getIntervalMeterType <em>Interval Meter Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getIntervalUom <em>Interval Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getProductMaintType <em>Product Maint Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getPurchaseOrder <em>Purchase Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getScheduleWorkEffort <em>Schedule Work Effort</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint()
 * @model annotation="mimo-ent-frame title='Fixed Asset Maintenance'"
 * @generated
 */
public interface FixedAssetMaint extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset</em>' reference.
	 * @see #setFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_FixedAsset()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FixedAsset getFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getFixedAsset <em>Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset</em>' reference.
	 * @see #getFixedAsset()
	 * @generated
	 */
	void setFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Interval Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Quantity</em>' attribute.
	 * @see #setIntervalQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_IntervalQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getIntervalQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getIntervalQuantity <em>Interval Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Quantity</em>' attribute.
	 * @see #getIntervalQuantity()
	 * @generated
	 */
	void setIntervalQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Interval Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Uom</em>' reference.
	 * @see #setIntervalUom(Uom)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_IntervalUom()
	 * @model annotation="mimo-ent-slot help='UOM for intervalQuantity; if used intervalMeterTypeId is generally not used (ie one or the other); if a meter reading is done as well that is not tied to the interval it should be tracked in a FixedAssetMeter record'"
	 * @generated
	 */
	Uom getIntervalUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getIntervalUom <em>Interval Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Uom</em>' reference.
	 * @see #getIntervalUom()
	 * @generated
	 */
	void setIntervalUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Hist Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #setMaintHistSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_MaintHistSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getMaintHistSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getMaintHistSeqId <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #getMaintHistSeqId()
	 * @generated
	 */
	void setMaintHistSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Interval Meter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Meter Type</em>' reference.
	 * @see #setIntervalMeterType(ProductMeterType)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_IntervalMeterType()
	 * @model annotation="mimo-ent-slot help='Meter Type for intervalQuantity; if used intervalUomId is generally not used (ie one or the other)'"
	 * @generated
	 */
	ProductMeterType getIntervalMeterType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getIntervalMeterType <em>Interval Meter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Meter Type</em>' reference.
	 * @see #getIntervalMeterType()
	 * @generated
	 */
	void setIntervalMeterType(ProductMeterType value);

	/**
	 * Returns the value of the '<em><b>Product Maint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Maint Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maint Seq Id</em>' attribute.
	 * @see #setProductMaintSeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_ProductMaintSeqId()
	 * @model annotation="mimo-ent-slot help='Optional, though should be filled in to determine upcoming maintenance for all scheduled maintenance'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductMaintSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Seq Id</em>' attribute.
	 * @see #getProductMaintSeqId()
	 * @generated
	 */
	void setProductMaintSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Maint Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maint Type</em>' reference.
	 * @see #setProductMaintType(ProductMaintType)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_ProductMaintType()
	 * @model annotation="mimo-ent-slot help='If productMaintSeqId is known can lookup using that and the FixedAsset.productId; for un-scheduled maintenance is filled in directly'"
	 * @generated
	 */
	ProductMaintType getProductMaintType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getProductMaintType <em>Product Maint Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Type</em>' reference.
	 * @see #getProductMaintType()
	 * @generated
	 */
	void setProductMaintType(ProductMaintType value);

	/**
	 * Returns the value of the '<em><b>Purchase Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Order</em>' reference.
	 * @see #setPurchaseOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_PurchaseOrder()
	 * @model
	 * @generated
	 */
	OrderHeader getPurchaseOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getPurchaseOrder <em>Purchase Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Order</em>' reference.
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	void setPurchaseOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Schedule Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Work Effort</em>' reference.
	 * @see #setScheduleWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_ScheduleWorkEffort()
	 * @model annotation="mimo-ent-slot help='Has field for estimated/actual start and finish dates, etc'"
	 * @generated
	 */
	WorkEffort getScheduleWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getScheduleWorkEffort <em>Schedule Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Work Effort</em>' reference.
	 * @see #getScheduleWorkEffort()
	 * @generated
	 */
	void setScheduleWorkEffort(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.fixedasset.FixedassetPackage#getFixedAssetMaint_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetMaint#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

} // FixedAssetMaint
