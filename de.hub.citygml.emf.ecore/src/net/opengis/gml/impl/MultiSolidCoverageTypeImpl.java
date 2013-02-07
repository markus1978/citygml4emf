/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.MultiSolidCoverageType;
import net.opengis.gml.MultiSolidDomainType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Solid Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiSolidCoverageTypeImpl#getMultiSolidDomain <em>Multi Solid Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiSolidCoverageTypeImpl extends AbstractDiscreteCoverageTypeImpl implements MultiSolidCoverageType {
	/**
	 * The cached value of the '{@link #getMultiSolidDomain() <em>Multi Solid Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiSolidDomain()
	 * @generated
	 * @ordered
	 */
	protected MultiSolidDomainType multiSolidDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiSolidCoverageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getMultiSolidCoverageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSolidDomainType getMultiSolidDomain() {
		return multiSolidDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiSolidDomain(MultiSolidDomainType newMultiSolidDomain, NotificationChain msgs) {
		MultiSolidDomainType oldMultiSolidDomain = multiSolidDomain;
		multiSolidDomain = newMultiSolidDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN, oldMultiSolidDomain, newMultiSolidDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiSolidDomain(MultiSolidDomainType newMultiSolidDomain) {
		if (newMultiSolidDomain != multiSolidDomain) {
			NotificationChain msgs = null;
			if (multiSolidDomain != null)
				msgs = ((InternalEObject)multiSolidDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN, null, msgs);
			if (newMultiSolidDomain != null)
				msgs = ((InternalEObject)newMultiSolidDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN, null, msgs);
			msgs = basicSetMultiSolidDomain(newMultiSolidDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN, newMultiSolidDomain, newMultiSolidDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN:
				return basicSetMultiSolidDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN:
				return getMultiSolidDomain();
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
			case GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN:
				setMultiSolidDomain((MultiSolidDomainType)newValue);
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
			case GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN:
				setMultiSolidDomain((MultiSolidDomainType)null);
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
			case GmlPackage.MULTI_SOLID_COVERAGE_TYPE__MULTI_SOLID_DOMAIN:
				return multiSolidDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiSolidCoverageTypeImpl
