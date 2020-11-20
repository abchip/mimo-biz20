/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.accounting.invoice.Invoice;
import org.abchip.mimo.biz.model.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item Billing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getReturn <em>Return</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getShipmentReceipt <em>Shipment Receipt</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemBilling()
 * @model annotation="mimo-ent-frame title='Records the quantity and amount returned to an inventory item from a return item.'"
 * @generated
 */
public interface ReturnItemBilling extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(ReturnHeader)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemBilling_Return()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ReturnHeader getReturn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnHeader value);

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' reference.
	 * @see #setInvoice(Invoice)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemBilling_Invoice()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getInvoice <em>Invoice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice</em>' reference.
	 * @see #getInvoice()
	 * @generated
	 */
	void setInvoice(Invoice value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemBilling_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #setInvoiceItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemBilling_InvoiceItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 */
	void setInvoiceItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemBilling_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Shipment Receipt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Receipt</em>' reference.
	 * @see #setShipmentReceipt(ShipmentReceipt)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemBilling_ShipmentReceipt()
	 * @model
	 * @generated
	 */
	ShipmentReceipt getShipmentReceipt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getShipmentReceipt <em>Shipment Receipt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Receipt</em>' reference.
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	void setShipmentReceipt(ShipmentReceipt value);

	/**
	 * Returns the value of the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #setReturnItemSeqId(String)
	 * @see org.abchip.mimo.biz.model.order.return_.ReturnPackage#getReturnItemBilling_ReturnItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.return_.ReturnItemBilling#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

} // ReturnItemBilling
