/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.application;

import org.abchip.mimo.application.ComponentStarting;

public class MIMOHook {

	@ComponentStarting
	public void start() {

		// OFBizCommandUtils.loadSeeds(context, "mimo", null, true);
	}
}
