/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.impl;

import net.opengis.citygml.waterbody.AbstractWaterBoundarySurfaceType;
import net.opengis.citygml.waterbody.AbstractWaterObjectType;
import net.opengis.citygml.waterbody.DocumentRoot;
import net.opengis.citygml.waterbody.WaterBodyType;
import net.opengis.citygml.waterbody.WaterClosureSurfaceType;
import net.opengis.citygml.waterbody.WaterGroundSurfaceType;
import net.opengis.citygml.waterbody.WaterSurfaceType;
import net.opengis.citygml.waterbody.WaterbodyPackage;

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
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getGenericApplicationPropertyOfWaterBody <em>Generic Application Property Of Water Body</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getGenericApplicationPropertyOfWaterBoundarySurface <em>Generic Application Property Of Water Boundary Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getGenericApplicationPropertyOfWaterClosureSurface <em>Generic Application Property Of Water Closure Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getGenericApplicationPropertyOfWaterGroundSurface <em>Generic Application Property Of Water Ground Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getGenericApplicationPropertyOfWaterObject <em>Generic Application Property Of Water Object</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getGenericApplicationPropertyOfWaterSurface <em>Generic Application Property Of Water Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getWaterBoundarySurface <em>Water Boundary Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getWaterObject <em>Water Object</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getWaterBody <em>Water Body</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getWaterClosureSurface <em>Water Closure Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getWaterGroundSurface <em>Water Ground Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.DocumentRootImpl#getWaterSurface <em>Water Surface</em>}</li>
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
		return WaterbodyPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, WaterbodyPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, WaterbodyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, WaterbodyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfWaterBody() {
		return (EObject)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfWaterBody(EObject newGenericApplicationPropertyOfWaterBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY, newGenericApplicationPropertyOfWaterBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfWaterBoundarySurface() {
		return (EObject)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfWaterBoundarySurface(EObject newGenericApplicationPropertyOfWaterBoundarySurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE, newGenericApplicationPropertyOfWaterBoundarySurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfWaterClosureSurface() {
		return (EObject)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfWaterClosureSurface(EObject newGenericApplicationPropertyOfWaterClosureSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE, newGenericApplicationPropertyOfWaterClosureSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfWaterGroundSurface() {
		return (EObject)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfWaterGroundSurface(EObject newGenericApplicationPropertyOfWaterGroundSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE, newGenericApplicationPropertyOfWaterGroundSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfWaterObject() {
		return (EObject)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfWaterObject(EObject newGenericApplicationPropertyOfWaterObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT, newGenericApplicationPropertyOfWaterObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGenericApplicationPropertyOfWaterSurface() {
		return (EObject)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericApplicationPropertyOfWaterSurface(EObject newGenericApplicationPropertyOfWaterSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE, newGenericApplicationPropertyOfWaterSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWaterBoundarySurfaceType getWaterBoundarySurface() {
		return (AbstractWaterBoundarySurfaceType)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BOUNDARY_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaterBoundarySurface(AbstractWaterBoundarySurfaceType newWaterBoundarySurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BOUNDARY_SURFACE, newWaterBoundarySurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWaterObjectType getWaterObject() {
		return (AbstractWaterObjectType)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaterObject(AbstractWaterObjectType newWaterObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_OBJECT, newWaterObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterObject(AbstractWaterObjectType newWaterObject) {
		((FeatureMap.Internal)getMixed()).set(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_OBJECT, newWaterObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterBodyType getWaterBody() {
		return (WaterBodyType)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaterBody(WaterBodyType newWaterBody, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY, newWaterBody, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterBody(WaterBodyType newWaterBody) {
		((FeatureMap.Internal)getMixed()).set(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_BODY, newWaterBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterClosureSurfaceType getWaterClosureSurface() {
		return (WaterClosureSurfaceType)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaterClosureSurface(WaterClosureSurfaceType newWaterClosureSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE, newWaterClosureSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterClosureSurface(WaterClosureSurfaceType newWaterClosureSurface) {
		((FeatureMap.Internal)getMixed()).set(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE, newWaterClosureSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterGroundSurfaceType getWaterGroundSurface() {
		return (WaterGroundSurfaceType)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_GROUND_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaterGroundSurface(WaterGroundSurfaceType newWaterGroundSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_GROUND_SURFACE, newWaterGroundSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterGroundSurface(WaterGroundSurfaceType newWaterGroundSurface) {
		((FeatureMap.Internal)getMixed()).set(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_GROUND_SURFACE, newWaterGroundSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSurfaceType getWaterSurface() {
		return (WaterSurfaceType)getMixed().get(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaterSurface(WaterSurfaceType newWaterSurface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_SURFACE, newWaterSurface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterSurface(WaterSurfaceType newWaterSurface) {
		((FeatureMap.Internal)getMixed()).set(WaterbodyPackage.Literals.DOCUMENT_ROOT__WATER_SURFACE, newWaterSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WaterbodyPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY:
				return basicSetGenericApplicationPropertyOfWaterBody(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE:
				return basicSetGenericApplicationPropertyOfWaterBoundarySurface(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE:
				return basicSetGenericApplicationPropertyOfWaterClosureSurface(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE:
				return basicSetGenericApplicationPropertyOfWaterGroundSurface(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT:
				return basicSetGenericApplicationPropertyOfWaterObject(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE:
				return basicSetGenericApplicationPropertyOfWaterSurface(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_BOUNDARY_SURFACE:
				return basicSetWaterBoundarySurface(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_OBJECT:
				return basicSetWaterObject(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_BODY:
				return basicSetWaterBody(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE:
				return basicSetWaterClosureSurface(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_GROUND_SURFACE:
				return basicSetWaterGroundSurface(null, msgs);
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_SURFACE:
				return basicSetWaterSurface(null, msgs);
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
			case WaterbodyPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case WaterbodyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case WaterbodyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY:
				return getGenericApplicationPropertyOfWaterBody();
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE:
				return getGenericApplicationPropertyOfWaterBoundarySurface();
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE:
				return getGenericApplicationPropertyOfWaterClosureSurface();
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE:
				return getGenericApplicationPropertyOfWaterGroundSurface();
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT:
				return getGenericApplicationPropertyOfWaterObject();
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE:
				return getGenericApplicationPropertyOfWaterSurface();
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_BOUNDARY_SURFACE:
				return getWaterBoundarySurface();
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_OBJECT:
				return getWaterObject();
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_BODY:
				return getWaterBody();
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE:
				return getWaterClosureSurface();
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_GROUND_SURFACE:
				return getWaterGroundSurface();
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_SURFACE:
				return getWaterSurface();
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
			case WaterbodyPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_OBJECT:
				setWaterObject((AbstractWaterObjectType)newValue);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_BODY:
				setWaterBody((WaterBodyType)newValue);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE:
				setWaterClosureSurface((WaterClosureSurfaceType)newValue);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_GROUND_SURFACE:
				setWaterGroundSurface((WaterGroundSurfaceType)newValue);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_SURFACE:
				setWaterSurface((WaterSurfaceType)newValue);
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
			case WaterbodyPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_OBJECT:
				setWaterObject((AbstractWaterObjectType)null);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_BODY:
				setWaterBody((WaterBodyType)null);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE:
				setWaterClosureSurface((WaterClosureSurfaceType)null);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_GROUND_SURFACE:
				setWaterGroundSurface((WaterGroundSurfaceType)null);
				return;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_SURFACE:
				setWaterSurface((WaterSurfaceType)null);
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
			case WaterbodyPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case WaterbodyPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case WaterbodyPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY:
				return getGenericApplicationPropertyOfWaterBody() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_BOUNDARY_SURFACE:
				return getGenericApplicationPropertyOfWaterBoundarySurface() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_CLOSURE_SURFACE:
				return getGenericApplicationPropertyOfWaterClosureSurface() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_GROUND_SURFACE:
				return getGenericApplicationPropertyOfWaterGroundSurface() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_OBJECT:
				return getGenericApplicationPropertyOfWaterObject() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__GENERIC_APPLICATION_PROPERTY_OF_WATER_SURFACE:
				return getGenericApplicationPropertyOfWaterSurface() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_BOUNDARY_SURFACE:
				return getWaterBoundarySurface() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_OBJECT:
				return getWaterObject() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_BODY:
				return getWaterBody() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_CLOSURE_SURFACE:
				return getWaterClosureSurface() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_GROUND_SURFACE:
				return getWaterGroundSurface() != null;
			case WaterbodyPackage.DOCUMENT_ROOT__WATER_SURFACE:
				return getWaterSurface() != null;
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
