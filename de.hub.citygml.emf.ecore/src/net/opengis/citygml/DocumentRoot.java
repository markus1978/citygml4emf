/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import net.opengis.gml.FeaturePropertyType;

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
 *   <li>{@link net.opengis.citygml.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getSite <em>Site</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getCityObject <em>City Object</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfAddress <em>Generic Application Property Of Address</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfCityModel <em>Generic Application Property Of City Model</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfCityObject <em>Generic Application Property Of City Object</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getGenericApplicationPropertyOfSite <em>Generic Application Property Of Site</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getCityModel <em>City Model</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getCityObjectMember <em>City Object Member</em>}</li>
 *   <li>{@link net.opengis.citygml.DocumentRoot#getImplicitGeometry <em>Implicit Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot()
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
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_Mixed()
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
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference.
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_Site()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Site' namespace='##targetNamespace' affiliation='_CityObject'"
	 * @generated
	 */
	AbstractSiteType getSite();

	/**
	 * Returns the value of the '<em><b>City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Object</em>' containment reference.
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_CityObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_CityObject' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#_Feature'"
	 * @generated
	 */
	AbstractCityObjectType getCityObject();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Address</em>' containment reference.
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_GenericApplicationPropertyOfAddress()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfAddress();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Model</em>' containment reference.
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_GenericApplicationPropertyOfCityModel()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfCityModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfCityModel();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of City Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of City Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of City Object</em>' containment reference.
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_GenericApplicationPropertyOfCityObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfCityObject' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfCityObject();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Site</em>' containment reference.
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_GenericApplicationPropertyOfSite()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfSite' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfSite();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_Address()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#_Feature'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.DocumentRoot#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>City Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Model</em>' containment reference.
	 * @see #setCityModel(CityModelType)
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_CityModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CityModel' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#_FeatureCollection'"
	 * @generated
	 */
	CityModelType getCityModel();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.DocumentRoot#getCityModel <em>City Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Model</em>' containment reference.
	 * @see #getCityModel()
	 * @generated
	 */
	void setCityModel(CityModelType value);

	/**
	 * Returns the value of the '<em><b>City Object Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Object Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Object Member</em>' containment reference.
	 * @see #setCityObjectMember(FeaturePropertyType)
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_CityObjectMember()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cityObjectMember' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#featureMember'"
	 * @generated
	 */
	FeaturePropertyType getCityObjectMember();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.DocumentRoot#getCityObjectMember <em>City Object Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Object Member</em>' containment reference.
	 * @see #getCityObjectMember()
	 * @generated
	 */
	void setCityObjectMember(FeaturePropertyType value);

	/**
	 * Returns the value of the '<em><b>Implicit Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implicit Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implicit Geometry</em>' containment reference.
	 * @see #setImplicitGeometry(ImplicitGeometryType)
	 * @see net.opengis.citygml.CitygmlPackage#getDocumentRoot_ImplicitGeometry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImplicitGeometry' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#_GML'"
	 * @generated
	 */
	ImplicitGeometryType getImplicitGeometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.DocumentRoot#getImplicitGeometry <em>Implicit Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Geometry</em>' containment reference.
	 * @see #getImplicitGeometry()
	 * @generated
	 */
	void setImplicitGeometry(ImplicitGeometryType value);

} // DocumentRoot
