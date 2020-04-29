/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.entity.test.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.model.entity.test.TestPackage;
import org.abchip.mimo.biz.model.entity.test.TestingRemoveAll;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing Remove All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestingRemoveAllImpl#getTestingRemoveAllId <em>Testing Remove All Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.entity.test.impl.TestingRemoveAllImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingRemoveAllImpl extends BizEntityImpl implements TestingRemoveAll {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingRemoveAllImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.TESTING_REMOVE_ALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(TestPackage.Literals.TESTING_REMOVE_ALL__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(TestPackage.Literals.TESTING_REMOVE_ALL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingRemoveAllId() {
		return (String)eGet(TestPackage.Literals.TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingRemoveAllId(String newTestingRemoveAllId) {
		eSet(TestPackage.Literals.TESTING_REMOVE_ALL__TESTING_REMOVE_ALL_ID, newTestingRemoveAllId);
	}

} //TestingRemoveAllImpl
