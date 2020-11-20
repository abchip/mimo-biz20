/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.store;

import org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Payment Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getProductStore <em>Product Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentMethodType <em>Payment Method Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentServiceTypeEnum <em>Payment Service Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#isApplyToAllProducts <em>Apply To All Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentCustomMethod <em>Payment Custom Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentGatewayConfig <em>Payment Gateway Config</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentPropertiesPath <em>Payment Properties Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentService <em>Payment Service</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting()
 * @model annotation="mimo-ent-frame title='Product Store Payment Settings' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStorePaymentSetting extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store</em>' reference.
	 * @see #setProductStore(ProductStore)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting_ProductStore()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getProductStore <em>Product Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store</em>' reference.
	 * @see #getProductStore()
	 * @generated
	 */
	void setProductStore(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type</em>' reference.
	 * @see #setPaymentMethodType(PaymentMethodType)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting_PaymentMethodType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PaymentMethodType getPaymentMethodType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentMethodType <em>Payment Method Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type</em>' reference.
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	void setPaymentMethodType(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Payment Service Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Service Type Enum</em>' reference.
	 * @see #setPaymentServiceTypeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting_PaymentServiceTypeEnum()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Enumeration getPaymentServiceTypeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentServiceTypeEnum <em>Payment Service Type Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Service Type Enum</em>' reference.
	 * @see #getPaymentServiceTypeEnum()
	 * @generated
	 */
	void setPaymentServiceTypeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Apply To All Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply To All Products</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To All Products</em>' attribute.
	 * @see #setApplyToAllProducts(boolean)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting_ApplyToAllProducts()
	 * @model required="true"
	 * @generated
	 */
	boolean isApplyToAllProducts();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#isApplyToAllProducts <em>Apply To All Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To All Products</em>' attribute.
	 * @see #isApplyToAllProducts()
	 * @generated
	 */
	void setApplyToAllProducts(boolean value);

	/**
	 * Returns the value of the '<em><b>Payment Custom Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Custom Method</em>' reference.
	 * @see #setPaymentCustomMethod(CustomMethod)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting_PaymentCustomMethod()
	 * @model
	 * @generated
	 */
	CustomMethod getPaymentCustomMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentCustomMethod <em>Payment Custom Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Custom Method</em>' reference.
	 * @see #getPaymentCustomMethod()
	 * @generated
	 */
	void setPaymentCustomMethod(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Payment Gateway Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Config</em>' reference.
	 * @see #setPaymentGatewayConfig(PaymentGatewayConfig)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting_PaymentGatewayConfig()
	 * @model
	 * @generated
	 */
	PaymentGatewayConfig getPaymentGatewayConfig();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentGatewayConfig <em>Payment Gateway Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config</em>' reference.
	 * @see #getPaymentGatewayConfig()
	 * @generated
	 */
	void setPaymentGatewayConfig(PaymentGatewayConfig value);

	/**
	 * Returns the value of the '<em><b>Payment Properties Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Properties Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Properties Path</em>' attribute.
	 * @see #setPaymentPropertiesPath(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting_PaymentPropertiesPath()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPaymentPropertiesPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentPropertiesPath <em>Payment Properties Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Properties Path</em>' attribute.
	 * @see #getPaymentPropertiesPath()
	 * @generated
	 */
	void setPaymentPropertiesPath(String value);

	/**
	 * Returns the value of the '<em><b>Payment Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Service</em>' attribute.
	 * @see #setPaymentService(String)
	 * @see org.abchip.mimo.biz.model.product.store.StorePackage#getProductStorePaymentSetting_PaymentService()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPaymentService();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.store.ProductStorePaymentSetting#getPaymentService <em>Payment Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Service</em>' attribute.
	 * @see #getPaymentService()
	 * @generated
	 */
	void setPaymentService(String value);

} // ProductStorePaymentSetting
