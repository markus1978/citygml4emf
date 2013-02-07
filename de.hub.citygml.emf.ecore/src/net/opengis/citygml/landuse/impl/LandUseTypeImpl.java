/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.landuse.impl;

import java.util.Collection;

import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.citygml.landuse.LandUseType;
import net.opengis.citygml.landuse.LandusePackage;
import net.opengis.gml.MultiSurfacePropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Land Use Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getLod0MultiSurface <em>Lod0 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getGenericApplicationPropertyOfLandUseGroup <em>Generic Application Property Of Land Use Group</em>}</li>
 *   <li>{@link net.opengis.citygml.landuse.impl.LandUseTypeImpl#getGenericApplicationPropertyOfLandUse <em>Generic Application Property Of Land Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandUseTypeImpl extends AbstractCityObjectTypeImpl implements LandUseType {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<String> function;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> usage;

	/**
	 * The cached value of the '{@link #getLod0MultiSurface() <em>Lod0 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod0MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod0MultiSurface;

	/**
	 * The cached value of the '{@link #getLod1MultiSurface() <em>Lod1 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod1MultiSurface;

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
	 * The cached value of the '{@link #getGenericApplicationPropertyOfLandUseGroup() <em>Generic Application Property Of Land Use Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfLandUseGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfLandUseGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandUseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LandusePackage.Literals.LAND_USE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, LandusePackage.LAND_USE_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsage() {
		if (usage == null) {
			usage = new EDataTypeEList<String>(String.class, this, LandusePackage.LAND_USE_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod0MultiSurface() {
		return lod0MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod0MultiSurface(MultiSurfacePropertyType newLod0MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod0MultiSurface = lod0MultiSurface;
		lod0MultiSurface = newLod0MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE, oldLod0MultiSurface, newLod0MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod0MultiSurface(MultiSurfacePropertyType newLod0MultiSurface) {
		if (newLod0MultiSurface != lod0MultiSurface) {
			NotificationChain msgs = null;
			if (lod0MultiSurface != null)
				msgs = ((InternalEObject)lod0MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE, null, msgs);
			if (newLod0MultiSurface != null)
				msgs = ((InternalEObject)newLod0MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod0MultiSurface(newLod0MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE, newLod0MultiSurface, newLod0MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod1MultiSurface() {
		return lod1MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1MultiSurface(MultiSurfacePropertyType newLod1MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod1MultiSurface = lod1MultiSurface;
		lod1MultiSurface = newLod1MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE, oldLod1MultiSurface, newLod1MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1MultiSurface(MultiSurfacePropertyType newLod1MultiSurface) {
		if (newLod1MultiSurface != lod1MultiSurface) {
			NotificationChain msgs = null;
			if (lod1MultiSurface != null)
				msgs = ((InternalEObject)lod1MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			if (newLod1MultiSurface != null)
				msgs = ((InternalEObject)newLod1MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod1MultiSurface(newLod1MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE, newLod1MultiSurface, newLod1MultiSurface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE, oldLod2MultiSurface, newLod2MultiSurface);
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
				msgs = ((InternalEObject)lod2MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			if (newLod2MultiSurface != null)
				msgs = ((InternalEObject)newLod2MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod2MultiSurface(newLod2MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE, newLod2MultiSurface, newLod2MultiSurface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE, oldLod3MultiSurface, newLod3MultiSurface);
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
				msgs = ((InternalEObject)lod3MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			if (newLod3MultiSurface != null)
				msgs = ((InternalEObject)newLod3MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod3MultiSurface(newLod3MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE, newLod3MultiSurface, newLod3MultiSurface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE, oldLod4MultiSurface, newLod4MultiSurface);
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
				msgs = ((InternalEObject)lod4MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			if (newLod4MultiSurface != null)
				msgs = ((InternalEObject)newLod4MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod4MultiSurface(newLod4MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE, newLod4MultiSurface, newLod4MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfLandUseGroup() {
		if (genericApplicationPropertyOfLandUseGroup == null) {
			genericApplicationPropertyOfLandUseGroup = new BasicFeatureMap(this, LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE_GROUP);
		}
		return genericApplicationPropertyOfLandUseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfLandUse() {
		return getGenericApplicationPropertyOfLandUseGroup().list(LandusePackage.Literals.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE:
				return basicSetLod0MultiSurface(null, msgs);
			case LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE:
				return basicSetLod1MultiSurface(null, msgs);
			case LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE:
				return basicSetLod2MultiSurface(null, msgs);
			case LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE:
				return basicSetLod3MultiSurface(null, msgs);
			case LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE:
				return basicSetLod4MultiSurface(null, msgs);
			case LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfLandUseGroup()).basicRemove(otherEnd, msgs);
			case LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfLandUse()).basicRemove(otherEnd, msgs);
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
			case LandusePackage.LAND_USE_TYPE__CLASS:
				return getClass_();
			case LandusePackage.LAND_USE_TYPE__FUNCTION:
				return getFunction();
			case LandusePackage.LAND_USE_TYPE__USAGE:
				return getUsage();
			case LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE:
				return getLod0MultiSurface();
			case LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE:
				return getLod1MultiSurface();
			case LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE:
				return getLod2MultiSurface();
			case LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE:
				return getLod3MultiSurface();
			case LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE:
				return getLod4MultiSurface();
			case LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfLandUseGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfLandUseGroup()).getWrapper();
			case LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE:
				return getGenericApplicationPropertyOfLandUse();
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
			case LandusePackage.LAND_USE_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case LandusePackage.LAND_USE_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case LandusePackage.LAND_USE_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE:
				setLod0MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfLandUseGroup()).set(newValue);
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
			case LandusePackage.LAND_USE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case LandusePackage.LAND_USE_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case LandusePackage.LAND_USE_TYPE__USAGE:
				getUsage().clear();
				return;
			case LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE:
				setLod0MultiSurface((MultiSurfacePropertyType)null);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)null);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)null);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)null);
				return;
			case LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)null);
				return;
			case LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE_GROUP:
				getGenericApplicationPropertyOfLandUseGroup().clear();
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
			case LandusePackage.LAND_USE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case LandusePackage.LAND_USE_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case LandusePackage.LAND_USE_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case LandusePackage.LAND_USE_TYPE__LOD0_MULTI_SURFACE:
				return lod0MultiSurface != null;
			case LandusePackage.LAND_USE_TYPE__LOD1_MULTI_SURFACE:
				return lod1MultiSurface != null;
			case LandusePackage.LAND_USE_TYPE__LOD2_MULTI_SURFACE:
				return lod2MultiSurface != null;
			case LandusePackage.LAND_USE_TYPE__LOD3_MULTI_SURFACE:
				return lod3MultiSurface != null;
			case LandusePackage.LAND_USE_TYPE__LOD4_MULTI_SURFACE:
				return lod4MultiSurface != null;
			case LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE_GROUP:
				return genericApplicationPropertyOfLandUseGroup != null && !genericApplicationPropertyOfLandUseGroup.isEmpty();
			case LandusePackage.LAND_USE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_LAND_USE:
				return !getGenericApplicationPropertyOfLandUse().isEmpty();
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", function: ");
		result.append(function);
		result.append(", usage: ");
		result.append(usage);
		result.append(", genericApplicationPropertyOfLandUseGroup: ");
		result.append(genericApplicationPropertyOfLandUseGroup);
		result.append(')');
		return result.toString();
	}

} //LandUseTypeImpl
