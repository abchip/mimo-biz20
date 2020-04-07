/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogReaderService;
import org.osgi.util.tracker.ServiceTracker;

public final class Activator implements BundleActivator {

	private final Log4jLogReader logger;
	private final List<LogReaderService> readers;
	private final ServiceListener listener;
	private ServiceTracker<LogReaderService, LogReaderService> tracker;

	public Activator() {
		this.logger = new Log4jLogReader();
		this.readers = new LinkedList<>();

		/*
		 * Create a service listener that adds an SLF4J-based log reader every time a
		 * log service appears, and removes it when the log service disappears.
		 */

		this.listener = event -> {
			final ServiceReference<?> ref = event.getServiceReference();
			if (ref == null) {
				return;
			}

			final Bundle bundle = ref.getBundle();
			if (bundle == null) {
				return;
			}

			final BundleContext context = bundle.getBundleContext();
			if (context == null) {
				return;
			}

			final LogReaderService reader = (LogReaderService) context.getService(ref);
			if (reader != null) {
				if (event.getType() == ServiceEvent.REGISTERED) {
					this.readers.add(reader);
					reader.addLogListener(this.logger);
				} else if (event.getType() == ServiceEvent.UNREGISTERING) {
					reader.removeLogListener(Activator.this.logger);
					this.readers.remove(reader);
				}
			}
		};
	}

	@Override
	public void start(final BundleContext context) throws Exception {
		this.tracker = new ServiceTracker<>(context, LogReaderService.class.getName(), null);
		this.tracker.open();

		final Object[] current_readers = this.tracker.getServices();
		if (current_readers != null) {
			for (int index = 0; index < current_readers.length; index++) {
				final LogReaderService reader = (LogReaderService) current_readers[index];

				this.readers.add(reader);
				reader.addLogListener(this.logger);
			}
		}

		final String filter = "(objectclass=" + LogReaderService.class.getName() + ")";

		try {
			context.addServiceListener(this.listener, filter);
		} catch (final InvalidSyntaxException e) {
			System.err.println(e.getMessage());
		}
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		final Iterator<LogReaderService> iter = this.readers.iterator();
		while (iter.hasNext()) {
			final LogReaderService reader = iter.next();

			reader.removeLogListener(this.logger);
			iter.remove();
		}

		this.tracker.close();
	}
}