/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.price;

import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Price Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getProductPriceRule <em>Product Price Rule</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getProductPriceCondSeqId <em>Product Price Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getInputParamEnum <em>Input Param Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getOperatorEnum <em>Operator Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPriceCond()
 * @model annotation="mimo-ent-frame title='Product Price Condition' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPriceCond extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Price Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Rule</em>' reference.
	 * @see #setProductPriceRule(ProductPriceRule)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPriceCond_ProductPriceRule()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPriceRule getProductPriceRule();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getProductPriceRule <em>Product Price Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Rule</em>' reference.
	 * @see #getProductPriceRule()
	 * @generated
	 */
	void setProductPriceRule(ProductPriceRule value);

	/**
	 * Returns the value of the '<em><b>Cond Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Value</em>' attribute.
	 * @see #setCondValue(String)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPriceCond_CondValue()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCondValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getCondValue <em>Cond Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Value</em>' attribute.
	 * @see #getCondValue()
	 * @generated
	 */
	void setCondValue(String value);

	/**
	 * Returns the value of the '<em><b>Input Param Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Param Enum</em>' reference.
	 * @see #setInputParamEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPriceCond_InputParamEnum()
	 * @model
	 * @generated
	 */
	Enumeration getInputParamEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getInputParamEnum <em>Input Param Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Param Enum</em>' reference.
	 * @see #getInputParamEnum()
	 * @generated
	 */
	void setInputParamEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Operator Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Enum</em>' reference.
	 * @see #setOperatorEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPriceCond_OperatorEnum()
	 * @model
	 * @generated
	 */
	Enumeration getOperatorEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getOperatorEnum <em>Operator Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Enum</em>' reference.
	 * @see #getOperatorEnum()
	 * @generated
	 */
	void setOperatorEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Product Price Cond Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Cond Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Cond Seq Id</em>' attribute.
	 * @see #setProductPriceCondSeqId(String)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPriceCond_ProductPriceCondSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPriceCondSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPriceCond#getProductPriceCondSeqId <em>Product Price Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Cond Seq Id</em>' attribute.
	 * @see #getProductPriceCondSeqId()
	 * @generated
	 */
	void setProductPriceCondSeqId(String value);

} // ProductPriceCond
