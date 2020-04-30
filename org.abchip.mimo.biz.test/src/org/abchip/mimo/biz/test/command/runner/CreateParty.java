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

import org.abchip.mimo.biz.model.accounting.tax.PartyTaxAuthInfo;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.model.party.contact.ContactMechType;
import org.abchip.mimo.biz.model.party.contact.PartyContactMech;
import org.abchip.mimo.biz.model.party.contact.PartyContactMechPurpose;
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
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceManager;

public class CreateParty implements Callable<Long> {

	Context context;
	GetCommonDefaultResponse commonDefault;

	public CreateParty(Context context) {
		this.context = context;
	}

	@Override
	public Long call() throws Exception {

		ServiceManager serviceManager = context.getServiceManager();
		GetCommonDefault getCommonDefault = serviceManager.prepare(context, GetCommonDefault.class);
		commonDefault = serviceManager.execute(getCommonDefault);

		long time1 = System.currentTimeMillis();

		createPartyGroup("CUSTOMER");
		createPerson("CUSTOMER");
		createPartyGroup("SUPPLIER");
		createPerson("SUPPLIER");

		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	public void createPartyGroup(String role) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Create PartyGroup
		ResourceWriter<PartyGroup> partyGroupWriter = resourceManager.getResourceWriter(context, PartyGroup.class);
		PartyGroup partyGroup = partyGroupWriter.make(true);
		partyGroup.setStatusId(context.getFrame(StatusItem.class).createProxy("PARTY_ENABLED", context.getTenant()));
		partyGroup.setPartyTypeId(context.getFrame(PartyType.class).createProxy("PARTY_GROUP", context.getTenant()));
		partyGroup.setPreferredCurrencyUomId(commonDefault.getCurrencyUom());
		// nome
		partyGroup.setGroupName("Description Party " + role.toLowerCase() + " " + partyGroup.getID());
		partyGroupWriter.create(partyGroup);

		createRelated(resourceManager, partyGroup, role);
	}

	public void createPerson(String role) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Create PartyGroup
		ResourceWriter<Person> personWriter = resourceManager.getResourceWriter(context, Person.class);
		Person person = personWriter.make(true);
		person.setStatusId(context.getFrame(StatusItem.class).createProxy("PARTY_ENABLED", context.getTenant()));
		person.setPartyTypeId(context.getFrame(PartyType.class).createProxy("PERSON", context.getTenant()));
		person.setPreferredCurrencyUomId(commonDefault.getCurrencyUom());
		person.setFirstName("First name " + role.toLowerCase() + " " + person.getID());
		person.setLastName("Last name " + role.toLowerCase() + " " + person.getID());
		personWriter.create(person);

		createRelated(resourceManager, person, role);
	}

	private void createRelated(ResourceManager resourceManager, Party party, String role) throws ResourceException {

		// Base role
		ResourceWriter<PartyRole> partyRoleWriter = resourceManager.getResourceWriter(context, PartyRole.class);
		PartyRole partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy(role, context.getTenant()));
		partyRoleWriter.create(partyRole);

		switch (role) {
		case "CUSTOMER":
			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("BILL_TO_CUSTOMER", context.getTenant()));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("SHIP_TO_CUSTOMER", context.getTenant()));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("END_USER_CUSTOMER", context.getTenant()));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("PLACING_CUSTOMER", context.getTenant()));
			partyRoleWriter.create(partyRole);
			break;
		case "SUPPLIER":
			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("BILL_FROM_VENDOR", context.getTenant()));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("SHIP_FROM_VENDOR", context.getTenant()));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(context.getFrame(RoleType.class).createProxy("SUPPLIER_AGENT", context.getTenant()));
			partyRoleWriter.create(partyRole);
			break;
		}

		// Address
		// PostaAddress
		ResourceWriter<PostalAddress> postalAddressWriter = resourceManager.getResourceWriter(context, PostalAddress.class);
		PostalAddress postalAddress = postalAddressWriter.make(true);
		postalAddress.setToName("Party " + party.getID());
		// indirizzo_via
		postalAddress.setAddress1("via Party " + party.getID());
		// indirizzo_città
		postalAddress.setCity("indirizzo Party " + party.getID());
		// indirizzo_cap
		postalAddress.setPostalCode(StressTestUtils.generateRandomString(5, true));
		postalAddress.setContactMechTypeId(context.getFrame(ContactMechType.class).createProxy("POSTAL_ADDRESS", context.getTenant()));
		postalAddress.setCountryGeoId(commonDefault.getCountryGeo());
		postalAddress.setStateProvinceGeoId(context.getFrame(Geo.class).createProxy("IT-RM", context.getTenant()));
		postalAddressWriter.create(postalAddress);
		createPartyContactMech(context, resourceManager, party, postalAddress, Arrays.asList("GENERAL_LOCATION", "SHIPPING_LOCATION"));

		// Email
		// ContactMech
		ResourceWriter<ContactMech> contactMechWriter = resourceManager.getResourceWriter(context, ContactMech.class);
		ContactMech contactMech = contactMechWriter.make(true);
		contactMech.setInfoString("info" + party.getID() + "@gmail.com");
		contactMech.setContactMechTypeId(context.getFrame(ContactMechType.class).createProxy("EMAIL_ADDRESS", context.getTenant()));
		contactMechWriter.create(contactMech);
		createPartyContactMech(context, resourceManager, party, contactMech, Arrays.asList("PRIMARY_EMAIL"));

		// TelecomNumber
		ResourceWriter<TelecomNumber> telecomNumberWriter = resourceManager.getResourceWriter(context, TelecomNumber.class);
		TelecomNumber telecomNumber = telecomNumberWriter.make(true);
		telecomNumber.setContactMechTypeId(context.getFrame(ContactMechType.class).createProxy("TELECOM_NUMBER", context.getTenant()));
		telecomNumber.setContactNumber(StressTestUtils.generateRandomString(3, true) + " " + StressTestUtils.generateRandomString(7, true));
		telecomNumberWriter.create(telecomNumber);
		createPartyContactMech(context, resourceManager, party, telecomNumber, Arrays.asList("PRIMARY_PHONE"));

		// PartyTaxAuthInfo
		ResourceWriter<PartyTaxAuthInfo> partyTaxAuthInfoWriter = resourceManager.getResourceWriter(context, PartyTaxAuthInfo.class);
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
		ResourceWriter<PartyIdentification> partyIdentificationWriter = resourceManager.getResourceWriter(context, PartyIdentification.class);
		PartyIdentification partyIdentification = partyIdentificationWriter.make();
		partyIdentification.setPartyId(party);
		partyIdentification.setPartyIdentificationTypeId(context.getFrame(PartyIdentificationType.class).createProxy("VCARD_FN_ORIGIN", context.getTenant()));
		partyIdentification.setIdValue(StressTestUtils.generateRandomString(16, false));
		partyIdentificationWriter.create(partyIdentification);
	}

	private void createPartyContactMech(Context context, ResourceManager resourceManager, Party party, ContactMech contactMech, List<String> purposeTypes) throws ResourceException {

		// PartyContactMech
		ResourceWriter<PartyContactMech> partyContactMechWriter = resourceManager.getResourceWriter(context, PartyContactMech.class);
		PartyContactMech partyContactMech = partyContactMechWriter.make();
		partyContactMech.setPartyId(party);
		partyContactMech.setContactMechId(contactMech);
		partyContactMech.setFromDate(new Date());
		partyContactMechWriter.create(partyContactMech);

		for (String type : purposeTypes) {
			ResourceWriter<PartyContactMechPurpose> partyContactMechPurposeWriter = resourceManager.getResourceWriter(context, PartyContactMechPurpose.class);
			PartyContactMechPurpose partyContactMechPurpose = partyContactMechPurposeWriter.make();
			partyContactMechPurpose.setPartyId(party);
			partyContactMechPurpose.setContactMechId(contactMech);
			partyContactMechPurpose.setContactMechPurposeTypeId(context.getFrame(ContactMechPurposeType.class).createProxy(type, context.getTenant()));
			partyContactMechPurpose.setFromDate(new Date());
			partyContactMechPurposeWriter.create(partyContactMechPurpose);
		}
	}
}
