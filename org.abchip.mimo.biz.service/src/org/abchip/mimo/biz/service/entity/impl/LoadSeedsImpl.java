/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.biz.service.entity.LoadSeeds;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.util.Enumerations;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.framework.Bundle;
import org.osgi.service.log.Logger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Load
 * Seeds</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.LoadSeedsImpl#getSeedPattern <em>Seed Pattern</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.service.entity.impl.LoadSeedsImpl#isUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadSeedsImpl extends ServiceRequestImpl<ServiceResponse> implements LoadSeeds {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logs.getLogger(LoadSeedsImpl.class);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadSeedsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.LOAD_SEEDS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeedPattern() {
		return (String)eGet(EntityPackage.Literals.LOAD_SEEDS__SEED_PATTERN, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeedPattern(String newSeedPattern) {
		eSet(EntityPackage.Literals.LOAD_SEEDS__SEED_PATTERN, newSeedPattern);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUpdate() {
		return (Boolean)eGet(EntityPackage.Literals.LOAD_SEEDS__UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdate(boolean newUpdate) {
		eSet(EntityPackage.Literals.LOAD_SEEDS__UPDATE, newUpdate);
	}

	@Override
	public ServiceResponse call() throws Exception {

		ServiceResponse response = this.buildResponse();
		Context context = this.getContext();
		
		Bundle bundle = context.get(Application.class).getBundle();
		Enumeration<URL> entries = bundle.findEntries(MimoConstants.SEEDS_PATH + "/" + this.getSeedPattern(), null, false);
		List<URL> elements = Enumerations.sort(entries, new Comparator<URL>() {
			@Override
			public int compare(URL o1, URL o2) {
				return o1.getPath().compareTo(o2.getPath());
			}

		});
		
		ResourceManager resourceManager = context.get(ResourceManager.class);		
		for (URL seedUrl : elements) {
			try (InputStream inputStream = seedUrl.openStream()) {

				XMIResource resource = new XMIResourceImpl();
				resource.load(inputStream, null);
				if (resource.getContents().isEmpty())
					continue;
				
				EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

				for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
					try {
						ResourceWriter<EntityIdentifiable> entityWriter = resourceManager.getResourceWriter(context, entityIdentifiable.isa());
						entityWriter.create(entityIdentifiable, this.isUpdate());
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return response;
	}
} // LoadSeedsImpl
