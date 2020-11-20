/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.workeffort;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.fixedasset.AccommodationMap;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.common.enum_.Enumeration;
import org.abchip.mimo.biz.model.common.method.CustomMethod;
import org.abchip.mimo.biz.model.common.note.NoteData;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.reservations.AccommodationSpot;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.service.schedule.RecurrenceInfo;
import org.abchip.mimo.biz.model.service.schedule.RuntimeData;
import org.abchip.mimo.biz.model.service.schedule.TemporalExpression;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getAccommodationMap <em>Accommodation Map</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getAccommodationSpot <em>Accommodation Spot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getActualCompletionDate <em>Actual Completion Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getActualMilliSeconds <em>Actual Milli Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getActualSetupMillis <em>Actual Setup Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getCommunicationEventWorkEffs <em>Communication Event Work Effs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getCurrentStatus <em>Current Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimateCalcMethod <em>Estimate Calc Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimatedCompletionDate <em>Estimated Completion Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimatedMilliSeconds <em>Estimated Milli Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimatedSetupMillis <em>Estimated Setup Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getInfoUrl <em>Info Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getLastStatusUpdate <em>Last Status Update</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getLocationDesc <em>Location Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getMoneyUom <em>Money Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getNote <em>Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getQuantityProduced <em>Quantity Produced</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getQuantityRejected <em>Quantity Rejected</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getQuantityToProduce <em>Quantity To Produce</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getRecurrenceInfo <em>Recurrence Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getRuntimeData <em>Runtime Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getScopeEnum <em>Scope Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#isSendNotificationEmail <em>Send Notification Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getServiceLoaderName <em>Service Loader Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getShowAsEnumId <em>Show As Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getSpecialTerms <em>Special Terms</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getTempExpr <em>Temp Expr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getTimeTransparency <em>Time Transparency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getTotalMilliSecondsAllowed <em>Total Milli Seconds Allowed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getTotalMoneyAllowed <em>Total Money Allowed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getUniversalId <em>Universal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortAttributes <em>Work Effort Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortContactMechs <em>Work Effort Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortCostCalcs <em>Work Effort Cost Calcs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortDeliverableProds <em>Work Effort Deliverable Prods</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortEventReminders <em>Work Effort Event Reminders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortFixedAssetAssigns <em>Work Effort Fixed Asset Assigns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortFixedAssetStds <em>Work Effort Fixed Asset Stds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortInventoryAssigns <em>Work Effort Inventory Assigns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortInventoryProduceds <em>Work Effort Inventory Produceds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortKeywords <em>Work Effort Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortName <em>Work Effort Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortNotes <em>Work Effort Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortParent <em>Work Effort Parent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortPurposeType <em>Work Effort Purpose Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortReviews <em>Work Effort Reviews</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortSkillStandards <em>Work Effort Skill Standards</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortStatuses <em>Work Effort Statuses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortSurveyAppls <em>Work Effort Survey Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortType <em>Work Effort Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface WorkEffort extends EntityTyped<WorkEffortType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Actual Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Completion Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Completion Date</em>' attribute.
	 * @see #setActualCompletionDate(Date)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ActualCompletionDate()
	 * @model
	 * @generated
	 */
	Date getActualCompletionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getActualCompletionDate <em>Actual Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Completion Date</em>' attribute.
	 * @see #getActualCompletionDate()
	 * @generated
	 */
	void setActualCompletionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Actual Milli Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Milli Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Milli Seconds</em>' attribute.
	 * @see #setActualMilliSeconds(double)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ActualMilliSeconds()
	 * @model
	 * @generated
	 */
	double getActualMilliSeconds();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getActualMilliSeconds <em>Actual Milli Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Milli Seconds</em>' attribute.
	 * @see #getActualMilliSeconds()
	 * @generated
	 */
	void setActualMilliSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Actual Setup Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Setup Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Setup Millis</em>' attribute.
	 * @see #setActualSetupMillis(double)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ActualSetupMillis()
	 * @model
	 * @generated
	 */
	double getActualSetupMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getActualSetupMillis <em>Actual Setup Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Setup Millis</em>' attribute.
	 * @see #getActualSetupMillis()
	 * @generated
	 */
	void setActualSetupMillis(double value);

	/**
	 * Returns the value of the '<em><b>Actual Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Start Date</em>' attribute.
	 * @see #setActualStartDate(Date)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ActualStartDate()
	 * @model
	 * @generated
	 */
	Date getActualStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getActualStartDate <em>Actual Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Start Date</em>' attribute.
	 * @see #getActualStartDate()
	 * @generated
	 */
	void setActualStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Communication Event Work Effs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.CommunicationEventWorkEff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Work Effs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_CommunicationEventWorkEffs()
	 * @model derived="true"
	 * @generated
	 */
	List<CommunicationEventWorkEff> getCommunicationEventWorkEffs();

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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Current Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Status</em>' reference.
	 * @see #setCurrentStatus(StatusItem)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_CurrentStatus()
	 * @model
	 * @generated
	 */
	StatusItem getCurrentStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getCurrentStatus <em>Current Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Status</em>' reference.
	 * @see #getCurrentStatus()
	 * @generated
	 */
	void setCurrentStatus(StatusItem value);

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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_Description()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Estimate Calc Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimate Calc Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimate Calc Method</em>' reference.
	 * @see #setEstimateCalcMethod(CustomMethod)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimateCalcMethod()
	 * @model
	 * @generated
	 */
	CustomMethod getEstimateCalcMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimateCalcMethod <em>Estimate Calc Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimate Calc Method</em>' reference.
	 * @see #getEstimateCalcMethod()
	 * @generated
	 */
	void setEstimateCalcMethod(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Estimated Completion Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Completion Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Completion Date</em>' attribute.
	 * @see #setEstimatedCompletionDate(Date)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimatedCompletionDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedCompletionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimatedCompletionDate <em>Estimated Completion Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Completion Date</em>' attribute.
	 * @see #getEstimatedCompletionDate()
	 * @generated
	 */
	void setEstimatedCompletionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Milli Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Milli Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Milli Seconds</em>' attribute.
	 * @see #setEstimatedMilliSeconds(double)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimatedMilliSeconds()
	 * @model
	 * @generated
	 */
	double getEstimatedMilliSeconds();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimatedMilliSeconds <em>Estimated Milli Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Milli Seconds</em>' attribute.
	 * @see #getEstimatedMilliSeconds()
	 * @generated
	 */
	void setEstimatedMilliSeconds(double value);

	/**
	 * Returns the value of the '<em><b>Estimated Setup Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Setup Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Setup Millis</em>' attribute.
	 * @see #setEstimatedSetupMillis(double)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimatedSetupMillis()
	 * @model
	 * @generated
	 */
	double getEstimatedSetupMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimatedSetupMillis <em>Estimated Setup Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Setup Millis</em>' attribute.
	 * @see #getEstimatedSetupMillis()
	 * @generated
	 */
	void setEstimatedSetupMillis(double value);

	/**
	 * Returns the value of the '<em><b>Estimated Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #setEstimatedStartDate(Date)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_EstimatedStartDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getEstimatedStartDate <em>Estimated Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Start Date</em>' attribute.
	 * @see #getEstimatedStartDate()
	 * @generated
	 */
	void setEstimatedStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility</em>' reference.
	 * @see #setFacility(Facility)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_Facility()
	 * @model
	 * @generated
	 */
	Facility getFacility();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getFacility <em>Facility</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility</em>' reference.
	 * @see #getFacility()
	 * @generated
	 */
	void setFacility(Facility value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset</em>' reference.
	 * @see #setFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_FixedAsset()
	 * @model annotation="mimo-ent-slot help='Deprecated - use the WorkEffortFixedAssetAssign entity instead'"
	 * @generated
	 */
	FixedAsset getFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getFixedAsset <em>Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset</em>' reference.
	 * @see #getFixedAsset()
	 * @generated
	 */
	void setFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Info Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Url</em>' attribute.
	 * @see #setInfoUrl(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_InfoUrl()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getInfoUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getInfoUrl <em>Info Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Url</em>' attribute.
	 * @see #getInfoUrl()
	 * @generated
	 */
	void setInfoUrl(String value);

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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Status Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Status Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Status Update</em>' attribute.
	 * @see #setLastStatusUpdate(Date)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_LastStatusUpdate()
	 * @model
	 * @generated
	 */
	Date getLastStatusUpdate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getLastStatusUpdate <em>Last Status Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Status Update</em>' attribute.
	 * @see #getLastStatusUpdate()
	 * @generated
	 */
	void setLastStatusUpdate(Date value);

	/**
	 * Returns the value of the '<em><b>Location Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Desc</em>' attribute.
	 * @see #setLocationDesc(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_LocationDesc()
	 * @model annotation="mimo-ent-format type='description'"
	 * @generated
	 */
	String getLocationDesc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getLocationDesc <em>Location Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Desc</em>' attribute.
	 * @see #getLocationDesc()
	 * @generated
	 */
	void setLocationDesc(String value);

	/**
	 * Returns the value of the '<em><b>Money Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Money Uom</em>' reference.
	 * @see #setMoneyUom(Uom)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_MoneyUom()
	 * @model
	 * @generated
	 */
	Uom getMoneyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getMoneyUom <em>Money Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Money Uom</em>' reference.
	 * @see #getMoneyUom()
	 * @generated
	 */
	void setMoneyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference.
	 * @see #setNote(NoteData)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_Note()
	 * @model
	 * @generated
	 */
	NoteData getNote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(NoteData value);

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #setPercentComplete(long)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_PercentComplete()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPercentComplete();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(long value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(long)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_Priority()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPriority();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(long value);

	/**
	 * Returns the value of the '<em><b>Quantity Produced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Produced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Produced</em>' attribute.
	 * @see #setQuantityProduced(BigDecimal)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_QuantityProduced()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityProduced();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getQuantityProduced <em>Quantity Produced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Produced</em>' attribute.
	 * @see #getQuantityProduced()
	 * @generated
	 */
	void setQuantityProduced(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Rejected</em>' attribute.
	 * @see #setQuantityRejected(BigDecimal)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_QuantityRejected()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityRejected();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getQuantityRejected <em>Quantity Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Rejected</em>' attribute.
	 * @see #getQuantityRejected()
	 * @generated
	 */
	void setQuantityRejected(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity To Produce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity To Produce</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity To Produce</em>' attribute.
	 * @see #setQuantityToProduce(BigDecimal)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_QuantityToProduce()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityToProduce();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getQuantityToProduce <em>Quantity To Produce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity To Produce</em>' attribute.
	 * @see #getQuantityToProduce()
	 * @generated
	 */
	void setQuantityToProduce(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Recurrence Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence Info</em>' reference.
	 * @see #setRecurrenceInfo(RecurrenceInfo)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_RecurrenceInfo()
	 * @model annotation="mimo-ent-slot help='Deprecated - use the tempExprId field instead'"
	 * @generated
	 */
	RecurrenceInfo getRecurrenceInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getRecurrenceInfo <em>Recurrence Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence Info</em>' reference.
	 * @see #getRecurrenceInfo()
	 * @generated
	 */
	void setRecurrenceInfo(RecurrenceInfo value);

	/**
	 * Returns the value of the '<em><b>Reserv2nd PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv2nd PP Perc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv2nd PP Perc</em>' attribute.
	 * @see #setReserv2ndPPPerc(BigDecimal)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_Reserv2ndPPPerc()
	 * @model annotation="mimo-ent-slot help='reservationSecondPersonPricePercentage: percentage of the end price for the 2nd person renting this asset connected to the workEffort'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReserv2ndPPPerc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv2nd PP Perc</em>' attribute.
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 */
	void setReserv2ndPPPerc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Nth PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Nth PP Perc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Nth PP Perc</em>' attribute.
	 * @see #setReservNthPPPerc(BigDecimal)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ReservNthPPPerc()
	 * @model annotation="mimo-ent-slot help='reservationNthPersonPricePercentage: percentage of the end price for the Nth (2+) person renting this asset connected to the workEffort'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservNthPPPerc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Nth PP Perc</em>' attribute.
	 * @see #getReservNthPPPerc()
	 * @generated
	 */
	void setReservNthPPPerc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Persons</em>' attribute.
	 * @see #setReservPersons(BigDecimal)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ReservPersons()
	 * @model annotation="mimo-ent-slot help='the number of persons renting the attached asset'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservPersons();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getReservPersons <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Persons</em>' attribute.
	 * @see #getReservPersons()
	 * @generated
	 */
	void setReservPersons(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(long)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_RevisionNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getRevisionNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(long value);

	/**
	 * Returns the value of the '<em><b>Runtime Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Data</em>' reference.
	 * @see #setRuntimeData(RuntimeData)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_RuntimeData()
	 * @model
	 * @generated
	 */
	RuntimeData getRuntimeData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getRuntimeData <em>Runtime Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Data</em>' reference.
	 * @see #getRuntimeData()
	 * @generated
	 */
	void setRuntimeData(RuntimeData value);

	/**
	 * Returns the value of the '<em><b>Scope Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Enum</em>' reference.
	 * @see #setScopeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ScopeEnum()
	 * @model
	 * @generated
	 */
	Enumeration getScopeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getScopeEnum <em>Scope Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Enum</em>' reference.
	 * @see #getScopeEnum()
	 * @generated
	 */
	void setScopeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Send Notification Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Notification Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Notification Email</em>' attribute.
	 * @see #setSendNotificationEmail(boolean)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_SendNotificationEmail()
	 * @model required="true"
	 * @generated
	 */
	boolean isSendNotificationEmail();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#isSendNotificationEmail <em>Send Notification Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Notification Email</em>' attribute.
	 * @see #isSendNotificationEmail()
	 * @generated
	 */
	void setSendNotificationEmail(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Loader Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Loader Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Loader Name</em>' attribute.
	 * @see #setServiceLoaderName(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ServiceLoaderName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getServiceLoaderName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getServiceLoaderName <em>Service Loader Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Loader Name</em>' attribute.
	 * @see #getServiceLoaderName()
	 * @generated
	 */
	void setServiceLoaderName(String value);

	/**
	 * Returns the value of the '<em><b>Show As Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show As Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show As Enum Id</em>' attribute.
	 * @see #setShowAsEnumId(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_ShowAsEnumId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShowAsEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getShowAsEnumId <em>Show As Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show As Enum Id</em>' attribute.
	 * @see #getShowAsEnumId()
	 * @generated
	 */
	void setShowAsEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Reference Id</em>' attribute.
	 * @see #setSourceReferenceId(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_SourceReferenceId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSourceReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getSourceReferenceId <em>Source Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference Id</em>' attribute.
	 * @see #getSourceReferenceId()
	 * @generated
	 */
	void setSourceReferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Special Terms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Terms</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Terms</em>' attribute.
	 * @see #setSpecialTerms(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_SpecialTerms()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSpecialTerms();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getSpecialTerms <em>Special Terms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Terms</em>' attribute.
	 * @see #getSpecialTerms()
	 * @generated
	 */
	void setSpecialTerms(String value);

	/**
	 * Returns the value of the '<em><b>Temp Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Expr</em>' reference.
	 * @see #setTempExpr(TemporalExpression)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_TempExpr()
	 * @model
	 * @generated
	 */
	TemporalExpression getTempExpr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getTempExpr <em>Temp Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Expr</em>' reference.
	 * @see #getTempExpr()
	 * @generated
	 */
	void setTempExpr(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>Time Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Transparency</em>' attribute.
	 * @see #setTimeTransparency(long)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_TimeTransparency()
	 * @model annotation="mimo-ent-slot help='Deprecated - use the availabilityStatusId field in the assignment entities instead'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTimeTransparency();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getTimeTransparency <em>Time Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Transparency</em>' attribute.
	 * @see #getTimeTransparency()
	 * @generated
	 */
	void setTimeTransparency(long value);

	/**
	 * Returns the value of the '<em><b>Total Milli Seconds Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Milli Seconds Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Milli Seconds Allowed</em>' attribute.
	 * @see #setTotalMilliSecondsAllowed(double)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_TotalMilliSecondsAllowed()
	 * @model
	 * @generated
	 */
	double getTotalMilliSecondsAllowed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getTotalMilliSecondsAllowed <em>Total Milli Seconds Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Milli Seconds Allowed</em>' attribute.
	 * @see #getTotalMilliSecondsAllowed()
	 * @generated
	 */
	void setTotalMilliSecondsAllowed(double value);

	/**
	 * Returns the value of the '<em><b>Total Money Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Money Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Money Allowed</em>' attribute.
	 * @see #setTotalMoneyAllowed(BigDecimal)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_TotalMoneyAllowed()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getTotalMoneyAllowed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getTotalMoneyAllowed <em>Total Money Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Money Allowed</em>' attribute.
	 * @see #getTotalMoneyAllowed()
	 * @generated
	 */
	void setTotalMoneyAllowed(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Universal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universal Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universal Id</em>' attribute.
	 * @see #setUniversalId(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_UniversalId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getUniversalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getUniversalId <em>Universal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universal Id</em>' attribute.
	 * @see #getUniversalId()
	 * @generated
	 */
	void setUniversalId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortAttribute> getWorkEffortAttributes();

	/**
	 * Returns the value of the '<em><b>Work Effort Contact Mechs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortContactMech}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Contact Mechs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortContactMechs()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<WorkEffortContactMech> getWorkEffortContactMechs();

	/**
	 * Returns the value of the '<em><b>Work Effort Cost Calcs</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortCostCalc}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Cost Calcs</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortCostCalcs()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<WorkEffortCostCalc> getWorkEffortCostCalcs();

	/**
	 * Returns the value of the '<em><b>Work Effort Deliverable Prods</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortDeliverableProd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Deliverable Prods</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortDeliverableProds()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortDeliverableProd> getWorkEffortDeliverableProds();

	/**
	 * Returns the value of the '<em><b>Work Effort Event Reminders</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortEventReminder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Event Reminders</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortEventReminders()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortEventReminder> getWorkEffortEventReminders();

	/**
	 * Returns the value of the '<em><b>Work Effort Fixed Asset Assigns</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetAssign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Fixed Asset Assigns</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortFixedAssetAssigns()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<WorkEffortFixedAssetAssign> getWorkEffortFixedAssetAssigns();

	/**
	 * Returns the value of the '<em><b>Work Effort Fixed Asset Stds</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Fixed Asset Stds</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortFixedAssetStds()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortFixedAssetStd> getWorkEffortFixedAssetStds();

	/**
	 * Returns the value of the '<em><b>Work Effort Inventory Assigns</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortInventoryAssign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Inventory Assigns</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortInventoryAssigns()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortInventoryAssign> getWorkEffortInventoryAssigns();

	/**
	 * Returns the value of the '<em><b>Work Effort Inventory Produceds</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortInventoryProduced}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Inventory Produceds</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortInventoryProduceds()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortInventoryProduced> getWorkEffortInventoryProduceds();

	/**
	 * Returns the value of the '<em><b>Work Effort Keywords</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortKeyword}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Keywords</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortKeywords()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortKeyword> getWorkEffortKeywords();

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

	/**
	 * Returns the value of the '<em><b>Accommodation Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Map</em>' reference.
	 * @see #setAccommodationMap(AccommodationMap)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_AccommodationMap()
	 * @model
	 * @generated
	 */
	AccommodationMap getAccommodationMap();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getAccommodationMap <em>Accommodation Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Map</em>' reference.
	 * @see #getAccommodationMap()
	 * @generated
	 */
	void setAccommodationMap(AccommodationMap value);

	/**
	 * Returns the value of the '<em><b>Accommodation Spot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accommodation Spot</em>' reference.
	 * @see #setAccommodationSpot(AccommodationSpot)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_AccommodationSpot()
	 * @model
	 * @generated
	 */
	AccommodationSpot getAccommodationSpot();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getAccommodationSpot <em>Accommodation Spot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accommodation Spot</em>' reference.
	 * @see #getAccommodationSpot()
	 * @generated
	 */
	void setAccommodationSpot(AccommodationSpot value);

	/**
	 * Returns the value of the '<em><b>Work Effort Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Name</em>' attribute.
	 * @see #setWorkEffortName(String)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortName()
	 * @model annotation="mimo-ent-format type='name'"
	 * @generated
	 */
	String getWorkEffortName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortName <em>Work Effort Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Name</em>' attribute.
	 * @see #getWorkEffortName()
	 * @generated
	 */
	void setWorkEffortName(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortNote> getWorkEffortNotes();

	/**
	 * Returns the value of the '<em><b>Work Effort Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Parent</em>' reference.
	 * @see #setWorkEffortParent(WorkEffort)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortParent()
	 * @model annotation="mimo-ent-slot help='The primary parent (or the like); it should be one of the parent WorkEfforts already setup in WorkEffortAssoc'"
	 * @generated
	 */
	WorkEffort getWorkEffortParent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortParent <em>Work Effort Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Parent</em>' reference.
	 * @see #getWorkEffortParent()
	 * @generated
	 */
	void setWorkEffortParent(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Work Effort Purpose Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Purpose Type</em>' reference.
	 * @see #setWorkEffortPurposeType(WorkEffortPurposeType)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortPurposeType()
	 * @model
	 * @generated
	 */
	WorkEffortPurposeType getWorkEffortPurposeType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortPurposeType <em>Work Effort Purpose Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Purpose Type</em>' reference.
	 * @see #getWorkEffortPurposeType()
	 * @generated
	 */
	void setWorkEffortPurposeType(WorkEffortPurposeType value);

	/**
	 * Returns the value of the '<em><b>Work Effort Reviews</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortReview}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Reviews</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortReviews()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints reviewDate='*NOW'"
	 * @generated
	 */
	List<WorkEffortReview> getWorkEffortReviews();

	/**
	 * Returns the value of the '<em><b>Work Effort Skill Standards</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortSkillStandard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Skill Standards</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortSkillStandards()
	 * @model derived="true"
	 * @generated
	 */
	List<WorkEffortSkillStandard> getWorkEffortSkillStandards();

	/**
	 * Returns the value of the '<em><b>Work Effort Statuses</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Statuses</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortStatuses()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints statusDatetime='*NOW'"
	 * @generated
	 */
	List<WorkEffortStatus> getWorkEffortStatuses();

	/**
	 * Returns the value of the '<em><b>Work Effort Survey Appls</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortSurveyAppl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Survey Appls</em>' reference list.
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortSurveyAppls()
	 * @model derived="true"
	 *        annotation="mimo-ent-slot-constraints fromDate='*NOW'"
	 * @generated
	 */
	List<WorkEffortSurveyAppl> getWorkEffortSurveyAppls();

	/**
	 * Returns the value of the '<em><b>Work Effort Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Type</em>' reference.
	 * @see #setWorkEffortType(WorkEffortType)
	 * @see org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage#getWorkEffort_WorkEffortType()
	 * @model
	 * @generated
	 */
	WorkEffortType getWorkEffortType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort#getWorkEffortType <em>Work Effort Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Type</em>' reference.
	 * @see #getWorkEffortType()
	 * @generated
	 */
	void setWorkEffortType(WorkEffortType value);

} // WorkEffort
