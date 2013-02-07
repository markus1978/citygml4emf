/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import net.opengis.gml.AssociationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Representation Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of a _CityObject to its implicit geometry representation, which is a
 *                 representation of a geometry by referencing a prototype and transforming it to its real position in space. The
 *                 ImplicitRepresentationPropertyType element must either carry a reference to a ImplicitGeometry object or contain a
 *                 ImplicitGeometry object inline, but neither both nor none. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.ImplicitRepresentationPropertyType#getImplicitGeometry <em>Implicit Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getImplicitRepresentationPropertyType()
 * @model extendedMetaData="name='ImplicitRepresentationPropertyType' kind='elementOnly'"
 * @generated
 */
public interface ImplicitRepresentationPropertyType extends AssociationType {
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
	 * @see net.opengis.citygml.CitygmlPackage#getImplicitRepresentationPropertyType_ImplicitGeometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImplicitGeometry' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplicitGeometryType getImplicitGeometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.ImplicitRepresentationPropertyType#getImplicitGeometry <em>Implicit Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Geometry</em>' containment reference.
	 * @see #getImplicitGeometry()
	 * @generated
	 */
	void setImplicitGeometry(ImplicitGeometryType value);

} // ImplicitRepresentationPropertyType
