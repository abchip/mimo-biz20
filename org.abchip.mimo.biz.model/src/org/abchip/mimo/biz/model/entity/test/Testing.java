/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.test;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingId <em>Testing Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.Testing#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.Testing#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingDate <em>Testing Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingItems <em>Testing Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingName <em>Testing Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingSize <em>Testing Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingType <em>Testing Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Testing extends EntityTyped<TestingType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting_Comments()
	 * @model annotation="mimo-ent-format type='comment'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.Testing#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

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
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.Testing#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Testing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Date</em>' attribute.
	 * @see #setTestingDate(Date)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting_TestingDate()
	 * @model
	 * @generated
	 */
	Date getTestingDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingDate <em>Testing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Date</em>' attribute.
	 * @see #getTestingDate()
	 * @generated
	 */
	void setTestingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Testing Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.entity.test.TestingItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Items</em>' reference list.
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting_TestingItems()
	 * @model derived="true"
	 * @generated
	 */
	List<TestingItem> getTestingItems();

	/**
	 * Returns the value of the '<em><b>Testing Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Id</em>' attribute.
	 * @see #setTestingId(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting_TestingId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTestingId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingId <em>Testing Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Id</em>' attribute.
	 * @see #getTestingId()
	 * @generated
	 */
	void setTestingId(String value);

	/**
	 * Returns the value of the '<em><b>Testing Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Name</em>' attribute.
	 * @see #setTestingName(String)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting_TestingName()
	 * @model annotation="mimo-ent-slot audit='true'"
	 *        annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getTestingName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingName <em>Testing Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Name</em>' attribute.
	 * @see #getTestingName()
	 * @generated
	 */
	void setTestingName(String value);

	/**
	 * Returns the value of the '<em><b>Testing Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Size</em>' attribute.
	 * @see #setTestingSize(long)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting_TestingSize()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTestingSize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingSize <em>Testing Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Size</em>' attribute.
	 * @see #getTestingSize()
	 * @generated
	 */
	void setTestingSize(long value);

	/**
	 * Returns the value of the '<em><b>Testing Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Type</em>' reference.
	 * @see #setTestingType(TestingType)
	 * @see org.abchip.mimo.biz.model.entity.test.TestPackage#getTesting_TestingType()
	 * @model
	 * @generated
	 */
	TestingType getTestingType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.entity.test.Testing#getTestingType <em>Testing Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Type</em>' reference.
	 * @see #getTestingType()
	 * @generated
	 */
	void setTestingType(TestingType value);

} // Testing
