/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import net.opengis.citygml.relief.GridPropertyType;
import net.opengis.citygml.relief.RasterReliefType;
import net.opengis.citygml.relief.ReliefPackage;

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
 * An implementation of the model object '<em><b>Raster Relief Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.relief.impl.RasterReliefTypeImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.RasterReliefTypeImpl#getGenericApplicationPropertyOfRasterReliefGroup <em>Generic Application Property Of Raster Relief Group</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.RasterReliefTypeImpl#getGenericApplicationPropertyOfRasterRelief <em>Generic Application Property Of Raster Relief</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RasterReliefTypeImpl extends AbstractReliefComponentTypeImpl implements RasterReliefType {
	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected GridPropertyType grid;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfRasterReliefGroup() <em>Generic Application Property Of Raster Relief Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfRasterReliefGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfRasterReliefGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterReliefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReliefPackage.Literals.RASTER_RELIEF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridPropertyType getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(GridPropertyType newGrid, NotificationChain msgs) {
		GridPropertyType oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReliefPackage.RASTER_RELIEF_TYPE__GRID, oldGrid, newGrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(GridPropertyType newGrid) {
		if (newGrid != grid) {
			NotificationChain msgs = null;
			if (grid != null)
				msgs = ((InternalEObject)grid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.RASTER_RELIEF_TYPE__GRID, null, msgs);
			if (newGrid != null)
				msgs = ((InternalEObject)newGrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReliefPackage.RASTER_RELIEF_TYPE__GRID, null, msgs);
			msgs = basicSetGrid(newGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReliefPackage.RASTER_RELIEF_TYPE__GRID, newGrid, newGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfRasterReliefGroup() {
		if (genericApplicationPropertyOfRasterReliefGroup == null) {
			genericApplicationPropertyOfRasterReliefGroup = new BasicFeatureMap(this, ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF_GROUP);
		}
		return genericApplicationPropertyOfRasterReliefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfRasterRelief() {
		return getGenericApplicationPropertyOfRasterReliefGroup().list(ReliefPackage.Literals.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliefPackage.RASTER_RELIEF_TYPE__GRID:
				return basicSetGrid(null, msgs);
			case ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRasterReliefGroup()).basicRemove(otherEnd, msgs);
			case ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF:
				return ((InternalEList<?>)getGenericApplicationPropertyOfRasterRelief()).basicRemove(otherEnd, msgs);
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
			case ReliefPackage.RASTER_RELIEF_TYPE__GRID:
				return getGrid();
			case ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF_GROUP:
				if (coreType) return getGenericApplicationPropertyOfRasterReliefGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfRasterReliefGroup()).getWrapper();
			case ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF:
				return getGenericApplicationPropertyOfRasterRelief();
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
			case ReliefPackage.RASTER_RELIEF_TYPE__GRID:
				setGrid((GridPropertyType)newValue);
				return;
			case ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfRasterReliefGroup()).set(newValue);
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
			case ReliefPackage.RASTER_RELIEF_TYPE__GRID:
				setGrid((GridPropertyType)null);
				return;
			case ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF_GROUP:
				getGenericApplicationPropertyOfRasterReliefGroup().clear();
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
			case ReliefPackage.RASTER_RELIEF_TYPE__GRID:
				return grid != null;
			case ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF_GROUP:
				return genericApplicationPropertyOfRasterReliefGroup != null && !genericApplicationPropertyOfRasterReliefGroup.isEmpty();
			case ReliefPackage.RASTER_RELIEF_TYPE__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF:
				return !getGenericApplicationPropertyOfRasterRelief().isEmpty();
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
		result.append(" (genericApplicationPropertyOfRasterReliefGroup: ");
		result.append(genericApplicationPropertyOfRasterReliefGroup);
		result.append(')');
		return result.toString();
	}

} //RasterReliefTypeImpl
