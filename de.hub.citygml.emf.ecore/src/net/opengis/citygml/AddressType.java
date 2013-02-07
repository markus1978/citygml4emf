/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.MultiPointPropertyType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Type for addresses. It references the xAL address standard issued by the OASIS consortium. Please
 *                 note, that addresses are modelled as GML features. Every address can be assigned zero or more 2D or 3D point
 *                 geometries (one gml:MultiPoint geometry) locating the entrance(s). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.AddressType#getXalAddress <em>Xal Address</em>}</li>
 *   <li>{@link net.opengis.citygml.AddressType#getMultiPoint <em>Multi Point</em>}</li>
 *   <li>{@link net.opengis.citygml.AddressType#getGenericApplicationPropertyOfAddressGroup <em>Generic Application Property Of Address Group</em>}</li>
 *   <li>{@link net.opengis.citygml.AddressType#getGenericApplicationPropertyOfAddress <em>Generic Application Property Of Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getAddressType()
 * @model extendedMetaData="name='AddressType' kind='elementOnly'"
 * @generated
 */
public interface AddressType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Xal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xal Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xal Address</em>' containment reference.
	 * @see #setXalAddress(XalAddressPropertyType)
	 * @see net.opengis.citygml.CitygmlPackage#getAddressType_XalAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xalAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	XalAddressPropertyType getXalAddress();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.AddressType#getXalAddress <em>Xal Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xal Address</em>' containment reference.
	 * @see #getXalAddress()
	 * @generated
	 */
	void setXalAddress(XalAddressPropertyType value);

	/**
	 * Returns the value of the '<em><b>Multi Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Point</em>' containment reference.
	 * @see #setMultiPoint(MultiPointPropertyType)
	 * @see net.opengis.citygml.CitygmlPackage#getAddressType_MultiPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='multiPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiPointPropertyType getMultiPoint();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.AddressType#getMultiPoint <em>Multi Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Point</em>' containment reference.
	 * @see #getMultiPoint()
	 * @generated
	 */
	void setMultiPoint(MultiPointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Address Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Address Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Address Group</em>' attribute list.
	 * @see net.opengis.citygml.CitygmlPackage#getAddressType_GenericApplicationPropertyOfAddressGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_GenericApplicationPropertyOfAddress:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGenericApplicationPropertyOfAddressGroup();

	/**
	 * Returns the value of the '<em><b>Generic Application Property Of Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Application Property Of Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Application Property Of Address</em>' containment reference list.
	 * @see net.opengis.citygml.CitygmlPackage#getAddressType_GenericApplicationPropertyOfAddress()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_GenericApplicationPropertyOfAddress' namespace='##targetNamespace' group='_GenericApplicationPropertyOfAddress:group'"
	 * @generated
	 */
	EList<EObject> getGenericApplicationPropertyOfAddress();

} // AddressType
