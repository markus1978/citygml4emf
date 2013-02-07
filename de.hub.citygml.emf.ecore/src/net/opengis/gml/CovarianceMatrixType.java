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
 * A representation of the model object '<em><b>Covariance Matrix Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Error estimate covariance matrix. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.CovarianceMatrixType#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link net.opengis.gml.CovarianceMatrixType#getIncludesElement <em>Includes Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getCovarianceMatrixType()
 * @model extendedMetaData="name='CovarianceMatrixType' kind='elementOnly'"
 * @generated
 */
public interface CovarianceMatrixType extends AbstractPositionalAccuracyType {
	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.UnitOfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered sequence of units of measure, corresponding to the row and column index numbers of the covariance matrix, starting with row and column 1 and ending with row/column N. Each unit of measure is for the ordinate reflected in the relevant row and column of the covariance matrix. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getCovarianceMatrixType_UnitOfMeasure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='unitOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnitOfMeasureType> getUnitOfMeasure();

	/**
	 * Returns the value of the '<em><b>Includes Element</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.CovarianceElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unordered set of elements in this covariance matrix. Because the covariance matrix is symmetrical, only the elements in the upper or lower diagonal part (including the main diagonal) of the matrix need to be specified. Any zero valued covariance elements can be omitted. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Includes Element</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getCovarianceMatrixType_IncludesElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='includesElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CovarianceElementType> getIncludesElement();

} // CovarianceMatrixType
