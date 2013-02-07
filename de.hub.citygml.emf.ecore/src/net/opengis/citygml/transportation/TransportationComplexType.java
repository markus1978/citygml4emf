/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation;

import net.opengis.gml.GeometricComplexPropertyType;
import net.opengis.gml.MultiSurfacePropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing transportation complexes, which are aggregated features, e.g. roads, which consist
 *                 of parts (traffic areas, e.g. pedestrian path, and auxiliary traffic areas). As subclass of _CityObject, a
 *                 TransportationComplex inherits all attributes and relations, in particular an id, names, external references, and
 *                 generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getTrafficArea <em>Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getAuxiliaryTrafficArea <em>Auxiliary Traffic Area</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getLod0Network <em>Lod0 Network</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getGenericApplicationPropertyOfTransportationComplexGroup <em>Generic Application Property Of Transportation Complex Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.TransportationComplexType#getGenericApplicationPropertyOfTransportationComplex <em>Generic Application Property Of Transportation Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType()
 * @model extendedMetaData="name='TransportationComplexType' kind='elementOnly'"
 * @generated
 */
public interface TransportationComplexType extends AbstractTransportationObjectType {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.transportation.TransportationComplexFunctionType"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFunction();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_Usage()
	 * @model unique="false" dataType="net.opengis.citygml.transportation.TransportationComplexUsageType"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getUsage();

	/**
	 * Returns the value of the '<em><b>Traffic Area</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.transportation.TrafficAreaPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traffic Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Area</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_TrafficArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trafficArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrafficAreaPropertyType> getTrafficArea();

	/**
	 * Returns the value of the '<em><b>Auxiliary Traffic Area</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Traffic Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Traffic Area</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_AuxiliaryTrafficArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='auxiliaryTrafficArea' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuxiliaryTrafficAreaPropertyType> getAuxiliaryTrafficArea();

	/**
	 * Returns the value of the '<em><b>Lod0 Network</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.GeometricComplexPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod0 Network</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod0 Network</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_Lod0Network()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod0Network' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GeometricComplexPropertyType> getLod0Network();

	/**
	 * Returns the value of the '<em><b>Lod1 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod1 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod1 Multi Surface</em>' containment reference.
	 * @see #setLod1MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_Lod1MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod1MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod1MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod1MultiSurface <em>Lod1 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod1 Multi Surface</em>' containment reference.
	 * @see #getLod1MultiSurface()
	 * @generated
	 */
	void setLod1MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod2 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod2 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod2 Multi Surface</em>' containment reference.
	 * @see #setLod2MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_Lod2MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod2MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod2 Multi Surface</em>' containment reference.
	 * @see #getLod2MultiSurface()
	 * @generated
	 */
	void setLod2MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod3 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod3 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod3 Multi Surface</em>' containment reference.
	 * @see #setLod3MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_Lod3MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod3MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod3 Multi Surface</em>' containment reference.
	 * @see #getLod3MultiSurface()
	 * @generated
	 */
	void setLod3MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Lod4 Multi Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod4 Multi Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod4 Multi Surface</em>' containment reference.
	 * @see #setLod4MultiSurface(MultiSurfacePropertyType)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_Lod4MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod4MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.TransportationComplexType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Multi Surface</em>' containment reference.
	 * @see #getLod4MultiSurface()
	 * @generated
	 */
	void setLod4MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Transportation Complex Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Transportation Complex Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Transportation Complex Group</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_GenericApplicationPropertyOfTransportationComplexGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfTransportationComplex:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfTransportationComplexGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Transportation Complex</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Transportation Complex</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Transportation Complex</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getTransportationComplexType_GenericApplicationPropertyOfTransportationComplex()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfTransportationComplex' namespace='##targetNamespace' group='_GenericApplicationPropertyOfTransportationComplex:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfTransportationComplex();

} // TransportationComplexType
