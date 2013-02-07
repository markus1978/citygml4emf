/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import java.util.List;

import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.ImplicitGeometryType;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.PointPropertyType;
import net.opengis.gml.impl.AbstractGMLTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implicit Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.ImplicitGeometryTypeImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.ImplicitGeometryTypeImpl#getTransformationMatrix <em>Transformation Matrix</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.ImplicitGeometryTypeImpl#getLibraryObject <em>Library Object</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.ImplicitGeometryTypeImpl#getRelativeGMLGeometry <em>Relative GML Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.ImplicitGeometryTypeImpl#getReferencePoint <em>Reference Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplicitGeometryTypeImpl extends AbstractGMLTypeImpl implements ImplicitGeometryType {
	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformationMatrix() <em>Transformation Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationMatrix()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> TRANSFORMATION_MATRIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationMatrix() <em>Transformation Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationMatrix()
	 * @generated
	 * @ordered
	 */
	protected List<Double> transformationMatrix = TRANSFORMATION_MATRIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibraryObject() <em>Library Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryObject()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryObject() <em>Library Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryObject()
	 * @generated
	 * @ordered
	 */
	protected String libraryObject = LIBRARY_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelativeGMLGeometry() <em>Relative GML Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeGMLGeometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType relativeGMLGeometry;

	/**
	 * The cached value of the '{@link #getReferencePoint() <em>Reference Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePoint()
	 * @generated
	 * @ordered
	 */
	protected PointPropertyType referencePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.IMPLICIT_GEOMETRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> getTransformationMatrix() {
		return transformationMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationMatrix(List<Double> newTransformationMatrix) {
		List<Double> oldTransformationMatrix = transformationMatrix;
		transformationMatrix = newTransformationMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__TRANSFORMATION_MATRIX, oldTransformationMatrix, transformationMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibraryObject() {
		return libraryObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryObject(String newLibraryObject) {
		String oldLibraryObject = libraryObject;
		libraryObject = newLibraryObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__LIBRARY_OBJECT, oldLibraryObject, libraryObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getRelativeGMLGeometry() {
		return relativeGMLGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativeGMLGeometry(GeometryPropertyType newRelativeGMLGeometry, NotificationChain msgs) {
		GeometryPropertyType oldRelativeGMLGeometry = relativeGMLGeometry;
		relativeGMLGeometry = newRelativeGMLGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY, oldRelativeGMLGeometry, newRelativeGMLGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeGMLGeometry(GeometryPropertyType newRelativeGMLGeometry) {
		if (newRelativeGMLGeometry != relativeGMLGeometry) {
			NotificationChain msgs = null;
			if (relativeGMLGeometry != null)
				msgs = ((InternalEObject)relativeGMLGeometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY, null, msgs);
			if (newRelativeGMLGeometry != null)
				msgs = ((InternalEObject)newRelativeGMLGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY, null, msgs);
			msgs = basicSetRelativeGMLGeometry(newRelativeGMLGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY, newRelativeGMLGeometry, newRelativeGMLGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointPropertyType getReferencePoint() {
		return referencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencePoint(PointPropertyType newReferencePoint, NotificationChain msgs) {
		PointPropertyType oldReferencePoint = referencePoint;
		referencePoint = newReferencePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT, oldReferencePoint, newReferencePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePoint(PointPropertyType newReferencePoint) {
		if (newReferencePoint != referencePoint) {
			NotificationChain msgs = null;
			if (referencePoint != null)
				msgs = ((InternalEObject)referencePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT, null, msgs);
			if (newReferencePoint != null)
				msgs = ((InternalEObject)newReferencePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT, null, msgs);
			msgs = basicSetReferencePoint(newReferencePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT, newReferencePoint, newReferencePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY:
				return basicSetRelativeGMLGeometry(null, msgs);
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT:
				return basicSetReferencePoint(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__MIME_TYPE:
				return getMimeType();
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__TRANSFORMATION_MATRIX:
				return getTransformationMatrix();
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__LIBRARY_OBJECT:
				return getLibraryObject();
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY:
				return getRelativeGMLGeometry();
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT:
				return getReferencePoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__TRANSFORMATION_MATRIX:
				setTransformationMatrix((List<Double>)newValue);
				return;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__LIBRARY_OBJECT:
				setLibraryObject((String)newValue);
				return;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY:
				setRelativeGMLGeometry((GeometryPropertyType)newValue);
				return;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT:
				setReferencePoint((PointPropertyType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__TRANSFORMATION_MATRIX:
				setTransformationMatrix(TRANSFORMATION_MATRIX_EDEFAULT);
				return;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__LIBRARY_OBJECT:
				setLibraryObject(LIBRARY_OBJECT_EDEFAULT);
				return;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY:
				setRelativeGMLGeometry((GeometryPropertyType)null);
				return;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT:
				setReferencePoint((PointPropertyType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__TRANSFORMATION_MATRIX:
				return TRANSFORMATION_MATRIX_EDEFAULT == null ? transformationMatrix != null : !TRANSFORMATION_MATRIX_EDEFAULT.equals(transformationMatrix);
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__LIBRARY_OBJECT:
				return LIBRARY_OBJECT_EDEFAULT == null ? libraryObject != null : !LIBRARY_OBJECT_EDEFAULT.equals(libraryObject);
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__RELATIVE_GML_GEOMETRY:
				return relativeGMLGeometry != null;
			case CitygmlPackage.IMPLICIT_GEOMETRY_TYPE__REFERENCE_POINT:
				return referencePoint != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mimeType: ");
		result.append(mimeType);
		result.append(", transformationMatrix: ");
		result.append(transformationMatrix);
		result.append(", libraryObject: ");
		result.append(libraryObject);
		result.append(')');
		return result.toString();
	}

} //ImplicitGeometryTypeImpl
