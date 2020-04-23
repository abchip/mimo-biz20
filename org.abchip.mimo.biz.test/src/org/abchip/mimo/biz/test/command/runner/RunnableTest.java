/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.command.runner;

import java.util.concurrent.Callable;

public class RunnableTest implements Callable<Boolean> {

	private final Integer number;

	public RunnableTest(Integer number) {
        this.number = number;
    }
	@Override
	public Boolean call() throws Exception {
		Thread.sleep(number * 1000);
		return true;
	}
}
