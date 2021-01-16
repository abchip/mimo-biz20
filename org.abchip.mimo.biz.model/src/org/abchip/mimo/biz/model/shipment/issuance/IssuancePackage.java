/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.shipment.issuance;

import org.abchip.mimo.entity.EntityPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.shipment.issuance.IssuanceFactory
 * @model kind="package"
 * @generated
 */
public interface IssuancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "issuance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/shipment/issuance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-issuance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IssuancePackage eINSTANCE = org.abchip.mimo.biz.model.shipment.issuance.impl.IssuancePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.shipment.issuance.impl.ItemIssuanceImpl <em>Item Issuance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.shipment.issuance.impl.ItemIssuanceImpl
	 * @see org.abchip.mimo.biz.model.shipment.issuance.impl.IssuancePackageImpl#getItemIssuance()
	 * @generated
	 */
	int ITEM_ISSUANCE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item Issuance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__ITEM_ISSUANCE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cancel Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__CANCEL_QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__FIXED_ASSET_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inventory Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__INVENTORY_ITEM = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Issued By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__ISSUED_BY_USER_LOGIN = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Issued Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__ISSUED_DATE_TIME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__MAINT_HIST_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__ORDER = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__ORDER_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__SHIP_GROUP_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Shipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__SHIPMENT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE__SHIPMENT_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Item Issuance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.shipment.issuance.impl.ItemIssuanceRoleImpl <em>Item Issuance Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.shipment.issuance.impl.ItemIssuanceRoleImpl
	 * @see org.abchip.mimo.biz.model.shipment.issuance.impl.IssuancePackageImpl#getItemIssuanceRole()
	 * @generated
	 */
	int ITEM_ISSUANCE_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_ROLE__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_ROLE__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_ROLE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_ROLE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item Issuance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_ROLE__ITEM_ISSUANCE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_ROLE__PARTY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_ROLE__ROLE_TYPE_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Issuance Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ISSUANCE_ROLE_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance <em>Item Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Issuance</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance
	 * @generated
	 */
	EClass getItemIssuance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getItemIssuanceId <em>Item Issuance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Issuance Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getItemIssuanceId()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_ItemIssuanceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getCancelQuantity <em>Cancel Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getCancelQuantity()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_CancelQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getFixedAssetId()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getInventoryItem <em>Inventory Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getInventoryItem()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EReference getItemIssuance_InventoryItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getIssuedByUserLogin <em>Issued By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issued By User Login</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getIssuedByUserLogin()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EReference getItemIssuance_IssuedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getIssuedDateTime <em>Issued Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issued Date Time</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getIssuedDateTime()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_IssuedDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getMaintHistSeqId <em>Maint Hist Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maint Hist Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getMaintHistSeqId()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_MaintHistSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getOrder()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EReference getItemIssuance_Order();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getOrderItemSeqId()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getQuantity()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipGroupSeqId()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_ShipGroupSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipment()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EReference getItemIssuance_Shipment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuance#getShipmentItemSeqId()
	 * @see #getItemIssuance()
	 * @generated
	 */
	EAttribute getItemIssuance_ShipmentItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuanceRole <em>Item Issuance Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Issuance Role</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuanceRole
	 * @generated
	 */
	EClass getItemIssuanceRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuanceRole#getItemIssuance <em>Item Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Issuance</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuanceRole#getItemIssuance()
	 * @see #getItemIssuanceRole()
	 * @generated
	 */
	EReference getItemIssuanceRole_ItemIssuance();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuanceRole#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuanceRole#getParty()
	 * @see #getItemIssuanceRole()
	 * @generated
	 */
	EReference getItemIssuanceRole_Party();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.shipment.issuance.ItemIssuanceRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.shipment.issuance.ItemIssuanceRole#getRoleTypeId()
	 * @see #getItemIssuanceRole()
	 * @generated
	 */
	EAttribute getItemIssuanceRole_RoleTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IssuanceFactory getIssuanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.shipment.issuance.impl.ItemIssuanceImpl <em>Item Issuance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.shipment.issuance.impl.ItemIssuanceImpl
		 * @see org.abchip.mimo.biz.model.shipment.issuance.impl.IssuancePackageImpl#getItemIssuance()
		 * @generated
		 */
		EClass ITEM_ISSUANCE = eINSTANCE.getItemIssuance();

		/**
		 * The meta object literal for the '<em><b>Item Issuance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__ITEM_ISSUANCE_ID = eINSTANCE.getItemIssuance_ItemIssuanceId();

		/**
		 * The meta object literal for the '<em><b>Cancel Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__CANCEL_QUANTITY = eINSTANCE.getItemIssuance_CancelQuantity();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__FIXED_ASSET_ID = eINSTANCE.getItemIssuance_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Inventory Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ISSUANCE__INVENTORY_ITEM = eINSTANCE.getItemIssuance_InventoryItem();

		/**
		 * The meta object literal for the '<em><b>Issued By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ISSUANCE__ISSUED_BY_USER_LOGIN = eINSTANCE.getItemIssuance_IssuedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Issued Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__ISSUED_DATE_TIME = eINSTANCE.getItemIssuance_IssuedDateTime();

		/**
		 * The meta object literal for the '<em><b>Maint Hist Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__MAINT_HIST_SEQ_ID = eINSTANCE.getItemIssuance_MaintHistSeqId();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ISSUANCE__ORDER = eINSTANCE.getItemIssuance_Order();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__ORDER_ITEM_SEQ_ID = eINSTANCE.getItemIssuance_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__QUANTITY = eINSTANCE.getItemIssuance_Quantity();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__SHIP_GROUP_SEQ_ID = eINSTANCE.getItemIssuance_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ISSUANCE__SHIPMENT = eINSTANCE.getItemIssuance_Shipment();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getItemIssuance_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.shipment.issuance.impl.ItemIssuanceRoleImpl <em>Item Issuance Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.shipment.issuance.impl.ItemIssuanceRoleImpl
		 * @see org.abchip.mimo.biz.model.shipment.issuance.impl.IssuancePackageImpl#getItemIssuanceRole()
		 * @generated
		 */
		EClass ITEM_ISSUANCE_ROLE = eINSTANCE.getItemIssuanceRole();

		/**
		 * The meta object literal for the '<em><b>Item Issuance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ISSUANCE_ROLE__ITEM_ISSUANCE = eINSTANCE.getItemIssuanceRole_ItemIssuance();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_ISSUANCE_ROLE__PARTY = eINSTANCE.getItemIssuanceRole_Party();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ISSUANCE_ROLE__ROLE_TYPE_ID = eINSTANCE.getItemIssuanceRole_RoleTypeId();

	}

} //IssuancePackage
