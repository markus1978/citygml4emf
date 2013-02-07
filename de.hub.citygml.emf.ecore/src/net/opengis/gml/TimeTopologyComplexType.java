/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Topology Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A temporal topology complex.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.TimeTopologyComplexType#getPrimitive <em>Primitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getTimeTopologyComplexType()
 * @model extendedMetaData="name='TimeTopologyComplexType' kind='elementOnly'"
 * @generated
 */
public interface TimeTopologyComplexType extends AbstractTimeComplexType {
	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.TimeTopologyPrimitivePropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getTimeTopologyComplexType_Primitive()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='primitive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeTopologyPrimitivePropertyType> getPrimitive();

} // TimeTopologyComplexType
