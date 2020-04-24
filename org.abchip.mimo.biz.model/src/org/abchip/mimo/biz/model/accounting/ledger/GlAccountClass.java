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
 * A representation of the model object '<em><b>Gl Account Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getGlAccountClassId <em>Gl Account Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getIsAssetClass <em>Is Asset Class</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getParentClassId <em>Parent Class Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountClass()
 * @model annotation="mimo-ent-frame title='General Ledger Account Class' dictionary='AccountingEntityLabels' formula='description'"
 * @generated
 */
public interface GlAccountClass extends BizEntity {
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
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountClass_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Asset Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Asset Class</em>' attribute.
	 * @see #setIsAssetClass(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountClass_IsAssetClass()
	 * @model
	 * @generated
	 */
	Boolean getIsAssetClass();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getIsAssetClass <em>Is Asset Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Asset Class</em>' attribute.
	 * @see #getIsAssetClass()
	 * @generated
	 */
	void setIsAssetClass(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Class Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Class Id</em>' reference.
	 * @see #setParentClassId(GlAccountClass)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountClass_ParentClassId()
	 * @model keys="glAccountClassId"
	 * @generated
	 */
	GlAccountClass getParentClassId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getParentClassId <em>Parent Class Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Class Id</em>' reference.
	 * @see #getParentClassId()
	 * @generated
	 */
	void setParentClassId(GlAccountClass value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountClass_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Gl Account Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Class Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Class Id</em>' attribute.
	 * @see #setGlAccountClassId(String)
	 * @see org.abchip.mimo.biz.model.accounting.ledger.LedgerPackage#getGlAccountClass_GlAccountClassId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGlAccountClassId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.ledger.GlAccountClass#getGlAccountClassId <em>Gl Account Class Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Class Id</em>' attribute.
	 * @see #getGlAccountClassId()
	 * @generated
	 */
	void setGlAccountClassId(String value);

} // GlAccountClass
