/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation.impl;

import java.util.Collection;

import net.opengis.citygml.vegetation.PlantCoverType;
import net.opengis.citygml.vegetation.VegetationPackage;
import net.opengis.gml.LengthType;
import net.opengis.gml.MultiSolidPropertyType;
import net.opengis.gml.MultiSurfacePropertyType;

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
 * An implementation of the model object '<em><b>Plant Cover Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getAverageHeight <em>Average Height</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getLod1MultiSolid <em>Lod1 Multi Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getLod2MultiSolid <em>Lod2 Multi Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getLod3MultiSolid <em>Lod3 Multi Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getGenericApplicationPropertyOfPlantCoverGroup <em>Generic Application Property Of Plant Cover Group</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.PlantCoverTypeImpl#getGenericApplicationPropertyOfPlantCover <em>Generic Application Property Of Plant Cover</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlantCoverTypeImpl extends AbstractVegetationObjectTypeImpl implements PlantCoverType {
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
	 * The cached value of the '{@link #getAverageHeight() <em>Average Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageHeight()
	 * @generated
	 * @ordered
	 */
	protected LengthType averageHeight;

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
	 * The cached value of the '{@link #getLod2MultiSurface() <em>Lod2 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod2MultiSurface;

	/**
	 * The cached value of the '{@link #getLod3MultiSurface() <em>Lod3 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod3MultiSurface;

	/**
	 * The cached value of the '{@link #getLod4MultiSurface() <em>Lod4 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod4MultiSurface;

	/**
	 * The cached value of the '{@link #getLod1MultiSolid() <em>Lod1 Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1MultiSolid()
	 * @generated
	 * @ordered
	 */
	protected MultiSolidPropertyType lod1MultiSolid;

	/**
	 * The cached value of the '{@link #getLod2MultiSolid() <em>Lod2 Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2MultiSolid()
	 * @generated
	 * @ordered
	 */
	protected MultiSolidPropertyType lod2MultiSolid;

	/**
	 * The cached value of the '{@link #getLod3MultiSolid() <em>Lod3 Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3MultiSolid()
	 * @generated
	 * @ordered
	 */
	protected MultiSolidPropertyType lod3MultiSolid;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfPlantCoverGroup() <em>Generic Application Property Of Plant Cover Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfPlantCoverGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfPlantCoverGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantCoverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VegetationPackage.Literals.PLANT_COVER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, VegetationPackage.PLANT_COVER_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthType getAverageHeight() {
		return averageHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAverageHeight(LengthType newAverageHeight, NotificationChain msgs) {
		LengthType oldAverageHeight = averageHeight;
		averageHeight = newAverageHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT, oldAverageHeight, newAverageHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageHeight(LengthType newAverageHeight) {
		if (newAverageHeight != averageHeight) {
			NotificationChain msgs = null;
			if (averageHeight != null)
				msgs = ((InternalEObject)averageHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT, null, msgs);
			if (newAverageHeight != null)
				msgs = ((InternalEObject)newAverageHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT, null, msgs);
			msgs = basicSetAverageHeight(newAverageHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT, newAverageHeight, newAverageHeight));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE, oldLod1MultiSurface, newLod1MultiSurface);
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
				msgs = ((InternalEObject)lod1MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			if (newLod1MultiSurface != null)
				msgs = ((InternalEObject)newLod1MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod1MultiSurface(newLod1MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE, newLod1MultiSurface, newLod1MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod2MultiSurface() {
		return lod2MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2MultiSurface(MultiSurfacePropertyType newLod2MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod2MultiSurface = lod2MultiSurface;
		lod2MultiSurface = newLod2MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE, oldLod2MultiSurface, newLod2MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2MultiSurface(MultiSurfacePropertyType newLod2MultiSurface) {
		if (newLod2MultiSurface != lod2MultiSurface) {
			NotificationChain msgs = null;
			if (lod2MultiSurface != null)
				msgs = ((InternalEObject)lod2MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			if (newLod2MultiSurface != null)
				msgs = ((InternalEObject)newLod2MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod2MultiSurface(newLod2MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE, newLod2MultiSurface, newLod2MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod3MultiSurface() {
		return lod3MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3MultiSurface(MultiSurfacePropertyType newLod3MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod3MultiSurface = lod3MultiSurface;
		lod3MultiSurface = newLod3MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE, oldLod3MultiSurface, newLod3MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3MultiSurface(MultiSurfacePropertyType newLod3MultiSurface) {
		if (newLod3MultiSurface != lod3MultiSurface) {
			NotificationChain msgs = null;
			if (lod3MultiSurface != null)
				msgs = ((InternalEObject)lod3MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			if (newLod3MultiSurface != null)
				msgs = ((InternalEObject)newLod3MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod3MultiSurface(newLod3MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE, newLod3MultiSurface, newLod3MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSurfacePropertyType getLod4MultiSurface() {
		return lod4MultiSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4MultiSurface(MultiSurfacePropertyType newLod4MultiSurface, NotificationChain msgs) {
		MultiSurfacePropertyType oldLod4MultiSurface = lod4MultiSurface;
		lod4MultiSurface = newLod4MultiSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE, oldLod4MultiSurface, newLod4MultiSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4MultiSurface(MultiSurfacePropertyType newLod4MultiSurface) {
		if (newLod4MultiSurface != lod4MultiSurface) {
			NotificationChain msgs = null;
			if (lod4MultiSurface != null)
				msgs = ((InternalEObject)lod4MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			if (newLod4MultiSurface != null)
				msgs = ((InternalEObject)newLod4MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod4MultiSurface(newLod4MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE, newLod4MultiSurface, newLod4MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSolidPropertyType getLod1MultiSolid() {
		return lod1MultiSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod1MultiSolid(MultiSolidPropertyType newLod1MultiSolid, NotificationChain msgs) {
		MultiSolidPropertyType oldLod1MultiSolid = lod1MultiSolid;
		lod1MultiSolid = newLod1MultiSolid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID, oldLod1MultiSolid, newLod1MultiSolid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod1MultiSolid(MultiSolidPropertyType newLod1MultiSolid) {
		if (newLod1MultiSolid != lod1MultiSolid) {
			NotificationChain msgs = null;
			if (lod1MultiSolid != null)
				msgs = ((InternalEObject)lod1MultiSolid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID, null, msgs);
			if (newLod1MultiSolid != null)
				msgs = ((InternalEObject)newLod1MultiSolid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID, null, msgs);
			msgs = basicSetLod1MultiSolid(newLod1MultiSolid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID, newLod1MultiSolid, newLod1MultiSolid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSolidPropertyType getLod2MultiSolid() {
		return lod2MultiSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2MultiSolid(MultiSolidPropertyType newLod2MultiSolid, NotificationChain msgs) {
		MultiSolidPropertyType oldLod2MultiSolid = lod2MultiSolid;
		lod2MultiSolid = newLod2MultiSolid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID, oldLod2MultiSolid, newLod2MultiSolid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2MultiSolid(MultiSolidPropertyType newLod2MultiSolid) {
		if (newLod2MultiSolid != lod2MultiSolid) {
			NotificationChain msgs = null;
			if (lod2MultiSolid != null)
				msgs = ((InternalEObject)lod2MultiSolid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID, null, msgs);
			if (newLod2MultiSolid != null)
				msgs = ((InternalEObject)newLod2MultiSolid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID, null, msgs);
			msgs = basicSetLod2MultiSolid(newLod2MultiSolid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID, newLod2MultiSolid, newLod2MultiSolid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSolidPropertyType getLod3MultiSolid() {
		return lod3MultiSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3MultiSolid(MultiSolidPropertyType newLod3MultiSolid, NotificationChain msgs) {
		MultiSolidPropertyType oldLod3MultiSolid = lod3MultiSolid;
		lod3MultiSolid = newLod3MultiSolid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID, oldLod3MultiSolid, newLod3MultiSolid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3MultiSolid(MultiSolidPropertyType newLod3MultiSolid) {
		if (newLod3MultiSolid != lod3MultiSolid) {
			NotificationChain msgs = null;
			if (lod3MultiSolid != null)
				msgs = ((InternalEObject)lod3MultiSolid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID, null, msgs);
			if (newLod3MultiSolid != null)
				msgs = ((InternalEObject)newLod3MultiSolid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID, null, msgs);
			msgs = basicSetLod3MultiSolid(newLod3MultiSolid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID, newLod3MultiSolid, newLod3MultiSolid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfPlantCoverGroup() {
		if (genericApplicationPropertyOfPlantCoverGroup == null) {
			genericApplicationPropertyOfPlantCoverGroup = new BasicFeatureMap(this, VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP);
		}
		return genericApplicationPropertyOfPlantCoverGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfPlantCover() {
		return getGenericApplicationPropertyOfPlantCoverGroup().list(VegetationPackage.Literals.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT:
				return basicSetAverageHeight(null, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE:
				return basicSetLod1MultiSurface(null, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE:
				return basicSetLod2MultiSurface(null, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE:
				return basicSetLod3MultiSurface(null, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE:
				return basicSetLod4MultiSurface(null, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID:
				return basicSetLod1MultiSolid(null, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID:
				return basicSetLod2MultiSolid(null, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID:
				return basicSetLod3MultiSolid(null, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfPlantCoverGroup()).basicRemove(otherEnd, msgs);
			case VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER:
				return ((InternalEList<?>)getGenericApplicationPropertyOfPlantCover()).basicRemove(otherEnd, msgs);
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
			case VegetationPackage.PLANT_COVER_TYPE__CLASS:
				return getClass_();
			case VegetationPackage.PLANT_COVER_TYPE__FUNCTION:
				return getFunction();
			case VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT:
				return getAverageHeight();
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE:
				return getLod1MultiSurface();
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE:
				return getLod2MultiSurface();
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE:
				return getLod3MultiSurface();
			case VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE:
				return getLod4MultiSurface();
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID:
				return getLod1MultiSolid();
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID:
				return getLod2MultiSolid();
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID:
				return getLod3MultiSolid();
			case VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP:
				if (coreType) return getGenericApplicationPropertyOfPlantCoverGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfPlantCoverGroup()).getWrapper();
			case VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER:
				return getGenericApplicationPropertyOfPlantCover();
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
			case VegetationPackage.PLANT_COVER_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT:
				setAverageHeight((LengthType)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID:
				setLod1MultiSolid((MultiSolidPropertyType)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID:
				setLod2MultiSolid((MultiSolidPropertyType)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID:
				setLod3MultiSolid((MultiSolidPropertyType)newValue);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfPlantCoverGroup()).set(newValue);
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
			case VegetationPackage.PLANT_COVER_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT:
				setAverageHeight((LengthType)null);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)null);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)null);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)null);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)null);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID:
				setLod1MultiSolid((MultiSolidPropertyType)null);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID:
				setLod2MultiSolid((MultiSolidPropertyType)null);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID:
				setLod3MultiSolid((MultiSolidPropertyType)null);
				return;
			case VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP:
				getGenericApplicationPropertyOfPlantCoverGroup().clear();
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
			case VegetationPackage.PLANT_COVER_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case VegetationPackage.PLANT_COVER_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case VegetationPackage.PLANT_COVER_TYPE__AVERAGE_HEIGHT:
				return averageHeight != null;
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SURFACE:
				return lod1MultiSurface != null;
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SURFACE:
				return lod2MultiSurface != null;
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SURFACE:
				return lod3MultiSurface != null;
			case VegetationPackage.PLANT_COVER_TYPE__LOD4_MULTI_SURFACE:
				return lod4MultiSurface != null;
			case VegetationPackage.PLANT_COVER_TYPE__LOD1_MULTI_SOLID:
				return lod1MultiSolid != null;
			case VegetationPackage.PLANT_COVER_TYPE__LOD2_MULTI_SOLID:
				return lod2MultiSolid != null;
			case VegetationPackage.PLANT_COVER_TYPE__LOD3_MULTI_SOLID:
				return lod3MultiSolid != null;
			case VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER_GROUP:
				return genericApplicationPropertyOfPlantCoverGroup != null && !genericApplicationPropertyOfPlantCoverGroup.isEmpty();
			case VegetationPackage.PLANT_COVER_TYPE__GENERIC_APPLICATION_PROPERTY_OF_PLANT_COVER:
				return !getGenericApplicationPropertyOfPlantCover().isEmpty();
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
		result.append(", genericApplicationPropertyOfPlantCoverGroup: ");
		result.append(genericApplicationPropertyOfPlantCoverGroup);
		result.append(')');
		return result.toString();
	}

} //PlantCoverTypeImpl
