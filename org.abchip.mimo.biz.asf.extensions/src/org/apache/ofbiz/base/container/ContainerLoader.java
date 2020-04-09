/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.apache.ofbiz.base.container;

import java.util.List;

import org.apache.ofbiz.base.start.Config;
import org.apache.ofbiz.base.start.StartupCommand;
import org.apache.ofbiz.base.start.StartupException;
import org.apache.ofbiz.base.start.StartupLoader;

public class ContainerLoader implements StartupLoader {

	@Override
	public synchronized void load(Config config, List<StartupCommand> ofbizCommands) throws StartupException {
	}

	@Override
	public void unload() throws StartupException {
	}
}