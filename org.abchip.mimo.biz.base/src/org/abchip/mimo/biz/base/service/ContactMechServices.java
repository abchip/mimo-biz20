/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.service;

import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.PartyContactMech;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.contact.TelecomNumber;
import org.abchip.mimo.biz.model.product.facility.FacilityContactMech;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class ContactMechServices {

	public static PostalAddress getLatestPostaAddress(Context context, String partyId) throws ResourceException {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getResourceReader(context, PartyContactMech.class);
		ResourceReader<PostalAddress> postalAddressReader = resourceManager.getResourceReader(context, PostalAddress.class);
		PostalAddress postalAddress = null;
		try (EntityIterator<PartyContactMech> partyContactMechs = partyContactMechReader.find(filter, null, order)) {
			for (PartyContactMech partyContactMech : partyContactMechs) {
				ResourceReader<ContactMech> contactMechReader = resourceManager.getResourceReader(context, ContactMech.class);
				ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

				if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("POSTAL_ADDRESS"))
					continue;

				postalAddress = postalAddressReader.lookup(contactMech.getContactMechId());
				break;
			}
		}
		return postalAddress;
	}

	public static PostalAddress getFacilityLatestPostaAddress(Context context, String facilityId) throws ResourceException {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		String filter = "facilityId = \"" + facilityId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		ResourceReader<FacilityContactMech> facilityContactMechReader = resourceManager.getResourceReader(context, FacilityContactMech.class);
		ResourceReader<PostalAddress> postalAddressReader = resourceManager.getResourceReader(context, PostalAddress.class);
		PostalAddress postalAddress = null;
		try (EntityIterator<FacilityContactMech> facilityContactMechs = facilityContactMechReader.find(filter, null, order)) {
			for (FacilityContactMech facilityContactMech : facilityContactMechs) {
				ResourceReader<ContactMech> contactMechReader = resourceManager.getResourceReader(context, ContactMech.class);
				ContactMech contactMech = contactMechReader.lookup(facilityContactMech.getContactMechId().getContactMechId());

				if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("POSTAL_ADDRESS"))
					continue;

				postalAddress = postalAddressReader.lookup(contactMech.getContactMechId());
				break;
			}
		}
		return postalAddress;
	}
	
	public static TelecomNumber getLatestTelecomNumber(Context context, String partyId) throws ResourceException {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getResourceReader(context, PartyContactMech.class);
		ResourceReader<TelecomNumber> telecomNumberReader = resourceManager.getResourceReader(context, TelecomNumber.class);
		TelecomNumber telecomNumber = null;
		try (EntityIterator<PartyContactMech> partyContactMechs = partyContactMechReader.find(filter, null, order)) {
			for (PartyContactMech partyContactMech : partyContactMechs) {
				ResourceReader<ContactMech> contactMechReader = resourceManager.getResourceReader(context, ContactMech.class);
				ContactMech contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

				if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("TELECOM_NUMBER"))
					continue;

				telecomNumber = telecomNumberReader.lookup(contactMech.getContactMechId());
				break;
			}
		}
		return telecomNumber;
	}

	public static ContactMech getLatestEmail(Context context, String partyId) throws ResourceException {

		ResourceManager resourceManager = context.get(ResourceManager.class);

		String filter = "partyId = \"" + partyId + "\"  AND thruDate IS NULL";
		String order = "-fromDate";
		
		ResourceReader<PartyContactMech> partyContactMechReader = resourceManager.getResourceReader(context, PartyContactMech.class);
		ResourceReader<ContactMech> contactMechReader = resourceManager.getResourceReader(context, ContactMech.class);
		
		ContactMech contactMech = null;

		try (EntityIterator<PartyContactMech> partyContactMechs = partyContactMechReader.find(filter, null, order)) {
			for (PartyContactMech partyContactMech : partyContactMechs) {
				
				contactMech = contactMechReader.lookup(partyContactMech.getContactMechId().getContactMechId());

				if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("EMAIL_ADDRESS"))
					continue;

				if (contactMech.getInfoString() != null && !contactMech.getInfoString().isEmpty()) {
					break;
				}
			}
		}
		return contactMech;
	}
}
