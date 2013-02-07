/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.Collection;
import java.util.List;

import net.opengis.gml.CodeOrNullListType;
import net.opengis.gml.DataBlockType;
import net.opengis.gml.FileType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.MeasureOrNullListType;
import net.opengis.gml.RangeSetType;
import net.opengis.gml.ValueArrayType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.RangeSetTypeImpl#getValueArray <em>Value Array</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RangeSetTypeImpl#getScalarValueList <em>Scalar Value List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RangeSetTypeImpl#getBooleanList <em>Boolean List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RangeSetTypeImpl#getCategoryList <em>Category List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RangeSetTypeImpl#getQuantityList <em>Quantity List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RangeSetTypeImpl#getCountList <em>Count List</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RangeSetTypeImpl#getDataBlock <em>Data Block</em>}</li>
 *   <li>{@link net.opengis.gml.impl.RangeSetTypeImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeSetTypeImpl extends EObjectImpl implements RangeSetType {
	/**
	 * The cached value of the '{@link #getValueArray() <em>Value Array</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueArray()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueArrayType> valueArray;

	/**
	 * The cached value of the '{@link #getScalarValueList() <em>Scalar Value List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarValueList()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap scalarValueList;

	/**
	 * The cached value of the '{@link #getDataBlock() <em>Data Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBlock()
	 * @generated
	 * @ordered
	 */
	protected DataBlockType dataBlock;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected FileType file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getRangeSetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueArrayType> getValueArray() {
		if (valueArray == null) {
			valueArray = new EObjectContainmentEList<ValueArrayType>(ValueArrayType.class, this, GmlPackage.RANGE_SET_TYPE__VALUE_ARRAY);
		}
		return valueArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getScalarValueList() {
		if (scalarValueList == null) {
			scalarValueList = new BasicFeatureMap(this, GmlPackage.RANGE_SET_TYPE__SCALAR_VALUE_LIST);
		}
		return scalarValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<List> getBooleanList() {
		return getScalarValueList().list(GmlPackage.eINSTANCE.getRangeSetType_BooleanList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeOrNullListType> getCategoryList() {
		return getScalarValueList().list(GmlPackage.eINSTANCE.getRangeSetType_CategoryList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureOrNullListType> getQuantityList() {
		return getScalarValueList().list(GmlPackage.eINSTANCE.getRangeSetType_QuantityList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<List> getCountList() {
		return getScalarValueList().list(GmlPackage.eINSTANCE.getRangeSetType_CountList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBlockType getDataBlock() {
		return dataBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataBlock(DataBlockType newDataBlock, NotificationChain msgs) {
		DataBlockType oldDataBlock = dataBlock;
		dataBlock = newDataBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.RANGE_SET_TYPE__DATA_BLOCK, oldDataBlock, newDataBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBlock(DataBlockType newDataBlock) {
		if (newDataBlock != dataBlock) {
			NotificationChain msgs = null;
			if (dataBlock != null)
				msgs = ((InternalEObject)dataBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.RANGE_SET_TYPE__DATA_BLOCK, null, msgs);
			if (newDataBlock != null)
				msgs = ((InternalEObject)newDataBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.RANGE_SET_TYPE__DATA_BLOCK, null, msgs);
			msgs = basicSetDataBlock(newDataBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.RANGE_SET_TYPE__DATA_BLOCK, newDataBlock, newDataBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(FileType newFile, NotificationChain msgs) {
		FileType oldFile = file;
		file = newFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.RANGE_SET_TYPE__FILE, oldFile, newFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(FileType newFile) {
		if (newFile != file) {
			NotificationChain msgs = null;
			if (file != null)
				msgs = ((InternalEObject)file).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.RANGE_SET_TYPE__FILE, null, msgs);
			if (newFile != null)
				msgs = ((InternalEObject)newFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.RANGE_SET_TYPE__FILE, null, msgs);
			msgs = basicSetFile(newFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.RANGE_SET_TYPE__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				return ((InternalEList<?>)getValueArray()).basicRemove(otherEnd, msgs);
			case GmlPackage.RANGE_SET_TYPE__SCALAR_VALUE_LIST:
				return ((InternalEList<?>)getScalarValueList()).basicRemove(otherEnd, msgs);
			case GmlPackage.RANGE_SET_TYPE__CATEGORY_LIST:
				return ((InternalEList<?>)getCategoryList()).basicRemove(otherEnd, msgs);
			case GmlPackage.RANGE_SET_TYPE__QUANTITY_LIST:
				return ((InternalEList<?>)getQuantityList()).basicRemove(otherEnd, msgs);
			case GmlPackage.RANGE_SET_TYPE__DATA_BLOCK:
				return basicSetDataBlock(null, msgs);
			case GmlPackage.RANGE_SET_TYPE__FILE:
				return basicSetFile(null, msgs);
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
			case GmlPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				return getValueArray();
			case GmlPackage.RANGE_SET_TYPE__SCALAR_VALUE_LIST:
				if (coreType) return getScalarValueList();
				return ((FeatureMap.Internal)getScalarValueList()).getWrapper();
			case GmlPackage.RANGE_SET_TYPE__BOOLEAN_LIST:
				return getBooleanList();
			case GmlPackage.RANGE_SET_TYPE__CATEGORY_LIST:
				return getCategoryList();
			case GmlPackage.RANGE_SET_TYPE__QUANTITY_LIST:
				return getQuantityList();
			case GmlPackage.RANGE_SET_TYPE__COUNT_LIST:
				return getCountList();
			case GmlPackage.RANGE_SET_TYPE__DATA_BLOCK:
				return getDataBlock();
			case GmlPackage.RANGE_SET_TYPE__FILE:
				return getFile();
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
			case GmlPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				getValueArray().clear();
				getValueArray().addAll((Collection<? extends ValueArrayType>)newValue);
				return;
			case GmlPackage.RANGE_SET_TYPE__SCALAR_VALUE_LIST:
				((FeatureMap.Internal)getScalarValueList()).set(newValue);
				return;
			case GmlPackage.RANGE_SET_TYPE__BOOLEAN_LIST:
				getBooleanList().clear();
				getBooleanList().addAll((Collection<? extends List>)newValue);
				return;
			case GmlPackage.RANGE_SET_TYPE__CATEGORY_LIST:
				getCategoryList().clear();
				getCategoryList().addAll((Collection<? extends CodeOrNullListType>)newValue);
				return;
			case GmlPackage.RANGE_SET_TYPE__QUANTITY_LIST:
				getQuantityList().clear();
				getQuantityList().addAll((Collection<? extends MeasureOrNullListType>)newValue);
				return;
			case GmlPackage.RANGE_SET_TYPE__COUNT_LIST:
				getCountList().clear();
				getCountList().addAll((Collection<? extends List>)newValue);
				return;
			case GmlPackage.RANGE_SET_TYPE__DATA_BLOCK:
				setDataBlock((DataBlockType)newValue);
				return;
			case GmlPackage.RANGE_SET_TYPE__FILE:
				setFile((FileType)newValue);
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
			case GmlPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				getValueArray().clear();
				return;
			case GmlPackage.RANGE_SET_TYPE__SCALAR_VALUE_LIST:
				getScalarValueList().clear();
				return;
			case GmlPackage.RANGE_SET_TYPE__BOOLEAN_LIST:
				getBooleanList().clear();
				return;
			case GmlPackage.RANGE_SET_TYPE__CATEGORY_LIST:
				getCategoryList().clear();
				return;
			case GmlPackage.RANGE_SET_TYPE__QUANTITY_LIST:
				getQuantityList().clear();
				return;
			case GmlPackage.RANGE_SET_TYPE__COUNT_LIST:
				getCountList().clear();
				return;
			case GmlPackage.RANGE_SET_TYPE__DATA_BLOCK:
				setDataBlock((DataBlockType)null);
				return;
			case GmlPackage.RANGE_SET_TYPE__FILE:
				setFile((FileType)null);
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
			case GmlPackage.RANGE_SET_TYPE__VALUE_ARRAY:
				return valueArray != null && !valueArray.isEmpty();
			case GmlPackage.RANGE_SET_TYPE__SCALAR_VALUE_LIST:
				return scalarValueList != null && !scalarValueList.isEmpty();
			case GmlPackage.RANGE_SET_TYPE__BOOLEAN_LIST:
				return !getBooleanList().isEmpty();
			case GmlPackage.RANGE_SET_TYPE__CATEGORY_LIST:
				return !getCategoryList().isEmpty();
			case GmlPackage.RANGE_SET_TYPE__QUANTITY_LIST:
				return !getQuantityList().isEmpty();
			case GmlPackage.RANGE_SET_TYPE__COUNT_LIST:
				return !getCountList().isEmpty();
			case GmlPackage.RANGE_SET_TYPE__DATA_BLOCK:
				return dataBlock != null;
			case GmlPackage.RANGE_SET_TYPE__FILE:
				return file != null;
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
		result.append(" (scalarValueList: ");
		result.append(scalarValueList);
		result.append(')');
		return result.toString();
	}

} //RangeSetTypeImpl
