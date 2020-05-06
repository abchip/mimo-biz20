/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.impl;

import org.abchip.mimo.MimoPackage;
import org.abchip.mimo.application.ApplicationPackage;
import org.abchip.mimo.biz.BizComponent;
import org.abchip.mimo.biz.BizEntityNote;
import org.abchip.mimo.biz.BizEntityNoteData;
import org.abchip.mimo.biz.BizFactory;
import org.abchip.mimo.biz.BizModule;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BizPackageImpl extends EPackageImpl implements BizPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bizComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bizModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bizEntityNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bizEntityNoteDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.biz.BizPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BizPackageImpl() {
		super(eNS_URI, BizFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BizPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BizPackage init() {
		if (isInited) return (BizPackage)EPackage.Registry.INSTANCE.getEPackage(BizPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBizPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BizPackageImpl theBizPackage = registeredBizPackage instanceof BizPackageImpl ? (BizPackageImpl)registeredBizPackage : new BizPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBizPackage.createPackageContents();

		// Initialize created meta-data
		theBizPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBizPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BizPackage.eNS_URI, theBizPackage);
		return theBizPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBizComponent() {
		return bizComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizComponent_Plugin() {
		return (EAttribute)bizComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBizComponent_BizModules() {
		return (EReference)bizComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizComponent_ModulesDir() {
		return (EAttribute)bizComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBizModule() {
		return bizModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizModule_Name() {
		return (EAttribute)bizModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizModule_Status() {
		return (EAttribute)bizModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBizEntityNote() {
		return bizEntityNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNote_NoteId() {
		return (EAttribute)bizEntityNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBizEntityNoteData() {
		return bizEntityNoteDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNoteData_NoteId() {
		return (EAttribute)bizEntityNoteDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNoteData_MoreInfoItemId() {
		return (EAttribute)bizEntityNoteDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNoteData_MoreInfoItemName() {
		return (EAttribute)bizEntityNoteDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNoteData_MoreInfoUrl() {
		return (EAttribute)bizEntityNoteDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNoteData_NoteDateTime() {
		return (EAttribute)bizEntityNoteDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNoteData_NoteInfo() {
		return (EAttribute)bizEntityNoteDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNoteData_NoteName() {
		return (EAttribute)bizEntityNoteDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBizEntityNoteData_NoteParty() {
		return (EAttribute)bizEntityNoteDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizFactory getBizFactory() {
		return (BizFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bizComponentEClass = createEClass(BIZ_COMPONENT);
		createEAttribute(bizComponentEClass, BIZ_COMPONENT__PLUGIN);
		createEReference(bizComponentEClass, BIZ_COMPONENT__BIZ_MODULES);
		createEAttribute(bizComponentEClass, BIZ_COMPONENT__MODULES_DIR);

		bizEntityNoteEClass = createEClass(BIZ_ENTITY_NOTE);
		createEAttribute(bizEntityNoteEClass, BIZ_ENTITY_NOTE__NOTE_ID);

		bizEntityNoteDataEClass = createEClass(BIZ_ENTITY_NOTE_DATA);
		createEAttribute(bizEntityNoteDataEClass, BIZ_ENTITY_NOTE_DATA__NOTE_ID);
		createEAttribute(bizEntityNoteDataEClass, BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_ID);
		createEAttribute(bizEntityNoteDataEClass, BIZ_ENTITY_NOTE_DATA__MORE_INFO_ITEM_NAME);
		createEAttribute(bizEntityNoteDataEClass, BIZ_ENTITY_NOTE_DATA__MORE_INFO_URL);
		createEAttribute(bizEntityNoteDataEClass, BIZ_ENTITY_NOTE_DATA__NOTE_DATE_TIME);
		createEAttribute(bizEntityNoteDataEClass, BIZ_ENTITY_NOTE_DATA__NOTE_INFO);
		createEAttribute(bizEntityNoteDataEClass, BIZ_ENTITY_NOTE_DATA__NOTE_NAME);
		createEAttribute(bizEntityNoteDataEClass, BIZ_ENTITY_NOTE_DATA__NOTE_PARTY);

		bizModuleEClass = createEClass(BIZ_MODULE);
		createEAttribute(bizModuleEClass, BIZ_MODULE__NAME);
		createEAttribute(bizModuleEClass, BIZ_MODULE__STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bizComponentEClass.getESuperTypes().add(theApplicationPackage.getApplicationComponent());
		bizEntityNoteEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		bizEntityNoteEClass.getESuperTypes().add(theEntityPackage.getEntityInfo());
		bizEntityNoteDataEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		bizEntityNoteDataEClass.getESuperTypes().add(theEntityPackage.getEntityInfo());
		bizModuleEClass.getESuperTypes().add(theEntityPackage.getEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(bizComponentEClass, BizComponent.class, "BizComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBizComponent_Plugin(), ecorePackage.getEString(), "plugin", null, 1, 1, BizComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBizComponent_BizModules(), this.getBizModule(), null, "bizModules", null, 0, -1, BizComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizComponent_ModulesDir(), ecorePackage.getEString(), "modulesDir", null, 0, 1, BizComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bizEntityNoteEClass, BizEntityNote.class, "BizEntityNote", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBizEntityNote_NoteId(), ecorePackage.getEString(), "noteId", null, 1, 1, BizEntityNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bizEntityNoteDataEClass, BizEntityNoteData.class, "BizEntityNoteData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBizEntityNoteData_NoteId(), ecorePackage.getEString(), "noteId", null, 1, 1, BizEntityNoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizEntityNoteData_MoreInfoItemId(), ecorePackage.getEString(), "moreInfoItemId", null, 0, 1, BizEntityNoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizEntityNoteData_MoreInfoItemName(), ecorePackage.getEString(), "moreInfoItemName", null, 0, 1, BizEntityNoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizEntityNoteData_MoreInfoUrl(), ecorePackage.getEString(), "moreInfoUrl", null, 0, 1, BizEntityNoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizEntityNoteData_NoteDateTime(), ecorePackage.getEDate(), "noteDateTime", null, 0, 1, BizEntityNoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizEntityNoteData_NoteInfo(), ecorePackage.getEString(), "noteInfo", null, 0, 1, BizEntityNoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizEntityNoteData_NoteName(), ecorePackage.getEString(), "noteName", null, 0, 1, BizEntityNoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizEntityNoteData_NoteParty(), ecorePackage.getEString(), "noteParty", null, 0, 1, BizEntityNoteData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bizModuleEClass, BizModule.class, "BizModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBizModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, BizModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBizModule_Status(), theApplicationPackage.getModuleStatus(), "status", "ACT", 1, 1, BizModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// mimo-ent-slot
		createMimoentslotAnnotations();
		// mimo-ent-domain
		createMimoentdomainAnnotations();
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-slot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentslotAnnotations() {
		String source = "mimo-ent-slot";
		addAnnotation
		  (getBizEntityNote_NoteId(),
		   source,
		   new String[] {
			   "key", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>mimo-ent-domain</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMimoentdomainAnnotations() {
		String source = "mimo-ent-domain";
		addAnnotation
		  (getBizEntityNoteData_NoteParty(),
		   source,
		   new String[] {
			   "frame", "Party"
		   },
		   new URI[] {
			 URI.createURI(EntityPackage.eNS_URI).appendFragment("//entity/Domain")
		   });
	}

} //BizPackageImpl
