package org.abchip.mimo.biz.test.command.runner;

import java.util.Date;
import java.util.concurrent.Callable;

import org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo;
import org.abchip.mimo.biz.base.service.SystemDefault;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
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
import org.abchip.mimo.biz.party.party.RoleType;
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
		createParty(context);
		long time2 = System.currentTimeMillis();
		return time2 - time1;
	}

	public void createParty(Context context) {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		// Create PartyGroup
		ResourceWriter<PartyGroup> partyGroupWriter = resourceManager.getResourceWriter(context, PartyGroup.class);
		PartyGroup partyGroup = partyGroupWriter.make(true);
		partyGroup.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
		partyGroup.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PARTY_GROUP"));
		partyGroup.setPreferredCurrencyUomId(SystemDefault.getUom(context));
		// nome
		partyGroup.setGroupName("Description Party " + partyGroup.getID());
		partyGroupWriter.create(partyGroup, true);

		// PartyRole
		ResourceWriter<PartyRole> partyRoleWriter = resourceManager.getResourceWriter(context, PartyRole.class);
		PartyRole partyRole = partyRoleWriter.make();
		partyRole.setPartyId(partyGroup);
		partyRole.setRoleTypeId(resourceManager.getFrame(context, RoleType.class).createProxy("CUSTOMER"));
		partyRoleWriter.create(partyRole, true);

		// Address
		// PostaAddress
		ResourceWriter<PostalAddress> postalAddressWriter = resourceManager.getResourceWriter(context, PostalAddress.class);
		PostalAddress postalAddress = postalAddressWriter.make(true);
		postalAddress.setToName("Party " + partyGroup.getID());
		// indirizzo_via
		postalAddress.setAddress1("via Party " + partyGroup.getID());
		// indirizzo_città
		postalAddress.setCity("indirizzo Party " + partyGroup.getID());
		// indirizzo_cap
		postalAddress.setPostalCode("00000");
		postalAddress.setContactMechTypeId(resourceManager.getFrame(context, ContactMechType.class).createProxy("POSTAL_ADDRESS"));
		postalAddress.setCountryGeoId(resourceManager.getFrame(context, Geo.class).createProxy("ITA"));
		postalAddress.setStateProvinceGeoId(resourceManager.getFrame(context, Geo.class).createProxy("IT-RM"));
		postalAddressWriter.create(postalAddress, true);
		createPartyContactMech(context, resourceManager, partyGroup, postalAddress, "GENERAL_LOCATION");

		// Email
		// ContactMech
		ResourceWriter<ContactMech> contactMechWriter = resourceManager.getResourceWriter(context, ContactMech.class);
		ContactMech contactMech = contactMechWriter.make(true);
		contactMech.setInfoString("info" + partyGroup.getID() + "@gmail.com");
		contactMech.setContactMechTypeId(resourceManager.getFrame(context, ContactMechType.class).createProxy("EMAIL_ADDRESS"));
		contactMechWriter.create(contactMech, true);
		createPartyContactMech(context, resourceManager, partyGroup, contactMech, "PRIMARY_EMAIL");

		// TelecomNumber
		ResourceWriter<TelecomNumber> telecomNumberWriter = resourceManager.getResourceWriter(context, TelecomNumber.class);
		TelecomNumber telecomNumber = telecomNumberWriter.make(true);
		telecomNumber.setContactMechTypeId(resourceManager.getFrame(context, ContactMechType.class).createProxy("TELECOM_NUMBER"));
		telecomNumber.setContactNumber("001 002 003");
		telecomNumberWriter.create(telecomNumber, true);
		createPartyContactMech(context, resourceManager, partyGroup, telecomNumber, "PRIMARY_PHONE");

		// PartyTaxAuthInfo
		ResourceWriter<PartyTaxAuthInfo> partyTaxAuthInfoWriter = resourceManager.getResourceWriter(context, PartyTaxAuthInfo.class);
		PartyTaxAuthInfo partyTaxAuthInfo = partyTaxAuthInfoWriter.make();
		partyTaxAuthInfo.setPartyId(partyGroup);
		partyTaxAuthInfo.setFromDate(new Date());
		partyTaxAuthInfo.setTaxAuthGeoId("ITA");
		partyTaxAuthInfo.setTaxAuthPartyId("ITA_ADE");
		partyTaxAuthInfo.setPartyTaxId("IT-" + "13128080150");
		partyTaxAuthInfoWriter.create(partyTaxAuthInfo, true);

		// PartyIdentification
		ResourceWriter<PartyIdentification> partyIdentificationWriter = resourceManager.getResourceWriter(context, PartyIdentification.class);
		PartyIdentification partyIdentification = partyIdentificationWriter.make();
		partyIdentification.setPartyId(partyGroup);
		partyIdentification.setPartyIdentificationTypeId(resourceManager.getFrame(context, PartyIdentificationType.class).createProxy("VCARD_FN_ORIGIN"));
		partyIdentification.setIdValue("PPRPLN20C01H501K");
		partyIdentificationWriter.create(partyIdentification, true);
	}

	private void createPartyContactMech(Context context, ResourceManager resourceManager, Party party, ContactMech contactMech, String purposeType) {
		// PartyContactMech
		ResourceWriter<PartyContactMech> partyContactMechWriter = resourceManager.getResourceWriter(context, PartyContactMech.class);
		PartyContactMech partyContactMech = partyContactMechWriter.make();
		partyContactMech.setPartyId(party);
		partyContactMech.setContactMechId(contactMech);
		partyContactMech.setFromDate(new Date());
		partyContactMechWriter.create(partyContactMech, true);

		if (!purposeType.isEmpty()) {
			// PartyContactMechPurpose
			ResourceWriter<PartyContactMechPurpose> partyContactMechPurposeWriter = resourceManager.getResourceWriter(context, PartyContactMechPurpose.class);
			PartyContactMechPurpose partyContactMechPurpose = partyContactMechPurposeWriter.make();
			partyContactMechPurpose.setPartyId(party);
			partyContactMechPurpose.setContactMechId(contactMech);
			partyContactMechPurpose.setContactMechPurposeTypeId(resourceManager.getFrame(context, ContactMechPurposeType.class).createProxy(purposeType));
			partyContactMechPurpose.setFromDate(new Date());
			partyContactMechPurposeWriter.create(partyContactMechPurpose, true);
		}
	}
}
