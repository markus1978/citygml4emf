/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.CartesianCSRefType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.ImageCRSType;
import net.opengis.gml.ImageDatumRefType;
import net.opengis.gml.ObliqueCartesianCSRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image CRS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.ImageCRSTypeImpl#getUsesCartesianCS <em>Uses Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.ImageCRSTypeImpl#getUsesObliqueCartesianCS <em>Uses Oblique Cartesian CS</em>}</li>
 *   <li>{@link net.opengis.gml.impl.ImageCRSTypeImpl#getUsesImageDatum <em>Uses Image Datum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageCRSTypeImpl extends AbstractReferenceSystemTypeImpl implements ImageCRSType {
	/**
	 * The cached value of the '{@link #getUsesCartesianCS() <em>Uses Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesCartesianCS()
	 * @generated
	 * @ordered
	 */
	protected CartesianCSRefType usesCartesianCS;

	/**
	 * The cached value of the '{@link #getUsesObliqueCartesianCS() <em>Uses Oblique Cartesian CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesObliqueCartesianCS()
	 * @generated
	 * @ordered
	 */
	protected ObliqueCartesianCSRefType usesObliqueCartesianCS;

	/**
	 * The cached value of the '{@link #getUsesImageDatum() <em>Uses Image Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesImageDatum()
	 * @generated
	 * @ordered
	 */
	protected ImageDatumRefType usesImageDatum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageCRSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getImageCRSType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCSRefType getUsesCartesianCS() {
		return usesCartesianCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesCartesianCS(CartesianCSRefType newUsesCartesianCS, NotificationChain msgs) {
		CartesianCSRefType oldUsesCartesianCS = usesCartesianCS;
		usesCartesianCS = newUsesCartesianCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS, oldUsesCartesianCS, newUsesCartesianCS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesCartesianCS(CartesianCSRefType newUsesCartesianCS) {
		if (newUsesCartesianCS != usesCartesianCS) {
			NotificationChain msgs = null;
			if (usesCartesianCS != null)
				msgs = ((InternalEObject)usesCartesianCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS, null, msgs);
			if (newUsesCartesianCS != null)
				msgs = ((InternalEObject)newUsesCartesianCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS, null, msgs);
			msgs = basicSetUsesCartesianCS(newUsesCartesianCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS, newUsesCartesianCS, newUsesCartesianCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObliqueCartesianCSRefType getUsesObliqueCartesianCS() {
		return usesObliqueCartesianCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesObliqueCartesianCS(ObliqueCartesianCSRefType newUsesObliqueCartesianCS, NotificationChain msgs) {
		ObliqueCartesianCSRefType oldUsesObliqueCartesianCS = usesObliqueCartesianCS;
		usesObliqueCartesianCS = newUsesObliqueCartesianCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS, oldUsesObliqueCartesianCS, newUsesObliqueCartesianCS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesObliqueCartesianCS(ObliqueCartesianCSRefType newUsesObliqueCartesianCS) {
		if (newUsesObliqueCartesianCS != usesObliqueCartesianCS) {
			NotificationChain msgs = null;
			if (usesObliqueCartesianCS != null)
				msgs = ((InternalEObject)usesObliqueCartesianCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS, null, msgs);
			if (newUsesObliqueCartesianCS != null)
				msgs = ((InternalEObject)newUsesObliqueCartesianCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS, null, msgs);
			msgs = basicSetUsesObliqueCartesianCS(newUsesObliqueCartesianCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS, newUsesObliqueCartesianCS, newUsesObliqueCartesianCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageDatumRefType getUsesImageDatum() {
		return usesImageDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesImageDatum(ImageDatumRefType newUsesImageDatum, NotificationChain msgs) {
		ImageDatumRefType oldUsesImageDatum = usesImageDatum;
		usesImageDatum = newUsesImageDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM, oldUsesImageDatum, newUsesImageDatum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesImageDatum(ImageDatumRefType newUsesImageDatum) {
		if (newUsesImageDatum != usesImageDatum) {
			NotificationChain msgs = null;
			if (usesImageDatum != null)
				msgs = ((InternalEObject)usesImageDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM, null, msgs);
			if (newUsesImageDatum != null)
				msgs = ((InternalEObject)newUsesImageDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM, null, msgs);
			msgs = basicSetUsesImageDatum(newUsesImageDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM, newUsesImageDatum, newUsesImageDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS:
				return basicSetUsesCartesianCS(null, msgs);
			case GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				return basicSetUsesObliqueCartesianCS(null, msgs);
			case GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM:
				return basicSetUsesImageDatum(null, msgs);
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
			case GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS:
				return getUsesCartesianCS();
			case GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				return getUsesObliqueCartesianCS();
			case GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM:
				return getUsesImageDatum();
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
			case GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSRefType)newValue);
				return;
			case GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				setUsesObliqueCartesianCS((ObliqueCartesianCSRefType)newValue);
				return;
			case GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM:
				setUsesImageDatum((ImageDatumRefType)newValue);
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
			case GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS:
				setUsesCartesianCS((CartesianCSRefType)null);
				return;
			case GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				setUsesObliqueCartesianCS((ObliqueCartesianCSRefType)null);
				return;
			case GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM:
				setUsesImageDatum((ImageDatumRefType)null);
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
			case GmlPackage.IMAGE_CRS_TYPE__USES_CARTESIAN_CS:
				return usesCartesianCS != null;
			case GmlPackage.IMAGE_CRS_TYPE__USES_OBLIQUE_CARTESIAN_CS:
				return usesObliqueCartesianCS != null;
			case GmlPackage.IMAGE_CRS_TYPE__USES_IMAGE_DATUM:
				return usesImageDatum != null;
		}
		return super.eIsSet(featureID);
	}

} //ImageCRSTypeImpl
