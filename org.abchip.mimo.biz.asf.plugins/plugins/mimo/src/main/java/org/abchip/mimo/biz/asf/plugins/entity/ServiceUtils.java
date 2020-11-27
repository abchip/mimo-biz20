/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.entity;

import java.util.HashMap;
import java.util.Map;

import org.abchip.mimo.biz.model.security.login.UserLogin;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.apache.ofbiz.base.util.GeneralException;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.service.ModelParam;
import org.apache.ofbiz.service.ModelService;

public class ServiceUtils {

	public static Map<String, Object> toBizContext(Context context, Delegator delegator, ModelService service, EntityIdentifiable entity) throws GeneralException {

		ContextDescription contextDescription = context.getContextDescription();

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userLogin", EntityUtils.toBizEntity(delegator, context.createProxy(UserLogin.class, contextDescription.getUser())));
		params.put("locale", contextDescription.getLocale());

		Frame<EntityIdentifiable> frame = entity.isa();

		for (Slot slot : frame.getSlots()) {
			if (slot.isTransient())
				continue;

			ModelParam modelParam = ServiceUtils.getModelParam(service, slot);
			if (modelParam == null)
				continue;

			Object value = frame.getValue(entity, slot, false, false);
			value = EntityUtils.toBizValue(modelParam.getType(), slot, value);
			if (value == null)
				continue;

			params.put(modelParam.getName(), value);
		}

		return params;
	}

	public static ModelParam getModelParam(ModelService service, Slot slot) {

		ModelParam modelParam = null;
		if (slot.getDomain() != null && !slot.getName().endsWith("Id"))
			modelParam = service.getParam(slot.getName() + "Id");
		else
			modelParam = service.getParam(slot.getName());

		return modelParam;
	}
}