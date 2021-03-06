/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.humanres.employment;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Benefit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getBenefitTypeId <em>Benefit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getBenefitName <em>Benefit Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getEmployerPaidPercentage <em>Employer Paid Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getParentType <em>Parent Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getBenefitType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface BenefitType extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Benefit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Name</em>' attribute.
	 * @see #setBenefitName(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getBenefitType_BenefitName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getBenefitName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getBenefitName <em>Benefit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Name</em>' attribute.
	 * @see #getBenefitName()
	 * @generated
	 */
	void setBenefitName(String value);

	/**
	 * Returns the value of the '<em><b>Benefit Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Type Id</em>' attribute.
	 * @see #setBenefitTypeId(String)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getBenefitType_BenefitTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBenefitTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getBenefitTypeId <em>Benefit Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Type Id</em>' attribute.
	 * @see #getBenefitTypeId()
	 * @generated
	 */
	void setBenefitTypeId(String value);

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
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getBenefitType_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Employer Paid Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Paid Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Paid Percentage</em>' attribute.
	 * @see #setEmployerPaidPercentage(double)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getBenefitType_EmployerPaidPercentage()
	 * @model
	 * @generated
	 */
	double getEmployerPaidPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getEmployerPaidPercentage <em>Employer Paid Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employer Paid Percentage</em>' attribute.
	 * @see #getEmployerPaidPercentage()
	 * @generated
	 */
	void setEmployerPaidPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(Boolean)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getBenefitType_HasTable()
	 * @model
	 * @generated
	 */
	Boolean getHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getHasTable <em>Has Table</em>}' attribute.
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
	 * @see #setParentType(BenefitType)
	 * @see org.abchip.mimo.biz.model.humanres.employment.EmploymentPackage#getBenefitType_ParentType()
	 * @model
	 * @generated
	 */
	BenefitType getParentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.humanres.employment.BenefitType#getParentType <em>Parent Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type</em>' reference.
	 * @see #getParentType()
	 * @generated
	 */
	void setParentType(BenefitType value);

} // BenefitType
