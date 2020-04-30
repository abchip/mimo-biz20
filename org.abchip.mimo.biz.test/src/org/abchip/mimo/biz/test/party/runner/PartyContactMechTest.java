/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.party.runner;

import javax.inject.Inject;

import org.abchip.mimo.biz.model.party.contact.ContactFactory;
import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.PartyContactMech;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestAsserter;
import org.abchip.mimo.tester.TestRunner;
import org.abchip.mimo.tester.TestStarted;

@Test(entity = "PartyContactMech")
public class PartyContactMechTest {

	@Inject
	public transient TestAsserter testAsserter;
	@Inject
	private TestRunner testRunner;

	@TestStarted
	public void doTest() throws ResourceException {
		String partyId = "Company";

		PartyContactMech partyContactMech = ContactFactory.eINSTANCE.createPartyContactMech();
		testAsserter.assertNotNull("Frame PartyContactMech creation", partyContactMech);

		PostalAddress postalAddress = testRunner.getContext().getFrame(Party.class).createProxy(partyId, testRunner.getContext().getTenant()).getPostalAddress();
		testAsserter.assertNotNull("PostalAddress '" + partyId + "' exist", postalAddress);

		ContactMech eMail = testRunner.getContext().getFrame(Party.class).createProxy(partyId, testRunner.getContext().getTenant()).getEmail();
		testAsserter.assertNotNull("Email '" + partyId + "' exist", eMail);
	}
}
