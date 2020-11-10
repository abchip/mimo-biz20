/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.promo;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.order.order.OrderHeader;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Promo Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getOrder <em>Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getPromoSequenceId <em>Promo Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getProductPromo <em>Product Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getProductPromoCode <em>Product Promo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getQuantityLeftInActions <em>Quantity Left In Actions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getTotalDiscountAmount <em>Total Discount Amount</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoUse()
 * @model annotation="mimo-ent-frame title='Product Promotion Use' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPromoUse extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' reference.
	 * @see #setOrder(OrderHeader)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoUse_Order()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getOrder <em>Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Promo Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promo Sequence Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promo Sequence Id</em>' attribute.
	 * @see #setPromoSequenceId(String)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoUse_PromoSequenceId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPromoSequenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getPromoSequenceId <em>Promo Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promo Sequence Id</em>' attribute.
	 * @see #getPromoSequenceId()
	 * @generated
	 */
	void setPromoSequenceId(String value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoUse_Party()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo</em>' reference.
	 * @see #setProductPromo(ProductPromo)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoUse_ProductPromo()
	 * @model keys="productPromoId"
	 * @generated
	 */
	ProductPromo getProductPromo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getProductPromo <em>Product Promo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo</em>' reference.
	 * @see #getProductPromo()
	 * @generated
	 */
	void setProductPromo(ProductPromo value);

	/**
	 * Returns the value of the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code</em>' reference.
	 * @see #setProductPromoCode(ProductPromoCode)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoUse_ProductPromoCode()
	 * @model keys="productPromoCodeId"
	 * @generated
	 */
	ProductPromoCode getProductPromoCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getProductPromoCode <em>Product Promo Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Code</em>' reference.
	 * @see #getProductPromoCode()
	 * @generated
	 */
	void setProductPromoCode(ProductPromoCode value);

	/**
	 * Returns the value of the '<em><b>Quantity Left In Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Left In Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Left In Actions</em>' attribute.
	 * @see #setQuantityLeftInActions(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoUse_QuantityLeftInActions()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityLeftInActions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getQuantityLeftInActions <em>Quantity Left In Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Left In Actions</em>' attribute.
	 * @see #getQuantityLeftInActions()
	 * @generated
	 */
	void setQuantityLeftInActions(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Total Discount Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Discount Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Discount Amount</em>' attribute.
	 * @see #setTotalDiscountAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoUse_TotalDiscountAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getTotalDiscountAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoUse#getTotalDiscountAmount <em>Total Discount Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Discount Amount</em>' attribute.
	 * @see #getTotalDiscountAmount()
	 * @generated
	 */
	void setTotalDiscountAmount(BigDecimal value);

} // ProductPromoUse
