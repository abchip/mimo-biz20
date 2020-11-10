/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.requirement;

import org.abchip.mimo.biz.model.product.feature.ProductFeature;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desired Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getDesiredFeatureId <em>Desired Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getOptionalInd <em>Optional Ind</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getProductFeature <em>Product Feature</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getDesiredFeature()
 * @model
 * @generated
 */
public interface DesiredFeature extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getDesiredFeature_Requirement()
	 * @model keys="requirementId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Desired Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desired Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desired Feature Id</em>' attribute.
	 * @see #setDesiredFeatureId(String)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getDesiredFeature_DesiredFeatureId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDesiredFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getDesiredFeatureId <em>Desired Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Feature Id</em>' attribute.
	 * @see #getDesiredFeatureId()
	 * @generated
	 */
	void setDesiredFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Optional Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Ind</em>' attribute.
	 * @see #setOptionalInd(Boolean)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getDesiredFeature_OptionalInd()
	 * @model
	 * @generated
	 */
	Boolean getOptionalInd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getOptionalInd <em>Optional Ind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Ind</em>' attribute.
	 * @see #getOptionalInd()
	 * @generated
	 */
	void setOptionalInd(Boolean value);

	/**
	 * Returns the value of the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature</em>' reference.
	 * @see #setProductFeature(ProductFeature)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getDesiredFeature_ProductFeature()
	 * @model keys="productFeatureId"
	 * @generated
	 */
	ProductFeature getProductFeature();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.DesiredFeature#getProductFeature <em>Product Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature</em>' reference.
	 * @see #getProductFeature()
	 * @generated
	 */
	void setProductFeature(ProductFeature value);

} // DesiredFeature
