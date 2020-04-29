/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.impl;

import java.util.List;

import org.abchip.mimo.application.impl.ApplicationComponentImpl;
import org.abchip.mimo.biz.BizComponent;
import org.abchip.mimo.biz.BizModule;
import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.impl.BizComponentImpl#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizComponentImpl#getBizModules <em>Biz Modules</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizComponentImpl#getModulesDir <em>Modules Dir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BizComponentImpl extends ApplicationComponentImpl implements BizComponent {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BizComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BizPackage.Literals.BIZ_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlugin() {
		return (String)eGet(BizPackage.Literals.BIZ_COMPONENT__PLUGIN, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlugin(String newPlugin) {
		eSet(BizPackage.Literals.BIZ_COMPONENT__PLUGIN, newPlugin);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BizModule> getBizModules() {
		return (List<BizModule>)eGet(BizPackage.Literals.BIZ_COMPONENT__BIZ_MODULES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModulesDir() {
		return (String)eGet(BizPackage.Literals.BIZ_COMPONENT__MODULES_DIR, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModulesDir(String newModulesDir) {
		eSet(BizPackage.Literals.BIZ_COMPONENT__MODULES_DIR, newModulesDir);
	}
} // BizComponentImpl
