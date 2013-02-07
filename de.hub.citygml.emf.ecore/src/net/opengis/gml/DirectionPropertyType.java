/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml;

import org.eclipse.emf.ecore.EObject;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getDirectionVector <em>Direction Vector</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getCompassPoint <em>Compass Point</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getDirectionKeyword <em>Direction Keyword</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getDirectionString <em>Direction String</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getShow <em>Show</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionPropertyType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType()
 * @model extendedMetaData="name='DirectionPropertyType' kind='elementOnly'"
 * @generated
 */
public interface DirectionPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Vector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Vector</em>' containment reference.
	 * @see #setDirectionVector(DirectionVectorType)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_DirectionVector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionVector' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionVectorType getDirectionVector();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getDirectionVector <em>Direction Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Vector</em>' containment reference.
	 * @see #getDirectionVector()
	 * @generated
	 */
	void setDirectionVector(DirectionVectorType value);

	/**
	 * Returns the value of the '<em><b>Compass Point</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml.CompassPointEnumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compass Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compass Point</em>' attribute.
	 * @see net.opengis.gml.CompassPointEnumeration
	 * @see #isSetCompassPoint()
	 * @see #unsetCompassPoint()
	 * @see #setCompassPoint(CompassPointEnumeration)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_CompassPoint()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CompassPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	CompassPointEnumeration getCompassPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getCompassPoint <em>Compass Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compass Point</em>' attribute.
	 * @see net.opengis.gml.CompassPointEnumeration
	 * @see #isSetCompassPoint()
	 * @see #unsetCompassPoint()
	 * @see #getCompassPoint()
	 * @generated
	 */
	void setCompassPoint(CompassPointEnumeration value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.DirectionPropertyType#getCompassPoint <em>Compass Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompassPoint()
	 * @see #getCompassPoint()
	 * @see #setCompassPoint(CompassPointEnumeration)
	 * @generated
	 */
	void unsetCompassPoint();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.DirectionPropertyType#getCompassPoint <em>Compass Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Compass Point</em>' attribute is set.
	 * @see #unsetCompassPoint()
	 * @see #getCompassPoint()
	 * @see #setCompassPoint(CompassPointEnumeration)
	 * @generated
	 */
	boolean isSetCompassPoint();

	/**
	 * Returns the value of the '<em><b>Direction Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Keyword</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Keyword</em>' containment reference.
	 * @see #setDirectionKeyword(CodeType)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_DirectionKeyword()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionKeyword' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getDirectionKeyword();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getDirectionKeyword <em>Direction Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Keyword</em>' containment reference.
	 * @see #getDirectionKeyword()
	 * @generated
	 */
	void setDirectionKeyword(CodeType value);

	/**
	 * Returns the value of the '<em><b>Direction String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction String</em>' containment reference.
	 * @see #setDirectionString(StringOrRefType)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_DirectionString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionString' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getDirectionString();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getDirectionString <em>Direction String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction String</em>' containment reference.
	 * @see #getDirectionString()
	 * @generated
	 */
	void setDirectionString(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The 'actuate' attribute is used to communicate the desired timing 
	 *         of traversal from the starting resource to the ending resource; 
	 *         it's value should be treated as follows:
	 *         onLoad - traverse to the ending resource immediately on loading 
	 *                  the starting resource 
	 *         onRequest - traverse from the starting resource to the ending 
	 *                     resource only on a post-loading event triggered for 
	 *                     this purpose 
	 *         other - behavior is unconstrained; examine other markup in link 
	 *                 for hints 
	 *         none - behavior is unconstrained
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.DirectionPropertyType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.DirectionPropertyType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcrole</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getArcrole();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to an XML Schema fragment that specifies the content model of the propertys value. This is in conformance with the XML Schema Section 4.14 Referencing Schemas from Elsewhere.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Schema</em>' attribute.
	 * @see #setRemoteSchema(String)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_RemoteSchema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='remoteSchema' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemoteSchema();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getRemoteSchema <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Schema</em>' attribute.
	 * @see #getRemoteSchema()
	 * @generated
	 */
	void setRemoteSchema(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The 'show' attribute is used to communicate the desired presentation 
	 *         of the ending resource on traversal from the starting resource; it's 
	 *         value should be treated as follows: 
	 *         new - load ending resource in a new window, frame, pane, or other 
	 *               presentation context
	 *         replace - load the resource in the same window, frame, pane, or 
	 *                   other presentation context
	 *         embed - load ending resource in place of the presentation of the 
	 *                 starting resource
	 *         other - behavior is unconstrained; examine other markup in the 
	 *                 link for hints 
	 *         none - behavior is unconstrained 
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.DirectionPropertyType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.DirectionPropertyType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see net.opengis.gml.GmlPackage#getDirectionPropertyType_Type()
	 * @model default="simple" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.DirectionPropertyType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.DirectionPropertyType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

} // DirectionPropertyType
