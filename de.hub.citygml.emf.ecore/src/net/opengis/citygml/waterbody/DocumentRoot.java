/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody;

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
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterBody <em>Generic Application Property Of Water Body</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterBoundarySurface <em>Generic Application Property Of Water Boundary Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterClosureSurface <em>Generic Application Property Of Water Closure Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterGroundSurface <em>Generic Application Property Of Water Ground Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterObject <em>Generic Application Property Of Water Object</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getGenericApplicationPropertyOfWaterSurface <em>Generic Application Property Of Water Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterBoundarySurface <em>Water Boundary Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterObject <em>Water Object</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterBody <em>Water Body</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterClosureSurface <em>Water Closure Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterGroundSurface <em>Water Ground Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterSurface <em>Water Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot()
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
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_Mixed()
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
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Body</em>' containment reference.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_GenericApplicationPropertyOfWaterBody()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterBody' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfWaterBody();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Boundary Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Boundary Surface</em>' containment reference.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_GenericApplicationPropertyOfWaterBoundarySurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterBoundarySurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfWaterBoundarySurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Closure Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Closure Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Closure Surface</em>' containment reference.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_GenericApplicationPropertyOfWaterClosureSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterClosureSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfWaterClosureSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Ground Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Ground Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Ground Surface</em>' containment reference.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_GenericApplicationPropertyOfWaterGroundSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterGroundSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfWaterGroundSurface();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Object</em>' containment reference.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_GenericApplicationPropertyOfWaterObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterObject' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfWaterObject();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Water Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Water Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Water Surface</em>' containment reference.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_GenericApplicationPropertyOfWaterSurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWaterSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfWaterSurface();

	/**
	 * Returns the value of the '<em><b>Water Boundary Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Boundary Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Boundary Surface</em>' containment reference.
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_WaterBoundarySurface()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_WaterBoundarySurface' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	AbstractWaterBoundarySurfaceType getWaterBoundarySurface();

	/**
	 * Returns the value of the '<em><b>Water Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Object</em>' containment reference.
	 * @see #setWaterObject(AbstractWaterObjectType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_WaterObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_WaterObject' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	AbstractWaterObjectType getWaterObject();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterObject <em>Water Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Object</em>' containment reference.
	 * @see #getWaterObject()
	 * @generated
	 */
	void setWaterObject(AbstractWaterObjectType value);

	/**
	 * Returns the value of the '<em><b>Water Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Body</em>' containment reference.
	 * @see #setWaterBody(WaterBodyType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_WaterBody()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WaterBody' namespace='##targetNamespace' affiliation='_WaterObject'"
	 * @generated
	 */
	WaterBodyType getWaterBody();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterBody <em>Water Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Body</em>' containment reference.
	 * @see #getWaterBody()
	 * @generated
	 */
	void setWaterBody(WaterBodyType value);

	/**
	 * Returns the value of the '<em><b>Water Closure Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Closure Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Closure Surface</em>' containment reference.
	 * @see #setWaterClosureSurface(WaterClosureSurfaceType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_WaterClosureSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WaterClosureSurface' namespace='##targetNamespace' affiliation='_WaterBoundarySurface'"
	 * @generated
	 */
	WaterClosureSurfaceType getWaterClosureSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterClosureSurface <em>Water Closure Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Closure Surface</em>' containment reference.
	 * @see #getWaterClosureSurface()
	 * @generated
	 */
	void setWaterClosureSurface(WaterClosureSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Water Ground Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Ground Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Ground Surface</em>' containment reference.
	 * @see #setWaterGroundSurface(WaterGroundSurfaceType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_WaterGroundSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WaterGroundSurface' namespace='##targetNamespace' affiliation='_WaterBoundarySurface'"
	 * @generated
	 */
	WaterGroundSurfaceType getWaterGroundSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterGroundSurface <em>Water Ground Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Ground Surface</em>' containment reference.
	 * @see #getWaterGroundSurface()
	 * @generated
	 */
	void setWaterGroundSurface(WaterGroundSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Water Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Surface</em>' containment reference.
	 * @see #setWaterSurface(WaterSurfaceType)
	 * @see net.opengis.citygml.waterbody.WaterbodyPackage#getDocumentRoot_WaterSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WaterSurface' namespace='##targetNamespace' affiliation='_WaterBoundarySurface'"
	 * @generated
	 */
	WaterSurfaceType getWaterSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.waterbody.DocumentRoot#getWaterSurface <em>Water Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Surface</em>' containment reference.
	 * @see #getWaterSurface()
	 * @generated
	 */
	void setWaterSurface(WaterSurfaceType value);

} // DocumentRoot
