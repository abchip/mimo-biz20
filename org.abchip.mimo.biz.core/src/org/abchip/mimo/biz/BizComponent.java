/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz;

import java.util.List;
import org.abchip.mimo.application.ApplicationComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.BizComponent#getPlugin <em>Plugin</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizComponent#getBizModules <em>Biz Modules</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizComponent#getModulesDir <em>Modules Dir</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.BizPackage#getBizComponent()
 * @model
 * @generated
 */
public interface BizComponent extends ApplicationComponent {

	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' attribute.
	 * @see #setPlugin(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizComponent_Plugin()
	 * @model required="true"
	 * @generated
	 */
	String getPlugin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizComponent#getPlugin <em>Plugin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin</em>' attribute.
	 * @see #getPlugin()
	 * @generated
	 */
	void setPlugin(String value);

	/**
	 * Returns the value of the '<em><b>Biz Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.BizModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Biz Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Biz Modules</em>' containment reference list.
	 * @see org.abchip.mimo.biz.BizPackage#getBizComponent_BizModules()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<BizModule> getBizModules();

	/**
	 * Returns the value of the '<em><b>Modules Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules Dir</em>' attribute.
	 * @see #setModulesDir(String)
	 * @see org.abchip.mimo.biz.BizPackage#getBizComponent_ModulesDir()
	 * @model
	 * @generated
	 */
	String getModulesDir();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizComponent#getModulesDir <em>Modules Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modules Dir</em>' attribute.
	 * @see #getModulesDir()
	 * @generated
	 */
	void setModulesDir(String value);
} // BizComponent
