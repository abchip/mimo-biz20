/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.product;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLStreamHandlerFactory;

import org.abchip.mimo.application.Application;
import org.abchip.mimo.core.e4.E4EquinoxApplicationImpl;
import org.apache.catalina.webresources.TomcatURLStreamHandlerFactory;
import org.apache.ofbiz.base.conversion.BooleanConverters;
import org.apache.ofbiz.base.conversion.CollectionConverters;
import org.apache.ofbiz.base.conversion.Converters;
import org.apache.ofbiz.base.conversion.DateTimeConverters;
import org.apache.ofbiz.base.conversion.JSONConverters;
import org.apache.ofbiz.base.conversion.MiscConverters;
import org.apache.ofbiz.base.conversion.NetConverters;
import org.apache.ofbiz.base.conversion.NumberConverters;
import org.apache.ofbiz.base.start.Start;
import org.apache.ofbiz.entity.Delegator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class BizEquinoxApplicationImpl extends E4EquinoxApplicationImpl {

	@Override
	protected void doStart(Application application) {

		Converters.loadContainedConverters(org.apache.ofbiz.entity.util.Converters.class);
		Converters.loadContainedConverters(BooleanConverters.class);
		Converters.loadContainedConverters(CollectionConverters.class);
		Converters.loadContainedConverters(DateTimeConverters.class);
		Converters.loadContainedConverters(JSONConverters.class);
		Converters.loadContainedConverters(MiscConverters.class);
		Converters.loadContainedConverters(NetConverters.class);
		Converters.loadContainedConverters(NumberConverters.class);

		// System.out.println(System.getProperty("osgi.install.area"));
		// System.out.println(System.getProperty("osgi.instance.area"));
		try {
			Field field = URL.class.getDeclaredField("factory");
			if (field != null) {
				boolean isAccessible = field.isAccessible();

				field.setAccessible(true);

				URLStreamHandlerFactory currentFactory = (URLStreamHandlerFactory) field.get(null);
				field.set(null, null);

				TomcatURLStreamHandlerFactory tomcatFactory = TomcatURLStreamHandlerFactory.getInstance();
				if (currentFactory != null)
					tomcatFactory.addUserFactory(currentFactory);

				field.setAccessible(isAccessible);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		Bundle bundle = FrameworkUtil.getBundle(Delegator.class);
		String location = bundle.getLocation();
		location = location.replaceFirst("reference:file:", "");
		if (location.endsWith("/"))
			location = location.substring(0, location.length() - 1);

		if (location.startsWith("plugins/")) {
			String installArea = System.getProperty("osgi.install.area");
			installArea = installArea.replaceFirst("file:/", "/");
			System.setProperty("ofbiz.home", installArea + location);
		} else
			System.setProperty("ofbiz.home", location);

		// This the important line and available since Equinox 3.7

		ClassLoader originalLoader = Thread.currentThread().getContextClassLoader();

		try {
			Thread.currentThread().setContextClassLoader(new BizClassLoaderImpl(originalLoader, application));

			Start.main(new String[0]);
		} finally {
			Thread.currentThread().setContextClassLoader(originalLoader);
		}
	}
}
