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
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.BuildingType#getGenericApplicationPropertyOfBuildingGroup <em>Generic Application Property Of Building Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.BuildingType#getGenericApplicationPropertyOfBuilding <em>Generic Application Property Of Building</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getBuildingType()
 * @model extendedMetaData="name='BuildingType' kind='elementOnly'"
 * @generated
 */
public interface BuildingType extends AbstractBuildingType {
	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingType_GenericApplicationPropertyOfBuildingGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfBuilding:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfBuildingGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Building</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Building</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Building</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingType_GenericApplicationPropertyOfBuilding()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfBuilding' namespace='##targetNamespace' group='_GenericApplicationPropertyOfBuilding:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfBuilding();

} // BuildingType
