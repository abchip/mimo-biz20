/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.model.accounting.payment.CreditCard;
import org.abchip.mimo.biz.model.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechType;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyGroup;
import org.abchip.mimo.biz.model.party.party.PartyIdentification;
import org.abchip.mimo.biz.model.party.party.PartyIdentificationType;
import org.abchip.mimo.biz.model.party.party.PartyRole;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.biz.model.party.party.RoleType;
import org.abchip.mimo.biz.service.common.GetCommonDefault;
import org.abchip.mimo.biz.service.common.GetCommonDefaultResponse;
import org.abchip.mimo.biz.service.party.CreatePartyContactMech;
import org.abchip.mimo.biz.service.party.CreatePartyContactMechPurpose;
import org.abchip.mimo.biz.service.party.CreatePartyContactMechPurposeResponse;
import org.abchip.mimo.biz.service.party.CreatePartyContactMechResponse;
import org.abchip.mimo.biz.service.party.GetPartyDefault;
import org.abchip.mimo.biz.service.party.GetPartyDefaultResponse;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceException;
import org.abchip.mimo.service.ServiceManager;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class CreateParty implements Callable<Long> {

	private static final Logger LOGGER = Logs.getLogger(CreateParty.class);
	Context context;
	GetCommonDefaultResponse commonDefault;
	GetPartyDefaultResponse partyDefault;

	public CreateParty(Context context) {
		this.context = context;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		GetPartyDefault getPartyDefault = serviceManager.prepare(GetPartyDefault.class);
		partyDefault = serviceManager.execute(getPartyDefault);

		long time1 = System.currentTimeMillis();

		createPartyGroup(serviceManager, "CUSTOMER");
		createPerson(serviceManager, "CUSTOMER");
		createPartyGroup(serviceManager, "SUPPLIER");
		createPerson(serviceManager, "SUPPLIER");
		createPaymentForCompany();

		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}


	public void createPartyGroup(ServiceManager serviceManager, String role) throws ResourceException, ServiceException {

		// Create PartyGroup
		ResourceWriter<PartyGroup> partyGroupWriter = context.getResourceManager().getResourceWriter(PartyGroup.class);
		PartyGroup partyGroup = partyGroupWriter.make();
		partyGroup.setStatusId(context.createProxy(StatusItem.class, "PARTY_ENABLED"));
		partyGroup.setPartyTypeId(context.createProxy(PartyType.class, "PARTY_GROUP"));
		partyGroup.setPreferredCurrencyUomId(commonDefault.getCurrencyUom());
		// nome
		partyGroup.setGroupName("Description Party " + role.toLowerCase());
		partyGroupWriter.create(partyGroup);

		createRelated(serviceManager, partyGroup, role);
		LOGGER.info("Create PartyGroup " + role + " " + partyGroup.getID());
	}

	public void createPerson(ServiceManager serviceManager, String role) throws ResourceException, ServiceException {

		// Create Person
		ResourceWriter<Person> personWriter = context.getResourceManager().getResourceWriter(Person.class);
		Person person = personWriter.make();
		person.setStatusId(context.createProxy(StatusItem.class, "PARTY_ENABLED"));
		person.setPartyTypeId(context.createProxy(PartyType.class, "PERSON"));
		person.setPreferredCurrencyUomId(commonDefault.getCurrencyUom());
		person.setFirstName("First name " + role.toLowerCase());
		person.setLastName("Last name " + role.toLowerCase());
		personWriter.create(person);

		createRelated(serviceManager, person, role);
		LOGGER.info("Create Person " + role + " " + person.getID());
	}

	private void createRelated(ServiceManager serviceManager, Party party, String role) throws ResourceException, ServiceException {

		// Base role
		ResourceWriter<PartyRole> partyRoleWriter = context.getResourceManager().getResourceWriter(PartyRole.class);
		PartyRole partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(context.createProxy(RoleType.class, role));
		partyRoleWriter.create(partyRole);

		switch (role) {
		case "CUSTOMER":
			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.createProxy(RoleType.class, "BILL_TO_CUSTOMER"));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.createProxy(RoleType.class, "SHIP_TO_CUSTOMER"));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.createProxy(RoleType.class, "END_USER_CUSTOMER"));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.createProxy(RoleType.class, "PLACING_CUSTOMER"));
			partyRoleWriter.create(partyRole);
			break;
		case "SUPPLIER":
			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.createProxy(RoleType.class, "BILL_FROM_VENDOR"));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.createProxy(RoleType.class, "SHIP_FROM_VENDOR"));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.createProxy(RoleType.class, "SUPPLIER_AGENT"));
			partyRoleWriter.create(partyRole);
			break;
		}

		// Address
		// PostaAddress
		ResourceWriter<PostalAddress> postalAddressWriter = context.getResourceManager().getResourceWriter(PostalAddress.class);
		PostalAddress postalAddress = postalAddressWriter.make();
		postalAddress.setToName("Party " + party.getID());
		// indirizzo_via
		postalAddress.setAddress1("via Party " + party.getID());
		// indirizzo_città
		postalAddress.setCity("Milano");
		// indirizzo_cap
		postalAddress.setPostalCode("20100");
		postalAddress.setContactMechTypeId(context.createProxy(ContactMechType.class, "POSTAL_ADDRESS"));
		postalAddress.setCountryGeoId(commonDefault.getCountryGeo());
		postalAddress.setStateProvinceGeoId(context.createProxy(Geo.class, "IT-MI"));
		postalAddressWriter.create(postalAddress);
		createPartyContactMech(serviceManager, party, postalAddress, Arrays.asList("GENERAL_LOCATION", "SHIPPING_LOCATION"));

		// Email
		// ContactMech
		ResourceWriter<ContactMech> contactMechWriter = context.getResourceManager().getResourceWriter(ContactMech.class);
		ContactMech contactMech = contactMechWriter.make();
		contactMech.setInfoString("info" + party.getID() + "@gmail.com");
		contactMech.setContactMechTypeId(context.createProxy(ContactMechType.class, "EMAIL_ADDRESS"));
		contactMechWriter.create(contactMech);
		createPartyContactMech(serviceManager, party, contactMech, Arrays.asList("PRIMARY_EMAIL"));

		// TelecomNumber
		ResourceWriter<TelecomNumber> telecomNumberWriter = context.getResourceManager().getResourceWriter(TelecomNumber.class);
		TelecomNumber telecomNumber = telecomNumberWriter.make();
		telecomNumber.setContactMechTypeId(context.createProxy(ContactMechType.class, "TELECOM_NUMBER"));
		telecomNumber.setContactNumber(StressTestUtils.generateRandomString(3, true) + " " + StressTestUtils.generateRandomString(7, true));
		telecomNumberWriter.create(telecomNumber);
		createPartyContactMech(serviceManager, party, telecomNumber, Arrays.asList("PRIMARY_PHONE"));

		// PartyTaxAuthInfo
		ResourceWriter<PartyTaxAuthInfo> partyTaxAuthInfoWriter = context.getResourceManager().getResourceWriter(PartyTaxAuthInfo.class);
		PartyTaxAuthInfo partyTaxAuthInfo = partyTaxAuthInfoWriter.make();
		partyTaxAuthInfo.setPartyId(party);
		partyTaxAuthInfo.setFromDate(new Date());
		partyTaxAuthInfo.setTaxAuthGeoId(commonDefault.getCountryGeo().getID());
		partyTaxAuthInfo.setTaxAuthPartyId("ITA_ADE");
		partyTaxAuthInfo.setPartyTaxId("IT-" + StressTestUtils.generateRandomString(11, true));
		partyTaxAuthInfo.setIsExempt(false);
		partyTaxAuthInfo.setIsNexus(false);

		partyTaxAuthInfoWriter.create(partyTaxAuthInfo);

		// PartyIdentification
		ResourceWriter<PartyIdentification> partyIdentificationWriter = context.getResourceManager().getResourceWriter(PartyIdentification.class);
		PartyIdentification partyIdentification = partyIdentificationWriter.make();
		partyIdentification.setPartyId(party);
		partyIdentification.setPartyIdentificationTypeId(context.createProxy(PartyIdentificationType.class, "VCARD_FN_ORIGIN"));
		partyIdentification.setIdValue(StressTestUtils.generateRandomString(16, false));
		partyIdentificationWriter.create(partyIdentification);

		// Credit card payment
		if (role.equals("CUSTOMER")) {
			// PaymentMethod
			// CreditCard
			ResourceWriter<CreditCard> creditCardWriter = context.getResourceManager().getResourceWriter(CreditCard.class);
			CreditCard creditCard = creditCardWriter.make();
			creditCard.setPartyId(party);
			creditCard.setPaymentMethodTypeId(context.createProxy(PaymentMethodType.class, "CREDIT_CARD"));
			// CVC code
			creditCard.setDescription("123");
			creditCard.setFromDate(new Date());
			creditCard.setCardType("CCT_VISA");
			creditCard.setCardNumber("4242424242424242");
			creditCard.setExpireDate("12/2020");
			creditCard.setCompanyNameOnCard("Customer " + party.getID());
			creditCard.setFirstNameOnCard("First name");
			creditCard.setLastNameOnCard("Last name");
			creditCardWriter.create(creditCard);
			// TODO EntityKeyStore
		}
	}

	private void createPartyContactMech(ServiceManager serviceManager, Party party, ContactMech contactMech, List<String> purposeTypes) throws ResourceException, ServiceException {

		// PartyContactMech
		CreatePartyContactMech createPartyContactMech = serviceManager.prepare(CreatePartyContactMech.class);
		if(purposeTypes.size()==1) {
			createPartyContactMech.setPartyId(party.getID());
			createPartyContactMech.setContactMechId(contactMech.getID());
			createPartyContactMech.setContactMechTypeId(contactMech.getContactMechTypeId().getID());
			createPartyContactMech.setContactMechPurposeTypeId(purposeTypes.get(0));
			createPartyContactMech.setFromDate(new Date());
			CreatePartyContactMechResponse response = serviceManager.execute(createPartyContactMech);
			if (response.onError())
				LOGGER.error(response.getErrorMessage());
			return;
		} else {
			createPartyContactMech.setPartyId(party.getID());
			createPartyContactMech.setContactMechId(contactMech.getID());
			createPartyContactMech.setContactMechTypeId(contactMech.getContactMechTypeId().getID());
			createPartyContactMech.setFromDate(new Date());
			CreatePartyContactMechResponse response = serviceManager.execute(createPartyContactMech);
			if (response.onError())
				LOGGER.error(response.getErrorMessage());
		}
			
		// PartyContactMechPurpose
		for (String type : purposeTypes) {
			CreatePartyContactMechPurpose createPartyContactMechPurpose = serviceManager.prepare(CreatePartyContactMechPurpose.class);
			createPartyContactMechPurpose.setContactMechId(contactMech.getID());
			createPartyContactMechPurpose.setContactMechPurposeTypeId(type);
			createPartyContactMechPurpose.setFromDate(new Date());
			createPartyContactMechPurpose.setPartyId(party.getID());

			CreatePartyContactMechPurposeResponse responsePurpose = serviceManager.execute(createPartyContactMechPurpose);
			if (responsePurpose.onError())
				LOGGER.error(responsePurpose.getErrorMessage());
		}
	}
	
	private void createPaymentForCompany() throws ResourceException {
		// PaymentMethod
		// CreditCard
		ResourceWriter<CreditCard> creditCardWriter = context.getResourceManager().getResourceWriter(CreditCard.class);
		
		// Search credit card company 
		String filter = "partyId = \"" + partyDefault.getOrganization().getID() + "\" and paymentMethodTypeId = \"CREDIT_CARD\"" ;
		CreditCard creditCard = null;
				
		try (EntityIterator<CreditCard> cards = creditCardWriter.find(filter, null, null, 1)) {
			for (CreditCard card : cards) {
				creditCard = card;
			}
		}
		
		if(creditCard != null)
			return;

		creditCard = creditCardWriter.make();
		creditCard.setPartyId(partyDefault.getOrganization());
		creditCard.setPaymentMethodTypeId(context.createProxy(PaymentMethodType.class, "CREDIT_CARD"));
		// CVC code
		creditCard.setDescription("123");
		creditCard.setFromDate(new Date());
		creditCard.setCardType("CCT_MASTERCARD");
		creditCard.setCardNumber("5555555555554444");
		creditCard.setExpireDate("12/2030");
		creditCard.setCompanyNameOnCard("Company credit card");
		creditCard.setFirstNameOnCard("First name");
		creditCard.setLastNameOnCard("Last name");
		creditCardWriter.create(creditCard);
	}
}
