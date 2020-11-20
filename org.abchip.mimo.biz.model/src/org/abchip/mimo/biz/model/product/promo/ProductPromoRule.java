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
 * A representation of the model object '<em><b>Product Promo Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getProductPromo <em>Product Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getRuleName <em>Rule Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoRule()
 * @model annotation="mimo-ent-frame title='Product Promotion Rule' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPromoRule extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Promo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo</em>' reference.
	 * @see #setProductPromo(ProductPromo)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoRule_ProductPromo()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPromo getProductPromo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getProductPromo <em>Product Promo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo</em>' reference.
	 * @see #getProductPromo()
	 * @generated
	 */
	void setProductPromo(ProductPromo value);

	/**
	 * Returns the value of the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #setProductPromoRuleId(String)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoRule_ProductPromoRuleId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPromoRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getProductPromoRuleId <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #getProductPromoRuleId()
	 * @generated
	 */
	void setProductPromoRuleId(String value);

	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Name</em>' attribute.
	 * @see #setRuleName(String)
	 * @see org.abchip.mimo.biz.model.product.promo.PromoPackage#getProductPromoRule_RuleName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getRuleName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.promo.ProductPromoRule#getRuleName <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' attribute.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(String value);

} // ProductPromoRule
