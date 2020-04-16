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

import org.abchip.mimo.biz.base.service.SeedServices;
import org.abchip.mimo.biz.base.service.TenantServices;
import org.abchip.mimo.biz.base.service.TenantServices.DBType;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.PartyFactory;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class TenantCommands extends BaseCommands {

	@Inject
	private ResourceManager resourceManager;

	public <E extends EntityIdentifiable> void _loginTenant(CommandInterpreter interpreter) throws Exception {
		this.login(nextArgument(interpreter));
	}

	public void _createMaster(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		SeedServices.loadSeeds(context, "seed", null, true);
		SeedServices.loadSeed(context, "mimo", null, true);
		SeedServices.loadSeed(context, "party", null, true);
		SeedServices.loadSeed(context, "abchip-net", null, true);
		SeedServices.loadSeed(context, "abchip-net-accounting", null, true);
		SeedServices.loadSeed(context, "passport", null, true);
		SeedServices.loadSeed(context, "edi", null, true);
	}

	public void _createTenant(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		// create db structure
		// tenant seeds, depending on db type (AdminNewTenantData-Derby.xml,
		// AdminUserLoginData.xml)

		String tenantId = nextArgument(interpreter);
		String tenantName = nextArgument(interpreter);
		DBType dbType = DBType.valueOf(nextArgument(interpreter));
		String partyId = nextArgument(interpreter);

		TenantServices.createTenant(context, tenantId, tenantName, dbType, false);
		SeedServices.loadSeeds(context, "seed", tenantId, true);
		SeedServices.loadSeed(context, "mimo", tenantId, true);
		SeedServices.loadSeed(context, "party", tenantId, true);
		SeedServices.loadSeed(context, "abchip-biz", tenantId, true);
		TenantServices.createUserTenant(context, tenantId, false);
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

	public void _createTest(CommandInterpreter interpreter) throws Exception {

		DBType dbType = DBType.valueOf(nextArgument(interpreter));
		boolean update = Boolean.parseBoolean(nextArgument(interpreter));

		Context context = this.getContext();

		String tenantId = "test";
		String tenantName = "Test";
		
		TenantServices.createTenant(context, tenantId, tenantName, dbType, update);
		SeedServices.loadSeeds(context, "seed", tenantId, true);
		SeedServices.loadSeed(context, "mimo", tenantId, true);
		SeedServices.loadSeed(context, "party", tenantId, true);
		SeedServices.loadSeed(context, "abchip-test", tenantId, true);
		SeedServices.loadSeed(context, "abchip-test-accounting", tenantId, true);
		TenantServices.createUserTenant(context, tenantId, false);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
