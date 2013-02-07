/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.CoordinateSystemRefType;
import net.opengis.gml.EngineeringCRSType;
import net.opengis.gml.EngineeringDatumRefType;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineering CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.EngineeringCRSTypeImpl#getUsesCS <em>Uses CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.EngineeringCRSTypeImpl#getUsesEngineeringDatum <em>Uses Engineering Datum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EngineeringCRSTypeImpl extends AbstractReferenceSystemTypeImpl implements EngineeringCRSType {
	/**
	 * The cached value of the '{@link #getUsesCS() <em>Uses CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesCS()
	 * @generated
	 * @ordered
	 */
	protected CoordinateSystemRefType usesCS;

	/**
	 * The cached value of the '{@link #getUsesEngineeringDatum() <em>Uses Engineering Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesEngineeringDatum()
	 * @generated
	 * @ordered
	 */
	protected EngineeringDatumRefType usesEngineeringDatum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineeringCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getEngineeringCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateSystemRefType getUsesCS() {
		return usesCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesCS(CoordinateSystemRefType newUsesCS, NotificationChain msgs) {
		CoordinateSystemRefType oldUsesCS = usesCS;
		usesCS = newUsesCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.ENGINEERING_CRS_TYPE__USES_CS, oldUsesCS, newUsesCS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesCS(CoordinateSystemRefType newUsesCS) {
		if (newUsesCS != usesCS) {
			NotificationChain msgs = null;
			if (usesCS != null)
				msgs = ((InternalEObject)usesCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ENGINEERING_CRS_TYPE__USES_CS, null, msgs);
			if (newUsesCS != null)
				msgs = ((InternalEObject)newUsesCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ENGINEERING_CRS_TYPE__USES_CS, null, msgs);
			msgs = basicSetUsesCS(newUsesCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.ENGINEERING_CRS_TYPE__USES_CS, newUsesCS, newUsesCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EngineeringDatumRefType getUsesEngineeringDatum() {
		return usesEngineeringDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesEngineeringDatum(EngineeringDatumRefType newUsesEngineeringDatum, NotificationChain msgs) {
		EngineeringDatumRefType oldUsesEngineeringDatum = usesEngineeringDatum;
		usesEngineeringDatum = newUsesEngineeringDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM, oldUsesEngineeringDatum, newUsesEngineeringDatum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesEngineeringDatum(EngineeringDatumRefType newUsesEngineeringDatum) {
		if (newUsesEngineeringDatum != usesEngineeringDatum) {
			NotificationChain msgs = null;
			if (usesEngineeringDatum != null)
				msgs = ((InternalEObject)usesEngineeringDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM, null, msgs);
			if (newUsesEngineeringDatum != null)
				msgs = ((InternalEObject)newUsesEngineeringDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM, null, msgs);
			msgs = basicSetUsesEngineeringDatum(newUsesEngineeringDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM, newUsesEngineeringDatum, newUsesEngineeringDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_CS:
				return basicSetUsesCS(null, msgs);
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM:
				return basicSetUsesEngineeringDatum(null, msgs);
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
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_CS:
				return getUsesCS();
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM:
				return getUsesEngineeringDatum();
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
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_CS:
				setUsesCS((CoordinateSystemRefType)newValue);
				return;
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM:
				setUsesEngineeringDatum((EngineeringDatumRefType)newValue);
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
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_CS:
				setUsesCS((CoordinateSystemRefType)null);
				return;
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM:
				setUsesEngineeringDatum((EngineeringDatumRefType)null);
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
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_CS:
				return usesCS != null;
			case GmlPackage.ENGINEERING_CRS_TYPE__USES_ENGINEERING_DATUM:
				return usesEngineeringDatum != null;
		}
		return super.eIsSet(featureID);
	}

} //EngineeringCRSTypeImpl
