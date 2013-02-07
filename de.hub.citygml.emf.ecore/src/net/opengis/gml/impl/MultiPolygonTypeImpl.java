/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.GmlPackage;
import net.opengis.gml.MultiPolygonType;
import net.opengis.gml.PolygonPropertyType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiPolygonTypeImpl#getPolygonMember <em>Polygon Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPolygonTypeImpl extends AbstractGeometricAggregateTypeImpl implements MultiPolygonType {
	/**
	 * The cached value of the '{@link #getPolygonMember() <em>Polygon Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonMember()
	 * @generated
	 * @ordered
	 */
	protected EList<PolygonPropertyType> polygonMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPolygonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getMultiPolygonType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolygonPropertyType> getPolygonMember() {
		if (polygonMember == null) {
			polygonMember = new EObjectContainmentEList<PolygonPropertyType>(PolygonPropertyType.class, this, GmlPackage.MULTI_POLYGON_TYPE__POLYGON_MEMBER);
		}
		return polygonMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.MULTI_POLYGON_TYPE__POLYGON_MEMBER:
				return ((InternalEList<?>)getPolygonMember()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.MULTI_POLYGON_TYPE__POLYGON_MEMBER:
				return getPolygonMember();
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
			case GmlPackage.MULTI_POLYGON_TYPE__POLYGON_MEMBER:
				getPolygonMember().clear();
				getPolygonMember().addAll((Collection<? extends PolygonPropertyType>)newValue);
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
			case GmlPackage.MULTI_POLYGON_TYPE__POLYGON_MEMBER:
				getPolygonMember().clear();
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
			case GmlPackage.MULTI_POLYGON_TYPE__POLYGON_MEMBER:
				return polygonMember != null && !polygonMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiPolygonTypeImpl
