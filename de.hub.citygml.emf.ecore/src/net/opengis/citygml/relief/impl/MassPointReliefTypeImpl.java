/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import net.opengis.citygml.relief.MassPointReliefType;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.gml.MultiPointPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass Point Relief Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.impl.MassPointReliefTypeImpl#getReliefPoints <em>Relief Points</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.MassPointReliefTypeImpl#getGenericApplicationPropertyOfMassPointReliefGroup <em>Generic Application Property Of Mass Point Relief Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.MassPointReliefTypeImpl#getGenericApplicationPropertyOfMassPointRelief <em>Generic Application Property Of Mass Point Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MassPointReliefTypeImpl extends AbstractReliefComponentTypeImpl implements MassPointReliefType {
	/**
	 * The cached value of the '{@link #getReliefPoints() <em>Relief Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliefPoints()
	 * @generated
	 * @ordered
	 */
	protected MultiPointPropertyType reliefPoints;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfMassPointReliefGroup() <em>Generic Application Property Of Mass Point Relief Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfMassPointReliefGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfMassPointReliefGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MassPointReliefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliefPackage.Literals.MASS_POINT_RELIEF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPointPropertyType getReliefPoints() {
		return reliefPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliefPoints(MultiPointPropertyType newReliefPoints, NotificationChain msgs) {
		MultiPointPropertyType oldReliefPoints = reliefPoints;
		reliefPoints = newReliefPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS, oldReliefPoints, newReliefPoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliefPoints(MultiPointPropertyType newReliefPoints) {
		if (newReliefPoints != reliefPoints) {
			NotificationChain msgs = null;
			if (reliefPoints != null)
				msgs = ((InternalEObject)reliefPoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS, null, msgs);
			if (newReliefPoints != null)
				msgs = ((InternalEObject)newReliefPoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS, null, msgs);
			msgs = basicSetReliefPoints(newReliefPoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS, newReliefPoints, newReliefPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfMassPointReliefGroup() {
		if (genericApplicationPropertyOfMassPointReliefGroup == null) {
			genericApplicationPropertyOfMassPointReliefGroup = new BasicFeatureMap(this, ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF_GROUP);
		}
		return genericApplicationPropertyOfMassPointReliefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfMassPointRelief() {
		return getGenericApplicationPropertyOfMassPointReliefGroup().list(ReliefPackage.Literals.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS:
				return basicSetReliefPoints(null, msgs);
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfMassPointReliefGroup()).basicRemove(otherEnd, msgs);
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF:
				return ((InternalEList<?>)getGenericApplicationPropertyOfMassPointRelief()).basicRemove(otherEnd, msgs);
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
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS:
				return getReliefPoints();
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF_GROUP:
				if (coreType) return getGenericApplicationPropertyOfMassPointReliefGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfMassPointReliefGroup()).getWrapper();
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF:
				return getGenericApplicationPropertyOfMassPointRelief();
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
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS:
				setReliefPoints((MultiPointPropertyType)newValue);
				return;
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfMassPointReliefGroup()).set(newValue);
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
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS:
				setReliefPoints((MultiPointPropertyType)null);
				return;
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF_GROUP:
				getGenericApplicationPropertyOfMassPointReliefGroup().clear();
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
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__RELIEF_POINTS:
				return reliefPoints != null;
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF_GROUP:
				return genericApplicationPropertyOfMassPointReliefGroup != null && !genericApplicationPropertyOfMassPointReliefGroup.isEmpty();
			case ReliefPackage.MASS_POINT_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF:
				return !getGenericApplicationPropertyOfMassPointRelief().isEmpty();
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
		result.append(" (genericApplicationPropertyOfMassPointReliefGroup: ");
		result.append(genericApplicationPropertyOfMassPointReliefGroup);
		result.append(')');
		return result.toString();
	}

} //MassPointReliefTypeImpl
