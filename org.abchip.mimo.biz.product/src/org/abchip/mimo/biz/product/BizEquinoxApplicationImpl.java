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
import org.apache.ofbiz.base.start.Start;
import org.apache.ofbiz.entity.Delegator;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class BizEquinoxApplicationImpl extends E4EquinoxApplicationImpl {

	@Override
	protected void doStart(Application application) {

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
			ClassLoader wrappedLoader = new ClassLoader(originalLoader) {
				@Override
				public Class<?> findClass(String name) throws ClassNotFoundException {
					try {

						return super.findClass(name);
					} catch (ClassNotFoundException e) {
						if (name.startsWith("org.abchip.mimo.biz.asf"))
							return application.getContext().loadClass(name);
						else
							throw e;
					}
				}
			};

			Thread.currentThread().setContextClassLoader(wrappedLoader);

			Start.main(new String[0]);
		} finally {
			Thread.currentThread().setContextClassLoader(originalLoader);
		}
	}
}
