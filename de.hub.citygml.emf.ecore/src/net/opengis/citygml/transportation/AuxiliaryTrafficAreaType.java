/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation;

import net.opengis.gml.MultiSurfacePropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Traffic Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type describing the class for auxiliary traffic Areas. These are the surfaces where no traffic
 *                 actually takes place, but which belong to a transportation object. Examples are kerbstones, road markings and
 *                 grass stripes. As subclass of _CityObject, an AuxiliaryTrafficArea inherits all attributes and relations, in
 *                 particular an id, names, external references, and generalization relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getSurfaceMaterial <em>Surface Material</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getGenericApplicationPropertyOfAuxiliaryTrafficAreaGroup <em>Generic Application Property Of Auxiliary Traffic Area Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getGenericApplicationPropertyOfAuxiliaryTrafficArea <em>Generic Application Property Of Auxiliary Traffic Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.transportation.TransportationPackage#getAuxiliaryTrafficAreaType()
 * @model extendedMetaData="name='AuxiliaryTrafficAreaType' kind='elementOnly'"
 * @generated
 */
public interface AuxiliaryTrafficAreaType extends AbstractTransportationObjectType {
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
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAuxiliaryTrafficAreaType_Function()
	 * @model unique="false" dataType="net.opengis.citygml.transportation.AuxiliaryTrafficAreaFunctionType"
	 *        extendedMetaData="kind='element' name='function' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getFunction();

	/**
	 * Returns the value of the '<em><b>Surface Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Material</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Material</em>' attribute.
	 * @see #setSurfaceMaterial(String)
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAuxiliaryTrafficAreaType_SurfaceMaterial()
	 * @model dataType="net.opengis.citygml.transportation.TrafficSurfaceMaterialType"
	 *        extendedMetaData="kind='element' name='surfaceMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSurfaceMaterial();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getSurfaceMaterial <em>Surface Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Material</em>' attribute.
	 * @see #getSurfaceMaterial()
	 * @generated
	 */
	void setSurfaceMaterial(String value);

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
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAuxiliaryTrafficAreaType_Lod2MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod2MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod2MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod2MultiSurface <em>Lod2 Multi Surface</em>}' containment reference.
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
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAuxiliaryTrafficAreaType_Lod3MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod3MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod3MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod3MultiSurface <em>Lod3 Multi Surface</em>}' containment reference.
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
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAuxiliaryTrafficAreaType_Lod4MultiSurface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lod4MultiSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSurfacePropertyType getLod4MultiSurface();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.transportation.AuxiliaryTrafficAreaType#getLod4MultiSurface <em>Lod4 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod4 Multi Surface</em>' containment reference.
	 * @see #getLod4MultiSurface()
	 * @generated
	 */
	void setLod4MultiSurface(MultiSurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Auxiliary Traffic Area Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Auxiliary Traffic Area Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Auxiliary Traffic Area Group</em>' attribute list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficAreaGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfAuxiliaryTrafficArea:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfAuxiliaryTrafficAreaGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Auxiliary Traffic Area</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Auxiliary Traffic Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Auxiliary Traffic Area</em>' containment reference list.
	 * @see net.opengis.citygml.transportation.TransportationPackage#getAuxiliaryTrafficAreaType_GenericApplicationPropertyOfAuxiliaryTrafficArea()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfAuxiliaryTrafficArea' namespace='##targetNamespace' group='_GenericApplicationPropertyOfAuxiliaryTrafficArea:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfAuxiliaryTrafficArea();

} // AuxiliaryTrafficAreaType
