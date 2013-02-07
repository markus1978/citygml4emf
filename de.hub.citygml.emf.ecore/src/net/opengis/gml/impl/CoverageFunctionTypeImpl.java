/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.CoverageFunctionType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.GridFunctionType;
import net.opengis.gml.StringOrRefType;

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
 * An implementation of the model object '<em><b>Coverage Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.CoverageFunctionTypeImpl#getMappingRule <em>Mapping Rule</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CoverageFunctionTypeImpl#getGridFunctionGroup <em>Grid Function Group</em>}</li>
 *   <li>{@link net.opengis.gml.impl.CoverageFunctionTypeImpl#getGridFunction <em>Grid Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageFunctionTypeImpl extends EObjectImpl implements CoverageFunctionType {
	/**
	 * The cached value of the '{@link #getMappingRule() <em>Mapping Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingRule()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType mappingRule;

	/**
	 * The cached value of the '{@link #getGridFunctionGroup() <em>Grid Function Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridFunctionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap gridFunctionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageFunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getCoverageFunctionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOrRefType getMappingRule() {
		return mappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingRule(StringOrRefType newMappingRule, NotificationChain msgs) {
		StringOrRefType oldMappingRule = mappingRule;
		mappingRule = newMappingRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE, oldMappingRule, newMappingRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingRule(StringOrRefType newMappingRule) {
		if (newMappingRule != mappingRule) {
			NotificationChain msgs = null;
			if (mappingRule != null)
				msgs = ((InternalEObject)mappingRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE, null, msgs);
			if (newMappingRule != null)
				msgs = ((InternalEObject)newMappingRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE, null, msgs);
			msgs = basicSetMappingRule(newMappingRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE, newMappingRule, newMappingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGridFunctionGroup() {
		if (gridFunctionGroup == null) {
			gridFunctionGroup = new BasicFeatureMap(this, GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION_GROUP);
		}
		return gridFunctionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridFunctionType getGridFunction() {
		return (GridFunctionType)getGridFunctionGroup().get(GmlPackage.eINSTANCE.getCoverageFunctionType_GridFunction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGridFunction(GridFunctionType newGridFunction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGridFunctionGroup()).basicAdd(GmlPackage.eINSTANCE.getCoverageFunctionType_GridFunction(), newGridFunction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridFunction(GridFunctionType newGridFunction) {
		((FeatureMap.Internal)getGridFunctionGroup()).set(GmlPackage.eINSTANCE.getCoverageFunctionType_GridFunction(), newGridFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				return basicSetMappingRule(null, msgs);
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION_GROUP:
				return ((InternalEList<?>)getGridFunctionGroup()).basicRemove(otherEnd, msgs);
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				return basicSetGridFunction(null, msgs);
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
			case GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				return getMappingRule();
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION_GROUP:
				if (coreType) return getGridFunctionGroup();
				return ((FeatureMap.Internal)getGridFunctionGroup()).getWrapper();
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				return getGridFunction();
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
			case GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				setMappingRule((StringOrRefType)newValue);
				return;
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION_GROUP:
				((FeatureMap.Internal)getGridFunctionGroup()).set(newValue);
				return;
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				setGridFunction((GridFunctionType)newValue);
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
			case GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				setMappingRule((StringOrRefType)null);
				return;
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION_GROUP:
				getGridFunctionGroup().clear();
				return;
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				setGridFunction((GridFunctionType)null);
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
			case GmlPackage.COVERAGE_FUNCTION_TYPE__MAPPING_RULE:
				return mappingRule != null;
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION_GROUP:
				return gridFunctionGroup != null && !gridFunctionGroup.isEmpty();
			case GmlPackage.COVERAGE_FUNCTION_TYPE__GRID_FUNCTION:
				return getGridFunction() != null;
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
		result.append(" (gridFunctionGroup: ");
		result.append(gridFunctionGroup);
		result.append(')');
		return result.toString();
	}

} //CoverageFunctionTypeImpl
