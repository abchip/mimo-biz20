/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import java.math.BigDecimal;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Reconciliation Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry#getGlReconciliation <em>Gl Reconciliation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry#getAcctgTrans <em>Acctg Trans</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry#getReconciledAmount <em>Reconciled Amount</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliationEntry()
 * @model annotation="mimo-ent-frame title='General Ledger Reconciliation Entry'"
 * @generated
 */
public interface GlReconciliationEntry extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Gl Reconciliation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Reconciliation</em>' reference.
	 * @see #setGlReconciliation(GlReconciliation)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliationEntry_GlReconciliation()
	 * @model keys="glReconciliationId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GlReconciliation getGlReconciliation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry#getGlReconciliation <em>Gl Reconciliation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Reconciliation</em>' reference.
	 * @see #getGlReconciliation()
	 * @generated
	 */
	void setGlReconciliation(GlReconciliation value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans</em>' reference.
	 * @see #setAcctgTrans(AcctgTrans)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliationEntry_AcctgTrans()
	 * @model keys="acctgTransId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	AcctgTrans getAcctgTrans();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry#getAcctgTrans <em>Acctg Trans</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans</em>' reference.
	 * @see #getAcctgTrans()
	 * @generated
	 */
	void setAcctgTrans(AcctgTrans value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Entry Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Entry Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Entry Seq Id</em>' attribute.
	 * @see #setAcctgTransEntrySeqId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliationEntry_AcctgTransEntrySeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAcctgTransEntrySeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Entry Seq Id</em>' attribute.
	 * @see #getAcctgTransEntrySeqId()
	 * @generated
	 */
	void setAcctgTransEntrySeqId(String value);

	/**
	 * Returns the value of the '<em><b>Reconciled Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconciled Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconciled Amount</em>' attribute.
	 * @see #setReconciledAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliationEntry_ReconciledAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getReconciledAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliationEntry#getReconciledAmount <em>Reconciled Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconciled Amount</em>' attribute.
	 * @see #getReconciledAmount()
	 * @generated
	 */
	void setReconciledAmount(BigDecimal value);

} // GlReconciliationEntry
