/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.entity;

import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.asf.plugins.ContextUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.util.Logs;
import org.apache.ofbiz.base.util.StringUtil;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityDataLoader;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.ServiceUtil;
import org.osgi.service.log.Logger;

public class SeedServices {

	private static final Logger LOGGER = Logs.getLogger(SeedServices.class);

	public static Map<String, Object> convertSeeds(DispatchContext dctx, Map<String, Object> params) {

		String filterReaders = (String) params.get("readers");

		Delegator delegator = dctx.getDelegator();

		try {
			Context context = ContextUtils.getOrCreateContext(delegator.getDelegatorTenantId());
			exportReaderFiltered(context, delegator, filterReaders);
		} catch (Exception e) {
			return ServiceUtil.returnError(e.getMessage());
		}

		return ServiceUtil.returnSuccess();
	}

	private static void exportReaderFiltered(Context context, Delegator delegator, String filterReaders) {
		int c1 = 1;
		List<String> readerNames = new LinkedList<String>();
		if (!filterReaders.contains(",")) {
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
				createContainer(context, containerName, folderName, listEntity, c1++);
			} catch (Exception e) {
				LOGGER.warn(e.getMessage());
			}
		}
	}

	private static void createContainer(Context context, String containerName, String folderName, List<GenericValue> listEntity, int counter) throws ResourceException {

		String counterPad = org.apache.commons.lang.StringUtils.leftPad(Integer.toString(counter), 3, "0");
		Iterator<GenericValue> listEntityIt = listEntity.iterator();

		ResourceWriter<EntityContainer> entityWriter = context.getResourceManager().getResourceWriter(EntityContainer.class);
		EntityContainer container = entityWriter.make();
		containerName = counterPad + "_" + folderName + "_" + containerName.substring(0, containerName.lastIndexOf('.'));

		container.setName(containerName);
		while (listEntityIt.hasNext()) {
			GenericValue genericValue = listEntityIt.next();

			EntityIdentifiable entityIdentifiable = container.add(genericValue.getEntityName());
			EntityUtils.completeEntity(entityIdentifiable, genericValue);
		}

		entityWriter.create(container);
	}
}