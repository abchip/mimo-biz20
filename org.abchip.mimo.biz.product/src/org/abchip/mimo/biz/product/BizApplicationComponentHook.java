/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.product;

import javax.inject.Inject;

import org.abchip.mimo.application.ApplicationComponent;
import org.abchip.mimo.application.ComponentStarted;
import org.abchip.mimo.application.ComponentStarting;

public class BizApplicationComponentHook {

	@Inject
	private ApplicationComponent component;

	@ComponentStarting
	private void starting() {
		System.out.println(component);
	}

	@ComponentStarted
	private void started() {
		System.out.println(component);
	}
}
