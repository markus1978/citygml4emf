/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.BoundingShapeType;
import net.opengis.gml.EnvelopeType;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounding Shape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.BoundingShapeTypeImpl#getEnvelopeGroup <em>Envelope Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.BoundingShapeTypeImpl#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link net.opengis.gml.impl.BoundingShapeTypeImpl#getNull <em>Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundingShapeTypeImpl extends EObjectImpl implements BoundingShapeType {
	/**
	 * The cached value of the '{@link #getEnvelopeGroup() <em>Envelope Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvelopeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap envelopeGroup;

	/**
	 * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected static final Object NULL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNull() <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNull()
	 * @generated
	 * @ordered
	 */
	protected Object null_ = NULL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundingShapeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getBoundingShapeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEnvelopeGroup() {
		if (envelopeGroup == null) {
			envelopeGroup = new BasicFeatureMap(this, GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP);
		}
		return envelopeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvelopeType getEnvelope() {
		return (EnvelopeType)getEnvelopeGroup().get(GmlPackage.eINSTANCE.getBoundingShapeType_Envelope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvelope(EnvelopeType newEnvelope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getEnvelopeGroup()).basicAdd(GmlPackage.eINSTANCE.getBoundingShapeType_Envelope(), newEnvelope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvelope(EnvelopeType newEnvelope) {
		((FeatureMap.Internal)getEnvelopeGroup()).set(GmlPackage.eINSTANCE.getBoundingShapeType_Envelope(), newEnvelope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNull() {
		return null_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNull(Object newNull) {
		Object oldNull = null_;
		null_ = newNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.BOUNDING_SHAPE_TYPE__NULL, oldNull, null_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				return ((InternalEList<?>)getEnvelopeGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				return basicSetEnvelope(null, msgs);
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
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				if (coreType) return getEnvelopeGroup();
				return ((FeatureMap.Internal)getEnvelopeGroup()).getWrapper();
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				return getEnvelope();
			case GmlPackage.BOUNDING_SHAPE_TYPE__NULL:
				return getNull();
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
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				((FeatureMap.Internal)getEnvelopeGroup()).set(newValue);
				return;
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				setEnvelope((EnvelopeType)newValue);
				return;
			case GmlPackage.BOUNDING_SHAPE_TYPE__NULL:
				setNull(newValue);
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
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				getEnvelopeGroup().clear();
				return;
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				setEnvelope((EnvelopeType)null);
				return;
			case GmlPackage.BOUNDING_SHAPE_TYPE__NULL:
				setNull(NULL_EDEFAULT);
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
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE_GROUP:
				return envelopeGroup != null && !envelopeGroup.isEmpty();
			case GmlPackage.BOUNDING_SHAPE_TYPE__ENVELOPE:
				return getEnvelope() != null;
			case GmlPackage.BOUNDING_SHAPE_TYPE__NULL:
				return NULL_EDEFAULT == null ? null_ != null : !NULL_EDEFAULT.equals(null_);
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
		result.append(" (envelopeGroup: ");
		result.append(envelopeGroup);
		result.append(", null: ");
		result.append(null_);
		result.append(')');
		return result.toString();
	}

} //BoundingShapeTypeImpl
