/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.workeffort.workeffort.impl;

import org.abchip.mimo.biz.impl.BizEntityNoteImpl;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkEffortNote;
import org.abchip.mimo.biz.model.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortNoteImpl#getWorkEffort <em>Work Effort</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.model.workeffort.workeffort.impl.WorkEffortNoteImpl#isInternalNote <em>Internal Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortNoteImpl extends BizEntityNoteImpl implements WorkEffortNote {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkEffort getWorkEffort() {
		return (WorkEffort)eGet(WorkeffortPackage.Literals.WORK_EFFORT_NOTE__WORK_EFFORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffort(WorkEffort newWorkEffort) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_NOTE__WORK_EFFORT, newWorkEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInternalNote() {
		return (Boolean)eGet(WorkeffortPackage.Literals.WORK_EFFORT_NOTE__INTERNAL_NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalNote(boolean newInternalNote) {
		eSet(WorkeffortPackage.Literals.WORK_EFFORT_NOTE__INTERNAL_NOTE, newInternalNote);
	}

} //WorkEffortNoteImpl
