/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation.impl;

import net.opengis.citygml.vegetation.AbstractVegetationObjectType;
import net.opengis.citygml.vegetation.DocumentRoot;
import net.opengis.citygml.vegetation.PlantCoverType;
import net.opengis.citygml.vegetation.SolitaryVegetationObjectType;
import net.opengis.citygml.vegetation.VegetationPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getGenericApplicationPropertyOfPlantCover <em>Generic Application Property Of Plant Cover</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getGenericApplicationPropertyOfSolitaryVegetationObject <em>Generic Application Property Of Solitary Vegetation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getGenericApplicationPropertyOfVegetationObject <em>Generic Application Property Of Vegetation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getVegetationObject <em>Vegetation Object</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getPlantCover <em>Plant Cover</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.DocumentRootImpl#getSolitaryVegetationObject <em>Solitary Vegetation Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VegetationPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, VegetationPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, VegetationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, VegetationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfPlantCover() {
		return (EObject)getMixed().get(VegetationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfPlantCover(EObject newGenericApplicationPropertyOfPlantCover, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(VegetationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER, newGenericApplicationPropertyOfPlantCover, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfSolitaryVegetationObject() {
		return (EObject)getMixed().get(VegetationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfSolitaryVegetationObject(EObject newGenericApplicationPropertyOfSolitaryVegetationObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(VegetationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT, newGenericApplicationPropertyOfSolitaryVegetationObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfVegetationObject() {
		return (EObject)getMixed().get(VegetationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfVegetationObject(EObject newGenericApplicationPropertyOfVegetationObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(VegetationPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT, newGenericApplicationPropertyOfVegetationObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVegetationObjectType getVegetationObject() {
		return (AbstractVegetationObjectType)getMixed().get(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVegetationObject(AbstractVegetationObjectType newVegetationObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT, newVegetationObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVegetationObject(AbstractVegetationObjectType newVegetationObject) {
		((FeatureMap.Internal)getMixed()).set(VegetationPackage.Literals.DOCUMENT_ROOT__VEGETATION_OBJECT, newVegetationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantCoverType getPlantCover() {
		return (PlantCoverType)getMixed().get(VegetationPackage.Literals.DOCUMENT_ROOT__PLANT_COVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlantCover(PlantCoverType newPlantCover, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(VegetationPackage.Literals.DOCUMENT_ROOT__PLANT_COVER, newPlantCover, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantCover(PlantCoverType newPlantCover) {
		((FeatureMap.Internal)getMixed()).set(VegetationPackage.Literals.DOCUMENT_ROOT__PLANT_COVER, newPlantCover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolitaryVegetationObjectType getSolitaryVegetationObject() {
		return (SolitaryVegetationObjectType)getMixed().get(VegetationPackage.Literals.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolitaryVegetationObject(SolitaryVegetationObjectType newSolitaryVegetationObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(VegetationPackage.Literals.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT, newSolitaryVegetationObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolitaryVegetationObject(SolitaryVegetationObjectType newSolitaryVegetationObject) {
		((FeatureMap.Internal)getMixed()).set(VegetationPackage.Literals.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT, newSolitaryVegetationObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VegetationPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case VegetationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case VegetationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER:
				return basicSetGenericApplicationPropertyOfPlantCover(null, msgs);
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT:
				return basicSetGenericApplicationPropertyOfSolitaryVegetationObject(null, msgs);
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT:
				return basicSetGenericApplicationPropertyOfVegetationObject(null, msgs);
			case VegetationPackage.DOCUMENT_ROOT__VEGETATION_OBJECT:
				return basicSetVegetationObject(null, msgs);
			case VegetationPackage.DOCUMENT_ROOT__PLANT_COVER:
				return basicSetPlantCover(null, msgs);
			case VegetationPackage.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT:
				return basicSetSolitaryVegetationObject(null, msgs);
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
			case VegetationPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case VegetationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case VegetationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER:
				return getGenericApplicationPropertyOfPlantCover();
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT:
				return getGenericApplicationPropertyOfSolitaryVegetationObject();
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT:
				return getGenericApplicationPropertyOfVegetationObject();
			case VegetationPackage.DOCUMENT_ROOT__VEGETATION_OBJECT:
				return getVegetationObject();
			case VegetationPackage.DOCUMENT_ROOT__PLANT_COVER:
				return getPlantCover();
			case VegetationPackage.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT:
				return getSolitaryVegetationObject();
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
			case VegetationPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case VegetationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case VegetationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case VegetationPackage.DOCUMENT_ROOT__VEGETATION_OBJECT:
				setVegetationObject((AbstractVegetationObjectType)newValue);
				return;
			case VegetationPackage.DOCUMENT_ROOT__PLANT_COVER:
				setPlantCover((PlantCoverType)newValue);
				return;
			case VegetationPackage.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT:
				setSolitaryVegetationObject((SolitaryVegetationObjectType)newValue);
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
			case VegetationPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case VegetationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case VegetationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case VegetationPackage.DOCUMENT_ROOT__VEGETATION_OBJECT:
				setVegetationObject((AbstractVegetationObjectType)null);
				return;
			case VegetationPackage.DOCUMENT_ROOT__PLANT_COVER:
				setPlantCover((PlantCoverType)null);
				return;
			case VegetationPackage.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT:
				setSolitaryVegetationObject((SolitaryVegetationObjectType)null);
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
			case VegetationPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case VegetationPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case VegetationPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER:
				return getGenericApplicationPropertyOfPlantCover() != null;
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT:
				return getGenericApplicationPropertyOfSolitaryVegetationObject() != null;
			case VegetationPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_VEGETATION_OBJECT:
				return getGenericApplicationPropertyOfVegetationObject() != null;
			case VegetationPackage.DOCUMENT_ROOT__VEGETATION_OBJECT:
				return getVegetationObject() != null;
			case VegetationPackage.DOCUMENT_ROOT__PLANT_COVER:
				return getPlantCover() != null;
			case VegetationPackage.DOCUMENT_ROOT__SOLITARY_VEGETATION_OBJECT:
				return getSolitaryVegetationObject() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
