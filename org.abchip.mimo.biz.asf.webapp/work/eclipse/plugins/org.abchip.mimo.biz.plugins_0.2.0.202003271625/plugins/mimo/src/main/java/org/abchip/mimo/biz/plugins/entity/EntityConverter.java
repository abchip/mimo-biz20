package org.abchip.mimo.biz.plugins.entity;

import org.abchip.mimo.entity.Entity;
import org.apache.ofbiz.base.conversion.AbstractConverter;
import org.apache.ofbiz.base.conversion.ConversionException;

public class EntityConverter<E> extends AbstractConverter<Entity, String> {

	public EntityConverter() {
		super(Entity.class, String.class);
	}

	public String convert(Entity obj) throws ConversionException {
		return obj.toString();
	}
}
