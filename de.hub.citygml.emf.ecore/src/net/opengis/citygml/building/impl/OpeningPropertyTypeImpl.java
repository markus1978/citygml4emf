/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import net.opengis.citygml.building.AbstractOpeningType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.OpeningPropertyType;
import net.opengis.gml.impl.AssociationTypeImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opening Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.OpeningPropertyTypeImpl#getOpeningGroup <em>Opening Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.OpeningPropertyTypeImpl#getOpening <em>Opening</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpeningPropertyTypeImpl extends AssociationTypeImpl implements OpeningPropertyType {
	/**
	 * The cached value of the '{@link #getOpeningGroup() <em>Opening Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap openingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpeningPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.OPENING_PROPERTY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOpeningGroup() {
		if (openingGroup == null) {
			openingGroup = new BasicFeatureMap(this, BuildingPackage.OPENING_PROPERTY_TYPE__OPENING_GROUP);
		}
		return openingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOpeningType getOpening() {
		return (AbstractOpeningType)getOpeningGroup().get(BuildingPackage.Literals.OPENING_PROPERTY_TYPE__OPENING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpening(AbstractOpeningType newOpening, NotificationChain msgs) {
		return ((FeatureMap.Internal)getOpeningGroup()).basicAdd(BuildingPackage.Literals.OPENING_PROPERTY_TYPE__OPENING, newOpening, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.OPENING_PROPERTY_TYPE__OPENING_GROUP:
				return ((InternalEList<?>)getOpeningGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.OPENING_PROPERTY_TYPE__OPENING:
				return basicSetOpening(null, msgs);
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
			case BuildingPackage.OPENING_PROPERTY_TYPE__OPENING_GROUP:
				if (coreType) return getOpeningGroup();
				return ((FeatureMap.Internal)getOpeningGroup()).getWrapper();
			case BuildingPackage.OPENING_PROPERTY_TYPE__OPENING:
				return getOpening();
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
			case BuildingPackage.OPENING_PROPERTY_TYPE__OPENING_GROUP:
				((FeatureMap.Internal)getOpeningGroup()).set(newValue);
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
			case BuildingPackage.OPENING_PROPERTY_TYPE__OPENING_GROUP:
				getOpeningGroup().clear();
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
			case BuildingPackage.OPENING_PROPERTY_TYPE__OPENING_GROUP:
				return openingGroup != null && !openingGroup.isEmpty();
			case BuildingPackage.OPENING_PROPERTY_TYPE__OPENING:
				return getOpening() != null;
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
		result.append(" (openingGroup: ");
		result.append(openingGroup);
		result.append(')');
		return result.toString();
	}

} //OpeningPropertyTypeImpl
