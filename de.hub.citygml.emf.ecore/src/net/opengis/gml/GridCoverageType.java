/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.GridCoverageType#getGridDomain <em>Grid Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getGridCoverageType()
 * @model extendedMetaData="name='GridCoverageType' kind='elementOnly'"
 * @generated
 */
public interface GridCoverageType extends AbstractDiscreteCoverageType {
	/**
	 * Returns the value of the '<em><b>Grid Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Domain</em>' containment reference.
	 * @see #setGridDomain(GridDomainType)
	 * @see net.opengis.gml.GmlPackage#getGridCoverageType_GridDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gridDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	GridDomainType getGridDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GridCoverageType#getGridDomain <em>Grid Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Domain</em>' containment reference.
	 * @see #getGridDomain()
	 * @generated
	 */
	void setGridDomain(GridDomainType value);

} // GridCoverageType
