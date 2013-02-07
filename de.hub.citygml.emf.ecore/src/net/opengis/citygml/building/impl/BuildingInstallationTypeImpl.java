/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import java.util.Collection;

import net.opengis.citygml.building.BuildingInstallationType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.gml.GeometryPropertyType;

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
 * An implementation of the model object '<em><b>Installation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl#getLod2Geometry <em>Lod2 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl#getLod3Geometry <em>Lod3 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl#getGenericApplicationPropertyOfBuildingInstallationGroup <em>Generic Application Property Of Building Installation Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingInstallationTypeImpl#getGenericApplicationPropertyOfBuildingInstallation <em>Generic Application Property Of Building Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingInstallationTypeImpl extends AbstractCityObjectTypeImpl implements BuildingInstallationType {
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
	 * The cached value of the '{@link #getLod2Geometry() <em>Lod2 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod2Geometry;

	/**
	 * The cached value of the '{@link #getLod3Geometry() <em>Lod3 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod3Geometry;

	/**
	 * The cached value of the '{@link #getLod4Geometry() <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod4Geometry;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfBuildingInstallationGroup() <em>Generic Application Property Of Building Installation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfBuildingInstallationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfBuildingInstallationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingInstallationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.BUILDING_INSTALLATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, BuildingPackage.BUILDING_INSTALLATION_TYPE__FUNCTION);
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
			usage = new EDataTypeEList<String>(String.class, this, BuildingPackage.BUILDING_INSTALLATION_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getLod2Geometry() {
		return lod2Geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2Geometry(GeometryPropertyType newLod2Geometry, NotificationChain msgs) {
		GeometryPropertyType oldLod2Geometry = lod2Geometry;
		lod2Geometry = newLod2Geometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY, oldLod2Geometry, newLod2Geometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2Geometry(GeometryPropertyType newLod2Geometry) {
		if (newLod2Geometry != lod2Geometry) {
			NotificationChain msgs = null;
			if (lod2Geometry != null)
				msgs = ((InternalEObject)lod2Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY, null, msgs);
			if (newLod2Geometry != null)
				msgs = ((InternalEObject)newLod2Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY, null, msgs);
			msgs = basicSetLod2Geometry(newLod2Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY, newLod2Geometry, newLod2Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getLod3Geometry() {
		return lod3Geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3Geometry(GeometryPropertyType newLod3Geometry, NotificationChain msgs) {
		GeometryPropertyType oldLod3Geometry = lod3Geometry;
		lod3Geometry = newLod3Geometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY, oldLod3Geometry, newLod3Geometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3Geometry(GeometryPropertyType newLod3Geometry) {
		if (newLod3Geometry != lod3Geometry) {
			NotificationChain msgs = null;
			if (lod3Geometry != null)
				msgs = ((InternalEObject)lod3Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY, null, msgs);
			if (newLod3Geometry != null)
				msgs = ((InternalEObject)newLod3Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY, null, msgs);
			msgs = basicSetLod3Geometry(newLod3Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY, newLod3Geometry, newLod3Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getLod4Geometry() {
		return lod4Geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4Geometry(GeometryPropertyType newLod4Geometry, NotificationChain msgs) {
		GeometryPropertyType oldLod4Geometry = lod4Geometry;
		lod4Geometry = newLod4Geometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY, oldLod4Geometry, newLod4Geometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4Geometry(GeometryPropertyType newLod4Geometry) {
		if (newLod4Geometry != lod4Geometry) {
			NotificationChain msgs = null;
			if (lod4Geometry != null)
				msgs = ((InternalEObject)lod4Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY, null, msgs);
			if (newLod4Geometry != null)
				msgs = ((InternalEObject)newLod4Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY, null, msgs);
			msgs = basicSetLod4Geometry(newLod4Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY, newLod4Geometry, newLod4Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfBuildingInstallationGroup() {
		if (genericApplicationPropertyOfBuildingInstallationGroup == null) {
			genericApplicationPropertyOfBuildingInstallationGroup = new BasicFeatureMap(this, BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP);
		}
		return genericApplicationPropertyOfBuildingInstallationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfBuildingInstallation() {
		return getGenericApplicationPropertyOfBuildingInstallationGroup().list(BuildingPackage.Literals.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY:
				return basicSetLod2Geometry(null, msgs);
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY:
				return basicSetLod3Geometry(null, msgs);
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				return basicSetLod4Geometry(null, msgs);
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBuildingInstallationGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBuildingInstallation()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__CLASS:
				return getClass_();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__FUNCTION:
				return getFunction();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__USAGE:
				return getUsage();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY:
				return getLod2Geometry();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY:
				return getLod3Geometry();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				return getLod4Geometry();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP:
				if (coreType) return getGenericApplicationPropertyOfBuildingInstallationGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfBuildingInstallationGroup()).getWrapper();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION:
				return getGenericApplicationPropertyOfBuildingInstallation();
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
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY:
				setLod2Geometry((GeometryPropertyType)newValue);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY:
				setLod3Geometry((GeometryPropertyType)newValue);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)newValue);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfBuildingInstallationGroup()).set(newValue);
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
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__USAGE:
				getUsage().clear();
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY:
				setLod2Geometry((GeometryPropertyType)null);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY:
				setLod3Geometry((GeometryPropertyType)null);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)null);
				return;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP:
				getGenericApplicationPropertyOfBuildingInstallationGroup().clear();
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
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD2_GEOMETRY:
				return lod2Geometry != null;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD3_GEOMETRY:
				return lod3Geometry != null;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				return lod4Geometry != null;
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION_GROUP:
				return genericApplicationPropertyOfBuildingInstallationGroup != null && !genericApplicationPropertyOfBuildingInstallationGroup.isEmpty();
			case BuildingPackage.BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_INSTALLATION:
				return !getGenericApplicationPropertyOfBuildingInstallation().isEmpty();
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
		result.append(", genericApplicationPropertyOfBuildingInstallationGroup: ");
		result.append(genericApplicationPropertyOfBuildingInstallationGroup);
		result.append(')');
		return result.toString();
	}

} //BuildingInstallationTypeImpl
