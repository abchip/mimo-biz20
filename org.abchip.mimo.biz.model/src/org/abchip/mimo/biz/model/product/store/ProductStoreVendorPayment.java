/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.store;

import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Vendor Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreVendorPayment#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreVendorPayment#getVendorParty <em>Vendor Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreVendorPayment#getPaymentMethodType <em>Payment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStoreVendorPayment#getCreditCardEnum <em>Credit Card Enum</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreVendorPayment()
 * @model annotation="mimo-ent-frame help='Used to define payments that a vendor related to the store will accept (for multi-vendor stores)' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStoreVendorPayment extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreVendorPayment_ProductStore()
	 * @model keys="productStoreId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreVendorPayment#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Vendor Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party</em>' reference.
	 * @see #setVendorParty(Party)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreVendorPayment_VendorParty()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getVendorParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreVendorPayment#getVendorParty <em>Vendor Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party</em>' reference.
	 * @see #getVendorParty()
	 * @generated
	 */
	void setVendorParty(Party value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type</em>' reference.
	 * @see #setPaymentMethodType(PaymentMethodType)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreVendorPayment_PaymentMethodType()
	 * @model keys="paymentMethodTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PaymentMethodType getPaymentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreVendorPayment#getPaymentMethodType <em>Payment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type</em>' reference.
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	void setPaymentMethodType(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Credit Card Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Enum</em>' reference.
	 * @see #setCreditCardEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStoreVendorPayment_CreditCardEnum()
	 * @model keys="enumId" required="true"
	 *        annotation="mimo-ent-slot key='true' help='If not applicable for the paymentMethodTypeId, use \"_NA_\"'"
	 * @generated
	 */
	Enumeration getCreditCardEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStoreVendorPayment#getCreditCardEnum <em>Credit Card Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Enum</em>' reference.
	 * @see #getCreditCardEnum()
	 * @generated
	 */
	void setCreditCardEnum(Enumeration value);

} // ProductStoreVendorPayment
