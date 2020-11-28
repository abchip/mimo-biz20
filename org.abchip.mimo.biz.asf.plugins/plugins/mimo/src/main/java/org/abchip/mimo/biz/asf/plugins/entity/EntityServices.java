/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.asf.plugins.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
import org.abchip.mimo.util.Frames;
import org.abchip.mimo.util.Logs;
import org.abchip.mimo.util.Strings;
import org.apache.ofbiz.entity.Delegator;
import org.apache.ofbiz.entity.GenericEntityException;
import org.apache.ofbiz.entity.model.ModelEntity;
import org.apache.ofbiz.entity.model.ModelField;
import org.apache.ofbiz.entity.model.ModelKeyMap;
import org.apache.ofbiz.entity.model.ModelReader;
import org.apache.ofbiz.entity.model.ModelRelation;
import org.apache.ofbiz.entity.model.ModelUtil;
import org.apache.ofbiz.entity.model.ModelViewEntity;
import org.apache.ofbiz.service.DispatchContext;
import org.apache.ofbiz.service.ServiceUtil;
import org.apache.ofbiz.widget.model.ModelForm;
import org.apache.ofbiz.widget.model.ModelFormField;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.osgi.service.log.Logger;

public class EntityServices {

	private static final Logger LOGGER = Logs.getLogger(EntityServices.class);

	public static Map<String, Object> exportEntities(DispatchContext dctx, Map<String, Object> context) {

		Delegator delegator = dctx.getDelegator();
		ModelReader modelReader = delegator.getModelReader();

		try {
			List<ModelForm> forms = FormUtils.loadEntityForms(dctx, modelReader);
			Set<String> entityNames = ModelUtils.findEntityNames(modelReader, null);

			EPackage bizPackage = buildBizPackage(delegator, forms);
			setFrameSuper(delegator, bizPackage, entityNames);

			setTextable(modelReader, bizPackage, entityNames);
			setReferences(modelReader, bizPackage, entityNames);

			setIndicators(bizPackage, context, modelReader, entityNames, forms);
			addRoutes(delegator, forms, bizPackage, entityNames);

			if (setVariations(Frames.getEClassifiers(), bizPackage))
				LOGGER.warn("Differences found on model");

			reorderFeatures(bizPackage, entityNames);

			bizPackage = writePackage(bizPackage, context);

			return ServiceUtil.returnSuccess("OK");
		} catch (Exception e) {
			Map<String, Object> resultMap = ServiceUtil.returnError(e.getMessage());
			return resultMap;
		}
	}

	private static boolean setVariations(Map<String, EClassifier> bizModels, EPackage newEPackage) {

		boolean result = false;

		for (EClassifier eClassifier : newEPackage.getEClassifiers()) {
			if (setEClassifierVariations(bizModels, eClassifier))
				result = true;
		}

		for (EPackage ePackage : newEPackage.getESubpackages()) {
			if (setVariations(bizModels, ePackage))
				result = true;
		}

		return result;
	}

	private static boolean setEClassifierVariations(Map<String, EClassifier> srcEClassifiers, EClassifier dstEClassifier) {

		EClassifier srcEClassifier = srcEClassifiers.get(dstEClassifier.getName());
		if (srcEClassifier == null) {
			LOGGER.info("New classifier " + dstEClassifier);
			return false;
		}

		if (!(srcEClassifier instanceof EClass))
			return false;

		EClass dstEClass = (EClass) dstEClassifier;
		EClass srcEClass = (EClass) srcEClassifier;

		boolean result = false;

		// super class
		if (!srcEClass.getESuperTypes().get(0).equals(EntityPackage.eINSTANCE.getEntityIdentifiable()) && !srcEClass.getESuperTypes().get(0).equals(EntityPackage.eINSTANCE.getEntityType())
				&& !srcEClass.getESuperTypes().get(0).equals(EntityPackage.eINSTANCE.getEntityTyped())) {

			if (!srcEClass.getESuperTypes().get(0).getName().equals(dstEClass.getESuperTypes().get(0).getName())) {
				LOGGER.info("Class {} override super {}", dstEClassifier.getName(), EcoreUtil.getURI(srcEClass.getESuperTypes().get(0)));

				result = true;

				// remove previous
				dstEClass.getESuperTypes().clear();

				// copy source
				for (EClass srcSuperEClass : srcEClass.getESuperTypes())
					dstEClass.getESuperTypes().add(srcSuperEClass);
			}
		}

		// features
		for (EStructuralFeature srcEFeature : srcEClass.getEStructuralFeatures()) {
			EAnnotation srcEAnnotation = srcEFeature.getEAnnotation(Slot.NS_PREFIX_SLOT);
			if (srcEAnnotation == null)
				continue;

			String srcEValue = srcEAnnotation.getDetails().get("generated");
			if (srcEValue == null || Boolean.parseBoolean(srcEValue))
				continue;

			EStructuralFeature dstEFeature = dstEClass.getEStructuralFeature(srcEFeature.getName());

			// remove previous
			if (dstEFeature != null)
				dstEClass.getEStructuralFeatures().remove(dstEFeature);

			dstEClass.getEStructuralFeatures().add(EcoreUtils.copy(srcEFeature));
			result = true;
		}

		// operations
		for (EOperation srcEOperation : srcEClass.getEOperations()) {
			EPackage srcEPackage = srcEClass.getEPackage();
			EPackage dstEPackage = dstEClass.getEPackage();

			// copy annotation to destination package
			for (EAnnotation srcEAnnotation : srcEPackage.getEAnnotations()) {
				EAnnotation dstEAnnotation = dstEPackage.getEAnnotation(srcEAnnotation.getSource());
				if (dstEAnnotation == null) {
					dstEAnnotation = EcoreUtils.copy(srcEAnnotation);
					dstEPackage.getEAnnotations().add(dstEAnnotation);
				}
			}

			// copy source
			dstEClass.getEOperations().add(EcoreUtils.copy(srcEOperation));
			result = true;
		}

		return result;
	}

	private static EPackage buildBizPackage(Delegator delegator, List<ModelForm> forms) throws GenericEntityException {

		EPackage bizPackage = EcoreFactory.eINSTANCE.createEPackage();
		bizPackage.setName("model");
		bizPackage.setNsPrefix("biz-model");
		bizPackage.setNsURI("http://www.abchip.org/mimo/biz/model");

		for (String packageName : ModelUtils.findPackages(delegator.getModelReader(), null)) {

			EPackage workPackage = buildWorkPackage(bizPackage, packageName);

			Set<String> entityNames = ModelUtils.findEntityNames(delegator.getModelReader(), packageName);

			// types
			loadTypes(delegator, forms, workPackage, entityNames);

			// notes
			loadNotes(delegator, forms, workPackage, entityNames);

			// entities
			loadEntities(delegator, forms, workPackage, entityNames);

			// reset type without typed
			resetUnknownTypes(workPackage, entityNames);

			// reorder frames by name
			List<EClassifier> list = new ArrayList<EClassifier>(workPackage.getEClassifiers());
			Collections.sort(list, new Comparator<EClassifier>() {
				@Override
				public int compare(EClassifier o1, EClassifier o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});

			workPackage.getEClassifiers().clear();
			workPackage.getEClassifiers().addAll(list);
		}

		return bizPackage;
	}

	private static EPackage buildWorkPackage(EPackage bizPackage, String packageName) {

		String[] packageTokens = packageName.split("\\.");

		if (packageTokens.length > 5)
			"".toString();

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			if (sb.length() != 0)
				sb.append(".");
			sb.append(packageTokens[i]);
		}
		String moduleUri = sb.toString();

		// root package
		EPackage modulePackage = Frames.getEPackage(bizPackage, packageTokens[3], false);
		if (modulePackage == null) {
			modulePackage = EcoreUtils.buildEPackage(bizPackage, packageTokens[3]);
			bizPackage.getESubpackages().add(modulePackage);
		}

		// work package
		EPackage workPackage = modulePackage;
		String subModuleUri = moduleUri;
		if (packageTokens.length > 4) {
			EPackage subPackage = EcoreUtils.buildEPackage(modulePackage, packageTokens[4]);
			modulePackage.getESubpackages().add(subPackage);
			workPackage = subPackage;
			subModuleUri = subModuleUri + "." + packageTokens[4];
		}

		return workPackage;
	}

	private static void loadTypes(Delegator delegator, List<ModelForm> forms, EPackage eWorkPackage, Set<String> entityNames) throws GenericEntityException {

		// type
		for (String entityName : entityNames) {
			ModelEntity modelEntity = delegator.getModelEntity(entityName);
			if (modelEntity.getField("hasTable") == null && !entityName.endsWith("Type"))
				continue;

			EClass eClass = EcoreUtils.buildEntityTypeEClass(delegator, forms, modelEntity);
			eWorkPackage.getEClassifiers().add(eClass);
		}
	}

	private static void loadNotes(Delegator delegator, List<ModelForm> forms, EPackage eWorkPackage, Set<String> entityNames) throws GenericEntityException {

		// type
		for (String entityName : entityNames) {
			if (!entityName.endsWith("Note"))
				continue;

			ModelEntity modelEntity = delegator.getModelEntity(entityName);
			if (modelEntity.getField("noteId") == null)
				continue;

			EClass eClass = EcoreUtils.buildEntityNoteEClass(delegator, forms, modelEntity);
			eWorkPackage.getEClassifiers().add(eClass);
		}
	}

	private static void loadEntities(Delegator delegator, List<ModelForm> forms, EPackage eWorkPackage, Set<String> entityNames) throws GenericEntityException {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		for (String entityName : entityNames) {

			if (Frames.getEClassifier(eWorkPackage, entityName) != null)
				continue;

			EClass eClass = null;

			ModelEntity modelEntity = delegator.getModelEntity(entityName);

			EClass typeEntity = getTypeEntity(eWorkPackage, modelEntity);

			// typed
			if (typeEntity != null) {

				EGenericType eGenericType = typeEntity.getEGenericSuperTypes().get(0);
				if (eGenericType.getETypeArguments().isEmpty()) {
					eClass = EcoreUtils.buildEntityTypedEClass(delegator, forms, typeEntity, modelEntity);

					EGenericType eGenericType2 = ecoreFactory.createEGenericType();
					eGenericType2.setEClassifier(eClass);

					eGenericType.getETypeArguments().add(eGenericType2);

					if (false)
						"".toString();
				} else {
					LOGGER.warn("ROLE: " + modelEntity.getEntityName() + " -> " + typeEntity.getName() + "<" + eGenericType.getETypeArguments().get(0).getEClassifier().getName() + ">");
					eClass = EcoreUtils.buildEntityEClass(delegator, forms, modelEntity);
				}
			} else
				eClass = EcoreUtils.buildEntityEClass(delegator, forms, modelEntity);

			eWorkPackage.getEClassifiers().add(eClass);
		}
	}

	private static EClass getTypeEntity(EPackage eWorkPackage, ModelEntity modelEntity) {
		EClass typeEntity = null;
		if (modelEntity.getEntityName().equals("StatusItem"))
			typeEntity = Frames.getEClass(eWorkPackage, "StatusType");
		else if (modelEntity.getEntityName().equals("OrderHeader"))
			typeEntity = Frames.getEClass(eWorkPackage, "OrderType");
		else
			typeEntity = Frames.getEClass(eWorkPackage, modelEntity.getEntityName() + "Type");

		if (typeEntity == null)
			return null;

		if (typeEntity.getEIDAttribute() == null)
			return null;

		if (modelEntity.getField(typeEntity.getEIDAttribute().getName()) == null)
			return null;

		return typeEntity;
	}

	private static void resetUnknownTypes(EPackage eWorkPackage, Set<String> entityNames) {

		for (String entityName : entityNames) {

			EClass typeEntity = Frames.getEClass(eWorkPackage, entityName);
			if (typeEntity == null)
				continue;

			EClass eSuperClass = typeEntity.getESuperTypes().get(0);
			if (!eSuperClass.equals(EntityPackage.eINSTANCE.getEntityType()))
				continue;

			if (!typeEntity.getEGenericSuperTypes().get(0).getETypeArguments().isEmpty())
				continue;

			LOGGER.info("TYPE: " + eWorkPackage.getNsURI() + "/#" + typeEntity.getName() + " -> " + typeEntity.getEStructuralFeature("hasTable"));
			typeEntity.getEGenericSuperTypes().clear();
			typeEntity.getESuperTypes().clear();
			typeEntity.getESuperTypes().add(EntityPackage.eINSTANCE.getEntityIdentifiable());
			typeEntity.getESuperTypes().add(EntityPackage.eINSTANCE.getEntityInfo());
		}
	}

	private static void setFrameSuper(Delegator delegator, EPackage bizPackage, Set<String> entityNames) {

		// set superClass
		for (String entityName : entityNames) {
			EClass eClass = Frames.getEClass(bizPackage, entityName);

			if(entityName.equals("Budget"))
				"".toString();
			
			// with attribute ID
			EAttribute eClassAttributeID = eClass.getEIDAttribute();
			if (eClassAttributeID == null)
				continue;

			String relationEntity = ModelUtils.getSuperEntity(delegator, entityName);
			if (relationEntity == null)
				continue;

			EClass eClassRelation = Frames.getEClass(bizPackage, relationEntity);

			// relation not found
			if (eClassRelation == null) {
				LOGGER.error("Model not found {}", relationEntity);
				continue;
			}

			// only typed
			if (!EntityPackage.eINSTANCE.getEntityTyped().isSuperTypeOf(eClassRelation))
				continue;

			// remove duplicate attribute ID
			eClass.getEStructuralFeatures().remove(eClassAttributeID);

			// super type
			eClass.getESuperTypes().clear();
			eClass.getESuperTypes().add(eClassRelation);

			// constraints
			EClass eClassType = (EClass) eClassRelation.getEGenericSuperTypes().get(0).getETypeArguments().get(0).getEClassifier();
			String constraintField = eClassType.getEIDAttribute().getName();

			if (eClass.getEStructuralFeature(constraintField) == null)
				continue;

			if (constraintField.endsWith("Id"))
				constraintField = constraintField.substring(0, constraintField.length() - 2);

			String constraintValue = ModelUtil.javaNameToDbName(eClass.getName());
			EcoreUtils.addAnnotationKey(eClass, Frame.NS_PREFIX_FRAME_TYPE, constraintField, constraintValue);
		}
	}

	private static void setTextable(ModelReader modelReader, EPackage bizPackage, Set<String> entityNames) {

		for (String entityName : entityNames) {

			ModelEntity modelEntity = modelReader.getModelEntityNoCheck(entityName);
			if (modelEntity == null)
				continue;

			EClass eClass = Frames.getEClass(bizPackage, modelEntity.getEntityName());
			if (eClass == null)
				continue;

			if (eClass.getEStructuralFeature("description") != null)
				EcoreUtils.addAnnotationKey(eClass, Frame.NS_PREFIX_FRAME, "formula", "description");

		}
	}

	@SuppressWarnings("unused")
	private static void setReferences(ModelReader modelReader, EPackage bizPackage, Set<String> entityNames) {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		Queue<String> queue = new LinkedList<String>();
		queue.addAll(entityNames);

		while (!queue.isEmpty()) {
			String entityName = queue.poll();

			ModelEntity modelEntity = modelReader.getModelEntityNoCheck(entityName);
			if (modelEntity == null)
				continue;

			EClass eClass = Frames.getEClass(bizPackage, entityName);
			if (eClass == null)
				continue;

			if (!eClass.getESuperTypes().isEmpty()) {
				EClass eSuperType = eClass.getESuperTypes().get(0);
				if (queue.contains(eSuperType.getName())) {
					queue.add(entityName);
					continue;
				}
			}

			for (ModelRelation modelRelation : modelEntity.getRelationsList(true, true, false)) {

				// no automatic relation
				if (modelRelation.isAutoRelation())
					continue;

				EClass eClassRef = Frames.getEClass(bizPackage, modelRelation.getRelEntityName());
				if (eClassRef == null) {
					LOGGER.info("VIEW: " + entityName + " ->  " + modelRelation.getRelEntityName());
					continue;
				}

				// one field map on pk
				if (eClassRef.getEIDAttribute() == null)
					continue;
				if (modelRelation.getKeyMaps().size() != 1)
					continue;
				ModelKeyMap modelKeyMap = modelRelation.getKeyMaps().get(0);
				if (!eClassRef.getEIDAttribute().getName().equals(modelKeyMap.getRelFieldName()))
					continue;

				EStructuralFeature eFeature = eClass.getEStructuralFeature(modelKeyMap.getFieldName());
				if (eFeature == null)
					continue;

				// super reference
				if (eClass != eFeature.eContainer())
					continue;

				if (!(eFeature instanceof EAttribute))
					continue;

				EAttribute eAttribute = (EAttribute) eFeature;

				if (eAttribute.isID()) {
					LOGGER.info("INTERFACE: " + eClassRef.getName() + " -> " + eClass.getName());
					continue;
				}

				updateReference(eClass, eAttribute, eClassRef);
			}
		}
	}

	private static void updateReference(EClass eClass, EAttribute eAttribute, EClass eClassRel) {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EReference eReference = ecoreFactory.createEReference();

		String name = eAttribute.getName();
		if (name.endsWith("Id"))
			name = name.substring(0, name.length() - 2);
		eReference.setName(name);

		eReference.setEType(eClassRel);

		for (EAnnotation eAnnotation : eAttribute.getEAnnotations()) {
			if (eAnnotation.getSource().equals(Slot.NS_PREFIX_FORMAT))
				continue;
			eReference.getEAnnotations().add(eAnnotation);
		}

		eReference.setChangeable(eAttribute.isChangeable());
		if (eAttribute.getDefaultValue() != null)
			eReference.setDefaultValue(eAttribute.getDefaultValue());
		if (eAttribute.getDefaultValueLiteral() != null)
			eReference.setDefaultValueLiteral(eAttribute.getDefaultValueLiteral());
		eReference.setDerived(eAttribute.isDerived());
		eReference.setLowerBound(eAttribute.getLowerBound());
		eReference.setTransient(eAttribute.isTransient());
		eReference.setUnsettable(eAttribute.isUnsettable());
		eReference.setUpperBound(eAttribute.getUpperBound());
		eReference.setVolatile(eAttribute.isVolatile());

		eClass.getEStructuralFeatures().remove(eAttribute);
		eClass.getEStructuralFeatures().add(eReference);
	}

	private static void setIndicators(EPackage bizPackage, Map<String, ? extends Object> context, ModelReader modelReader, Set<String> entityNames, List<ModelForm> forms) {

		Queue<String> queue = new LinkedList<String>();
		queue.addAll(entityNames);

		while (!queue.isEmpty()) {
			String entityName = queue.poll();

			ModelEntity modelEntity = modelReader.getModelEntityNoCheck(entityName);
			if (modelEntity == null)
				continue;

			EClass eClass = Frames.getEClass(bizPackage, modelEntity.getEntityName());
			if (eClass == null)
				continue;

			if (!eClass.getESuperTypes().isEmpty()) {
				EClass eSuperType = eClass.getESuperTypes().get(0);
				if (queue.contains(eSuperType.getName())) {
					queue.add(entityName);
					continue;
				}
			}

			for (EAttribute eAttribute : eClass.getEAttributes()) {

				String type = EcoreUtils.getAnnotationValue(eAttribute, Slot.NS_PREFIX_FORMAT, "type");
				if (type == null || !type.equals("indicator"))
					continue;

				if (!eAttribute.getEAnnotations().isEmpty()) {
					List<EAnnotation> newAnnotations = new ArrayList<EAnnotation>();
					for (EAnnotation eAnnotation : eAttribute.getEAnnotations()) {
						if (!eAnnotation.getSource().equals(Slot.NS_PREFIX_FORMAT))
							newAnnotations.add(eAnnotation);
					}

					eAttribute.getEAnnotations().clear();
					eAttribute.getEAnnotations().addAll(newAnnotations);
				}

				ModelFormField formField = null;
				for (ModelForm form : FormUtils.searchForm(forms, eClass.getName())) {
					formField = FormUtils.searchField(form, eAttribute.getName());
					if (formField != null)
						break;
				}

				if (formField != null) {
					EEnum eEnum = Frames.getEEnum(bizPackage, Strings.firstToUpper(formField.getName()));
					if (eEnum == null) {
						eEnum = EcoreUtils.buildEnum(eClass.getEPackage().getESuperPackage(), context, formField);
						if (eEnum != null)
							eClass.getEPackage().getESuperPackage().getEClassifiers().add(eEnum);
					} else {
						EPackage ePackage = Frames.getEPackage(bizPackage, "common", true);
						ePackage.getEClassifiers().add(eEnum);
					}

					if (eEnum != null)
						eAttribute.setEType(eEnum);
				}
			}
		}
	}

	private static void addRoutes(Delegator delegator, List<ModelForm> forms, EPackage bizPackage, Set<String> entityNames) {

		Queue<String> queue = new LinkedList<String>();
		queue.addAll(entityNames);

		while (!queue.isEmpty()) {

			String entityName = queue.poll();

			ModelEntity modelEntity = delegator.getModelReader().getModelEntityNoCheck(entityName);
			if (modelEntity == null)
				continue;

			if (modelEntity.getPksSize() > 1)
				continue;

			EClass eClass = Frames.getEClass(bizPackage, modelEntity.getEntityName());
			if (eClass == null)
				continue;

			// before super type
			if (!eClass.getESuperTypes().isEmpty()) {
				EClass eSuperType = eClass.getESuperTypes().get(0);
				if (queue.contains(eSuperType.getName())) {
					queue.add(entityName);
					continue;
				}
			}

			for (ModelRelation modelRelation : modelEntity.getRelationsList(false, false, true)) {

				// check destination entity
				ModelEntity modelRelEntity = delegator.getModelReader().getModelEntityNoCheck(modelRelation.getRelEntityName());
				if (modelRelEntity == null)
					continue;
				if (modelRelEntity instanceof ModelViewEntity)
					continue;

				// one field map on pk
				if (modelRelation.getKeyMaps().size() != 1)
					continue;
				ModelKeyMap modelKeyMap = modelRelation.getKeyMaps().get(0);
				if (!modelKeyMap.getFieldName().equals(modelEntity.getFirstPkFieldName()))
					continue;
				if (!modelKeyMap.getRelFieldName().equals(modelRelEntity.getFirstPkFieldName()))
					continue;

				ModelField modelFieldRel = modelRelEntity.getField(modelKeyMap.getRelFieldName());
				if (modelFieldRel == null)
					continue;

				String dateConstraint = null;
				switch (modelRelEntity.getPksSize()) {
				case 1:
					"".toString();
					break;
				case 2:
					"".toString();
					break;
				case 3:
					if (ModelUtils.isDateField(modelRelEntity.getPkFields().get(2))) {
						dateConstraint = modelRelEntity.getPkFieldNames().get(2);
						break;
					}

					if (modelRelEntity.getPkFieldNames().get(1).contains("Seq")) {
						// relationType = "sequenced";
					}
				default:
					continue;
				}

				String relationName = modelRelation.getCombinedName();

				// already defined
				boolean defined = false;
				for (EClass superType : eClass.getESuperTypes()) {
					ModelEntity superEntity = delegator.getModelReader().getModelEntityNoCheck(superType.getName());
					if (superEntity == null)
						continue;

					if (superEntity.getRelation(relationName) != null) {
						defined = true;
						break;
					}
				}
				if (defined)
					continue;

				// name
				String eTypedName = modelRelation.getCombinedName();
				eTypedName = ModelUtil.lowerFirstChar(eTypedName);
				eTypedName = ModelUtils.pluralization(eTypedName);

				// reference
				EReference eReference = EcoreFactory.eINSTANCE.createEReference();
				eReference.setName(eTypedName);

				// type
				EClass eClassRel = Frames.getEClass(bizPackage, modelRelEntity.getEntityName());
				eReference.setEType(eClassRel);

				eReference.setDerived(true);

				// cardinality
				eReference.setUpperBound(-1);

				if (dateConstraint != null) {
					EcoreUtils.addAnnotationKey(eReference, Slot.NS_PREFIX_SLOT_CONSTRAINTS, dateConstraint, "*NOW");
				}

				eClass.getEStructuralFeatures().add(eReference);
			}
		}
	}

	private static void reorderFeatures(EPackage bizPackage, Set<String> entityNames) {

		// set superClass
		for (String entityName : entityNames) {

			EClass eClass = Frames.getEClass(bizPackage, entityName);

			List<EStructuralFeature> keys = new ArrayList<EStructuralFeature>();
			List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();

			for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
				if (eStructuralFeature instanceof EAttribute && ((EAttribute) eStructuralFeature).isID()) {
					keys.add(eStructuralFeature);
					continue;
				}
				if (EcoreUtils.getAnnotationValue(eStructuralFeature, Slot.NS_PREFIX_SLOT, "key") != null)
					keys.add(eStructuralFeature);
				else
					features.add(eStructuralFeature);
			}

			Collections.sort(keys, new Comparator<EStructuralFeature>() {
				@Override
				public int compare(EStructuralFeature o1, EStructuralFeature o2) {
					if (o1 instanceof EReference && o2 instanceof EAttribute)
						return -1;
					else
						return 0;
				}
			});

			Collections.sort(features, new Comparator<EStructuralFeature>() {
				@Override
				public int compare(EStructuralFeature o1, EStructuralFeature o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});

			eClass.getEStructuralFeatures().clear();
			eClass.getEStructuralFeatures().addAll(keys);
			eClass.getEStructuralFeatures().addAll(features);
		}
	}

	private static EPackage writePackage(EPackage bizPackage, Map<String, Object> context) throws Exception {

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		Resource resource = resourceSet.createResource(URI.createURI("biz-model.ecore"));
		resource.getContents().add(bizPackage);

		String pathTo = context.get("pathTo").toString();
		File file = new File(pathTo + resource.getURI().lastSegment());

		try (FileOutputStream fos = new FileOutputStream(file)) {
			resource.save(fos, null);

			replaceFileReferences(file);
		}

		resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		bizPackage = (EPackage) resource.getContents().get(0);
		return bizPackage;

	}

	private static void replaceFileReferences(File file) throws IOException {

		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = "";
			while ((line = reader.readLine()) != null) {
				line = line.replaceFirst("ecore:EClass http://www.abchip.org/mimo/biz/model#//", "#//");
				line = line.replaceFirst("ecore:EClass biz-model.ecore#//", "#//");
				line = line.replaceFirst("biz-model.ecore#//", "#//");
				line = line.replaceFirst("http://www.abchip.org/mimo/biz#//", "../../org.abchip.mimo.biz.core/model/biz.ecore#//");
				line = line.replaceAll("http://www.abchip.org/mimo#//", "../../org.abchip.mimo.core/model/mimo.ecore#//");

				// from original model
				int p = line.indexOf("ecore:EClass http://www.abchip.org/mimo/biz/model/");
				if (p != -1) {
					line = line.replaceFirst("ecore:EClass http://www.abchip.org/mimo/biz/model/", "#//");
					line = line.substring(0, p + 3) + line.substring(p + 3).replaceFirst("#//", "/");
				}

				stringBuilder.append(line);
				stringBuilder.append(ls);
			}
		}

		try (FileWriter writer = new FileWriter(file)) {
			writer.write(stringBuilder.toString());
		}
	}
}