/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractRingPropertyType;
import net.opengis.gml.AbstractRingType;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Ring Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AbstractRingPropertyTypeImpl#getRingGroup <em>Ring Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractRingPropertyTypeImpl#getRing <em>Ring</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractRingPropertyTypeImpl extends EObjectImpl implements AbstractRingPropertyType {
	/**
	 * The cached value of the '{@link #getRingGroup() <em>Ring Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ringGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRingPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getAbstractRingPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRingGroup() {
		if (ringGroup == null) {
			ringGroup = new BasicFeatureMap(this, GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING_GROUP);
		}
		return ringGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRingType getRing() {
		return (AbstractRingType)getRingGroup().get(GmlPackage.eINSTANCE.getAbstractRingPropertyType_Ring(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRing(AbstractRingType newRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getRingGroup()).basicAdd(GmlPackage.eINSTANCE.getAbstractRingPropertyType_Ring(), newRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING_GROUP:
				return ((InternalEList<?>)getRingGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING:
				return basicSetRing(null, msgs);
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
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING_GROUP:
				if (coreType) return getRingGroup();
				return ((FeatureMap.Internal)getRingGroup()).getWrapper();
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING:
				return getRing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING_GROUP:
				((FeatureMap.Internal)getRingGroup()).set(newValue);
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
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING_GROUP:
				getRingGroup().clear();
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
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING_GROUP:
				return ringGroup != null && !ringGroup.isEmpty();
			case GmlPackage.ABSTRACT_RING_PROPERTY_TYPE__RING:
				return getRing() != null;
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
		result.append(" (ringGroup: ");
		result.append(ringGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractRingPropertyTypeImpl
