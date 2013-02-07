/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief;

import net.opengis.gml.AssociationType;
import net.opengis.gml.RectifiedGridCoverageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of a RasterReliefType to its components. The gridPropertyType element must
 *                     either carry a reference to a gml:RectifiedGridCoverage object or contain a gml:RectifiedGridCoverage object
 *                     inline, but neither both nor none. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.GridPropertyType#getRectifiedGridCoverage <em>Rectified Grid Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.relief.ReliefPackage#getGridPropertyType()
 * @model extendedMetaData="name='gridPropertyType' kind='elementOnly'"
 * @generated
 */
public interface GridPropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Rectified Grid Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectified Grid Coverage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectified Grid Coverage</em>' containment reference.
	 * @see #setRectifiedGridCoverage(RectifiedGridCoverageType)
	 * @see net.opengis.citygml.relief.ReliefPackage#getGridPropertyType_RectifiedGridCoverage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RectifiedGridCoverage' namespace='http://www.opengis.net/gml'"
	 * @generated
	 */
	RectifiedGridCoverageType getRectifiedGridCoverage();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.relief.GridPropertyType#getRectifiedGridCoverage <em>Rectified Grid Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectified Grid Coverage</em>' containment reference.
	 * @see #getRectifiedGridCoverage()
	 * @generated
	 */
	void setRectifiedGridCoverage(RectifiedGridCoverageType value);

} // GridPropertyType
