/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins;

import java.util.Map;

import org.abchip.mimo.biz.asf.plugins.entity.ModelUtils;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.parser.sqlite.SQLiteLexer;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelRelation;
import org.osgi.service.log.Logger;

public class OFBizWhereAnalyzer extends OFBizAbstractAnalyzer {

	private static final Logger LOGGER = Logs.getLogger(OFBizWhereAnalyzer.class);

	public OFBizWhereAnalyzer(Delegator delegator, Frame<?> frame) {
		super(delegator, frame);
	}

	@Override
	public Logger getLogger() {
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
			ModelField modelField = ModelUtils.getModelField(delegator, frame.getName(), text);
			if (modelField != null)
				// text = frame.trim() + "." + modelField.getColName();
				text = modelField.getModelEntity().getEntityName() + "." + modelField.getColName();
			else {
				ModelRelation modelRelation = ModelUtils.getModelRelation(delegator, frame.getName(), token.getText());
				if (modelRelation != null)
					modelRelation.toString();
				// TODO
				// text = modelRelation.get
				else {
					Map<String, String> manyMap = ModelUtils.getManyRelationFromField(delegator, frame.getName(), token.getText());
					if (manyMap != null) {
						text = manyMap.get("Field");
						entities.add(manyMap.get("Entity"));
					} else {
						getLogger().warn("Slot {} not found", frame + "/" + text);
					}
				}
			}
			break;
		case SQLiteLexer.STRING_LITERAL:

			if (!result.toString().isEmpty()) {
				text = Strings.removeFirstChar(text);
				text = Strings.removeLastChar(text);
				text = text.replaceAll("\\\"", "\"");
				text = "'" + text + "'";
			}

			break;
		}

		if (result.length() != 0)
			result.append(" ");

		result.append(text);
	}
}