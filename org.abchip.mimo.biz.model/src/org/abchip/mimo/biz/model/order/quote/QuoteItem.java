/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.quote;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.humanres.ability.SkillType;
import org.abchip.mimo.biz.model.order.request.CustRequest;
import org.abchip.mimo.biz.model.product.feature.ProductFeature;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.workeffort.workeffort.DeliverableType;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getCustRequest <em>Cust Request</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getDeliverableType <em>Deliverable Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getIsPromo <em>Is Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getLeadTimeDays <em>Lead Time Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getProductFeature <em>Product Feature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuoteUnitPrice <em>Quote Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservStart <em>Reserv Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getSelectedAmount <em>Selected Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getSkillType <em>Skill Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getUom <em>Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem()
 * @model
 * @generated
 */
public interface QuoteItem extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Quote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote</em>' reference.
	 * @see #setQuote(Quote)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_Quote()
	 * @model keys="quoteId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Quote getQuote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuote <em>Quote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote</em>' reference.
	 * @see #getQuote()
	 * @generated
	 */
	void setQuote(Quote value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Id</em>' attribute.
	 * @see #setConfigId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_ConfigId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getConfigId <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Id</em>' attribute.
	 * @see #getConfigId()
	 * @generated
	 */
	void setConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request</em>' reference.
	 * @see #setCustRequest(CustRequest)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_CustRequest()
	 * @model keys="custRequestId"
	 * @generated
	 */
	CustRequest getCustRequest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getCustRequest <em>Cust Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request</em>' reference.
	 * @see #getCustRequest()
	 * @generated
	 */
	void setCustRequest(CustRequest value);

	/**
	 * Returns the value of the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #setCustRequestItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_CustRequestItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCustRequestItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 */
	void setCustRequestItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Deliverable Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable Type</em>' reference.
	 * @see #setDeliverableType(DeliverableType)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_DeliverableType()
	 * @model keys="deliverableTypeId"
	 * @generated
	 */
	DeliverableType getDeliverableType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getDeliverableType <em>Deliverable Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable Type</em>' reference.
	 * @see #getDeliverableType()
	 * @generated
	 */
	void setDeliverableType(DeliverableType value);

	/**
	 * Returns the value of the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #setEstimatedDeliveryDate(Date)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_EstimatedDeliveryDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedDeliveryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 */
	void setEstimatedDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Promo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Promo</em>' attribute.
	 * @see #setIsPromo(Boolean)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_IsPromo()
	 * @model
	 * @generated
	 */
	Boolean getIsPromo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getIsPromo <em>Is Promo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Promo</em>' attribute.
	 * @see #getIsPromo()
	 * @generated
	 */
	void setIsPromo(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lead Time Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lead Time Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lead Time Days</em>' attribute.
	 * @see #setLeadTimeDays(long)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_LeadTimeDays()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLeadTimeDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getLeadTimeDays <em>Lead Time Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lead Time Days</em>' attribute.
	 * @see #getLeadTimeDays()
	 * @generated
	 */
	void setLeadTimeDays(long value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_Product()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature</em>' reference.
	 * @see #setProductFeature(ProductFeature)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_ProductFeature()
	 * @model keys="productFeatureId"
	 * @generated
	 */
	ProductFeature getProductFeature();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getProductFeature <em>Product Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature</em>' reference.
	 * @see #getProductFeature()
	 * @generated
	 */
	void setProductFeature(ProductFeature value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #setQuoteItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_QuoteItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getQuoteItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #getQuoteItemSeqId()
	 * @generated
	 */
	void setQuoteItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Quote Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Unit Price</em>' attribute.
	 * @see #setQuoteUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_QuoteUnitPrice()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getQuoteUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getQuoteUnitPrice <em>Quote Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Unit Price</em>' attribute.
	 * @see #getQuoteUnitPrice()
	 * @generated
	 */
	void setQuoteUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Length</em>' attribute.
	 * @see #setReservLength(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_ReservLength()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservLength <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Length</em>' attribute.
	 * @see #getReservLength()
	 * @generated
	 */
	void setReservLength(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Persons</em>' attribute.
	 * @see #setReservPersons(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_ReservPersons()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservPersons();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservPersons <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Persons</em>' attribute.
	 * @see #getReservPersons()
	 * @generated
	 */
	void setReservPersons(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Start</em>' attribute.
	 * @see #setReservStart(Date)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_ReservStart()
	 * @model
	 * @generated
	 */
	Date getReservStart();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getReservStart <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Start</em>' attribute.
	 * @see #getReservStart()
	 * @generated
	 */
	void setReservStart(Date value);

	/**
	 * Returns the value of the '<em><b>Selected Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Amount</em>' attribute.
	 * @see #setSelectedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_SelectedAmount()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getSelectedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getSelectedAmount <em>Selected Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Amount</em>' attribute.
	 * @see #getSelectedAmount()
	 * @generated
	 */
	void setSelectedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Skill Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Type</em>' reference.
	 * @see #setSkillType(SkillType)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_SkillType()
	 * @model keys="skillTypeId"
	 * @generated
	 */
	SkillType getSkillType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getSkillType <em>Skill Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Type</em>' reference.
	 * @see #getSkillType()
	 * @generated
	 */
	void setSkillType(SkillType value);

	/**
	 * Returns the value of the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom</em>' reference.
	 * @see #setUom(Uom)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_Uom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getUom <em>Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' reference.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.order.quote.QuotePackage#getQuoteItem_WorkEffort()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.quote.QuoteItem#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

} // QuoteItem
