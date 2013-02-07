/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.AbstractRingPropertyType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.RectangleType;
import net.opengis.gml.SurfaceInterpolationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.RectangleTypeImpl#getExteriorGroup <em>Exterior Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RectangleTypeImpl#getExterior <em>Exterior</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RectangleTypeImpl#getInterpolation <em>Interpolation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectangleTypeImpl extends AbstractSurfacePatchTypeImpl implements RectangleType {
	/**
	 * The cached value of the '{@link #getExteriorGroup() <em>Exterior Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExteriorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap exteriorGroup;

	/**
	 * The default value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected static final SurfaceInterpolationType INTERPOLATION_EDEFAULT = SurfaceInterpolationType.PLANAR;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected SurfaceInterpolationType interpolation = INTERPOLATION_EDEFAULT;

	/**
	 * This is true if the Interpolation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interpolationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getRectangleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getExteriorGroup() {
		if (exteriorGroup == null) {
			exteriorGroup = new BasicFeatureMap(this, GmlPackage.RECTANGLE_TYPE__EXTERIOR_GROUP);
		}
		return exteriorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRingPropertyType getExterior() {
		return (AbstractRingPropertyType)getExteriorGroup().get(GmlPackage.eINSTANCE.getRectangleType_Exterior(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExterior(AbstractRingPropertyType newExterior, NotificationChain msgs) {
		return ((FeatureMap.Internal)getExteriorGroup()).basicAdd(GmlPackage.eINSTANCE.getRectangleType_Exterior(), newExterior, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExterior(AbstractRingPropertyType newExterior) {
		((FeatureMap.Internal)getExteriorGroup()).set(GmlPackage.eINSTANCE.getRectangleType_Exterior(), newExterior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceInterpolationType getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolation(SurfaceInterpolationType newInterpolation) {
		SurfaceInterpolationType oldInterpolation = interpolation;
		interpolation = newInterpolation == null ? INTERPOLATION_EDEFAULT : newInterpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.RECTANGLE_TYPE__INTERPOLATION, oldInterpolation, interpolation, !oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterpolation() {
		SurfaceInterpolationType oldInterpolation = interpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolation = INTERPOLATION_EDEFAULT;
		interpolationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GmlPackage.RECTANGLE_TYPE__INTERPOLATION, oldInterpolation, INTERPOLATION_EDEFAULT, oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterpolation() {
		return interpolationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR_GROUP:
				return ((InternalEList<?>)getExteriorGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR:
				return basicSetExterior(null, msgs);
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
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR_GROUP:
				if (coreType) return getExteriorGroup();
				return ((FeatureMap.Internal)getExteriorGroup()).getWrapper();
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR:
				return getExterior();
			case GmlPackage.RECTANGLE_TYPE__INTERPOLATION:
				return getInterpolation();
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
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR_GROUP:
				((FeatureMap.Internal)getExteriorGroup()).set(newValue);
				return;
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR:
				setExterior((AbstractRingPropertyType)newValue);
				return;
			case GmlPackage.RECTANGLE_TYPE__INTERPOLATION:
				setInterpolation((SurfaceInterpolationType)newValue);
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
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR_GROUP:
				getExteriorGroup().clear();
				return;
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR:
				setExterior((AbstractRingPropertyType)null);
				return;
			case GmlPackage.RECTANGLE_TYPE__INTERPOLATION:
				unsetInterpolation();
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
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR_GROUP:
				return exteriorGroup != null && !exteriorGroup.isEmpty();
			case GmlPackage.RECTANGLE_TYPE__EXTERIOR:
				return getExterior() != null;
			case GmlPackage.RECTANGLE_TYPE__INTERPOLATION:
				return isSetInterpolation();
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
		result.append(" (exteriorGroup: ");
		result.append(exteriorGroup);
		result.append(", interpolation: ");
		if (interpolationESet) result.append(interpolation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RectangleTypeImpl
