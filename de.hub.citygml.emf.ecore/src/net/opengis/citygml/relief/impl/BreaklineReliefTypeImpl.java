/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import net.opengis.citygml.relief.BreaklineReliefType;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.gml.MultiCurvePropertyType;

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
 * An implementation of the model object '<em><b>Breakline Relief Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.impl.BreaklineReliefTypeImpl#getRidgeOrValleyLines <em>Ridge Or Valley Lines</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.BreaklineReliefTypeImpl#getBreaklines <em>Breaklines</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.BreaklineReliefTypeImpl#getGenericApplicationPropertyOfBreaklineReliefGroup <em>Generic Application Property Of Breakline Relief Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.BreaklineReliefTypeImpl#getGenericApplicationPropertyOfBreaklineRelief <em>Generic Application Property Of Breakline Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreaklineReliefTypeImpl extends AbstractReliefComponentTypeImpl implements BreaklineReliefType {
	/**
	 * The cached value of the '{@link #getRidgeOrValleyLines() <em>Ridge Or Valley Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRidgeOrValleyLines()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType ridgeOrValleyLines;

	/**
	 * The cached value of the '{@link #getBreaklines() <em>Breaklines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreaklines()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType breaklines;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfBreaklineReliefGroup() <em>Generic Application Property Of Breakline Relief Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfBreaklineReliefGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfBreaklineReliefGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreaklineReliefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliefPackage.Literals.BREAKLINE_RELIEF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getRidgeOrValleyLines() {
		return ridgeOrValleyLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRidgeOrValleyLines(MultiCurvePropertyType newRidgeOrValleyLines, NotificationChain msgs) {
		MultiCurvePropertyType oldRidgeOrValleyLines = ridgeOrValleyLines;
		ridgeOrValleyLines = newRidgeOrValleyLines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES, oldRidgeOrValleyLines, newRidgeOrValleyLines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRidgeOrValleyLines(MultiCurvePropertyType newRidgeOrValleyLines) {
		if (newRidgeOrValleyLines != ridgeOrValleyLines) {
			NotificationChain msgs = null;
			if (ridgeOrValleyLines != null)
				msgs = ((InternalEObject)ridgeOrValleyLines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES, null, msgs);
			if (newRidgeOrValleyLines != null)
				msgs = ((InternalEObject)newRidgeOrValleyLines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES, null, msgs);
			msgs = basicSetRidgeOrValleyLines(newRidgeOrValleyLines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES, newRidgeOrValleyLines, newRidgeOrValleyLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getBreaklines() {
		return breaklines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBreaklines(MultiCurvePropertyType newBreaklines, NotificationChain msgs) {
		MultiCurvePropertyType oldBreaklines = breaklines;
		breaklines = newBreaklines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES, oldBreaklines, newBreaklines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreaklines(MultiCurvePropertyType newBreaklines) {
		if (newBreaklines != breaklines) {
			NotificationChain msgs = null;
			if (breaklines != null)
				msgs = ((InternalEObject)breaklines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES, null, msgs);
			if (newBreaklines != null)
				msgs = ((InternalEObject)newBreaklines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES, null, msgs);
			msgs = basicSetBreaklines(newBreaklines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES, newBreaklines, newBreaklines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfBreaklineReliefGroup() {
		if (genericApplicationPropertyOfBreaklineReliefGroup == null) {
			genericApplicationPropertyOfBreaklineReliefGroup = new BasicFeatureMap(this, ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF_GROUP);
		}
		return genericApplicationPropertyOfBreaklineReliefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfBreaklineRelief() {
		return getGenericApplicationPropertyOfBreaklineReliefGroup().list(ReliefPackage.Literals.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES:
				return basicSetRidgeOrValleyLines(null, msgs);
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES:
				return basicSetBreaklines(null, msgs);
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBreaklineReliefGroup()).basicRemove(otherEnd, msgs);
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF:
				return ((InternalEList<?>)getGenericApplicationPropertyOfBreaklineRelief()).basicRemove(otherEnd, msgs);
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
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES:
				return getRidgeOrValleyLines();
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES:
				return getBreaklines();
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF_GROUP:
				if (coreType) return getGenericApplicationPropertyOfBreaklineReliefGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfBreaklineReliefGroup()).getWrapper();
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF:
				return getGenericApplicationPropertyOfBreaklineRelief();
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
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES:
				setRidgeOrValleyLines((MultiCurvePropertyType)newValue);
				return;
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES:
				setBreaklines((MultiCurvePropertyType)newValue);
				return;
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfBreaklineReliefGroup()).set(newValue);
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
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES:
				setRidgeOrValleyLines((MultiCurvePropertyType)null);
				return;
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES:
				setBreaklines((MultiCurvePropertyType)null);
				return;
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF_GROUP:
				getGenericApplicationPropertyOfBreaklineReliefGroup().clear();
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
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__RIDGE_OR_VALLEY_LINES:
				return ridgeOrValleyLines != null;
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__BREAKLINES:
				return breaklines != null;
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF_GROUP:
				return genericApplicationPropertyOfBreaklineReliefGroup != null && !genericApplicationPropertyOfBreaklineReliefGroup.isEmpty();
			case ReliefPackage.BREAKLINE_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF:
				return !getGenericApplicationPropertyOfBreaklineRelief().isEmpty();
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
		result.append(" (genericApplicationPropertyOfBreaklineReliefGroup: ");
		result.append(genericApplicationPropertyOfBreaklineReliefGroup);
		result.append(')');
		return result.toString();
	}

} //BreaklineReliefTypeImpl
