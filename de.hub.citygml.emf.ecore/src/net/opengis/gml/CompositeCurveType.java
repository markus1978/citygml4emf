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
 * A representation of the model object '<em><b>Composite Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CompositeCurve is defined by a sequence of (orientable) curves such that the each curve in the sequence terminates at the start point of the subsequent curve in the list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.CompositeCurveType#getCurveMember <em>Curve Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getCompositeCurveType()
 * @model extendedMetaData="name='CompositeCurveType' kind='elementOnly'"
 * @generated
 */
public interface CompositeCurveType extends AbstractCurveType {
	/**
	 * Returns the value of the '<em><b>Curve Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.CurvePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element references or contains one curve in the composite curve. The curves are contiguous, the collection of curves is ordered.
	 * NOTE: This definition allows for a nested structure, i.e. a CompositeCurve may use, for example, another CompositeCurve as a curve member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curve Member</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getCompositeCurveType_CurveMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='curveMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CurvePropertyType> getCurveMember();

} // CompositeCurveType
