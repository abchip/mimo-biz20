/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.invoice.impl;

import java.util.Date;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute;
import org.abchip.mimo.biz.model.accounting.invoice.InvoicePackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl#getAttrValue <em>Attr Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceAttributeImpl extends EntityIdentifiableImpl implements InvoiceAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InvoicePackage.Literals.INVOICE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice getInvoice() {
		return (Invoice)eGet(InvoicePackage.Literals.INVOICE_ATTRIBUTE__INVOICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoice(Invoice newInvoice) {
		eSet(InvoicePackage.Literals.INVOICE_ATTRIBUTE__INVOICE, newInvoice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrDescription() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ATTRIBUTE__ATTR_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrDescription(String newAttrDescription) {
		eSet(InvoicePackage.Literals.INVOICE_ATTRIBUTE__ATTR_DESCRIPTION, newAttrDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrValue() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ATTRIBUTE__ATTR_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrValue(String newAttrValue) {
		eSet(InvoicePackage.Literals.INVOICE_ATTRIBUTE__ATTR_VALUE, newAttrValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case InvoicePackage.INVOICE_ATTRIBUTE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case InvoicePackage.INVOICE_ATTRIBUTE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case InvoicePackage.INVOICE_ATTRIBUTE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case InvoicePackage.INVOICE_ATTRIBUTE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return InvoicePackage.INVOICE_ATTRIBUTE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return InvoicePackage.INVOICE_ATTRIBUTE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return InvoicePackage.INVOICE_ATTRIBUTE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return InvoicePackage.INVOICE_ATTRIBUTE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return (String)eGet(InvoicePackage.Literals.INVOICE_ATTRIBUTE__ATTR_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		eSet(InvoicePackage.Literals.INVOICE_ATTRIBUTE__ATTR_NAME, newAttrName);
	}

} //InvoiceAttributeImpl
