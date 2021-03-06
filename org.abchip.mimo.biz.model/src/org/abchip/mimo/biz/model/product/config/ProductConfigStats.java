/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.config;

import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Config Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProductConfigStats#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProductConfigStats#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProductConfigStats#getConfigTypeId <em>Config Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProductConfigStats#getNumOfConfs <em>Num Of Confs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProductConfigStats()
 * @model annotation="mimo-ent-frame title='Product Configurations Stats' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductConfigStats extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProductConfigStats_Product()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProductConfigStats#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Id</em>' attribute.
	 * @see #setConfigId(String)
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProductConfigStats_ConfigId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProductConfigStats#getConfigId <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Id</em>' attribute.
	 * @see #getConfigId()
	 * @generated
	 */
	void setConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Config Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Type Id</em>' attribute.
	 * @see #setConfigTypeId(String)
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProductConfigStats_ConfigTypeId()
	 * @model annotation="mimo-ent-slot help='HIDDEN, TEMPLATE, etc...'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProductConfigStats#getConfigTypeId <em>Config Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Type Id</em>' attribute.
	 * @see #getConfigTypeId()
	 * @generated
	 */
	void setConfigTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Num Of Confs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Confs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Confs</em>' attribute.
	 * @see #setNumOfConfs(long)
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProductConfigStats_NumOfConfs()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumOfConfs();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProductConfigStats#getNumOfConfs <em>Num Of Confs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Confs</em>' attribute.
	 * @see #getNumOfConfs()
	 * @generated
	 */
	void setNumOfConfs(long value);

} // ProductConfigStats
