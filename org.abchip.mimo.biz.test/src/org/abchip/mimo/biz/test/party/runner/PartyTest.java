/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.party.runner;

import javax.inject.Inject;

import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.party.party.PartyFactory;
import org.abchip.mimo.biz.model.party.party.PartyGroup;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceReader;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "Party")
public class PartyTest {

	@Inject
	public transient TestAsserter testAsserter;
	@Inject
	private TestRunner testRunner;

	@TestStarted
	public void doTest() throws ResourceException {

		// Party
		Party party = PartyFactory.eINSTANCE.createParty();
		testAsserter.assertNotNull("Frame Party creation", party);

		// Person
		String personId = "PersonCanary";

		ResourceReader<Party> partyReader = testRunner.getContext().getResourceManager().getResourceReader(Party.class);
		testAsserter.assertNotNull("Party Reader", partyReader);
		if (partyReader != null) {
			Party partyTest = partyReader.lookup(personId);
			testAsserter.assertNotNull("Party '" + personId + "' exist", partyTest);
			if (partyTest != null) {
				testAsserter.assertEquals("Party type", "PERSON", partyTest.getPartyType().getPartyTypeId());
			} else {
				testAsserter.assertEquals("Party type", "PERSON", "");
			}
		}

		ResourceReader<Person> personReader = testRunner.getContext().getResourceManager().getResourceReader(Person.class);
		testAsserter.assertNotNull("Person Reader", personReader);
		if (personReader != null) {
			Person personTest = personReader.lookup(personId);
			testAsserter.assertNotNull("Person '" + personId + "' exist", personTest);
			if (personTest != null) {
				testAsserter.assertEquals("Group name", "First name", personTest.getFirstName());
				testAsserter.assertEquals("Group name", "Last name", personTest.getLastName());
			} else {
				testAsserter.assertEquals("Group name", "First name", "");
				testAsserter.assertEquals("Group name", "Last name", "");
			}
		}

		// PartyGroup
		String partyGroupId = "Company";

		if (partyReader != null) {
			Party partyTest = partyReader.lookup(partyGroupId);
			testAsserter.assertNotNull("Party '" + partyGroupId + "' exist", partyTest);
			if (partyTest != null) {
				testAsserter.assertEquals("Party type", "PARTY_GROUP", partyTest.getPartyType().getPartyTypeId());
			} else {
				testAsserter.assertEquals("Party type", "PARTY_GROUP", "");
			}
		}

		ResourceReader<PartyGroup> partyGroupReader = testRunner.getContext().getResourceManager().getResourceReader(PartyGroup.class);
		testAsserter.assertNotNull("PartyGroup Reader", partyGroupReader);
		if (partyGroupReader != null) {
			PartyGroup partyGroupTest = partyGroupReader.lookup(partyGroupId);
			testAsserter.assertNotNull("PartyGroup '" + partyGroupId + "' exist", partyGroupTest);
			if (partyGroupTest != null) {
				testAsserter.assertEquals("Group name", "ABChip Test", partyGroupTest.getGroupName());
			} else {
				testAsserter.assertEquals("Group name", "ABChip Test", "");
			}
		}

		// Select first party
		if (partyReader != null) {
			Party partyTest = partyReader.first();
			testAsserter.assertNotNull("Select first party", partyTest);
		} else {
			testAsserter.assertNotNull("Select first party", null);
		}

		// Select first party with find
		if (partyReader != null) {
			try (EntityIterator<Party> partyIteratorTest = partyReader.find(null, null, "partyId", 1)) {
				if (partyIteratorTest.hasNext()) {
					Party partyTest = partyIteratorTest.next();
					testAsserter.assertNotNull("Select first party with find", partyTest);
				} else {
					testAsserter.assertNotNull("Select first party with find", null);
				}
			}
		}
	}
}