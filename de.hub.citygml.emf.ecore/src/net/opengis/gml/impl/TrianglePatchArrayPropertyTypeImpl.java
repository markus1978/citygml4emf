/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.TrianglePatchArrayPropertyType;
import net.opengis.gml.TriangleType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triangle Patch Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.TrianglePatchArrayPropertyTypeImpl#getTriangle <em>Triangle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrianglePatchArrayPropertyTypeImpl extends SurfacePatchArrayPropertyTypeImpl implements TrianglePatchArrayPropertyType {
	/**
	 * The cached value of the '{@link #getTriangle() <em>Triangle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriangle()
	 * @generated
	 * @ordered
	 */
	protected EList<TriangleType> triangle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrianglePatchArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getTrianglePatchArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TriangleType> getTriangle() {
		if (triangle == null) {
			triangle = new EObjectContainmentEList<TriangleType>(TriangleType.class, this, GmlPackage.TRIANGLE_PATCH_ARRAY_PROPERTY_TYPE__TRIANGLE);
		}
		return triangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.TRIANGLE_PATCH_ARRAY_PROPERTY_TYPE__TRIANGLE:
				return ((InternalEList<?>)getTriangle()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.TRIANGLE_PATCH_ARRAY_PROPERTY_TYPE__TRIANGLE:
				return getTriangle();
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
			case GmlPackage.TRIANGLE_PATCH_ARRAY_PROPERTY_TYPE__TRIANGLE:
				getTriangle().clear();
				getTriangle().addAll((Collection<? extends TriangleType>)newValue);
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
			case GmlPackage.TRIANGLE_PATCH_ARRAY_PROPERTY_TYPE__TRIANGLE:
				getTriangle().clear();
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
			case GmlPackage.TRIANGLE_PATCH_ARRAY_PROPERTY_TYPE__TRIANGLE:
				return triangle != null && !triangle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrianglePatchArrayPropertyTypeImpl
