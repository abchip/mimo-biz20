/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.requirement;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.workeffort.workeffort.Deliverable;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementId <em>Requirement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getDeliverable <em>Deliverable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getEstimatedBudget <em>Estimated Budget</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFacilityIdTo <em>Facility Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequiredByDate <em>Required By Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementAttributes <em>Requirement Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementStartDate <em>Requirement Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementStatuses <em>Requirement Statuses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementType <em>Requirement Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getWorkRequirementFulfillments <em>Work Requirement Fulfillments</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Requirement extends EntityTyped<RequirementType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Deliverable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable</em>' reference.
	 * @see #setDeliverable(Deliverable)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_Deliverable()
	 * @model keys="deliverableId"
	 * @generated
	 */
	Deliverable getDeliverable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getDeliverable <em>Deliverable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable</em>' reference.
	 * @see #getDeliverable()
	 * @generated
	 */
	void setDeliverable(Deliverable value);

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
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Budget</em>' attribute.
	 * @see #setEstimatedBudget(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_EstimatedBudget()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getEstimatedBudget();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getEstimatedBudget <em>Estimated Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Budget</em>' attribute.
	 * @see #getEstimatedBudget()
	 * @generated
	 */
	void setEstimatedBudget(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_Facility()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Facility Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id To</em>' attribute.
	 * @see #setFacilityIdTo(String)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_FacilityIdTo()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFacilityIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFacilityIdTo <em>Facility Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id To</em>' attribute.
	 * @see #getFacilityIdTo()
	 * @generated
	 */
	void setFacilityIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset</em>' reference.
	 * @see #setFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_FixedAsset()
	 * @model keys="fixedAssetId"
	 * @generated
	 */
	FixedAsset getFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getFixedAsset <em>Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset</em>' reference.
	 * @see #getFixedAsset()
	 * @generated
	 */
	void setFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_Product()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_Reason()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Required By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By Date</em>' attribute.
	 * @see #setRequiredByDate(Date)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_RequiredByDate()
	 * @model
	 * @generated
	 */
	Date getRequiredByDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequiredByDate <em>Required By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required By Date</em>' attribute.
	 * @see #getRequiredByDate()
	 * @generated
	 */
	void setRequiredByDate(Date value);

	/**
	 * Returns the value of the '<em><b>Requirement Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.requirement.RequirementAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_RequirementAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<RequirementAttribute> getRequirementAttributes();

	/**
	 * Returns the value of the '<em><b>Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Id</em>' attribute.
	 * @see #setRequirementId(String)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_RequirementId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRequirementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementId <em>Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Id</em>' attribute.
	 * @see #getRequirementId()
	 * @generated
	 */
	void setRequirementId(String value);

	/**
	 * Returns the value of the '<em><b>Requirement Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Start Date</em>' attribute.
	 * @see #setRequirementStartDate(Date)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_RequirementStartDate()
	 * @model
	 * @generated
	 */
	Date getRequirementStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementStartDate <em>Requirement Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Start Date</em>' attribute.
	 * @see #getRequirementStartDate()
	 * @generated
	 */
	void setRequirementStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Requirement Statuses</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.requirement.RequirementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Statuses</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_RequirementStatuses()
	 * @model derived="true"
	 * @generated
	 */
	List<RequirementStatus> getRequirementStatuses();

	/**
	 * Returns the value of the '<em><b>Requirement Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Type</em>' reference.
	 * @see #setRequirementType(RequirementType)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_RequirementType()
	 * @model keys="requirementTypeId"
	 * @generated
	 */
	RequirementType getRequirementType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getRequirementType <em>Requirement Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Type</em>' reference.
	 * @see #getRequirementType()
	 * @generated
	 */
	void setRequirementType(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_Status()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' attribute.
	 * @see #setUseCase(String)
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_UseCase()
	 * @model
	 * @generated
	 */
	String getUseCase();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.order.requirement.Requirement#getUseCase <em>Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' attribute.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(String value);

	/**
	 * Returns the value of the '<em><b>Work Requirement Fulfillments</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.order.requirement.WorkRequirementFulfillment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Requirement Fulfillments</em>' reference list.
	 * @see org.abchip.mimo.biz.model.order.requirement.RequirementPackage#getRequirement_WorkRequirementFulfillments()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkRequirementFulfillment> getWorkRequirementFulfillments();

} // Requirement
