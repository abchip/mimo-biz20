/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.party.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.payment.CreditCard;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.model.accounting.rate.PartyRate;
import org.abchip.mimo.biz.model.common.datasource.DataSource;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.humanres.ability.PartyQual;
import org.abchip.mimo.biz.model.humanres.ability.PartySkill;
import org.abchip.mimo.biz.model.humanres.ability.PerformanceNote;
import org.abchip.mimo.biz.model.humanres.employment.EmplLeave;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.PartyContactMech;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyAttribute;
import org.abchip.mimo.biz.model.party.party.PartyCarrierAccount;
import org.abchip.mimo.biz.model.party.party.PartyClassification;
import org.abchip.mimo.biz.model.party.party.PartyDataSource;
import org.abchip.mimo.biz.model.party.party.PartyGeoPoint;
import org.abchip.mimo.biz.model.party.party.PartyIdentification;
import org.abchip.mimo.biz.model.party.party.PartyNameHistory;
import org.abchip.mimo.biz.model.party.party.PartyNote;
import org.abchip.mimo.biz.model.party.party.PartyPackage;
import org.abchip.mimo.biz.model.party.party.PartyProfileDefault;
import org.abchip.mimo.biz.model.party.party.PartyRole;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.product.supplier.SupplierProductFeature;
import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.ecore.EClass;
import org.osgi.service.log.Logger;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Party</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getEmplLeaves <em>Empl Leaves</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getIsUnread <em>Is Unread</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyAttributes <em>Party Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyCarrierAccounts <em>Party Carrier Accounts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyClassifications <em>Party Classifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyContactMechs <em>Party Contact Mechs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyDataSources <em>Party Data Sources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyGeoPoints <em>Party Geo Points</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyIdentifications <em>Party Identifications</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyNameHistories <em>Party Name Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyNotes <em>Party Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyProfileDefaults <em>Party Profile Defaults</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyQuals <em>Party Quals</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyRates <em>Party Rates</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyRoles <em>Party Roles</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartySkills <em>Party Skills</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPartyType <em>Party Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPerformanceNotes <em>Performance Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getPreferredCurrencyUom <em>Preferred Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.party.party.impl.PartyImpl#getSupplierProductFeatures <em>Supplier Product Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyImpl extends EntityTypedImpl<PartyType> implements Party {

	private static Logger LOGGER = Logs.getLogger(PartyImpl.class);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(PartyPackage.Literals.PARTY__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(PartyPackage.Literals.PARTY__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(PartyPackage.Literals.PARTY__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(PartyPackage.Literals.PARTY__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getDataSource() {
		return (DataSource)eGet(PartyPackage.Literals.PARTY__DATA_SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSource(DataSource newDataSource) {
		eSet(PartyPackage.Literals.PARTY__DATA_SOURCE, newDataSource);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(PartyPackage.Literals.PARTY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PartyPackage.Literals.PARTY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EmplLeave> getEmplLeaves() {
		return (List<EmplLeave>)eGet(PartyPackage.Literals.PARTY__EMPL_LEAVES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eGet(PartyPackage.Literals.PARTY__EXTERNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eSet(PartyPackage.Literals.PARTY__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsUnread() {
		return (Boolean)eGet(PartyPackage.Literals.PARTY__IS_UNREAD, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnread(Boolean newIsUnread) {
		eSet(PartyPackage.Literals.PARTY__IS_UNREAD, newIsUnread);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		return (UserLogin)eGet(PartyPackage.Literals.PARTY__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		eSet(PartyPackage.Literals.PARTY__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(PartyPackage.Literals.PARTY__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(PartyPackage.Literals.PARTY__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyAttribute> getPartyAttributes() {
		return (List<PartyAttribute>)eGet(PartyPackage.Literals.PARTY__PARTY_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyCarrierAccount> getPartyCarrierAccounts() {
		return (List<PartyCarrierAccount>)eGet(PartyPackage.Literals.PARTY__PARTY_CARRIER_ACCOUNTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyClassification> getPartyClassifications() {
		return (List<PartyClassification>)eGet(PartyPackage.Literals.PARTY__PARTY_CLASSIFICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyContactMech> getPartyContactMechs() {
		return (List<PartyContactMech>)eGet(PartyPackage.Literals.PARTY__PARTY_CONTACT_MECHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyDataSource> getPartyDataSources() {
		return (List<PartyDataSource>)eGet(PartyPackage.Literals.PARTY__PARTY_DATA_SOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyGeoPoint> getPartyGeoPoints() {
		return (List<PartyGeoPoint>)eGet(PartyPackage.Literals.PARTY__PARTY_GEO_POINTS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyIdentification> getPartyIdentifications() {
		return (List<PartyIdentification>)eGet(PartyPackage.Literals.PARTY__PARTY_IDENTIFICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyNameHistory> getPartyNameHistories() {
		return (List<PartyNameHistory>)eGet(PartyPackage.Literals.PARTY__PARTY_NAME_HISTORIES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyNote> getPartyNotes() {
		return (List<PartyNote>)eGet(PartyPackage.Literals.PARTY__PARTY_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyProfileDefault> getPartyProfileDefaults() {
		return (List<PartyProfileDefault>)eGet(PartyPackage.Literals.PARTY__PARTY_PROFILE_DEFAULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyQual> getPartyQuals() {
		return (List<PartyQual>)eGet(PartyPackage.Literals.PARTY__PARTY_QUALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyRate> getPartyRates() {
		return (List<PartyRate>)eGet(PartyPackage.Literals.PARTY__PARTY_RATES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartyRole> getPartyRoles() {
		return (List<PartyRole>)eGet(PartyPackage.Literals.PARTY__PARTY_ROLES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PartySkill> getPartySkills() {
		return (List<PartySkill>)eGet(PartyPackage.Literals.PARTY__PARTY_SKILLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyType getPartyType() {
		return (PartyType)eGet(PartyPackage.Literals.PARTY__PARTY_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyType(PartyType newPartyType) {
		eSet(PartyPackage.Literals.PARTY__PARTY_TYPE, newPartyType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SupplierProductFeature> getSupplierProductFeatures() {
		return (List<SupplierProductFeature>)eGet(PartyPackage.Literals.PARTY__SUPPLIER_PRODUCT_FEATURES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public PaymentMethod getPaymentMethod(String methodType) {

		Resource<Party> resource = this.getResource();
		if (resource == null) {
			LOGGER.warn("Invalid resource");
			return null;
		}

		Context context = resource.getContext();
		try {
			String filter = "partyId = '" + this.getPartyId() + "'  AND thruDate IS NULL and paymentMethodTypeId = '" + methodType + "'";
			String order = "-fromDate";
			ResourceReader<PaymentMethod> paymentMethodReader = context.getResourceManager().getResourceReader(PaymentMethod.class);
			try (EntityIterator<PaymentMethod> paymentMethods = paymentMethodReader.find(filter, null, order)) {
				for (PaymentMethod paymentMethod : paymentMethods) {
					return paymentMethod;
				}
			}
		} catch (ResourceException e) {
			LOGGER.warn(e.getMessage());
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public CreditCard getCreditCard() {
		PaymentMethod paymentMethod = getPaymentMethod("CREDIT_CARD");
		if (paymentMethod == null)
			return null;

		Resource<Party> resource = this.getResource();
		if (resource == null) {
			LOGGER.warn("Invalid resource");
			return null;
		}

		return resource.getContext().createProxy(CreditCard.class, paymentMethod.getPaymentMethodId());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public PostalAddress getPostalAddress() {
		Resource<Party> resource = this.getResource();
		if (resource == null) {
			LOGGER.warn("Invalid resource");
			return null;
		}

		Context context = resource.getContext();
		try {
			String filter = "partyId = '" + this.getPartyId() + "'  AND thruDate IS NULL";
			String order = "-fromDate";
			ResourceReader<PartyContactMech> partyContactMechReader = context.getResourceManager().getResourceReader(PartyContactMech.class);

			try (EntityIterator<PartyContactMech> partyContactMechs = partyContactMechReader.find(filter, null, order)) {
				for (PartyContactMech partyContactMech : partyContactMechs) {
					ResourceReader<ContactMech> contactMechReader = context.getResourceManager().getResourceReader(ContactMech.class);
					ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMech().getContactMechId());

					if (!contactMech.getContactMechType().getContactMechTypeId().equals("POSTAL_ADDRESS"))
						continue;

					return context.createProxy(PostalAddress.class, contactMech.getContactMechId());
				}
			}

		} catch (ResourceException e) {
			LOGGER.warn(e.getMessage());
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public TelecomNumber getTelecomNumber() {
		Resource<Party> resource = this.getResource();
		if (resource == null) {
			LOGGER.warn("Invalid resource");
			return null;
		}

		Context context = resource.getContext();
		try {
			String filter = "partyId = '" + this.getPartyId() + "'  AND thruDate IS NULL";
			String order = "-fromDate";
			ResourceReader<PartyContactMech> partyContactMechReader = context.getResourceManager().getResourceReader(PartyContactMech.class);

			try (EntityIterator<PartyContactMech> partyContactMechs = partyContactMechReader.find(filter, null, order)) {
				for (PartyContactMech partyContactMech : partyContactMechs) {
					if (!partyContactMech.getContactMech().getContactMechType().getContactMechTypeId().equals("TELECOM_NUMBER"))
						continue;

					return context.createProxy(TelecomNumber.class, partyContactMech.getContactMech().getContactMechId());
				}
			}

		} catch (ResourceException e) {
			LOGGER.warn(e.getMessage());
		}

		return null;
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
				case PartyPackage.PARTY__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case PartyPackage.PARTY__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case PartyPackage.PARTY__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case PartyPackage.PARTY__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return PartyPackage.PARTY__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return PartyPackage.PARTY__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return PartyPackage.PARTY__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return PartyPackage.PARTY__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public ContactMech getEmail() {

		Resource<Party> resource = this.getResource();
		if (resource == null) {
			LOGGER.warn("Invalid resource");
			return null;
		}

		Context context = resource.getContext();
		try {
			String filter = "partyId = '" + this.getPartyId() + "'  AND thruDate IS NULL";
			String order = "-fromDate";
			ResourceReader<PartyContactMech> partyContactMechReader = context.getResourceManager().getResourceReader(PartyContactMech.class);

			try (EntityIterator<PartyContactMech> partyContactMechs = partyContactMechReader.find(filter, null, order)) {
				for (PartyContactMech partyContactMech : partyContactMechs) {
					if (!partyContactMech.getContactMech().getContactMechType().getContactMechTypeId().equals("EMAIL_ADDRESS"))
						continue;

					return partyContactMech.getContactMech();
				}
			}

		} catch (ResourceException e) {
			LOGGER.warn(e.getMessage());
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PerformanceNote> getPerformanceNotes() {
		return (List<PerformanceNote>)eGet(PartyPackage.Literals.PARTY__PERFORMANCE_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getPreferredCurrencyUom() {
		return (Uom)eGet(PartyPackage.Literals.PARTY__PREFERRED_CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredCurrencyUom(Uom newPreferredCurrencyUom) {
		eSet(PartyPackage.Literals.PARTY__PREFERRED_CURRENCY_UOM, newPreferredCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatus() {
		return (StatusItem)eGet(PartyPackage.Literals.PARTY__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(StatusItem newStatus) {
		eSet(PartyPackage.Literals.PARTY__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(PartyPackage.Literals.PARTY__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(PartyPackage.Literals.PARTY__PARTY_ID, newPartyId);
	}

} // PartyImpl
