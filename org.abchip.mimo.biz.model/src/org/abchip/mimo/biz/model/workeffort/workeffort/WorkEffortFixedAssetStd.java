/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.workeffort;

import java.math.BigDecimal;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAssetType;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort Fixed Asset Std</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getWorkEffort <em>Work Effort</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getFixedAssetType <em>Fixed Asset Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedDuration <em>Estimated Duration</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedQuantity <em>Estimated Quantity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortFixedAssetStd()
 * @model annotation="mimo-ent-frame title='Work Effort Fixed Asset Standard'"
 * @generated
 */
public interface WorkEffortFixedAssetStd extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortFixedAssetStd_WorkEffort()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type</em>' reference.
	 * @see #setFixedAssetType(FixedAssetType)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortFixedAssetStd_FixedAssetType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	FixedAssetType getFixedAssetType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getFixedAssetType <em>Fixed Asset Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Type</em>' reference.
	 * @see #getFixedAssetType()
	 * @generated
	 */
	void setFixedAssetType(FixedAssetType value);

	/**
	 * Returns the value of the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Cost</em>' attribute.
	 * @see #setEstimatedCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortFixedAssetStd_EstimatedCost()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getEstimatedCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedCost <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Cost</em>' attribute.
	 * @see #getEstimatedCost()
	 * @generated
	 */
	void setEstimatedCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Estimated Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Duration</em>' attribute.
	 * @see #setEstimatedDuration(double)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortFixedAssetStd_EstimatedDuration()
	 * @model
	 * @generated
	 */
	double getEstimatedDuration();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedDuration <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Duration</em>' attribute.
	 * @see #getEstimatedDuration()
	 * @generated
	 */
	void setEstimatedDuration(double value);

	/**
	 * Returns the value of the '<em><b>Estimated Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Quantity</em>' attribute.
	 * @see #setEstimatedQuantity(double)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffortFixedAssetStd_EstimatedQuantity()
	 * @model
	 * @generated
	 */
	double getEstimatedQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd#getEstimatedQuantity <em>Estimated Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Quantity</em>' attribute.
	 * @see #getEstimatedQuantity()
	 * @generated
	 */
	void setEstimatedQuantity(double value);

} // WorkEffortFixedAssetStd
