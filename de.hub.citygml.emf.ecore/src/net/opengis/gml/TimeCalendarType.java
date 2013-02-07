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
 * A representation of the model object '<em><b>Time Calendar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A calendar is a discrete temporal reference system 
 *       that provides a basis for defining temporal position to a resolution of one day. 
 *       A single calendar may reference more than one calendar era.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.TimeCalendarType#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getTimeCalendarType()
 * @model extendedMetaData="name='TimeCalendarType' kind='elementOnly'"
 * @generated
 */
public interface TimeCalendarType extends AbstractTimeReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.TimeCalendarEraPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to the CalendarEras that it uses as a reference for dating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Frame</em>' containment reference list.
	 * @see net.opengis.gml.GmlPackage#getTimeCalendarType_ReferenceFrame()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeCalendarEraPropertyType> getReferenceFrame();

} // TimeCalendarType
