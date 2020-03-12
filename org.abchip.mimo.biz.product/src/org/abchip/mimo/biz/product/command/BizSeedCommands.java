/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.product.command;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.BaseCommandProviderImpl;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class BizSeedCommands extends BaseCommandProviderImpl {

	@Inject
	private ResourceManager resourceManager;

	public <E extends EntityIdentifiable> void _loginBizSeed(CommandInterpreter interpreter) throws Exception {
		this.login(interpreter.nextArgument());
	}

	@SuppressWarnings("resource")
	public void _convertSeeds(CommandInterpreter interpreter) throws Exception {
		Context context = this.getContext();
		/*
		 * Readers list <read-data reader-name="tenant"/> <read-data
		 * reader-name="seed"/> <read-data reader-name="seed-initial"/> <read-data
		 * reader-name="demo"/> <read-data reader-name="ext"/> <read-data
		 * reader-name="ext-test"/> <read-data reader-name="ext-demo"/>
		 */

		// remove containers
		ResourceWriter<EntityContainer> entityWriter = resourceManager.getResourceWriter(context, EntityContainer.class);
		try (EntityIterator<EntityContainer> conatinerIterator = entityWriter.find()) {
			while (conatinerIterator.hasNext()) {
				entityWriter.delete(conatinerIterator.next());
			}
		}

		Delegator delegator = DelegatorFactory.getDelegator(null);
		try {
			BizCommandUtils.exportReaderFiltered(context, delegator, "tenant");
			BizCommandUtils.exportReaderFiltered(context, delegator, "seed");
			BizCommandUtils.exportReaderFiltered(context, delegator, "seed-initial");
			BizCommandUtils.exportReaderFiltered(context, delegator, "demo");
			BizCommandUtils.exportReaderFiltered(context, delegator, "ext");
			BizCommandUtils.exportReaderFiltered(context, delegator, "ext-test");
			BizCommandUtils.exportReaderFiltered(context, delegator, "ext-demo");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public void _loadSeed(CommandInterpreter interpreter) throws Exception {

		Context context = this.getContext();

		String seedName = interpreter.nextArgument();
		String tenantId = interpreter.nextArgument();

		BizCommandUtils.loadSeeds(context, seedName, tenantId, true);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
