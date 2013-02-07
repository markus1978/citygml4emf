/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.WindowType;

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
 * An implementation of the model object '<em><b>Window Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.WindowTypeImpl#getGenericApplicationPropertyOfWindowGroup <em>Generic Application Property Of Window Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.WindowTypeImpl#getGenericApplicationPropertyOfWindow <em>Generic Application Property Of Window</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowTypeImpl extends AbstractOpeningTypeImpl implements WindowType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfWindowGroup() <em>Generic Application Property Of Window Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfWindowGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfWindowGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.WINDOW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfWindowGroup() {
		if (genericApplicationPropertyOfWindowGroup == null) {
			genericApplicationPropertyOfWindowGroup = new BasicFeatureMap(this, BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP);
		}
		return genericApplicationPropertyOfWindowGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfWindow() {
		return getGenericApplicationPropertyOfWindowGroup().list(BuildingPackage.Literals.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWindowGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWindow()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP:
				if (coreType) return getGenericApplicationPropertyOfWindowGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfWindowGroup()).getWrapper();
			case BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW:
				return getGenericApplicationPropertyOfWindow();
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
			case BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfWindowGroup()).set(newValue);
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
			case BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP:
				getGenericApplicationPropertyOfWindowGroup().clear();
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
			case BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW_GROUP:
				return genericApplicationPropertyOfWindowGroup != null && !genericApplicationPropertyOfWindowGroup.isEmpty();
			case BuildingPackage.WINDOW_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WINDOW:
				return !getGenericApplicationPropertyOfWindow().isEmpty();
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
		result.append(" (genericApplicationPropertyOfWindowGroup: ");
		result.append(genericApplicationPropertyOfWindowGroup);
		result.append(')');
		return result.toString();
	}

} //WindowTypeImpl
