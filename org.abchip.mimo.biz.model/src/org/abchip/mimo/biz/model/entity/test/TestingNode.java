/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.test;

import java.util.List;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getTestingNodeId <em>Testing Node Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getPrimaryParentNodeId <em>Primary Parent Node Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getTestingNodeMembers <em>Testing Node Members</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNode()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface TestingNode extends EntityIdentifiable, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNode_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Primary Parent Node Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Parent Node Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Node Id</em>' reference.
	 * @see #setPrimaryParentNodeId(TestingNode)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNode_PrimaryParentNodeId()
	 * @model keys="testingNodeId"
	 * @generated
	 */
	TestingNode getPrimaryParentNodeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getPrimaryParentNodeId <em>Primary Parent Node Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Node Id</em>' reference.
	 * @see #getPrimaryParentNodeId()
	 * @generated
	 */
	void setPrimaryParentNodeId(TestingNode value);

	/**
	 * Returns the value of the '<em><b>Testing Node Members</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.entity.test.TestingNodeMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Node Members</em>' reference list.
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNode_TestingNodeMembers()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot type='fromDate'"
	 * @generated
	 */
	List<TestingNodeMember> getTestingNodeMembers();

	/**
	 * Returns the value of the '<em><b>Testing Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Node Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Node Id</em>' attribute.
	 * @see #setTestingNodeId(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTestingNode_TestingNodeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTestingNodeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.TestingNode#getTestingNodeId <em>Testing Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Node Id</em>' attribute.
	 * @see #getTestingNodeId()
	 * @generated
	 */
	void setTestingNodeId(String value);

} // TestingNode
