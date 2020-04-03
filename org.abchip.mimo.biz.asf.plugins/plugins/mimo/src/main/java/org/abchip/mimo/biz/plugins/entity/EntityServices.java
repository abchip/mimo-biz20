/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.biz.plugins.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.Slot;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class EntityServices {

	// private static final String PATH =
	// "C:\\Users\\giugianc_new\\Develop\\ofbiz\\";
	private static final String PATH = "/home/mattia/ofbiz/";

	public static Map<String, Object> exportEntities(DispatchContext dctx, Map<String, Object> context) {

		Delegator delegator = dctx.getDelegator();
		ModelReader modelReader = delegator.getModelReader();

		List<ModelForm> forms = FormUtils.loadEntityForms(dctx, modelReader);

		try {

			EPackage bizPackage = buildBizPackage(delegator, forms);

			Set<String> entityNames = ModelUtils.findEntityNames(modelReader, null);

			setFrameSuper(delegator, bizPackage, entityNames);

			setTextable(modelReader, bizPackage, entityNames);

			setReferences(modelReader, bizPackage, entityNames);

			setIndicators(bizPackage, context, modelReader, entityNames, forms);

			addRoutes(delegator, forms, bizPackage, entityNames);

			reorderFeatures(bizPackage, entityNames);

			writePackage(bizPackage);

			Map<String, Object> resultMap = ServiceUtil.returnSuccess("OK");
			resultMap.put("entityModelPath", PATH);

			return resultMap;
		} catch (GenericEntityException e) {
			Map<String, Object> resultMap = ServiceUtil.returnError(e.getMessage());
			return resultMap;
		}
	}

	private static EPackage buildBizPackage(Delegator delegator, List<ModelForm> forms) throws GenericEntityException {

		EPackage bizPackage = EcoreFactory.eINSTANCE.createEPackage();
		bizPackage.setName("biz");
		bizPackage.setNsPrefix("biz");
		bizPackage.setNsURI("http://www.abchip.org/mimo/biz");

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
		EPackage modulePackage = findESubPackage(bizPackage, packageTokens[3]);
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

	private static EPackage findESubPackage(EPackage relativePackage, String subPackageName) {

		EPackage ePackage = null;

		for (EPackage ePack : relativePackage.getESubpackages()) {
			if (ePack.getName().equals(subPackageName)) {
				ePackage = ePack;
				break;
			}
		}

		return ePackage;
	}

	private static void loadTypes(Delegator delegator, List<ModelForm> forms, EPackage eWorkPackage, Set<String> entityNames) throws GenericEntityException {

		// type
		for (String entityName : entityNames) {
			ModelEntity modelEntity = delegator.getModelEntity(entityName);
			if (modelEntity.getField("hasTable") == null)
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

			if (EcoreUtils.findEClassifier(eWorkPackage, entityName) != null)
				continue;

			EClass eClass = null;

			ModelEntity modelEntity = delegator.getModelEntity(entityName);

			EClass typeEntity = null;
			if (entityName.equals("StatusItem"))
				typeEntity = EcoreUtils.findEClass(eWorkPackage, "StatusType");
			else if (entityName.equals("OrderHeader"))
				typeEntity = EcoreUtils.findEClass(eWorkPackage, "OrderType");
			else
				typeEntity = EcoreUtils.findEClass(eWorkPackage, entityName + "Type");

			if (typeEntity == null && !modelEntity.getEntityName().endsWith("Attr") && !modelEntity.getEntityName().equals("PartyInvitationRoleAssoc")) {

				EClass eClassRel = null;
				for (ModelRelation modelRelation : modelEntity.getRelationsList(true, true, true)) {

					if (modelRelation.getRelEntityName().equals("RoleType"))
						continue;

					if (eClassRel != null)
						eClassRel = EcoreUtils.findEClass(eWorkPackage.getESuperPackage(), modelRelation.getRelEntityName());
					else
						eClassRel = EcoreUtils.findEClass(eWorkPackage.getESuperPackage(), modelRelation.getRelEntityName());

					if (eClassRel != null) {
						EClass eSuperClass = eClassRel.getESuperTypes().get(0);
						if (eSuperClass.equals(BizPackage.eINSTANCE.getBizEntityType())) {
							typeEntity = eClassRel;
							break;
						} else
							eClassRel = null;
					}
				}
			}

			// typed

			if (typeEntity != null) {
				EGenericType eGenericType = typeEntity.getEGenericSuperTypes().get(0);
				if (eGenericType.getETypeArguments().isEmpty()) {
					eClass = EcoreUtils.buildEntityTypedEClass(delegator, forms, typeEntity, modelEntity);

					EGenericType eGenericType2 = ecoreFactory.createEGenericType();
					eGenericType2.setEClassifier(eClass);

					eGenericType.getETypeArguments().add(eGenericType2);
				} else {
					System.out.println("ROLE: " + modelEntity.getEntityName() + " -> " + typeEntity.getName() + "<" + eGenericType.getETypeArguments().get(0).getEClassifier().getName() + ">");
					eClass = EcoreUtils.buildEntityEClass(delegator, forms, modelEntity);
				}
			} else
				eClass = EcoreUtils.buildEntityEClass(delegator, forms, modelEntity);

			eWorkPackage.getEClassifiers().add(eClass);
		}
	}

	private static void resetUnknownTypes(EPackage eWorkPackage, Set<String> entityNames) {

		for (String entityName : entityNames) {

			EClass typeEntity = EcoreUtils.findEClass(eWorkPackage, entityName);
			if (typeEntity == null)
				continue;

			EClass eSuperClass = typeEntity.getESuperTypes().get(0);
			if (!eSuperClass.equals(BizPackage.eINSTANCE.getBizEntityType()))
				continue;

			if (typeEntity.getEGenericSuperTypes().get(0).getETypeArguments().isEmpty()) {
				System.out.println("TYPE: " + typeEntity.getName());
				typeEntity.getEGenericSuperTypes().clear();
				typeEntity.getESuperTypes().clear();
				typeEntity.getESuperTypes().add(BizPackage.eINSTANCE.getBizEntity());
			}
		}
	}

	private static void setFrameSuper(Delegator delegator, EPackage bizPackage, Set<String> entityNames) {

		// set superClass
		for (String entityName : entityNames) {

			EClass eClass = EcoreUtils.findEClass(bizPackage, entityName);

			// with attribute ID
			EAttribute eClassAttributeID = eClass.getEIDAttribute();
			if (eClassAttributeID == null)
				continue;

			String relationEntity = ModelUtils.getSuperEntity(delegator, entityName);
			if (relationEntity == null)
				continue;

			EClass eClassRelation = EcoreUtils.findEClass(bizPackage, relationEntity);

			// relation not found
			if (eClassRelation == null) {
				System.err.println("Model not found: " + relationEntity);
				continue;
			}

			// remove duplicate attribute ID
			eClass.getEStructuralFeatures().remove(eClassAttributeID);

			// super type
			eClass.getESuperTypes().clear();
			eClass.getESuperTypes().add(eClassRelation);
		}
	}

	private static void setTextable(ModelReader modelReader, EPackage bizPackage, Set<String> entityNames) {

		for (String entityName : entityNames) {

			ModelEntity modelEntity = modelReader.getModelEntityNoCheck(entityName);
			if (modelEntity == null)
				continue;

			EClass eClass = EcoreUtils.findEClass(bizPackage, modelEntity.getEntityName());
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

			EClass eClass = EcoreUtils.findEClass(bizPackage, modelEntity.getEntityName());
			if (eClass == null)
				continue;

			if (!eClass.getESuperTypes().isEmpty()) {
				EClass eSuperType = eClass.getESuperTypes().get(0);
				if (queue.contains(eSuperType.getName())) {
					queue.add(entityName);
					continue;
				}
			}

			Map<String, Integer> removeableFeatures = new HashMap<String, Integer>();

			for (ModelRelation modelRelation : modelEntity.getRelationsList(true, true, false)) {

				// no automatic relation
				if (modelRelation.isAutoRelation())
					continue;

				EClass eClassRef = EcoreUtils.findEClass(bizPackage, modelRelation.getRelEntityName());
				if (eClassRef == null) {
					System.out.println("VIEW: " + entityName + " ->  " + modelRelation.getRelEntityName());
					continue;
				}

				// one field map
				if (modelRelation.getKeyMaps().size() == 1) {
					ModelKeyMap modelKeyMap = modelRelation.getKeyMaps().get(0);

					if (eClassRef.getEIDAttribute() == null)
						continue;

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
						System.out.println("INTERFACE: " + eClassRef.getName() + " -> " + eClass.getName());
						continue;
					}

					updateReference(eClass, eAttribute, eClassRef);
				} else {

					if (true)
						continue;

					ModelEntity modelEntityRef = modelReader.getModelEntityNoCheck(modelRelation.getRelEntityName());
					if (modelEntityRef == null)
						continue;

					if (modelEntityRef.getPksSize() != modelRelation.getKeyMaps().size())
						continue;

					boolean referenceFound = true;

					for (ModelKeyMap modelKeyMap : modelRelation.getKeyMaps()) {
						// origin
						ModelField modelFieldFrom = modelEntity.getField(modelKeyMap.getFieldName());
						if (modelFieldFrom.getIsPk()) {
							referenceFound = false;
							break;
						}

						// destination
						if (!modelEntityRef.getField(modelKeyMap.getRelFieldName()).getIsPk()) {
							referenceFound = false;
							break;
						}
					}
					if (!referenceFound)
						continue;

					for (ModelKeyMap modelKeyMap : modelRelation.getKeyMaps()) {

						EStructuralFeature eFeature = eClass.getEStructuralFeature(modelKeyMap.getFieldName());
						if (eFeature == null)
							continue;

						// super reference
						if (eClass != eFeature.eContainer())
							continue;

						String referenceName = Strings.firstToLower(modelEntityRef.getEntityName());
						EReference eReference = (EReference) eClass.getEStructuralFeature(referenceName);
						if (eReference == null) {
							eReference = ecoreFactory.createEReference();
							eReference.setName(referenceName);
							eReference.setEType(eClassRef);
							eReference.setLowerBound(eFeature.getLowerBound());
							eClass.getEStructuralFeatures().add(eReference);

							ModelField modelFieldFrom = modelEntity.getField(modelKeyMap.getFieldName());
							if (modelFieldFrom.getIsPk())
								EcoreUtils.addAnnotationKey(eReference, Slot.NS_PREFIX_SLOT, "key", "true");

							System.err.println(eClass.getName() + "." + eReference.getName());
						}
						EcoreUtils.addAnnotationKey(eReference, Slot.NS_PREFIX_SLOT_MAPPING, modelKeyMap.getFieldName(), modelKeyMap.getRelFieldName());

						if (removeableFeatures.containsKey(eFeature.getName()))
							removeableFeatures.put(eFeature.getName(), removeableFeatures.get(eFeature.getName()) + 1);
						else
							removeableFeatures.put(eFeature.getName(), 0);
					}
				}
			}

			for (Entry<String, Integer> entry : removeableFeatures.entrySet()) {
				EStructuralFeature eFeature = eClass.getEStructuralFeature(entry.getKey());
				if (eFeature == null)
					continue;

				if (entry.getValue() == 0)
					eClass.getEStructuralFeatures().remove(eFeature);
			}
		}
	}

	private static void updateReference(EClass eClass, EAttribute eAttribute, EClass eClassRel) {

		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;

		EReference eReference = ecoreFactory.createEReference();
		eReference.setName(eAttribute.getName());
		eReference.setEType(eClassRel);
		eReference.getEKeys().add(eClassRel.getEIDAttribute());

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

			EClass eClass = EcoreUtils.findEClass(bizPackage, modelEntity.getEntityName());
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
					EEnum eEnum = (EEnum) EcoreUtils.findEClassifier(bizPackage, Strings.firstToUpper(formField.getName()));
					if (eEnum == null) {
						eEnum = EcoreUtils.buildEnum(eClass.getEPackage().getESuperPackage(), context, formField);
						if (eEnum != null)
							eClass.getEPackage().getESuperPackage().getEClassifiers().add(eEnum);
					} else {
						EPackage ePackage = EcoreUtils.findEPackage(bizPackage, "common");
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

			EClass eClass = EcoreUtils.findEClass(bizPackage, modelEntity.getEntityName());
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

			for (ModelRelation modelRelation : modelEntity.getRelationsList(true, true, true)) {

				// many relation
				if (!modelRelation.getType().equals("many"))
					continue;

				// one field map
				if (modelRelation.getKeyMaps().size() > 1)
					continue;

				ModelKeyMap modelKeyMap = modelRelation.getKeyMaps().get(0);

				// check auto-relation
				if (!modelKeyMap.getFieldName().equals(modelEntity.getFirstPkFieldName()))
					continue;

				// check destination entity
				ModelEntity modelRel = delegator.getModelReader().getModelEntityNoCheck(modelRelation.getRelEntityName());
				if (modelRel == null)
					continue;

				if (modelRel instanceof ModelViewEntity)
					continue;

				// TODO date management
				if (modelRel.getPksSize() > 2)
					continue;

				ModelField modelFieldRel = modelRel.getField(modelKeyMap.getRelFieldName());
				if (modelFieldRel == null)
					continue;

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
				EClass eClassRel = EcoreUtils.findEClass(bizPackage, modelRel.getEntityName());
				eReference.setEType(eClassRel);

				eReference.setDerived(true);

				// pk not to pk
				if (!modelKeyMap.getRelFieldName().equals(modelRel.getFirstPkFieldName())) {
					// eReference.getEKeys().add((EAttribute)
					// eClassRel.getEStructuralFeature(modelKeyMap.getRelFieldName()));
					continue;
				}

				// cardinality
				eReference.setUpperBound(-1);

				eClass.getEStructuralFeatures().add(eReference);
			}
		}
	}

	private static void reorderFeatures(EPackage bizPackage, Set<String> entityNames) {

		// set superClass
		for (String entityName : entityNames) {

			EClass eClass = EcoreUtils.findEClass(bizPackage, entityName);

			List<EStructuralFeature> keys = new ArrayList<EStructuralFeature>();
			List<EStructuralFeature> atts = new ArrayList<EStructuralFeature>();

			for (EStructuralFeature eStructuralFeature : eClass.getEStructuralFeatures()) {
				if (eStructuralFeature instanceof EAttribute && ((EAttribute) eStructuralFeature).isID()) {
					keys.add(eStructuralFeature);
					continue;
				}
				if (EcoreUtils.getAnnotationValue(eStructuralFeature, Slot.NS_PREFIX_SLOT, "key") != null)
					keys.add(eStructuralFeature);
				else
					atts.add(eStructuralFeature);
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

			Collections.sort(atts, new Comparator<EStructuralFeature>() {
				@Override
				public int compare(EStructuralFeature o1, EStructuralFeature o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});

			eClass.getEStructuralFeatures().clear();
			eClass.getEStructuralFeatures().addAll(keys);
			eClass.getEStructuralFeatures().addAll(atts);
		}
	}

	private static void writePackage(EPackage bizPackage) {

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		Resource resource = resourceSet.createResource(URI.createURI(bizPackage.getName() + ".ecore"));
		resource.getContents().add(bizPackage);

		File file = new File(PATH + resource.getURI().lastSegment());

		try (FileOutputStream fos = new FileOutputStream(file)) {
			resource.save(fos, null);

			replaceFileReferences(file);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	private static void replaceFileReferences(File file) throws IOException {

		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = "";
			while ((line = reader.readLine()) != null) {
				line = line.replaceFirst("ecore:EClass http://www.abchip.org/mimo/biz#//", "#//");
				line = line.replaceFirst("ecore:EClass biz.ecore#//", "#//");
				line = line.replaceFirst("biz.ecore#//", "#//");
				line = line.replaceFirst("http://www.abchip.org/mimo/biz#//", "#//");
				line = line.replaceFirst("http://www.abchip.org/mimo#//", "../../org.abchip.mimo.core/model/mimo.ecore#//");

				stringBuilder.append(line);
				stringBuilder.append(ls);
			}
		}

		try (FileWriter writer = new FileWriter(file)) {
			writer.write(stringBuilder.toString());
		}
	}
}