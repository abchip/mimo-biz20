/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.product.config;

import java.util.Date;
import org.abchip.mimo.biz.model.content.content.Content;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prod Conf Item Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getConfigItem <em>Config Item</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getConfItemContentType <em>Conf Item Content Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProdConfItemContent()
 * @model annotation="mimo-ent-frame title='Product Configuration Question Data Object' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProdConfItemContent extends EntityTyped<ProdConfItemContentType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Config Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Item</em>' reference.
	 * @see #setConfigItem(ProductConfigItem)
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProdConfItemContent_ConfigItem()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductConfigItem getConfigItem();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getConfigItem <em>Config Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Item</em>' reference.
	 * @see #getConfigItem()
	 * @generated
	 */
	void setConfigItem(ProductConfigItem value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(Content)
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProdConfItemContent_Content()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Content getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Content value);

	/**
	 * Returns the value of the '<em><b>Conf Item Content Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Item Content Type</em>' reference.
	 * @see #setConfItemContentType(ProdConfItemContentType)
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProdConfItemContent_ConfItemContentType()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProdConfItemContentType getConfItemContentType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getConfItemContentType <em>Conf Item Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Item Content Type</em>' reference.
	 * @see #getConfItemContentType()
	 * @generated
	 */
	void setConfItemContentType(ProdConfItemContentType value);

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
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProdConfItemContent_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.model.product.config.ConfigPackage#getProdConfItemContent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.product.config.ProdConfItemContent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // ProdConfItemContent
