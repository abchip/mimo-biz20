/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.price;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Payment Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPaymentMethodType()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPaymentMethodType extends EntityType<ProductPricePurpose>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPaymentMethodType_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #setPaymentMethodTypeId(PaymentMethodType)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPaymentMethodType_PaymentMethodTypeId()
	 * @model keys="paymentMethodTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PaymentMethodType getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPaymentMethodType_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPaymentMethodType_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

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
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPaymentMethodType_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Price Purpose Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Purpose Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Purpose Id</em>' reference.
	 * @see #setProductPricePurposeId(ProductPricePurpose)
	 * @see org.abchip.mimo.biz.model.product.price.PricePackage#getProductPaymentMethodType_ProductPricePurposeId()
	 * @model keys="productPricePurposeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPricePurpose getProductPricePurposeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.price.ProductPaymentMethodType#getProductPricePurposeId <em>Product Price Purpose Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Purpose Id</em>' reference.
	 * @see #getProductPricePurposeId()
	 * @generated
	 */
	void setProductPricePurposeId(ProductPricePurpose value);

} // ProductPaymentMethodType
