/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line String Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.LineStringSegmentArrayPropertyType#getLineStringSegment <em>Line String Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getLineStringSegmentArrayPropertyType()
 * @model extendedMetaData="name='LineStringSegmentArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface LineStringSegmentArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Line String Segment</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.LineStringSegmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line String Segment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String Segment</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getLineStringSegmentArrayPropertyType_LineStringSegment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LineStringSegment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LineStringSegmentType> getLineStringSegment();

} // LineStringSegmentArrayPropertyType
