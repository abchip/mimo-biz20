/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.test;

import java.util.Date;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing Node Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getTesting <em>Testing</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getTestingNode <em>Testing Node</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getExtendFromDate <em>Extend From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getExtendThruDate <em>Extend Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNodeMember()
 * @model
 * @generated
 */
public interface TestingNodeMember extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Testing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing</em>' reference.
	 * @see #setTesting(Testing)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNodeMember_Testing()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Testing getTesting();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getTesting <em>Testing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing</em>' reference.
	 * @see #getTesting()
	 * @generated
	 */
	void setTesting(Testing value);

	/**
	 * Returns the value of the '<em><b>Testing Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Node</em>' reference.
	 * @see #setTestingNode(TestingNode)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNodeMember_TestingNode()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	TestingNode getTestingNode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getTestingNode <em>Testing Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Node</em>' reference.
	 * @see #getTestingNode()
	 * @generated
	 */
	void setTestingNode(TestingNode value);

	/**
	 * Returns the value of the '<em><b>Extend From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend From Date</em>' attribute.
	 * @see #setExtendFromDate(Date)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNodeMember_ExtendFromDate()
	 * @model
	 * @generated
	 */
	Date getExtendFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getExtendFromDate <em>Extend From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend From Date</em>' attribute.
	 * @see #getExtendFromDate()
	 * @generated
	 */
	void setExtendFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Extend Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend Thru Date</em>' attribute.
	 * @see #setExtendThruDate(Date)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNodeMember_ExtendThruDate()
	 * @model
	 * @generated
	 */
	Date getExtendThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getExtendThruDate <em>Extend Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend Thru Date</em>' attribute.
	 * @see #getExtendThruDate()
	 * @generated
	 */
	void setExtendThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNodeMember_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNodeMember_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // TestingNodeMember
