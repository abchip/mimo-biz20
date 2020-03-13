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

import org.abchip.mimo.application.Application;
import org.abchip.mimo.core.e4.E4EquinoxApplicationImpl;
import org.apache.ofbiz.base.start.Start;

public class BizEquinoxApplicationImpl extends E4EquinoxApplicationImpl {

	@Override
	protected void doStart(Application application) throws IOException {
		
//		BizApplicationUtils.setClassLoader(application);
		
//		BizApplicationUtils.loadConverters();
		
//		BizApplicationUtils.setURLStreamHandlerFactory();

		Path workPath = Paths.get(application.getPaths().getWork(), "ofbiz");
		BizApplicationUtils.copyToWork(application, workPath);

		System.setProperty("ofbiz.home", workPath.toString());
		System.setProperty("ofbiz.log.dir", application.getPaths().getLogs());
		System.setProperty("derby.system.home", application.getPaths().getData() + "/derby");

		BizActivatorImpl.setApplication(application);
		
		Start.main(new String[0]);
	}
}
