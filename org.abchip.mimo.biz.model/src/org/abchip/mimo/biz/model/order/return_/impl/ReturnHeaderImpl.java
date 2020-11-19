/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.return_.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.model.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.order.return_.CommunicationEventReturn;
import org.abchip.mimo.biz.model.order.return_.ReturnHeader;
import org.abchip.mimo.biz.model.order.return_.ReturnHeaderType;
import org.abchip.mimo.biz.model.order.return_.ReturnItem;
import org.abchip.mimo.biz.model.order.return_.ReturnPackage;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.facility.Facility;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getBillingAccount <em>Billing Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getCommunicationEventReturns <em>Communication Event Returns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getDestinationFacility <em>Destination Facility</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getFinAccount <em>Fin Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getFromParty <em>From Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getNeedsInventoryReceive <em>Needs Inventory Receive</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getOriginContactMech <em>Origin Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getPaymentMethod <em>Payment Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getReturnHeaderType <em>Return Header Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getReturnItems <em>Return Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getSupplierRmaId <em>Supplier Rma Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.order.return_.impl.ReturnHeaderImpl#getToParty <em>To Party</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnHeaderImpl extends EntityTypedImpl<ReturnHeaderType> implements ReturnHeader {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_HEADER;
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
	public UserLogin getCreatedBy() {
		return (UserLogin)eGet(ReturnPackage.Literals.RETURN_HEADER__CREATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedBy(UserLogin newCreatedBy) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__CREATED_BY, newCreatedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(ReturnPackage.Literals.RETURN_HEADER__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getDestinationFacility() {
		return (Facility)eGet(ReturnPackage.Literals.RETURN_HEADER__DESTINATION_FACILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationFacility(Facility newDestinationFacility) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__DESTINATION_FACILITY, newDestinationFacility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return (Date)eGet(ReturnPackage.Literals.RETURN_HEADER__ENTRY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__ENTRY_DATE, newEntryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccount() {
		return (FinAccount)eGet(ReturnPackage.Literals.RETURN_HEADER__FIN_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccount(FinAccount newFinAccount) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__FIN_ACCOUNT, newFinAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getFromParty() {
		return (Party)eGet(ReturnPackage.Literals.RETURN_HEADER__FROM_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromParty(Party newFromParty) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__FROM_PARTY, newFromParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNeedsInventoryReceive() {
		return (Boolean)eGet(ReturnPackage.Literals.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsInventoryReceive(Boolean newNeedsInventoryReceive) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__NEEDS_INVENTORY_RECEIVE, newNeedsInventoryReceive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getOriginContactMech() {
		return (ContactMech)eGet(ReturnPackage.Literals.RETURN_HEADER__ORIGIN_CONTACT_MECH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginContactMech(ContactMech newOriginContactMech) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__ORIGIN_CONTACT_MECH, newOriginContactMech);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethod() {
		return (PaymentMethod)eGet(ReturnPackage.Literals.RETURN_HEADER__PAYMENT_METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethod(PaymentMethod newPaymentMethod) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__PAYMENT_METHOD, newPaymentMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeaderType getReturnHeaderType() {
		return (ReturnHeaderType)eGet(ReturnPackage.Literals.RETURN_HEADER__RETURN_HEADER_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnHeaderType(ReturnHeaderType newReturnHeaderType) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__RETURN_HEADER_TYPE, newReturnHeaderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ReturnItem> getReturnItems() {
		return (List<ReturnItem>)eGet(ReturnPackage.Literals.RETURN_HEADER__RETURN_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(ReturnPackage.Literals.RETURN_HEADER__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_HEADER__RETURN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(String newReturnId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__RETURN_ID, newReturnId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingAccount getBillingAccount() {
		return (BillingAccount)eGet(ReturnPackage.Literals.RETURN_HEADER__BILLING_ACCOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccount(BillingAccount newBillingAccount) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__BILLING_ACCOUNT, newBillingAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CommunicationEventReturn> getCommunicationEventReturns() {
		return (List<CommunicationEventReturn>)eGet(ReturnPackage.Literals.RETURN_HEADER__COMMUNICATION_EVENT_RETURNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierRmaId() {
		return (String)eGet(ReturnPackage.Literals.RETURN_HEADER__SUPPLIER_RMA_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierRmaId(String newSupplierRmaId) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__SUPPLIER_RMA_ID, newSupplierRmaId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getToParty() {
		return (Party)eGet(ReturnPackage.Literals.RETURN_HEADER__TO_PARTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToParty(Party newToParty) {
		eSet(ReturnPackage.Literals.RETURN_HEADER__TO_PARTY, newToParty);
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
				case ReturnPackage.RETURN_HEADER__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case ReturnPackage.RETURN_HEADER__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case ReturnPackage.RETURN_HEADER__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case ReturnPackage.RETURN_HEADER__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return ReturnPackage.RETURN_HEADER__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return ReturnPackage.RETURN_HEADER__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return ReturnPackage.RETURN_HEADER__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return ReturnPackage.RETURN_HEADER__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReturnHeaderImpl
