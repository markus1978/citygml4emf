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
 * A representation of the model object '<em><b>Int Building Installation Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Denotes the relation of an _AbstractBuilding to its interior building installations. The
 *                 IntBuildingInstallationPropertyType element must either carry a reference to a IntBuildingInstallation object or
 *                 contain a IntBuildingInstallation object inline, but neither both nor none. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.IntBuildingInstallationPropertyType#getIntBuildingInstallation <em>Int Building Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationPropertyType()
 * @model extendedMetaData="name='IntBuildingInstallationPropertyType' kind='elementOnly'"
 * @generated
 */
public interface IntBuildingInstallationPropertyType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Int Building Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Building Installation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Building Installation</em>' containment reference.
	 * @see #setIntBuildingInstallation(IntBuildingInstallationType)
	 * @see net.opengis.citygml.building.BuildingPackage#getIntBuildingInstallationPropertyType_IntBuildingInstallation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntBuildingInstallation' namespace='##targetNamespace'"
	 * @generated
	 */
	IntBuildingInstallationType getIntBuildingInstallation();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.building.IntBuildingInstallationPropertyType#getIntBuildingInstallation <em>Int Building Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Building Installation</em>' containment reference.
	 * @see #getIntBuildingInstallation()
	 * @generated
	 */
	void setIntBuildingInstallation(IntBuildingInstallationType value);

} // IntBuildingInstallationPropertyType
