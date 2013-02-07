/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import java.util.Collection;

import net.opengis.citygml.building.BoundarySurfacePropertyType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.IntBuildingInstallationPropertyType;
import net.opengis.citygml.building.InteriorFurniturePropertyType;
import net.opengis.citygml.building.RoomType;
import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.SolidPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getLod4Solid <em>Lod4 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getBoundedBy1 <em>Bounded By1</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getInteriorFurniture <em>Interior Furniture</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getRoomInstallation <em>Room Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getGenericApplicationPropertyOfRoomGroup <em>Generic Application Property Of Room Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.RoomTypeImpl#getGenericApplicationPropertyOfRoom <em>Generic Application Property Of Room</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomTypeImpl extends AbstractCityObjectTypeImpl implements RoomType {
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
	 * The cached value of the '{@link #getLod4Solid() <em>Lod4 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4Solid()
	 * @generated
	 * @ordered
	 */
	protected SolidPropertyType lod4Solid;

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
	 * The cached value of the '{@link #getBoundedBy1() <em>Bounded By1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedBy1()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundarySurfacePropertyType> boundedBy1;

	/**
	 * The cached value of the '{@link #getInteriorFurniture() <em>Interior Furniture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorFurniture()
	 * @generated
	 * @ordered
	 */
	protected EList<InteriorFurniturePropertyType> interiorFurniture;

	/**
	 * The cached value of the '{@link #getRoomInstallation() <em>Room Installation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomInstallation()
	 * @generated
	 * @ordered
	 */
	protected EList<IntBuildingInstallationPropertyType> roomInstallation;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfRoomGroup() <em>Generic Application Property Of Room Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfRoomGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfRoomGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.ROOM_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ROOM_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, BuildingPackage.ROOM_TYPE__FUNCTION);
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
			usage = new EDataTypeEList<String>(String.class, this, BuildingPackage.ROOM_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidPropertyType getLod4Solid() {
		return lod4Solid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4Solid(SolidPropertyType newLod4Solid, NotificationChain msgs) {
		SolidPropertyType oldLod4Solid = lod4Solid;
		lod4Solid = newLod4Solid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ROOM_TYPE__LOD4_SOLID, oldLod4Solid, newLod4Solid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4Solid(SolidPropertyType newLod4Solid) {
		if (newLod4Solid != lod4Solid) {
			NotificationChain msgs = null;
			if (lod4Solid != null)
				msgs = ((InternalEObject)lod4Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ROOM_TYPE__LOD4_SOLID, null, msgs);
			if (newLod4Solid != null)
				msgs = ((InternalEObject)newLod4Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ROOM_TYPE__LOD4_SOLID, null, msgs);
			msgs = basicSetLod4Solid(newLod4Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ROOM_TYPE__LOD4_SOLID, newLod4Solid, newLod4Solid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE, oldLod4MultiSurface, newLod4MultiSurface);
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
				msgs = ((InternalEObject)lod4MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			if (newLod4MultiSurface != null)
				msgs = ((InternalEObject)newLod4MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod4MultiSurface(newLod4MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE, newLod4MultiSurface, newLod4MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundarySurfacePropertyType> getBoundedBy1() {
		if (boundedBy1 == null) {
			boundedBy1 = new EObjectContainmentEList<BoundarySurfacePropertyType>(BoundarySurfacePropertyType.class, this, BuildingPackage.ROOM_TYPE__BOUNDED_BY1);
		}
		return boundedBy1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteriorFurniturePropertyType> getInteriorFurniture() {
		if (interiorFurniture == null) {
			interiorFurniture = new EObjectContainmentEList<InteriorFurniturePropertyType>(InteriorFurniturePropertyType.class, this, BuildingPackage.ROOM_TYPE__INTERIOR_FURNITURE);
		}
		return interiorFurniture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntBuildingInstallationPropertyType> getRoomInstallation() {
		if (roomInstallation == null) {
			roomInstallation = new EObjectContainmentEList<IntBuildingInstallationPropertyType>(IntBuildingInstallationPropertyType.class, this, BuildingPackage.ROOM_TYPE__ROOM_INSTALLATION);
		}
		return roomInstallation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfRoomGroup() {
		if (genericApplicationPropertyOfRoomGroup == null) {
			genericApplicationPropertyOfRoomGroup = new BasicFeatureMap(this, BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP);
		}
		return genericApplicationPropertyOfRoomGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfRoom() {
		return getGenericApplicationPropertyOfRoomGroup().list(BuildingPackage.Literals.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.ROOM_TYPE__LOD4_SOLID:
				return basicSetLod4Solid(null, msgs);
			case BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE:
				return basicSetLod4MultiSurface(null, msgs);
			case BuildingPackage.ROOM_TYPE__BOUNDED_BY1:
				return ((InternalEList<?>)getBoundedBy1()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ROOM_TYPE__INTERIOR_FURNITURE:
				return ((InternalEList<?>)getInteriorFurniture()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ROOM_TYPE__ROOM_INSTALLATION:
				return ((InternalEList<?>)getRoomInstallation()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRoomGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRoom()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.ROOM_TYPE__CLASS:
				return getClass_();
			case BuildingPackage.ROOM_TYPE__FUNCTION:
				return getFunction();
			case BuildingPackage.ROOM_TYPE__USAGE:
				return getUsage();
			case BuildingPackage.ROOM_TYPE__LOD4_SOLID:
				return getLod4Solid();
			case BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE:
				return getLod4MultiSurface();
			case BuildingPackage.ROOM_TYPE__BOUNDED_BY1:
				return getBoundedBy1();
			case BuildingPackage.ROOM_TYPE__INTERIOR_FURNITURE:
				return getInteriorFurniture();
			case BuildingPackage.ROOM_TYPE__ROOM_INSTALLATION:
				return getRoomInstallation();
			case BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP:
				if (coreType) return getGenericApplicationPropertyOfRoomGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfRoomGroup()).getWrapper();
			case BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM:
				return getGenericApplicationPropertyOfRoom();
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
			case BuildingPackage.ROOM_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case BuildingPackage.ROOM_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.ROOM_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.ROOM_TYPE__LOD4_SOLID:
				setLod4Solid((SolidPropertyType)newValue);
				return;
			case BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ROOM_TYPE__BOUNDED_BY1:
				getBoundedBy1().clear();
				getBoundedBy1().addAll((Collection<? extends BoundarySurfacePropertyType>)newValue);
				return;
			case BuildingPackage.ROOM_TYPE__INTERIOR_FURNITURE:
				getInteriorFurniture().clear();
				getInteriorFurniture().addAll((Collection<? extends InteriorFurniturePropertyType>)newValue);
				return;
			case BuildingPackage.ROOM_TYPE__ROOM_INSTALLATION:
				getRoomInstallation().clear();
				getRoomInstallation().addAll((Collection<? extends IntBuildingInstallationPropertyType>)newValue);
				return;
			case BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfRoomGroup()).set(newValue);
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
			case BuildingPackage.ROOM_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case BuildingPackage.ROOM_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case BuildingPackage.ROOM_TYPE__USAGE:
				getUsage().clear();
				return;
			case BuildingPackage.ROOM_TYPE__LOD4_SOLID:
				setLod4Solid((SolidPropertyType)null);
				return;
			case BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ROOM_TYPE__BOUNDED_BY1:
				getBoundedBy1().clear();
				return;
			case BuildingPackage.ROOM_TYPE__INTERIOR_FURNITURE:
				getInteriorFurniture().clear();
				return;
			case BuildingPackage.ROOM_TYPE__ROOM_INSTALLATION:
				getRoomInstallation().clear();
				return;
			case BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP:
				getGenericApplicationPropertyOfRoomGroup().clear();
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
			case BuildingPackage.ROOM_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case BuildingPackage.ROOM_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case BuildingPackage.ROOM_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case BuildingPackage.ROOM_TYPE__LOD4_SOLID:
				return lod4Solid != null;
			case BuildingPackage.ROOM_TYPE__LOD4_MULTI_SURFACE:
				return lod4MultiSurface != null;
			case BuildingPackage.ROOM_TYPE__BOUNDED_BY1:
				return boundedBy1 != null && !boundedBy1.isEmpty();
			case BuildingPackage.ROOM_TYPE__INTERIOR_FURNITURE:
				return interiorFurniture != null && !interiorFurniture.isEmpty();
			case BuildingPackage.ROOM_TYPE__ROOM_INSTALLATION:
				return roomInstallation != null && !roomInstallation.isEmpty();
			case BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM_GROUP:
				return genericApplicationPropertyOfRoomGroup != null && !genericApplicationPropertyOfRoomGroup.isEmpty();
			case BuildingPackage.ROOM_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ROOM:
				return !getGenericApplicationPropertyOfRoom().isEmpty();
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
		result.append(", genericApplicationPropertyOfRoomGroup: ");
		result.append(genericApplicationPropertyOfRoomGroup);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
