/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation;

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
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfPlantCover <em>Generic Application Property Of Plant Cover</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfSolitaryVegetationObject <em>Generic Application Property Of Solitary Vegetation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getGenericApplicationPropertyOfVegetationObject <em>Generic Application Property Of Vegetation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getVegetationObject <em>Vegetation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getPlantCover <em>Plant Cover</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.DocumentRoot#getSolitaryVegetationObject <em>Solitary Vegetation Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot()
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_Mixed()
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Plant Cover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Plant Cover</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Plant Cover</em>' containment reference.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_GenericApplicationPropertyOfPlantCover()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfPlantCover' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfPlantCover();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Solitary Vegetation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Solitary Vegetation Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Solitary Vegetation Object</em>' containment reference.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_GenericApplicationPropertyOfSolitaryVegetationObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfSolitaryVegetationObject' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfSolitaryVegetationObject();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Vegetation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Vegetation Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Vegetation Object</em>' containment reference.
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_GenericApplicationPropertyOfVegetationObject()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfVegetationObject' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfVegetationObject();

	/**
	 * Returns the value of the '<em><b>Vegetation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vegetation Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vegetation Object</em>' containment reference.
	 * @see #setVegetationObject(AbstractVegetationObjectType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_VegetationObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_VegetationObject' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	AbstractVegetationObjectType getVegetationObject();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.DocumentRoot#getVegetationObject <em>Vegetation Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vegetation Object</em>' containment reference.
	 * @see #getVegetationObject()
	 * @generated
	 */
	void setVegetationObject(AbstractVegetationObjectType value);

	/**
	 * Returns the value of the '<em><b>Plant Cover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Cover</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Cover</em>' containment reference.
	 * @see #setPlantCover(PlantCoverType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_PlantCover()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlantCover' namespace='##targetNamespace' affiliation='_VegetationObject'"
	 * @generated
	 */
	PlantCoverType getPlantCover();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.DocumentRoot#getPlantCover <em>Plant Cover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant Cover</em>' containment reference.
	 * @see #getPlantCover()
	 * @generated
	 */
	void setPlantCover(PlantCoverType value);

	/**
	 * Returns the value of the '<em><b>Solitary Vegetation Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solitary Vegetation Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solitary Vegetation Object</em>' containment reference.
	 * @see #setSolitaryVegetationObject(SolitaryVegetationObjectType)
	 * @see net.opengis.citygml.vegetation.VegetationPackage#getDocumentRoot_SolitaryVegetationObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SolitaryVegetationObject' namespace='##targetNamespace' affiliation='_VegetationObject'"
	 * @generated
	 */
	SolitaryVegetationObjectType getSolitaryVegetationObject();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.vegetation.DocumentRoot#getSolitaryVegetationObject <em>Solitary Vegetation Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solitary Vegetation Object</em>' containment reference.
	 * @see #getSolitaryVegetationObject()
	 * @generated
	 */
	void setSolitaryVegetationObject(SolitaryVegetationObjectType value);

} // DocumentRoot
