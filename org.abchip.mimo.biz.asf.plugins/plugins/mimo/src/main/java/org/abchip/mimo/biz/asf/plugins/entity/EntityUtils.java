/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.data.DataType;
import org.abchip.mimo.data.EnumDef;
import org.abchip.mimo.entity.Domain;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.apache.ofbiz.base.util.GeneralException;
import org.apache.ofbiz.base.util.ObjectType;
import org.apache.ofbiz.base.util.UtilValidate;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelFieldType;
import org.apache.ofbiz.entity.model.ModelFieldTypeReader;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EntityUtils {

	public static Slot getSlot(Frame<?> frame, String field) {

		Slot slot = frame.getSlot(field);
		if (slot == null && field.endsWith("Id")) {
			slot = frame.getSlot(field.substring(0, field.length() - 2));
			if (slot != null && slot.getDomain() == null)
				slot = null;
		}

		return slot;
	}

	// from entity -> ofbiz
	public static GenericValue toBizEntity(Delegator delegator, EntityIdentifiable entity) throws GeneralException {
		return toBizEntity(delegator, entity.isa(), entity);
	}

	public static <E extends EntityIdentifiable> GenericValue toBizEntity(Delegator delegator, Frame<E> frame, E entity) throws GeneralException {

		GenericValue genericValue = delegator.makeValue(frame.getName());

		ModelFieldTypeReader modelHelper = delegator.getModelFieldTypeReader(genericValue.getModelEntity());

		Iterator<ModelField> fieldIterator = genericValue.getModelEntity().getFieldsIterator();
		while (fieldIterator.hasNext()) {
			ModelField field = fieldIterator.next();
			Slot slot = getSlot(frame, field.getName());
			if (slot == null)
				continue;

			Object value = entity.eGet(slot, false, false);
			if (UtilValidate.isEmpty(value))
				continue;

			ModelFieldType type = modelHelper.getModelFieldType(field.getType());
			value = toBizValue(type.getJavaType(), slot, value);
			genericValue.set(field.getName(), value);
		}

		return genericValue;
	}

	// from entity -> ofbiz
	public static Object toBizValue(String javaType, Slot slot, Object value) throws GeneralException {
		if (slot.getCardinality().isMultiple()) {
			List<Object> bizValues = new ArrayList<Object>();
			if (value instanceof Collection<?>) {
				Collection<?> values = (Collection<?>) value;
				for (Object object : values)
					bizValues.add(toSingleBizValue(javaType, object));
			} else
				bizValues.add(toSingleBizValue(javaType, value));
			return bizValues;
		} else
			return toSingleBizValue(javaType, value);
	}

	private static Object toSingleBizValue(String javaType, Object value) throws GeneralException {

		if (value instanceof Boolean && String.class.getSimpleName().equals(javaType)) {
			if (value == Boolean.TRUE)
				return "Y";
			else
				return "N";
		} else if (value instanceof Enumerator && String.class.getSimpleName().equals(javaType)) {
			return ((Enumerator) value).getLiteral();
		} else
			return ObjectType.simpleTypeConvert(value, javaType, null, null);
	}

	// from ofbiz -> entity
	public static <E extends EntityIdentifiable> void completeEntity(Context context, E entity, GenericValue genericValue) throws GeneralException {

		for (Entry<String, Object> entry : genericValue.getAllFields().entrySet()) {

			Object value = entry.getValue();
			if (UtilValidate.isEmpty(value))
				continue;

			setEntitySlotValue(context, entity, entry.getKey(), value);
		}
	}

	private static void setEntitySlotValue(Context context, Entity entity, String slotExpr, Object value) throws GeneralException {

		Frame<?> frameInRole = entity.isa();
		Entity entityInRole = entity;
		Slot slotInRole = null;

		String[] tokens = slotExpr.split("\\.");
		switch (tokens.length) {
		case 0:
			break;
		case 1:
			slotInRole = getSlot(frameInRole, slotExpr);
			break;
		default:
			int i = 0;
			for (String token : tokens) {
				i++;
				if (Character.isUpperCase(token.charAt(0))) {
					frameInRole = entityInRole.isa();
					continue;
				}

				slotInRole = getSlot(frameInRole, token);
				if (slotInRole == null)
					break;

				// shift entity
				if (tokens.length > i) {
					Domain domain = slotInRole.getDomain();
					if (domain == null) {
						slotInRole = null;
						break;
					}
					frameInRole = context.getFrame(domain.getFrame());
					if (frameInRole == null) {
						slotInRole = null;
						break;
					}
					if (!entityInRole.eIsSet(slotInRole)) {
						Entity entitySlotValue = context.make(frameInRole);
						entityInRole.eSet(slotInRole, entitySlotValue);
						entityInRole = entitySlotValue;
					}
					else
						entityInRole = (Entity) entityInRole.eGet(slotInRole, false, false);
				}
			}
			break;
		}

		if (slotInRole == null)
			return;

		value = toEntityValue(slotInRole, value);
		if (value != null) {
			if (entityInRole.eIsSet(slotInRole)) {
				Object slotValue = entityInRole.eGet(slotInRole, false, false);
				if (slotValue instanceof EntityIdentifiable) {
					EntityIdentifiable entitySlotValue = (EntityIdentifiable) slotValue;
					entitySlotValue.eSetID(value.toString());
				} else
					return;
			} else
				entityInRole.eSet(slotInRole, value);
		} else
			entityInRole.eUnset(slotInRole);
	}

	// from ofbiz -> entity
	public static Object toEntityValue(Slot slot, Object bizValue) throws GeneralException {

		if (slot.getCardinality().isMultiple()) {
			List<Object> values = new ArrayList<Object>();
			if (bizValue instanceof Collection<?>) {
				Collection<?> bizValues = (Collection<?>) bizValue;
				for (Object object : bizValues)
					values.add(toSingleEntityValue(slot, object));
			} else
				values.add(toSingleEntityValue(slot, bizValue));
			return values;
		} else
			return toSingleEntityValue(slot, bizValue);
	}

	private static Object toSingleEntityValue(Slot slot, Object bizValue) throws GeneralException {

		if (bizValue instanceof String && slot.getDataType().equals(DataType.BOOLEAN)) {
			if (bizValue.toString().equalsIgnoreCase("Y"))
				return true;
			else
				return false;

		} else if (bizValue instanceof String && slot.getDataType().equals(DataType.ENUM)) {
			EnumDef<?> enumDef = (EnumDef<?>) slot.getDataDef();
			return EcoreUtil.createFromString(enumDef.getEnum(), bizValue.toString());
		} else
			return ObjectType.simpleTypeConvert(bizValue, slot.getDataDef().getJavaClass().getName(), null, null);
	}
}