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
 * A representation of the model object '<em><b>Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [complexType of] Predefined concrete value of the top-level property. Encapsulates all other styling information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.StyleType#getFeatureStyle <em>Feature Style</em>}</li>
 *   <li>{@link net.opengis.gml.StyleType#getGraphStyle <em>Graph Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getStyleType()
 * @model extendedMetaData="name='StyleType' kind='elementOnly'"
 * @generated
 */
public interface StyleType extends AbstractStyleType {
	/**
	 * Returns the value of the '<em><b>Feature Style</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.FeatureStylePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Style</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getStyleType_FeatureStyle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='featureStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FeatureStylePropertyType> getFeatureStyle();

	/**
	 * Returns the value of the '<em><b>Graph Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Style</em>' containment reference.
	 * @see #setGraphStyle(GraphStylePropertyType)
	 * @see net.opengis.gml.GmlPackage#getStyleType_GraphStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphStylePropertyType getGraphStyle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.StyleType#getGraphStyle <em>Graph Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Style</em>' containment reference.
	 * @see #getGraphStyle()
	 * @generated
	 */
	void setGraphStyle(GraphStylePropertyType value);

} // StyleType
