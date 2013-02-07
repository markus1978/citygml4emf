/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.impl;

import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType;
import net.opengis.citygml.waterbody.WaterbodyPackage;
import net.opengis.gml.SurfacePropertyType;

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
 * An implementation of the model object '<em><b>Abstract Water Boundary Surface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl#getLod2Surface <em>Lod2 Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl#getLod3Surface <em>Lod3 Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl#getLod4Surface <em>Lod4 Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl#getGenericApplicationPropertyOfWaterBoundarySurfaceGroup <em>Generic Application Property Of Water Boundary Surface Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.AbstractWaterBoundarySurfaceTypeImpl#getGenericApplicationPropertyOfWaterBoundarySurface <em>Generic Application Property Of Water Boundary Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractWaterBoundarySurfaceTypeImpl extends AbstractCityObjectTypeImpl implements AbstractWaterBoundarySurfaceType {
	/**
	 * The cached value of the '{@link #getLod2Surface() <em>Lod2 Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2Surface()
	 * @generated
	 * @ordered
	 */
	protected SurfacePropertyType lod2Surface;

	/**
	 * The cached value of the '{@link #getLod3Surface() <em>Lod3 Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3Surface()
	 * @generated
	 * @ordered
	 */
	protected SurfacePropertyType lod3Surface;

	/**
	 * The cached value of the '{@link #getLod4Surface() <em>Lod4 Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4Surface()
	 * @generated
	 * @ordered
	 */
	protected SurfacePropertyType lod4Surface;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfWaterBoundarySurfaceGroup() <em>Generic Application Property Of Water Boundary Surface Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfWaterBoundarySurfaceGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfWaterBoundarySurfaceGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractWaterBoundarySurfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WaterbodyPackage.Literals.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePropertyType getLod2Surface() {
		return lod2Surface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2Surface(SurfacePropertyType newLod2Surface, NotificationChain msgs) {
		SurfacePropertyType oldLod2Surface = lod2Surface;
		lod2Surface = newLod2Surface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE, oldLod2Surface, newLod2Surface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2Surface(SurfacePropertyType newLod2Surface) {
		if (newLod2Surface != lod2Surface) {
			NotificationChain msgs = null;
			if (lod2Surface != null)
				msgs = ((InternalEObject)lod2Surface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE, null, msgs);
			if (newLod2Surface != null)
				msgs = ((InternalEObject)newLod2Surface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE, null, msgs);
			msgs = basicSetLod2Surface(newLod2Surface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE, newLod2Surface, newLod2Surface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePropertyType getLod3Surface() {
		return lod3Surface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3Surface(SurfacePropertyType newLod3Surface, NotificationChain msgs) {
		SurfacePropertyType oldLod3Surface = lod3Surface;
		lod3Surface = newLod3Surface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE, oldLod3Surface, newLod3Surface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3Surface(SurfacePropertyType newLod3Surface) {
		if (newLod3Surface != lod3Surface) {
			NotificationChain msgs = null;
			if (lod3Surface != null)
				msgs = ((InternalEObject)lod3Surface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE, null, msgs);
			if (newLod3Surface != null)
				msgs = ((InternalEObject)newLod3Surface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE, null, msgs);
			msgs = basicSetLod3Surface(newLod3Surface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE, newLod3Surface, newLod3Surface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfacePropertyType getLod4Surface() {
		return lod4Surface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4Surface(SurfacePropertyType newLod4Surface, NotificationChain msgs) {
		SurfacePropertyType oldLod4Surface = lod4Surface;
		lod4Surface = newLod4Surface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE, oldLod4Surface, newLod4Surface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4Surface(SurfacePropertyType newLod4Surface) {
		if (newLod4Surface != lod4Surface) {
			NotificationChain msgs = null;
			if (lod4Surface != null)
				msgs = ((InternalEObject)lod4Surface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE, null, msgs);
			if (newLod4Surface != null)
				msgs = ((InternalEObject)newLod4Surface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE, null, msgs);
			msgs = basicSetLod4Surface(newLod4Surface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE, newLod4Surface, newLod4Surface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfWaterBoundarySurfaceGroup() {
		if (genericApplicationPropertyOfWaterBoundarySurfaceGroup == null) {
			genericApplicationPropertyOfWaterBoundarySurfaceGroup = new BasicFeatureMap(this, WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP);
		}
		return genericApplicationPropertyOfWaterBoundarySurfaceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfWaterBoundarySurface() {
		return getGenericApplicationPropertyOfWaterBoundarySurfaceGroup().list(WaterbodyPackage.Literals.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE:
				return basicSetLod2Surface(null, msgs);
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE:
				return basicSetLod3Surface(null, msgs);
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE:
				return basicSetLod4Surface(null, msgs);
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterBoundarySurfaceGroup()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterBoundarySurface()).basicRemove(otherEnd, msgs);
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
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE:
				return getLod2Surface();
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE:
				return getLod3Surface();
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE:
				return getLod4Surface();
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfWaterBoundarySurfaceGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfWaterBoundarySurfaceGroup()).getWrapper();
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE:
				return getGenericApplicationPropertyOfWaterBoundarySurface();
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
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE:
				setLod2Surface((SurfacePropertyType)newValue);
				return;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE:
				setLod3Surface((SurfacePropertyType)newValue);
				return;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE:
				setLod4Surface((SurfacePropertyType)newValue);
				return;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfWaterBoundarySurfaceGroup()).set(newValue);
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
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE:
				setLod2Surface((SurfacePropertyType)null);
				return;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE:
				setLod3Surface((SurfacePropertyType)null);
				return;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE:
				setLod4Surface((SurfacePropertyType)null);
				return;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP:
				getGenericApplicationPropertyOfWaterBoundarySurfaceGroup().clear();
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
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD2_SURFACE:
				return lod2Surface != null;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD3_SURFACE:
				return lod3Surface != null;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__LOD4_SURFACE:
				return lod4Surface != null;
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE_GROUP:
				return genericApplicationPropertyOfWaterBoundarySurfaceGroup != null && !genericApplicationPropertyOfWaterBoundarySurfaceGroup.isEmpty();
			case WaterbodyPackage.ABSTRACT_WATER_BOUNDARY_SURFACE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE:
				return !getGenericApplicationPropertyOfWaterBoundarySurface().isEmpty();
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
		result.append(" (genericApplicationPropertyOfWaterBoundarySurfaceGroup: ");
		result.append(genericApplicationPropertyOfWaterBoundarySurfaceGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractWaterBoundarySurfaceTypeImpl
