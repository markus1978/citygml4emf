/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.AbstractSiteType;
import net.opengis.citygml.AddressType;
import net.opengis.citygml.CityModelType;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.DocumentRoot;
import net.opengis.citygml.ImplicitGeometryType;
import net.opengis.gml.FeaturePropertyType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getSite <em>Site</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getCityObject <em>City Object</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getGenericApplicationPropertyOfAddress <em>Generic Application Property Of Address</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getGenericApplicationPropertyOfCityModel <em>Generic Application Property Of City Model</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getGenericApplicationPropertyOfCityObject <em>Generic Application Property Of City Object</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getGenericApplicationPropertyOfSite <em>Generic Application Property Of Site</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getCityModel <em>City Model</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getCityObjectMember <em>City Object Member</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.DocumentRootImpl#getImplicitGeometry <em>Implicit Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CitygmlPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CitygmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CitygmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSiteType getSite() {
		return (AbstractSiteType)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__SITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(AbstractSiteType newSite, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__SITE, newSite, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCityObjectType getCityObject() {
		return (AbstractCityObjectType)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCityObject(AbstractCityObjectType newCityObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT, newCityObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfAddress() {
		return (EObject)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfAddress(EObject newGenericApplicationPropertyOfAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS, newGenericApplicationPropertyOfAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfCityModel() {
		return (EObject)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfCityModel(EObject newGenericApplicationPropertyOfCityModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL, newGenericApplicationPropertyOfCityModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfCityObject() {
		return (EObject)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfCityObject(EObject newGenericApplicationPropertyOfCityObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT, newGenericApplicationPropertyOfCityObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfSite() {
		return (EObject)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfSite(EObject newGenericApplicationPropertyOfSite, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SITE, newGenericApplicationPropertyOfSite, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType getAddress() {
		return (AddressType)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressType newAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressType newAddress) {
		((FeatureMap.Internal)getMixed()).set(CitygmlPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CityModelType getCityModel() {
		return (CityModelType)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCityModel(CityModelType newCityModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_MODEL, newCityModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCityModel(CityModelType newCityModel) {
		((FeatureMap.Internal)getMixed()).set(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_MODEL, newCityModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturePropertyType getCityObjectMember() {
		return (FeaturePropertyType)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCityObjectMember(FeaturePropertyType newCityObjectMember, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_MEMBER, newCityObjectMember, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCityObjectMember(FeaturePropertyType newCityObjectMember) {
		((FeatureMap.Internal)getMixed()).set(CitygmlPackage.Literals.DOCUMENT_ROOT__CITY_OBJECT_MEMBER, newCityObjectMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitGeometryType getImplicitGeometry() {
		return (ImplicitGeometryType)getMixed().get(CitygmlPackage.Literals.DOCUMENT_ROOT__IMPLICIT_GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplicitGeometry(ImplicitGeometryType newImplicitGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CitygmlPackage.Literals.DOCUMENT_ROOT__IMPLICIT_GEOMETRY, newImplicitGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitGeometry(ImplicitGeometryType newImplicitGeometry) {
		((FeatureMap.Internal)getMixed()).set(CitygmlPackage.Literals.DOCUMENT_ROOT__IMPLICIT_GEOMETRY, newImplicitGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__SITE:
				return basicSetSite(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__CITY_OBJECT:
				return basicSetCityObject(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS:
				return basicSetGenericApplicationPropertyOfAddress(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL:
				return basicSetGenericApplicationPropertyOfCityModel(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT:
				return basicSetGenericApplicationPropertyOfCityObject(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SITE:
				return basicSetGenericApplicationPropertyOfSite(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__ADDRESS:
				return basicSetAddress(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__CITY_MODEL:
				return basicSetCityModel(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__CITY_OBJECT_MEMBER:
				return basicSetCityObjectMember(null, msgs);
			case CitygmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
				return basicSetImplicitGeometry(null, msgs);
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
			case CitygmlPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CitygmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CitygmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CitygmlPackage.DOCUMENT_ROOT__SITE:
				return getSite();
			case CitygmlPackage.DOCUMENT_ROOT__CITY_OBJECT:
				return getCityObject();
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS:
				return getGenericApplicationPropertyOfAddress();
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL:
				return getGenericApplicationPropertyOfCityModel();
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT:
				return getGenericApplicationPropertyOfCityObject();
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SITE:
				return getGenericApplicationPropertyOfSite();
			case CitygmlPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case CitygmlPackage.DOCUMENT_ROOT__CITY_MODEL:
				return getCityModel();
			case CitygmlPackage.DOCUMENT_ROOT__CITY_OBJECT_MEMBER:
				return getCityObjectMember();
			case CitygmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
				return getImplicitGeometry();
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
			case CitygmlPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)newValue);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__CITY_MODEL:
				setCityModel((CityModelType)newValue);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__CITY_OBJECT_MEMBER:
				setCityObjectMember((FeaturePropertyType)newValue);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
				setImplicitGeometry((ImplicitGeometryType)newValue);
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
			case CitygmlPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CitygmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CitygmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CitygmlPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((AddressType)null);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__CITY_MODEL:
				setCityModel((CityModelType)null);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__CITY_OBJECT_MEMBER:
				setCityObjectMember((FeaturePropertyType)null);
				return;
			case CitygmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
				setImplicitGeometry((ImplicitGeometryType)null);
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
			case CitygmlPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CitygmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CitygmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CitygmlPackage.DOCUMENT_ROOT__SITE:
				return getSite() != null;
			case CitygmlPackage.DOCUMENT_ROOT__CITY_OBJECT:
				return getCityObject() != null;
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_ADDRESS:
				return getGenericApplicationPropertyOfAddress() != null;
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_MODEL:
				return getGenericApplicationPropertyOfCityModel() != null;
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT:
				return getGenericApplicationPropertyOfCityObject() != null;
			case CitygmlPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SITE:
				return getGenericApplicationPropertyOfSite() != null;
			case CitygmlPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress() != null;
			case CitygmlPackage.DOCUMENT_ROOT__CITY_MODEL:
				return getCityModel() != null;
			case CitygmlPackage.DOCUMENT_ROOT__CITY_OBJECT_MEMBER:
				return getCityObjectMember() != null;
			case CitygmlPackage.DOCUMENT_ROOT__IMPLICIT_GEOMETRY:
				return getImplicitGeometry() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
