/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.cityfurniture.impl;

import java.util.Collection;

import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.citygml.cityfurniture.CityFurnitureType;
import net.opengis.citygml.cityfurniture.CityfurniturePackage;
import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.MultiCurvePropertyType;

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
 * An implementation of the model object '<em><b>City Furniture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod1Geometry <em>Lod1 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod2Geometry <em>Lod2 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod3Geometry <em>Lod3 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getGenericApplicationPropertyOfCityFurnitureGroup <em>Generic Application Property Of City Furniture Group</em>}</li>
 *   <li>{@link net.opengis.citygml.cityfurniture.impl.CityFurnitureTypeImpl#getGenericApplicationPropertyOfCityFurniture <em>Generic Application Property Of City Furniture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CityFurnitureTypeImpl extends AbstractCityObjectTypeImpl implements CityFurnitureType {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<String> function;

	/**
	 * The cached value of the '{@link #getLod1Geometry() <em>Lod1 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod1Geometry;

	/**
	 * The cached value of the '{@link #getLod2Geometry() <em>Lod2 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod2Geometry;

	/**
	 * The cached value of the '{@link #getLod3Geometry() <em>Lod3 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod3Geometry;

	/**
	 * The cached value of the '{@link #getLod4Geometry() <em>Lod4 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod4Geometry;

	/**
	 * The cached value of the '{@link #getLod1TerrainIntersection() <em>Lod1 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1TerrainIntersection()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod1TerrainIntersection;

	/**
	 * The cached value of the '{@link #getLod2TerrainIntersection() <em>Lod2 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2TerrainIntersection()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod2TerrainIntersection;

	/**
	 * The cached value of the '{@link #getLod3TerrainIntersection() <em>Lod3 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3TerrainIntersection()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod3TerrainIntersection;

	/**
	 * The cached value of the '{@link #getLod4TerrainIntersection() <em>Lod4 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4TerrainIntersection()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod4TerrainIntersection;

	/**
	 * The cached value of the '{@link #getLod1ImplicitRepresentation() <em>Lod1 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1ImplicitRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ImplicitRepresentationPropertyType lod1ImplicitRepresentation;

	/**
	 * The cached value of the '{@link #getLod2ImplicitRepresentation() <em>Lod2 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2ImplicitRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ImplicitRepresentationPropertyType lod2ImplicitRepresentation;

	/**
	 * The cached value of the '{@link #getLod3ImplicitRepresentation() <em>Lod3 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3ImplicitRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ImplicitRepresentationPropertyType lod3ImplicitRepresentation;

	/**
	 * The cached value of the '{@link #getLod4ImplicitRepresentation() <em>Lod4 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4ImplicitRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ImplicitRepresentationPropertyType lod4ImplicitRepresentation;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfCityFurnitureGroup() <em>Generic Application Property Of City Furniture Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfCityFurnitureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfCityFurnitureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityFurnitureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CityfurniturePackage.Literals.CITY_FURNITURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, CityfurniturePackage.CITY_FURNITURE_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getLod1Geometry() {
		return lod1Geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1Geometry(GeometryPropertyType newLod1Geometry, NotificationChain msgs) {
		GeometryPropertyType oldLod1Geometry = lod1Geometry;
		lod1Geometry = newLod1Geometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY, oldLod1Geometry, newLod1Geometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1Geometry(GeometryPropertyType newLod1Geometry) {
		if (newLod1Geometry != lod1Geometry) {
			NotificationChain msgs = null;
			if (lod1Geometry != null)
				msgs = ((InternalEObject)lod1Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY, null, msgs);
			if (newLod1Geometry != null)
				msgs = ((InternalEObject)newLod1Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY, null, msgs);
			msgs = basicSetLod1Geometry(newLod1Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY, newLod1Geometry, newLod1Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getLod2Geometry() {
		return lod2Geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2Geometry(GeometryPropertyType newLod2Geometry, NotificationChain msgs) {
		GeometryPropertyType oldLod2Geometry = lod2Geometry;
		lod2Geometry = newLod2Geometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY, oldLod2Geometry, newLod2Geometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2Geometry(GeometryPropertyType newLod2Geometry) {
		if (newLod2Geometry != lod2Geometry) {
			NotificationChain msgs = null;
			if (lod2Geometry != null)
				msgs = ((InternalEObject)lod2Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY, null, msgs);
			if (newLod2Geometry != null)
				msgs = ((InternalEObject)newLod2Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY, null, msgs);
			msgs = basicSetLod2Geometry(newLod2Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY, newLod2Geometry, newLod2Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getLod3Geometry() {
		return lod3Geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3Geometry(GeometryPropertyType newLod3Geometry, NotificationChain msgs) {
		GeometryPropertyType oldLod3Geometry = lod3Geometry;
		lod3Geometry = newLod3Geometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY, oldLod3Geometry, newLod3Geometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3Geometry(GeometryPropertyType newLod3Geometry) {
		if (newLod3Geometry != lod3Geometry) {
			NotificationChain msgs = null;
			if (lod3Geometry != null)
				msgs = ((InternalEObject)lod3Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY, null, msgs);
			if (newLod3Geometry != null)
				msgs = ((InternalEObject)newLod3Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY, null, msgs);
			msgs = basicSetLod3Geometry(newLod3Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY, newLod3Geometry, newLod3Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getLod4Geometry() {
		return lod4Geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4Geometry(GeometryPropertyType newLod4Geometry, NotificationChain msgs) {
		GeometryPropertyType oldLod4Geometry = lod4Geometry;
		lod4Geometry = newLod4Geometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY, oldLod4Geometry, newLod4Geometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4Geometry(GeometryPropertyType newLod4Geometry) {
		if (newLod4Geometry != lod4Geometry) {
			NotificationChain msgs = null;
			if (lod4Geometry != null)
				msgs = ((InternalEObject)lod4Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY, null, msgs);
			if (newLod4Geometry != null)
				msgs = ((InternalEObject)newLod4Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY, null, msgs);
			msgs = basicSetLod4Geometry(newLod4Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY, newLod4Geometry, newLod4Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod1TerrainIntersection() {
		return lod1TerrainIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1TerrainIntersection(MultiCurvePropertyType newLod1TerrainIntersection, NotificationChain msgs) {
		MultiCurvePropertyType oldLod1TerrainIntersection = lod1TerrainIntersection;
		lod1TerrainIntersection = newLod1TerrainIntersection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION, oldLod1TerrainIntersection, newLod1TerrainIntersection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1TerrainIntersection(MultiCurvePropertyType newLod1TerrainIntersection) {
		if (newLod1TerrainIntersection != lod1TerrainIntersection) {
			NotificationChain msgs = null;
			if (lod1TerrainIntersection != null)
				msgs = ((InternalEObject)lod1TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION, null, msgs);
			if (newLod1TerrainIntersection != null)
				msgs = ((InternalEObject)newLod1TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod1TerrainIntersection(newLod1TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION, newLod1TerrainIntersection, newLod1TerrainIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod2TerrainIntersection() {
		return lod2TerrainIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2TerrainIntersection(MultiCurvePropertyType newLod2TerrainIntersection, NotificationChain msgs) {
		MultiCurvePropertyType oldLod2TerrainIntersection = lod2TerrainIntersection;
		lod2TerrainIntersection = newLod2TerrainIntersection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION, oldLod2TerrainIntersection, newLod2TerrainIntersection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2TerrainIntersection(MultiCurvePropertyType newLod2TerrainIntersection) {
		if (newLod2TerrainIntersection != lod2TerrainIntersection) {
			NotificationChain msgs = null;
			if (lod2TerrainIntersection != null)
				msgs = ((InternalEObject)lod2TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION, null, msgs);
			if (newLod2TerrainIntersection != null)
				msgs = ((InternalEObject)newLod2TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod2TerrainIntersection(newLod2TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION, newLod2TerrainIntersection, newLod2TerrainIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod3TerrainIntersection() {
		return lod3TerrainIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3TerrainIntersection(MultiCurvePropertyType newLod3TerrainIntersection, NotificationChain msgs) {
		MultiCurvePropertyType oldLod3TerrainIntersection = lod3TerrainIntersection;
		lod3TerrainIntersection = newLod3TerrainIntersection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION, oldLod3TerrainIntersection, newLod3TerrainIntersection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3TerrainIntersection(MultiCurvePropertyType newLod3TerrainIntersection) {
		if (newLod3TerrainIntersection != lod3TerrainIntersection) {
			NotificationChain msgs = null;
			if (lod3TerrainIntersection != null)
				msgs = ((InternalEObject)lod3TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION, null, msgs);
			if (newLod3TerrainIntersection != null)
				msgs = ((InternalEObject)newLod3TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod3TerrainIntersection(newLod3TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION, newLod3TerrainIntersection, newLod3TerrainIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod4TerrainIntersection() {
		return lod4TerrainIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4TerrainIntersection(MultiCurvePropertyType newLod4TerrainIntersection, NotificationChain msgs) {
		MultiCurvePropertyType oldLod4TerrainIntersection = lod4TerrainIntersection;
		lod4TerrainIntersection = newLod4TerrainIntersection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION, oldLod4TerrainIntersection, newLod4TerrainIntersection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4TerrainIntersection(MultiCurvePropertyType newLod4TerrainIntersection) {
		if (newLod4TerrainIntersection != lod4TerrainIntersection) {
			NotificationChain msgs = null;
			if (lod4TerrainIntersection != null)
				msgs = ((InternalEObject)lod4TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION, null, msgs);
			if (newLod4TerrainIntersection != null)
				msgs = ((InternalEObject)newLod4TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod4TerrainIntersection(newLod4TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION, newLod4TerrainIntersection, newLod4TerrainIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitRepresentationPropertyType getLod1ImplicitRepresentation() {
		return lod1ImplicitRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1ImplicitRepresentation(ImplicitRepresentationPropertyType newLod1ImplicitRepresentation, NotificationChain msgs) {
		ImplicitRepresentationPropertyType oldLod1ImplicitRepresentation = lod1ImplicitRepresentation;
		lod1ImplicitRepresentation = newLod1ImplicitRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION, oldLod1ImplicitRepresentation, newLod1ImplicitRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1ImplicitRepresentation(ImplicitRepresentationPropertyType newLod1ImplicitRepresentation) {
		if (newLod1ImplicitRepresentation != lod1ImplicitRepresentation) {
			NotificationChain msgs = null;
			if (lod1ImplicitRepresentation != null)
				msgs = ((InternalEObject)lod1ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod1ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod1ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod1ImplicitRepresentation(newLod1ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION, newLod1ImplicitRepresentation, newLod1ImplicitRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitRepresentationPropertyType getLod2ImplicitRepresentation() {
		return lod2ImplicitRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2ImplicitRepresentation(ImplicitRepresentationPropertyType newLod2ImplicitRepresentation, NotificationChain msgs) {
		ImplicitRepresentationPropertyType oldLod2ImplicitRepresentation = lod2ImplicitRepresentation;
		lod2ImplicitRepresentation = newLod2ImplicitRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION, oldLod2ImplicitRepresentation, newLod2ImplicitRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2ImplicitRepresentation(ImplicitRepresentationPropertyType newLod2ImplicitRepresentation) {
		if (newLod2ImplicitRepresentation != lod2ImplicitRepresentation) {
			NotificationChain msgs = null;
			if (lod2ImplicitRepresentation != null)
				msgs = ((InternalEObject)lod2ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod2ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod2ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod2ImplicitRepresentation(newLod2ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION, newLod2ImplicitRepresentation, newLod2ImplicitRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitRepresentationPropertyType getLod3ImplicitRepresentation() {
		return lod3ImplicitRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3ImplicitRepresentation(ImplicitRepresentationPropertyType newLod3ImplicitRepresentation, NotificationChain msgs) {
		ImplicitRepresentationPropertyType oldLod3ImplicitRepresentation = lod3ImplicitRepresentation;
		lod3ImplicitRepresentation = newLod3ImplicitRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION, oldLod3ImplicitRepresentation, newLod3ImplicitRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3ImplicitRepresentation(ImplicitRepresentationPropertyType newLod3ImplicitRepresentation) {
		if (newLod3ImplicitRepresentation != lod3ImplicitRepresentation) {
			NotificationChain msgs = null;
			if (lod3ImplicitRepresentation != null)
				msgs = ((InternalEObject)lod3ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod3ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod3ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod3ImplicitRepresentation(newLod3ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION, newLod3ImplicitRepresentation, newLod3ImplicitRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitRepresentationPropertyType getLod4ImplicitRepresentation() {
		return lod4ImplicitRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4ImplicitRepresentation(ImplicitRepresentationPropertyType newLod4ImplicitRepresentation, NotificationChain msgs) {
		ImplicitRepresentationPropertyType oldLod4ImplicitRepresentation = lod4ImplicitRepresentation;
		lod4ImplicitRepresentation = newLod4ImplicitRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION, oldLod4ImplicitRepresentation, newLod4ImplicitRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4ImplicitRepresentation(ImplicitRepresentationPropertyType newLod4ImplicitRepresentation) {
		if (newLod4ImplicitRepresentation != lod4ImplicitRepresentation) {
			NotificationChain msgs = null;
			if (lod4ImplicitRepresentation != null)
				msgs = ((InternalEObject)lod4ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod4ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod4ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod4ImplicitRepresentation(newLod4ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION, newLod4ImplicitRepresentation, newLod4ImplicitRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfCityFurnitureGroup() {
		if (genericApplicationPropertyOfCityFurnitureGroup == null) {
			genericApplicationPropertyOfCityFurnitureGroup = new BasicFeatureMap(this, CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE_GROUP);
		}
		return genericApplicationPropertyOfCityFurnitureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfCityFurniture() {
		return getGenericApplicationPropertyOfCityFurnitureGroup().list(CityfurniturePackage.Literals.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY:
				return basicSetLod1Geometry(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY:
				return basicSetLod2Geometry(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY:
				return basicSetLod3Geometry(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY:
				return basicSetLod4Geometry(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION:
				return basicSetLod1TerrainIntersection(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION:
				return basicSetLod2TerrainIntersection(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION:
				return basicSetLod3TerrainIntersection(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION:
				return basicSetLod4TerrainIntersection(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return basicSetLod1ImplicitRepresentation(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return basicSetLod2ImplicitRepresentation(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return basicSetLod3ImplicitRepresentation(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return basicSetLod4ImplicitRepresentation(null, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCityFurnitureGroup()).basicRemove(otherEnd, msgs);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCityFurniture()).basicRemove(otherEnd, msgs);
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
			case CityfurniturePackage.CITY_FURNITURE_TYPE__CLASS:
				return getClass_();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__FUNCTION:
				return getFunction();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY:
				return getLod1Geometry();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY:
				return getLod2Geometry();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY:
				return getLod3Geometry();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY:
				return getLod4Geometry();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION:
				return getLod1TerrainIntersection();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION:
				return getLod2TerrainIntersection();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION:
				return getLod3TerrainIntersection();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION:
				return getLod4TerrainIntersection();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return getLod1ImplicitRepresentation();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return getLod2ImplicitRepresentation();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return getLod3ImplicitRepresentation();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return getLod4ImplicitRepresentation();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE_GROUP:
				if (coreType) return getGenericApplicationPropertyOfCityFurnitureGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfCityFurnitureGroup()).getWrapper();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE:
				return getGenericApplicationPropertyOfCityFurniture();
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
			case CityfurniturePackage.CITY_FURNITURE_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY:
				setLod1Geometry((GeometryPropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY:
				setLod2Geometry((GeometryPropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY:
				setLod3Geometry((GeometryPropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION:
				setLod1TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION:
				setLod2TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION:
				setLod3TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION:
				setLod4TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				setLod1ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				setLod2ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				setLod3ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				setLod4ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfCityFurnitureGroup()).set(newValue);
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
			case CityfurniturePackage.CITY_FURNITURE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY:
				setLod1Geometry((GeometryPropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY:
				setLod2Geometry((GeometryPropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY:
				setLod3Geometry((GeometryPropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION:
				setLod1TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION:
				setLod2TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION:
				setLod3TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION:
				setLod4TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				setLod1ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				setLod2ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				setLod3ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				setLod4ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE_GROUP:
				getGenericApplicationPropertyOfCityFurnitureGroup().clear();
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
			case CityfurniturePackage.CITY_FURNITURE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CityfurniturePackage.CITY_FURNITURE_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_GEOMETRY:
				return lod1Geometry != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_GEOMETRY:
				return lod2Geometry != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_GEOMETRY:
				return lod3Geometry != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_GEOMETRY:
				return lod4Geometry != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_TERRAIN_INTERSECTION:
				return lod1TerrainIntersection != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_TERRAIN_INTERSECTION:
				return lod2TerrainIntersection != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_TERRAIN_INTERSECTION:
				return lod3TerrainIntersection != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_TERRAIN_INTERSECTION:
				return lod4TerrainIntersection != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return lod1ImplicitRepresentation != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return lod2ImplicitRepresentation != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return lod3ImplicitRepresentation != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return lod4ImplicitRepresentation != null;
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE_GROUP:
				return genericApplicationPropertyOfCityFurnitureGroup != null && !genericApplicationPropertyOfCityFurnitureGroup.isEmpty();
			case CityfurniturePackage.CITY_FURNITURE_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_FURNITURE:
				return !getGenericApplicationPropertyOfCityFurniture().isEmpty();
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
		result.append(" (class: ");
		result.append(class_);
		result.append(", function: ");
		result.append(function);
		result.append(", genericApplicationPropertyOfCityFurnitureGroup: ");
		result.append(genericApplicationPropertyOfCityFurnitureGroup);
		result.append(')');
		return result.toString();
	}

} //CityFurnitureTypeImpl
