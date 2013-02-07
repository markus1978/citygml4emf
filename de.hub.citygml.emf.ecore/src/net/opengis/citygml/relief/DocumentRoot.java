/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import net.opengis.gml.LengthType;

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
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfBreaklineRelief <em>Generic Application Property Of Breakline Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfMassPointRelief <em>Generic Application Property Of Mass Point Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfRasterRelief <em>Generic Application Property Of Raster Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfReliefComponent <em>Generic Application Property Of Relief Component</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfReliefFeature <em>Generic Application Property Of Relief Feature</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getGenericApplicationPropertyOfTinRelief <em>Generic Application Property Of Tin Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getReliefComponent <em>Relief Component</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getBreaklineRelief <em>Breakline Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getElevation <em>Elevation</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getMassPointRelief <em>Mass Point Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getRasterRelief <em>Raster Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getReliefFeature <em>Relief Feature</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.DocumentRoot#getTINRelief <em>TIN Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot()
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
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_Mixed()
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
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Breakline Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Breakline Relief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Breakline Relief</em>' containment reference.
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_GenericApplicationPropertyOfBreaklineRelief()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBreaklineRelief' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfBreaklineRelief();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Mass Point Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Mass Point Relief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Mass Point Relief</em>' containment reference.
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_GenericApplicationPropertyOfMassPointRelief()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfMassPointRelief' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfMassPointRelief();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Raster Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Raster Relief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Raster Relief</em>' containment reference.
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_GenericApplicationPropertyOfRasterRelief()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfRasterRelief' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfRasterRelief();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Relief Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Relief Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Relief Component</em>' containment reference.
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_GenericApplicationPropertyOfReliefComponent()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfReliefComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfReliefComponent();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Relief Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Relief Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Relief Feature</em>' containment reference.
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_GenericApplicationPropertyOfReliefFeature()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfReliefFeature' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfReliefFeature();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Tin Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Tin Relief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Tin Relief</em>' containment reference.
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_GenericApplicationPropertyOfTinRelief()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTinRelief' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getGenericApplicationPropertyOfTinRelief();

	/**
	 * Returns the value of the '<em><b>Relief Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relief Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relief Component</em>' containment reference.
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_ReliefComponent()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_ReliefComponent' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	AbstractReliefComponentType getReliefComponent();

	/**
	 * Returns the value of the '<em><b>Breakline Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Breakline Relief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Breakline Relief</em>' containment reference.
	 * @see #setBreaklineRelief(BreaklineReliefType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_BreaklineRelief()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BreaklineRelief' namespace='##targetNamespace' affiliation='_ReliefComponent'"
	 * @generated
	 */
	BreaklineReliefType getBreaklineRelief();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.DocumentRoot#getBreaklineRelief <em>Breakline Relief</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Breakline Relief</em>' containment reference.
	 * @see #getBreaklineRelief()
	 * @generated
	 */
	void setBreaklineRelief(BreaklineReliefType value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation</em>' containment reference.
	 * @see #setElevation(LengthType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_Elevation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Elevation' namespace='##targetNamespace' affiliation='http://www.opengis.net/gml#_Object'"
	 * @generated
	 */
	LengthType getElevation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.DocumentRoot#getElevation <em>Elevation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' containment reference.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(LengthType value);

	/**
	 * Returns the value of the '<em><b>Mass Point Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Point Relief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Point Relief</em>' containment reference.
	 * @see #setMassPointRelief(MassPointReliefType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_MassPointRelief()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MassPointRelief' namespace='##targetNamespace' affiliation='_ReliefComponent'"
	 * @generated
	 */
	MassPointReliefType getMassPointRelief();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.DocumentRoot#getMassPointRelief <em>Mass Point Relief</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Point Relief</em>' containment reference.
	 * @see #getMassPointRelief()
	 * @generated
	 */
	void setMassPointRelief(MassPointReliefType value);

	/**
	 * Returns the value of the '<em><b>Raster Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raster Relief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raster Relief</em>' containment reference.
	 * @see #setRasterRelief(RasterReliefType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_RasterRelief()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RasterRelief' namespace='##targetNamespace' affiliation='_ReliefComponent'"
	 * @generated
	 */
	RasterReliefType getRasterRelief();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.DocumentRoot#getRasterRelief <em>Raster Relief</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raster Relief</em>' containment reference.
	 * @see #getRasterRelief()
	 * @generated
	 */
	void setRasterRelief(RasterReliefType value);

	/**
	 * Returns the value of the '<em><b>Relief Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relief Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relief Feature</em>' containment reference.
	 * @see #setReliefFeature(ReliefFeatureType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_ReliefFeature()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReliefFeature' namespace='##targetNamespace' affiliation='http://www.opengis.net/citygml/1.0#_CityObject'"
	 * @generated
	 */
	ReliefFeatureType getReliefFeature();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.DocumentRoot#getReliefFeature <em>Relief Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relief Feature</em>' containment reference.
	 * @see #getReliefFeature()
	 * @generated
	 */
	void setReliefFeature(ReliefFeatureType value);

	/**
	 * Returns the value of the '<em><b>TIN Relief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TIN Relief</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TIN Relief</em>' containment reference.
	 * @see #setTINRelief(TINReliefType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getDocumentRoot_TINRelief()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TINRelief' namespace='##targetNamespace' affiliation='_ReliefComponent'"
	 * @generated
	 */
	TINReliefType getTINRelief();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.DocumentRoot#getTINRelief <em>TIN Relief</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TIN Relief</em>' containment reference.
	 * @see #getTINRelief()
	 * @generated
	 */
	void setTINRelief(TINReliefType value);

} // DocumentRoot
