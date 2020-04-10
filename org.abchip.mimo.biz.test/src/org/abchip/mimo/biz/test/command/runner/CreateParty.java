package org.abchip.mimo.biz.test.command.runner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo;
import org.abchip.mimo.biz.base.service.SystemDefault;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechPurposeType;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.contact.PartyContactMech;
import org.abchip.mimo.biz.party.contact.PartyContactMechPurpose;
import org.abchip.mimo.biz.party.contact.PostalAddress;
import org.abchip.mimo.biz.party.contact.TelecomNumber;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyGroup;
import org.abchip.mimo.biz.party.party.PartyIdentification;
import org.abchip.mimo.biz.party.party.PartyIdentificationType;
import org.abchip.mimo.biz.party.party.PartyRole;
import org.abchip.mimo.biz.party.party.PartyType;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.test.command.StressTestUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;

public class CreateParty implements Callable<Long> {

	Context context;

	public CreateParty(Context context) {
		this.context = context;
	}

	@Override
	public Long call() throws Exception {
		long time1 = System.currentTimeMillis();

		createPartyGroup(context, "CUSTOMER");
		createPerson(context, "CUSTOMER");
		createPartyGroup(context, "SUPPLIER");
		createPerson(context, "SUPPLIER");

		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	public void createPartyGroup(Context context, String role) {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Create PartyGroup
		ResourceWriter<PartyGroup> partyGroupWriter = resourceManager.getResourceWriter(context, PartyGroup.class);
		PartyGroup partyGroup = partyGroupWriter.make(true);
		partyGroup.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
		partyGroup.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PARTY_GROUP"));
		partyGroup.setPreferredCurrencyUomId(SystemDefault.getUom(context));
		// nome
		partyGroup.setGroupName("Description Party " + role.toLowerCase() + " " + partyGroup.getID());
		partyGroupWriter.create(partyGroup);

		createRelated(resourceManager, partyGroup, role);
	}

	public void createPerson(Context context, String role) {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Create PartyGroup
		ResourceWriter<Person> personWriter = resourceManager.getResourceWriter(context, Person.class);
		Person person = personWriter.make(true);
		person.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
		person.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PERSON"));
		person.setPreferredCurrencyUomId(SystemDefault.getUom(context));
		person.setFirstName("First name " + role.toLowerCase() + " " + person.getID());
		person.setLastName("Last name " + role.toLowerCase() + " " + person.getID());
		personWriter.create(person);

		createRelated(resourceManager, person, role);
	}
	
	private void createRelated(ResourceManager resourceManager, Party party, String role) {
		// PartyRole
		ResourceWriter<PartyRole> partyRoleWriter = resourceManager.getResourceWriter(context, PartyRole.class);
		PartyRole partyRole = partyRoleWriter.make();
		partyRole.setPartyId(party);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy(role));
		partyRoleWriter.create(partyRole);

		switch (role) {
		case "CUSTOMER":
			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("BILL_TO_CUSTOMER"));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("SHIP_TO_CUSTOMER"));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("END_USER_CUSTOMER"));
			partyRoleWriter.create(partyRole);

			partyRole = partyRoleWriter.make();
			partyRole.setPartyId(party);
			partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("PLACING_CUSTOMER"));
			partyRoleWriter.create(partyRole);
			break;
		case "SUPPLIER":

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
		postalAddress.setContactMechTypeId(resourceManager.getFrame(context, ContactMechType.class).createProxy("POSTAL_ADDRESS"));
		postalAddress.setCountryGeoId(SystemDefault.getGeo(context));
		postalAddress.setStateProvinceGeoId(resourceManager.getFrame(context, Geo.class).createProxy("IT-RM"));
		postalAddressWriter.create(postalAddress);
		createPartyContactMech(context, resourceManager, party, postalAddress, Arrays.asList("GENERAL_LOCATION", "SHIPPING_LOCATION"));

		// Email
		// ContactMech
		ResourceWriter<ContactMech> contactMechWriter = resourceManager.getResourceWriter(context, ContactMech.class);
		ContactMech contactMech = contactMechWriter.make(true);
		contactMech.setInfoString("info" + party.getID() + "@gmail.com");
		contactMech.setContactMechTypeId(resourceManager.getFrame(context, ContactMechType.class).createProxy("EMAIL_ADDRESS"));
		contactMechWriter.create(contactMech);
		createPartyContactMech(context, resourceManager, party, contactMech, Arrays.asList("PRIMARY_EMAIL"));

		// TelecomNumber
		ResourceWriter<TelecomNumber> telecomNumberWriter = resourceManager.getResourceWriter(context, TelecomNumber.class);
		TelecomNumber telecomNumber = telecomNumberWriter.make(true);
		telecomNumber.setContactMechTypeId(resourceManager.getFrame(context, ContactMechType.class).createProxy("TELECOM_NUMBER"));
		telecomNumber.setContactNumber(StressTestUtils.generateRandomString(3, true) + " " + StressTestUtils.generateRandomString(7, true));
		telecomNumberWriter.create(telecomNumber);
		createPartyContactMech(context, resourceManager, party, telecomNumber, Arrays.asList("PRIMARY_PHONE"));

		// PartyTaxAuthInfo
		ResourceWriter<PartyTaxAuthInfo> partyTaxAuthInfoWriter = resourceManager.getResourceWriter(context, PartyTaxAuthInfo.class);
		PartyTaxAuthInfo partyTaxAuthInfo = partyTaxAuthInfoWriter.make();
		partyTaxAuthInfo.setPartyId(party);
		partyTaxAuthInfo.setFromDate(new Date());
		partyTaxAuthInfo.setTaxAuthGeoId(SystemDefault.getGeo(context).getID());
		partyTaxAuthInfo.setTaxAuthPartyId("ITA_ADE");
		partyTaxAuthInfo.setPartyTaxId("IT-" + StressTestUtils.generateRandomString(7, true));
		partyTaxAuthInfoWriter.create(partyTaxAuthInfo);

		// PartyIdentification
		ResourceWriter<PartyIdentification> partyIdentificationWriter = resourceManager.getResourceWriter(context, PartyIdentification.class);
		PartyIdentification partyIdentification = partyIdentificationWriter.make();
		partyIdentification.setPartyId(party);
		partyIdentification.setPartyIdentificationTypeId(resourceManager.getFrame(context, PartyIdentificationType.class).createProxy("VCARD_FN_ORIGIN"));
		partyIdentification.setIdValue(StressTestUtils.generateRandomString(16, false));
		partyIdentificationWriter.create(partyIdentification);
	}

	private void createPartyContactMech(Context context, ResourceManager resourceManager, Party party, ContactMech contactMech, List<String> purposeTypes) {
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
			partyContactMechPurpose.setContactMechPurposeTypeId(resourceManager.getFrame(context, ContactMechPurposeType.class).createProxy(type));
			partyContactMechPurpose.setFromDate(new Date());
			partyContactMechPurposeWriter.create(partyContactMechPurpose);
		}
	}
}
