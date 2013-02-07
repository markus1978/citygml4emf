/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import java.util.Collection;

import net.opengis.citygml.building.AbstractBoundarySurfaceType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.OpeningPropertyType;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Boundary Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl#getOpening <em>Opening</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl#getGenericApplicationPropertyOfBoundarySurfaceGroup <em>Generic Application Property Of Boundary Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBoundarySurfaceTypeImpl#getGenericApplicationPropertyOfBoundarySurface <em>Generic Application Property Of Boundary Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractBoundarySurfaceTypeImpl extends AbstractCityObjectTypeImpl implements AbstractBoundarySurfaceType {
	/**
	 * The cached value of the '{@link #getLod2MultiSurface() <em>Lod2 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod2MultiSurface;

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
	 * The cached value of the '{@link #getOpening() <em>Opening</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpening()
	 * @generated
	 * @ordered
	 */
	protected EList<OpeningPropertyType> opening;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfBoundarySurfaceGroup() <em>Generic Application Property Of Boundary Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfBoundarySurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfBoundarySurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractBoundarySurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.ABSTRACT_BOUNDARY_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod2MultiSurface() {
		return lod2MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2MultiSurface(MultiSurfacePropertyType newLod2MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod2MultiSurface = lod2MultiSurface;
		lod2MultiSurface = newLod2MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE, oldLod2MultiSurface, newLod2MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2MultiSurface(MultiSurfacePropertyType newLod2MultiSurface) {
		if (newLod2MultiSurface != lod2MultiSurface) {
			NotificationChain msgs = null;
			if (lod2MultiSurface != null)
				msgs = ((InternalEObject)lod2MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			if (newLod2MultiSurface != null)
				msgs = ((InternalEObject)newLod2MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod2MultiSurface(newLod2MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE, newLod2MultiSurface, newLod2MultiSurface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE, oldLod3MultiSurface, newLod3MultiSurface);
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
				msgs = ((InternalEObject)lod3MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			if (newLod3MultiSurface != null)
				msgs = ((InternalEObject)newLod3MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod3MultiSurface(newLod3MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE, newLod3MultiSurface, newLod3MultiSurface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE, oldLod4MultiSurface, newLod4MultiSurface);
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
				msgs = ((InternalEObject)lod4MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			if (newLod4MultiSurface != null)
				msgs = ((InternalEObject)newLod4MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod4MultiSurface(newLod4MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE, newLod4MultiSurface, newLod4MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpeningPropertyType> getOpening() {
		if (opening == null) {
			opening = new EObjectContainmentEList<OpeningPropertyType>(OpeningPropertyType.class, this, BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING);
		}
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfBoundarySurfaceGroup() {
		if (genericApplicationPropertyOfBoundarySurfaceGroup == null) {
			genericApplicationPropertyOfBoundarySurfaceGroup = new BasicFeatureMap(this, BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfBoundarySurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfBoundarySurface() {
		return getGenericApplicationPropertyOfBoundarySurfaceGroup().list(BuildingPackage.Literals.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE:
				return basicSetLod2MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE:
				return basicSetLod3MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE:
				return basicSetLod4MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING:
				return ((InternalEList<?>)getOpening()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBoundarySurfaceGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBoundarySurface()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE:
				return getLod2MultiSurface();
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE:
				return getLod3MultiSurface();
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE:
				return getLod4MultiSurface();
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING:
				return getOpening();
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfBoundarySurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfBoundarySurfaceGroup()).getWrapper();
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE:
				return getGenericApplicationPropertyOfBoundarySurface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING:
				getOpening().clear();
				getOpening().addAll((Collection<? extends OpeningPropertyType>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfBoundarySurfaceGroup()).set(newValue);
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
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING:
				getOpening().clear();
				return;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP:
				getGenericApplicationPropertyOfBoundarySurfaceGroup().clear();
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
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD2_MULTI_SURFACE:
				return lod2MultiSurface != null;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD3_MULTI_SURFACE:
				return lod3MultiSurface != null;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__LOD4_MULTI_SURFACE:
				return lod4MultiSurface != null;
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__OPENING:
				return opening != null && !opening.isEmpty();
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE_GROUP:
				return genericApplicationPropertyOfBoundarySurfaceGroup != null && !genericApplicationPropertyOfBoundarySurfaceGroup.isEmpty();
			case BuildingPackage.ABSTRACT_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BOUNDARY_SURFACE:
				return !getGenericApplicationPropertyOfBoundarySurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfBoundarySurfaceGroup: ");
		result.append(genericApplicationPropertyOfBoundarySurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractBoundarySurfaceTypeImpl
