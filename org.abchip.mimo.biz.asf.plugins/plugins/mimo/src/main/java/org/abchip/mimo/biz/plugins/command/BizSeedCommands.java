/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.command;

import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.abchip.mimo.biz.plugins.entity.EntityUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.core.base.cmd.BaseCommands;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.apache.ofbiz.base.util.StringUtil;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityDataLoader;
import org.eclipse.osgi.framework.console.CommandInterpreter;

public class BizSeedCommands extends BaseCommands {

	@Inject
	private ResourceManager resourceManager;

	public void _convertSeeds(CommandInterpreter interpreter) throws Exception {
		Context context = this.getContext();
		/*
		 * Readers list <read-data reader-name="tenant"/> <read-data
		 * reader-name="seed"/> <read-data reader-name="seed-initial"/> <read-data
		 * reader-name="demo"/> <read-data reader-name="ext"/> <read-data
		 * reader-name="ext-test"/> <read-data reader-name="ext-demo"/>
		 */
		String filterReaders = nextArgument(interpreter);
		if(filterReaders == null || filterReaders.isEmpty()) {
			interpreter.println("Filter readers is empty. Maybe you want to try with 'seed,seed-initial'");
			return;
		}
		
		// remove containers
		ResourceWriter<EntityContainer> entityWriter = resourceManager.getResourceWriter(context, EntityContainer.class);
		try (EntityIterator<EntityContainer> conatinerIterator = entityWriter.find()) {
			while (conatinerIterator.hasNext()) {
				entityWriter.delete(conatinerIterator.next());
			}
		}

		Delegator delegator = DelegatorFactory.getDelegator(null);
		try {
			BizSeedCommands.exportReaderFiltered(interpreter, context, delegator, filterReaders);

		} catch (Exception e) {
			interpreter.printStackTrace(e);
		}
	}

	public static void exportReaderFiltered(CommandInterpreter interpreter, Context context, Delegator delegator, String filterReaders) {
		int c1 = 1;
		List<String> readerNames = new LinkedList<String>();
		if (filterReaders.indexOf(",") == -1) {
			readerNames = new LinkedList<String>();
			readerNames.add(filterReaders);
		} else {
			readerNames = StringUtil.split(filterReaders, ",");
		}
		String helperName = delegator.getGroupHelperName("org.apache.ofbiz");
		List<URL> urlList = EntityDataLoader.getUrlList(helperName, readerNames);

		Iterator<URL> urlListIt = urlList.iterator();
		URL url = null;
		while (urlListIt.hasNext()) {
			url = urlListIt.next();

			if (url.toString().endsWith("RainbowStoneThemeData.xml"))
				continue;

			try {
				List<GenericValue> listEntity = delegator.readXmlDocument(url);

				String[] segments = url.getPath().split("/");
				String containerName = segments[segments.length - 1];
				String folderName = segments[segments.length - 3];
				createContainer(interpreter, context, containerName, folderName, listEntity, c1++);
			} catch (Exception e) {
				interpreter.println("Problem with xml " + url + " " + e.getMessage());
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	private static void createContainer(CommandInterpreter interpreter, Context context, String containerName, String folderName, List<GenericValue> listEntity, int counter) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);

		String counterPad = org.apache.commons.lang.StringUtils.leftPad(Integer.toString(counter), 3, "0");
		Iterator<GenericValue> listEntityIt = listEntity.iterator();
		EntityContainer container = EntityFactory.eINSTANCE.createEntityContainer();
		containerName = counterPad + "_" + folderName + "_" + containerName.substring(0, containerName.lastIndexOf('.'));

		container.setName(containerName);
		while (listEntityIt.hasNext()) {
			GenericValue genericValue = listEntityIt.next();

			// TODO verifiy
			if (genericValue.getEntityName().startsWith("Budget"))
				continue;
			
			EntityIdentifiable entityIdentifiable = null;
			try {
				entityIdentifiable = EntityUtils.toEntity((Frame<EntityIdentifiable>) resourceManager.getFrame(context, genericValue.getEntityName()), genericValue);
			} catch (Exception e) {
				interpreter.println("Error in ecore model not find entity " + genericValue.getEntityName());
				continue;
			}
			container.getContents().add(entityIdentifiable);
		}
		ResourceWriter<EntityContainer> entityWriter = resourceManager.getResourceWriter(context, EntityContainer.class);
		entityWriter.create(container, true);
	}
	
	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}
}
