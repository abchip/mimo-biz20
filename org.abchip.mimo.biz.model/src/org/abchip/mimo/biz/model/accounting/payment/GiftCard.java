/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.payment;

import org.abchip.mimo.biz.model.party.contact.ContactMech;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gift Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.GiftCard#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.GiftCard#getContactMech <em>Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.GiftCard#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.payment.GiftCard#getPinNumber <em>Pin Number</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getGiftCard()
 * @model annotation="mimo-ent-frame title='Gift Card Information' formula='description'"
 * @generated
 */
public interface GiftCard extends PaymentMethod {
	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getGiftCard_CardNumber()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.GiftCard#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech</em>' reference.
	 * @see #setContactMech(ContactMech)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getGiftCard_ContactMech()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMech();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.GiftCard#getContactMech <em>Contact Mech</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech</em>' reference.
	 * @see #getContactMech()
	 * @generated
	 */
	void setContactMech(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire Date</em>' attribute.
	 * @see #setExpireDate(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getGiftCard_ExpireDate()
	 * @model annotation="mimo-ent-format type='credit-card-date'"
	 * @generated
	 */
	String getExpireDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.GiftCard#getExpireDate <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Date</em>' attribute.
	 * @see #getExpireDate()
	 * @generated
	 */
	void setExpireDate(String value);

	/**
	 * Returns the value of the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Number</em>' attribute.
	 * @see #setPinNumber(String)
	 * @see org.abchip.mimo.biz.model.accounting.payment.PaymentPackage#getGiftCard_PinNumber()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPinNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.payment.GiftCard#getPinNumber <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Number</em>' attribute.
	 * @see #getPinNumber()
	 * @generated
	 */
	void setPinNumber(String value);

} // GiftCard
