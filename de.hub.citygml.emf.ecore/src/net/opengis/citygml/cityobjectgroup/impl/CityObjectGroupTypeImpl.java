/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityobjectgroup.impl;

import java.util.Collection;

import net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType;
import net.opengis.citygml.cityobjectgroup.CityObjectGroupParentType;
import net.opengis.citygml.cityobjectgroup.CityObjectGroupType;
import net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City Object Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl#getGroupMember <em>Group Member</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl#getGenericApplicationPropertyOfCityObjectGroupGroup <em>Generic Application Property Of City Object Group Group</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupTypeImpl#getGenericApplicationPropertyOfCityObjectGroup1 <em>Generic Application Property Of City Object Group1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityObjectGroupTypeImpl extends AbstractCityObjectTypeImpl implements CityObjectGroupType {
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
	 * The cached value of the '{@link #getGroupMember() <em>Group Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupMember()
	 * @generated
	 * @ordered
	 */
	protected EList<CityObjectGroupMemberType> groupMember;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected CityObjectGroupParentType parent;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType geometry;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfCityObjectGroupGroup() <em>Generic Application Property Of City Object Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfCityObjectGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfCityObjectGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityObjectGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__FUNCTION);
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
			usage = new EDataTypeEList<String>(String.class, this, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CityObjectGroupMemberType> getGroupMember() {
		if (groupMember == null) {
			groupMember = new EObjectContainmentEList<CityObjectGroupMemberType>(CityObjectGroupMemberType.class, this, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GROUP_MEMBER);
		}
		return groupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityObjectGroupParentType getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CityObjectGroupParentType newParent, NotificationChain msgs) {
		CityObjectGroupParentType oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CityObjectGroupParentType newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(GeometryPropertyType newGeometry, NotificationChain msgs) {
		GeometryPropertyType oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY, oldGeometry, newGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(GeometryPropertyType newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfCityObjectGroupGroup() {
		if (genericApplicationPropertyOfCityObjectGroupGroup == null) {
			genericApplicationPropertyOfCityObjectGroupGroup = new BasicFeatureMap(this, CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP_GROUP);
		}
		return genericApplicationPropertyOfCityObjectGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfCityObjectGroup1() {
		return getGenericApplicationPropertyOfCityObjectGroupGroup().list(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GROUP_MEMBER:
				return ((InternalEList<?>)getGroupMember()).basicRemove(otherEnd, msgs);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT:
				return basicSetParent(null, msgs);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCityObjectGroupGroup()).basicRemove(otherEnd, msgs);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP1:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCityObjectGroup1()).basicRemove(otherEnd, msgs);
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__CLASS:
				return getClass_();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__FUNCTION:
				return getFunction();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__USAGE:
				return getUsage();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GROUP_MEMBER:
				return getGroupMember();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT:
				return getParent();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY:
				return getGeometry();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP_GROUP:
				if (coreType) return getGenericApplicationPropertyOfCityObjectGroupGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfCityObjectGroupGroup()).getWrapper();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP1:
				return getGenericApplicationPropertyOfCityObjectGroup1();
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GROUP_MEMBER:
				getGroupMember().clear();
				getGroupMember().addAll((Collection<? extends CityObjectGroupMemberType>)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT:
				setParent((CityObjectGroupParentType)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY:
				setGeometry((GeometryPropertyType)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfCityObjectGroupGroup()).set(newValue);
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__USAGE:
				getUsage().clear();
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GROUP_MEMBER:
				getGroupMember().clear();
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT:
				setParent((CityObjectGroupParentType)null);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY:
				setGeometry((GeometryPropertyType)null);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP_GROUP:
				getGenericApplicationPropertyOfCityObjectGroupGroup().clear();
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GROUP_MEMBER:
				return groupMember != null && !groupMember.isEmpty();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__PARENT:
				return parent != null;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GEOMETRY:
				return geometry != null;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP_GROUP:
				return genericApplicationPropertyOfCityObjectGroupGroup != null && !genericApplicationPropertyOfCityObjectGroupGroup.isEmpty();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP1:
				return !getGenericApplicationPropertyOfCityObjectGroup1().isEmpty();
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
		result.append(", genericApplicationPropertyOfCityObjectGroupGroup: ");
		result.append(genericApplicationPropertyOfCityObjectGroupGroup);
		result.append(')');
		return result.toString();
	}

} //CityObjectGroupTypeImpl
