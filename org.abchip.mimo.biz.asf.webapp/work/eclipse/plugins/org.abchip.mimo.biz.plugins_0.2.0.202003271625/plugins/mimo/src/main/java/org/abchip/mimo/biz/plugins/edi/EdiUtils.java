/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.edi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.abchip.mimo.biz.plugins.edi.EdiServices.Services;
import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.entity.EntityCondition;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.apache.ofbiz.base.util.UtilValidate;
import org.apache.ofbiz.base.util.UtilXml;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.eca.EntityEcaHandler;
import org.apache.ofbiz.entityext.eca.EntityEcaAction;
import org.apache.ofbiz.entityext.eca.EntityEcaRule;
import org.apache.ofbiz.entityext.eca.EntityEcaUtil;
import org.apache.ofbiz.service.ServiceUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EdiUtils {

	private static final String MODE = "async";
	private static final String EVENT = EntityEcaHandler.EV_RETURN;

	public static String getEcaCache(Delegator delegator) {
		if (delegator.getDelegatorTenantId() != null)
			return "main-" + delegator.getDelegatorTenantId();
		else
			return "main";
	}

	public static Map<String, Object> addEdiEca(Delegator delegator, EdiFrameSetup setup) {

		List<EntityEcaRule> eventRules = getEventRules(delegator, setup.getFrame(), true);
		for (EntityEcaRule rule : createEntityEcaRuleList(setup)) {
			if (eventRules.contains(rule))
				continue;

			eventRules.add(rule);
		}

		return ServiceUtil.returnSuccess();
	}

	public static Map<String, Object> removeEdiEca(Delegator delegator, String frame) {

		List<EntityEcaRule> eventRules = getEventRules(delegator, frame, false);
		if (UtilValidate.isEmpty(eventRules))
			return ServiceUtil.returnSuccess();

		List<EntityEcaRule> removeRules = new ArrayList<EntityEcaRule>();
		for (EntityEcaRule rule : eventRules) {
			for (Object actionOrSet : rule.getActionsAndSets()) {
				if (actionOrSet instanceof EntityEcaAction) {
					EntityEcaAction ea = (EntityEcaAction) actionOrSet;
					if (ea.getServiceName().equals(Services.createEdiEntity.name()) 
							|| ea.getServiceName().equals(Services.updateEdiEntity.name())
							|| ea.getServiceName().equals(Services.deleteEdiEntity.name())) {
						// rule.getActionsAndSets().remove(ea);
						removeRules.add(rule);
						break;
					}
				}
			}
		}

		eventRules.removeAll(removeRules);

		return ServiceUtil.returnSuccess();
	}

	private static List<EntityEcaRule> getEventRules(Delegator delegator, String frame, boolean create) {

		Map<String, Map<String, List<EntityEcaRule>>> ecaCache = EntityEcaUtil.getEntityEcaCache(EdiUtils.getEcaCache(delegator));
		Map<String, List<EntityEcaRule>> entityRules = ecaCache.get(frame);
		if (UtilValidate.isEmpty(entityRules)) {
			if (!create)
				return null;

			entityRules = new HashMap<String, List<EntityEcaRule>>();
			ecaCache.put(frame, entityRules);
		}

		List<EntityEcaRule> eventRules = entityRules.get(EVENT);
		if (UtilValidate.isEmpty(eventRules)) {
			if (!create)
				return null;

			eventRules = new ArrayList<EntityEcaRule>();
			entityRules.put(EVENT, eventRules);
		}

		return eventRules;
	}

	private static List<EntityEcaRule> createEntityEcaRuleList(EdiFrameSetup setup) {

		EntityCondition entityCondition = setup.getEntityCondition();
		if (entityCondition == null)
			entityCondition = EntityCondition.ALL;

		EntityEvent entityEvent = setup.getEntityEvent();
		if (entityEvent == null)
			entityEvent = EntityEvent.ALL;

		ArrayList<String> operations = null;

		switch (entityCondition) {
		case ALL:
			break;
		case SELECTED:
			break;
		case SCRIPT:
			break;
		}

		switch (entityEvent) {
		case ALL:
			operations = new ArrayList<String>(Arrays.asList(EntityEcaHandler.OP_CREATE, EntityEcaHandler.OP_STORE, EntityEcaHandler.OP_REMOVE));
			break;
		case CREATE:
			operations = new ArrayList<String>(Arrays.asList(EntityEcaHandler.OP_CREATE));
			break;
		case UPDATE:
			operations = new ArrayList<String>(Arrays.asList(EntityEcaHandler.OP_STORE));
			break;
		case DELETE:
			operations = new ArrayList<String>(Arrays.asList(EntityEcaHandler.OP_REMOVE));
			break;
		}

		Document document = UtilXml.makeEmptyXmlDocument("EdiEcaTemp");
		Element ecaTemp = document.getDocumentElement();
		List<EntityEcaRule> ecaRuleList = new ArrayList<EntityEcaRule>();

		for (String operation : operations) {
			Element eca = UtilXml.addChildElement(ecaTemp, "eca", document);

			eca.setAttribute("entity", setup.getFrame());
			eca.setAttribute("operation", operation);
			eca.setAttribute("event", EVENT);

			Element action = UtilXml.addChildElement(eca, "action", document);
			
			if(operation.equals(EntityEcaHandler.OP_CREATE))
				action.setAttribute("service", Services.createEdiEntity.name());
			else if(operation.equals(EntityEcaHandler.OP_STORE))
				action.setAttribute("service", Services.updateEdiEntity.name());
			else if(operation.equals(EntityEcaHandler.OP_REMOVE))
				action.setAttribute("service", Services.deleteEdiEntity.name());
			
			action.setAttribute("mode", MODE);
			action.setAttribute("value-attr", "entityInstance");

			EntityEcaRule entityEcaRule = new EntityEcaRule(eca);
			ecaRuleList.add(entityEcaRule);
		}

		return ecaRuleList;
	}
}