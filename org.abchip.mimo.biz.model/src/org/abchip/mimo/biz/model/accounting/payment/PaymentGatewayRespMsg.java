/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gateway Resp Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayRespMsg#getPaymentGatewayRespMsgId <em>Payment Gateway Resp Msg Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayRespMsg#getPaymentGatewayResponse <em>Payment Gateway Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayRespMsg#getPgrMessage <em>Pgr Message</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayRespMsg()
 * @model annotation="mimo-ent-frame title='Payment Gateway Response Message'"
 * @generated
 */
public interface PaymentGatewayRespMsg extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Payment Gateway Resp Msg Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Gateway Resp Msg Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Resp Msg Id</em>' attribute.
	 * @see #setPaymentGatewayRespMsgId(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayRespMsg_PaymentGatewayRespMsgId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentGatewayRespMsgId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayRespMsg#getPaymentGatewayRespMsgId <em>Payment Gateway Resp Msg Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Resp Msg Id</em>' attribute.
	 * @see #getPaymentGatewayRespMsgId()
	 * @generated
	 */
	void setPaymentGatewayRespMsgId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Gateway Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Response</em>' reference.
	 * @see #setPaymentGatewayResponse(PaymentGatewayResponse)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayRespMsg_PaymentGatewayResponse()
	 * @model
	 * @generated
	 */
	PaymentGatewayResponse getPaymentGatewayResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayRespMsg#getPaymentGatewayResponse <em>Payment Gateway Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Response</em>' reference.
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	void setPaymentGatewayResponse(PaymentGatewayResponse value);

	/**
	 * Returns the value of the '<em><b>Pgr Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgr Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgr Message</em>' attribute.
	 * @see #setPgrMessage(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getPaymentGatewayRespMsg_PgrMessage()
	 * @model
	 * @generated
	 */
	String getPgrMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.PaymentGatewayRespMsg#getPgrMessage <em>Pgr Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgr Message</em>' attribute.
	 * @see #getPgrMessage()
	 * @generated
	 */
	void setPgrMessage(String value);

} // PaymentGatewayRespMsg
