/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import java.util.Collection;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.IntBuildingInstallationType;
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
 * An implementation of the model object '<em><b>Int Building Installation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl#getGenericApplicationPropertyOfIntBuildingInstallationGroup <em>Generic Application Property Of Int Building Installation Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.IntBuildingInstallationTypeImpl#getGenericApplicationPropertyOfIntBuildingInstallation <em>Generic Application Property Of Int Building Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntBuildingInstallationTypeImpl extends AbstractCityObjectTypeImpl implements IntBuildingInstallationType {
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
	 * The cached value of the '{@link #getLod4Geometry() <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod4Geometry;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfIntBuildingInstallationGroup() <em>Generic Application Property Of Int Building Installation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfIntBuildingInstallationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfIntBuildingInstallationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntBuildingInstallationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.INT_BUILDING_INSTALLATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__FUNCTION);
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
			usage = new EDataTypeEList<String>(String.class, this, BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__USAGE);
		}
		return usage;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY, oldLod4Geometry, newLod4Geometry);
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
				msgs = ((InternalEObject)lod4Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY, null, msgs);
			if (newLod4Geometry != null)
				msgs = ((InternalEObject)newLod4Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY, null, msgs);
			msgs = basicSetLod4Geometry(newLod4Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY, newLod4Geometry, newLod4Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfIntBuildingInstallationGroup() {
		if (genericApplicationPropertyOfIntBuildingInstallationGroup == null) {
			genericApplicationPropertyOfIntBuildingInstallationGroup = new BasicFeatureMap(this, BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP);
		}
		return genericApplicationPropertyOfIntBuildingInstallationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfIntBuildingInstallation() {
		return getGenericApplicationPropertyOfIntBuildingInstallationGroup().list(BuildingPackage.Literals.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				return basicSetLod4Geometry(null, msgs);
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfIntBuildingInstallationGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION:
				return ((InternalEList<?>)getGenericApplicationPropertyOfIntBuildingInstallation()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__CLASS:
				return getClass_();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__FUNCTION:
				return getFunction();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__USAGE:
				return getUsage();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				return getLod4Geometry();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP:
				if (coreType) return getGenericApplicationPropertyOfIntBuildingInstallationGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfIntBuildingInstallationGroup()).getWrapper();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION:
				return getGenericApplicationPropertyOfIntBuildingInstallation();
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
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)newValue);
				return;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfIntBuildingInstallationGroup()).set(newValue);
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
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__USAGE:
				getUsage().clear();
				return;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)null);
				return;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP:
				getGenericApplicationPropertyOfIntBuildingInstallationGroup().clear();
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
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__LOD4_GEOMETRY:
				return lod4Geometry != null;
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION_GROUP:
				return genericApplicationPropertyOfIntBuildingInstallationGroup != null && !genericApplicationPropertyOfIntBuildingInstallationGroup.isEmpty();
			case BuildingPackage.INT_BUILDING_INSTALLATION_TYPE__GENERIC_APPLICATION_PROPERTY_OF_INT_BUILDING_INSTALLATION:
				return !getGenericApplicationPropertyOfIntBuildingInstallation().isEmpty();
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
		result.append(", genericApplicationPropertyOfIntBuildingInstallationGroup: ");
		result.append(genericApplicationPropertyOfIntBuildingInstallationGroup);
		result.append(')');
		return result.toString();
	}

} //IntBuildingInstallationTypeImpl
