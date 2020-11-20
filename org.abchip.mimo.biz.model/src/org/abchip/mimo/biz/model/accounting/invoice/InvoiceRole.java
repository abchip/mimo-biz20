/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.invoice;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getRoleType <em>Role Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getDatetimePerformed <em>Datetime Performed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getPercentage <em>Percentage</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceRole()
 * @model
 * @generated
 */
public interface InvoiceRole extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' reference.
	 * @see #setInvoice(Invoice)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceRole_Invoice()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getInvoice <em>Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice</em>' reference.
	 * @see #getInvoice()
	 * @generated
	 */
	void setInvoice(Invoice value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceRole_Party()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type</em>' reference.
	 * @see #setRoleType(RoleType)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceRole_RoleType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getRoleType <em>Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type</em>' reference.
	 * @see #getRoleType()
	 * @generated
	 */
	void setRoleType(RoleType value);

	/**
	 * Returns the value of the '<em><b>Datetime Performed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Performed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Performed</em>' attribute.
	 * @see #setDatetimePerformed(Date)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceRole_DatetimePerformed()
	 * @model
	 * @generated
	 */
	Date getDatetimePerformed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getDatetimePerformed <em>Datetime Performed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Performed</em>' attribute.
	 * @see #getDatetimePerformed()
	 * @generated
	 */
	void setDatetimePerformed(Date value);

	/**
	 * Returns the value of the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage</em>' attribute.
	 * @see #setPercentage(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceRole_Percentage()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getPercentage <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage</em>' attribute.
	 * @see #getPercentage()
	 * @generated
	 */
	void setPercentage(BigDecimal value);

} // InvoiceRole
