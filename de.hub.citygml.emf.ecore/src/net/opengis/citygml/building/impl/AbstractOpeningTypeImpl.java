/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.AbstractOpeningType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.gml.MultiSurfacePropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Opening Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractOpeningTypeImpl#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractOpeningTypeImpl#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractOpeningTypeImpl#getGenericApplicationPropertyOfOpeningGroup <em>Generic Application Property Of Opening Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractOpeningTypeImpl#getGenericApplicationPropertyOfOpening <em>Generic Application Property Of Opening</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractOpeningTypeImpl extends AbstractCityObjectTypeImpl implements AbstractOpeningType {
	/**
	 * The cached value of the '{@link #getLod3MultiSurface() <em>Lod3 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod3MultiSurface;

	/**
	 * The cached value of the '{@link #getLod4MultiSurface() <em>Lod4 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod4MultiSurface;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfOpeningGroup() <em>Generic Application Property Of Opening Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfOpeningGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfOpeningGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractOpeningTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.ABSTRACT_OPENING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod3MultiSurface() {
		return lod3MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3MultiSurface(MultiSurfacePropertyType newLod3MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod3MultiSurface = lod3MultiSurface;
		lod3MultiSurface = newLod3MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE, oldLod3MultiSurface, newLod3MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3MultiSurface(MultiSurfacePropertyType newLod3MultiSurface) {
		if (newLod3MultiSurface != lod3MultiSurface) {
			NotificationChain msgs = null;
			if (lod3MultiSurface != null)
				msgs = ((InternalEObject)lod3MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			if (newLod3MultiSurface != null)
				msgs = ((InternalEObject)newLod3MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod3MultiSurface(newLod3MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE, newLod3MultiSurface, newLod3MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod4MultiSurface() {
		return lod4MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4MultiSurface(MultiSurfacePropertyType newLod4MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod4MultiSurface = lod4MultiSurface;
		lod4MultiSurface = newLod4MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE, oldLod4MultiSurface, newLod4MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4MultiSurface(MultiSurfacePropertyType newLod4MultiSurface) {
		if (newLod4MultiSurface != lod4MultiSurface) {
			NotificationChain msgs = null;
			if (lod4MultiSurface != null)
				msgs = ((InternalEObject)lod4MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			if (newLod4MultiSurface != null)
				msgs = ((InternalEObject)newLod4MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod4MultiSurface(newLod4MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE, newLod4MultiSurface, newLod4MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfOpeningGroup() {
		if (genericApplicationPropertyOfOpeningGroup == null) {
			genericApplicationPropertyOfOpeningGroup = new BasicFeatureMap(this, BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP);
		}
		return genericApplicationPropertyOfOpeningGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfOpening() {
		return getGenericApplicationPropertyOfOpeningGroup().list(BuildingPackage.Literals.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE:
				return basicSetLod3MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE:
				return basicSetLod4MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfOpeningGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING:
				return ((InternalEList<?>)getGenericApplicationPropertyOfOpening()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE:
				return getLod3MultiSurface();
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE:
				return getLod4MultiSurface();
			case BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP:
				if (coreType) return getGenericApplicationPropertyOfOpeningGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfOpeningGroup()).getWrapper();
			case BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING:
				return getGenericApplicationPropertyOfOpening();
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
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfOpeningGroup()).set(newValue);
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
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP:
				getGenericApplicationPropertyOfOpeningGroup().clear();
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
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD3_MULTI_SURFACE:
				return lod3MultiSurface != null;
			case BuildingPackage.ABSTRACT_OPENING_TYPE__LOD4_MULTI_SURFACE:
				return lod4MultiSurface != null;
			case BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING_GROUP:
				return genericApplicationPropertyOfOpeningGroup != null && !genericApplicationPropertyOfOpeningGroup.isEmpty();
			case BuildingPackage.ABSTRACT_OPENING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_OPENING:
				return !getGenericApplicationPropertyOfOpening().isEmpty();
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
		result.append(" (genericApplicationPropertyOfOpeningGroup: ");
		result.append(genericApplicationPropertyOfOpeningGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractOpeningTypeImpl
