/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.math.BigInteger;

import net.opengis.gml.CovarianceElementType;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Covariance Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.CovarianceElementTypeImpl#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CovarianceElementTypeImpl#getColumnIndex <em>Column Index</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CovarianceElementTypeImpl#getCovariance <em>Covariance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CovarianceElementTypeImpl extends EObjectImpl implements CovarianceElementType {
	/**
	 * The default value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROW_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rowIndex = ROW_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnIndex() <em>Column Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLUMN_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnIndex() <em>Column Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger columnIndex = COLUMN_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCovariance() <em>Covariance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovariance()
	 * @generated
	 * @ordered
	 */
	protected static final double COVARIANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCovariance() <em>Covariance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovariance()
	 * @generated
	 * @ordered
	 */
	protected double covariance = COVARIANCE_EDEFAULT;

	/**
	 * This is true if the Covariance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean covarianceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CovarianceElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getCovarianceElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRowIndex() {
		return rowIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowIndex(BigInteger newRowIndex) {
		BigInteger oldRowIndex = rowIndex;
		rowIndex = newRowIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.COVARIANCE_ELEMENT_TYPE__ROW_INDEX, oldRowIndex, rowIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColumnIndex() {
		return columnIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnIndex(BigInteger newColumnIndex) {
		BigInteger oldColumnIndex = columnIndex;
		columnIndex = newColumnIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.COVARIANCE_ELEMENT_TYPE__COLUMN_INDEX, oldColumnIndex, columnIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCovariance() {
		return covariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCovariance(double newCovariance) {
		double oldCovariance = covariance;
		covariance = newCovariance;
		boolean oldCovarianceESet = covarianceESet;
		covarianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.COVARIANCE_ELEMENT_TYPE__COVARIANCE, oldCovariance, covariance, !oldCovarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCovariance() {
		double oldCovariance = covariance;
		boolean oldCovarianceESet = covarianceESet;
		covariance = COVARIANCE_EDEFAULT;
		covarianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GmlPackage.COVARIANCE_ELEMENT_TYPE__COVARIANCE, oldCovariance, COVARIANCE_EDEFAULT, oldCovarianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCovariance() {
		return covarianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__ROW_INDEX:
				return getRowIndex();
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__COLUMN_INDEX:
				return getColumnIndex();
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__COVARIANCE:
				return getCovariance();
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
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__ROW_INDEX:
				setRowIndex((BigInteger)newValue);
				return;
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__COLUMN_INDEX:
				setColumnIndex((BigInteger)newValue);
				return;
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__COVARIANCE:
				setCovariance((Double)newValue);
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
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__ROW_INDEX:
				setRowIndex(ROW_INDEX_EDEFAULT);
				return;
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__COLUMN_INDEX:
				setColumnIndex(COLUMN_INDEX_EDEFAULT);
				return;
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__COVARIANCE:
				unsetCovariance();
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
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__ROW_INDEX:
				return ROW_INDEX_EDEFAULT == null ? rowIndex != null : !ROW_INDEX_EDEFAULT.equals(rowIndex);
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__COLUMN_INDEX:
				return COLUMN_INDEX_EDEFAULT == null ? columnIndex != null : !COLUMN_INDEX_EDEFAULT.equals(columnIndex);
			case GmlPackage.COVARIANCE_ELEMENT_TYPE__COVARIANCE:
				return isSetCovariance();
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
		result.append(" (rowIndex: ");
		result.append(rowIndex);
		result.append(", columnIndex: ");
		result.append(columnIndex);
		result.append(", covariance: ");
		if (covarianceESet) result.append(covariance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CovarianceElementTypeImpl
