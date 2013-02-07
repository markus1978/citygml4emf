/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.appearance.impl;

import java.util.Collection;
import java.util.List;

import net.opengis.citygml.appearance.AppearancePackage;
import net.opengis.citygml.appearance.GeoreferencedTextureType;
import net.opengis.gml.PointPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Georeferenced Texture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl#isPreferWorldFile <em>Prefer World File</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl#getReferencePoint <em>Reference Point</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl#getGenericApplicationPropertyOfGeoreferencedTextureGroup <em>Generic Application Property Of Georeferenced Texture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.appearance.impl.GeoreferencedTextureTypeImpl#getGenericApplicationPropertyOfGeoreferencedTexture <em>Generic Application Property Of Georeferenced Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeoreferencedTextureTypeImpl extends AbstractTextureTypeImpl implements GeoreferencedTextureType {
	/**
	 * The default value of the '{@link #isPreferWorldFile() <em>Prefer World File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferWorldFile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFER_WORLD_FILE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPreferWorldFile() <em>Prefer World File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreferWorldFile()
	 * @generated
	 * @ordered
	 */
	protected boolean preferWorldFile = PREFER_WORLD_FILE_EDEFAULT;

	/**
	 * This is true if the Prefer World File attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preferWorldFileESet;

	/**
	 * The cached value of the '{@link #getReferencePoint() <em>Reference Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePoint()
	 * @generated
	 * @ordered
	 */
	protected PointPropertyType referencePoint;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final List<Double> ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected List<Double> orientation = ORIENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<String> target;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfGeoreferencedTextureGroup() <em>Generic Application Property Of Georeferenced Texture Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfGeoreferencedTextureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfGeoreferencedTextureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoreferencedTextureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.GEOREFERENCED_TEXTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreferWorldFile() {
		return preferWorldFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferWorldFile(boolean newPreferWorldFile) {
		boolean oldPreferWorldFile = preferWorldFile;
		preferWorldFile = newPreferWorldFile;
		boolean oldPreferWorldFileESet = preferWorldFileESet;
		preferWorldFileESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE, oldPreferWorldFile, preferWorldFile, !oldPreferWorldFileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreferWorldFile() {
		boolean oldPreferWorldFile = preferWorldFile;
		boolean oldPreferWorldFileESet = preferWorldFileESet;
		preferWorldFile = PREFER_WORLD_FILE_EDEFAULT;
		preferWorldFileESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE, oldPreferWorldFile, PREFER_WORLD_FILE_EDEFAULT, oldPreferWorldFileESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreferWorldFile() {
		return preferWorldFileESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointPropertyType getReferencePoint() {
		return referencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencePoint(PointPropertyType newReferencePoint, NotificationChain msgs) {
		PointPropertyType oldReferencePoint = referencePoint;
		referencePoint = newReferencePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT, oldReferencePoint, newReferencePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePoint(PointPropertyType newReferencePoint) {
		if (newReferencePoint != referencePoint) {
			NotificationChain msgs = null;
			if (referencePoint != null)
				msgs = ((InternalEObject)referencePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT, null, msgs);
			if (newReferencePoint != null)
				msgs = ((InternalEObject)newReferencePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT, null, msgs);
			msgs = basicSetReferencePoint(newReferencePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT, newReferencePoint, newReferencePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(List<Double> newOrientation) {
		List<Double> oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTarget() {
		if (target == null) {
			target = new EDataTypeEList<String>(String.class, this, AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfGeoreferencedTextureGroup() {
		if (genericApplicationPropertyOfGeoreferencedTextureGroup == null) {
			genericApplicationPropertyOfGeoreferencedTextureGroup = new BasicFeatureMap(this, AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP);
		}
		return genericApplicationPropertyOfGeoreferencedTextureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfGeoreferencedTexture() {
		return getGenericApplicationPropertyOfGeoreferencedTextureGroup().list(AppearancePackage.Literals.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT:
				return basicSetReferencePoint(null, msgs);
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfGeoreferencedTextureGroup()).basicRemove(otherEnd, msgs);
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfGeoreferencedTexture()).basicRemove(otherEnd, msgs);
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
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE:
				return isPreferWorldFile();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT:
				return getReferencePoint();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__ORIENTATION:
				return getOrientation();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__TARGET:
				return getTarget();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfGeoreferencedTextureGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfGeoreferencedTextureGroup()).getWrapper();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE:
				return getGenericApplicationPropertyOfGeoreferencedTexture();
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
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE:
				setPreferWorldFile((Boolean)newValue);
				return;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT:
				setReferencePoint((PointPropertyType)newValue);
				return;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__ORIENTATION:
				setOrientation((List<Double>)newValue);
				return;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends String>)newValue);
				return;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfGeoreferencedTextureGroup()).set(newValue);
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
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE:
				unsetPreferWorldFile();
				return;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT:
				setReferencePoint((PointPropertyType)null);
				return;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__TARGET:
				getTarget().clear();
				return;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP:
				getGenericApplicationPropertyOfGeoreferencedTextureGroup().clear();
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
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__PREFER_WORLD_FILE:
				return isSetPreferWorldFile();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__REFERENCE_POINT:
				return referencePoint != null;
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__TARGET:
				return target != null && !target.isEmpty();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE_GROUP:
				return genericApplicationPropertyOfGeoreferencedTextureGroup != null && !genericApplicationPropertyOfGeoreferencedTextureGroup.isEmpty();
			case AppearancePackage.GEOREFERENCED_TEXTURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_GEOREFERENCED_TEXTURE:
				return !getGenericApplicationPropertyOfGeoreferencedTexture().isEmpty();
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
		result.append(" (preferWorldFile: ");
		if (preferWorldFileESet) result.append(preferWorldFile); else result.append("<unset>");
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", target: ");
		result.append(target);
		result.append(", genericApplicationPropertyOfGeoreferencedTextureGroup: ");
		result.append(genericApplicationPropertyOfGeoreferencedTextureGroup);
		result.append(')');
		return result.toString();
	}

} //GeoreferencedTextureTypeImpl
