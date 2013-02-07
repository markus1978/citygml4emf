/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.waterbody.impl;

import java.util.Collection;

import net.opengis.citygml.waterbody.BoundedByWaterSurfacePropertyType;
import net.opengis.citygml.waterbody.WaterBodyType;
import net.opengis.citygml.waterbody.WaterbodyPackage;
import net.opengis.gml.MultiCurvePropertyType;
import net.opengis.gml.MultiSurfacePropertyType;
import net.opengis.gml.SolidPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Water Body Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getLod0MultiCurve <em>Lod0 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getLod0MultiSurface <em>Lod0 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getLod1MultiCurve <em>Lod1 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getLod1Solid <em>Lod1 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getLod2Solid <em>Lod2 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getLod3Solid <em>Lod3 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getLod4Solid <em>Lod4 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getBoundedBy1 <em>Bounded By1</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getGenericApplicationPropertyOfWaterBodyGroup <em>Generic Application Property Of Water Body Group</em>}</li>
 *   <li>{@link net.opengis.citygml.waterbody.impl.WaterBodyTypeImpl#getGenericApplicationPropertyOfWaterBody <em>Generic Application Property Of Water Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaterBodyTypeImpl extends AbstractWaterObjectTypeImpl implements WaterBodyType {
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
	 * The cached value of the '{@link #getLod0MultiCurve() <em>Lod0 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod0MultiCurve()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod0MultiCurve;

	/**
	 * The cached value of the '{@link #getLod0MultiSurface() <em>Lod0 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod0MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod0MultiSurface;

	/**
	 * The cached value of the '{@link #getLod1MultiCurve() <em>Lod1 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1MultiCurve()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod1MultiCurve;

	/**
	 * The cached value of the '{@link #getLod1MultiSurface() <em>Lod1 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod1MultiSurface;

	/**
	 * The cached value of the '{@link #getLod1Solid() <em>Lod1 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1Solid()
	 * @generated
	 * @ordered
	 */
	protected SolidPropertyType lod1Solid;

	/**
	 * The cached value of the '{@link #getLod2Solid() <em>Lod2 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2Solid()
	 * @generated
	 * @ordered
	 */
	protected SolidPropertyType lod2Solid;

	/**
	 * The cached value of the '{@link #getLod3Solid() <em>Lod3 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3Solid()
	 * @generated
	 * @ordered
	 */
	protected SolidPropertyType lod3Solid;

	/**
	 * The cached value of the '{@link #getLod4Solid() <em>Lod4 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4Solid()
	 * @generated
	 * @ordered
	 */
	protected SolidPropertyType lod4Solid;

	/**
	 * The cached value of the '{@link #getBoundedBy1() <em>Bounded By1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedBy1()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundedByWaterSurfacePropertyType> boundedBy1;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfWaterBodyGroup() <em>Generic Application Property Of Water Body Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfWaterBodyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfWaterBodyGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterBodyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WaterbodyPackage.Literals.WATER_BODY_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, WaterbodyPackage.WATER_BODY_TYPE__FUNCTION);
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
			usage = new EDataTypeEList<String>(String.class, this, WaterbodyPackage.WATER_BODY_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod0MultiCurve() {
		return lod0MultiCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod0MultiCurve(MultiCurvePropertyType newLod0MultiCurve, NotificationChain msgs) {
		MultiCurvePropertyType oldLod0MultiCurve = lod0MultiCurve;
		lod0MultiCurve = newLod0MultiCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE, oldLod0MultiCurve, newLod0MultiCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod0MultiCurve(MultiCurvePropertyType newLod0MultiCurve) {
		if (newLod0MultiCurve != lod0MultiCurve) {
			NotificationChain msgs = null;
			if (lod0MultiCurve != null)
				msgs = ((InternalEObject)lod0MultiCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE, null, msgs);
			if (newLod0MultiCurve != null)
				msgs = ((InternalEObject)newLod0MultiCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE, null, msgs);
			msgs = basicSetLod0MultiCurve(newLod0MultiCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE, newLod0MultiCurve, newLod0MultiCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod0MultiSurface() {
		return lod0MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod0MultiSurface(MultiSurfacePropertyType newLod0MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod0MultiSurface = lod0MultiSurface;
		lod0MultiSurface = newLod0MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE, oldLod0MultiSurface, newLod0MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod0MultiSurface(MultiSurfacePropertyType newLod0MultiSurface) {
		if (newLod0MultiSurface != lod0MultiSurface) {
			NotificationChain msgs = null;
			if (lod0MultiSurface != null)
				msgs = ((InternalEObject)lod0MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE, null, msgs);
			if (newLod0MultiSurface != null)
				msgs = ((InternalEObject)newLod0MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod0MultiSurface(newLod0MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE, newLod0MultiSurface, newLod0MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod1MultiCurve() {
		return lod1MultiCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1MultiCurve(MultiCurvePropertyType newLod1MultiCurve, NotificationChain msgs) {
		MultiCurvePropertyType oldLod1MultiCurve = lod1MultiCurve;
		lod1MultiCurve = newLod1MultiCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE, oldLod1MultiCurve, newLod1MultiCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1MultiCurve(MultiCurvePropertyType newLod1MultiCurve) {
		if (newLod1MultiCurve != lod1MultiCurve) {
			NotificationChain msgs = null;
			if (lod1MultiCurve != null)
				msgs = ((InternalEObject)lod1MultiCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE, null, msgs);
			if (newLod1MultiCurve != null)
				msgs = ((InternalEObject)newLod1MultiCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE, null, msgs);
			msgs = basicSetLod1MultiCurve(newLod1MultiCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE, newLod1MultiCurve, newLod1MultiCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod1MultiSurface() {
		return lod1MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1MultiSurface(MultiSurfacePropertyType newLod1MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod1MultiSurface = lod1MultiSurface;
		lod1MultiSurface = newLod1MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE, oldLod1MultiSurface, newLod1MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1MultiSurface(MultiSurfacePropertyType newLod1MultiSurface) {
		if (newLod1MultiSurface != lod1MultiSurface) {
			NotificationChain msgs = null;
			if (lod1MultiSurface != null)
				msgs = ((InternalEObject)lod1MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			if (newLod1MultiSurface != null)
				msgs = ((InternalEObject)newLod1MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod1MultiSurface(newLod1MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE, newLod1MultiSurface, newLod1MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidPropertyType getLod1Solid() {
		return lod1Solid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1Solid(SolidPropertyType newLod1Solid, NotificationChain msgs) {
		SolidPropertyType oldLod1Solid = lod1Solid;
		lod1Solid = newLod1Solid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID, oldLod1Solid, newLod1Solid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1Solid(SolidPropertyType newLod1Solid) {
		if (newLod1Solid != lod1Solid) {
			NotificationChain msgs = null;
			if (lod1Solid != null)
				msgs = ((InternalEObject)lod1Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID, null, msgs);
			if (newLod1Solid != null)
				msgs = ((InternalEObject)newLod1Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID, null, msgs);
			msgs = basicSetLod1Solid(newLod1Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID, newLod1Solid, newLod1Solid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidPropertyType getLod2Solid() {
		return lod2Solid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2Solid(SolidPropertyType newLod2Solid, NotificationChain msgs) {
		SolidPropertyType oldLod2Solid = lod2Solid;
		lod2Solid = newLod2Solid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID, oldLod2Solid, newLod2Solid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2Solid(SolidPropertyType newLod2Solid) {
		if (newLod2Solid != lod2Solid) {
			NotificationChain msgs = null;
			if (lod2Solid != null)
				msgs = ((InternalEObject)lod2Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID, null, msgs);
			if (newLod2Solid != null)
				msgs = ((InternalEObject)newLod2Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID, null, msgs);
			msgs = basicSetLod2Solid(newLod2Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID, newLod2Solid, newLod2Solid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidPropertyType getLod3Solid() {
		return lod3Solid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3Solid(SolidPropertyType newLod3Solid, NotificationChain msgs) {
		SolidPropertyType oldLod3Solid = lod3Solid;
		lod3Solid = newLod3Solid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID, oldLod3Solid, newLod3Solid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3Solid(SolidPropertyType newLod3Solid) {
		if (newLod3Solid != lod3Solid) {
			NotificationChain msgs = null;
			if (lod3Solid != null)
				msgs = ((InternalEObject)lod3Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID, null, msgs);
			if (newLod3Solid != null)
				msgs = ((InternalEObject)newLod3Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID, null, msgs);
			msgs = basicSetLod3Solid(newLod3Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID, newLod3Solid, newLod3Solid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidPropertyType getLod4Solid() {
		return lod4Solid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4Solid(SolidPropertyType newLod4Solid, NotificationChain msgs) {
		SolidPropertyType oldLod4Solid = lod4Solid;
		lod4Solid = newLod4Solid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID, oldLod4Solid, newLod4Solid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4Solid(SolidPropertyType newLod4Solid) {
		if (newLod4Solid != lod4Solid) {
			NotificationChain msgs = null;
			if (lod4Solid != null)
				msgs = ((InternalEObject)lod4Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID, null, msgs);
			if (newLod4Solid != null)
				msgs = ((InternalEObject)newLod4Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID, null, msgs);
			msgs = basicSetLod4Solid(newLod4Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID, newLod4Solid, newLod4Solid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundedByWaterSurfacePropertyType> getBoundedBy1() {
		if (boundedBy1 == null) {
			boundedBy1 = new EObjectContainmentEList<BoundedByWaterSurfacePropertyType>(BoundedByWaterSurfacePropertyType.class, this, WaterbodyPackage.WATER_BODY_TYPE__BOUNDED_BY1);
		}
		return boundedBy1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfWaterBodyGroup() {
		if (genericApplicationPropertyOfWaterBodyGroup == null) {
			genericApplicationPropertyOfWaterBodyGroup = new BasicFeatureMap(this, WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY_GROUP);
		}
		return genericApplicationPropertyOfWaterBodyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfWaterBody() {
		return getGenericApplicationPropertyOfWaterBodyGroup().list(WaterbodyPackage.Literals.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE:
				return basicSetLod0MultiCurve(null, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE:
				return basicSetLod0MultiSurface(null, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE:
				return basicSetLod1MultiCurve(null, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE:
				return basicSetLod1MultiSurface(null, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID:
				return basicSetLod1Solid(null, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID:
				return basicSetLod2Solid(null, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID:
				return basicSetLod3Solid(null, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID:
				return basicSetLod4Solid(null, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__BOUNDED_BY1:
				return ((InternalEList<?>)getBoundedBy1()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterBodyGroup()).basicRemove(otherEnd, msgs);
			case WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY:
				return ((InternalEList<?>)getGenericApplicationPropertyOfWaterBody()).basicRemove(otherEnd, msgs);
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
			case WaterbodyPackage.WATER_BODY_TYPE__CLASS:
				return getClass_();
			case WaterbodyPackage.WATER_BODY_TYPE__FUNCTION:
				return getFunction();
			case WaterbodyPackage.WATER_BODY_TYPE__USAGE:
				return getUsage();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE:
				return getLod0MultiCurve();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE:
				return getLod0MultiSurface();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE:
				return getLod1MultiCurve();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE:
				return getLod1MultiSurface();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID:
				return getLod1Solid();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID:
				return getLod2Solid();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID:
				return getLod3Solid();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID:
				return getLod4Solid();
			case WaterbodyPackage.WATER_BODY_TYPE__BOUNDED_BY1:
				return getBoundedBy1();
			case WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY_GROUP:
				if (coreType) return getGenericApplicationPropertyOfWaterBodyGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfWaterBodyGroup()).getWrapper();
			case WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY:
				return getGenericApplicationPropertyOfWaterBody();
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
			case WaterbodyPackage.WATER_BODY_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE:
				setLod0MultiCurve((MultiCurvePropertyType)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE:
				setLod0MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE:
				setLod1MultiCurve((MultiCurvePropertyType)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID:
				setLod1Solid((SolidPropertyType)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID:
				setLod2Solid((SolidPropertyType)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID:
				setLod3Solid((SolidPropertyType)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID:
				setLod4Solid((SolidPropertyType)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__BOUNDED_BY1:
				getBoundedBy1().clear();
				getBoundedBy1().addAll((Collection<? extends BoundedByWaterSurfacePropertyType>)newValue);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfWaterBodyGroup()).set(newValue);
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
			case WaterbodyPackage.WATER_BODY_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__USAGE:
				getUsage().clear();
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE:
				setLod0MultiCurve((MultiCurvePropertyType)null);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE:
				setLod0MultiSurface((MultiSurfacePropertyType)null);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE:
				setLod1MultiCurve((MultiCurvePropertyType)null);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)null);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID:
				setLod1Solid((SolidPropertyType)null);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID:
				setLod2Solid((SolidPropertyType)null);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID:
				setLod3Solid((SolidPropertyType)null);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID:
				setLod4Solid((SolidPropertyType)null);
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__BOUNDED_BY1:
				getBoundedBy1().clear();
				return;
			case WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY_GROUP:
				getGenericApplicationPropertyOfWaterBodyGroup().clear();
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
			case WaterbodyPackage.WATER_BODY_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case WaterbodyPackage.WATER_BODY_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case WaterbodyPackage.WATER_BODY_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_CURVE:
				return lod0MultiCurve != null;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD0_MULTI_SURFACE:
				return lod0MultiSurface != null;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_CURVE:
				return lod1MultiCurve != null;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_MULTI_SURFACE:
				return lod1MultiSurface != null;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD1_SOLID:
				return lod1Solid != null;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD2_SOLID:
				return lod2Solid != null;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD3_SOLID:
				return lod3Solid != null;
			case WaterbodyPackage.WATER_BODY_TYPE__LOD4_SOLID:
				return lod4Solid != null;
			case WaterbodyPackage.WATER_BODY_TYPE__BOUNDED_BY1:
				return boundedBy1 != null && !boundedBy1.isEmpty();
			case WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY_GROUP:
				return genericApplicationPropertyOfWaterBodyGroup != null && !genericApplicationPropertyOfWaterBodyGroup.isEmpty();
			case WaterbodyPackage.WATER_BODY_TYPE__GENERIC_APPLICATION_PROPERTY_OF_WATER_BODY:
				return !getGenericApplicationPropertyOfWaterBody().isEmpty();
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
		result.append(", genericApplicationPropertyOfWaterBodyGroup: ");
		result.append(genericApplicationPropertyOfWaterBodyGroup);
		result.append(')');
		return result.toString();
	}

} //WaterBodyTypeImpl
