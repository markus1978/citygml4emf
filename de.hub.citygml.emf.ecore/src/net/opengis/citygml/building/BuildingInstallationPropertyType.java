/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building;

import net.opengis.gml.AssociationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installation Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of an _AbstractBuilding to its building installations. The
 *                 BuildingInstallationPropertyType element must either carry a reference to a BuildingInstallation object or contain
 *                 a BuildingInstallation object inline, but neither both nor none. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.BuildingInstallationPropertyType#getBuildingInstallation <em>Building Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationPropertyType()
 * @model extendedMetaData="name='BuildingInstallationPropertyType' kind='elementOnly'"
 * @generated
 */
public interface BuildingInstallationPropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Installation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Installation</em>' containment reference.
	 * @see #setBuildingInstallation(BuildingInstallationType)
	 * @see net.opengis.citygml.building.BuildingPackage#getBuildingInstallationPropertyType_BuildingInstallation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BuildingInstallation' namespace='##targetNamespace'"
	 * @generated
	 */
	BuildingInstallationType getBuildingInstallation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.BuildingInstallationPropertyType#getBuildingInstallation <em>Building Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Installation</em>' containment reference.
	 * @see #getBuildingInstallation()
	 * @generated
	 */
	void setBuildingInstallation(BuildingInstallationType value);

} // BuildingInstallationPropertyType
