/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.asf.edi.EdiServices;
import org.abchip.mimo.biz.asf.edi.EdiUtils;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entityext.eca.DelegatorEcaHandler;
import org.apache.ofbiz.entityext.eca.EntityEcaRule;
import org.apache.ofbiz.entityext.eca.EntityEcaUtil;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;

public class TenantDelegatorEcaHandler extends DelegatorEcaHandler {

	public TenantDelegatorEcaHandler() {
		super();
	}
	
	@Override
	public Map<String, List<EntityEcaRule>> getEntityEventMap(String entityName) {

		Map<String, List<EntityEcaRule>> ecaValues = new HashMap<String, List<EntityEcaRule>>();

		// common
		Map<String, List<EntityEcaRule>> entityMap = super.getEntityEventMap(entityName);
		if (entityMap != null)
			ecaValues.putAll(entityMap);

		// tenant cache
		try {
			Map<String, Map<String, List<EntityEcaRule>>> ecaCache = EntityEcaUtil.getEntityEcaCache(EdiUtils.getEcaCache(this.getDispatchContext().getDelegator()));
			Map<String, List<EntityEcaRule>> tempEntity = ecaCache.get(entityName);
			if (tempEntity != null)
				ecaValues.putAll(tempEntity);

		} catch (GenericEntityException e) {
			e.printStackTrace();
		}

		return ecaValues;
	}

	@Override
	public void setDelegator(Delegator delegator) {
		super.setDelegator(delegator);

		// start tenant
		if (delegator.getDelegatorTenantId() == null)
			return;

		try {
			LocalDispatcher dispatcher = this.getDispatchContext().getDispatcher();
			dispatcher.runAsync(EdiServices.Services.startEdiEngine.name(), null, false);
		} catch (GenericServiceException | GenericEntityException e) {
			e.printStackTrace();
		}
	}
}