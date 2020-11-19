/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getPaymentTypeId <em>Payment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getParentType <em>Parent Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getPaymentGlAccountTypeMaps <em>Payment Gl Account Type Maps</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getPaymentTypeAttrs <em>Payment Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentType()
 * @model annotation="mimo-ent-frame dictionary='AccountingEntityLabels' formula='description'"
 * @generated
 */
public interface PaymentType extends EntityType<Payment>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(PaymentType)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentType_ParentType()
	 * @model keys="paymentTypeId"
	 * @generated
	 */
	PaymentType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(PaymentType value);

	/**
	 * Returns the value of the '<em><b>Payment Gl Account Type Maps</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.payment.PaymentGlAccountTypeMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gl Account Type Maps</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentType_PaymentGlAccountTypeMaps()
	 * @model derived="true"
	 * @generated
	 */
	List<PaymentGlAccountTypeMap> getPaymentGlAccountTypeMaps();

	/**
	 * Returns the value of the '<em><b>Payment Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.payment.PaymentTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentType_PaymentTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<PaymentTypeAttr> getPaymentTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Payment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type Id</em>' attribute.
	 * @see #setPaymentTypeId(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentType_PaymentTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentType#getPaymentTypeId <em>Payment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type Id</em>' attribute.
	 * @see #getPaymentTypeId()
	 * @generated
	 */
	void setPaymentTypeId(String value);

} // PaymentType
