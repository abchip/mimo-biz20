/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.entity;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.abchip.mimo.util.Logs;
import org.apache.ofbiz.base.component.ComponentConfig;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelReader;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.widget.model.FieldInfo;
import org.apache.ofbiz.widget.model.FormFactory;
import org.apache.ofbiz.widget.model.ModelForm;
import org.apache.ofbiz.widget.model.ModelForm.AutoFieldsEntity;
import org.apache.ofbiz.widget.model.ModelFormField;
import org.apache.ofbiz.widget.model.ModelFormField.DropDownField;
import org.apache.ofbiz.widget.model.ModelFormField.OptionSource;
import org.apache.ofbiz.widget.model.ModelFormField.SingleOption;
import org.osgi.service.log.Logger;
import org.xml.sax.SAXException;

public class FormUtils {

	private static final Logger LOGGER = Logs.getLogger(FormUtils.class);

	public static List<ModelForm> searchForm(List<ModelForm> forms, String entityName) {

		List<ModelForm> formList = new ArrayList<ModelForm>();

		for (ModelForm form : forms) {

			if (form.getName().equals("Edit" + entityName) || form.getName().equals("Edit" + entityName + "s")) {
				formList.clear();
				formList.add(form);
				break;
			}

			if (form.getName().equals("Add" + entityName) || form.getName().equals("Add" + entityName + "s")) {
				formList.clear();
				formList.add(form);
				break;
			}

			for (AutoFieldsEntity autoField : form.getAutoFieldsEntities()) {
				if (entityName.equals(autoField.entityName)) {
					formList.add(form);
					break;
				}
			}
		}

		return formList;
	}

	public static ModelFormField searchField(ModelForm form, String fieldName) {

		for (ModelFormField formField : form.getFieldList()) {
			if (formField.getFieldName().equals(fieldName))
				return formField;
		}

		return null;
	}

	public static boolean allowEmpty(ModelField modelField, ModelFormField formField) {

		if (formField == null)
			return true;

		FieldInfo fieldInfo = formField.getFieldInfo();

		if (fieldInfo instanceof ModelFormField.DropDownField) {
			ModelFormField.DropDownField dropDown = (DropDownField) fieldInfo;
			return dropDown.getAllowEmpty();
		} else if (fieldInfo instanceof ModelFormField.HiddenField) {
			ModelFormField.HiddenField hiddenField = (ModelFormField.HiddenField) fieldInfo;
			return hiddenField.getValue().isEmpty();
		} else if (fieldInfo instanceof ModelFormField.TextField) {
			ModelFormField.TextField textField = (ModelFormField.TextField) fieldInfo;
			return textField.getDefaultValue().isEmpty();
		} else if (fieldInfo instanceof ModelFormField.DisplayField) {
			ModelFormField.DisplayField displayField = (ModelFormField.DisplayField) fieldInfo;
			return displayField.getDefaultValue().isEmpty();
		} else
			return false;
	}

	public static boolean isBoolean(ModelField modelField, ModelFormField formField) {

		FieldInfo fieldInfo = null;
		if (formField != null)
			fieldInfo = formField.getFieldInfo();

		if (fieldInfo instanceof ModelFormField.DropDownField) {
			ModelFormField.DropDownField dropDown = (DropDownField) fieldInfo;
			if (dropDown.getOptionSources().size() != 2)
				return false;

			for (OptionSource optionSource : dropDown.getOptionSources()) {
				if (optionSource instanceof ModelFormField.SingleOption) {
					ModelFormField.SingleOption singleOption = (SingleOption) optionSource;
					if (!singleOption.getKey().getOriginal().equals("Y") && !singleOption.getKey().getOriginal().equals("N"))
						return false;
				} else
					return false;
			}
			return true;
		} else if (fieldInfo instanceof ModelFormField.HiddenField) {
			ModelFormField.HiddenField hiddenField = (ModelFormField.HiddenField) fieldInfo;
			if (hiddenField.getValue().getOriginal().equals("Y") || hiddenField.getValue().getOriginal().equals("N"))
				return true;
		} else if (fieldInfo instanceof ModelFormField.TextField) {
			ModelFormField.TextField textField = (ModelFormField.TextField) fieldInfo;
			if (textField.getDefaultValue().getOriginal().equals("Y") || textField.getDefaultValue().getOriginal().equals("N"))
				return true;
		} else if (fieldInfo instanceof ModelFormField.DisplayField) {
			ModelFormField.DisplayField displayField = (ModelFormField.DisplayField) fieldInfo;
			if (displayField.getDefaultValue().getOriginal().equals("Y") || displayField.getDefaultValue().getOriginal().equals("N"))
				return true;
		}

		List<String> chars = Arrays.asList("priority", "countyDefault", "generalDefault", "anyPrefix", "anySuffix", "primaryFlag", "anyPrefix", "anyPrefix", "anySuffix");
		List<String> booleans = Arrays.asList("enabled", "disabled", "enableHttps", "isPublic", "isActive", "isPromo", "isSummary", "isClosed", "resultBadCardNumber", "resultBadExpire",
				"resultDeclined", "resultNsf", "forPullOnly", "forPushOnly", "needsInventoryReceive", "addToCartRemoveIncompat", "addToCartReplaceUpsell", "enableAutoSuggestionList",
				"setOwnerUponIssuance", "splitPayPrefPerShpGrp", "allowProductStoreChange", "addDeleteFlag", "isRefundable", "isAssetClass", "enableAccounting", "useInvoiceIdForReturns",
				"avsAddr", "avsZip", "insideCity", "isValid", "hasPostalCodeExt", "requirePostalCode", "requirePostalCodeExt", "includeSubCategories", "isAnd", "removeStems", "isAscending",
				"requiredField", "booleanResponse", "hasExported", "isBillable", "internalNote", "includeInShipping", "includeInTax", "isManual", "isItemGroupPrimary", "isModifiedPrice",
				"isPromo", "isGift", "maySplit", "needsNsfRetry", "overflowFlag", "presentFlag", "swipedFlag", "optionalInd", "includeInShipping", "includeInTax", "wasReserved",
				"binaryTransfer", "passiveMode", "zipFile", "allowSolicitation", "verified", "isCreate", "isDigital", "isPhysical", "postedAnonymous", "includeSubCategories",
				"useCartQuantity", "allowAuthToNegative", "requirePinCode", "validateGCFinAcct", "manualOnly", "successfulLogin", "labelPrinted", "userCreated", "mustRsvp",
				"includeSubWorkEfforts", "isPosted", "isLate", "isUnread", "showInSelect", "isSystem", "hasLoggedOut");

		if (chars.contains(modelField.getName())) {
			return false;
		} else if (booleans.contains(modelField.getName())) {
			return true;
		}

		LOGGER.warn("Declared unknown indicator {}", modelField.getName());
		return false;
	}

	public static Object getDefaultValue(ModelField modelField, ModelFormField formField) {

		if (formField == null)
			return null;

		FieldInfo fieldInfo = formField.getFieldInfo();

		if (fieldInfo instanceof ModelFormField.DropDownField) {
			ModelFormField.DropDownField dropDown = (DropDownField) fieldInfo;

			if (dropDown.getNoCurrentSelectedKey().getOriginal().equals("Y"))
				return Boolean.TRUE;
			else if (dropDown.getNoCurrentSelectedKey().getOriginal().equals("N"))
				return Boolean.FALSE;
		} else if (fieldInfo instanceof ModelFormField.HiddenField) {
			ModelFormField.HiddenField hiddenField = (ModelFormField.HiddenField) fieldInfo;
			if (!hiddenField.getValue().isEmpty())
				return hiddenField.getValue().getOriginal();
		} else if (fieldInfo instanceof ModelFormField.TextField) {
			ModelFormField.TextField textField = (ModelFormField.TextField) fieldInfo;
			if (!textField.getDefaultValue().isEmpty())
				return textField.getDefaultValue().getOriginal();
		} else if (fieldInfo instanceof ModelFormField.DisplayField) {
			ModelFormField.DisplayField displayField = (ModelFormField.DisplayField) fieldInfo;
			if (!displayField.getDefaultValue().isEmpty())
				return displayField.getDefaultValue().getOriginal();
		}

		return null;
	}

	public static String findEnumType(Map<String, ModelForm> forms, String modelName, String fieldName) {

		String enumType = null;

		List<String> formNames = new ArrayList<String>();

		String modelEntityName = modelName;
		if (modelEntityName.equals("CommunicationEvent"))
			modelEntityName = "CommEvent";

		formNames.add("Lookup" + modelEntityName);
		formNames.add("Find" + modelEntityName);
		formNames.add("List" + modelEntityName);
		formNames.add("Search" + modelEntityName + "Params");
		formNames.add("Edit" + modelEntityName);
		formNames.add("Add" + modelEntityName);
		formNames.add("Update" + modelEntityName);

		ModelFormField modelFormField = null;

		for (String formName : formNames) {
			ModelForm modelForm = forms.get(formName);
			if (modelForm != null) {
				for (ModelFormField mff : modelForm.getFieldList()) {
					if (mff.getName().equals(fieldName))
						modelFormField = mff;

					if (modelFormField != null) {
						break;
					}
				}

				if (modelFormField != null)
					break;
			}
		}

		if (modelFormField != null) {
			enumType = "";
		}

		return enumType;
	}

	public static List<ModelForm> loadEntityForms(DispatchContext dctx, ModelReader modelReader) {

		List<ModelForm> forms = new ArrayList<ModelForm>();

		Collection<ComponentConfig> components = ComponentConfig.getAllComponents();
		for (ComponentConfig componentConfig : components) {

			Path root = Paths.get(componentConfig.getRootLocation(), "widget");
			if (!Files.exists(root))
				continue;

			FormUtils.loadEntityForms(componentConfig, root, forms, modelReader, dctx);
		}

		return forms;
	}

	private static void loadEntityForms(ComponentConfig componentConfig, Path root, List<ModelForm> forms, ModelReader modelReader, DispatchContext dctx) {

		String componentName = componentConfig.getGlobalName();
		String rootComponentPath = componentConfig.getRootLocation();

		try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(root)) {

			for (Path file : dirStream) {
				if (Files.isDirectory(file)) {
					loadEntityForms(componentConfig, file, forms, modelReader, dctx);
				} else {
					if (file.getFileName().toString().endsWith("Forms.xml")) {
						try {

							String formFilePath = file.toFile().getAbsolutePath();
							formFilePath = formFilePath.replace('\\', '/');
							String formFileRelativePath = formFilePath.substring(rootComponentPath.length());
							String formLocation = "component://" + componentName + "/" + formFileRelativePath;

							Map<String, ModelForm> fileForms = FormFactory.getFormsFromLocation(formLocation, modelReader, dctx);
							forms.addAll(fileForms.values());
						} catch (SAXException | ParserConfigurationException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}