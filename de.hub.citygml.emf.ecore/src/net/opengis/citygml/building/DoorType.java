/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import net.opengis.citygml.AddressPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Type for doors in walls. Used in LOD3 and LOD4 only . As subclass of _CityObject, a Door inherits
 *                 all attributes and relations, in particular an id, names, external references, and generalization relations.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.DoorType#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DoorType#getGenericApplicationPropertyOfDoorGroup <em>Generic Application Property Of Door Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.DoorType#getGenericApplicationPropertyOfDoor <em>Generic Application Property Of Door</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getDoorType()
 * @model extendedMetaData="name='DoorType' kind='elementOnly'"
 * @generated
 */
public interface DoorType extends AbstractOpeningType {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.citygml.AddressPropertyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getDoorType_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressPropertyType> getAddress();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Door Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Door Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Door Group</em>' attribute list.
	 * @see net.opengis.citygml.building.BuildingPackage#getDoorType_GenericApplicationPropertyOfDoorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfDoor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfDoorGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Door</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Door</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Door</em>' containment reference list.
	 * @see net.opengis.citygml.building.BuildingPackage#getDoorType_GenericApplicationPropertyOfDoor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfDoor' namespace='##targetNamespace' group='_GenericApplicationPropertyOfDoor:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfDoor();

} // DoorType
