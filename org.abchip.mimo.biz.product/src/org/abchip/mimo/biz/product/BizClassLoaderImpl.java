/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.product;

import org.abchip.mimo.context.ContextRoot;

public class BizClassLoaderImpl extends ClassLoader {

	private ContextRoot context = null;

	public BizClassLoaderImpl(ClassLoader originalLoader, ContextRoot context) {
		super(originalLoader);
		this.context = context;
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {

		if (name.equals("org.apache.ofbiz.base.container.ContainerLoader")) {
			return BizContainerLoaderImpl.class;
		} else
			return super.loadClass(name);
	}

	@Override
	public Class<?> findClass(String name) throws ClassNotFoundException {

		try {
			return super.findClass(name);
		} catch (ClassNotFoundException e) {
			if (name.startsWith("org.abchip.mimo.biz"))
				return this.context.loadClass(name);
			else if (name.startsWith("org.apache.ofbiz"))
				return this.context.loadClass(name);
			else
				throw e;
		}
	}
}
