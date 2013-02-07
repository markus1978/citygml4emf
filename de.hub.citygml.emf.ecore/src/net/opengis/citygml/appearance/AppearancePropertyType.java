/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import net.opengis.gml.FeaturePropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of a _CityObject resp. CityModel to its appearances. The AppearancePropertyType
 *                 element must either carry a reference to a Appearance object or contain a Appearance object inline, but neither
 *                 both nor none.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.AppearancePropertyType#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getAppearancePropertyType()
 * @model extendedMetaData="name='AppearancePropertyType' kind='elementOnly'"
 * @generated
 */
public interface AppearancePropertyType extends FeaturePropertyType {
	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' containment reference.
	 * @see #setAppearance(AppearanceType)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAppearancePropertyType_Appearance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Appearance' namespace='##targetNamespace'"
	 * @generated
	 */
	AppearanceType getAppearance();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.AppearancePropertyType#getAppearance <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' containment reference.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(AppearanceType value);

} // AppearancePropertyType
