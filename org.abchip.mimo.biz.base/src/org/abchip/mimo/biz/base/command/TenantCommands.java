/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.command;

import org.abchip.mimo.biz.base.service.TenantServices;
import org.abchip.mimo.biz.model.common.status.StatusItem;
import org.abchip.mimo.biz.model.party.party.PartyType;
import org.abchip.mimo.biz.model.party.party.Person;
import org.abchip.mimo.biz.service.entity.DatabaseType;
import org.abchip.mimo.biz.service.entity.LoadSeed;
import org.abchip.mimo.biz.service.entity.LoadSeeds;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.resource.ResourceWriter;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class TenantCommands extends BaseCommands {

	public void _createMaster(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		{
			LoadSeeds loadSeeds = context.getServiceManager().prepare(context, LoadSeeds.class);
			loadSeeds.setSeedPattern("seed");
			loadSeeds.setUpdate(true);
			context.getServiceManager().execute(loadSeeds);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("mimo");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("party");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("abchip-net");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("abchip-net-accounting");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("passport");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("edi");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
	}

	public void _createTenant(CommandInterpreter interpreter) throws Exception {

		String tenantId = nextArgument(interpreter);
		String tenantName = nextArgument(interpreter);
		DatabaseType dbType = DatabaseType.valueOf(nextArgument(interpreter));

		Context context = this.getContext();

		TenantServices.createTenant(context, tenantId, tenantName, dbType, false);
		{
			LoadSeeds loadSeeds = context.getServiceManager().prepare(context, LoadSeeds.class);
			loadSeeds.setSeedPattern("seed");
			loadSeeds.setUpdate(true);
			context.getServiceManager().execute(loadSeeds);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("mimo");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("party");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("abchip-biz");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}

		TenantServices.createUserTenant(context, tenantId, false);
		// Mail

		// Party
		String partyId = nextArgument(interpreter);
		if (partyId == null) {
			ResourceWriter<Person> personWriter = context.getResourceManager().getResourceWriter(context, Person.class);
			Person tenantPerson = personWriter.make();
			tenantPerson.setPartyId(tenantId);
			tenantPerson.setStatusId(context.createProxy(StatusItem.class, "PARTY_ENABLED"));
			tenantPerson.setPartyTypeId(context.createProxy(PartyType.class, "PERSON"));
			tenantPerson.setFirstName("Tenant " + tenantId);
			personWriter.create(tenantPerson);
		}
	}

	public void _createTest(CommandInterpreter interpreter) throws Exception {

		DatabaseType dbType = DatabaseType.valueOf(nextArgument(interpreter));
		boolean update = Boolean.parseBoolean(nextArgument(interpreter));

		Context context = this.getContext();

		String tenantId = "test";
		String tenantName = "Test";

		TenantServices.createTenant(context, tenantId, tenantName, dbType, update);
		{
			LoadSeeds loadSeeds = context.getServiceManager().prepare(context, LoadSeeds.class);
			loadSeeds.setSeedPattern("seed");
			loadSeeds.setUpdate(true);
			context.getServiceManager().execute(loadSeeds);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("mimo");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("party");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("abchip-tenantTest");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}
		{
			LoadSeed loadSeed = context.getServiceManager().prepare(context, LoadSeed.class);
			loadSeed.setSeedId("abchip-tenantTest-accounting");
			loadSeed.setUpdate(true);
			context.getServiceManager().execute(loadSeed);
		}

		TenantServices.createUserTenant(context, tenantId, update);
	}

	public void _createDemo(CommandInterpreter interpreter) throws Exception {

		DatabaseType dbType = DatabaseType.valueOf(nextArgument(interpreter));
		boolean update = Boolean.parseBoolean(nextArgument(interpreter));

		Context context = this.getContext();

		String tenantId = "demo";
		String tenantName = "Demo tenant";

		TenantServices.createTenant(context, tenantId, tenantName, dbType, update);
		{
			LoadSeeds loadSeeds = context.getServiceManager().prepare(context, LoadSeeds.class);
			loadSeeds.setSeedPattern("seed");
			loadSeeds.setUpdate(true);
			context.getServiceManager().execute(loadSeeds);
		}
		{
			LoadSeeds loadSeeds = context.getServiceManager().prepare(context, LoadSeeds.class);
			loadSeeds.setSeedPattern("demo");
			loadSeeds.setUpdate(true);
			context.getServiceManager().execute(loadSeeds);
		}

		TenantServices.createUserTenant(context, tenantId, update);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
