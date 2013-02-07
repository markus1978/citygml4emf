/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.CovarianceElementType;
import net.opengis.gml.CovarianceMatrixType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.UnitOfMeasureType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Covariance Matrix Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.CovarianceMatrixTypeImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CovarianceMatrixTypeImpl#getIncludesElement <em>Includes Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CovarianceMatrixTypeImpl extends AbstractPositionalAccuracyTypeImpl implements CovarianceMatrixType {
	/**
	 * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<UnitOfMeasureType> unitOfMeasure;

	/**
	 * The cached value of the '{@link #getIncludesElement() <em>Includes Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludesElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CovarianceElementType> includesElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CovarianceMatrixTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getCovarianceMatrixType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnitOfMeasureType> getUnitOfMeasure() {
		if (unitOfMeasure == null) {
			unitOfMeasure = new EObjectContainmentEList<UnitOfMeasureType>(UnitOfMeasureType.class, this, GmlPackage.COVARIANCE_MATRIX_TYPE__UNIT_OF_MEASURE);
		}
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CovarianceElementType> getIncludesElement() {
		if (includesElement == null) {
			includesElement = new EObjectContainmentEList<CovarianceElementType>(CovarianceElementType.class, this, GmlPackage.COVARIANCE_MATRIX_TYPE__INCLUDES_ELEMENT);
		}
		return includesElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.COVARIANCE_MATRIX_TYPE__UNIT_OF_MEASURE:
				return ((InternalEList<?>)getUnitOfMeasure()).basicRemove(otherEnd, msgs);
			case GmlPackage.COVARIANCE_MATRIX_TYPE__INCLUDES_ELEMENT:
				return ((InternalEList<?>)getIncludesElement()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.COVARIANCE_MATRIX_TYPE__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case GmlPackage.COVARIANCE_MATRIX_TYPE__INCLUDES_ELEMENT:
				return getIncludesElement();
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
			case GmlPackage.COVARIANCE_MATRIX_TYPE__UNIT_OF_MEASURE:
				getUnitOfMeasure().clear();
				getUnitOfMeasure().addAll((Collection<? extends UnitOfMeasureType>)newValue);
				return;
			case GmlPackage.COVARIANCE_MATRIX_TYPE__INCLUDES_ELEMENT:
				getIncludesElement().clear();
				getIncludesElement().addAll((Collection<? extends CovarianceElementType>)newValue);
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
			case GmlPackage.COVARIANCE_MATRIX_TYPE__UNIT_OF_MEASURE:
				getUnitOfMeasure().clear();
				return;
			case GmlPackage.COVARIANCE_MATRIX_TYPE__INCLUDES_ELEMENT:
				getIncludesElement().clear();
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
			case GmlPackage.COVARIANCE_MATRIX_TYPE__UNIT_OF_MEASURE:
				return unitOfMeasure != null && !unitOfMeasure.isEmpty();
			case GmlPackage.COVARIANCE_MATRIX_TYPE__INCLUDES_ELEMENT:
				return includesElement != null && !includesElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CovarianceMatrixTypeImpl
