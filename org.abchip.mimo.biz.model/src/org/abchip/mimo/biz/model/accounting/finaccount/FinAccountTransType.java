/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.accounting.finaccount;

import java.util.List;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin Account Trans Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeAttrs <em>Fin Account Trans Type Attrs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTransType()
 * @model annotation="mimo-ent-frame title='Financial Account Transaction Type' dictionary='AccountingEntityLabels' formula='description'"
 * @generated
 */
public interface FinAccountTransType extends EntityType<FinAccountTrans>, EntityInfo {
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
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTransType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Type Attrs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransTypeAttr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Trans Type Attrs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Type Attrs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTransType_FinAccountTransTypeAttrs()
	 * @model derived="true"
	 * @generated
	 */
	List<FinAccountTransTypeAttr> getFinAccountTransTypeAttrs();

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTransType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #getHasTable()
	 * @generated
	 */
	void setHasTable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type</em>' reference.
	 * @see #setParentType(FinAccountTransType)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTransType_ParentType()
	 * @model keys="finAccountTransTypeId"
	 * @generated
	 */
	FinAccountTransType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(FinAccountTransType value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Trans Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Type Id</em>' attribute.
	 * @see #setFinAccountTransTypeId(String)
	 * @see org.abchip.mimo.biz.model.accounting.finaccount.FinaccountPackage#getFinAccountTransType_FinAccountTransTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFinAccountTransTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans Type Id</em>' attribute.
	 * @see #getFinAccountTransTypeId()
	 * @generated
	 */
	void setFinAccountTransTypeId(String value);

} // FinAccountTransType
