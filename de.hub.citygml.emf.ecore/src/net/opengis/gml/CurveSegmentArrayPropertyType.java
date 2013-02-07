/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Segment Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A container for an array of curve segments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.CurveSegmentArrayPropertyType#getCurveSegmentGroup <em>Curve Segment Group</em>}</li>
 *   <li>{@link net.opengis.gml.CurveSegmentArrayPropertyType#getCurveSegment <em>Curve Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getCurveSegmentArrayPropertyType()
 * @model extendedMetaData="name='CurveSegmentArrayPropertyType' kind='elementOnly'"
 * @generated
 */
public interface CurveSegmentArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Curve Segment Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_CurveSegment" element is the abstract head of the substituition group for all curve segment elements, i.e. continuous segments of the same interpolation mechanism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Segment Group</em>' attribute list.
	 * @see net.opengis.gml.GmlPackage#getCurveSegmentArrayPropertyType_CurveSegmentGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_CurveSegment:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCurveSegmentGroup();

	/**
	 * Returns the value of the '<em><b>Curve Segment</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AbstractCurveSegmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_CurveSegment" element is the abstract head of the substituition group for all curve segment elements, i.e. continuous segments of the same interpolation mechanism.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Segment</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getCurveSegmentArrayPropertyType_CurveSegment()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_CurveSegment' namespace='##targetNamespace' group='_CurveSegment:group'"
	 * @generated
	 */
	EList<AbstractCurveSegmentType> getCurveSegment();

} // CurveSegmentArrayPropertyType
