/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.invoice;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Item Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceItemAssocType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface InvoiceItemAssocType extends EntityType<InvoiceItemAssoc>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceItemAssocType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceItemAssocType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentType(InvoiceItemAssocType)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceItemAssocType_ParentType()
	 * @model keys="invoiceItemAssocTypeId"
	 * @generated
	 */
	InvoiceItemAssocType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(InvoiceItemAssocType value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Assoc Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Assoc Type Id</em>' attribute.
	 * @see #setInvoiceItemAssocTypeId(String)
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage#getInvoiceItemAssocType_InvoiceItemAssocTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getInvoiceItemAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Assoc Type Id</em>' attribute.
	 * @see #getInvoiceItemAssocTypeId()
	 * @generated
	 */
	void setInvoiceItemAssocTypeId(String value);

} // InvoiceItemAssocType
