/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.net.URL;
import java.net.URLClassLoader;

public class BizClassLoaderImpl extends URLClassLoader {

	public BizClassLoaderImpl(ClassLoader parent) {
		super(new URL[0], parent);
	}

	protected void addURL(URL url) {
		super.addURL(url);
	}
}