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
 * A representation of the model object '<em><b>Abstract Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Description of a spatial and/or temporal reference system used by a dataset.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractReferenceSystemType#getSrsID <em>Srs ID</em>}</li>
 *   <li>{@link net.opengis.gml.AbstractReferenceSystemType#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.AbstractReferenceSystemType#getValidArea <em>Valid Area</em>}</li>
 *   <li>{@link net.opengis.gml.AbstractReferenceSystemType#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getAbstractReferenceSystemType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractReferenceSystemType' kind='elementOnly'"
 * @generated
 */
public interface AbstractReferenceSystemType extends AbstractReferenceSystemBaseType {
	/**
	 * Returns the value of the '<em><b>Srs ID</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.IdentifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of alterative identifications of this reference system. The first srsID, if any, is normally the primary identification code, and any others are aliases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Srs ID</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getAbstractReferenceSystemType_SrsID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='srsID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentifierType> getSrsID();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comments on or information about this reference system, including source information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference.
	 * @see #setRemarks(StringOrRefType)
	 * @see net.opengis.gml.GmlPackage#getAbstractReferenceSystemType_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getRemarks();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractReferenceSystemType#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Valid Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Area or region in which this CRS object is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Area</em>' containment reference.
	 * @see #setValidArea(ExtentType)
	 * @see net.opengis.gml.GmlPackage#getAbstractReferenceSystemType_ValidArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validArea' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtentType getValidArea();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractReferenceSystemType#getValidArea <em>Valid Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Area</em>' containment reference.
	 * @see #getValidArea()
	 * @generated
	 */
	void setValidArea(ExtentType value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of domain of usage, or limitations of usage, for which this CRS object is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see net.opengis.gml.GmlPackage#getAbstractReferenceSystemType_Scope()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='scope' namespace='##targetNamespace'"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractReferenceSystemType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

} // AbstractReferenceSystemType
