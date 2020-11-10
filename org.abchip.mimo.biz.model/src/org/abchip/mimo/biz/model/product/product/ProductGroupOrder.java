/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.service.schedule.JobSandbox;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Group Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getGroupOrderId <em>Group Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getJob <em>Job</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getReqOrderQty <em>Req Order Qty</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getSoldOrderQty <em>Sold Order Qty</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductGroupOrder extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(JobSandbox)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder_Job()
	 * @model keys="jobId"
	 * @generated
	 */
	JobSandbox getJob();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(JobSandbox value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder_Product()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Group Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Order Id</em>' attribute.
	 * @see #setGroupOrderId(String)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder_GroupOrderId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGroupOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getGroupOrderId <em>Group Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Order Id</em>' attribute.
	 * @see #getGroupOrderId()
	 * @generated
	 */
	void setGroupOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Req Order Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Order Qty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Order Qty</em>' attribute.
	 * @see #setReqOrderQty(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder_ReqOrderQty()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReqOrderQty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getReqOrderQty <em>Req Order Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Order Qty</em>' attribute.
	 * @see #getReqOrderQty()
	 * @generated
	 */
	void setReqOrderQty(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sold Order Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sold Order Qty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sold Order Qty</em>' attribute.
	 * @see #setSoldOrderQty(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder_SoldOrderQty()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getSoldOrderQty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getSoldOrderQty <em>Sold Order Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sold Order Qty</em>' attribute.
	 * @see #getSoldOrderQty()
	 * @generated
	 */
	void setSoldOrderQty(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getProductGroupOrder_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.ProductGroupOrder#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ProductGroupOrder
