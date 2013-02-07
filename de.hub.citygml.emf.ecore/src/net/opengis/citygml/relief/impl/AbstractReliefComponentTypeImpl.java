/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import java.math.BigInteger;

import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.citygml.relief.AbstractReliefComponentType;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.gml.PolygonPropertyType;

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
 * An implementation of the model object '<em><b>Abstract Relief Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.impl.AbstractReliefComponentTypeImpl#getLod <em>Lod</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.AbstractReliefComponentTypeImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.AbstractReliefComponentTypeImpl#getGenericApplicationPropertyOfReliefComponentGroup <em>Generic Application Property Of Relief Component Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.AbstractReliefComponentTypeImpl#getGenericApplicationPropertyOfReliefComponent <em>Generic Application Property Of Relief Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractReliefComponentTypeImpl extends AbstractCityObjectTypeImpl implements AbstractReliefComponentType {
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
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected PolygonPropertyType extent;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfReliefComponentGroup() <em>Generic Application Property Of Relief Component Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfReliefComponentGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfReliefComponentGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractReliefComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliefPackage.Literals.ABSTRACT_RELIEF_COMPONENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__LOD, oldLod, lod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPropertyType getExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtent(PolygonPropertyType newExtent, NotificationChain msgs) {
		PolygonPropertyType oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT, oldExtent, newExtent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(PolygonPropertyType newExtent) {
		if (newExtent != extent) {
			NotificationChain msgs = null;
			if (extent != null)
				msgs = ((InternalEObject)extent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT, null, msgs);
			if (newExtent != null)
				msgs = ((InternalEObject)newExtent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT, null, msgs);
			msgs = basicSetExtent(newExtent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT, newExtent, newExtent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfReliefComponentGroup() {
		if (genericApplicationPropertyOfReliefComponentGroup == null) {
			genericApplicationPropertyOfReliefComponentGroup = new BasicFeatureMap(this, ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP);
		}
		return genericApplicationPropertyOfReliefComponentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfReliefComponent() {
		return getGenericApplicationPropertyOfReliefComponentGroup().list(ReliefPackage.Literals.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT:
				return basicSetExtent(null, msgs);
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfReliefComponentGroup()).basicRemove(otherEnd, msgs);
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT:
				return ((InternalEList<?>)getGenericApplicationPropertyOfReliefComponent()).basicRemove(otherEnd, msgs);
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
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__LOD:
				return getLod();
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT:
				return getExtent();
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP:
				if (coreType) return getGenericApplicationPropertyOfReliefComponentGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfReliefComponentGroup()).getWrapper();
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT:
				return getGenericApplicationPropertyOfReliefComponent();
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
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__LOD:
				setLod((BigInteger)newValue);
				return;
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT:
				setExtent((PolygonPropertyType)newValue);
				return;
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfReliefComponentGroup()).set(newValue);
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
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__LOD:
				setLod(LOD_EDEFAULT);
				return;
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT:
				setExtent((PolygonPropertyType)null);
				return;
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP:
				getGenericApplicationPropertyOfReliefComponentGroup().clear();
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
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__LOD:
				return LOD_EDEFAULT == null ? lod != null : !LOD_EDEFAULT.equals(lod);
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__EXTENT:
				return extent != null;
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT_GROUP:
				return genericApplicationPropertyOfReliefComponentGroup != null && !genericApplicationPropertyOfReliefComponentGroup.isEmpty();
			case ReliefPackage.ABSTRACT_RELIEF_COMPONENT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT:
				return !getGenericApplicationPropertyOfReliefComponent().isEmpty();
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
		result.append(", genericApplicationPropertyOfReliefComponentGroup: ");
		result.append(genericApplicationPropertyOfReliefComponentGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractReliefComponentTypeImpl
