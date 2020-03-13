/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.command;

import javax.inject.Inject;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.party.party.PartyFactory;
import org.abchip.mimo.biz.party.party.PartyType;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.BaseCommandProviderImpl;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class BizTenantCommands extends BaseCommandProviderImpl {

	@Inject
	private ResourceManager resourceManager;

	public <E extends EntityIdentifiable> void _loginBizTenant(CommandInterpreter interpreter) throws Exception {
		this.login(interpreter.nextArgument());
	}

	@SuppressWarnings("resource")
	public void _createMaster(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		BizCommandUtils.loadSeed(context, "mimo", null, true);
		BizCommandUtils.loadSeed(context, "party", null, true);
		BizCommandUtils.loadSeed(context, "abchip-net", null, true);
		BizCommandUtils.loadSeed(context, "abchip-net-accounting", null, true);
		BizCommandUtils.loadSeed(context, "passport", null, true);
		BizCommandUtils.loadSeed(context, "edi", null, true);
	}

	@SuppressWarnings("resource")
	public void _createTenant(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		// create db structure
		// tenant seeds, depending on db type (AdminNewTenantData-Derby.xml,
		// AdminUserLoginData.xml)

		String tenantId = interpreter.nextArgument();
		String tenantName = interpreter.nextArgument();
		String partyId = interpreter.nextArgument();

		BizCommandUtils.createTenant(context, tenantId, tenantName, false);
		BizCommandUtils.loadSeed(context, "mimo", tenantId, true);
		BizCommandUtils.loadSeed(context, "party", tenantId, true);
		BizCommandUtils.loadSeed(context, "abchip-biz", tenantId, true);
		// Mail

		// Party
		if (partyId == null) {
			ResourceWriter<Person> tenantPersonWriter = resourceManager.getResourceWriter(context, Person.class);
			Person tenantPerson = PartyFactory.eINSTANCE.createPerson();
			tenantPerson.setPartyId(tenantId);
			tenantPerson.setStatusId(resourceManager.getFrame(context, StatusItem.class).createProxy("PARTY_ENABLED"));
			tenantPerson.setPartyTypeId(resourceManager.getFrame(context, PartyType.class).createProxy("PERSON"));
			tenantPerson.setFirstName("Tenant " + tenantId);
			tenantPersonWriter.create(tenantPerson);
		}
	}

	@SuppressWarnings("resource")
	public void _createTest(CommandInterpreter interpreter) throws Exception {

		String cleanString = interpreter.nextArgument();

		Context context = this.getContext();

		String tenantId = "test";
		String tenantName = "Test";

		boolean clean = false;
		if (cleanString != null)
			clean = Boolean.parseBoolean(cleanString);

		BizCommandUtils.createTenant(context, tenantId, tenantName, clean);
		BizCommandUtils.loadSeed(context, "mimo", tenantId, true);
		BizCommandUtils.loadSeed(context, "party", tenantId, true);
		BizCommandUtils.loadSeed(context, "abchip-test", tenantId, true);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
