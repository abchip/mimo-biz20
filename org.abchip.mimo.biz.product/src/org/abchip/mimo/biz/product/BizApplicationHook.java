/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.product;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.inject.Inject;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.application.ApplicationStarted;
import org.abchip.mimo.application.ApplicationStarting;
import org.apache.ofbiz.base.start.Start;

public class BizApplicationHook {

	@Inject
	private Application application;

	@ApplicationStarting
	private void starting() {

		BizActivatorImpl.setApplication(application);
		
		Path workPath = Paths.get(application.getPaths().getWork(), "ofbiz");
		try {
			BizApplicationUtils.copyToWork(application, workPath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.setProperty("ofbiz.home", workPath.toString());
		System.setProperty("ofbiz.log.dir", application.getPaths().getLogs());
		System.setProperty("derby.system.home", application.getPaths().getData() + "/derby");

		Start.main(new String[0]);
	}

	@ApplicationStarted
	private void started() {
		System.out.println(application);
	}
}
