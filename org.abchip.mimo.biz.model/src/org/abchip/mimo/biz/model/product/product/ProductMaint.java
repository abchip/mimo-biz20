/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Maint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getIntervalMeterType <em>Interval Meter Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getIntervalQuantity <em>Interval Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getIntervalUom <em>Interval Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getMaintName <em>Maint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getMaintTemplateWorkEffort <em>Maint Template Work Effort</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getProductMaintType <em>Product Maint Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getRepeatCount <em>Repeat Count</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint()
 * @model annotation="mimo-ent-frame help='This is used to specify the details for scheduled maintenance.' title='Product Maintenance' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductMaint extends EntityTyped<ProductMaintType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_Product()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

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
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_IntervalQuantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getIntervalQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getIntervalQuantity <em>Interval Quantity</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_IntervalUom()
	 * @model annotation="mimo-ent-slot help='UOM for intervalQuantity; if used intervalMeterTypeId is generally not used (ie one or the other)'"
	 * @generated
	 */
	Uom getIntervalUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getIntervalUom <em>Interval Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Uom</em>' reference.
	 * @see #getIntervalUom()
	 * @generated
	 */
	void setIntervalUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Maint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Name</em>' attribute.
	 * @see #setMaintName(String)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_MaintName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getMaintName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getMaintName <em>Maint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Name</em>' attribute.
	 * @see #getMaintName()
	 * @generated
	 */
	void setMaintName(String value);

	/**
	 * Returns the value of the '<em><b>Maint Template Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Template Work Effort</em>' reference.
	 * @see #setMaintTemplateWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_MaintTemplateWorkEffort()
	 * @model annotation="mimo-ent-slot help='Template of Maintenance Plan. WorkEffort may have WorkEffortAssocs for tasks/breakdown detailes'"
	 * @generated
	 */
	WorkEffort getMaintTemplateWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getMaintTemplateWorkEffort <em>Maint Template Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Template Work Effort</em>' reference.
	 * @see #getMaintTemplateWorkEffort()
	 * @generated
	 */
	void setMaintTemplateWorkEffort(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Product Maint Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maint Type</em>' reference.
	 * @see #setProductMaintType(ProductMaintType)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_ProductMaintType()
	 * @model
	 * @generated
	 */
	ProductMaintType getProductMaintType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getProductMaintType <em>Product Maint Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Type</em>' reference.
	 * @see #getProductMaintType()
	 * @generated
	 */
	void setProductMaintType(ProductMaintType value);

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
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_ProductMaintSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductMaintSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Maint Seq Id</em>' attribute.
	 * @see #getProductMaintSeqId()
	 * @generated
	 */
	void setProductMaintSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Interval Meter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval Meter Type</em>' reference.
	 * @see #setIntervalMeterType(ProductMeterType)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_IntervalMeterType()
	 * @model annotation="mimo-ent-slot help='Meter Type for intervalQuantity; if used intervalUomId is generally not used (ie one or the other)'"
	 * @generated
	 */
	ProductMeterType getIntervalMeterType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getIntervalMeterType <em>Interval Meter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval Meter Type</em>' reference.
	 * @see #getIntervalMeterType()
	 * @generated
	 */
	void setIntervalMeterType(ProductMeterType value);

	/**
	 * Returns the value of the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Count</em>' attribute.
	 * @see #setRepeatCount(long)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductMaint_RepeatCount()
	 * @model annotation="mimo-ent-slot help='If 0 or null means no limit to repeat count; can be used with multiple ProductMaint records for a single ProductMaintType in cases where maintenance intervals are not evenly distributed, or only need to be done once like a break-in period'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getRepeatCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductMaint#getRepeatCount <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Count</em>' attribute.
	 * @see #getRepeatCount()
	 * @generated
	 */
	void setRepeatCount(long value);

} // ProductMaint
