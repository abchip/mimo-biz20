/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class BizClassLoaderImpl_sav extends ClassLoader {

	private static final Logger LOGGER = Logs.getLogger(BizClassLoaderImpl_sav.class);

	private List<URL> urls = null;

	public BizClassLoaderImpl_sav(ClassLoader parent) {
		super(parent);
		this.urls = new ArrayList<URL>();
	}

	protected void addURL(URL url) {
		this.urls.add(url);
	}

	@Override
	public URL findResource(String name) {

		if (name.contains("/"))
			return null;

		for (URL url : urls) {
			try {
				Path path = Paths.get(url.toURI()).resolve(name);

				if (Files.exists(path))
					return path.toUri().toURL();

			} catch (URISyntaxException | MalformedURLException e) {
				LOGGER.warn(e.getMessage());
				continue;
			}
		}

		return null;
	}
}