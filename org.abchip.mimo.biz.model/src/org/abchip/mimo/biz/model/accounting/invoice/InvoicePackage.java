/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.invoice;

import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='org.abchip.mimo.core.base.invocation' settingDelegates='org.abchip.mimo.core.base.setting'"
 * @generated
 */
public interface InvoicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "invoice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/accounting/invoice";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-invoice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InvoicePackage eINSTANCE = org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Billing Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__BILLING_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CONTACT_MECH = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DUE_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Invoice Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_ATTRIBUTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Invoice Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_ITEMS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Invoice Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_MESSAGE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Invoice Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_NOTES = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Invoice Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PAID_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PARTY_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Recurrence Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__RECURRENCE_INFO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__REFERENCE_NUMBER = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__ROLE_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__STATUS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceAttribute()
	 * @generated
	 */
	int INVOICE_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContactMechImpl <em>Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContactMechImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContactMech()
	 * @generated
	 */
	int INVOICE_CONTACT_MECH = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__CONTACT_MECH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContentImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContent()
	 * @generated
	 */
	int INVOICE_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__INVOICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__CONTENT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__INVOICE_CONTENT_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContentTypeImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContentType()
	 * @generated
	 */
	int INVOICE_CONTENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__INVOICE_CONTENT_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItem()
	 * @generated
	 */
	int INVOICE_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__INVOICE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__INVENTORY_ITEM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoice Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__INVOICE_ITEM_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Override Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__OVERRIDE_GL_ACCOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Override Org Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__OVERRIDE_ORG_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parent Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__PARENT_INVOICE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parent Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__PRODUCT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__PRODUCT_FEATURE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sales Opportunity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__SALES_OPPORTUNITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__TAX_AUTH_GEO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Tax Auth Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__TAX_AUTH_PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Tax Authority Rate Seq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Taxable Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__TAXABLE_FLAG = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAssocImpl <em>Item Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAssocImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAssoc()
	 * @generated
	 */
	int INVOICE_ITEM_ASSOC = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Item Assoc Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__FROM_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Invoice Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__AMOUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__PARTY_ID_FROM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__PARTY_ID_TO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__QUANTITY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__THRU_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Item Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAssocTypeImpl <em>Item Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAssocTypeImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAssocType()
	 * @generated
	 */
	int INVOICE_ITEM_ASSOC_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Item Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__INVOICE_ITEM_ASSOC_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAttributeImpl <em>Item Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAttributeImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAttribute()
	 * @generated
	 */
	int INVOICE_ITEM_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__INVOICE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Item Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemType()
	 * @generated
	 */
	int INVOICE_ITEM_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Gl Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeAttrImpl <em>Item Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeAttr()
	 * @generated
	 */
	int INVOICE_ITEM_TYPE_ATTR = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__INVOICE_ITEM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeGlAccountImpl <em>Item Type Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeGlAccountImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeGlAccount()
	 * @generated
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__INVOICE_ITEM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__GL_ACCOUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeMapImpl <em>Item Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeMapImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeMap()
	 * @generated
	 */
	int INVOICE_ITEM_TYPE_MAP = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice Item Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice Item Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceNoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceNoteImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceNote()
	 * @generated
	 */
	int INVOICE_NOTE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__INVOICE = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceRoleImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceRole()
	 * @generated
	 */
	int INVOICE_ROLE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__ROLE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Datetime Performed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__DATETIME_PERFORMED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__PERCENTAGE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceStatusImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceStatus()
	 * @generated
	 */
	int INVOICE_STATUS = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__STATUS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__STATUS_DATE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Change By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__CHANGE_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTermImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTerm()
	 * @generated
	 */
	int INVOICE_TERM = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__INVOICE_TERM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__INVOICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__INVOICE_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Invoice Term Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__INVOICE_TERM_ATTRIBUTES = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__TERM_DAYS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Term Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__TERM_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__TERM_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__TEXT_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__UOM_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTermAttributeImpl <em>Term Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTermAttributeImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTermAttribute()
	 * @generated
	 */
	int INVOICE_TERM_ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__INVOICE_TERM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__ATTR_DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__ATTR_VALUE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Term Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTypeImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceType()
	 * @generated
	 */
	int INVOICE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__HAS_TABLE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Invoice Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_TYPE_ATTRS = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__PARENT_TYPE = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTypeAttrImpl
	 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTypeAttr()
	 * @generated
	 */
	int INVOICE_TYPE_ATTR = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__INVOICE_TYPE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__ATTR_NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__DESCRIPTION = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceId()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getBillingAccount <em>Billing Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getBillingAccount()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_BillingAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getContactMech()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_ContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getCurrencyUom()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getDescription()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getDueDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_DueDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceAttributes <em>Invoice Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceAttributes()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InvoiceAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceItems <em>Invoice Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Items</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceItems()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InvoiceItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceMessage <em>Invoice Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Message</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceMessage()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceMessage();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceNotes <em>Invoice Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Notes</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceNotes()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InvoiceNotes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getInvoiceType()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getPaidDate <em>Paid Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getPaidDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_PaidDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getParty()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getPartyIdFrom()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getRecurrenceInfo <em>Recurrence Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence Info</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getRecurrenceInfo()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_RecurrenceInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getReferenceNumber()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_ReferenceNumber();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getRoleType()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_RoleType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.Invoice#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.Invoice#getStatus()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_Status();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute
	 * @generated
	 */
	EClass getInvoiceAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute#getInvoice()
	 * @see #getInvoiceAttribute()
	 * @generated
	 */
	EReference getInvoiceAttribute_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute#getAttrName()
	 * @see #getInvoiceAttribute()
	 * @generated
	 */
	EAttribute getInvoiceAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute#getAttrDescription()
	 * @see #getInvoiceAttribute()
	 * @generated
	 */
	EAttribute getInvoiceAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceAttribute#getAttrValue()
	 * @see #getInvoiceAttribute()
	 * @generated
	 */
	EAttribute getInvoiceAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech
	 * @generated
	 */
	EClass getInvoiceContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech#getInvoice()
	 * @see #getInvoiceContactMech()
	 * @generated
	 */
	EReference getInvoiceContactMech_Invoice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech#getContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech#getContactMech()
	 * @see #getInvoiceContactMech()
	 * @generated
	 */
	EReference getInvoiceContactMech_ContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech#getContactMechPurposeType <em>Contact Mech Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContactMech#getContactMechPurposeType()
	 * @see #getInvoiceContactMech()
	 * @generated
	 */
	EReference getInvoiceContactMech_ContactMechPurposeType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent
	 * @generated
	 */
	EClass getInvoiceContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getInvoice()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EReference getInvoiceContent_Invoice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getContent()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EReference getInvoiceContent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getInvoiceContentType <em>Invoice Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getInvoiceContentType()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EReference getInvoiceContent_InvoiceContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getFromDate()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EAttribute getInvoiceContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContent#getThruDate()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EAttribute getInvoiceContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType
	 * @generated
	 */
	EClass getInvoiceContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType#getInvoiceContentTypeId <em>Invoice Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType#getInvoiceContentTypeId()
	 * @see #getInvoiceContentType()
	 * @generated
	 */
	EAttribute getInvoiceContentType_InvoiceContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType#getDescription()
	 * @see #getInvoiceContentType()
	 * @generated
	 */
	EAttribute getInvoiceContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType#getHasTable()
	 * @see #getInvoiceContentType()
	 * @generated
	 */
	EAttribute getInvoiceContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceContentType#getParentType()
	 * @see #getInvoiceContentType()
	 * @generated
	 */
	EReference getInvoiceContentType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem
	 * @generated
	 */
	EClass getInvoiceItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getInvoice()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getInvoiceItemSeqId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getAmount()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getDescription()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getInventoryItem()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_InventoryItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getInvoiceItemType <em>Invoice Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getInvoiceItemType()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_InvoiceItemType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getOverrideGlAccount <em>Override Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getOverrideGlAccount()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_OverrideGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getOverrideOrgParty <em>Override Org Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Org Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getOverrideOrgParty()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_OverrideOrgParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getParentInvoiceId <em>Parent Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getParentInvoiceId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_ParentInvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getParentInvoiceItemSeqId <em>Parent Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getParentInvoiceItemSeqId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_ParentInvoiceItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getProduct()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_Product();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getProductFeature()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_ProductFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getQuantity()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getSalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getSalesOpportunity()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_SalesOpportunity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getTaxAuthGeo <em>Tax Auth Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Geo</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getTaxAuthGeo()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_TaxAuthGeo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getTaxAuthParty <em>Tax Auth Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getTaxAuthParty()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_TaxAuthParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getTaxAuthorityRateSeq <em>Tax Authority Rate Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Authority Rate Seq</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getTaxAuthorityRateSeq()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_TaxAuthorityRateSeq();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#isTaxableFlag <em>Taxable Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxable Flag</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#isTaxableFlag()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_TaxableFlag();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getUom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItem#getUom()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_Uom();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc <em>Item Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Assoc</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc
	 * @generated
	 */
	EClass getInvoiceItemAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceItemAssocType <em>Invoice Item Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceItemAssocType()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EReference getInvoiceItemAssoc_InvoiceItemAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceIdFrom <em>Invoice Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id From</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceIdFrom()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_InvoiceIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdFrom <em>Invoice Item Seq Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id From</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdFrom()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_InvoiceItemSeqIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceIdTo <em>Invoice Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id To</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceIdTo()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_InvoiceIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdTo <em>Invoice Item Seq Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id To</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdTo()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_InvoiceItemSeqIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getFromDate()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getAmount()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getPartyIdFrom()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EReference getInvoiceItemAssoc_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getPartyIdTo()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EReference getInvoiceItemAssoc_PartyIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getQuantity()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssoc#getThruDate()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType <em>Item Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType
	 * @generated
	 */
	EClass getInvoiceItemAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getInvoiceItemAssocTypeId()
	 * @see #getInvoiceItemAssocType()
	 * @generated
	 */
	EAttribute getInvoiceItemAssocType_InvoiceItemAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getDescription()
	 * @see #getInvoiceItemAssocType()
	 * @generated
	 */
	EAttribute getInvoiceItemAssocType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getHasTable()
	 * @see #getInvoiceItemAssocType()
	 * @generated
	 */
	EAttribute getInvoiceItemAssocType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAssocType#getParentType()
	 * @see #getInvoiceItemAssocType()
	 * @generated
	 */
	EReference getInvoiceItemAssocType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute <em>Item Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute
	 * @generated
	 */
	EClass getInvoiceItemAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getInvoiceId()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getInvoiceItemSeqId()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getAttrName()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getAttrDescription()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemAttribute#getAttrValue()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType
	 * @generated
	 */
	EClass getInvoiceItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getInvoiceItemTypeId()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EAttribute getInvoiceItemType_InvoiceItemTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getDefaultGlAccount <em>Default Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getDefaultGlAccount()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EReference getInvoiceItemType_DefaultGlAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getDescription()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EAttribute getInvoiceItemType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getHasTable()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EAttribute getInvoiceItemType_HasTable();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getInvoiceItemTypeAttrs <em>Invoice Item Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Item Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getInvoiceItemTypeAttrs()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EReference getInvoiceItemType_InvoiceItemTypeAttrs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getInvoiceItemTypeGlAccounts <em>Invoice Item Type Gl Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Item Type Gl Accounts</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getInvoiceItemTypeGlAccounts()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EReference getInvoiceItemType_InvoiceItemTypeGlAccounts();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemType#getParentType()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EReference getInvoiceItemType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeAttr <em>Item Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeAttr
	 * @generated
	 */
	EClass getInvoiceItemTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeAttr#getInvoiceItemType <em>Invoice Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeAttr#getInvoiceItemType()
	 * @see #getInvoiceItemTypeAttr()
	 * @generated
	 */
	EReference getInvoiceItemTypeAttr_InvoiceItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeAttr#getAttrName()
	 * @see #getInvoiceItemTypeAttr()
	 * @generated
	 */
	EAttribute getInvoiceItemTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeAttr#getDescription()
	 * @see #getInvoiceItemTypeAttr()
	 * @generated
	 */
	EAttribute getInvoiceItemTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeGlAccount <em>Item Type Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeGlAccount
	 * @generated
	 */
	EClass getInvoiceItemTypeGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeGlAccount#getInvoiceItemType <em>Invoice Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeGlAccount#getInvoiceItemType()
	 * @see #getInvoiceItemTypeGlAccount()
	 * @generated
	 */
	EReference getInvoiceItemTypeGlAccount_InvoiceItemType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeGlAccount#getOrganizationParty <em>Organization Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeGlAccount#getOrganizationParty()
	 * @see #getInvoiceItemTypeGlAccount()
	 * @generated
	 */
	EReference getInvoiceItemTypeGlAccount_OrganizationParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeGlAccount#getGlAccount <em>Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeGlAccount#getGlAccount()
	 * @see #getInvoiceItemTypeGlAccount()
	 * @generated
	 */
	EReference getInvoiceItemTypeGlAccount_GlAccount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeMap <em>Item Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Map</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeMap
	 * @generated
	 */
	EClass getInvoiceItemTypeMap();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeMap#getInvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeMap#getInvoiceType()
	 * @see #getInvoiceItemTypeMap()
	 * @generated
	 */
	EReference getInvoiceItemTypeMap_InvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemMapKey <em>Invoice Item Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Map Key</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemMapKey()
	 * @see #getInvoiceItemTypeMap()
	 * @generated
	 */
	EAttribute getInvoiceItemTypeMap_InvoiceItemMapKey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemType <em>Invoice Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemType()
	 * @see #getInvoiceItemTypeMap()
	 * @generated
	 */
	EReference getInvoiceItemTypeMap_InvoiceItemType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceNote
	 * @generated
	 */
	EClass getInvoiceNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceNote#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceNote#getInvoice()
	 * @see #getInvoiceNote()
	 * @generated
	 */
	EReference getInvoiceNote_Invoice();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole
	 * @generated
	 */
	EClass getInvoiceRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getInvoice()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EReference getInvoiceRole_Invoice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getParty()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EReference getInvoiceRole_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getRoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getRoleType()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EReference getInvoiceRole_RoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getDatetimePerformed <em>Datetime Performed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Performed</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getDatetimePerformed()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EAttribute getInvoiceRole_DatetimePerformed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceRole#getPercentage()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EAttribute getInvoiceRole_Percentage();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus
	 * @generated
	 */
	EClass getInvoiceStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus#getStatus()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	EReference getInvoiceStatus_Status();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus#getInvoice()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	EReference getInvoiceStatus_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus#getStatusDate()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	EAttribute getInvoiceStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus#getChangeByUserLogin <em>Change By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceStatus#getChangeByUserLogin()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	EReference getInvoiceStatus_ChangeByUserLogin();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm
	 * @generated
	 */
	EClass getInvoiceTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getInvoiceTermId <em>Invoice Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Term Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getInvoiceTermId()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_InvoiceTermId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getDescription()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getInvoice()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EReference getInvoiceTerm_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getInvoiceItemSeqId()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getInvoiceTermAttributes <em>Invoice Term Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Term Attributes</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getInvoiceTermAttributes()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EReference getInvoiceTerm_InvoiceTermAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getTermDays <em>Term Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Days</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getTermDays()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_TermDays();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getTermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getTermType()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EReference getInvoiceTerm_TermType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getTermValue <em>Term Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Value</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getTermValue()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_TermValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getTextValue()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_TextValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTerm#getUomId()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute <em>Term Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Attribute</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute
	 * @generated
	 */
	EClass getInvoiceTermAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute#getInvoiceTerm <em>Invoice Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Term</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute#getInvoiceTerm()
	 * @see #getInvoiceTermAttribute()
	 * @generated
	 */
	EReference getInvoiceTermAttribute_InvoiceTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute#getAttrName()
	 * @see #getInvoiceTermAttribute()
	 * @generated
	 */
	EAttribute getInvoiceTermAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute#getAttrDescription()
	 * @see #getInvoiceTermAttribute()
	 * @generated
	 */
	EAttribute getInvoiceTermAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTermAttribute#getAttrValue()
	 * @see #getInvoiceTermAttribute()
	 * @generated
	 */
	EAttribute getInvoiceTermAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceType
	 * @generated
	 */
	EClass getInvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getInvoiceTypeId <em>Invoice Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getInvoiceTypeId()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getDescription()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getHasTable()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_HasTable();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getInvoiceTypeAttrs <em>Invoice Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getInvoiceTypeAttrs()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_InvoiceTypeAttrs();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getParentType <em>Parent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceType#getParentType()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_ParentType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTypeAttr
	 * @generated
	 */
	EClass getInvoiceTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTypeAttr#getInvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Type</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTypeAttr#getInvoiceType()
	 * @see #getInvoiceTypeAttr()
	 * @generated
	 */
	EReference getInvoiceTypeAttr_InvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTypeAttr#getAttrName()
	 * @see #getInvoiceTypeAttr()
	 * @generated
	 */
	EAttribute getInvoiceTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.accounting.invoice.InvoiceTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.accounting.invoice.InvoiceTypeAttr#getDescription()
	 * @see #getInvoiceTypeAttr()
	 * @generated
	 */
	EAttribute getInvoiceTypeAttr_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InvoiceFactory getInvoiceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_ID = eINSTANCE.getInvoice_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Billing Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__BILLING_ACCOUNT = eINSTANCE.getInvoice_BillingAccount();

		/**
		 * The meta object literal for the '<em><b>Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__CONTACT_MECH = eINSTANCE.getInvoice_ContactMech();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__CURRENCY_UOM = eINSTANCE.getInvoice_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__DESCRIPTION = eINSTANCE.getInvoice_Description();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__DUE_DATE = eINSTANCE.getInvoice_DueDate();

		/**
		 * The meta object literal for the '<em><b>Invoice Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__INVOICE_ATTRIBUTES = eINSTANCE.getInvoice_InvoiceAttributes();

		/**
		 * The meta object literal for the '<em><b>Invoice Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_DATE = eINSTANCE.getInvoice_InvoiceDate();

		/**
		 * The meta object literal for the '<em><b>Invoice Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__INVOICE_ITEMS = eINSTANCE.getInvoice_InvoiceItems();

		/**
		 * The meta object literal for the '<em><b>Invoice Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_MESSAGE = eINSTANCE.getInvoice_InvoiceMessage();

		/**
		 * The meta object literal for the '<em><b>Invoice Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__INVOICE_NOTES = eINSTANCE.getInvoice_InvoiceNotes();

		/**
		 * The meta object literal for the '<em><b>Invoice Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__INVOICE_TYPE = eINSTANCE.getInvoice_InvoiceType();

		/**
		 * The meta object literal for the '<em><b>Paid Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__PAID_DATE = eINSTANCE.getInvoice_PaidDate();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__PARTY = eINSTANCE.getInvoice_Party();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__PARTY_ID_FROM = eINSTANCE.getInvoice_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Recurrence Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__RECURRENCE_INFO = eINSTANCE.getInvoice_RecurrenceInfo();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__REFERENCE_NUMBER = eINSTANCE.getInvoice_ReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__ROLE_TYPE = eINSTANCE.getInvoice_RoleType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__STATUS = eINSTANCE.getInvoice_Status();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceAttributeImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceAttribute()
		 * @generated
		 */
		EClass INVOICE_ATTRIBUTE = eINSTANCE.getInvoiceAttribute();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ATTRIBUTE__INVOICE = eINSTANCE.getInvoiceAttribute_Invoice();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ATTRIBUTE__ATTR_NAME = eINSTANCE.getInvoiceAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getInvoiceAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getInvoiceAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContactMechImpl <em>Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContactMechImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContactMech()
		 * @generated
		 */
		EClass INVOICE_CONTACT_MECH = eINSTANCE.getInvoiceContactMech();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTACT_MECH__INVOICE = eINSTANCE.getInvoiceContactMech_Invoice();

		/**
		 * The meta object literal for the '<em><b>Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTACT_MECH__CONTACT_MECH = eINSTANCE.getInvoiceContactMech_ContactMech();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE = eINSTANCE.getInvoiceContactMech_ContactMechPurposeType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContentImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContent()
		 * @generated
		 */
		EClass INVOICE_CONTENT = eINSTANCE.getInvoiceContent();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTENT__INVOICE = eINSTANCE.getInvoiceContent_Invoice();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTENT__CONTENT = eINSTANCE.getInvoiceContent_Content();

		/**
		 * The meta object literal for the '<em><b>Invoice Content Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTENT__INVOICE_CONTENT_TYPE = eINSTANCE.getInvoiceContent_InvoiceContentType();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT__FROM_DATE = eINSTANCE.getInvoiceContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT__THRU_DATE = eINSTANCE.getInvoiceContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceContentTypeImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContentType()
		 * @generated
		 */
		EClass INVOICE_CONTENT_TYPE = eINSTANCE.getInvoiceContentType();

		/**
		 * The meta object literal for the '<em><b>Invoice Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT_TYPE__INVOICE_CONTENT_TYPE_ID = eINSTANCE.getInvoiceContentType_InvoiceContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getInvoiceContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getInvoiceContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTENT_TYPE__PARENT_TYPE = eINSTANCE.getInvoiceContentType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItem()
		 * @generated
		 */
		EClass INVOICE_ITEM = eINSTANCE.getInvoiceItem();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__INVOICE = eINSTANCE.getInvoiceItem_Invoice();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__INVOICE_ITEM_SEQ_ID = eINSTANCE.getInvoiceItem_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__AMOUNT = eINSTANCE.getInvoiceItem_Amount();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__DESCRIPTION = eINSTANCE.getInvoiceItem_Description();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__INVENTORY_ITEM = eINSTANCE.getInvoiceItem_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__INVOICE_ITEM_TYPE = eINSTANCE.getInvoiceItem_InvoiceItemType();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__OVERRIDE_GL_ACCOUNT = eINSTANCE.getInvoiceItem_OverrideGlAccount();

		/**
		 * The meta object literal for the '<em><b>Override Org Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__OVERRIDE_ORG_PARTY = eINSTANCE.getInvoiceItem_OverrideOrgParty();

		/**
		 * The meta object literal for the '<em><b>Parent Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__PARENT_INVOICE_ID = eINSTANCE.getInvoiceItem_ParentInvoiceId();

		/**
		 * The meta object literal for the '<em><b>Parent Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID = eINSTANCE.getInvoiceItem_ParentInvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__PRODUCT = eINSTANCE.getInvoiceItem_Product();

		/**
		 * The meta object literal for the '<em><b>Product Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__PRODUCT_FEATURE = eINSTANCE.getInvoiceItem_ProductFeature();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__QUANTITY = eINSTANCE.getInvoiceItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__SALES_OPPORTUNITY = eINSTANCE.getInvoiceItem_SalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__TAX_AUTH_GEO = eINSTANCE.getInvoiceItem_TaxAuthGeo();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__TAX_AUTH_PARTY = eINSTANCE.getInvoiceItem_TaxAuthParty();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Rate Seq</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ = eINSTANCE.getInvoiceItem_TaxAuthorityRateSeq();

		/**
		 * The meta object literal for the '<em><b>Taxable Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__TAXABLE_FLAG = eINSTANCE.getInvoiceItem_TaxableFlag();

		/**
		 * The meta object literal for the '<em><b>Uom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__UOM = eINSTANCE.getInvoiceItem_Uom();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAssocImpl <em>Item Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAssocImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAssoc()
		 * @generated
		 */
		EClass INVOICE_ITEM_ASSOC = eINSTANCE.getInvoiceItemAssoc();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Assoc Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE = eINSTANCE.getInvoiceItemAssoc_InvoiceItemAssocType();

		/**
		 * The meta object literal for the '<em><b>Invoice Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__INVOICE_ID_FROM = eINSTANCE.getInvoiceItemAssoc_InvoiceIdFrom();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM = eINSTANCE.getInvoiceItemAssoc_InvoiceItemSeqIdFrom();

		/**
		 * The meta object literal for the '<em><b>Invoice Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__INVOICE_ID_TO = eINSTANCE.getInvoiceItemAssoc_InvoiceIdTo();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO = eINSTANCE.getInvoiceItemAssoc_InvoiceItemSeqIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__FROM_DATE = eINSTANCE.getInvoiceItemAssoc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__AMOUNT = eINSTANCE.getInvoiceItemAssoc_Amount();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_ASSOC__PARTY_ID_FROM = eINSTANCE.getInvoiceItemAssoc_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_ASSOC__PARTY_ID_TO = eINSTANCE.getInvoiceItemAssoc_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__QUANTITY = eINSTANCE.getInvoiceItemAssoc_Quantity();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__THRU_DATE = eINSTANCE.getInvoiceItemAssoc_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAssocTypeImpl <em>Item Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAssocTypeImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAssocType()
		 * @generated
		 */
		EClass INVOICE_ITEM_ASSOC_TYPE = eINSTANCE.getInvoiceItemAssocType();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC_TYPE__INVOICE_ITEM_ASSOC_TYPE_ID = eINSTANCE.getInvoiceItemAssocType_InvoiceItemAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getInvoiceItemAssocType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC_TYPE__HAS_TABLE = eINSTANCE.getInvoiceItemAssocType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_ASSOC_TYPE__PARENT_TYPE = eINSTANCE.getInvoiceItemAssocType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAttributeImpl <em>Item Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemAttributeImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAttribute()
		 * @generated
		 */
		EClass INVOICE_ITEM_ATTRIBUTE = eINSTANCE.getInvoiceItemAttribute();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__INVOICE_ID = eINSTANCE.getInvoiceItemAttribute_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__INVOICE_ITEM_SEQ_ID = eINSTANCE.getInvoiceItemAttribute_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getInvoiceItemAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getInvoiceItemAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getInvoiceItemAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemType()
		 * @generated
		 */
		EClass INVOICE_ITEM_TYPE = eINSTANCE.getInvoiceItemType();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID = eINSTANCE.getInvoiceItemType_InvoiceItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Default Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT = eINSTANCE.getInvoiceItemType_DefaultGlAccount();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE__DESCRIPTION = eINSTANCE.getInvoiceItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE__HAS_TABLE = eINSTANCE.getInvoiceItemType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS = eINSTANCE.getInvoiceItemType_InvoiceItemTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Gl Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS = eINSTANCE.getInvoiceItemType_InvoiceItemTypeGlAccounts();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE__PARENT_TYPE = eINSTANCE.getInvoiceItemType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeAttrImpl <em>Item Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeAttr()
		 * @generated
		 */
		EClass INVOICE_ITEM_TYPE_ATTR = eINSTANCE.getInvoiceItemTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_ATTR__INVOICE_ITEM_TYPE = eINSTANCE.getInvoiceItemTypeAttr_InvoiceItemType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE_ATTR__ATTR_NAME = eINSTANCE.getInvoiceItemTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE_ATTR__DESCRIPTION = eINSTANCE.getInvoiceItemTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeGlAccountImpl <em>Item Type Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeGlAccountImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeGlAccount()
		 * @generated
		 */
		EClass INVOICE_ITEM_TYPE_GL_ACCOUNT = eINSTANCE.getInvoiceItemTypeGlAccount();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_GL_ACCOUNT__INVOICE_ITEM_TYPE = eINSTANCE.getInvoiceItemTypeGlAccount_InvoiceItemType();

		/**
		 * The meta object literal for the '<em><b>Organization Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY = eINSTANCE.getInvoiceItemTypeGlAccount_OrganizationParty();

		/**
		 * The meta object literal for the '<em><b>Gl Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_GL_ACCOUNT__GL_ACCOUNT = eINSTANCE.getInvoiceItemTypeGlAccount_GlAccount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeMapImpl <em>Item Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceItemTypeMapImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeMap()
		 * @generated
		 */
		EClass INVOICE_ITEM_TYPE_MAP = eINSTANCE.getInvoiceItemTypeMap();

		/**
		 * The meta object literal for the '<em><b>Invoice Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE = eINSTANCE.getInvoiceItemTypeMap_InvoiceType();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY = eINSTANCE.getInvoiceItemTypeMap_InvoiceItemMapKey();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE = eINSTANCE.getInvoiceItemTypeMap_InvoiceItemType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceNoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceNoteImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceNote()
		 * @generated
		 */
		EClass INVOICE_NOTE = eINSTANCE.getInvoiceNote();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_NOTE__INVOICE = eINSTANCE.getInvoiceNote_Invoice();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceRoleImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceRole()
		 * @generated
		 */
		EClass INVOICE_ROLE = eINSTANCE.getInvoiceRole();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ROLE__INVOICE = eINSTANCE.getInvoiceRole_Invoice();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ROLE__PARTY = eINSTANCE.getInvoiceRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ROLE__ROLE_TYPE = eINSTANCE.getInvoiceRole_RoleType();

		/**
		 * The meta object literal for the '<em><b>Datetime Performed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ROLE__DATETIME_PERFORMED = eINSTANCE.getInvoiceRole_DatetimePerformed();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ROLE__PERCENTAGE = eINSTANCE.getInvoiceRole_Percentage();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceStatusImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceStatus()
		 * @generated
		 */
		EClass INVOICE_STATUS = eINSTANCE.getInvoiceStatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_STATUS__STATUS = eINSTANCE.getInvoiceStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_STATUS__INVOICE = eINSTANCE.getInvoiceStatus_Invoice();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_STATUS__STATUS_DATE = eINSTANCE.getInvoiceStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Change By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_STATUS__CHANGE_BY_USER_LOGIN = eINSTANCE.getInvoiceStatus_ChangeByUserLogin();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTermImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTerm()
		 * @generated
		 */
		EClass INVOICE_TERM = eINSTANCE.getInvoiceTerm();

		/**
		 * The meta object literal for the '<em><b>Invoice Term Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__INVOICE_TERM_ID = eINSTANCE.getInvoiceTerm_InvoiceTermId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__DESCRIPTION = eINSTANCE.getInvoiceTerm_Description();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TERM__INVOICE = eINSTANCE.getInvoiceTerm_Invoice();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__INVOICE_ITEM_SEQ_ID = eINSTANCE.getInvoiceTerm_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Invoice Term Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TERM__INVOICE_TERM_ATTRIBUTES = eINSTANCE.getInvoiceTerm_InvoiceTermAttributes();

		/**
		 * The meta object literal for the '<em><b>Term Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__TERM_DAYS = eINSTANCE.getInvoiceTerm_TermDays();

		/**
		 * The meta object literal for the '<em><b>Term Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TERM__TERM_TYPE = eINSTANCE.getInvoiceTerm_TermType();

		/**
		 * The meta object literal for the '<em><b>Term Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__TERM_VALUE = eINSTANCE.getInvoiceTerm_TermValue();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__TEXT_VALUE = eINSTANCE.getInvoiceTerm_TextValue();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__UOM_ID = eINSTANCE.getInvoiceTerm_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTermAttributeImpl <em>Term Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTermAttributeImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTermAttribute()
		 * @generated
		 */
		EClass INVOICE_TERM_ATTRIBUTE = eINSTANCE.getInvoiceTermAttribute();

		/**
		 * The meta object literal for the '<em><b>Invoice Term</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TERM_ATTRIBUTE__INVOICE_TERM = eINSTANCE.getInvoiceTermAttribute_InvoiceTerm();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getInvoiceTermAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getInvoiceTermAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getInvoiceTermAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTypeImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceType()
		 * @generated
		 */
		EClass INVOICE_TYPE = eINSTANCE.getInvoiceType();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__INVOICE_TYPE_ID = eINSTANCE.getInvoiceType_InvoiceTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__DESCRIPTION = eINSTANCE.getInvoiceType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__HAS_TABLE = eINSTANCE.getInvoiceType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE__INVOICE_TYPE_ATTRS = eINSTANCE.getInvoiceType_InvoiceTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Parent Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE__PARENT_TYPE = eINSTANCE.getInvoiceType_ParentType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoiceTypeAttrImpl
		 * @see org.abchip.mimo.biz.model.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTypeAttr()
		 * @generated
		 */
		EClass INVOICE_TYPE_ATTR = eINSTANCE.getInvoiceTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Invoice Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE_ATTR__INVOICE_TYPE = eINSTANCE.getInvoiceTypeAttr_InvoiceType();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE_ATTR__ATTR_NAME = eINSTANCE.getInvoiceTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE_ATTR__DESCRIPTION = eINSTANCE.getInvoiceTypeAttr_Description();

	}

} //InvoicePackage
