/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package org.abchip.mimo.biz.asf.plugins.entity;

import org.apache.ofbiz.base.conversion.AbstractConverter;
import org.apache.ofbiz.base.conversion.ConversionException;
import org.apache.ofbiz.base.conversion.ConverterLoader;
import org.apache.ofbiz.base.conversion.Converters;

/** Boolean Converter classes. */
public class BooleanConverters implements ConverterLoader {

	public static class BooleanToString extends AbstractConverter<Boolean, String> {
		public BooleanToString() {
			super(Boolean.class, String.class);
		}

		public String convert(Boolean obj) throws ConversionException {

			if (obj == null)
				return null;

			if (obj == Boolean.TRUE)
				return "Y";
			else if (obj == Boolean.FALSE)
				return "N";
			else
				return null;
		}
	}

	public void loadConverters() {
		Converters.loadContainedConverters(BooleanConverters.class);
	}
}
