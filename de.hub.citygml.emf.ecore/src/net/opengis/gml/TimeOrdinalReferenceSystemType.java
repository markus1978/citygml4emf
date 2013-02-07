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
 * A representation of the model object '<em><b>Time Ordinal Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In an ordinal reference system the order of events in time can be well 
 *       established, but the magnitude of the intervals between them can not be 
 *       accurately determined (e.g. a stratigraphic sequence).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.TimeOrdinalReferenceSystemType#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getTimeOrdinalReferenceSystemType()
 * @model extendedMetaData="name='TimeOrdinalReferenceSystemType' kind='elementOnly'"
 * @generated
 */
public interface TimeOrdinalReferenceSystemType extends AbstractTimeReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.TimeOrdinalEraPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getTimeOrdinalReferenceSystemType_Component()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeOrdinalEraPropertyType> getComponent();

} // TimeOrdinalReferenceSystemType
