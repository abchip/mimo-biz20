/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.workeffort.impl;

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
import org.abchip.mimo.biz.model.workeffort.workeffort.CommunicationEventWorkEff;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortAttribute;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortContactMech;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortCostCalc;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortDeliverableProd;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortEventReminder;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetAssign;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortFixedAssetStd;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortInventoryAssign;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortInventoryProduced;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortKeyword;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortNote;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortPurposeType;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortSkillStandard;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortSurveyAppl;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortType;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getAccommodationMap <em>Accommodation Map</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getAccommodationSpot <em>Accommodation Spot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getActualCompletionDate <em>Actual Completion Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getActualMilliSeconds <em>Actual Milli Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getActualSetupMillis <em>Actual Setup Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getActualStartDate <em>Actual Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getCommunicationEventWorkEffs <em>Communication Event Work Effs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getCurrentStatus <em>Current Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getEstimateCalcMethod <em>Estimate Calc Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getEstimatedCompletionDate <em>Estimated Completion Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getEstimatedMilliSeconds <em>Estimated Milli Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getEstimatedSetupMillis <em>Estimated Setup Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getEstimatedStartDate <em>Estimated Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getInfoUrl <em>Info Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getLastStatusUpdate <em>Last Status Update</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getLocationDesc <em>Location Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getMoneyUom <em>Money Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getQuantityProduced <em>Quantity Produced</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getQuantityRejected <em>Quantity Rejected</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getQuantityToProduce <em>Quantity To Produce</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getRecurrenceInfo <em>Recurrence Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getRuntimeData <em>Runtime Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getScopeEnum <em>Scope Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#isSendNotificationEmail <em>Send Notification Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getServiceLoaderName <em>Service Loader Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getShowAsEnumId <em>Show As Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getSpecialTerms <em>Special Terms</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getTempExpr <em>Temp Expr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getTimeTransparency <em>Time Transparency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getTotalMilliSecondsAllowed <em>Total Milli Seconds Allowed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getTotalMoneyAllowed <em>Total Money Allowed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getUniversalId <em>Universal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortAttributes <em>Work Effort Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortContactMechs <em>Work Effort Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortCostCalcs <em>Work Effort Cost Calcs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortDeliverableProds <em>Work Effort Deliverable Prods</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortEventReminders <em>Work Effort Event Reminders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortFixedAssetAssigns <em>Work Effort Fixed Asset Assigns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortFixedAssetStds <em>Work Effort Fixed Asset Stds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortInventoryAssigns <em>Work Effort Inventory Assigns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortInventoryProduceds <em>Work Effort Inventory Produceds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortKeywords <em>Work Effort Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortName <em>Work Effort Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortNotes <em>Work Effort Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortParent <em>Work Effort Parent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortPurposeType <em>Work Effort Purpose Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortSkillStandards <em>Work Effort Skill Standards</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortSurveyAppls <em>Work Effort Survey Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortImpl#getWorkEffortType <em>Work Effort Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortImpl extends EntityTypedImpl<WorkEffortType> implements WorkEffort {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_STAMP, newCreatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__CREATED_TX_STAMP, newCreatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_STAMP, newLastUpdatedStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return (Date)eGet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		eSet(EntityPackage.Literals.ENTITY_INFO__LAST_UPDATED_TX_STAMP, newLastUpdatedTxStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualCompletionDate() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ACTUAL_COMPLETION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCompletionDate(Date newActualCompletionDate) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ACTUAL_COMPLETION_DATE, newActualCompletionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getActualMilliSeconds() {
		return (Double)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ACTUAL_MILLI_SECONDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualMilliSeconds(double newActualMilliSeconds) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ACTUAL_MILLI_SECONDS, newActualMilliSeconds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getActualSetupMillis() {
		return (Double)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ACTUAL_SETUP_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualSetupMillis(double newActualSetupMillis) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ACTUAL_SETUP_MILLIS, newActualSetupMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualStartDate() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ACTUAL_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualStartDate(Date newActualStartDate) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ACTUAL_START_DATE, newActualStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CommunicationEventWorkEff> getCommunicationEventWorkEffs() {
		return (List<CommunicationEventWorkEff>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__COMMUNICATION_EVENT_WORK_EFFS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getCurrentStatus() {
		return (StatusItem)eGet(WorkeffortPackage.Literals.WORK_EFFORT__CURRENT_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentStatus(StatusItem newCurrentStatus) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__CURRENT_STATUS, newCurrentStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getEstimateCalcMethod() {
		return (CustomMethod)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATE_CALC_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimateCalcMethod(CustomMethod newEstimateCalcMethod) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATE_CALC_METHOD, newEstimateCalcMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedCompletionDate() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATED_COMPLETION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCompletionDate(Date newEstimatedCompletionDate) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATED_COMPLETION_DATE, newEstimatedCompletionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedMilliSeconds() {
		return (Double)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATED_MILLI_SECONDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedMilliSeconds(double newEstimatedMilliSeconds) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATED_MILLI_SECONDS, newEstimatedMilliSeconds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getEstimatedSetupMillis() {
		return (Double)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATED_SETUP_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedSetupMillis(double newEstimatedSetupMillis) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATED_SETUP_MILLIS, newEstimatedSetupMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedStartDate() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATED_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedStartDate(Date newEstimatedStartDate) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ESTIMATED_START_DATE, newEstimatedStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacility() {
		return (Facility)eGet(WorkeffortPackage.Literals.WORK_EFFORT__FACILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacility(Facility newFacility) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__FACILITY, newFacility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAsset() {
		return (FixedAsset)eGet(WorkeffortPackage.Literals.WORK_EFFORT__FIXED_ASSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAsset(FixedAsset newFixedAsset) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__FIXED_ASSET, newFixedAsset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInfoUrl() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__INFO_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfoUrl(String newInfoUrl) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__INFO_URL, newInfoUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastStatusUpdate() {
		return (Date)eGet(WorkeffortPackage.Literals.WORK_EFFORT__LAST_STATUS_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastStatusUpdate(Date newLastStatusUpdate) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__LAST_STATUS_UPDATE, newLastStatusUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationDesc() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__LOCATION_DESC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationDesc(String newLocationDesc) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__LOCATION_DESC, newLocationDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMoneyUom() {
		return (Uom)eGet(WorkeffortPackage.Literals.WORK_EFFORT__MONEY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoneyUom(Uom newMoneyUom) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__MONEY_UOM, newMoneyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteData getNote() {
		return (NoteData)eGet(WorkeffortPackage.Literals.WORK_EFFORT__NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(NoteData newNote) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__NOTE, newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPercentComplete() {
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT__PERCENT_COMPLETE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentComplete(long newPercentComplete) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__PERCENT_COMPLETE, newPercentComplete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPriority() {
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT__PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(long newPriority) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityProduced() {
		return (BigDecimal)eGet(WorkeffortPackage.Literals.WORK_EFFORT__QUANTITY_PRODUCED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityProduced(BigDecimal newQuantityProduced) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__QUANTITY_PRODUCED, newQuantityProduced);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityRejected() {
		return (BigDecimal)eGet(WorkeffortPackage.Literals.WORK_EFFORT__QUANTITY_REJECTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityRejected(BigDecimal newQuantityRejected) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__QUANTITY_REJECTED, newQuantityRejected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityToProduce() {
		return (BigDecimal)eGet(WorkeffortPackage.Literals.WORK_EFFORT__QUANTITY_TO_PRODUCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityToProduce(BigDecimal newQuantityToProduce) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__QUANTITY_TO_PRODUCE, newQuantityToProduce);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurrenceInfo getRecurrenceInfo() {
		return (RecurrenceInfo)eGet(WorkeffortPackage.Literals.WORK_EFFORT__RECURRENCE_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrenceInfo(RecurrenceInfo newRecurrenceInfo) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__RECURRENCE_INFO, newRecurrenceInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReserv2ndPPPerc() {
		return (BigDecimal)eGet(WorkeffortPackage.Literals.WORK_EFFORT__RESERV2ND_PP_PERC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserv2ndPPPerc(BigDecimal newReserv2ndPPPerc) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__RESERV2ND_PP_PERC, newReserv2ndPPPerc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservNthPPPerc() {
		return (BigDecimal)eGet(WorkeffortPackage.Literals.WORK_EFFORT__RESERV_NTH_PP_PERC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservNthPPPerc(BigDecimal newReservNthPPPerc) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__RESERV_NTH_PP_PERC, newReservNthPPPerc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservPersons() {
		return (BigDecimal)eGet(WorkeffortPackage.Literals.WORK_EFFORT__RESERV_PERSONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservPersons(BigDecimal newReservPersons) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__RESERV_PERSONS, newReservPersons);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRevisionNumber() {
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT__REVISION_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionNumber(long newRevisionNumber) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__REVISION_NUMBER, newRevisionNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimeData getRuntimeData() {
		return (RuntimeData)eGet(WorkeffortPackage.Literals.WORK_EFFORT__RUNTIME_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeData(RuntimeData newRuntimeData) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__RUNTIME_DATA, newRuntimeData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getScopeEnum() {
		return (Enumeration)eGet(WorkeffortPackage.Literals.WORK_EFFORT__SCOPE_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopeEnum(Enumeration newScopeEnum) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__SCOPE_ENUM, newScopeEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSendNotificationEmail() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT__SEND_NOTIFICATION_EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendNotificationEmail(boolean newSendNotificationEmail) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__SEND_NOTIFICATION_EMAIL, newSendNotificationEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceLoaderName() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__SERVICE_LOADER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceLoaderName(String newServiceLoaderName) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__SERVICE_LOADER_NAME, newServiceLoaderName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShowAsEnumId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__SHOW_AS_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowAsEnumId(String newShowAsEnumId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__SHOW_AS_ENUM_ID, newShowAsEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceReferenceId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__SOURCE_REFERENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceReferenceId(String newSourceReferenceId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__SOURCE_REFERENCE_ID, newSourceReferenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialTerms() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__SPECIAL_TERMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialTerms(String newSpecialTerms) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__SPECIAL_TERMS, newSpecialTerms);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExpression getTempExpr() {
		return (TemporalExpression)eGet(WorkeffortPackage.Literals.WORK_EFFORT__TEMP_EXPR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempExpr(TemporalExpression newTempExpr) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__TEMP_EXPR, newTempExpr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeTransparency() {
		return (Long)eGet(WorkeffortPackage.Literals.WORK_EFFORT__TIME_TRANSPARENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeTransparency(long newTimeTransparency) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__TIME_TRANSPARENCY, newTimeTransparency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTotalMilliSecondsAllowed() {
		return (Double)eGet(WorkeffortPackage.Literals.WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalMilliSecondsAllowed(double newTotalMilliSecondsAllowed) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__TOTAL_MILLI_SECONDS_ALLOWED, newTotalMilliSecondsAllowed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalMoneyAllowed() {
		return (BigDecimal)eGet(WorkeffortPackage.Literals.WORK_EFFORT__TOTAL_MONEY_ALLOWED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalMoneyAllowed(BigDecimal newTotalMoneyAllowed) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__TOTAL_MONEY_ALLOWED, newTotalMoneyAllowed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUniversalId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__UNIVERSAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniversalId(String newUniversalId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__UNIVERSAL_ID, newUniversalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortAttribute> getWorkEffortAttributes() {
		return (List<WorkEffortAttribute>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortContactMech> getWorkEffortContactMechs() {
		return (List<WorkEffortContactMech>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_CONTACT_MECHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortCostCalc> getWorkEffortCostCalcs() {
		return (List<WorkEffortCostCalc>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_COST_CALCS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortDeliverableProd> getWorkEffortDeliverableProds() {
		return (List<WorkEffortDeliverableProd>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_DELIVERABLE_PRODS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortEventReminder> getWorkEffortEventReminders() {
		return (List<WorkEffortEventReminder>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_EVENT_REMINDERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortFixedAssetAssign> getWorkEffortFixedAssetAssigns() {
		return (List<WorkEffortFixedAssetAssign>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_ASSIGNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortFixedAssetStd> getWorkEffortFixedAssetStds() {
		return (List<WorkEffortFixedAssetStd>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_FIXED_ASSET_STDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortInventoryAssign> getWorkEffortInventoryAssigns() {
		return (List<WorkEffortInventoryAssign>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_INVENTORY_ASSIGNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortInventoryProduced> getWorkEffortInventoryProduceds() {
		return (List<WorkEffortInventoryProduced>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_INVENTORY_PRODUCEDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortKeyword> getWorkEffortKeywords() {
		return (List<WorkEffortKeyword>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_KEYWORDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_ID, newWorkEffortId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccommodationMap getAccommodationMap() {
		return (AccommodationMap)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ACCOMMODATION_MAP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationMap(AccommodationMap newAccommodationMap) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ACCOMMODATION_MAP, newAccommodationMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccommodationSpot getAccommodationSpot() {
		return (AccommodationSpot)eGet(WorkeffortPackage.Literals.WORK_EFFORT__ACCOMMODATION_SPOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccommodationSpot(AccommodationSpot newAccommodationSpot) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__ACCOMMODATION_SPOT, newAccommodationSpot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortName() {
		return (String)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortName(String newWorkEffortName) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_NAME, newWorkEffortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortNote> getWorkEffortNotes() {
		return (List<WorkEffortNote>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffortParent() {
		return (WorkEffort)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortParent(WorkEffort newWorkEffortParent) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_PARENT, newWorkEffortParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortPurposeType getWorkEffortPurposeType() {
		return (WorkEffortPurposeType)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortPurposeType(WorkEffortPurposeType newWorkEffortPurposeType) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_PURPOSE_TYPE, newWorkEffortPurposeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortSkillStandard> getWorkEffortSkillStandards() {
		return (List<WorkEffortSkillStandard>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_SKILL_STANDARDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<WorkEffortSurveyAppl> getWorkEffortSurveyAppls() {
		return (List<WorkEffortSurveyAppl>)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_SURVEY_APPLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffortType getWorkEffortType() {
		return (WorkEffortType)eGet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortType(WorkEffortType newWorkEffortType) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT__WORK_EFFORT_TYPE, newWorkEffortType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case WorkeffortPackage.WORK_EFFORT__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case WorkeffortPackage.WORK_EFFORT__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case WorkeffortPackage.WORK_EFFORT__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case WorkeffortPackage.WORK_EFFORT__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return WorkeffortPackage.WORK_EFFORT__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return WorkeffortPackage.WORK_EFFORT__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return WorkeffortPackage.WORK_EFFORT__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return WorkeffortPackage.WORK_EFFORT__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WorkEffortImpl
