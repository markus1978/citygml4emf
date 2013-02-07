/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Of Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to a unit of measure definition that applies to all the numerical values described by the element containing this element. Notice that a complexType which needs to include the uom attribute can do so by extending this complexType. Alternately, this complexType can be used as a pattern for a new complexType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.UnitOfMeasureType#getUom <em>Uom</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getUnitOfMeasureType()
 * @model extendedMetaData="name='UnitOfMeasureType' kind='empty'"
 * @generated
 */
public interface UnitOfMeasureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Uom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a unit of measure definition, usually within the same XML document but possibly outside the XML document which contains this reference. For a reference within the same XML document, the "#" symbol should be used, followed by a text abbreviation of the unit name. However, the "#" symbol may be optional, and still may be interpreted as a reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uom</em>' attribute.
	 * @see #setUom(String)
	 * @see net.opengis.gml.GmlPackage#getUnitOfMeasureType_Uom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='uom'"
	 * @generated
	 */
	String getUom();

	/**
	 * Sets the value of the '{@link net.opengis.gml.UnitOfMeasureType#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see #getUom()
	 * @generated
	 */
	void setUom(String value);

} // UnitOfMeasureType
