/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.content.content;

import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.EntityInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Search Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getContentSearchResult <em>Content Search Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getConstraintSeqId <em>Constraint Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getAnyPrefix <em>Any Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getAnySuffix <em>Any Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getConstraintName <em>Constraint Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getIncludeSubCategories <em>Include Sub Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getInfoString <em>Info String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getIsAnd <em>Is And</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getLowValue <em>Low Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getRemoveStems <em>Remove Stems</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint()
 * @model annotation="mimo-ent-frame title='Content Search Result Constraint'"
 * @generated
 */
public interface ContentSearchConstraint extends EntityIdentifiable, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Content Search Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Search Result</em>' reference.
	 * @see #setContentSearchResult(ContentSearchResult)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_ContentSearchResult()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ContentSearchResult getContentSearchResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getContentSearchResult <em>Content Search Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Search Result</em>' reference.
	 * @see #getContentSearchResult()
	 * @generated
	 */
	void setContentSearchResult(ContentSearchResult value);

	/**
	 * Returns the value of the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Name</em>' attribute.
	 * @see #setConstraintName(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_ConstraintName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConstraintName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getConstraintName <em>Constraint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Name</em>' attribute.
	 * @see #getConstraintName()
	 * @generated
	 */
	void setConstraintName(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Seq Id</em>' attribute.
	 * @see #setConstraintSeqId(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_ConstraintSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConstraintSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getConstraintSeqId <em>Constraint Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Seq Id</em>' attribute.
	 * @see #getConstraintSeqId()
	 * @generated
	 */
	void setConstraintSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Any Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Prefix</em>' attribute.
	 * @see #setAnyPrefix(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_AnyPrefix()
	 * @model
	 * @generated
	 */
	String getAnyPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getAnyPrefix <em>Any Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Prefix</em>' attribute.
	 * @see #getAnyPrefix()
	 * @generated
	 */
	void setAnyPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Any Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Suffix</em>' attribute.
	 * @see #setAnySuffix(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_AnySuffix()
	 * @model
	 * @generated
	 */
	String getAnySuffix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getAnySuffix <em>Any Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any Suffix</em>' attribute.
	 * @see #getAnySuffix()
	 * @generated
	 */
	void setAnySuffix(String value);

	/**
	 * Returns the value of the '<em><b>High Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High Value</em>' attribute.
	 * @see #setHighValue(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_HighValue()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getHighValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getHighValue <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High Value</em>' attribute.
	 * @see #getHighValue()
	 * @generated
	 */
	void setHighValue(String value);

	/**
	 * Returns the value of the '<em><b>Include Sub Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Sub Categories</em>' attribute.
	 * @see #setIncludeSubCategories(Boolean)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_IncludeSubCategories()
	 * @model
	 * @generated
	 */
	Boolean getIncludeSubCategories();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getIncludeSubCategories <em>Include Sub Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Sub Categories</em>' attribute.
	 * @see #getIncludeSubCategories()
	 * @generated
	 */
	void setIncludeSubCategories(Boolean value);

	/**
	 * Returns the value of the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info String</em>' attribute.
	 * @see #setInfoString(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_InfoString()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getInfoString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getInfoString <em>Info String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info String</em>' attribute.
	 * @see #getInfoString()
	 * @generated
	 */
	void setInfoString(String value);

	/**
	 * Returns the value of the '<em><b>Is And</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is And</em>' attribute.
	 * @see #setIsAnd(Boolean)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_IsAnd()
	 * @model
	 * @generated
	 */
	Boolean getIsAnd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getIsAnd <em>Is And</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is And</em>' attribute.
	 * @see #getIsAnd()
	 * @generated
	 */
	void setIsAnd(Boolean value);

	/**
	 * Returns the value of the '<em><b>Low Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low Value</em>' attribute.
	 * @see #setLowValue(String)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_LowValue()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLowValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getLowValue <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Value</em>' attribute.
	 * @see #getLowValue()
	 * @generated
	 */
	void setLowValue(String value);

	/**
	 * Returns the value of the '<em><b>Remove Stems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Stems</em>' attribute.
	 * @see #setRemoveStems(Boolean)
	 * @see org.abchip.mimo.biz.model.content.content.ContentPackage#getContentSearchConstraint_RemoveStems()
	 * @model
	 * @generated
	 */
	Boolean getRemoveStems();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.model.content.content.ContentSearchConstraint#getRemoveStems <em>Remove Stems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Stems</em>' attribute.
	 * @see #getRemoveStems()
	 * @generated
	 */
	void setRemoveStems(Boolean value);

} // ContentSearchConstraint
