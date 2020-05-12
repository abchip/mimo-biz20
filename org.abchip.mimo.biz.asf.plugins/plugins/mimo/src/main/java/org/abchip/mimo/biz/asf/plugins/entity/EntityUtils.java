/**
 *  Copyright (c) 2017, 2020 ABChip and others.
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

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.apache.ofbiz.base.util.GeneralException;
import org.apache.ofbiz.base.util.ObjectType;
import org.apache.ofbiz.base.util.UtilValidate;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.model.ModelEntity;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelFieldType;
import org.apache.ofbiz.entity.model.ModelFieldTypeReader;

public class EntityUtils {

	// from entity -> ofbiz
	public static GenericValue toBizEntity(Delegator delegator, EntityIdentifiable entity) throws GeneralException {
		return toBizEntity(delegator, entity.isa(), entity);
	}

	public static <E extends EntityIdentifiable> GenericValue toBizEntity(Delegator delegator, Frame<E> frame, E entity) throws GeneralException {

		ModelEntity modelEntity = delegator.getModelEntity(frame.getName());
		ModelFieldTypeReader modelHelper = delegator.getModelFieldTypeReader(modelEntity);
		
		GenericValue genericValue = GenericValue.create(modelEntity);

		Iterator<ModelField> fieldIterator = genericValue.getModelEntity().getFieldsIterator();
		while (fieldIterator.hasNext()) {
			ModelField field = fieldIterator.next();

			Object value = frame.getValue(entity, field.getName(), false, false);
			if (UtilValidate.isEmpty(value))
				continue;
			

			ModelFieldType type = modelHelper.getModelFieldType(field.getType());
			value = toBizValue(type.getJavaType(), frame.getSlot(field.getName()), value);
			genericValue.set(field.getName(), value);
		}

		return genericValue;
	}

	// from ofbiz -> entity
	public static <E extends EntityIdentifiable> void completeEntity(E entity, GenericValue genericValue) {

		Frame<E> frame = entity.isa();
		for (Entry<String, Object> entry : genericValue.getAllFields().entrySet()) {

			Object value = entry.getValue();
			if (UtilValidate.isEmpty(value))
				continue;

			Slot slot = frame.getSlot(entry.getKey());
			if (slot == null)
				continue;

			value = toValue(slot, value);

			frame.setValue(entity, slot.getName(), value);
		}
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
		if (value instanceof EntityIdentifiable)
			"".toString();

		if (value instanceof Boolean && String.class.getSimpleName().equals(javaType))
			"".toString();

		return ObjectType.simpleTypeConvert(value, javaType, null, null);
	}

	// from ofbiz -> entity
	public static Object toValue(Slot slot, Object bizValue) {

		if (slot.getCardinality().isMultiple()) {
			List<Object> values = new ArrayList<Object>();
			if (bizValue instanceof Collection<?>) {
				Collection<?> bizValues = (Collection<?>) bizValue;
				for (Object object : bizValues)
					values.add(toSingleValue(slot, object));
			} else
				values.add(toSingleValue(slot, bizValue));
			return values;
		} else
			return toSingleValue(slot, bizValue);
	}

	private static Object toSingleValue(Slot slot, Object bizValue) {

		Object value = bizValue;

		switch (slot.getDataType()) {
		case BINARY:
			break;
		case BOOLEAN:
			if (bizValue.toString().equals("Y"))
				value = Boolean.TRUE;
			else if (bizValue.toString().equals("N"))
				value = Boolean.FALSE;
			else if (bizValue.toString().trim().isEmpty())
				value = null;
			break;
		case DATE_TIME:
			break;
		case ENTITY:
			break;
		case ENUM:
			break;
		case IDENTITY:
			break;
		case NUMERIC:
			break;
		case STRING:
			break;
		}

		return value;
	}
}