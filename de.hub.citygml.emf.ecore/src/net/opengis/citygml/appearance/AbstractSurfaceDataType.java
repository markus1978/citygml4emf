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
 * A representation of the model object '<em><b>Abstract Surface Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for textures and material. Contains only isFront-flag.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#isIsFront <em>Is Front</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#getGenericApplicationPropertyOfSurfaceDataGroup <em>Generic Application Property Of Surface Data Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#getGenericApplicationPropertyOfSurfaceData <em>Generic Application Property Of Surface Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractSurfaceDataType()
 * @model extendedMetaData="name='AbstractSurfaceDataType' kind='elementOnly'"
 * @generated
 */
public interface AbstractSurfaceDataType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Is Front</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Front</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Front</em>' attribute.
	 * @see #isSetIsFront()
	 * @see #unsetIsFront()
	 * @see #setIsFront(boolean)
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractSurfaceDataType_IsFront()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='isFront' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsFront();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#isIsFront <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Front</em>' attribute.
	 * @see #isSetIsFront()
	 * @see #unsetIsFront()
	 * @see #isIsFront()
	 * @generated
	 */
	void setIsFront(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#isIsFront <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsFront()
	 * @see #isIsFront()
	 * @see #setIsFront(boolean)
	 * @generated
	 */
	void unsetIsFront();

	/**
	 * Returns whether the value of the '{@link net.opengis.citygml.appearance.AbstractSurfaceDataType#isIsFront <em>Is Front</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Front</em>' attribute is set.
	 * @see #unsetIsFront()
	 * @see #isIsFront()
	 * @see #setIsFront(boolean)
	 * @generated
	 */
	boolean isSetIsFront();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Surface Data Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Surface Data Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Surface Data Group</em>' attribute list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceDataGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfSurfaceData:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfSurfaceDataGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Surface Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Surface Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Surface Data</em>' containment reference list.
	 * @see net.opengis.citygml.appearance.AppearancePackage#getAbstractSurfaceDataType_GenericApplicationPropertyOfSurfaceData()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfSurfaceData' namespace='##targetNamespace' group='_GenericApplicationPropertyOfSurfaceData:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfSurfaceData();

} // AbstractSurfaceDataType
