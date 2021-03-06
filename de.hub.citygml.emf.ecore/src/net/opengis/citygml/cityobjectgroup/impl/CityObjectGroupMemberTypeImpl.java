/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityobjectgroup.impl;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.cityobjectgroup.CityObjectGroupMemberType;
import net.opengis.citygml.cityobjectgroup.CityobjectgroupPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>City Object Group Member Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getCityObjectGroup <em>City Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getCityObject <em>City Object</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getRole1 <em>Role1</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.citygml.cityobjectgroup.impl.CityObjectGroupMemberTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityObjectGroupMemberTypeImpl extends EObjectImpl implements CityObjectGroupMemberType {
	/**
	 * The cached value of the '{@link #getCityObjectGroup() <em>City Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap cityObjectGroup;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected String arcrole = ARCROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected String remoteSchema = REMOTE_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole1() <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected String role1 = ROLE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "simple";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityObjectGroupMemberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCityObjectGroup() {
		if (cityObjectGroup == null) {
			cityObjectGroup = new BasicFeatureMap(this, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP);
		}
		return cityObjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCityObjectType getCityObject() {
		return (AbstractCityObjectType)getCityObjectGroup().get(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCityObject(AbstractCityObjectType newCityObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getCityObjectGroup()).basicAdd(CityobjectgroupPackage.Literals.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT, newCityObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArcrole() {
		return arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcrole(String newArcrole) {
		String oldArcrole = arcrole;
		arcrole = newArcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE, oldArcrole, arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteSchema() {
		return remoteSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteSchema(String newRemoteSchema) {
		String oldRemoteSchema = remoteSchema;
		remoteSchema = newRemoteSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA, oldRemoteSchema, remoteSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole1() {
		return role1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole1(String newRole1) {
		String oldRole1 = role1;
		role1 = newRole1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1, oldRole1, role1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP:
				return ((InternalEList<?>)getCityObjectGroup()).basicRemove(otherEnd, msgs);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT:
				return basicSetCityObject(null, msgs);
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP:
				if (coreType) return getCityObjectGroup();
				return ((FeatureMap.Internal)getCityObjectGroup()).getWrapper();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT:
				return getCityObject();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE:
				return getActuate();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE:
				return getArcrole();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__HREF:
				return getHref();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA:
				return getRemoteSchema();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE:
				return getRole();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1:
				return getRole1();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW:
				return getShow();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE:
				return getTitle();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE:
				return getType();
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP:
				((FeatureMap.Internal)getCityObjectGroup()).set(newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE:
				setArcrole((String)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__HREF:
				setHref((String)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA:
				setRemoteSchema((String)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1:
				setRole1((String)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE:
				setType((String)newValue);
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP:
				getCityObjectGroup().clear();
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE:
				unsetActuate();
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA:
				setRemoteSchema(REMOTE_SCHEMA_EDEFAULT);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1:
				setRole1(ROLE1_EDEFAULT);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW:
				unsetShow();
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE:
				unsetType();
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
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT_GROUP:
				return cityObjectGroup != null && !cityObjectGroup.isEmpty();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__CITY_OBJECT:
				return getCityObject() != null;
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ACTUATE:
				return isSetActuate();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__REMOTE_SCHEMA:
				return REMOTE_SCHEMA_EDEFAULT == null ? remoteSchema != null : !REMOTE_SCHEMA_EDEFAULT.equals(remoteSchema);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__ROLE1:
				return ROLE1_EDEFAULT == null ? role1 != null : !ROLE1_EDEFAULT.equals(role1);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__SHOW:
				return isSetShow();
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CityobjectgroupPackage.CITY_OBJECT_GROUP_MEMBER_TYPE__TYPE:
				return isSetType();
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
		result.append(" (cityObjectGroup: ");
		result.append(cityObjectGroup);
		result.append(", actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", href: ");
		result.append(href);
		result.append(", remoteSchema: ");
		result.append(remoteSchema);
		result.append(", role: ");
		result.append(role);
		result.append(", role1: ");
		result.append(role1);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CityObjectGroupMemberTypeImpl
