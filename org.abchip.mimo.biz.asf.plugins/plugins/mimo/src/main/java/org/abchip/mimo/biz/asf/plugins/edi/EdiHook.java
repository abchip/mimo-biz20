/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.edi;

import org.abchip.mimo.application.ApplicationStarted;
import org.abchip.mimo.biz.asf.plugins.ContextUtils;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;

public class EdiHook {

	@ApplicationStarted
	public void start() {

		// start master
		// Delegator delegator = DelegatorFactory.getDelegator(null);
		// LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(null,
		// delegator);

		Delegator delegator = ContextUtils.getDelegator(null, false);
		LocalDispatcher dispatcher = ContextUtils.getLocalDispatcher(delegator);

		try {
			dispatcher.runAsync(EdiServices.Services.startEdiEngine.name(), null);
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}
	}
}
