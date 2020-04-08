/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.plugins.entity.ModelUtils;
import org.abchip.mimo.parser.sqlite.SQLiteBaseListener;
import org.abchip.mimo.parser.sqlite.SQLiteLexer;
import org.abchip.mimo.util.Logs;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelRelation;
import org.osgi.service.log.Logger;

public class OFBizFilterAnalyzer extends SQLiteBaseListener {

	private static final Logger LOGGER = Logs.getLogger(OFBizFilterAnalyzer.class);
	
	private Delegator delegator = null;
	private String frame = null;
	private StringBuffer result = null;
	private List<String> entities = null;

	public OFBizFilterAnalyzer(Delegator delegator, String frame) {
		super();
		this.delegator = delegator;
		this.frame = frame;

		result = new StringBuffer();
		entities = new ArrayList<String>();
	}

	public String getStringFilter() {
		return result.toString();
	}

	public List<String> getListEntities() {
		return entities;
	}

	@Override
	public void visitTerminal(TerminalNode node) {

		Token token = node.getSymbol();
		String text = token.getText();

		switch (token.getType()) {
		case SQLiteLexer.IDENTIFIER:
			ModelField modelField = ModelUtils.getModelField(delegator, frame, token.getText());
			if (modelField != null)
				text = frame.trim() + "." + modelField.getColName();
			else {
				ModelRelation modelRelation = ModelUtils.getModelRelation(delegator, frame, token.getText());
				if (modelRelation != null)
					modelRelation.toString();
				// TODO
				// text = modelRelation.get
				else {
					Map<String, String> manyMap = ModelUtils.getManyRelationFromField(delegator, frame, token.getText());
					if (manyMap != null) {
						text = manyMap.get("Field");
						entities.add(manyMap.get("Entity"));
					} else {
						LOGGER.warn("Slot {} not found", frame + "/" + text);
					}
				}
			}
			break;
		case SQLiteLexer.STRING_LITERAL:
			if (!result.toString().isEmpty()) {
				text = removeFirstChar(token.getText());
				text = removeLastChar(text);
				text = text.replaceAll("\\\"", "\"");
				text = "'" + text + "'";
			}
		}

		if (text != null) {
			result.append(text);
			result.append(" ");
		}
	}

	public String removeFirstChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(1);
	}

	public String removeLastChar(String str) {
		if (str.length() == 0)
			return str;
		if (str.length() == 1)
			return "";

		return str.substring(0, str.length() - 1);
	}
}