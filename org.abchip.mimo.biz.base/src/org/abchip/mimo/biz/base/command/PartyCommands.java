/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.command;

import javax.inject.Inject;

import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyFactory;
import org.abchip.mimo.biz.model.party.party.PartyGroup;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.resource.ResourceWriter;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class PartyCommands extends BaseCommands {

	@Inject
	private ResourceManager resourceManager;

	public <E extends EntityIdentifiable> void _testParty(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		ResourceReader<Party> partyReader = resourceManager.getResourceReader(context, Party.class);
		Party party = partyReader.lookup("10000", true);
		interpreter.println(party.getID());
		interpreter.println(party.getURI());
		interpreter.println(party.getPartyId());

		// for (PartyRole partyRole : party.getPartyRoles()) {
		// interpreter.println(partyRole.getID());
		// }

		interpreter.println(party.getCreatedByUserLogin().getPartyId().getID());
		interpreter.println(party.getPartyTypeId().getID());
	}

	public <E extends EntityIdentifiable> void _hackerParty(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String id = nextArgument(interpreter);

		// Write Person
		ResourceWriter<Person> personWriter = resourceManager.getResourceWriter(context, Person.class);

		Person person = PartyFactory.eINSTANCE.createPerson();
		person.setPreferredCurrencyUomId(resourceManager.getFrame(context, Uom.class).createProxy("EUR"));
		person.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
		person.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PERSON"));
		person.setPartyId(id);
		person.setFirstName("Test hacker party person");
		personWriter.create(person);

		// Write PartyGroup
		ResourceWriter<PartyGroup> groupWriter = resourceManager.getResourceWriter(context, PartyGroup.class);

		PartyGroup partyGroup = PartyFactory.eINSTANCE.createPartyGroup();
		partyGroup.setPreferredCurrencyUomId(resourceManager.getFrame(context, Uom.class).createProxy("EUR"));
		partyGroup.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
		partyGroup.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PARTY_GROUP"));
		partyGroup.setPartyId(id);
		partyGroup.setGroupName("Test hacker party group");
		groupWriter.create(partyGroup);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
