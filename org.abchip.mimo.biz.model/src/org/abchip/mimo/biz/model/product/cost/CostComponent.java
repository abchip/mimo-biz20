/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.cost;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.model.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.model.common.geo.Geo;
import org.abchip.mimo.biz.model.common.uom.Uom;
import org.abchip.mimo.biz.model.party.party.Party;
import org.abchip.mimo.biz.model.product.feature.ProductFeature;
import org.abchip.mimo.biz.model.product.product.Product;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentId <em>Cost Component Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCost <em>Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentAttributes <em>Cost Component Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentCalc <em>Cost Component Calc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentType <em>Cost Component Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostUom <em>Cost Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getFixedAsset <em>Fixed Asset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getGeo <em>Geo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getParty <em>Party</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getProduct <em>Product</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getProductFeature <em>Product Feature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getWorkEffort <em>Work Effort</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface CostComponent extends EntityTyped<CostComponentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(BigDecimal)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_Cost()
	 * @model annotation="mimo-ent-slot help='Higher precision in case it is a calculated number'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Cost Component Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.model.product.cost.CostComponentAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_CostComponentAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<CostComponentAttribute> getCostComponentAttributes();

	/**
	 * Returns the value of the '<em><b>Cost Component Calc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Calc</em>' reference.
	 * @see #setCostComponentCalc(CostComponentCalc)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_CostComponentCalc()
	 * @model
	 * @generated
	 */
	CostComponentCalc getCostComponentCalc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentCalc <em>Cost Component Calc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Calc</em>' reference.
	 * @see #getCostComponentCalc()
	 * @generated
	 */
	void setCostComponentCalc(CostComponentCalc value);

	/**
	 * Returns the value of the '<em><b>Cost Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Type</em>' reference.
	 * @see #setCostComponentType(CostComponentType)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_CostComponentType()
	 * @model
	 * @generated
	 */
	CostComponentType getCostComponentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentType <em>Cost Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Type</em>' reference.
	 * @see #getCostComponentType()
	 * @generated
	 */
	void setCostComponentType(CostComponentType value);

	/**
	 * Returns the value of the '<em><b>Cost Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Uom</em>' reference.
	 * @see #setCostUom(Uom)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_CostUom()
	 * @model
	 * @generated
	 */
	Uom getCostUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostUom <em>Cost Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Uom</em>' reference.
	 * @see #getCostUom()
	 * @generated
	 */
	void setCostUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset</em>' reference.
	 * @see #setFixedAsset(FixedAsset)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_FixedAsset()
	 * @model
	 * @generated
	 */
	FixedAsset getFixedAsset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getFixedAsset <em>Fixed Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset</em>' reference.
	 * @see #getFixedAsset()
	 * @generated
	 */
	void setFixedAsset(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Geo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo</em>' reference.
	 * @see #setGeo(Geo)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_Geo()
	 * @model
	 * @generated
	 */
	Geo getGeo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getGeo <em>Geo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo</em>' reference.
	 * @see #getGeo()
	 * @generated
	 */
	void setGeo(Geo value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' reference.
	 * @see #setParty(Party)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_Party()
	 * @model
	 * @generated
	 */
	Party getParty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getParty <em>Party</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Party value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Product Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature</em>' reference.
	 * @see #setProductFeature(ProductFeature)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_ProductFeature()
	 * @model
	 * @generated
	 */
	ProductFeature getProductFeature();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getProductFeature <em>Product Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature</em>' reference.
	 * @see #getProductFeature()
	 * @generated
	 */
	void setProductFeature(ProductFeature value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Work Effort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort</em>' reference.
	 * @see #setWorkEffort(WorkEffort)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_WorkEffort()
	 * @model
	 * @generated
	 */
	WorkEffort getWorkEffort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getWorkEffort <em>Work Effort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort</em>' reference.
	 * @see #getWorkEffort()
	 * @generated
	 */
	void setWorkEffort(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Cost Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Component Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Component Id</em>' attribute.
	 * @see #setCostComponentId(String)
	 * @see org.abchip.mimo.biz.model.product.cost.CostPackage#getCostComponent_CostComponentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCostComponentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.cost.CostComponent#getCostComponentId <em>Cost Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Component Id</em>' attribute.
	 * @see #getCostComponentId()
	 * @generated
	 */
	void setCostComponentId(String value);

} // CostComponent
