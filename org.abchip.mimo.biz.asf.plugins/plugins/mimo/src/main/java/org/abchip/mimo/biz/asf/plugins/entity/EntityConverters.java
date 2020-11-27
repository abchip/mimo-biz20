/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.entity;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.apache.ofbiz.base.conversion.AbstractConverter;
import org.apache.ofbiz.base.conversion.ConversionException;
import org.apache.ofbiz.base.conversion.ConverterLoader;
import org.apache.ofbiz.base.conversion.Converters;
import org.apache.ofbiz.base.util.GeneralException;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.DelegatorFactory;
import org.apache.ofbiz.entity.GenericValue;

/** Entity Converter classes. */
public class EntityConverters implements ConverterLoader {

	@Override
	public void loadConverters() {
		Converters.loadContainedConverters(EntityConverters.class);
	}

	public static class StringToEntityIdentifiable extends AbstractConverter<String, EntityIdentifiable> {
		public StringToEntityIdentifiable() {
			super(String.class, EntityIdentifiable.class);
		}

		public EntityIdentifiable convert(String obj) throws ConversionException {
			return null;
		}
	}

	public static class EntityIdentifiableToString extends AbstractConverter<EntityIdentifiable, String> {
		public EntityIdentifiableToString() {
			super(EntityIdentifiable.class, String.class);
		}

		public String convert(EntityIdentifiable obj) throws ConversionException {
			return obj.getID();
		}
	}

	public static class EntityIdentifiableToGenericValue extends AbstractConverter<EntityIdentifiable, GenericValue> {
		public EntityIdentifiableToGenericValue() {
			super(EntityIdentifiable.class, GenericValue.class);
		}

		public GenericValue convert(EntityIdentifiable entity) throws ConversionException {

			Context context = entity.getContext();
			if (context == null)
				return null;

			Delegator delegator = null;
			if (context.getTenant() != null)
				delegator = DelegatorFactory.getDelegator("default#" + context.getTenant());
			else
				delegator = DelegatorFactory.getDelegator(null);

			if (delegator == null)
				return null;

			try {
				GenericValue genericValue = EntityUtils.toBizEntity(delegator, entity);
				return genericValue;
			} catch (GeneralException e) {
				return null;
			}
		}
	}
}
