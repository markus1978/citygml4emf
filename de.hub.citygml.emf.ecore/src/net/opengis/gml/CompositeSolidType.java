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
 * A representation of the model object '<em><b>Composite Solid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A composite solid is a geometry type with all the geometric properties of a (primitive) solid. 
 * 				Essentially, a composite solid is a collection of solids that join in pairs on common boundary surfaces and which, when considered as a whole, form a single solid.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.CompositeSolidType#getSolidMember <em>Solid Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getCompositeSolidType()
 * @model extendedMetaData="name='CompositeSolidType' kind='elementOnly'"
 * @generated
 */
public interface CompositeSolidType extends AbstractSolidType {
	/**
	 * Returns the value of the '<em><b>Solid Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.SolidPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element references or contains one solid in the composite solid. The solids are contiguous.
	 * NOTE: This definition allows for a nested structure, i.e. a CompositeSolid may use, for example, another CompositeSolid as a member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Member</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getCompositeSolidType_SolidMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='solidMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SolidPropertyType> getSolidMember();

} // CompositeSolidType
