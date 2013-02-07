/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.BoundingShapeType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.LocationPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AbstractFeatureTypeImpl#getBoundedBy <em>Bounded By</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractFeatureTypeImpl#getLocationGroup <em>Location Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractFeatureTypeImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractFeatureTypeImpl extends AbstractGMLTypeImpl implements AbstractFeatureType {
	/**
	 * The cached value of the '{@link #getBoundedBy() <em>Bounded By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedBy()
	 * @generated
	 * @ordered
	 */
	protected BoundingShapeType boundedBy;

	/**
	 * The cached value of the '{@link #getLocationGroup() <em>Location Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getAbstractFeatureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundingShapeType getBoundedBy() {
		return boundedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundedBy(BoundingShapeType newBoundedBy, NotificationChain msgs) {
		BoundingShapeType oldBoundedBy = boundedBy;
		boundedBy = newBoundedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY, oldBoundedBy, newBoundedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundedBy(BoundingShapeType newBoundedBy) {
		if (newBoundedBy != boundedBy) {
			NotificationChain msgs = null;
			if (boundedBy != null)
				msgs = ((InternalEObject)boundedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY, null, msgs);
			if (newBoundedBy != null)
				msgs = ((InternalEObject)newBoundedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY, null, msgs);
			msgs = basicSetBoundedBy(newBoundedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY, newBoundedBy, newBoundedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationGroup() {
		if (locationGroup == null) {
			locationGroup = new BasicFeatureMap(this, GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP);
		}
		return locationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationPropertyType getLocation() {
		return (LocationPropertyType)getLocationGroup().get(GmlPackage.eINSTANCE.getAbstractFeatureType_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationPropertyType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLocationGroup()).basicAdd(GmlPackage.eINSTANCE.getAbstractFeatureType_Location(), newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationPropertyType newLocation) {
		((FeatureMap.Internal)getLocationGroup()).set(GmlPackage.eINSTANCE.getAbstractFeatureType_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY:
				return basicSetBoundedBy(null, msgs);
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP:
				return ((InternalEList<?>)getLocationGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
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
			case GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY:
				return getBoundedBy();
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP:
				if (coreType) return getLocationGroup();
				return ((FeatureMap.Internal)getLocationGroup()).getWrapper();
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION:
				return getLocation();
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
			case GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY:
				setBoundedBy((BoundingShapeType)newValue);
				return;
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP:
				((FeatureMap.Internal)getLocationGroup()).set(newValue);
				return;
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION:
				setLocation((LocationPropertyType)newValue);
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
			case GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY:
				setBoundedBy((BoundingShapeType)null);
				return;
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP:
				getLocationGroup().clear();
				return;
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION:
				setLocation((LocationPropertyType)null);
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
			case GmlPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY:
				return boundedBy != null;
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP:
				return locationGroup != null && !locationGroup.isEmpty();
			case GmlPackage.ABSTRACT_FEATURE_TYPE__LOCATION:
				return getLocation() != null;
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
		result.append(" (locationGroup: ");
		result.append(locationGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractFeatureTypeImpl
