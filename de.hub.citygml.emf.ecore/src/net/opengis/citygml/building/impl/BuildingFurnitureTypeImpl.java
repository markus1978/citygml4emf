/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import java.util.Collection;

import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.citygml.building.BuildingFurnitureType;
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
 * An implementation of the model object '<em><b>Furniture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl#getGenericApplicationPropertyOfBuildingFurnitureGroup <em>Generic Application Property Of Building Furniture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.BuildingFurnitureTypeImpl#getGenericApplicationPropertyOfBuildingFurniture <em>Generic Application Property Of Building Furniture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildingFurnitureTypeImpl extends AbstractCityObjectTypeImpl implements BuildingFurnitureType {
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
	 * The cached value of the '{@link #getLod4ImplicitRepresentation() <em>Lod4 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4ImplicitRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ImplicitRepresentationPropertyType lod4ImplicitRepresentation;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfBuildingFurnitureGroup() <em>Generic Application Property Of Building Furniture Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfBuildingFurnitureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfBuildingFurnitureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingFurnitureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.BUILDING_FURNITURE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_FURNITURE_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, BuildingPackage.BUILDING_FURNITURE_TYPE__FUNCTION);
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
			usage = new EDataTypeEList<String>(String.class, this, BuildingPackage.BUILDING_FURNITURE_TYPE__USAGE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY, oldLod4Geometry, newLod4Geometry);
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
				msgs = ((InternalEObject)lod4Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY, null, msgs);
			if (newLod4Geometry != null)
				msgs = ((InternalEObject)newLod4Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY, null, msgs);
			msgs = basicSetLod4Geometry(newLod4Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY, newLod4Geometry, newLod4Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitRepresentationPropertyType getLod4ImplicitRepresentation() {
		return lod4ImplicitRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4ImplicitRepresentation(ImplicitRepresentationPropertyType newLod4ImplicitRepresentation, NotificationChain msgs) {
		ImplicitRepresentationPropertyType oldLod4ImplicitRepresentation = lod4ImplicitRepresentation;
		lod4ImplicitRepresentation = newLod4ImplicitRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION, oldLod4ImplicitRepresentation, newLod4ImplicitRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4ImplicitRepresentation(ImplicitRepresentationPropertyType newLod4ImplicitRepresentation) {
		if (newLod4ImplicitRepresentation != lod4ImplicitRepresentation) {
			NotificationChain msgs = null;
			if (lod4ImplicitRepresentation != null)
				msgs = ((InternalEObject)lod4ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod4ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod4ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod4ImplicitRepresentation(newLod4ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION, newLod4ImplicitRepresentation, newLod4ImplicitRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfBuildingFurnitureGroup() {
		if (genericApplicationPropertyOfBuildingFurnitureGroup == null) {
			genericApplicationPropertyOfBuildingFurnitureGroup = new BasicFeatureMap(this, BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP);
		}
		return genericApplicationPropertyOfBuildingFurnitureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfBuildingFurniture() {
		return getGenericApplicationPropertyOfBuildingFurnitureGroup().list(BuildingPackage.Literals.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY:
				return basicSetLod4Geometry(null, msgs);
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return basicSetLod4ImplicitRepresentation(null, msgs);
			case BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBuildingFurnitureGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBuildingFurniture()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.BUILDING_FURNITURE_TYPE__CLASS:
				return getClass_();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__FUNCTION:
				return getFunction();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__USAGE:
				return getUsage();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY:
				return getLod4Geometry();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return getLod4ImplicitRepresentation();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfBuildingFurnitureGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfBuildingFurnitureGroup()).getWrapper();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE:
				return getGenericApplicationPropertyOfBuildingFurniture();
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
			case BuildingPackage.BUILDING_FURNITURE_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)newValue);
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				setLod4ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfBuildingFurnitureGroup()).set(newValue);
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
			case BuildingPackage.BUILDING_FURNITURE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__USAGE:
				getUsage().clear();
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)null);
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				setLod4ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP:
				getGenericApplicationPropertyOfBuildingFurnitureGroup().clear();
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
			case BuildingPackage.BUILDING_FURNITURE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case BuildingPackage.BUILDING_FURNITURE_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_GEOMETRY:
				return lod4Geometry != null;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return lod4ImplicitRepresentation != null;
			case BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE_GROUP:
				return genericApplicationPropertyOfBuildingFurnitureGroup != null && !genericApplicationPropertyOfBuildingFurnitureGroup.isEmpty();
			case BuildingPackage.BUILDING_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BUILDING_FURNITURE:
				return !getGenericApplicationPropertyOfBuildingFurniture().isEmpty();
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
		result.append(", genericApplicationPropertyOfBuildingFurnitureGroup: ");
		result.append(genericApplicationPropertyOfBuildingFurnitureGroup);
		result.append(')');
		return result.toString();
	}

} //BuildingFurnitureTypeImpl
