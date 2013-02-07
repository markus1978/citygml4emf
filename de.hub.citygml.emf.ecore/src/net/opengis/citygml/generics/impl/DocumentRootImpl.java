/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics.impl;

import net.opengis.citygml.generics.AbstractGenericAttributeType;
import net.opengis.citygml.generics.DateAttributeType;
import net.opengis.citygml.generics.DocumentRoot;
import net.opengis.citygml.generics.DoubleAttributeType;
import net.opengis.citygml.generics.GenericCityObjectType;
import net.opengis.citygml.generics.GenericsPackage;
import net.opengis.citygml.generics.IntAttributeType;
import net.opengis.citygml.generics.StringAttributeType;
import net.opengis.citygml.generics.UriAttributeType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getGenericAttribute <em>Generic Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getDateAttribute <em>Date Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getDoubleAttribute <em>Double Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getGenericCityObject <em>Generic City Object</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getIntAttribute <em>Int Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getStringAttribute <em>String Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.DocumentRootImpl#getUriAttribute <em>Uri Attribute</em>}</li>
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
		return GenericsPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GenericsPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GenericsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GenericsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGenericAttributeType getGenericAttribute() {
		return (AbstractGenericAttributeType)getMixed().get(GenericsPackage.Literals.DOCUMENT_ROOT__GENERIC_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericAttribute(AbstractGenericAttributeType newGenericAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GenericsPackage.Literals.DOCUMENT_ROOT__GENERIC_ATTRIBUTE, newGenericAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateAttributeType getDateAttribute() {
		return (DateAttributeType)getMixed().get(GenericsPackage.Literals.DOCUMENT_ROOT__DATE_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAttribute(DateAttributeType newDateAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GenericsPackage.Literals.DOCUMENT_ROOT__DATE_ATTRIBUTE, newDateAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAttribute(DateAttributeType newDateAttribute) {
		((FeatureMap.Internal)getMixed()).set(GenericsPackage.Literals.DOCUMENT_ROOT__DATE_ATTRIBUTE, newDateAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleAttributeType getDoubleAttribute() {
		return (DoubleAttributeType)getMixed().get(GenericsPackage.Literals.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoubleAttribute(DoubleAttributeType newDoubleAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GenericsPackage.Literals.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE, newDoubleAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleAttribute(DoubleAttributeType newDoubleAttribute) {
		((FeatureMap.Internal)getMixed()).set(GenericsPackage.Literals.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE, newDoubleAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericCityObjectType getGenericCityObject() {
		return (GenericCityObjectType)getMixed().get(GenericsPackage.Literals.DOCUMENT_ROOT__GENERIC_CITY_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericCityObject(GenericCityObjectType newGenericCityObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GenericsPackage.Literals.DOCUMENT_ROOT__GENERIC_CITY_OBJECT, newGenericCityObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericCityObject(GenericCityObjectType newGenericCityObject) {
		((FeatureMap.Internal)getMixed()).set(GenericsPackage.Literals.DOCUMENT_ROOT__GENERIC_CITY_OBJECT, newGenericCityObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntAttributeType getIntAttribute() {
		return (IntAttributeType)getMixed().get(GenericsPackage.Literals.DOCUMENT_ROOT__INT_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntAttribute(IntAttributeType newIntAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GenericsPackage.Literals.DOCUMENT_ROOT__INT_ATTRIBUTE, newIntAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntAttribute(IntAttributeType newIntAttribute) {
		((FeatureMap.Internal)getMixed()).set(GenericsPackage.Literals.DOCUMENT_ROOT__INT_ATTRIBUTE, newIntAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAttributeType getStringAttribute() {
		return (StringAttributeType)getMixed().get(GenericsPackage.Literals.DOCUMENT_ROOT__STRING_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringAttribute(StringAttributeType newStringAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GenericsPackage.Literals.DOCUMENT_ROOT__STRING_ATTRIBUTE, newStringAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringAttribute(StringAttributeType newStringAttribute) {
		((FeatureMap.Internal)getMixed()).set(GenericsPackage.Literals.DOCUMENT_ROOT__STRING_ATTRIBUTE, newStringAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UriAttributeType getUriAttribute() {
		return (UriAttributeType)getMixed().get(GenericsPackage.Literals.DOCUMENT_ROOT__URI_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUriAttribute(UriAttributeType newUriAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GenericsPackage.Literals.DOCUMENT_ROOT__URI_ATTRIBUTE, newUriAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriAttribute(UriAttributeType newUriAttribute) {
		((FeatureMap.Internal)getMixed()).set(GenericsPackage.Literals.DOCUMENT_ROOT__URI_ATTRIBUTE, newUriAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericsPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GenericsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case GenericsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case GenericsPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE:
				return basicSetGenericAttribute(null, msgs);
			case GenericsPackage.DOCUMENT_ROOT__DATE_ATTRIBUTE:
				return basicSetDateAttribute(null, msgs);
			case GenericsPackage.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE:
				return basicSetDoubleAttribute(null, msgs);
			case GenericsPackage.DOCUMENT_ROOT__GENERIC_CITY_OBJECT:
				return basicSetGenericCityObject(null, msgs);
			case GenericsPackage.DOCUMENT_ROOT__INT_ATTRIBUTE:
				return basicSetIntAttribute(null, msgs);
			case GenericsPackage.DOCUMENT_ROOT__STRING_ATTRIBUTE:
				return basicSetStringAttribute(null, msgs);
			case GenericsPackage.DOCUMENT_ROOT__URI_ATTRIBUTE:
				return basicSetUriAttribute(null, msgs);
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
			case GenericsPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GenericsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case GenericsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case GenericsPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE:
				return getGenericAttribute();
			case GenericsPackage.DOCUMENT_ROOT__DATE_ATTRIBUTE:
				return getDateAttribute();
			case GenericsPackage.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE:
				return getDoubleAttribute();
			case GenericsPackage.DOCUMENT_ROOT__GENERIC_CITY_OBJECT:
				return getGenericCityObject();
			case GenericsPackage.DOCUMENT_ROOT__INT_ATTRIBUTE:
				return getIntAttribute();
			case GenericsPackage.DOCUMENT_ROOT__STRING_ATTRIBUTE:
				return getStringAttribute();
			case GenericsPackage.DOCUMENT_ROOT__URI_ATTRIBUTE:
				return getUriAttribute();
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
			case GenericsPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GenericsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case GenericsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case GenericsPackage.DOCUMENT_ROOT__DATE_ATTRIBUTE:
				setDateAttribute((DateAttributeType)newValue);
				return;
			case GenericsPackage.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE:
				setDoubleAttribute((DoubleAttributeType)newValue);
				return;
			case GenericsPackage.DOCUMENT_ROOT__GENERIC_CITY_OBJECT:
				setGenericCityObject((GenericCityObjectType)newValue);
				return;
			case GenericsPackage.DOCUMENT_ROOT__INT_ATTRIBUTE:
				setIntAttribute((IntAttributeType)newValue);
				return;
			case GenericsPackage.DOCUMENT_ROOT__STRING_ATTRIBUTE:
				setStringAttribute((StringAttributeType)newValue);
				return;
			case GenericsPackage.DOCUMENT_ROOT__URI_ATTRIBUTE:
				setUriAttribute((UriAttributeType)newValue);
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
			case GenericsPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case GenericsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case GenericsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case GenericsPackage.DOCUMENT_ROOT__DATE_ATTRIBUTE:
				setDateAttribute((DateAttributeType)null);
				return;
			case GenericsPackage.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE:
				setDoubleAttribute((DoubleAttributeType)null);
				return;
			case GenericsPackage.DOCUMENT_ROOT__GENERIC_CITY_OBJECT:
				setGenericCityObject((GenericCityObjectType)null);
				return;
			case GenericsPackage.DOCUMENT_ROOT__INT_ATTRIBUTE:
				setIntAttribute((IntAttributeType)null);
				return;
			case GenericsPackage.DOCUMENT_ROOT__STRING_ATTRIBUTE:
				setStringAttribute((StringAttributeType)null);
				return;
			case GenericsPackage.DOCUMENT_ROOT__URI_ATTRIBUTE:
				setUriAttribute((UriAttributeType)null);
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
			case GenericsPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GenericsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case GenericsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case GenericsPackage.DOCUMENT_ROOT__GENERIC_ATTRIBUTE:
				return getGenericAttribute() != null;
			case GenericsPackage.DOCUMENT_ROOT__DATE_ATTRIBUTE:
				return getDateAttribute() != null;
			case GenericsPackage.DOCUMENT_ROOT__DOUBLE_ATTRIBUTE:
				return getDoubleAttribute() != null;
			case GenericsPackage.DOCUMENT_ROOT__GENERIC_CITY_OBJECT:
				return getGenericCityObject() != null;
			case GenericsPackage.DOCUMENT_ROOT__INT_ATTRIBUTE:
				return getIntAttribute() != null;
			case GenericsPackage.DOCUMENT_ROOT__STRING_ATTRIBUTE:
				return getStringAttribute() != null;
			case GenericsPackage.DOCUMENT_ROOT__URI_ATTRIBUTE:
				return getUriAttribute() != null;
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
