/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.model.party.contact.impl;

import org.abchip.mimo.biz.model.party.contact.ContactPackage;
import org.abchip.mimo.biz.model.party.contact.EmailAddress;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Email
 * Address</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.model.party.contact.impl.EmailAddressImpl#getEmailAddress <em>Email Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailAddressImpl extends ContactMechImpl implements EmailAddress {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EmailAddressImpl() {
		super();
		
		this.eAdapters().add(new AdapterImpl() {
			  public boolean isAdapterForType(Object type) {
			    return false;
			  }

			  public void notifyChanged(Notification msg) {
				  
				  if(msg.getFeature().equals(ContactPackage.eINSTANCE.getEmailAddress_EmailAddress())) {
					  switch (msg.getEventType()) {
						case Notification.SET:
							eSet(ContactPackage.Literals.CONTACT_MECH__INFO_STRING, msg.getNewStringValue());
							break;
						case Notification.UNSET:
							eUnset(ContactPackage.Literals.CONTACT_MECH__INFO_STRING);
							break;
					  }
					  msg.toString();
				  }
			  }
		});
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.EMAIL_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailAddress() {
		return (String)eGet(ContactPackage.Literals.EMAIL_ADDRESS__EMAIL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailAddress(String newEmailAddress) {
		eSet(ContactPackage.Literals.EMAIL_ADDRESS__EMAIL_ADDRESS, newEmailAddress);
	}

} // EmailAddressImpl
