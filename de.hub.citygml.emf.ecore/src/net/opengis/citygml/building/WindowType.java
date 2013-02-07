/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Type for windows in walls. Used in LOD3 and LOD4 only . As subclass of _CityObject, a window
 *                 inherits all attributes and relations, in particular an id, names, external references, and generalization
 *                 relations. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.WindowType#getGenericApplicationPropertyOfWindowGroup <em>Generic Application Property Of Window Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.WindowType#getGenericApplicationPropertyOfWindow <em>Generic Application Property Of Window</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getWindowType()
 * @model extendedMetaData="name='WindowType' kind='elementOnly'"
 * @generated
 */
public interface WindowType extends AbstractOpeningType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Window Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Window Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Window Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getWindowType_GenericApplicationPropertyOfWindowGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfWindow:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfWindowGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Window</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Window</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Window</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getWindowType_GenericApplicationPropertyOfWindow()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfWindow' namespace='##targetNamespace' group='_GenericApplicationPropertyOfWindow:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfWindow();

} // WindowType
