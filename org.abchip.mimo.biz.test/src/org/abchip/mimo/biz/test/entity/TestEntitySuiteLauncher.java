/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.test.entity;

import javax.inject.Inject;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.tester.Test;
import org.abchip.mimo.tester.TestManager;
import org.abchip.mimo.tester.TestSuiteLauncher;
import org.abchip.mimo.tester.TestSuiteRunner;
import org.abchip.mimo.tester.base.BaseTestSuiteDirectoryRunnerImpl;

public class TestEntitySuiteLauncher implements TestSuiteLauncher {

	@Inject
	private TestManager testManager;

	@Override
	public TestSuiteRunner createSuite(Context context) {
		return new InternalSuiteDirectoryRunnerImpl(context, testManager, null);
	}

	@Test(category = "BizEntity")
	private class InternalSuiteDirectoryRunnerImpl extends BaseTestSuiteDirectoryRunnerImpl {

		public InternalSuiteDirectoryRunnerImpl(Context context, TestManager testManager, String category) {
			super(context, testManager, category, "/entity/runner/");
		}
	}
}
