/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.base.service;

import org.abchip.mimo.biz.model.common.property.SystemProperty;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceReader;

public class UomServices {

	public static Uom getUom(Context context) throws ResourceException {
		ResourceManager resourceManager = context.get(ResourceManager.class);
		ResourceReader<SystemProperty> systemProperty = resourceManager.getResourceReader(context, SystemProperty.class);
		SystemProperty props = systemProperty.lookup("general/currency.uom.id.default");

		ResourceReader<Uom> uomReader = resourceManager.getResourceReader(context, Uom.class);
		return uomReader.lookup(props.getSystemPropertyValue());
	}
}
