/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.relief.impl;

import net.opengis.citygml.relief.AbstractReliefComponentType;
import net.opengis.citygml.relief.BreaklineReliefType;
import net.opengis.citygml.relief.DocumentRoot;
import net.opengis.citygml.relief.MassPointReliefType;
import net.opengis.citygml.relief.RasterReliefType;
import net.opengis.citygml.relief.ReliefFeatureType;
import net.opengis.citygml.relief.ReliefPackage;
import net.opengis.citygml.relief.TINReliefType;
import net.opengis.gml.LengthType;

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
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getGenericApplicationPropertyOfBreaklineRelief <em>Generic Application Property Of Breakline Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getGenericApplicationPropertyOfMassPointRelief <em>Generic Application Property Of Mass Point Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getGenericApplicationPropertyOfRasterRelief <em>Generic Application Property Of Raster Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getGenericApplicationPropertyOfReliefComponent <em>Generic Application Property Of Relief Component</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getGenericApplicationPropertyOfReliefFeature <em>Generic Application Property Of Relief Feature</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getGenericApplicationPropertyOfTinRelief <em>Generic Application Property Of Tin Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getReliefComponent <em>Relief Component</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getBreaklineRelief <em>Breakline Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getMassPointRelief <em>Mass Point Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getRasterRelief <em>Raster Relief</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getReliefFeature <em>Relief Feature</em>}</li>
 *   <li>{@link net.opengis.citygml.relief.impl.DocumentRootImpl#getTINRelief <em>TIN Relief</em>}</li>
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
		return ReliefPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ReliefPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ReliefPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ReliefPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfBreaklineRelief() {
		return (EObject)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfBreaklineRelief(EObject newGenericApplicationPropertyOfBreaklineRelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF, newGenericApplicationPropertyOfBreaklineRelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfMassPointRelief() {
		return (EObject)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfMassPointRelief(EObject newGenericApplicationPropertyOfMassPointRelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF, newGenericApplicationPropertyOfMassPointRelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfRasterRelief() {
		return (EObject)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfRasterRelief(EObject newGenericApplicationPropertyOfRasterRelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF, newGenericApplicationPropertyOfRasterRelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfReliefComponent() {
		return (EObject)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfReliefComponent(EObject newGenericApplicationPropertyOfReliefComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT, newGenericApplicationPropertyOfReliefComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfReliefFeature() {
		return (EObject)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfReliefFeature(EObject newGenericApplicationPropertyOfReliefFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE, newGenericApplicationPropertyOfReliefFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfTinRelief() {
		return (EObject)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfTinRelief(EObject newGenericApplicationPropertyOfTinRelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF, newGenericApplicationPropertyOfTinRelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractReliefComponentType getReliefComponent() {
		return (AbstractReliefComponentType)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliefComponent(AbstractReliefComponentType newReliefComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_COMPONENT, newReliefComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreaklineReliefType getBreaklineRelief() {
		return (BreaklineReliefType)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__BREAKLINE_RELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBreaklineRelief(BreaklineReliefType newBreaklineRelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__BREAKLINE_RELIEF, newBreaklineRelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreaklineRelief(BreaklineReliefType newBreaklineRelief) {
		((FeatureMap.Internal)getMixed()).set(ReliefPackage.Literals.DOCUMENT_ROOT__BREAKLINE_RELIEF, newBreaklineRelief);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthType getElevation() {
		return (LengthType)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElevation(LengthType newElevation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION, newElevation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevation(LengthType newElevation) {
		((FeatureMap.Internal)getMixed()).set(ReliefPackage.Literals.DOCUMENT_ROOT__ELEVATION, newElevation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassPointReliefType getMassPointRelief() {
		return (MassPointReliefType)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__MASS_POINT_RELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassPointRelief(MassPointReliefType newMassPointRelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__MASS_POINT_RELIEF, newMassPointRelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassPointRelief(MassPointReliefType newMassPointRelief) {
		((FeatureMap.Internal)getMixed()).set(ReliefPackage.Literals.DOCUMENT_ROOT__MASS_POINT_RELIEF, newMassPointRelief);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterReliefType getRasterRelief() {
		return (RasterReliefType)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__RASTER_RELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRasterRelief(RasterReliefType newRasterRelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__RASTER_RELIEF, newRasterRelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRasterRelief(RasterReliefType newRasterRelief) {
		((FeatureMap.Internal)getMixed()).set(ReliefPackage.Literals.DOCUMENT_ROOT__RASTER_RELIEF, newRasterRelief);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliefFeatureType getReliefFeature() {
		return (ReliefFeatureType)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliefFeature(ReliefFeatureType newReliefFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_FEATURE, newReliefFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliefFeature(ReliefFeatureType newReliefFeature) {
		((FeatureMap.Internal)getMixed()).set(ReliefPackage.Literals.DOCUMENT_ROOT__RELIEF_FEATURE, newReliefFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TINReliefType getTINRelief() {
		return (TINReliefType)getMixed().get(ReliefPackage.Literals.DOCUMENT_ROOT__TIN_RELIEF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTINRelief(TINReliefType newTINRelief, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ReliefPackage.Literals.DOCUMENT_ROOT__TIN_RELIEF, newTINRelief, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTINRelief(TINReliefType newTINRelief) {
		((FeatureMap.Internal)getMixed()).set(ReliefPackage.Literals.DOCUMENT_ROOT__TIN_RELIEF, newTINRelief);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReliefPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ReliefPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ReliefPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF:
				return basicSetGenericApplicationPropertyOfBreaklineRelief(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF:
				return basicSetGenericApplicationPropertyOfMassPointRelief(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF:
				return basicSetGenericApplicationPropertyOfRasterRelief(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT:
				return basicSetGenericApplicationPropertyOfReliefComponent(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE:
				return basicSetGenericApplicationPropertyOfReliefFeature(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF:
				return basicSetGenericApplicationPropertyOfTinRelief(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_COMPONENT:
				return basicSetReliefComponent(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__BREAKLINE_RELIEF:
				return basicSetBreaklineRelief(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__ELEVATION:
				return basicSetElevation(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__MASS_POINT_RELIEF:
				return basicSetMassPointRelief(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__RASTER_RELIEF:
				return basicSetRasterRelief(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_FEATURE:
				return basicSetReliefFeature(null, msgs);
			case ReliefPackage.DOCUMENT_ROOT__TIN_RELIEF:
				return basicSetTINRelief(null, msgs);
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
			case ReliefPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ReliefPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ReliefPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF:
				return getGenericApplicationPropertyOfBreaklineRelief();
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF:
				return getGenericApplicationPropertyOfMassPointRelief();
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF:
				return getGenericApplicationPropertyOfRasterRelief();
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT:
				return getGenericApplicationPropertyOfReliefComponent();
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE:
				return getGenericApplicationPropertyOfReliefFeature();
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF:
				return getGenericApplicationPropertyOfTinRelief();
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_COMPONENT:
				return getReliefComponent();
			case ReliefPackage.DOCUMENT_ROOT__BREAKLINE_RELIEF:
				return getBreaklineRelief();
			case ReliefPackage.DOCUMENT_ROOT__ELEVATION:
				return getElevation();
			case ReliefPackage.DOCUMENT_ROOT__MASS_POINT_RELIEF:
				return getMassPointRelief();
			case ReliefPackage.DOCUMENT_ROOT__RASTER_RELIEF:
				return getRasterRelief();
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_FEATURE:
				return getReliefFeature();
			case ReliefPackage.DOCUMENT_ROOT__TIN_RELIEF:
				return getTINRelief();
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
			case ReliefPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ReliefPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ReliefPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ReliefPackage.DOCUMENT_ROOT__BREAKLINE_RELIEF:
				setBreaklineRelief((BreaklineReliefType)newValue);
				return;
			case ReliefPackage.DOCUMENT_ROOT__ELEVATION:
				setElevation((LengthType)newValue);
				return;
			case ReliefPackage.DOCUMENT_ROOT__MASS_POINT_RELIEF:
				setMassPointRelief((MassPointReliefType)newValue);
				return;
			case ReliefPackage.DOCUMENT_ROOT__RASTER_RELIEF:
				setRasterRelief((RasterReliefType)newValue);
				return;
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_FEATURE:
				setReliefFeature((ReliefFeatureType)newValue);
				return;
			case ReliefPackage.DOCUMENT_ROOT__TIN_RELIEF:
				setTINRelief((TINReliefType)newValue);
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
			case ReliefPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ReliefPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ReliefPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ReliefPackage.DOCUMENT_ROOT__BREAKLINE_RELIEF:
				setBreaklineRelief((BreaklineReliefType)null);
				return;
			case ReliefPackage.DOCUMENT_ROOT__ELEVATION:
				setElevation((LengthType)null);
				return;
			case ReliefPackage.DOCUMENT_ROOT__MASS_POINT_RELIEF:
				setMassPointRelief((MassPointReliefType)null);
				return;
			case ReliefPackage.DOCUMENT_ROOT__RASTER_RELIEF:
				setRasterRelief((RasterReliefType)null);
				return;
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_FEATURE:
				setReliefFeature((ReliefFeatureType)null);
				return;
			case ReliefPackage.DOCUMENT_ROOT__TIN_RELIEF:
				setTINRelief((TINReliefType)null);
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
			case ReliefPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ReliefPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ReliefPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_BREAKLINE_RELIEF:
				return getGenericApplicationPropertyOfBreaklineRelief() != null;
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_MASS_POINT_RELIEF:
				return getGenericApplicationPropertyOfMassPointRelief() != null;
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RASTER_RELIEF:
				return getGenericApplicationPropertyOfRasterRelief() != null;
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_COMPONENT:
				return getGenericApplicationPropertyOfReliefComponent() != null;
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_RELIEF_FEATURE:
				return getGenericApplicationPropertyOfReliefFeature() != null;
			case ReliefPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_TIN_RELIEF:
				return getGenericApplicationPropertyOfTinRelief() != null;
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_COMPONENT:
				return getReliefComponent() != null;
			case ReliefPackage.DOCUMENT_ROOT__BREAKLINE_RELIEF:
				return getBreaklineRelief() != null;
			case ReliefPackage.DOCUMENT_ROOT__ELEVATION:
				return getElevation() != null;
			case ReliefPackage.DOCUMENT_ROOT__MASS_POINT_RELIEF:
				return getMassPointRelief() != null;
			case ReliefPackage.DOCUMENT_ROOT__RASTER_RELIEF:
				return getRasterRelief() != null;
			case ReliefPackage.DOCUMENT_ROOT__RELIEF_FEATURE:
				return getReliefFeature() != null;
			case ReliefPackage.DOCUMENT_ROOT__TIN_RELIEF:
				return getTINRelief() != null;
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
