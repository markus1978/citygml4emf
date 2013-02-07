/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractTimeReferenceSystemType;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Time Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AbstractTimeReferenceSystemTypeImpl#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractTimeReferenceSystemTypeImpl extends DefinitionTypeImpl implements AbstractTimeReferenceSystemType {
	/**
	 * The default value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_OF_VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected String domainOfValidity = DOMAIN_OF_VALIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTimeReferenceSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getAbstractTimeReferenceSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainOfValidity() {
		return domainOfValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainOfValidity(String newDomainOfValidity) {
		String oldDomainOfValidity = domainOfValidity;
		domainOfValidity = newDomainOfValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.ABSTRACT_TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY, oldDomainOfValidity, domainOfValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity(DOMAIN_OF_VALIDITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_TIME_REFERENCE_SYSTEM_TYPE__DOMAIN_OF_VALIDITY:
				return DOMAIN_OF_VALIDITY_EDEFAULT == null ? domainOfValidity != null : !DOMAIN_OF_VALIDITY_EDEFAULT.equals(domainOfValidity);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (domainOfValidity: ");
		result.append(domainOfValidity);
		result.append(')');
		return result.toString();
	}

} //AbstractTimeReferenceSystemTypeImpl
