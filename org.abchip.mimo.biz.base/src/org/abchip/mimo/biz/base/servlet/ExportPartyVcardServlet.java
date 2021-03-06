/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyGroup;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.http.servlet.BaseServlet;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.TelephoneType;
import ezvcard.property.Address;
import ezvcard.property.Email;
import ezvcard.property.StructuredName;
import ezvcard.property.Telephone;

public class ExportPartyVcardServlet extends BaseServlet {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("resource")
	protected void execute(Context context, HttpServletRequest request, HttpServletResponse response) throws IOException {

		String partyId = request.getParameter("partyId");

		try {
			VCard vcard = createVcardFromParty(context, partyId);

			response.setStatus(HttpServletResponse.SC_OK);
			response.addHeader("Content-disposition", "attachment; filename=" + partyId + ".vcf");
			response.setContentType("text/vcard");

			Ezvcard.write(vcard).go(response.getOutputStream());
		} catch (ResourceException e) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
			return;
		}
	}

	public VCard createVcardFromParty(Context context, String partyId) throws ResourceException {

		ResourceReader<Party> partyReader = context.getResourceManager().getResourceReader(Party.class);
		ResourceReader<Person> personReader = context.getResourceManager().getResourceReader(Person.class);
		ResourceReader<PartyGroup> partyGroupReader = context.getResourceManager().getResourceReader(PartyGroup.class);
		Party partyEntity = partyReader.lookup(partyId);

		VCard vcard = new VCard();
		StructuredName structuredName = new StructuredName();
		if (partyEntity == null) {
			// response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			// return;

			// mock
			structuredName.setGiven("Nome");
			structuredName.setFamily("Cognome");
			// fullName = "MockVcard";
			vcard.setStructuredName(structuredName);
			Address address = new Address();
			address.setStreetAddress("via Manzoni n.1");
			address.setLocality("Milano");
			address.setPostalCode("20100");
			// StateProvinceGeo per decodifica
			address.setRegion("Milano");
			// CountryGeo per decodifica
			address.setCountry("Italia");
			address.getTypes().add(AddressType.WORK);
			vcard.addAddress(address);
			Telephone tel = new Telephone("0393381234567");
			tel.getTypes().add(TelephoneType.WORK);
			vcard.addTelephoneNumber(tel);
			vcard.addEmail(new Email("nome.cognome@gmail.com"));
		} else {
			// Party or PartyGroup String fullName = "";
			switch (partyEntity.getPartyType().getPartyTypeId()) {
			case "PERSON":
				Person personEntity = personReader.lookup(partyId);
				if (personEntity.getFirstName() != null && !personEntity.getFirstName().isEmpty()) {
					structuredName.setGiven(personEntity.getFirstName());
					// fullName = personEntity.getFirstName();
				}
				if (personEntity.getMiddleName() != null && !personEntity.getMiddleName().isEmpty()) {
					structuredName.setGiven(personEntity.getMiddleName());
					// fullName += personEntity.getMiddleName();
				}
				if (personEntity.getLastName() != null && !personEntity.getLastName().isEmpty()) {
					structuredName.setFamily(personEntity.getLastName());
					// fullName += personEntity.getLastName();
				}
				break;
			case "PARTY_GROUP":
				PartyGroup partyGroupEntity = partyGroupReader.lookup(partyId);
				if (partyGroupEntity.getGroupName() != null && !partyGroupEntity.getGroupName().isEmpty()) {
					structuredName.setGiven(partyGroupEntity.getGroupName());
					// fullName = partyGroupEntity.getGroupName();
				}
				break;
			}

			vcard.setStructuredName(structuredName);

			// PostalAddress
			writeLatestPostalAddress(context, vcard, partyId);

			// TelecomNumber
			writeLatestTelecomNumber(context, vcard, partyId);

			// E-mail
			writeLatestEmail(context, vcard, partyId);
		}

		return vcard;
	}

	private void writeLatestPostalAddress(Context context, VCard vcard, String partyId) throws ResourceException {
		PostalAddress postalAddress = context.createProxy(Party.class, partyId).getPostalAddress();
		if (postalAddress == null)
			return;

		Address address = new Address();
		if (postalAddress.getAddress1() != null && !postalAddress.getAddress1().isEmpty())
			address.setStreetAddress(postalAddress.getAddress1());
		if (postalAddress.getCity() != null && !postalAddress.getCity().isEmpty())
			address.setLocality(postalAddress.getCity());
		if (postalAddress.getPostalCode() != null && !postalAddress.getPostalCode().isEmpty())
			address.setPostalCode(postalAddress.getPostalCode());
		// StateProvinceGeo per decodifica
		if (postalAddress.getStateProvinceGeo() != null)
			address.setRegion(postalAddress.getStateProvinceGeo().getGeoId());
		// CountryGeo per decodifica
		if (postalAddress.getCountryGeo() != null)
			address.setCountry(postalAddress.getCountryGeo().getGeoId());

		address.getTypes().add(AddressType.WORK);
		vcard.addAddress(address);
	}

	private void writeLatestTelecomNumber(Context context, VCard vcard, String partyId) throws ResourceException {
		TelecomNumber telecomNumber = context.createProxy(Party.class, partyId).getTelecomNumber();
		if (telecomNumber == null)
			return;

		String areaCode = "";
		String number = "";
		if (telecomNumber.getAreaCode() != null && !telecomNumber.getAreaCode().isEmpty())
			areaCode = telecomNumber.getAreaCode();
		if (telecomNumber.getContactNumber() != null && !telecomNumber.getContactNumber().isEmpty())
			number = telecomNumber.getContactNumber();
		Telephone tel = new Telephone(areaCode + number);
		tel.getTypes().add(TelephoneType.WORK);
		vcard.addTelephoneNumber(tel);
	}

	private void writeLatestEmail(Context context, VCard vcard, String partyId) throws ResourceException {
		ContactMech contactMech = context.createProxy(Party.class, partyId).getEmail();
		if (contactMech == null)
			return;

		if (contactMech.getInfoString() != null && !contactMech.getInfoString().isEmpty()) {
			vcard.addEmail(new Email(contactMech.getInfoString()));
		}
	}
}