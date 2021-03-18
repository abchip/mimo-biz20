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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.abchip.mimo.biz.asf.plugins.entity.EntityUtils;
import org.abchip.mimo.biz.asf.plugins.entity.ModelUtils;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.parser.sqlite.SQLiteLexer;
import org.abchip.mimo.parser.sqlite.SQLiteParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.ofbiz.base.util.GeneralException;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.condition.EntityCondition;
import org.apache.ofbiz.entity.condition.EntityExpr;
import org.apache.ofbiz.entity.model.DynamicViewEntity;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelFieldType;
import org.apache.ofbiz.entity.model.ModelFieldTypeReader;
import org.apache.ofbiz.entity.model.ModelKeyMap;
import org.apache.ofbiz.entity.util.EntityQuery;

public class OFBizQueryBuilder<E extends EntityIdentifiable> {

	private Context context;
	private Frame<E> frame;
	private Delegator delegator;
	private ModelFieldTypeReader modelHelper;

	private DynamicViewEntity dynamicViewEntity = null;
	private Set<String> entityFields = new HashSet<String>();
	private List<EntityCondition> entityConditions = new ArrayList<EntityCondition>();
	private List<String> entityOrders = new ArrayList<String>();

	public OFBizQueryBuilder(Context context, Frame<E> frame, Delegator delegator, ModelFieldTypeReader modelHelper) {
		this.context = context;
		this.frame = frame;
		this.delegator = delegator;
		this.modelHelper = modelHelper;

		this.dynamicViewEntity = buildDynamicView(delegator);
	}

	public Context getContext() {
		return this.context;
	}

	public Frame<E> getFrame() {
		return this.frame;
	}

	public Delegator getDelegator() {
		return this.delegator;
	}

	private DynamicViewEntity getDynamicViewEntity() {
		return this.dynamicViewEntity;
	}

	public EntityQuery buildEntityQuery() {

		EntityQuery entityQuery = EntityQuery.use(delegator);

		entityQuery = entityQuery.select(this.entityFields);
		entityQuery = entityQuery.from(this.dynamicViewEntity);
		entityQuery = entityQuery.where(this.entityConditions);
		entityQuery = entityQuery.orderBy(this.entityOrders);

		return entityQuery;
	}

	protected void addField(Slot slot, String entityAlias) {

		String modelFieldId = ModelUtils.getModelFieldId(slot, entityAlias);
		this.entityFields.add(modelFieldId);
	}

	protected void addFields(List<Slot> slots) {
		for (Slot slot : slots)
			addField(slot, null);
	}

	protected void addFieldsExpr(String expression) {

		String sql = "SELECT " + expression;

		ANTLRInputStream input = new ANTLRInputStream(sql);
		SQLiteLexer SQLiteLexer = new SQLiteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(SQLiteLexer);
		SQLiteParser parser = new SQLiteParser(tokens);

		ParseTree tree = parser.select_stmt();
		ParseTreeWalker walker = new ParseTreeWalker();
		OFBizSelectBuilder<E> analyzer = new OFBizSelectBuilder<E>(this);
		walker.walk(analyzer, tree);
	}

	protected void addPrimaryKeyCondition(String id) throws GeneralException {

		List<Slot> keysSlot = this.getFrame().getAllKeySlots();
		String[] keyValues = id.split("/");
		int i = 0;
		for (String keyValue : keyValues) {
			Slot keySlot = keysSlot.get(i);

			ModelField pkField = ModelUtils.getModelField(delegator, this.getFrame().getName(), keySlot.getName());
			ModelFieldType type = modelHelper.getModelFieldType(pkField.getType());
			Object value = EntityUtils.toBizValue(type.getJavaType(), keySlot, keyValue);
			String modelFieldId = ModelUtils.getModelFieldId(keySlot, null);
			EntityExpr keyExpr = EntityCondition.makeCondition(modelFieldId, value);
			this.entityConditions.add(keyExpr);
			i++;
		}
	}

	protected void addCondition(EntityCondition condition) {
		this.entityConditions.add(condition);
	}

	protected void addConditionsExpr(String expression) {

		String sql = expression;

		ANTLRInputStream input = new ANTLRInputStream(sql);
		SQLiteLexer SQLiteLexer = new SQLiteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(SQLiteLexer);
		SQLiteParser parser = new SQLiteParser(tokens);

		ParseTree tree = parser.expr();
		ParseTreeWalker walker = new ParseTreeWalker();
		OFBizWhereBuilder<E> analyzer = new OFBizWhereBuilder<E>(this);
		walker.walk(analyzer, tree);
	}

	protected void addOrder(Slot slot, String entityAlias) {

		String modelFieldId = ModelUtils.getModelFieldId(slot, entityAlias);
		this.entityOrders.add(modelFieldId);
	}

	protected void addOrders(List<Slot> slots) {
		for (Slot slot : slots)
			addOrder(slot, null);
	}

	protected void addOrdersExpr(String expression) {

		String sql = expression;

		ANTLRInputStream input = new ANTLRInputStream(sql);
		SQLiteLexer SQLiteLexer = new SQLiteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(SQLiteLexer);
		SQLiteParser parser = new SQLiteParser(tokens);

		ParseTree tree = parser.ordering_term();
		ParseTreeWalker walker = new ParseTreeWalker();
		OFBizOrderBuilder<E> analyzer = new OFBizOrderBuilder<E>(this);
		walker.walk(analyzer, tree);
	}

	private DynamicViewEntity buildDynamicView(Delegator delegator) {

		DynamicViewEntity dynamicViewEntity = new DynamicViewEntity();
		dynamicViewEntity.addMemberEntity(this.getFrame().getName(), this.getFrame().getName());
		for (Slot slot : this.getFrame().getSlots()) {
			if (slot.getCardinality().isMultiple())
				continue;

			ModelField modelField = ModelUtils.getModelField(delegator, this.getFrame().getName(), slot.getName());
			String modelFieldId = ModelUtils.getModelFieldId(slot, null);
			dynamicViewEntity.addAlias(this.getFrame().getName(), modelFieldId, modelField.getName(), null, null, null, null);
		}

		addSuperEntity(delegator, dynamicViewEntity, frame);

		return dynamicViewEntity;
	}

	private void addSuperEntity(Delegator delegator, DynamicViewEntity dynamicViewEntity, Frame<?> frame) {

		Frame<?> ako = frame.getAko();
		if (ako == null || ako.getAllKeys().isEmpty())
			return;

		dynamicViewEntity.addMemberEntity(ako.getName(), ako.getName());

		for (Slot slot : ako.getSlots()) {
			if (slot.getCardinality().isMultiple())
				continue;

			ModelField modelField = ModelUtils.getModelField(delegator, this.getFrame().getName(), slot.getName());
			String modelFieldId = ModelUtils.getModelFieldId(slot, null);
			dynamicViewEntity.addAlias(ako.getName(), modelFieldId, modelField.getName(), null, null, null, null);
		}

		String keyFrom = ModelUtils.getModelFieldId(frame.getAllKeySlots().get(0));
		String keyTo = ModelUtils.getModelFieldId(ako.getAllKeySlots().get(0));
		dynamicViewEntity.addViewLink(frame.getName(), ako.getName(), Boolean.TRUE, ModelKeyMap.makeKeyMapList(keyFrom, keyTo));

		addSuperEntity(delegator, dynamicViewEntity, ako);
	}

	protected void addLeftJoin(Slot slot, String entityAlias) {
		DynamicViewEntity dynamicViewEntity = this.getDynamicViewEntity();

		String entityName = slot.getDomain().getFrame();
		dynamicViewEntity.addMemberEntity(entityAlias, entityName);

		Frame<?> domainFrame = this.getContext().getFrame(entityName);
		for (Slot domainSlot : domainFrame.getAllSlots()) {
			if (domainSlot.getCardinality().isMultiple())
				continue;

			ModelField modelField = ModelUtils.getModelField(delegator, domainFrame.getName(), domainSlot.getName());
			String modelFieldId = ModelUtils.getModelFieldId(domainSlot, entityAlias);
			dynamicViewEntity.addAlias(entityAlias, modelFieldId, modelField.getName(), null, null, null, null);
		}

		Frame<?> frameFrom = slot.getFrame();
		String keyFrom = ModelUtils.getModelFieldId(slot);
		String keyTo = ModelUtils.getModelFieldId(domainFrame.getAllKeySlots().get(0));

		dynamicViewEntity.addViewLink(frameFrom.getName(), entityAlias, Boolean.TRUE, ModelKeyMap.makeKeyMapList(keyFrom, keyTo));
	}
}