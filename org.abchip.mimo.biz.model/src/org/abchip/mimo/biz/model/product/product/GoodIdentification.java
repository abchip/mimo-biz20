/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.product;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Good Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.GoodIdentification#getGoodIdentificationType <em>Good Identification Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.GoodIdentification#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.product.GoodIdentification#getIdValue <em>Id Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getGoodIdentification()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface GoodIdentification extends EntityTyped<GoodIdentificationType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Good Identification Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Good Identification Type</em>' reference.
	 * @see #setGoodIdentificationType(GoodIdentificationType)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getGoodIdentification_GoodIdentificationType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GoodIdentificationType getGoodIdentificationType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.GoodIdentification#getGoodIdentificationType <em>Good Identification Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Good Identification Type</em>' reference.
	 * @see #getGoodIdentificationType()
	 * @generated
	 */
	void setGoodIdentificationType(GoodIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getGoodIdentification_Product()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.GoodIdentification#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Value</em>' attribute.
	 * @see #setIdValue(String)
	 * @see org.abchip.mimo.biz.model.product.product.ProductPackage#getGoodIdentification_IdValue()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getIdValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.product.GoodIdentification#getIdValue <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Value</em>' attribute.
	 * @see #getIdValue()
	 * @generated
	 */
	void setIdValue(String value);

} // GoodIdentification
