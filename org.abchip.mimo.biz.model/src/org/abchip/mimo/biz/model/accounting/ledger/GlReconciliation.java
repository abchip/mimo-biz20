/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Reconciliation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getGlReconciliationId <em>Gl Reconciliation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getGlAccount <em>Gl Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getGlReconciliationName <em>Gl Reconciliation Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getOpeningBalance <em>Opening Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getOrganizationParty <em>Organization Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getReconciledBalance <em>Reconciled Balance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getReconciledDate <em>Reconciled Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation()
 * @model annotation="mimo-ent-frame title='General Ledger Reconciliation' formula='description'"
 * @generated
 */
public interface GlReconciliation extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Gl Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account</em>' reference.
	 * @see #setGlAccount(GlAccount)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_GlAccount()
	 * @model
	 * @generated
	 */
	GlAccount getGlAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getGlAccount <em>Gl Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account</em>' reference.
	 * @see #getGlAccount()
	 * @generated
	 */
	void setGlAccount(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Gl Reconciliation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Reconciliation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Reconciliation Name</em>' attribute.
	 * @see #setGlReconciliationName(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_GlReconciliationName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getGlReconciliationName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getGlReconciliationName <em>Gl Reconciliation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Reconciliation Name</em>' attribute.
	 * @see #getGlReconciliationName()
	 * @generated
	 */
	void setGlReconciliationName(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Opening Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opening Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opening Balance</em>' attribute.
	 * @see #setOpeningBalance(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_OpeningBalance()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getOpeningBalance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getOpeningBalance <em>Opening Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Balance</em>' attribute.
	 * @see #getOpeningBalance()
	 * @generated
	 */
	void setOpeningBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Organization Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party</em>' reference.
	 * @see #setOrganizationParty(Party)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_OrganizationParty()
	 * @model
	 * @generated
	 */
	Party getOrganizationParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getOrganizationParty <em>Organization Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party</em>' reference.
	 * @see #getOrganizationParty()
	 * @generated
	 */
	void setOrganizationParty(Party value);

	/**
	 * Returns the value of the '<em><b>Reconciled Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconciled Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconciled Balance</em>' attribute.
	 * @see #setReconciledBalance(BigDecimal)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_ReconciledBalance()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getReconciledBalance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getReconciledBalance <em>Reconciled Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconciled Balance</em>' attribute.
	 * @see #getReconciledBalance()
	 * @generated
	 */
	void setReconciledBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reconciled Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconciled Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reconciled Date</em>' attribute.
	 * @see #setReconciledDate(Date)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_ReconciledDate()
	 * @model
	 * @generated
	 */
	Date getReconciledDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getReconciledDate <em>Reconciled Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconciled Date</em>' attribute.
	 * @see #getReconciledDate()
	 * @generated
	 */
	void setReconciledDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_Status()
	 * @model
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Gl Reconciliation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Reconciliation Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Reconciliation Id</em>' attribute.
	 * @see #setGlReconciliationId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlReconciliation_GlReconciliationId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGlReconciliationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlReconciliation#getGlReconciliationId <em>Gl Reconciliation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Reconciliation Id</em>' attribute.
	 * @see #getGlReconciliationId()
	 * @generated
	 */
	void setGlReconciliationId(String value);

} // GlReconciliation
