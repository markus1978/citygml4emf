/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractTimeSliceType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.HistoryPropertyType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.HistoryPropertyTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.HistoryPropertyTypeImpl#getTimeSliceGroup <em>Time Slice Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.HistoryPropertyTypeImpl#getTimeSlice <em>Time Slice</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryPropertyTypeImpl extends EObjectImpl implements HistoryPropertyType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getHistoryPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GmlPackage.HISTORY_PROPERTY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTimeSliceGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GmlPackage.eINSTANCE.getHistoryPropertyType_TimeSliceGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTimeSliceType> getTimeSlice() {
		return getTimeSliceGroup().list(GmlPackage.eINSTANCE.getHistoryPropertyType_TimeSlice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.HISTORY_PROPERTY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.HISTORY_PROPERTY_TYPE__TIME_SLICE_GROUP:
				return ((InternalEList<?>)getTimeSliceGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.HISTORY_PROPERTY_TYPE__TIME_SLICE:
				return ((InternalEList<?>)getTimeSlice()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.HISTORY_PROPERTY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GmlPackage.HISTORY_PROPERTY_TYPE__TIME_SLICE_GROUP:
				if (coreType) return getTimeSliceGroup();
				return ((FeatureMap.Internal)getTimeSliceGroup()).getWrapper();
			case GmlPackage.HISTORY_PROPERTY_TYPE__TIME_SLICE:
				return getTimeSlice();
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
			case GmlPackage.HISTORY_PROPERTY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GmlPackage.HISTORY_PROPERTY_TYPE__TIME_SLICE_GROUP:
				((FeatureMap.Internal)getTimeSliceGroup()).set(newValue);
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
			case GmlPackage.HISTORY_PROPERTY_TYPE__GROUP:
				getGroup().clear();
				return;
			case GmlPackage.HISTORY_PROPERTY_TYPE__TIME_SLICE_GROUP:
				getTimeSliceGroup().clear();
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
			case GmlPackage.HISTORY_PROPERTY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GmlPackage.HISTORY_PROPERTY_TYPE__TIME_SLICE_GROUP:
				return !getTimeSliceGroup().isEmpty();
			case GmlPackage.HISTORY_PROPERTY_TYPE__TIME_SLICE:
				return !getTimeSlice().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //HistoryPropertyTypeImpl
