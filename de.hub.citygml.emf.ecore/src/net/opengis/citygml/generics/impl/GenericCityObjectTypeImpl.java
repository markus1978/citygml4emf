/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.generics.impl;

import java.util.Collection;

import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.citygml.generics.GenericCityObjectType;
import net.opengis.citygml.generics.GenericsPackage;
import net.opengis.citygml.impl.AbstractCityObjectTypeImpl;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.MultiCurvePropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic City Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod0Geometry <em>Lod0 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod1Geometry <em>Lod1 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod2Geometry <em>Lod2 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod3Geometry <em>Lod3 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod0TerrainIntersection <em>Lod0 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod0ImplicitRepresentation <em>Lod0 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.generics.impl.GenericCityObjectTypeImpl#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericCityObjectTypeImpl extends AbstractCityObjectTypeImpl implements GenericCityObjectType {
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
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> usage;

	/**
	 * The cached value of the '{@link #getLod0Geometry() <em>Lod0 Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod0Geometry()
	 * @generated
	 * @ordered
	 */
	protected GeometryPropertyType lod0Geometry;

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
	 * The cached value of the '{@link #getLod0TerrainIntersection() <em>Lod0 Terrain Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod0TerrainIntersection()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod0TerrainIntersection;

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
	 * The cached value of the '{@link #getLod0ImplicitRepresentation() <em>Lod0 Implicit Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod0ImplicitRepresentation()
	 * @generated
	 * @ordered
	 */
	protected ImplicitRepresentationPropertyType lod0ImplicitRepresentation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericCityObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericsPackage.Literals.GENERIC_CITY_OBJECT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsage() {
		if (usage == null) {
			usage = new EDataTypeEList<String>(String.class, this, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryPropertyType getLod0Geometry() {
		return lod0Geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod0Geometry(GeometryPropertyType newLod0Geometry, NotificationChain msgs) {
		GeometryPropertyType oldLod0Geometry = lod0Geometry;
		lod0Geometry = newLod0Geometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY, oldLod0Geometry, newLod0Geometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod0Geometry(GeometryPropertyType newLod0Geometry) {
		if (newLod0Geometry != lod0Geometry) {
			NotificationChain msgs = null;
			if (lod0Geometry != null)
				msgs = ((InternalEObject)lod0Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY, null, msgs);
			if (newLod0Geometry != null)
				msgs = ((InternalEObject)newLod0Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY, null, msgs);
			msgs = basicSetLod0Geometry(newLod0Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY, newLod0Geometry, newLod0Geometry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY, oldLod1Geometry, newLod1Geometry);
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
				msgs = ((InternalEObject)lod1Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY, null, msgs);
			if (newLod1Geometry != null)
				msgs = ((InternalEObject)newLod1Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY, null, msgs);
			msgs = basicSetLod1Geometry(newLod1Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY, newLod1Geometry, newLod1Geometry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY, oldLod2Geometry, newLod2Geometry);
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
				msgs = ((InternalEObject)lod2Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY, null, msgs);
			if (newLod2Geometry != null)
				msgs = ((InternalEObject)newLod2Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY, null, msgs);
			msgs = basicSetLod2Geometry(newLod2Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY, newLod2Geometry, newLod2Geometry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY, oldLod3Geometry, newLod3Geometry);
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
				msgs = ((InternalEObject)lod3Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY, null, msgs);
			if (newLod3Geometry != null)
				msgs = ((InternalEObject)newLod3Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY, null, msgs);
			msgs = basicSetLod3Geometry(newLod3Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY, newLod3Geometry, newLod3Geometry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY, oldLod4Geometry, newLod4Geometry);
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
				msgs = ((InternalEObject)lod4Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY, null, msgs);
			if (newLod4Geometry != null)
				msgs = ((InternalEObject)newLod4Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY, null, msgs);
			msgs = basicSetLod4Geometry(newLod4Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY, newLod4Geometry, newLod4Geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod0TerrainIntersection() {
		return lod0TerrainIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod0TerrainIntersection(MultiCurvePropertyType newLod0TerrainIntersection, NotificationChain msgs) {
		MultiCurvePropertyType oldLod0TerrainIntersection = lod0TerrainIntersection;
		lod0TerrainIntersection = newLod0TerrainIntersection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION, oldLod0TerrainIntersection, newLod0TerrainIntersection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod0TerrainIntersection(MultiCurvePropertyType newLod0TerrainIntersection) {
		if (newLod0TerrainIntersection != lod0TerrainIntersection) {
			NotificationChain msgs = null;
			if (lod0TerrainIntersection != null)
				msgs = ((InternalEObject)lod0TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION, null, msgs);
			if (newLod0TerrainIntersection != null)
				msgs = ((InternalEObject)newLod0TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod0TerrainIntersection(newLod0TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION, newLod0TerrainIntersection, newLod0TerrainIntersection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION, oldLod1TerrainIntersection, newLod1TerrainIntersection);
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
				msgs = ((InternalEObject)lod1TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION, null, msgs);
			if (newLod1TerrainIntersection != null)
				msgs = ((InternalEObject)newLod1TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod1TerrainIntersection(newLod1TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION, newLod1TerrainIntersection, newLod1TerrainIntersection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION, oldLod2TerrainIntersection, newLod2TerrainIntersection);
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
				msgs = ((InternalEObject)lod2TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION, null, msgs);
			if (newLod2TerrainIntersection != null)
				msgs = ((InternalEObject)newLod2TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod2TerrainIntersection(newLod2TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION, newLod2TerrainIntersection, newLod2TerrainIntersection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION, oldLod3TerrainIntersection, newLod3TerrainIntersection);
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
				msgs = ((InternalEObject)lod3TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION, null, msgs);
			if (newLod3TerrainIntersection != null)
				msgs = ((InternalEObject)newLod3TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod3TerrainIntersection(newLod3TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION, newLod3TerrainIntersection, newLod3TerrainIntersection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION, oldLod4TerrainIntersection, newLod4TerrainIntersection);
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
				msgs = ((InternalEObject)lod4TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION, null, msgs);
			if (newLod4TerrainIntersection != null)
				msgs = ((InternalEObject)newLod4TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod4TerrainIntersection(newLod4TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION, newLod4TerrainIntersection, newLod4TerrainIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitRepresentationPropertyType getLod0ImplicitRepresentation() {
		return lod0ImplicitRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod0ImplicitRepresentation(ImplicitRepresentationPropertyType newLod0ImplicitRepresentation, NotificationChain msgs) {
		ImplicitRepresentationPropertyType oldLod0ImplicitRepresentation = lod0ImplicitRepresentation;
		lod0ImplicitRepresentation = newLod0ImplicitRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION, oldLod0ImplicitRepresentation, newLod0ImplicitRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod0ImplicitRepresentation(ImplicitRepresentationPropertyType newLod0ImplicitRepresentation) {
		if (newLod0ImplicitRepresentation != lod0ImplicitRepresentation) {
			NotificationChain msgs = null;
			if (lod0ImplicitRepresentation != null)
				msgs = ((InternalEObject)lod0ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod0ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod0ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod0ImplicitRepresentation(newLod0ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION, newLod0ImplicitRepresentation, newLod0ImplicitRepresentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION, oldLod1ImplicitRepresentation, newLod1ImplicitRepresentation);
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
				msgs = ((InternalEObject)lod1ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod1ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod1ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod1ImplicitRepresentation(newLod1ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION, newLod1ImplicitRepresentation, newLod1ImplicitRepresentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION, oldLod2ImplicitRepresentation, newLod2ImplicitRepresentation);
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
				msgs = ((InternalEObject)lod2ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod2ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod2ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod2ImplicitRepresentation(newLod2ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION, newLod2ImplicitRepresentation, newLod2ImplicitRepresentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION, oldLod3ImplicitRepresentation, newLod3ImplicitRepresentation);
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
				msgs = ((InternalEObject)lod3ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod3ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod3ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod3ImplicitRepresentation(newLod3ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION, newLod3ImplicitRepresentation, newLod3ImplicitRepresentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION, oldLod4ImplicitRepresentation, newLod4ImplicitRepresentation);
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
				msgs = ((InternalEObject)lod4ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod4ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod4ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod4ImplicitRepresentation(newLod4ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION, newLod4ImplicitRepresentation, newLod4ImplicitRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY:
				return basicSetLod0Geometry(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY:
				return basicSetLod1Geometry(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY:
				return basicSetLod2Geometry(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY:
				return basicSetLod3Geometry(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY:
				return basicSetLod4Geometry(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION:
				return basicSetLod0TerrainIntersection(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION:
				return basicSetLod1TerrainIntersection(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION:
				return basicSetLod2TerrainIntersection(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION:
				return basicSetLod3TerrainIntersection(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION:
				return basicSetLod4TerrainIntersection(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION:
				return basicSetLod0ImplicitRepresentation(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return basicSetLod1ImplicitRepresentation(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return basicSetLod2ImplicitRepresentation(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return basicSetLod3ImplicitRepresentation(null, msgs);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return basicSetLod4ImplicitRepresentation(null, msgs);
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
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__CLASS:
				return getClass_();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__FUNCTION:
				return getFunction();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__USAGE:
				return getUsage();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY:
				return getLod0Geometry();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY:
				return getLod1Geometry();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY:
				return getLod2Geometry();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY:
				return getLod3Geometry();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY:
				return getLod4Geometry();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION:
				return getLod0TerrainIntersection();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION:
				return getLod1TerrainIntersection();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION:
				return getLod2TerrainIntersection();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION:
				return getLod3TerrainIntersection();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION:
				return getLod4TerrainIntersection();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION:
				return getLod0ImplicitRepresentation();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return getLod1ImplicitRepresentation();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return getLod2ImplicitRepresentation();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return getLod3ImplicitRepresentation();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return getLod4ImplicitRepresentation();
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
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY:
				setLod0Geometry((GeometryPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY:
				setLod1Geometry((GeometryPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY:
				setLod2Geometry((GeometryPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY:
				setLod3Geometry((GeometryPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION:
				setLod0TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION:
				setLod1TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION:
				setLod2TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION:
				setLod3TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION:
				setLod4TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION:
				setLod0ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				setLod1ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				setLod2ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				setLod3ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				setLod4ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
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
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__USAGE:
				getUsage().clear();
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY:
				setLod0Geometry((GeometryPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY:
				setLod1Geometry((GeometryPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY:
				setLod2Geometry((GeometryPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY:
				setLod3Geometry((GeometryPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION:
				setLod0TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION:
				setLod1TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION:
				setLod2TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION:
				setLod3TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION:
				setLod4TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION:
				setLod0ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				setLod1ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				setLod2ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				setLod3ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				setLod4ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
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
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_GEOMETRY:
				return lod0Geometry != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_GEOMETRY:
				return lod1Geometry != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_GEOMETRY:
				return lod2Geometry != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_GEOMETRY:
				return lod3Geometry != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_GEOMETRY:
				return lod4Geometry != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_TERRAIN_INTERSECTION:
				return lod0TerrainIntersection != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_TERRAIN_INTERSECTION:
				return lod1TerrainIntersection != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_TERRAIN_INTERSECTION:
				return lod2TerrainIntersection != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_TERRAIN_INTERSECTION:
				return lod3TerrainIntersection != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_TERRAIN_INTERSECTION:
				return lod4TerrainIntersection != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD0_IMPLICIT_REPRESENTATION:
				return lod0ImplicitRepresentation != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return lod1ImplicitRepresentation != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return lod2ImplicitRepresentation != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return lod3ImplicitRepresentation != null;
			case GenericsPackage.GENERIC_CITY_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return lod4ImplicitRepresentation != null;
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
		result.append(", usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //GenericCityObjectTypeImpl
