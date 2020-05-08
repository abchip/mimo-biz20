/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.abchip.mimo.biz.asf.plugins.OFBizConstants;
import org.abchip.mimo.data.DatetimeDef;
import org.abchip.mimo.data.NumericDef;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.apache.ofbiz.base.util.UtilValidate;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericValue;
import org.apache.ofbiz.entity.model.ModelField;
import org.eclipse.emf.common.util.Enumerator;

public class EntityUtils {

	// from entity -> ofbiz
	public static GenericValue toBizEntity(Delegator delegator, EntityIdentifiable entity) {
		return toBizEntity(delegator, entity.isa(), entity);
	}

	public static <E extends EntityIdentifiable> GenericValue toBizEntity(Delegator delegator, Frame<E> frame, E entity) {

		GenericValue genericValue = delegator.makeValue(frame.getName());

		Iterator<ModelField> fieldIterator = genericValue.getModelEntity().getFieldsIterator();
		while (fieldIterator.hasNext()) {
			ModelField field = fieldIterator.next();

			Object value = frame.getValue(entity, field.getName(), false, false);
			if (UtilValidate.isEmpty(value))
				continue;

			value = toBizValue(delegator, frame.getSlot(field.getName()), value);
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
	public static Object toBizValue(Delegator delegator, Slot slot, Object value) {
		if (slot.getCardinality().isMultiple()) {
			List<Object> bizValues = new ArrayList<Object>();
			if (value instanceof Collection<?>) {
				Collection<?> values = (Collection<?>) value;
				for (Object object : values)
					bizValues.add(toSingleBizValue(delegator, slot, object));
			} else
				bizValues.add(toSingleBizValue(delegator, slot, value));
			return bizValues;
		} else
			return toSingleBizValue(delegator, slot, value);
	}

	public static Object toSingleBizValue(Delegator delegator, Slot slot, Object value) {

		Object bizValue = null;
		if (value == null) {
			switch (slot.getDataType()) {
			case BINARY:
				break;
			case BOOLEAN:
				break;
			case DATE_TIME:
				if (slot.getName().equals("fromDate")) {
					DateFormat dateFormat = new SimpleDateFormat(OFBizConstants.TIMESTAMP_FORMAT);
					bizValue = dateFormat.format(new Date());
				}
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
		}

		if (value == null)
			return null;

		switch (slot.getDataType()) {
		case BINARY:
			bizValue = value;
			break;
		case BOOLEAN:
			bizValue = Boolean.parseBoolean(value.toString());
			break;
		case DATE_TIME:
			DatetimeDef datetimeDef = (DatetimeDef) slot.getDataDef();
			switch (datetimeDef.getType()) {
			case DATE:
				if (value instanceof Date) {
					bizValue = value;
				} else {
					DateFormat dateFormat = new SimpleDateFormat(OFBizConstants.DATE_FORMAT);
					try {
						bizValue = dateFormat.parse(value.toString());
					} catch (ParseException e) {
					}
				}
				break;
			case DATE_TIME:
				if (value instanceof Date) {
					bizValue = value;
				} else {
					DateFormat dateFormat = new SimpleDateFormat(OFBizConstants.DATETIME_FORMAT);
					try {
						bizValue = dateFormat.parse(value.toString());
					} catch (ParseException e) {
					}
				}
				break;
			case TIME:
				if (value instanceof Date) {
					bizValue = value;
				} else {
					DateFormat dateFormat = new SimpleDateFormat(OFBizConstants.TIME_FORMAT);
					try {
						bizValue = dateFormat.parse(value.toString());
					} catch (ParseException e) {
					}
				}
				break;
			case TIME_STAMP:
				if (value instanceof Timestamp) {
					bizValue = value;
				} else if (value instanceof Date) {
					Date date = (Date) value;
					java.sql.Timestamp sqlDate = new java.sql.Timestamp(date.getTime());
					bizValue = sqlDate;
				} else {
					DateFormat dateFormat = new SimpleDateFormat(OFBizConstants.TIMESTAMP_FORMAT);
					try {
						java.sql.Timestamp sqlDate = new java.sql.Timestamp(dateFormat.parse(value.toString()).getTime());
						bizValue = sqlDate;
					} catch (ParseException e) {
					}

				}
				break;
			}

			break;
		case ENTITY:
			EntityIdentifiable entityIdentifiable = (EntityIdentifiable) value;
			if (slot.isContainment()) {
				bizValue = EntityUtils.toBizEntity(delegator, entityIdentifiable);
			} else
				bizValue = entityIdentifiable.getID();
			break;
		case ENUM:
			Enumerator enumerator = (Enumerator) value;
			bizValue = enumerator.getLiteral();
			break;
		case IDENTITY:
		case NUMERIC:
			NumericDef numericDef = (NumericDef) slot.getDataDef();
			switch (numericDef.getType()) {
			case BIG_DECIMAL:
				if (value instanceof Number) {
					bizValue = value;
				} else {
					bizValue = new BigDecimal(value.toString());
				}
				break;
			case BYTE:
				if (value instanceof Byte) {
					bizValue = value;
				} else {
					bizValue = Byte.parseByte(value.toString());
				}
				break;
			case DOUBLE:
				if (value instanceof Double) {
					bizValue = value;
				} else {
					bizValue = Double.parseDouble(value.toString());
				}
				break;
			case FLOAT:
				if (value instanceof Float) {
					bizValue = value;
				} else {
					bizValue = Float.parseFloat(value.toString());
				}
				break;
			case INTEGER:
				if (value instanceof Integer) {
					bizValue = value;
				} else {
					bizValue = Integer.parseInt(value.toString());
				}
				break;
			case LONG:
				if (value instanceof Long) {
					bizValue = value;
				} else {
					bizValue = Long.parseLong(value.toString());
				}
				break;
			case SHORT:
				if (value instanceof Short) {
					bizValue = value;
				} else {
					bizValue = Short.parseShort(value.toString());
				}
				break;
			}
			break;
		case STRING:
			if (value instanceof String) {
				bizValue = value;
			} else {
				bizValue = value.toString();
			}
			break;
		}

		if (bizValue == null)
			throw new RuntimeException("Unexpected condition: ois8d6h59w498r794");

		return bizValue;
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