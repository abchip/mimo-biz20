/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.ledger;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Fiscal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlFiscalType#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlFiscalType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlFiscalType()
 * @model annotation="mimo-ent-frame title='General Ledger Fiscal' dictionary='AccountingEntityLabels' formula='description'"
 * @generated
 */
public interface GlFiscalType extends BizEntity {
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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlFiscalType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlFiscalType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Gl Fiscal Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Fiscal Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Fiscal Type Id</em>' attribute.
	 * @see #setGlFiscalTypeId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlFiscalType_GlFiscalTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGlFiscalTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlFiscalType#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Fiscal Type Id</em>' attribute.
	 * @see #getGlFiscalTypeId()
	 * @generated
	 */
	void setGlFiscalTypeId(String value);

} // GlFiscalType
