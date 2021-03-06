/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.order.shoppinglist;

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
 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppinglistFactory
 * @model kind="package"
 * @generated
 */
public interface ShoppinglistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shoppinglist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/model/order/shoppinglist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-shoppinglist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShoppinglistPackage eINSTANCE = org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl <em>Shopping List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingList()
	 * @generated
	 */
	int SHOPPING_LIST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shopping List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHOPPING_LIST_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Carrier Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CARRIER_PARTY_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CARRIER_ROLE_TYPE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contact Mech</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CONTACT_MECH = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Currency Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__CURRENCY_UOM = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__DESCRIPTION = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__IS_ACTIVE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__IS_PUBLIC = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Last Admin Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LAST_ADMIN_MODIFIED = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Last Ordered Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LAST_ORDERED_DATE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__LIST_NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Parent Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PARENT_SHOPPING_LIST = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PARTY = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Payment Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PAYMENT_METHOD = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Product Promo Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PRODUCT_PROMO_CODE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Product Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__PRODUCT_STORE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Recurrence Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__RECURRENCE_INFO = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Shopping List Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHOPPING_LIST_ITEMS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Shopping List Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHOPPING_LIST_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Shopping List Work Efforts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Visitor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST__VISITOR_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Shopping List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListItemImpl <em>Shopping List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListItemImpl
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListItem()
	 * @generated
	 */
	int SHOPPING_LIST_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__SHOPPING_LIST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shopping List Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__CONFIG_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modified Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__MODIFIED_PRICE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__PRODUCT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__QUANTITY = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Quantity Purchased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__QUANTITY_PURCHASED = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__RESERV_LENGTH = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__RESERV_PERSONS = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM__RESERV_START = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Shopping List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListItemSurveyImpl <em>Shopping List Item Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListItemSurveyImpl
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListItemSurvey()
	 * @generated
	 */
	int SHOPPING_LIST_ITEM_SURVEY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Survey Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Shopping List Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Shopping List Item Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_ITEM_SURVEY_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListTypeImpl <em>Shopping List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListTypeImpl
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListType()
	 * @generated
	 */
	int SHOPPING_LIST_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shopping List Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__SHOPPING_LIST_TYPE_ID = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE__DESCRIPTION = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shopping List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListWorkEffortImpl <em>Shopping List Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListWorkEffortImpl
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListWorkEffort()
	 * @generated
	 */
	int SHOPPING_LIST_WORK_EFFORT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__CREATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__CREATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__LAST_UPDATED_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shopping List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shopping List Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPING_LIST_WORK_EFFORT_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList <em>Shopping List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList
	 * @generated
	 */
	EClass getShoppingList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListId <em>Shopping List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_ShoppingListId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCarrierPartyId <em>Carrier Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Party Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCarrierPartyId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_CarrierPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCarrierRoleTypeId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_CarrierRoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getContactMech()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ContactMech();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCurrencyUom <em>Currency Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Uom</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getCurrencyUom()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_CurrencyUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getDescription()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getIsActive()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getIsPublic()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getLastAdminModified <em>Last Admin Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Admin Modified</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getLastAdminModified()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_LastAdminModified();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getLastOrderedDate <em>Last Ordered Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Ordered Date</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getLastOrderedDate()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_LastOrderedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getListName <em>List Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Name</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getListName()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_ListName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getParentShoppingList <em>Parent Shopping List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Shopping List</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getParentShoppingList()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ParentShoppingList();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getParty()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_Party();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getPaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getPaymentMethod()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_PaymentMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getProductPromoCode <em>Product Promo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Code</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getProductPromoCode()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ProductPromoCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getProductStore()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ProductStore();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getRecurrenceInfo <em>Recurrence Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence Info</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getRecurrenceInfo()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_RecurrenceInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShipmentMethodTypeId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListItems <em>Shopping List Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shopping List Items</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListItems()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ShoppingListItems();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListType <em>Shopping List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shopping List Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListType()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ShoppingListType();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListWorkEfforts <em>Shopping List Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shopping List Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getShoppingListWorkEfforts()
	 * @see #getShoppingList()
	 * @generated
	 */
	EReference getShoppingList_ShoppingListWorkEfforts();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getVisitorId <em>Visitor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visitor Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingList#getVisitorId()
	 * @see #getShoppingList()
	 * @generated
	 */
	EAttribute getShoppingList_VisitorId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem <em>Shopping List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List Item</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem
	 * @generated
	 */
	EClass getShoppingListItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getShoppingList <em>Shopping List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shopping List</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getShoppingList()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EReference getShoppingListItem_ShoppingList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getShoppingListItemSeqId()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ShoppingListItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getConfigId()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getModifiedPrice <em>Modified Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Price</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getModifiedPrice()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ModifiedPrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getProduct()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EReference getShoppingListItem_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getQuantity()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getQuantityPurchased <em>Quantity Purchased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Purchased</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getQuantityPurchased()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_QuantityPurchased();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservLength <em>Reserv Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Length</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservLength()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ReservLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservPersons <em>Reserv Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Persons</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservPersons()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ReservPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservStart <em>Reserv Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Start</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItem#getReservStart()
	 * @see #getShoppingListItem()
	 * @generated
	 */
	EAttribute getShoppingListItem_ReservStart();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey <em>Shopping List Item Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List Item Survey</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey
	 * @generated
	 */
	EClass getShoppingListItemSurvey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getShoppingList <em>Shopping List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shopping List</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getShoppingList()
	 * @see #getShoppingListItemSurvey()
	 * @generated
	 */
	EReference getShoppingListItemSurvey_ShoppingList();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getSurveyResponse <em>Survey Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Response</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getSurveyResponse()
	 * @see #getShoppingListItemSurvey()
	 * @generated
	 */
	EReference getShoppingListItemSurvey_SurveyResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListItemSurvey#getShoppingListItemSeqId()
	 * @see #getShoppingListItemSurvey()
	 * @generated
	 */
	EAttribute getShoppingListItemSurvey_ShoppingListItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListType <em>Shopping List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List Type</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListType
	 * @generated
	 */
	EClass getShoppingListType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListType#getShoppingListTypeId <em>Shopping List Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shopping List Type Id</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListType#getShoppingListTypeId()
	 * @see #getShoppingListType()
	 * @generated
	 */
	EAttribute getShoppingListType_ShoppingListTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListType#getDescription()
	 * @see #getShoppingListType()
	 * @generated
	 */
	EAttribute getShoppingListType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort <em>Shopping List Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shopping List Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort
	 * @generated
	 */
	EClass getShoppingListWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort#getShoppingList <em>Shopping List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shopping List</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort#getShoppingList()
	 * @see #getShoppingListWorkEffort()
	 * @generated
	 */
	EReference getShoppingListWorkEffort_ShoppingList();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort#getWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.model.order.shoppinglist.ShoppingListWorkEffort#getWorkEffort()
	 * @see #getShoppingListWorkEffort()
	 * @generated
	 */
	EReference getShoppingListWorkEffort_WorkEffort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShoppinglistFactory getShoppinglistFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl <em>Shopping List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListImpl
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingList()
		 * @generated
		 */
		EClass SHOPPING_LIST = eINSTANCE.getShoppingList();

		/**
		 * The meta object literal for the '<em><b>Shopping List Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__SHOPPING_LIST_ID = eINSTANCE.getShoppingList_ShoppingListId();

		/**
		 * The meta object literal for the '<em><b>Carrier Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__CARRIER_PARTY_ID = eINSTANCE.getShoppingList_CarrierPartyId();

		/**
		 * The meta object literal for the '<em><b>Carrier Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__CARRIER_ROLE_TYPE_ID = eINSTANCE.getShoppingList_CarrierRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__CONTACT_MECH = eINSTANCE.getShoppingList_ContactMech();

		/**
		 * The meta object literal for the '<em><b>Currency Uom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__CURRENCY_UOM = eINSTANCE.getShoppingList_CurrencyUom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__DESCRIPTION = eINSTANCE.getShoppingList_Description();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__IS_ACTIVE = eINSTANCE.getShoppingList_IsActive();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__IS_PUBLIC = eINSTANCE.getShoppingList_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Last Admin Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__LAST_ADMIN_MODIFIED = eINSTANCE.getShoppingList_LastAdminModified();

		/**
		 * The meta object literal for the '<em><b>Last Ordered Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__LAST_ORDERED_DATE = eINSTANCE.getShoppingList_LastOrderedDate();

		/**
		 * The meta object literal for the '<em><b>List Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__LIST_NAME = eINSTANCE.getShoppingList_ListName();

		/**
		 * The meta object literal for the '<em><b>Parent Shopping List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PARENT_SHOPPING_LIST = eINSTANCE.getShoppingList_ParentShoppingList();

		/**
		 * The meta object literal for the '<em><b>Party</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PARTY = eINSTANCE.getShoppingList_Party();

		/**
		 * The meta object literal for the '<em><b>Payment Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PAYMENT_METHOD = eINSTANCE.getShoppingList_PaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PRODUCT_PROMO_CODE = eINSTANCE.getShoppingList_ProductPromoCode();

		/**
		 * The meta object literal for the '<em><b>Product Store</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__PRODUCT_STORE = eINSTANCE.getShoppingList_ProductStore();

		/**
		 * The meta object literal for the '<em><b>Recurrence Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__RECURRENCE_INFO = eINSTANCE.getShoppingList_RecurrenceInfo();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getShoppingList_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Shopping List Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__SHOPPING_LIST_ITEMS = eINSTANCE.getShoppingList_ShoppingListItems();

		/**
		 * The meta object literal for the '<em><b>Shopping List Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__SHOPPING_LIST_TYPE = eINSTANCE.getShoppingList_ShoppingListType();

		/**
		 * The meta object literal for the '<em><b>Shopping List Work Efforts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST__SHOPPING_LIST_WORK_EFFORTS = eINSTANCE.getShoppingList_ShoppingListWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Visitor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST__VISITOR_ID = eINSTANCE.getShoppingList_VisitorId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListItemImpl <em>Shopping List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListItemImpl
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListItem()
		 * @generated
		 */
		EClass SHOPPING_LIST_ITEM = eINSTANCE.getShoppingListItem();

		/**
		 * The meta object literal for the '<em><b>Shopping List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_ITEM__SHOPPING_LIST = eINSTANCE.getShoppingListItem_ShoppingList();

		/**
		 * The meta object literal for the '<em><b>Shopping List Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID = eINSTANCE.getShoppingListItem_ShoppingListItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__CONFIG_ID = eINSTANCE.getShoppingListItem_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Modified Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__MODIFIED_PRICE = eINSTANCE.getShoppingListItem_ModifiedPrice();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_ITEM__PRODUCT = eINSTANCE.getShoppingListItem_Product();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__QUANTITY = eINSTANCE.getShoppingListItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quantity Purchased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__QUANTITY_PURCHASED = eINSTANCE.getShoppingListItem_QuantityPurchased();

		/**
		 * The meta object literal for the '<em><b>Reserv Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__RESERV_LENGTH = eINSTANCE.getShoppingListItem_ReservLength();

		/**
		 * The meta object literal for the '<em><b>Reserv Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__RESERV_PERSONS = eINSTANCE.getShoppingListItem_ReservPersons();

		/**
		 * The meta object literal for the '<em><b>Reserv Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM__RESERV_START = eINSTANCE.getShoppingListItem_ReservStart();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListItemSurveyImpl <em>Shopping List Item Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListItemSurveyImpl
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListItemSurvey()
		 * @generated
		 */
		EClass SHOPPING_LIST_ITEM_SURVEY = eINSTANCE.getShoppingListItemSurvey();

		/**
		 * The meta object literal for the '<em><b>Shopping List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST = eINSTANCE.getShoppingListItemSurvey_ShoppingList();

		/**
		 * The meta object literal for the '<em><b>Survey Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE = eINSTANCE.getShoppingListItemSurvey_SurveyResponse();

		/**
		 * The meta object literal for the '<em><b>Shopping List Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID = eINSTANCE.getShoppingListItemSurvey_ShoppingListItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListTypeImpl <em>Shopping List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListTypeImpl
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListType()
		 * @generated
		 */
		EClass SHOPPING_LIST_TYPE = eINSTANCE.getShoppingListType();

		/**
		 * The meta object literal for the '<em><b>Shopping List Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_TYPE__SHOPPING_LIST_TYPE_ID = eINSTANCE.getShoppingListType_ShoppingListTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPING_LIST_TYPE__DESCRIPTION = eINSTANCE.getShoppingListType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListWorkEffortImpl <em>Shopping List Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppingListWorkEffortImpl
		 * @see org.abchip.mimo.biz.model.order.shoppinglist.impl.ShoppinglistPackageImpl#getShoppingListWorkEffort()
		 * @generated
		 */
		EClass SHOPPING_LIST_WORK_EFFORT = eINSTANCE.getShoppingListWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Shopping List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_WORK_EFFORT__SHOPPING_LIST = eINSTANCE.getShoppingListWorkEffort_ShoppingList();

		/**
		 * The meta object literal for the '<em><b>Work Effort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPING_LIST_WORK_EFFORT__WORK_EFFORT = eINSTANCE.getShoppingListWorkEffort_WorkEffort();

	}

} //ShoppinglistPackage
