/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.entity.impl;

import java.io.InputStream;
import java.net.URL;

import org.abchip.mimo.MimoConstants;
import org.abchip.mimo.application.Application;
import org.abchip.mimo.biz.service.entity.EntityPackage;
import org.abchip.mimo.biz.service.entity.LoadSeed;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityContainer;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.resource.ResourceWriter;
import org.abchip.mimo.service.ServiceResponse;
import org.abchip.mimo.service.impl.ServiceRequestImpl;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.osgi.framework.Bundle;
import org.osgi.service.log.Logger;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Load
 * Seed</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.LoadSeedImpl#getSeedId
 * <em>Seed Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.service.entity.impl.LoadSeedImpl#isUpdate
 * <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadSeedImpl extends ServiceRequestImpl<ServiceResponse> implements LoadSeed {

	private static final Logger LOGGER = Logs.getLogger(LoadSeedImpl.class);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LoadSeedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.LOAD_SEED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSeedId() {
		return (String) eGet(EntityPackage.Literals.LOAD_SEED__SEED_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSeedId(String newSeedId) {
		eSet(EntityPackage.Literals.LOAD_SEED__SEED_ID, newSeedId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isUpdate() {
		return (Boolean) eGet(EntityPackage.Literals.LOAD_SEED__UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setUpdate(boolean newUpdate) {
		eSet(EntityPackage.Literals.LOAD_SEED__UPDATE, newUpdate);
	}

	@Override
	public ServiceResponse call() throws Exception {

		ServiceResponse response = this.buildResponse();
		Context context = this.getContext();

		Bundle bundle = context.get(Application.class).getBundle();

		URL seedUrl = bundle.getResource(MimoConstants.SEEDS_PATH + "/" + this.getSeedId() + ".xmi");
		if (seedUrl == null) {
			response.setError(true);
			response.setErrorMessage("Seed not found " + this.getSeedId());
			return response;
		}

		try (InputStream inputStream = seedUrl.openStream()) {

			XMIResource resource = new XMIResourceImpl();
			resource.load(inputStream, null);
			if (!resource.getContents().isEmpty()) {
				EntityContainer entityContainer = (EntityContainer) resource.getContents().get(0);

				for (EntityIdentifiable entityIdentifiable : entityContainer.getContents()) {
					try {
						ResourceWriter<EntityIdentifiable> entityWriter = context.getResourceManager().getResourceWriter(entityIdentifiable.isa(), this.getTenant());
						entityWriter.create(entityIdentifiable, this.isUpdate());
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
					}
				}
			}
		}

		return response;
	}

} // LoadSeedImpl
