/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.MultiCurveCoverageType;
import net.opengis.gml.MultiCurveDomainType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Curve Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiCurveCoverageTypeImpl#getMultiCurveDomain <em>Multi Curve Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiCurveCoverageTypeImpl extends AbstractDiscreteCoverageTypeImpl implements MultiCurveCoverageType {
	/**
	 * The cached value of the '{@link #getMultiCurveDomain() <em>Multi Curve Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiCurveDomain()
	 * @generated
	 * @ordered
	 */
	protected MultiCurveDomainType multiCurveDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiCurveCoverageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getMultiCurveCoverageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurveDomainType getMultiCurveDomain() {
		return multiCurveDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiCurveDomain(MultiCurveDomainType newMultiCurveDomain, NotificationChain msgs) {
		MultiCurveDomainType oldMultiCurveDomain = multiCurveDomain;
		multiCurveDomain = newMultiCurveDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN, oldMultiCurveDomain, newMultiCurveDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiCurveDomain(MultiCurveDomainType newMultiCurveDomain) {
		if (newMultiCurveDomain != multiCurveDomain) {
			NotificationChain msgs = null;
			if (multiCurveDomain != null)
				msgs = ((InternalEObject)multiCurveDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN, null, msgs);
			if (newMultiCurveDomain != null)
				msgs = ((InternalEObject)newMultiCurveDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN, null, msgs);
			msgs = basicSetMultiCurveDomain(newMultiCurveDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN, newMultiCurveDomain, newMultiCurveDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN:
				return basicSetMultiCurveDomain(null, msgs);
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
			case GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN:
				return getMultiCurveDomain();
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
			case GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN:
				setMultiCurveDomain((MultiCurveDomainType)newValue);
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
			case GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN:
				setMultiCurveDomain((MultiCurveDomainType)null);
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
			case GmlPackage.MULTI_CURVE_COVERAGE_TYPE__MULTI_CURVE_DOMAIN:
				return multiCurveDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiCurveCoverageTypeImpl
