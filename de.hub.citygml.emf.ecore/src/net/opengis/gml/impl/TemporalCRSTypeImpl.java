/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.TemporalCRSType;
import net.opengis.gml.TemporalCSRefType;
import net.opengis.gml.TemporalDatumRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TemporalCRSTypeImpl#getUsesTemporalCS <em>Uses Temporal CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.TemporalCRSTypeImpl#getUsesTemporalDatum <em>Uses Temporal Datum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalCRSTypeImpl extends AbstractReferenceSystemTypeImpl implements TemporalCRSType {
	/**
	 * The cached value of the '{@link #getUsesTemporalCS() <em>Uses Temporal CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesTemporalCS()
	 * @generated
	 * @ordered
	 */
	protected TemporalCSRefType usesTemporalCS;

	/**
	 * The cached value of the '{@link #getUsesTemporalDatum() <em>Uses Temporal Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesTemporalDatum()
	 * @generated
	 * @ordered
	 */
	protected TemporalDatumRefType usesTemporalDatum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getTemporalCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalCSRefType getUsesTemporalCS() {
		return usesTemporalCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesTemporalCS(TemporalCSRefType newUsesTemporalCS, NotificationChain msgs) {
		TemporalCSRefType oldUsesTemporalCS = usesTemporalCS;
		usesTemporalCS = newUsesTemporalCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS, oldUsesTemporalCS, newUsesTemporalCS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesTemporalCS(TemporalCSRefType newUsesTemporalCS) {
		if (newUsesTemporalCS != usesTemporalCS) {
			NotificationChain msgs = null;
			if (usesTemporalCS != null)
				msgs = ((InternalEObject)usesTemporalCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS, null, msgs);
			if (newUsesTemporalCS != null)
				msgs = ((InternalEObject)newUsesTemporalCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS, null, msgs);
			msgs = basicSetUsesTemporalCS(newUsesTemporalCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS, newUsesTemporalCS, newUsesTemporalCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDatumRefType getUsesTemporalDatum() {
		return usesTemporalDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesTemporalDatum(TemporalDatumRefType newUsesTemporalDatum, NotificationChain msgs) {
		TemporalDatumRefType oldUsesTemporalDatum = usesTemporalDatum;
		usesTemporalDatum = newUsesTemporalDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM, oldUsesTemporalDatum, newUsesTemporalDatum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesTemporalDatum(TemporalDatumRefType newUsesTemporalDatum) {
		if (newUsesTemporalDatum != usesTemporalDatum) {
			NotificationChain msgs = null;
			if (usesTemporalDatum != null)
				msgs = ((InternalEObject)usesTemporalDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM, null, msgs);
			if (newUsesTemporalDatum != null)
				msgs = ((InternalEObject)newUsesTemporalDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM, null, msgs);
			msgs = basicSetUsesTemporalDatum(newUsesTemporalDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM, newUsesTemporalDatum, newUsesTemporalDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				return basicSetUsesTemporalCS(null, msgs);
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM:
				return basicSetUsesTemporalDatum(null, msgs);
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
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				return getUsesTemporalCS();
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM:
				return getUsesTemporalDatum();
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
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				setUsesTemporalCS((TemporalCSRefType)newValue);
				return;
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM:
				setUsesTemporalDatum((TemporalDatumRefType)newValue);
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
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				setUsesTemporalCS((TemporalCSRefType)null);
				return;
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM:
				setUsesTemporalDatum((TemporalDatumRefType)null);
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
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_CS:
				return usesTemporalCS != null;
			case GmlPackage.TEMPORAL_CRS_TYPE__USES_TEMPORAL_DATUM:
				return usesTemporalDatum != null;
		}
		return super.eIsSet(featureID);
	}

} //TemporalCRSTypeImpl
