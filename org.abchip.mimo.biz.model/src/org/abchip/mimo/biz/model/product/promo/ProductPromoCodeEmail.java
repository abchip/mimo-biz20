/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.promo;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Promo Code Email</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail#getProductPromoCode <em>Product Promo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail#getEmailAddress <em>Email Address</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCodeEmail()
 * @model annotation="mimo-ent-frame title='Product Promotion Email' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPromoCodeEmail extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code</em>' reference.
	 * @see #setProductPromoCode(ProductPromoCode)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCodeEmail_ProductPromoCode()
	 * @model keys="productPromoCodeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPromoCode getProductPromoCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail#getProductPromoCode <em>Product Promo Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Code</em>' reference.
	 * @see #getProductPromoCode()
	 * @generated
	 */
	void setProductPromoCode(ProductPromoCode value);

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute.
	 * @see #setEmailAddress(String)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCodeEmail_EmailAddress()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format type='email'"
	 * @generated
	 */
	String getEmailAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeEmail#getEmailAddress <em>Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Address</em>' attribute.
	 * @see #getEmailAddress()
	 * @generated
	 */
	void setEmailAddress(String value);

} // ProductPromoCodeEmail
