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
import org.abchip.mimo.parser.sqlite.SQLiteParser.Any_nameContext;
import org.abchip.mimo.parser.sqlite.SQLiteParser.Column_nameContext;
import org.abchip.mimo.parser.sqlite.SQLiteParser.ExprContext;
import org.abchip.mimo.parser.sqlite.SQLiteParser.Literal_valueContext;
import org.abchip.mimo.parser.sqlite.SQLiteParser.NameContext;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.osgi.service.log.Logger;

public class OFBizWhereBuilder<E extends EntityIdentifiable> extends OFBizQueryListener<E> {

	private static final Logger LOGGER = Logs.getLogger(OFBizWhereBuilder.class);

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
		System.out.println(token.getText());
		super.visitTerminal(node);
	}

	@Override
	public void enterColumn_name(Column_nameContext ctx) {

		String text = ctx.getText();
		this.joinColumnWhere(text);
	}

	@Override
	public void enterExpr(ExprContext ctx) {

		String text = ctx.getText();
		text = Strings.removeFirstChar(text);
		text = Strings.removeLastChar(text);
		text = text.replaceAll("\"", "\''");
		text = "'" + text + "'";

	}

	@Override
	public void enterLiteral_value(Literal_valueContext ctx) {
		// TODO Auto-generated method stub
		super.enterLiteral_value(ctx);
	}

	@Override
	public void enterName(NameContext ctx) {
		// TODO Auto-generated method stub
		super.enterName(ctx);
	}

	@Override
	public void enterAny_name(Any_nameContext ctx) {
		// TODO Auto-generated method stub
		super.enterAny_name(ctx);
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
	}
}