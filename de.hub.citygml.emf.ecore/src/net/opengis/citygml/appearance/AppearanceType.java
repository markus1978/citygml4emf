/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance;

import net.opengis.gml.AbstractFeatureType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Named container for all surface data (texture/material). All appearances of the same name ("theme")
 *                 within a CityGML file are considered a group. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.AppearanceType#getTheme <em>Theme</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AppearanceType#getSurfaceDataMember <em>Surface Data Member</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AppearanceType#getGenericApplicationPropertyOfAppearanceGroup <em>Generic Application Property Of Appearance Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AppearanceType#getGenericApplicationPropertyOfAppearance <em>Generic Application Property Of Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getAppearanceType()
 * @model extendedMetaData="name='AppearanceType' kind='elementOnly'"
 * @generated
 */
public interface AppearanceType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see #setTheme(String)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAppearanceType_Theme()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='theme' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTheme();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.AppearanceType#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(String value);

	/**
	 * Returns the value of the '<em><b>Surface Data Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.appearance.SurfaceDataPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Data Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Data Member</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAppearanceType_SurfaceDataMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='surfaceDataMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SurfaceDataPropertyType> getSurfaceDataMember();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Appearance Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Appearance Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Appearance Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAppearanceType_GenericApplicationPropertyOfAppearanceGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfAppearance:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfAppearanceGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Appearance</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Appearance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Appearance</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAppearanceType_GenericApplicationPropertyOfAppearance()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfAppearance' namespace='##targetNamespace' group='_GenericApplicationPropertyOfAppearance:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfAppearance();

} // AppearanceType
