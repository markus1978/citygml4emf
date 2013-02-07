/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.ImplicitGeometryType;
import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicit Representation Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.ImplicitRepresentationPropertyTypeImpl#getImplicitGeometry <em>Implicit Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicitRepresentationPropertyTypeImpl extends AssociationTypeImpl implements ImplicitRepresentationPropertyType {
	/**
	 * The cached value of the '{@link #getImplicitGeometry() <em>Implicit Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitGeometry()
	 * @generated
	 * @ordered
	 */
	protected ImplicitGeometryType implicitGeometry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitRepresentationPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.IMPLICIT_REPRESENTATION_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitGeometryType getImplicitGeometry() {
		return implicitGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplicitGeometry(ImplicitGeometryType newImplicitGeometry, NotificationChain msgs) {
		ImplicitGeometryType oldImplicitGeometry = implicitGeometry;
		implicitGeometry = newImplicitGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY, oldImplicitGeometry, newImplicitGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitGeometry(ImplicitGeometryType newImplicitGeometry) {
		if (newImplicitGeometry != implicitGeometry) {
			NotificationChain msgs = null;
			if (implicitGeometry != null)
				msgs = ((InternalEObject)implicitGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY, null, msgs);
			if (newImplicitGeometry != null)
				msgs = ((InternalEObject)newImplicitGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY, null, msgs);
			msgs = basicSetImplicitGeometry(newImplicitGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY, newImplicitGeometry, newImplicitGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY:
				return basicSetImplicitGeometry(null, msgs);
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
			case CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY:
				return getImplicitGeometry();
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
			case CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY:
				setImplicitGeometry((ImplicitGeometryType)newValue);
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
			case CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY:
				setImplicitGeometry((ImplicitGeometryType)null);
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
			case CitygmlPackage.IMPLICIT_REPRESENTATION_PROPERTY_TYPE__IMPLICIT_GEOMETRY:
				return implicitGeometry != null;
		}
		return super.eIsSet(featureID);
	}

} //ImplicitRepresentationPropertyTypeImpl
