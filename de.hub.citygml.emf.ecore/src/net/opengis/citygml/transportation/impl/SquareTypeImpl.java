/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.transportation.impl;

import net.opengis.citygml.transportation.SquareType;
import net.opengis.citygml.transportation.TransportationPackage;

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
 * An implementation of the model object '<em><b>Square Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.transportation.impl.SquareTypeImpl#getGenericApplicationPropertyOfSquareGroup <em>Generic Application Property Of Square Group</em>}</li>
 *   <li>{@link net.opengis.citygml.transportation.impl.SquareTypeImpl#getGenericApplicationPropertyOfSquare <em>Generic Application Property Of Square</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SquareTypeImpl extends TransportationComplexTypeImpl implements SquareType {
	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfSquareGroup() <em>Generic Application Property Of Square Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfSquareGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfSquareGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportationPackage.Literals.SQUARE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfSquareGroup() {
		if (genericApplicationPropertyOfSquareGroup == null) {
			genericApplicationPropertyOfSquareGroup = new BasicFeatureMap(this, TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP);
		}
		return genericApplicationPropertyOfSquareGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfSquare() {
		return getGenericApplicationPropertyOfSquareGroup().list(TransportationPackage.Literals.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfSquareGroup()).basicRemove(otherEnd, msgs);
			case TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfSquare()).basicRemove(otherEnd, msgs);
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
			case TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfSquareGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfSquareGroup()).getWrapper();
			case TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE:
				return getGenericApplicationPropertyOfSquare();
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
			case TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfSquareGroup()).set(newValue);
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
			case TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP:
				getGenericApplicationPropertyOfSquareGroup().clear();
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
			case TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE_GROUP:
				return genericApplicationPropertyOfSquareGroup != null && !genericApplicationPropertyOfSquareGroup.isEmpty();
			case TransportationPackage.SQUARE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SQUARE:
				return !getGenericApplicationPropertyOfSquare().isEmpty();
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
		result.append(" (genericApplicationPropertyOfSquareGroup: ");
		result.append(genericApplicationPropertyOfSquareGroup);
		result.append(')');
		return result.toString();
	}

} //SquareTypeImpl
