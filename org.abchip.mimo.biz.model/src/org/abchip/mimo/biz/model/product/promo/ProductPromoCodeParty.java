/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.promo;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Promo Code Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty#getProductPromoCode <em>Product Promo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty#getParty <em>Party</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCodeParty()
 * @model annotation="mimo-ent-frame title='Product Promotion Party' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPromoCodeParty extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code</em>' reference.
	 * @see #setProductPromoCode(ProductPromoCode)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCodeParty_ProductPromoCode()
	 * @model keys="productPromoCodeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPromoCode getProductPromoCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty#getProductPromoCode <em>Product Promo Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Code</em>' reference.
	 * @see #getProductPromoCode()
	 * @generated
	 */
	void setProductPromoCode(ProductPromoCode value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoCodeParty_Party()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoCodeParty#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

} // ProductPromoCodeParty
