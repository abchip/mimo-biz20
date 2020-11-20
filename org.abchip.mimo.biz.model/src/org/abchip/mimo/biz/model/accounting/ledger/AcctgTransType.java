/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acctg Trans Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getAcctgTransTypeAttrs <em>Acctg Trans Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransType()
 * @model annotation="mimo-ent-frame title='Accounting Transaction Type' dictionary='AccountingEntityLabels' formula='description'"
 * @generated
 */
public interface AcctgTransType extends EntityType<AcctgTrans>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentType(AcctgTransType)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransType_ParentType()
	 * @model
	 * @generated
	 */
	AcctgTransType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(AcctgTransType value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Type Id</em>' attribute.
	 * @see #setAcctgTransTypeId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransType_AcctgTransTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAcctgTransTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransType#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Type Id</em>' attribute.
	 * @see #getAcctgTransTypeId()
	 * @generated
	 */
	void setAcctgTransTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.ledger.AcctgTransTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getAcctgTransType_AcctgTransTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<AcctgTransTypeAttr> getAcctgTransTypeAttrs();

} // AcctgTransType
