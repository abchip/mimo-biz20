/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.parser.sqlite.SQLiteParser.Column_nameContext;
import org.abchip.mimo.util.Logs;
import org.osgi.service.log.Logger;

public class OFBizOrderBuilder<E extends EntityIdentifiable> extends OFBizQueryListener<E> {

	private static final Logger LOGGER = Logs.getLogger(OFBizOrderBuilder.class);

	public OFBizOrderBuilder(OFBizQueryBuilder<E> queryBuilder) {
		super(queryBuilder);
	}

	@Override
	protected Logger getLogger() {
		return LOGGER;
	}

	@Override
	public void enterColumn_name(Column_nameContext ctx) {
		
		String text = ctx.getText();
		this.joinColumnOrder(text);
	}
}