/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.entity;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.apache.ofbiz.base.util.UtilProperties;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.model.ModelEntity;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelField.EncryptMethod;
import org.apache.ofbiz.entity.model.ModelFieldType;
import org.apache.ofbiz.widget.model.FieldInfo;
import org.apache.ofbiz.widget.model.ModelForm;
import org.apache.ofbiz.widget.model.ModelFormField;
import org.apache.ofbiz.widget.model.ModelFormField.DropDownField;
import org.apache.ofbiz.widget.model.ModelFormField.OptionSource;
import org.apache.ofbiz.widget.model.ModelFormField.SingleOption;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.log.Logger;

public class EcoreUtils {

	private static final Logger LOGGER = Logs.getLogger(EcoreUtils.class);

	public static EClass copy(EClass eClass) {
		return EcoreUtil.copy(eClass);
	}

	public static EAnnotation copy(EAnnotation eAnnotation) {
		return EcoreUtil.copy(eAnnotation);
	}

	public static EStructuralFeature copy(EStructuralFeature eFeature) {
		return EcoreUtil.copy(eFeature);
	}

	public static EOperation copy(EOperation eOperation) {

		return EcoreUtil.copy(eOperation);

		/*
		 * EOperation result = EcoreFactory.eINSTANCE.createEOperation();
		 * 
		 * result.setEGenericType(eOperation.getEGenericType());
		 * result.setEType(eOperation.getEType());
		 * result.setLowerBound(eOperation.getLowerBound());
		 * result.setName(eOperation.getName());
		 * result.setOrdered(eOperation.isOrdered());
		 * result.setUnique(eOperation.isUnique());
		 * result.setUpperBound(eOperation.getUpperBound());
		 * result.getEAnnotations().addAll(EcoreUtil.copyAll(eOperation.getEAnnotations(
		 * )));
		 * 
		 * return result;
		 */
	}

	public static String packageToName(EPackage ePackage) {

		StringBuffer sb = new StringBuffer();

		URI uri = URI.createURI(ePackage.getNsURI());
		sb.append("org.abchip.mimo");
		sb.append(uri.path().replaceAll("\\/", "\\."));

		return sb.toString();
	}

	public static EPackage buildEPackage(EPackage eRootPackage, String packageName) {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EPackage ePackage = ecoreFactory.createEPackage();
		ePackage.setName(packageName);
		ePackage.setNsPrefix(eRootPackage.getNsPrefix() + "-" + packageName);
		ePackage.setNsPrefix("biz-" + packageName);

		ePackage.setNsURI(eRootPackage.getNsURI() + "/" + packageName);

		return ePackage;
	}

	public static EClass buildEntityTypeEClass(Delegator delegator, List<ModelForm> forms, ModelEntity modelEntity) throws GenericEntityException {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EClass eClass = ecoreFactory.createEClass();
		setEntityCommon(delegator, modelEntity, eClass);

		EGenericType eGenericType = ecoreFactory.createEGenericType();
		eGenericType.setEClassifier(EntityPackage.eINSTANCE.getEntityType());
		eClass.getEGenericSuperTypes().add(eGenericType);
		
		eClass.getESuperTypes().add(EntityPackage.eINSTANCE.getEntityInfo());

		for (String fieldName : getOwnedAttributeNames(modelEntity)) {
			ModelField modelField = modelEntity.getField(fieldName);

			EAttribute eAttribute = buildAttribute(delegator, forms, modelField);
			eClass.getEStructuralFeatures().add(eAttribute);
		}

		return eClass;
	}

	public static EClass buildEntityTypedEClass(Delegator delegator, List<ModelForm> forms, EClass entityType, ModelEntity modelEntity) throws GenericEntityException {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EClass eClass = ecoreFactory.createEClass();
		setEntityCommon(delegator, modelEntity, eClass);

		EGenericType eGenericType = ecoreFactory.createEGenericType();
		eGenericType.setEClassifier(EntityPackage.eINSTANCE.getEntityTyped());
		EGenericType eGenericType2 = ecoreFactory.createEGenericType();
		eGenericType2.setEClassifier(entityType);
		eGenericType.getETypeArguments().add(eGenericType2);
		eClass.getEGenericSuperTypes().add(eGenericType);

		eClass.getESuperTypes().add(EntityPackage.eINSTANCE.getEntityInfo());
		
		for (String fieldName : getOwnedAttributeNames(modelEntity)) {
			ModelField modelField = modelEntity.getField(fieldName);

			EAttribute eAttribute = buildAttribute(delegator, forms, modelField);
			eClass.getEStructuralFeatures().add(eAttribute);
		}

		return eClass;
	}

	public static EClass buildEntityEClass(Delegator delegator, List<ModelForm> forms, ModelEntity modelEntity) throws GenericEntityException {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EClass eClass = ecoreFactory.createEClass();
		setEntityCommon(delegator, modelEntity, eClass);

		eClass.getESuperTypes().add(EntityPackage.eINSTANCE.getEntityIdentifiable());
		eClass.getESuperTypes().add(EntityPackage.eINSTANCE.getEntityInfo());

		for (String fieldName : getOwnedAttributeNames(modelEntity)) {
			ModelField modelField = modelEntity.getField(fieldName);

			EAttribute eAttribute = buildAttribute(delegator, forms, modelField);
			eClass.getEStructuralFeatures().add(eAttribute);
		}

		return eClass;
	}

	public static EClass buildEntityNoteEClass(Delegator delegator, List<ModelForm> forms, ModelEntity modelEntity) {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EClass eClass = ecoreFactory.createEClass();
		setEntityCommon(delegator, modelEntity, eClass);

		eClass.getESuperTypes().add(BizPackage.eINSTANCE.getBizEntityNote());

		for (String fieldName : getOwnedAttributeNames(modelEntity)) {
			ModelField modelField = modelEntity.getField(fieldName);
			if (modelField.getName().equals("noteId"))
				continue;
			if (modelField.getName().equals("note"))
				continue;

			EAttribute eAttribute = buildAttribute(delegator, forms, modelField);

			eClass.getEStructuralFeatures().add(eAttribute);
		}

		return eClass;
	}

	public static EEnum buildEnum(EPackage ePackage, Map<String, ? extends Object> context, ModelFormField formField) {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EEnum eEnum = ecoreFactory.createEEnum();
		eEnum.setName(Strings.firstToUpper(formField.getName()));

		FieldInfo fieldInfo = formField.getFieldInfo();

		String resource = Strings.firstToUpper(ePackage.getName());
		if (resource.equals("Humanres"))
			resource = "HumanRes";
		resource = resource + "UiLabels";

		if (fieldInfo instanceof ModelFormField.DropDownField) {
			ModelFormField.DropDownField dropDown = (DropDownField) fieldInfo;

			for (OptionSource optionSource : dropDown.getOptionSources()) {
				if (optionSource instanceof ModelFormField.SingleOption) {
					ModelFormField.SingleOption singleOption = (SingleOption) optionSource;

					EEnumLiteral literal = ecoreFactory.createEEnumLiteral();
					literal.setLiteral(singleOption.getKey().getOriginal());

					String description = singleOption.getDescription().getOriginal();
					String name = description.split("\\.")[1];
					name = name.substring(0, name.length() - 1);
					try {
						String message = UtilProperties.getMessage(resource, name, context, Locale.ENGLISH);
						message = message.replaceAll("-", "_");
						literal.setName(message);
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
					}
					eEnum.getELiterals().add(literal);
				}
			}
		}

		if (eEnum.getELiterals().isEmpty())
			return null;
		else
			return eEnum;
	}

	private static void setEntityCommon(Delegator delegator, ModelEntity modelEntity, EClass eClass) {

		eClass.setName(modelEntity.getEntityName());

		if (modelEntity.getDescription() != null && !modelEntity.getDescription().trim().isEmpty() && !modelEntity.getDescription().trim().equalsIgnoreCase("NONE"))
			addAnnotationKey(eClass, Frame.NS_PREFIX_FRAME, "help", modelEntity.getDescription().trim());

		if (modelEntity.getTitle() != null && !modelEntity.getTitle().trim().isEmpty() && !modelEntity.getTitle().replaceAll(" ", "").equalsIgnoreCase(modelEntity.getEntityName()))
			addAnnotationKey(eClass, Frame.NS_PREFIX_FRAME, "title", modelEntity.getTitle().trim());

		if (modelEntity.getDefaultResourceName() != null && !modelEntity.getDefaultResourceName().trim().isEmpty()
				&& !modelEntity.getDefaultResourceName().replaceAll(" ", "").equalsIgnoreCase(modelEntity.getEntityName() + "Labels"))
			addAnnotationKey(eClass, Frame.NS_PREFIX_FRAME, "dictionary", modelEntity.getDefaultResourceName().trim());
	}

	public static void addAnnotationKey(EModelElement modelElement, String prefix, String key, String value) {

		EAnnotation eAnnotation = modelElement.getEAnnotation(prefix);
		if (eAnnotation == null) {
			eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			eAnnotation.setSource(prefix);
			modelElement.getEAnnotations().add(eAnnotation);
		}
		eAnnotation.getDetails().put(key, value);
	}

	public static String getAnnotationValue(EModelElement modelElement, String prefix, String key) {

		EAnnotation eAnnotation = modelElement.getEAnnotation(prefix);
		if (eAnnotation == null)
			return null;
		return eAnnotation.getDetails().get(key);
	}

	public static Set<String> getOwnedAttributeNames(ModelEntity modelEntity) {

		Set<String> atts = new TreeSet<String>();

		for (String attName : modelEntity.getPkFieldNames()) {
			if (EntityPackage.eINSTANCE.getEntityIdentifiable().getEStructuralFeature(attName) != null)
				continue;
			atts.add(attName);
		}
		for (String attName : modelEntity.getNoPkFieldNames()) {
			if (EntityPackage.eINSTANCE.getEntityIdentifiable().getEStructuralFeature(attName) != null)
				continue;
			if (EntityPackage.eINSTANCE.getEntityInfo().getEStructuralFeature(attName) != null)
				continue;
			atts.add(attName);
		}

		return atts;
	}

	public static EAttribute buildAttribute(Delegator delegator, List<ModelForm> forms, ModelField modelField) {
		
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EAttribute eAttribute = ecoreFactory.createEAttribute();
		eAttribute.setName(modelField.getName());

		if (modelField.getIsPk()) {
			if (modelField.getModelEntity().getPksSize() == 1)
				eAttribute.setID(true);
			else
				addAnnotationKey(eAttribute, Slot.NS_PREFIX_SLOT, "key", "true");
		}

		if (modelField.getIsNotNull())
			eAttribute.setLowerBound(1);

		if (modelField.getEnableAuditLog())
			addAnnotationKey(eAttribute, Slot.NS_PREFIX_SLOT, "audit", "true");

		if (modelField.getEncryptMethod() != EncryptMethod.FALSE)
			addAnnotationKey(eAttribute, Slot.NS_PREFIX_SLOT, "encrypt", modelField.getEncryptMethod().name());

		if (modelField.getDescription() != null && !modelField.getDescription().trim().isEmpty()) {
			addAnnotationKey(eAttribute, Slot.NS_PREFIX_SLOT, "help", modelField.getDescription().trim());

			// TODO
			if (modelField.getDescription().trim().toLowerCase().contains("calculated")) {
				// System.out.println(modelField.getModelEntity().getEntityName() + "." +
				// modelField.getName());
				// System.out.println(modelField.getDescription());
			}
		}

		// String description =
		// UtilHelpText.getEntityFieldDescription(modelField.getModelEntity().getEntityName(),
		// modelField.getName(), delegator, Locale.US);
		// if (!description.isEmpty())
		// addAnnotationKey(eAttribute, Slot.NS_PREFIX_SLOT, "help", description);

		if (modelField.getIsAutoCreatedInternal())
			"".toString();

		if (modelField.getFieldSet() != null && !modelField.getFieldSet().trim().isEmpty())
			"".toString();

		if (modelField.getValidators() != null && !modelField.getValidators().isEmpty())
			"".toString();

		setClassifier(delegator, forms, eAttribute, modelField);

		return eAttribute;
	}

	public static void setClassifier(Delegator delegator, List<ModelForm> forms, EAttribute eAttribute, ModelField modelField) {

		ModelFieldType modelFieldType = delegator.getModelFieldTypeReader(modelField.getModelEntity()).getModelFieldType(modelField.getType());

		switch (modelField.getType()) {

		case "name":
		case "description":
		case "credit-card-number":
		case "credit-card-date":
		case "email":
		case "comment":
		case "tel-number":
		case "url":
			addAnnotationKey(eAttribute, Slot.NS_PREFIX_FORMAT, "type", modelField.getType());
			eAttribute.setEType(EcorePackage.eINSTANCE.getEString());
			break;
		// string
		case "id-ne":
		case "id-long-ne":
		case "id-vlong-ne":
		case "id":
		case "id-long":
		case "id-vlong":
		case "blob":
		case "long-varchar":
		case "short-varchar":
		case "value":
		case "very-short":
		case "very-long":
			addAnnotationLength(eAttribute, modelFieldType);
			eAttribute.setEType(EcorePackage.eINSTANCE.getEString());
			break;
		// big decimal
		case "currency-amount":
		case "currency-precise":
		case "fixed-point":
			addAnnotationKey(eAttribute, Slot.NS_PREFIX_FORMAT, "type", modelField.getType());
			addAnnotationLength(eAttribute, modelFieldType);
			eAttribute.setEType(EcorePackage.eINSTANCE.getEBigDecimal());
			break;
		// date
		case "date-time":
		case "date":
		case "time":
			eAttribute.setEType(EcorePackage.eINSTANCE.getEDate());
			break;
		// long
		case "numeric":
			eAttribute.setEType(EcorePackage.eINSTANCE.getELong());
			addAnnotationLength(eAttribute, modelFieldType);
			break;
		// object
		case "object":
			eAttribute.setEType(EcorePackage.eINSTANCE.getEJavaObject());
			break;
		// byte array
		case "byte-array":
			eAttribute.setEType(EcorePackage.eINSTANCE.getEByteArray());
			break;
		// double
		case "floating-point":
			eAttribute.setEType(EcorePackage.eINSTANCE.getEDouble());
			addAnnotationLength(eAttribute, modelFieldType);
			break;
		// char
		case "indicator": {
			setClassifierIndicator(forms, eAttribute, modelField);
			break;
		}
		default:
			LOGGER.warn("Unknown field type {}", modelField);
			return;
		}
	}

	private static void addAnnotationLength(EAttribute eAttribute, ModelFieldType modelFieldType) {
		if (modelFieldType == null)
			return;

		if (modelFieldType.getSqlType().contains("(")) {
			int x = modelFieldType.getSqlType().indexOf("(");
			int y = modelFieldType.getSqlType().indexOf(")");
			String token = modelFieldType.getSqlType().substring(x + 1, y);
			String tokens[] = token.split(",");

			if (tokens.length > 1) {
				addAnnotationKey(eAttribute, Slot.NS_PREFIX_FORMAT, "precision", tokens[0].trim());
				addAnnotationKey(eAttribute, Slot.NS_PREFIX_FORMAT, "scale", tokens[1].trim());
			} else
				addAnnotationKey(eAttribute, Slot.NS_PREFIX_FORMAT, "length", tokens[0].trim());
		}
	}

	private static void setClassifierIndicator(List<ModelForm> forms, EAttribute eAttribute, ModelField modelField) {

		ModelFormField formField = null;
		for (ModelForm form : FormUtils.searchForm(forms, modelField.getModelEntity().getEntityName())) {
			formField = FormUtils.searchField(form, modelField.getName());
			if (formField != null)
				break;
		}

		boolean isBoolean = FormUtils.isBoolean(modelField, formField);
		boolean allowEmpty = FormUtils.allowEmpty(modelField, formField);
		Object defaulValue = FormUtils.getDefaultValue(modelField, formField);

		if (!allowEmpty)
			eAttribute.setLowerBound(1);

		if (isBoolean) {
			if (!allowEmpty)
				eAttribute.setEType(EcorePackage.eINSTANCE.getEBoolean());
			else
				eAttribute.setEType(EcorePackage.eINSTANCE.getEBooleanObject());
			if (defaulValue == Boolean.TRUE)
				eAttribute.setDefaultValue(defaulValue);
		} else {
			// TODO create Enum
			addAnnotationKey(eAttribute, Slot.NS_PREFIX_FORMAT, "type", modelField.getType());
			eAttribute.setEType(EcorePackage.eINSTANCE.getEString());
			eAttribute.setDefaultValue(defaulValue);
		}
	}
}
