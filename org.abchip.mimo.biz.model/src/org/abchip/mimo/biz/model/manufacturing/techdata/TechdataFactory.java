/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.manufacturing.techdata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.model.manufacturing.techdata.TechdataPackage
 * @generated
 */
public interface TechdataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TechdataFactory eINSTANCE = org.abchip.mimo.biz.model.manufacturing.techdata.impl.TechdataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tech Data Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tech Data Calendar</em>'.
	 * @generated
	 */
	TechDataCalendar createTechDataCalendar();

	/**
	 * Returns a new object of class '<em>Tech Data Calendar Exc Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tech Data Calendar Exc Day</em>'.
	 * @generated
	 */
	TechDataCalendarExcDay createTechDataCalendarExcDay();

	/**
	 * Returns a new object of class '<em>Tech Data Calendar Exc Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tech Data Calendar Exc Week</em>'.
	 * @generated
	 */
	TechDataCalendarExcWeek createTechDataCalendarExcWeek();

	/**
	 * Returns a new object of class '<em>Tech Data Calendar Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tech Data Calendar Week</em>'.
	 * @generated
	 */
	TechDataCalendarWeek createTechDataCalendarWeek();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TechdataPackage getTechdataPackage();

} //TechdataFactory
