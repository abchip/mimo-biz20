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
import java.util.Enumeration;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.framework.Bundle;

public class SeedServices {
	
	public static String SEEDS_PATH = "application/seeds";
	
	public static void loadSeeds(Context context, String seedName, String tenantId, boolean update) {

		ResourceManager resourceManager = context.get(ResourceManager.class);
		Bundle bundle = context.get(Application.class).getBundle();

		for (Enumeration<URL> elements = bundle.findEntries(SEEDS_PATH + "/" + seedName, null, false); elements.hasMoreElements();) {
			URL seedUrl = elements.nextElement();
			try (InputStream inputStream = seedUrl.openStream()) {

				// System.err.println("************************");
				// System.err.println(seedUrl);
				// System.err.println("************************");

				XMIResource resource = new XMIResourceImpl();
				resource.load(inputStream, null);
				if (!resource.getContents().isEmpty()) {
					EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

					for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
						try {
							ResourceWriter<EntityIdentifiable> entityWriter = resourceManager.getResourceWriter(context, entityIdentifiable.isa(), tenantId);
							// System.err.println(entityIdentifiable.isa().getName());
							entityWriter.create(entityIdentifiable, update);
						} catch (Exception e) {
							System.err.println(e.getMessage());
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
						System.err.println(e.getMessage());
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(seedName);
	}
}