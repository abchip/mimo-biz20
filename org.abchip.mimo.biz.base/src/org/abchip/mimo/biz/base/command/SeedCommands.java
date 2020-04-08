/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.command;

import org.abchip.mimo.biz.base.service.SeedServices;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class SeedCommands extends BaseCommands {

	public <E extends EntityIdentifiable> void _loginSeed(CommandInterpreter interpreter) throws Exception {
		this.login(nextArgument(interpreter));
	}

	public void _loadSeed(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String seedName = nextArgument(interpreter);
		String tenantId = nextArgument(interpreter);

		SeedServices.loadSeed(context, seedName, tenantId, true);
	}

	public void _loadSeeds(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String seedName = nextArgument(interpreter);
		String tenantId = nextArgument(interpreter);

		SeedServices.loadSeeds(context, seedName, tenantId, true);
	}

	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
