/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.edi;

import org.abchip.mimo.application.ComponentStarted;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.service.GenericServiceException;
import org.apache.ofbiz.service.LocalDispatcher;
import org.apache.ofbiz.service.ServiceContainer;

public class EdiHook {

	@ComponentStarted
	public void start() {

		// start master
		Delegator delegator = DelegatorFactory.getDelegator(null);
		LocalDispatcher dispatcher = ServiceContainer.getLocalDispatcher(null, delegator);

		try {
			dispatcher.runAsync(EdiServices.Services.startEdiEngine.name(), null);
		} catch (GenericServiceException e) {
			e.printStackTrace();
		}
	}
}
