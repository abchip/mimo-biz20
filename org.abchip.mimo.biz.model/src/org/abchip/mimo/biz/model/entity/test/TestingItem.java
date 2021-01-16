/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.test;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTesting <em>Testing</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingSeqId <em>Testing Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingHistory <em>Testing History</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingItem()
 * @model
 * @generated
 */
public interface TestingItem extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Testing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing</em>' reference.
	 * @see #setTesting(Testing)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingItem_Testing()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Testing getTesting();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTesting <em>Testing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing</em>' reference.
	 * @see #getTesting()
	 * @generated
	 */
	void setTesting(Testing value);

	/**
	 * Returns the value of the '<em><b>Testing History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing History</em>' attribute.
	 * @see #setTestingHistory(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingItem_TestingHistory()
	 * @model
	 * @generated
	 */
	String getTestingHistory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingHistory <em>Testing History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing History</em>' attribute.
	 * @see #getTestingHistory()
	 * @generated
	 */
	void setTestingHistory(String value);

	/**
	 * Returns the value of the '<em><b>Testing Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Seq Id</em>' attribute.
	 * @see #setTestingSeqId(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingItem_TestingSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTestingSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingItem#getTestingSeqId <em>Testing Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Seq Id</em>' attribute.
	 * @see #getTestingSeqId()
	 * @generated
	 */
	void setTestingSeqId(String value);

} // TestingItem
