/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.asf.plugins.edi.EdiServices;
import org.abchip.mimo.biz.asf.plugins.edi.EdiUtils;
import org.apache.ofbiz.entity.Delegator;
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
		Map<String, Map<String, List<EntityEcaRule>>> ecaCache = EntityEcaUtil.getEntityEcaCache(EdiUtils.getEcaCache(this.delegator));
		Map<String, List<EntityEcaRule>> tempEntity = ecaCache.get(entityName);
		if (tempEntity != null)
			ecaValues.putAll(tempEntity);

		return ecaValues;
	}

	@Override
	public void setDelegator(Delegator delegator) {
		super.setDelegator(delegator);

		// start tenant
		if (delegator.getDelegatorTenantId() == null)
			return;

		try {
			// LocalDispatcher dispatcher = this.getDispatchContext().getDispatcher();
			LocalDispatcher dispatcher = ContextUtils.getLocalDispatcher(delegator);
			dispatcher.runAsync(EdiServices.Services.startEdiEngine.name(), null, false);
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}
	}
}