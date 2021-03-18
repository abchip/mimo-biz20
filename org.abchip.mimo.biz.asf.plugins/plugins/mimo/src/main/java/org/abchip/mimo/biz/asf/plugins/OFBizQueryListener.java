/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.io.Closeable;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.parser.sqlite.SQLiteBaseListener;
import org.abchip.mimo.parser.sqlite.SQLiteLexer;
import org.abchip.mimo.parser.sqlite.SQLiteParser.Column_nameContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.osgi.service.log.Logger;

public abstract class OFBizQueryListener<E extends EntityIdentifiable> extends SQLiteBaseListener implements Closeable {

	private OFBizQueryBuilder<E> queryBuilder;
	private Slot lastSlot;
	private boolean arrow = false;

	public OFBizQueryListener(OFBizQueryBuilder<E> queryBuilder) {
		this.queryBuilder = queryBuilder;
	}

	protected abstract Logger getLogger();

	protected OFBizQueryBuilder<E> getQueryBuilder() {
		return this.queryBuilder;
	}

	@Override
	public void visitTerminal(TerminalNode node) {

		Token token = node.getSymbol();

		switch (token.getType()) {
		case SQLiteLexer.ARROW:
			this.arrow = true;
			return;
		}
	}

	@Override
	public void exitColumn_name(Column_nameContext ctx) {

		this.arrow = false;
	}

	protected void joinColumnSelect(String column) {

		SlotInRole slotInRole = getSlotInRole(column);
		if (slotInRole == null) {
			lastSlot = null;
			getLogger().warn("Slot {} not found", this.getQueryBuilder().getFrame().getName() + "/" + column);
			return;
		}

		if (slotInRole.slot.getCardinality().isMultiple()) {
			lastSlot = null;
			getLogger().warn("Slot {} with multiple cardinality", this.getQueryBuilder().getFrame() + "/" + slotInRole.slot.getName());
			return;
		}

		if (slotInRole.entityAlias != null)
			this.getQueryBuilder().addLeftJoin(lastSlot, slotInRole.entityAlias);

		lastSlot = slotInRole.slot;
		this.getQueryBuilder().addField(lastSlot, slotInRole.entityAlias);
	}

	protected void joinColumnWhere(String column) {

		SlotInRole slotInRole = getSlotInRole(column);
		if (slotInRole == null) {
			lastSlot = null;
			getLogger().warn("Slot {} not found", this.getQueryBuilder().getFrame().getName() + "/" + column);
			return;
		}

		if (slotInRole.slot.getCardinality().isMultiple()) {
			lastSlot = null;
			getLogger().warn("Slot {} with multiple cardinality", this.getQueryBuilder().getFrame() + "/" + slotInRole.slot.getName());
			return;
		}

		lastSlot = slotInRole.slot;
		this.getQueryBuilder().addOrder(lastSlot, slotInRole.entityAlias);

	}

	protected void joinColumnOrder(String column) {

		SlotInRole slotInRole = getSlotInRole(column);
		if (slotInRole == null) {
			lastSlot = null;
			getLogger().warn("Slot {} not found", this.getQueryBuilder().getFrame().getName() + "/" + column);
			return;
		}

		if (slotInRole.slot.getCardinality().isMultiple()) {
			lastSlot = null;
			getLogger().warn("Slot {} with multiple cardinality", this.getQueryBuilder().getFrame() + "/" + slotInRole.slot.getName());
			return;
		}

		if (slotInRole.entityAlias != null)
			this.getQueryBuilder().addLeftJoin(lastSlot, slotInRole.entityAlias);

		lastSlot = slotInRole.slot;
		this.getQueryBuilder().addOrder(lastSlot, slotInRole.entityAlias);
	}

	private SlotInRole getSlotInRole(String column) {

		SlotInRole slotInRole = null;
		if (arrow) {
			if (lastSlot == null)
				return null;

			Domain domain = lastSlot.getDomain();
			if (domain == null)
				return null;

			Context context = this.getQueryBuilder().getContext();
			if (context == null)
				return null;

			Frame<?> domainFrame = context.getFrame(domain.getFrame());
			if (domainFrame == null)
				return null;

			Slot slot = domainFrame.getSlot(column);
			if (slot == null)
				return null;

			slotInRole = new SlotInRole(lastSlot.getName(), slot);
		} else {
			Frame<?> frame = this.getQueryBuilder().getFrame();
			Slot slot = frame.getSlot(column);
			if (slot == null)
				return null;

			slotInRole = new SlotInRole(null, slot);
		}

		return slotInRole;
	}

	private class SlotInRole {

		String entityAlias = null;
		Slot slot = null;

		protected SlotInRole(String entityAlias, Slot slot) {
			this.entityAlias = entityAlias;
			this.slot = slot;
		}
	}
}