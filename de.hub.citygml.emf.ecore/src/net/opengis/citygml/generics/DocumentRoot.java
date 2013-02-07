/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getGenericAttribute <em>Generic Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getDateAttribute <em>Date Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getDoubleAttribute <em>Double Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getGenericCityObject <em>Generic City Object</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getIntAttribute <em>Int Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getStringAttribute <em>String Attribute</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.DocumentRoot#getUriAttribute <em>Uri Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Generic Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Attribute</em>' containment reference.
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_GenericAttribute()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_genericAttribute' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_GenericApplicationPropertyOfCityObject'"
	 * @generated
	 */
	AbstractGenericAttributeType getGenericAttribute();

	/**
	 * Returns the value of the '<em><b>Date Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Attribute</em>' containment reference.
	 * @see #setDateAttribute(DateAttributeType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_DateAttribute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dateAttribute' namespace='##targetNamespace' affiliation='_genericAttribute'"
	 * @generated
	 */
	DateAttributeType getDateAttribute();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.DocumentRoot#getDateAttribute <em>Date Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Attribute</em>' containment reference.
	 * @see #getDateAttribute()
	 * @generated
	 */
	void setDateAttribute(DateAttributeType value);

	/**
	 * Returns the value of the '<em><b>Double Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Attribute</em>' containment reference.
	 * @see #setDoubleAttribute(DoubleAttributeType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_DoubleAttribute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='doubleAttribute' namespace='##targetNamespace' affiliation='_genericAttribute'"
	 * @generated
	 */
	DoubleAttributeType getDoubleAttribute();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.DocumentRoot#getDoubleAttribute <em>Double Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Attribute</em>' containment reference.
	 * @see #getDoubleAttribute()
	 * @generated
	 */
	void setDoubleAttribute(DoubleAttributeType value);

	/**
	 * Returns the value of the '<em><b>Generic City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic City Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic City Object</em>' containment reference.
	 * @see #setGenericCityObject(GenericCityObjectType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_GenericCityObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenericCityObject' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	GenericCityObjectType getGenericCityObject();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.DocumentRoot#getGenericCityObject <em>Generic City Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic City Object</em>' containment reference.
	 * @see #getGenericCityObject()
	 * @generated
	 */
	void setGenericCityObject(GenericCityObjectType value);

	/**
	 * Returns the value of the '<em><b>Int Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Attribute</em>' containment reference.
	 * @see #setIntAttribute(IntAttributeType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_IntAttribute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='intAttribute' namespace='##targetNamespace' affiliation='_genericAttribute'"
	 * @generated
	 */
	IntAttributeType getIntAttribute();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.DocumentRoot#getIntAttribute <em>Int Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Attribute</em>' containment reference.
	 * @see #getIntAttribute()
	 * @generated
	 */
	void setIntAttribute(IntAttributeType value);

	/**
	 * Returns the value of the '<em><b>String Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Attribute</em>' containment reference.
	 * @see #setStringAttribute(StringAttributeType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_StringAttribute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='stringAttribute' namespace='##targetNamespace' affiliation='_genericAttribute'"
	 * @generated
	 */
	StringAttributeType getStringAttribute();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.DocumentRoot#getStringAttribute <em>String Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Attribute</em>' containment reference.
	 * @see #getStringAttribute()
	 * @generated
	 */
	void setStringAttribute(StringAttributeType value);

	/**
	 * Returns the value of the '<em><b>Uri Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Attribute</em>' containment reference.
	 * @see #setUriAttribute(UriAttributeType)
	 * @see net.opengis.citygml.generics.GenericsPackage#getDocumentRoot_UriAttribute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uriAttribute' namespace='##targetNamespace' affiliation='_genericAttribute'"
	 * @generated
	 */
	UriAttributeType getUriAttribute();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.generics.DocumentRoot#getUriAttribute <em>Uri Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Attribute</em>' containment reference.
	 * @see #getUriAttribute()
	 * @generated
	 */
	void setUriAttribute(UriAttributeType value);

} // DocumentRoot
