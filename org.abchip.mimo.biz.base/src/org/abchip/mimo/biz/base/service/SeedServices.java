/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.util.Enumerations;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.framework.Bundle;
import org.osgi.service.log.Logger;

public class SeedServices {

	private static final Logger LOGGER = Logs.getLogger(SeedServices.class);
	
	public static String SEEDS_PATH = "application/seeds";

	public static void loadSeeds(Context context, String seedName, String tenantId, boolean update) {

		ResourceManager resourceManager = context.get(ResourceManager.class);
		Bundle bundle = context.get(Application.class).getBundle();

		Enumeration<URL> entries = bundle.findEntries(SEEDS_PATH + "/" + seedName, null, false);
		List<URL> elements = Enumerations.sort(entries, new Comparator<URL>() {
			@Override
			public int compare(URL o1, URL o2) {
				return o1.getPath().compareTo(o2.getPath());
			}
			
		});
		for (URL seedUrl : elements) {
			try (InputStream inputStream = seedUrl.openStream()) {

				XMIResource resource = new XMIResourceImpl();
				resource.load(inputStream, null);
				if (!resource.getContents().isEmpty()) {
					EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

					for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
						try {
							ResourceWriter<EntityIdentifiable> entityWriter = resourceManager.getResourceWriter(context, entityIdentifiable.isa(), tenantId);
							entityWriter.create(entityIdentifiable, update);
						} catch (Exception e) {
							LOGGER.error(e.getMessage());
						}
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void loadSeed(Context context, String seedName, String tenantId, boolean update) {

		ResourceManager resourceManager = context.get(ResourceManager.class);
		Bundle bundle = context.get(Application.class).getBundle();

		URL seedUrl = bundle.getResource(SEEDS_PATH + "/" + seedName + ".xmi");
		if (seedUrl == null)
			return;

		try (InputStream inputStream = seedUrl.openStream()) {

			XMIResource resource = new XMIResourceImpl();
			resource.load(inputStream, null);
			if (!resource.getContents().isEmpty()) {
				EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

				for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
					try {
						ResourceWriter<EntityIdentifiable> entityWriter = resourceManager.getResourceWriter(context, entityIdentifiable.isa(), tenantId);
						entityWriter.create(entityIdentifiable, update);
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		LOGGER.info("Imported seed {}", seedName);
	}
}