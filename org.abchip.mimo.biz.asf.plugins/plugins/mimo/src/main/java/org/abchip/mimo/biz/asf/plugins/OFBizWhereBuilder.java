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
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.parser.sqlite.SQLiteLexer;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.ofbiz.entity.condition.EntityCondition;
import org.osgi.service.log.Logger;

public class OFBizWhereBuilder<E extends EntityIdentifiable> extends OFBizQueryListener<E> {

	private static final Logger LOGGER = Logs.getLogger(OFBizWhereBuilder.class);

	private StringBuffer filter = null;

	public OFBizWhereBuilder(OFBizQueryBuilder<E> queryBuilder) {
		super(queryBuilder);
	}

	@Override
	protected Logger getLogger() {
		return LOGGER;
	}

	@Override
	public void visitTerminal(TerminalNode node) {

		Token token = node.getSymbol();
		String text = token.getText();

		switch (token.getType()) {
		case SQLiteLexer.K_WHERE:
			return;
		case SQLiteLexer.IDENTIFIER:
			filter = new StringBuffer();
			Slot slot = this.getQueryBuilder().getFrame().getSlot(text);
			if (slot.getCardinality().isMultiple()) {

			} else {
				// ModelUtils.getModelFieldId(slot)
			}
			return;
		case SQLiteLexer.STRING_LITERAL:

			text = Strings.removeFirstChar(text);
			text = Strings.removeLastChar(text);
			text = text.replaceAll("'", "''");
			text = "'" + text + "'";
			// new EntityExpr(fieldName, EntityOperator.EQUALS, value)
			EntityCondition where = EntityCondition
					.makeConditionWhere("Party.PARTY_ID in (SELECT PartyRole.PARTY_ID from public.PARTY_ROLE PartyRole where PartyRole.ROLE_TYPE_ID=" + text + ")");
			this.getQueryBuilder().addCondition(where);
			break;
		default:
			return;
		}

	}
}