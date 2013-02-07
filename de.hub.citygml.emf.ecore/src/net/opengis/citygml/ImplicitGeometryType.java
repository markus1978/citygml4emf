/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml;

import java.util.List;

import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.PointPropertyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Type for the implicit representation of a geometry. An implicit geometry is a geometric object,
 *                 where the shape is stored only once as a prototypical geometry, e.g. a tree or other vegetation object, a traffic
 *                 light or a traffic sign. This prototypic geometry object is re-used or referenced many times, wherever the
 *                 corresponding feature occurs in the 3D city model. Each occurrence is represented by a link to the prototypic
 *                 shape geometry (in a local cartesian coordinate system), by a transforma-tion matrix that is multiplied with each
 *                 3D coordinate tuple of the prototype, and by an anchor point denoting the base point of the object in the world
 *                 coordinate reference system. In order to determine the absolute coordinates of an implicit geometry, the anchor
 *                 point coordinates have to be added to the matrix multiplication results. The transformation matrix accounts for
 *                 the intended rotation, scaling, and local translation of the prototype. It is a 4x4 matrix that is multiplied with
 *                 the prototype coordinates using homogeneous coordinates, i.e. (x,y,z,1). This way even a projection might be
 *                 modelled by the transformation matrix. The concept of implicit geometries is an enhancement of the geometry model
 *                 of GML3. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.opengis.citygml.ImplicitGeometryType#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link net.opengis.citygml.ImplicitGeometryType#getTransformationMatrix <em>Transformation Matrix</em>}</li>
 *   <li>{@link net.opengis.citygml.ImplicitGeometryType#getLibraryObject <em>Library Object</em>}</li>
 *   <li>{@link net.opengis.citygml.ImplicitGeometryType#getRelativeGMLGeometry <em>Relative GML Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.ImplicitGeometryType#getReferencePoint <em>Reference Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.opengis.citygml.CitygmlPackage#getImplicitGeometryType()
 * @model extendedMetaData="name='ImplicitGeometryType' kind='elementOnly'"
 * @generated
 */
public interface ImplicitGeometryType extends AbstractGMLType {
	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see net.opengis.citygml.CitygmlPackage#getImplicitGeometryType_MimeType()
	 * @model dataType="net.opengis.citygml.MimeTypeType"
	 *        extendedMetaData="kind='element' name='mimeType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.ImplicitGeometryType#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Transformation Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Matrix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Matrix</em>' attribute.
	 * @see #setTransformationMatrix(List)
	 * @see net.opengis.citygml.CitygmlPackage#getImplicitGeometryType_TransformationMatrix()
	 * @model dataType="net.opengis.citygml.TransformationMatrix4x4Type" many="false"
	 *        extendedMetaData="kind='element' name='transformationMatrix' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getTransformationMatrix();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.ImplicitGeometryType#getTransformationMatrix <em>Transformation Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Matrix</em>' attribute.
	 * @see #getTransformationMatrix()
	 * @generated
	 */
	void setTransformationMatrix(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Library Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Object</em>' attribute.
	 * @see #setLibraryObject(String)
	 * @see net.opengis.citygml.CitygmlPackage#getImplicitGeometryType_LibraryObject()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='libraryObject' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLibraryObject();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.ImplicitGeometryType#getLibraryObject <em>Library Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Object</em>' attribute.
	 * @see #getLibraryObject()
	 * @generated
	 */
	void setLibraryObject(String value);

	/**
	 * Returns the value of the '<em><b>Relative GML Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative GML Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative GML Geometry</em>' containment reference.
	 * @see #setRelativeGMLGeometry(GeometryPropertyType)
	 * @see net.opengis.citygml.CitygmlPackage#getImplicitGeometryType_RelativeGMLGeometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relativeGMLGeometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryPropertyType getRelativeGMLGeometry();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.ImplicitGeometryType#getRelativeGMLGeometry <em>Relative GML Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative GML Geometry</em>' containment reference.
	 * @see #getRelativeGMLGeometry()
	 * @generated
	 */
	void setRelativeGMLGeometry(GeometryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Reference Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Point</em>' containment reference.
	 * @see #setReferencePoint(PointPropertyType)
	 * @see net.opengis.citygml.CitygmlPackage#getImplicitGeometryType_ReferencePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referencePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getReferencePoint();

	/**
	 * Sets the value of the '{@link net.opengis.citygml.ImplicitGeometryType#getReferencePoint <em>Reference Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Point</em>' containment reference.
	 * @see #getReferencePoint()
	 * @generated
	 */
	void setReferencePoint(PointPropertyType value);

} // ImplicitGeometryType
