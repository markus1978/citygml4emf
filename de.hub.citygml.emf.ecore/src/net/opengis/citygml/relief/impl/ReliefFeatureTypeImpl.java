/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import java.math.BigInteger;
import java.util.Collection;

import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.citygml.relief.ReliefComponentPropertyType;
import net.opengis.citygml.relief.ReliefFeatureType;
import net.opengis.citygml.relief.ReliefPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.impl.ReliefFeatureTypeImpl#getLod <em>Lod</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.ReliefFeatureTypeImpl#getReliefComponent <em>Relief Component</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.ReliefFeatureTypeImpl#getGenericApplicationPropertyOfReliefFeatureGroup <em>Generic Application Property Of Relief Feature Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.ReliefFeatureTypeImpl#getGenericApplicationPropertyOfReliefFeature <em>Generic Application Property Of Relief Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReliefFeatureTypeImpl extends AbstractCityObjectTypeImpl implements ReliefFeatureType {
	/**
	 * The default value of the '{@link #getLod() <em>Lod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLod() <em>Lod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lod = LOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReliefComponent() <em>Relief Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliefComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ReliefComponentPropertyType> reliefComponent;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfReliefFeatureGroup() <em>Generic Application Property Of Relief Feature Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfReliefFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfReliefFeatureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReliefFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliefPackage.Literals.RELIEF_FEATURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLod() {
		return lod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod(BigInteger newLod) {
		BigInteger oldLod = lod;
		lod = newLod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.RELIEF_FEATURE_TYPE__LOD, oldLod, lod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReliefComponentPropertyType> getReliefComponent() {
		if (reliefComponent == null) {
			reliefComponent = new EObjectContainmentEList<ReliefComponentPropertyType>(ReliefComponentPropertyType.class, this, ReliefPackage.RELIEF_FEATURE_TYPE__RELIEF_COMPONENT);
		}
		return reliefComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfReliefFeatureGroup() {
		if (genericApplicationPropertyOfReliefFeatureGroup == null) {
			genericApplicationPropertyOfReliefFeatureGroup = new BasicFeatureMap(this, ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE_GROUP);
		}
		return genericApplicationPropertyOfReliefFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfReliefFeature() {
		return getGenericApplicationPropertyOfReliefFeatureGroup().list(ReliefPackage.Literals.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliefPackage.RELIEF_FEATURE_TYPE__RELIEF_COMPONENT:
				return ((InternalEList<?>)getReliefComponent()).basicRemove(otherEnd, msgs);
			case ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfReliefFeatureGroup()).basicRemove(otherEnd, msgs);
			case ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfReliefFeature()).basicRemove(otherEnd, msgs);
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
			case ReliefPackage.RELIEF_FEATURE_TYPE__LOD:
				return getLod();
			case ReliefPackage.RELIEF_FEATURE_TYPE__RELIEF_COMPONENT:
				return getReliefComponent();
			case ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfReliefFeatureGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfReliefFeatureGroup()).getWrapper();
			case ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE:
				return getGenericApplicationPropertyOfReliefFeature();
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
			case ReliefPackage.RELIEF_FEATURE_TYPE__LOD:
				setLod((BigInteger)newValue);
				return;
			case ReliefPackage.RELIEF_FEATURE_TYPE__RELIEF_COMPONENT:
				getReliefComponent().clear();
				getReliefComponent().addAll((Collection<? extends ReliefComponentPropertyType>)newValue);
				return;
			case ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfReliefFeatureGroup()).set(newValue);
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
			case ReliefPackage.RELIEF_FEATURE_TYPE__LOD:
				setLod(LOD_EDEFAULT);
				return;
			case ReliefPackage.RELIEF_FEATURE_TYPE__RELIEF_COMPONENT:
				getReliefComponent().clear();
				return;
			case ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE_GROUP:
				getGenericApplicationPropertyOfReliefFeatureGroup().clear();
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
			case ReliefPackage.RELIEF_FEATURE_TYPE__LOD:
				return LOD_EDEFAULT == null ? lod != null : !LOD_EDEFAULT.equals(lod);
			case ReliefPackage.RELIEF_FEATURE_TYPE__RELIEF_COMPONENT:
				return reliefComponent != null && !reliefComponent.isEmpty();
			case ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE_GROUP:
				return genericApplicationPropertyOfReliefFeatureGroup != null && !genericApplicationPropertyOfReliefFeatureGroup.isEmpty();
			case ReliefPackage.RELIEF_FEATURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE:
				return !getGenericApplicationPropertyOfReliefFeature().isEmpty();
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
		result.append(" (lod: ");
		result.append(lod);
		result.append(", genericApplicationPropertyOfReliefFeatureGroup: ");
		result.append(genericApplicationPropertyOfReliefFeatureGroup);
		result.append(')');
		return result.toString();
	}

} //ReliefFeatureTypeImpl
