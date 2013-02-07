/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.AbstractFeatureCollectionType;
import net.opengis.gml.FeatureArrayPropertyType;
import net.opengis.gml.FeaturePropertyType;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AbstractFeatureCollectionTypeImpl#getFeatureMemberGroup <em>Feature Member Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractFeatureCollectionTypeImpl#getFeatureMember <em>Feature Member</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AbstractFeatureCollectionTypeImpl#getFeatureMembers <em>Feature Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractFeatureCollectionTypeImpl extends AbstractFeatureTypeImpl implements AbstractFeatureCollectionType {
	/**
	 * The cached value of the '{@link #getFeatureMemberGroup() <em>Feature Member Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMemberGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap featureMemberGroup;

	/**
	 * The cached value of the '{@link #getFeatureMembers() <em>Feature Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMembers()
	 * @generated
	 * @ordered
	 */
	protected FeatureArrayPropertyType featureMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFeatureCollectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getAbstractFeatureCollectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFeatureMemberGroup() {
		if (featureMemberGroup == null) {
			featureMemberGroup = new BasicFeatureMap(this, GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER_GROUP);
		}
		return featureMemberGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeaturePropertyType> getFeatureMember() {
		return getFeatureMemberGroup().list(GmlPackage.eINSTANCE.getAbstractFeatureCollectionType_FeatureMember());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureArrayPropertyType getFeatureMembers() {
		return featureMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureMembers(FeatureArrayPropertyType newFeatureMembers, NotificationChain msgs) {
		FeatureArrayPropertyType oldFeatureMembers = featureMembers;
		featureMembers = newFeatureMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS, oldFeatureMembers, newFeatureMembers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureMembers(FeatureArrayPropertyType newFeatureMembers) {
		if (newFeatureMembers != featureMembers) {
			NotificationChain msgs = null;
			if (featureMembers != null)
				msgs = ((InternalEObject)featureMembers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS, null, msgs);
			if (newFeatureMembers != null)
				msgs = ((InternalEObject)newFeatureMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS, null, msgs);
			msgs = basicSetFeatureMembers(newFeatureMembers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS, newFeatureMembers, newFeatureMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER_GROUP:
				return ((InternalEList<?>)getFeatureMemberGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER:
				return ((InternalEList<?>)getFeatureMember()).basicRemove(otherEnd, msgs);
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS:
				return basicSetFeatureMembers(null, msgs);
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
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER_GROUP:
				if (coreType) return getFeatureMemberGroup();
				return ((FeatureMap.Internal)getFeatureMemberGroup()).getWrapper();
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER:
				return getFeatureMember();
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS:
				return getFeatureMembers();
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
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER_GROUP:
				((FeatureMap.Internal)getFeatureMemberGroup()).set(newValue);
				return;
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER:
				getFeatureMember().clear();
				getFeatureMember().addAll((Collection<? extends FeaturePropertyType>)newValue);
				return;
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS:
				setFeatureMembers((FeatureArrayPropertyType)newValue);
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
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER_GROUP:
				getFeatureMemberGroup().clear();
				return;
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER:
				getFeatureMember().clear();
				return;
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS:
				setFeatureMembers((FeatureArrayPropertyType)null);
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
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER_GROUP:
				return featureMemberGroup != null && !featureMemberGroup.isEmpty();
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER:
				return !getFeatureMember().isEmpty();
			case GmlPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS:
				return featureMembers != null;
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
		result.append(" (featureMemberGroup: ");
		result.append(featureMemberGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractFeatureCollectionTypeImpl
