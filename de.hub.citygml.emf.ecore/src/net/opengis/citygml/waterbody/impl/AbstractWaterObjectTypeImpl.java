/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.impl;

import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.citygml.waterbody.AbstractWaterObjectType;
import net.opengis.citygml.waterbody.WaterbodyPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Water Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.impl.AbstractWaterObjectTypeImpl#getGenericApplicationPropertyOfWaterObjectGroup <em>Generic Application Property Of Water Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.AbstractWaterObjectTypeImpl#getGenericApplicationPropertyOfWaterObject <em>Generic Application Property Of Water Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractWaterObjectTypeImpl extends AbstractCityObjectTypeImpl implements AbstractWaterObjectType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfWaterObjectGroup() <em>Generic Application Property Of Water Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfWaterObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfWaterObjectGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractWaterObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WaterbodyPackage.Literals.ABSTRACT_WATER_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfWaterObjectGroup() {
		if (genericApplicationPropertyOfWaterObjectGroup == null) {
			genericApplicationPropertyOfWaterObjectGroup = new BasicFeatureMap(this, WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP);
		}
		return genericApplicationPropertyOfWaterObjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfWaterObject() {
		return getGenericApplicationPropertyOfWaterObjectGroup().list(WaterbodyPackage.Literals.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterObjectGroup()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterObject()).basicRemove(otherEnd, msgs);
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
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP:
				if (coreType) return getGenericApplicationPropertyOfWaterObjectGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfWaterObjectGroup()).getWrapper();
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT:
				return getGenericApplicationPropertyOfWaterObject();
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
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfWaterObjectGroup()).set(newValue);
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
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP:
				getGenericApplicationPropertyOfWaterObjectGroup().clear();
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
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT_GROUP:
				return genericApplicationPropertyOfWaterObjectGroup != null && !genericApplicationPropertyOfWaterObjectGroup.isEmpty();
			case WaterbodyPackage.ABSTRACT_WATER_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT:
				return !getGenericApplicationPropertyOfWaterObject().isEmpty();
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
		result.append(" (genericApplicationPropertyOfWaterObjectGroup: ");
		result.append(genericApplicationPropertyOfWaterObjectGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractWaterObjectTypeImpl
