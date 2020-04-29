/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.product.impl;

import org.abchip.mimo.biz.model.party.contact.ContactMech;
import org.abchip.mimo.biz.model.party.contact.PostalAddress;
import org.abchip.mimo.biz.model.product.facility.FacilityContactMech;
import org.abchip.mimo.biz.service.impl.BizServiceRequestImpl;
import org.abchip.mimo.biz.service.product.GetProductDefault;
import org.abchip.mimo.biz.service.product.GetProductDefaultResponse;
import org.abchip.mimo.biz.service.product.ProductPackage;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Get
 * Party Default</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class GetProductDefaultImpl extends BizServiceRequestImpl<GetProductDefaultResponse> implements GetProductDefault {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GetProductDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.GET_PRODUCT_DEFAULT;
	}

	@Override
	public GetProductDefaultResponse call() throws Exception {

		GetProductDefaultResponse response = this.buildResponse();

		String filter = "facilityId = \"WebStoreWarehouse\"  AND thruDate IS NULL";
		String order = "-fromDate";

		ResourceManager resourceManager = this.getContext().getResourceManager();
		ResourceReader<FacilityContactMech> facilityContactMechReader = resourceManager.getResourceReader(context, FacilityContactMech.class);

		try (EntityIterator<FacilityContactMech> facilityContactMechs = facilityContactMechReader.find(filter, null, order)) {
			for (FacilityContactMech facilityContactMech : facilityContactMechs) {
				ResourceReader<ContactMech> contactMechReader = resourceManager.getResourceReader(context, ContactMech.class);
				ContactMech contactMech = contactMechReader.lookup(facilityContactMech.getContactMechId().getContactMechId());

				if (!contactMech.getContactMechTypeId().getContactMechTypeId().equals("POSTAL_ADDRESS"))
					continue;

				response.setFacilityPostalAddress(context.createProxy(PostalAddress.class, contactMech.getContactMechId()));
				break;
			}
		}

		return response;
	}

} // GetProductDefaultImpl
