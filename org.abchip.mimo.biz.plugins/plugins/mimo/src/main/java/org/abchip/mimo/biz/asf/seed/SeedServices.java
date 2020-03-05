/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.seed;

import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.asf.application.MIMOContainer;
import org.abchip.mimo.biz.asf.entity.EntityUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityFactory;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.util.EntityDataLoader;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.ServiceUtil;

public class SeedServices {

	// private static final String PATH =
	// "C:\\Users\\giugianc_new\\Develop\\ofbiz\\";
//	private static final String PATH = "/home/mattia/ofbiz/";

	public static Map<String, Object> exportReaders(DispatchContext dctx, Map<String, Object> context) {
		/*
		  <read-data reader-name="tenant"/>
		  <read-data reader-name="seed"/>
		  <read-data reader-name="seed-initial"/> 
		  <read-data reader-name="demo"/> 
		  <read-data reader-name="ext"/> 
		  <read-data reader-name="ext-test"/> 
		  <read-data reader-name="ext-demo"/>
		 */
		try {
			exportReaderFiltered(dctx, "tenant");			
			exportReaderFiltered(dctx, "seed");			
			exportReaderFiltered(dctx, "seed-initial");			
			exportReaderFiltered(dctx, "demo");			
			exportReaderFiltered(dctx, "ext");			
			exportReaderFiltered(dctx, "ext-test");			
			exportReaderFiltered(dctx, "ext-demo");			
			
			Map<String, Object> resultMap = ServiceUtil.returnSuccess("OK");
			return resultMap;
		} catch (Exception e) {
			Map<String, Object> resultMap = ServiceUtil.returnError(e.getMessage());
			return resultMap;
		}
	}

	private static void exportReaderFiltered(DispatchContext dctx, String filter) {
		Delegator delegator = dctx.getDelegator();

		LinkedList<String> readerNames = new LinkedList<String>();
		readerNames.add(filter);
		String helperName = delegator.getGroupHelperName("org.apache.ofbiz");
		List<URL> urlList = EntityDataLoader.getUrlList(helperName, readerNames);

		Iterator<URL> urlListIt = urlList.iterator();
		URL url = null;
		while (urlListIt.hasNext()) {
			url = urlListIt.next();
//			System.err.println("Resource " + url.toString());
			try {
				List<GenericValue> listEntity = delegator.readXmlDocument(url);
				createContainer(delegator, url, listEntity, filter);
			} catch (Exception e) {
				System.err.println("Problem with xml " + url  + " " + e.getMessage());
//				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings({ "resource", "unchecked" })
	private static <E extends EntityIdentifiable> void createContainer(Delegator delegator, URL url,
			List<GenericValue> listEntity, String prefix) {
		Context context = MIMOContainer.getOrCreateContext(delegator.getDelegatorTenantId());
		ResourceManager resourceManager = context.get(ResourceManager.class);

		Iterator<GenericValue> listEntityIt = listEntity.iterator();
		EntityContainer container = EntityFactory.eINSTANCE.createEntityContainer();
		String[] segments = url.getPath().split("/");
		String containerName = segments[segments.length - 1];
		containerName = prefix + "_" + containerName.substring(0, containerName.lastIndexOf('.'));

		container.setName(containerName);
//		System.out.println("Container name " + containerName);
		while (listEntityIt.hasNext()) {
			GenericValue genericValue = listEntityIt.next();
			E entity = EntityUtils.toEntity((Frame<E>) resourceManager.getFrame(context, genericValue.getEntityName()),
					genericValue);
//			System.out.println("Container name " + containerName + " - " + entity.isa().getName());
			container.getContents().add(entity);
		}

		ResourceWriter<EntityIdentifiable> entityWriter = resourceManager.getResourceWriter(context, "EntityContainer");
		entityWriter.create(container, true);
	}
}