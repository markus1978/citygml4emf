/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.math.BigInteger;
import java.util.Collection;

import net.opengis.gml.AffinePlacementType;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.VectorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affine Placement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.AffinePlacementTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AffinePlacementTypeImpl#getRefDirection <em>Ref Direction</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AffinePlacementTypeImpl#getInDimension <em>In Dimension</em>}</li>
 *   <li>{@link net.opengis.gml.impl.AffinePlacementTypeImpl#getOutDimension <em>Out Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AffinePlacementTypeImpl extends EObjectImpl implements AffinePlacementType {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected DirectPositionType location;

	/**
	 * The cached value of the '{@link #getRefDirection() <em>Ref Direction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDirection()
	 * @generated
	 * @ordered
	 */
	protected EList<VectorType> refDirection;

	/**
	 * The default value of the '{@link #getInDimension() <em>In Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDimension()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger IN_DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInDimension() <em>In Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInDimension()
	 * @generated
	 * @ordered
	 */
	protected BigInteger inDimension = IN_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutDimension() <em>Out Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDimension()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger OUT_DIMENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutDimension() <em>Out Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDimension()
	 * @generated
	 * @ordered
	 */
	protected BigInteger outDimension = OUT_DIMENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffinePlacementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getAffinePlacementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectPositionType getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(DirectPositionType newLocation, NotificationChain msgs) {
		DirectPositionType oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(DirectPositionType newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VectorType> getRefDirection() {
		if (refDirection == null) {
			refDirection = new EObjectContainmentEList<VectorType>(VectorType.class, this, GmlPackage.AFFINE_PLACEMENT_TYPE__REF_DIRECTION);
		}
		return refDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getInDimension() {
		return inDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInDimension(BigInteger newInDimension) {
		BigInteger oldInDimension = inDimension;
		inDimension = newInDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.AFFINE_PLACEMENT_TYPE__IN_DIMENSION, oldInDimension, inDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getOutDimension() {
		return outDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutDimension(BigInteger newOutDimension) {
		BigInteger oldOutDimension = outDimension;
		outDimension = newOutDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.AFFINE_PLACEMENT_TYPE__OUT_DIMENSION, oldOutDimension, outDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
			case GmlPackage.AFFINE_PLACEMENT_TYPE__REF_DIRECTION:
				return ((InternalEList<?>)getRefDirection()).basicRemove(otherEnd, msgs);
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
			case GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION:
				return getLocation();
			case GmlPackage.AFFINE_PLACEMENT_TYPE__REF_DIRECTION:
				return getRefDirection();
			case GmlPackage.AFFINE_PLACEMENT_TYPE__IN_DIMENSION:
				return getInDimension();
			case GmlPackage.AFFINE_PLACEMENT_TYPE__OUT_DIMENSION:
				return getOutDimension();
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
			case GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION:
				setLocation((DirectPositionType)newValue);
				return;
			case GmlPackage.AFFINE_PLACEMENT_TYPE__REF_DIRECTION:
				getRefDirection().clear();
				getRefDirection().addAll((Collection<? extends VectorType>)newValue);
				return;
			case GmlPackage.AFFINE_PLACEMENT_TYPE__IN_DIMENSION:
				setInDimension((BigInteger)newValue);
				return;
			case GmlPackage.AFFINE_PLACEMENT_TYPE__OUT_DIMENSION:
				setOutDimension((BigInteger)newValue);
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
			case GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION:
				setLocation((DirectPositionType)null);
				return;
			case GmlPackage.AFFINE_PLACEMENT_TYPE__REF_DIRECTION:
				getRefDirection().clear();
				return;
			case GmlPackage.AFFINE_PLACEMENT_TYPE__IN_DIMENSION:
				setInDimension(IN_DIMENSION_EDEFAULT);
				return;
			case GmlPackage.AFFINE_PLACEMENT_TYPE__OUT_DIMENSION:
				setOutDimension(OUT_DIMENSION_EDEFAULT);
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
			case GmlPackage.AFFINE_PLACEMENT_TYPE__LOCATION:
				return location != null;
			case GmlPackage.AFFINE_PLACEMENT_TYPE__REF_DIRECTION:
				return refDirection != null && !refDirection.isEmpty();
			case GmlPackage.AFFINE_PLACEMENT_TYPE__IN_DIMENSION:
				return IN_DIMENSION_EDEFAULT == null ? inDimension != null : !IN_DIMENSION_EDEFAULT.equals(inDimension);
			case GmlPackage.AFFINE_PLACEMENT_TYPE__OUT_DIMENSION:
				return OUT_DIMENSION_EDEFAULT == null ? outDimension != null : !OUT_DIMENSION_EDEFAULT.equals(outDimension);
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
		result.append(" (inDimension: ");
		result.append(inDimension);
		result.append(", outDimension: ");
		result.append(outDimension);
		result.append(')');
		return result.toString();
	}

} //AffinePlacementTypeImpl
