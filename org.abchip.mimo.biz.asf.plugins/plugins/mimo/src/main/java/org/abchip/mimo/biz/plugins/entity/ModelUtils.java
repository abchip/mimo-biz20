/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.ofbiz.base.util.UtilValidate;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.model.ModelEntity;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelKeyMap;
import org.apache.ofbiz.entity.model.ModelReader;
import org.apache.ofbiz.entity.model.ModelRelation;
import org.apache.ofbiz.entity.model.ModelUtil;
import org.apache.ofbiz.entity.model.ModelViewEntity;

public class ModelUtils {

	public static final String OFBIZ_PACKAGE = "org.apache.ofbiz";

	public static Set<String> findPackages(ModelReader modelReader, String packagePrefix) throws GenericEntityException {
		Set<String> packageNames = new TreeSet<String>();

		for (String entityName : modelReader.getEntityNames()) {
			ModelEntity modelEntity = modelReader.getModelEntityNoCheck(entityName);
			if (modelEntity == null)
				continue;

			if (modelEntity instanceof ModelViewEntity)
				continue;

			String packageName = modelEntity.getPackageName();
			if (packagePrefix != null && !packageName.startsWith(packagePrefix))
				continue;

			if (!packageName.startsWith(OFBIZ_PACKAGE))
				continue;

			packageNames.add(packageName);
		}

		return packageNames;
	}

	public static Set<String> findEntityNames(ModelReader modelReader, String packageName) throws GenericEntityException {

		Set<String> entityNames = new TreeSet<String>();
		for (String entityName : modelReader.getEntityNames()) {
			ModelEntity modelEntity = modelReader.getModelEntityNoCheck(entityName);
			if (modelEntity == null)
				"".toString();

			if (modelEntity instanceof ModelViewEntity)
				continue;

			if (packageName != null && !modelEntity.getPackageName().equals(packageName))
				continue;

			if (!modelEntity.getPackageName().startsWith(OFBIZ_PACKAGE))
				continue;

			entityNames.add(modelEntity.getEntityName());
		}

		return entityNames;
	}

	public static String getSuperEntity(Delegator delegator, String entityName) {

		ModelReader modelReader = delegator.getModelReader();

		ModelEntity modelEntity = modelReader.getModelEntityNoCheck(entityName);
		if (modelEntity == null)
			return null;

		// cache
		if (modelEntity.getDependentOn() != null && !modelEntity.getDependentOn().isEmpty())
			return modelEntity.getDependentOn();

		// one pk
		if (modelEntity.getPkFieldNames().size() > 1)
			return null;

		String superEntity = null;

		for (ModelRelation modelRelation : modelEntity.getRelationsList(true, true, false)) {

			// no automatic relation
			if (modelRelation.isAutoRelation()) {
				continue;
			}

			// first field = pk
			ModelKeyMap modelKeyMap = modelRelation.getKeyMaps().get(0);
			if (!modelKeyMap.getFieldName().equals(modelEntity.getFirstPkFieldName()))
				continue;

			// one field map
			if (modelRelation.getKeyMaps().size() > 1) {				
				System.out.println("HISTORY: "+ modelRelation.getRelEntityName() + " -> " + entityName);
				continue;			
			}

			superEntity = modelRelation.getRelEntityName();
			break;
		}

		if (superEntity == null)
			return null;

		if (superEntity.equals(entityName))
			return null;

		// super entity found
		ModelEntity entityType = null;
		try {
			entityType = modelReader.getModelEntityNoCheck(superEntity + "Type");

			// TODO who is? interfaces?
			if (entityType == null) {
				System.out.println("INTERFACE: "+superEntity + " -> " + entityName);
				return null;
			}

			String pkField = null;
			String pkValue = null;
			if (entityType.getEntityName().equalsIgnoreCase("ShipmentGatewayConfigType")) {
				pkField = "shipmentGatewayConfTypeId";
				pkValue = ModelUtil.javaNameToDbName(entityName.replaceAll("Shipment", "Ship"));
			} else {
				pkField = entityType.getFirstPkFieldName();
				// pkField = ModelUtil.lowerFirstChar(entityType.getEntityName()) + "Id";
				pkValue = ModelUtil.javaNameToDbName(entityName);
			}

			GenericValue genericValue = delegator.findOne(entityType.getEntityName(), true, pkField, pkValue);
			if (genericValue == null) {
				System.out.println("SUPER: "+entityType.getEntityName() + " -> " + entityName);
				return null;
			}

			if (entityType.isField("hasTable")) {
				Object hasTable = genericValue.get("hasTable");
				if (!hasTable.toString().equalsIgnoreCase("Y"))
					return null;
			} else
				"".toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		if (superEntity != null)
			// set on cache
			if (modelEntity.getDependentOn() == null || modelEntity.getDependentOn().isEmpty())
				modelEntity.setDependentOn(superEntity);

		return superEntity;
	}

	public static ModelField getModelField(Delegator delegator, String frame, String slot) {

		ModelReader modelReader = delegator.getModelReader();
		ModelField modelField = null;

		String superFrame = frame;
		ModelEntity modelEntity = modelReader.getModelEntityNoCheck(frame);
		while (modelEntity != null) {
			modelField = modelEntity.getField(slot);
			if (modelField != null)
				break;

			superFrame = ModelUtils.getSuperEntity(delegator, superFrame);
			if (superFrame != null)
				modelEntity = modelReader.getModelEntityNoCheck(superFrame);
			else
				modelEntity = null;
		}

		return modelField;
	}

	public static ModelRelation getModelRelation(Delegator delegator, String frame, String slot) {

		ModelReader modelReader = delegator.getModelReader();
		ModelRelation modelRelation = null;

		String superFrame = frame;
		ModelEntity modelEntity = modelReader.getModelEntityNoCheck(frame);
		while (modelEntity != null) {
			modelRelation = modelEntity.getRelation(slot);
			if (modelRelation != null)
				break;

			superFrame = ModelUtils.getSuperEntity(delegator, superFrame);
			if (superFrame == null)
				break;

			modelEntity = modelReader.getModelEntityNoCheck(superFrame);
		}

		return modelRelation;
	}

	public static Map<String, String> getManyRelationFromField(Delegator delegator, String frame, String slot) {
		String field = slot;
		Map<String, String> manyMap = new HashMap<String, String>();
		field = singularization(field);
		field = ModelUtil.upperFirstChar(field);

		ModelReader modelReader = delegator.getModelReader();
		ModelEntity modelEntity = modelReader.getModelEntityNoCheck(frame);
		if (modelEntity == null)
			return null;

		for (ModelRelation modelRelation : modelEntity.getRelationsList(true, true, true)) {
			// many relation
			if (!modelRelation.getType().equals("many"))
				continue;

			// one field map
			if (modelRelation.getKeyMaps().size() > 1)
				continue;

			ModelKeyMap modelKeyMap = modelRelation.getKeyMaps().get(0);

			ModelEntity modelRel = modelReader.getModelEntityNoCheck(modelRelation.getRelEntityName());
			if (modelRel == null)
				continue;

			if (modelRel instanceof ModelViewEntity)
				continue;

			// only pk to pk
			if (!modelKeyMap.getRelFieldName().equals(modelRel.getFirstPkFieldName()))
				continue;

			if (modelRel.getPksSize() > 2)
				continue;

			ModelField modelFieldRel = modelRel.getField(modelKeyMap.getRelFieldName());
			if (modelFieldRel == null)
				continue;

			// name
			String eTypedName = modelRelation.getCombinedName();
			if (eTypedName.equals(field)) {
				manyMap.put("Entity", eTypedName);
				ModelField modelField = getModelField(delegator, eTypedName, modelRel.getPkFieldNames().get(1));
				manyMap.put("Field", modelField.getColName());
				break;
			}
		}

		String relationEntity = ModelUtils.getSuperEntity(delegator, frame);
		if (relationEntity != null && UtilValidate.isEmpty(manyMap)) {
			manyMap = getManyRelationFromField(delegator, relationEntity, field);
		}

		return manyMap;
	}

	public static String toDatabaseFkName(String[] names) {

		StringBuffer sb = new StringBuffer();

		for (String name : names) {
			StringBuffer sbName = new StringBuffer();
			for (char c : name.toCharArray()) {

				if (isVowel(c))
					continue;

				sbName.append(Character.toUpperCase(c));
			}

			if (sb.length() != 0)
				sb.append("_");

			sb.append(sbName);
		}

		return sb.toString();
	}

	public static String pluralization(String word) {
		if (word.endsWith("y"))
			word = word.substring(0, word.length() - 1) + "ies";
		else if (word.endsWith("ss"))
			word = word.substring(0, word.length()) + "es";
		else
			word = word.substring(0, word.length()) + "s";

		return word;
	}

	public static String singularization(String word) {
		if (word.endsWith("ies"))
			word = word.substring(0, word.length() - 3) + "y";
		else if (word.endsWith("sses"))
			word = word.substring(0, word.length() - 2);
		else if (word.endsWith("s"))
			word = word.substring(0, word.length() - 1);

		return word;
	}

	public static boolean isVowel(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}
}