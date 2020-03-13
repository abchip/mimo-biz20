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
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;

import org.abchip.mimo.application.Application;

public class BizClassLoaderImpl extends ClassLoader {

	private Application application = null;

	public BizClassLoaderImpl(ClassLoader originalLoader, Application application) {
		super(originalLoader);
		this.application = application;
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {

		if (name.equals("org.apache.ofbiz.base.container.ContainerLoader")) {
			return BizApplicationLoaderImpl.class;
		} else {
			return super.loadClass(name);
		}
	}
/*
	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {

		try {
			Class<?> klass = super.findClass(name);
			if(klass != null)
				return klass;
		}
		catch(Exception e) {			
		}
		
		return this.application.getContext().loadClass(name);
	}

	@Override
	protected URL findResource(String name) {

		try {
			return application.getContext().getResource(name);
		} catch (IOException e) {
			return null;
		}
	}

	@Override
	protected Enumeration<URL> findResources(String name) throws IOException {
		return Collections.enumeration(application.getContext().getResources(name));
	}*/
}
