/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation.impl;

import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.citygml.vegetation.AbstractVegetationObjectType;
import net.opengis.citygml.vegetation.VegetationPackage;

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
 * An implementation of the model object '<em><b>Abstract Vegetation Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.vegetation.impl.AbstractVegetationObjectTypeImpl#getGenericApplicationPropertyOfVegetationObjectGroup <em>Generic Application Property Of Vegetation Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.AbstractVegetationObjectTypeImpl#getGenericApplicationPropertyOfVegetationObject <em>Generic Application Property Of Vegetation Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractVegetationObjectTypeImpl extends AbstractCityObjectTypeImpl implements AbstractVegetationObjectType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfVegetationObjectGroup() <em>Generic Application Property Of Vegetation Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfVegetationObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfVegetationObjectGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractVegetationObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VegetationPackage.Literals.ABSTRACT_VEGETATION_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfVegetationObjectGroup() {
		if (genericApplicationPropertyOfVegetationObjectGroup == null) {
			genericApplicationPropertyOfVegetationObjectGroup = new BasicFeatureMap(this, VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP);
		}
		return genericApplicationPropertyOfVegetationObjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfVegetationObject() {
		return getGenericApplicationPropertyOfVegetationObjectGroup().list(VegetationPackage.Literals.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfVegetationObjectGroup()).basicRemove(otherEnd, msgs);
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT:
				return ((InternalEList<?>)getGenericApplicationPropertyOfVegetationObject()).basicRemove(otherEnd, msgs);
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
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP:
				if (coreType) return getGenericApplicationPropertyOfVegetationObjectGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfVegetationObjectGroup()).getWrapper();
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT:
				return getGenericApplicationPropertyOfVegetationObject();
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
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfVegetationObjectGroup()).set(newValue);
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
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP:
				getGenericApplicationPropertyOfVegetationObjectGroup().clear();
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
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT_GROUP:
				return genericApplicationPropertyOfVegetationObjectGroup != null && !genericApplicationPropertyOfVegetationObjectGroup.isEmpty();
			case VegetationPackage.ABSTRACT_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT:
				return !getGenericApplicationPropertyOfVegetationObject().isEmpty();
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
		result.append(" (genericApplicationPropertyOfVegetationObjectGroup: ");
		result.append(genericApplicationPropertyOfVegetationObjectGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractVegetationObjectTypeImpl
