/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.parser.sqlite.SQLiteBaseListener;
import org.apache.ofbiz.entity.Delegator;
import org.osgi.service.log.Logger;

public abstract class OFBizAbstractAnalyzer extends SQLiteBaseListener {

	protected Delegator delegator = null;
	protected Frame<?> frame = null;
	protected StringBuffer result = null;
	protected List<String> entities = null;

	public OFBizAbstractAnalyzer(Delegator delegator, Frame<?> frame) {
		super();
		this.delegator = delegator;
		this.frame = frame;

		result = new StringBuffer();
		entities = new ArrayList<String>();
	}

	public abstract Logger getLogger();
	
	public String getStringResult() {
		return result.toString();
	}

	public List<String> getListEntities() {
		return entities;
	}
}