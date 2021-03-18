/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.util.ArrayList;
import java.util.List;

import org.abchip.mimo.biz.asf.plugins.entity.ModelUtils;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.parser.sqlite.SQLiteLexer;
import org.abchip.mimo.util.Lists;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.condition.EntityComparisonOperator;
import org.apache.ofbiz.entity.condition.EntityCondition;
import org.apache.ofbiz.entity.condition.EntityJoinOperator;
import org.apache.ofbiz.entity.model.ModelEntity;
import org.apache.ofbiz.entity.model.ModelField;
import org.osgi.service.log.Logger;

public class OFBizWhereBuilder<E extends EntityIdentifiable> extends OFBizQueryListener<E> {

	private static final Logger LOGGER = Logs.getLogger(OFBizWhereBuilder.class);

	private List<EntityCondition> entityConditions = new ArrayList<EntityCondition>();

	private Slot slotInRole = null;
	private EntityComparisonOperator<?, ?> operatorInRole = null;
	private Object valueInRole = null;
	private EntityJoinOperator joinInrole = null;

	public OFBizWhereBuilder(OFBizQueryBuilder<E> queryBuilder) {
		super(queryBuilder);
	}

	@Override
	protected Logger getLogger() {
		return LOGGER;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void visitTerminal(TerminalNode node) {

		Token token = node.getSymbol();
		String text = token.getText();

		switch (token.getType()) {
		case SQLiteLexer.K_WHERE:
			break;
		case SQLiteLexer.OPEN_PAR:
			break;
		case SQLiteLexer.CLOSE_PAR:
			this.flusRule();
			this.resetInRole();

			break;
		case SQLiteLexer.K_AND:
		case SQLiteLexer.K_OR:
			this.flusRule();
			this.resetInRole();
			this.joinInrole = EntityJoinOperator.lookupJoin(text);
			if (this.joinInrole == null)
				getLogger().error("Join operator {} not found", this.getQueryBuilder().getFrame().getName() + "/" + text);
			break;
		case SQLiteLexer.IDENTIFIER:
			this.slotInRole = this.getQueryBuilder().getFrame().getSlot(text);
			break;
		case SQLiteLexer.ASSIGN:
		case SQLiteLexer.NOT_EQ2:
		case SQLiteLexer.GT:
		case SQLiteLexer.GT_EQ:
		case SQLiteLexer.LT:
		case SQLiteLexer.LT_EQ:
		case SQLiteLexer.K_LIKE:
			this.operatorInRole = EntityComparisonOperator.lookupComparison(text);
			if (this.operatorInRole == null)
				getLogger().error("Comparison operator {} not found", this.getQueryBuilder().getFrame().getName() + "/" + text);
			break;
		case SQLiteLexer.K_IN:
			this.operatorInRole = EntityComparisonOperator.IN;
			this.valueInRole = new ArrayList<Object>();
			break;
		case SQLiteLexer.STRING_LITERAL:

			String value = Strings.removeFirstChar(text);
			value = Strings.removeLastChar(value);
			value = value.replaceAll("'", "''");
			value = "'" + value + "'";

			if (this.valueInRole instanceof List<?>)
				((List<String>) valueInRole).add(value);
			else
				valueInRole = value;
			break;
		case SQLiteLexer.NUMERIC_LITERAL:
			if (this.valueInRole instanceof List<?>)
				((List<String>) valueInRole).add(text);
			else
				valueInRole = text;
			break;
		default:
			System.out.println(text);
			break;
		}
	}

	@Override
	public void close() {
		this.flusRule();
		this.getQueryBuilder().addConditions(this.entityConditions);
	}

	private void flusRule() {

		if (this.slotInRole == null)
			return;

		Delegator delegator = this.getQueryBuilder().getDelegator();
		Frame<?> frame = this.getQueryBuilder().getFrame();

		EntityCondition entityCondition = null;

		if (this.slotInRole.getCardinality().isMultiple()) {
			Slot frameKey = frame.getAllKeySlots().get(0);
			ModelField frameKeyField = ModelUtils.getModelField(delegator, frame.getName(), frameKey.getName());
			ModelEntity frameLinked = delegator.getModelEntity(this.slotInRole.getDomain().getFrame());
			ModelField frameLinkedKeyField = frameLinked.getPkFields().get(0);
			ModelField slotLinkedKeyField = frameLinked.getPkFields().get(1);

			StringBuffer sql = new StringBuffer();
			sql.append(frame.getName());
			sql.append(".");
			sql.append(frameKeyField.getColName());
			sql.append(" ");
			sql.append("IN(");
			sql.append("SELECT");
			sql.append(" ");
			sql.append(frameLinked.getEntityName());
			sql.append(".");
			sql.append(frameLinkedKeyField.getColName());
			sql.append(" ");
			sql.append("FROM");
			sql.append(" ");
			sql.append(frameLinked.getPlainTableName());
			sql.append(" ");
			sql.append(frameLinked.getEntityName());
			sql.append(" ");
			sql.append("WHERE");
			sql.append(" ");
			sql.append(frameLinked.getEntityName());
			sql.append(".");
			sql.append(slotLinkedKeyField.getColName());
			sql.append(" ");
			sql.append(this.operatorInRole);
			sql.append(" ");
			if (this.operatorInRole == EntityComparisonOperator.IN)
				sql.append(formatSqlIN((List<?>) this.valueInRole));
			else
				sql.append(this.valueInRole);
			sql.append(")");

			entityCondition = EntityCondition.makeConditionWhere(sql.toString());
		} else {
			StringBuffer sql = new StringBuffer();
			sql.append(frame.getName());
			sql.append(".");
			ModelField modelField = ModelUtils.getModelField(delegator, frame.getName(), this.slotInRole.getName());
			sql.append(modelField.getColName());
			sql.append(" ");
			sql.append(this.operatorInRole);
			sql.append(" ");
			if (this.operatorInRole == EntityComparisonOperator.IN)
				sql.append(formatSqlIN((List<?>) this.valueInRole));
			else
				sql.append(this.valueInRole);

			entityCondition = EntityCondition.makeConditionWhere(sql.toString());
		}

		if (this.joinInrole != null) {
			EntityCondition lastCondition = Lists.last(this.entityConditions);
			entityCondition = EntityCondition.makeCondition(lastCondition, this.joinInrole, entityCondition);
			this.entityConditions.remove(lastCondition);
		}

		this.entityConditions.add(entityCondition);
	}

	private String formatSqlIN(List<?> values) {
		StringBuffer sql = new StringBuffer();
		sql.append("(");
		int i = 0;
		for (Object value : values) {
			if (i > 0)
				sql.append(", ");
			sql.append(value.toString());
			i++;
		}
		sql.append(")");

		return sql.toString();
	}

	private void resetInRole() {
		this.slotInRole = null;
		this.operatorInRole = null;
		this.valueInRole = null;
		this.joinInrole = null;
	}
}