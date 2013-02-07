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
 * A representation of the model object '<em><b>Compound CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A coordinate reference system describing the position of points through two or more independent coordinate reference systems. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.CompoundCRSType#getIncludesCRS <em>Includes CRS</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getCompoundCRSType()
 * @model extendedMetaData="name='CompoundCRSType' kind='elementOnly'"
 * @generated
 */
public interface CompoundCRSType extends AbstractReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Includes CRS</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.CoordinateReferenceSystemRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered sequence of associations to all the component coordinate reference systems included in this compound coordinate reference system. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes CRS</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getCompoundCRSType_IncludesCRS()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='includesCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoordinateReferenceSystemRefType> getIncludesCRS();

} // CompoundCRSType
