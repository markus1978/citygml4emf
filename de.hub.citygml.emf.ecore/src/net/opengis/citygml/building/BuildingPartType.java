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
 * A representation of the model object '<em><b>Part Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.BuildingPartType#getGenericApplicationPropertyOfBuildingPartGroup <em>Generic Application Property Of Building Part Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingPartType#getGenericApplicationPropertyOfBuildingPart <em>Generic Application Property Of Building Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getBuildingPartType()
 * @model extendedMetaData="name='BuildingPartType' kind='elementOnly'"
 * @generated
 */
public interface BuildingPartType extends AbstractBuildingType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Part Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Part Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Part Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingPartType_GenericApplicationPropertyOfBuildingPartGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfBuildingPart:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfBuildingPartGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Part</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingPartType_GenericApplicationPropertyOfBuildingPart()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBuildingPart' namespace='##targetNamespace' group='_GenericApplicationPropertyOfBuildingPart:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfBuildingPart();

} // BuildingPartType
