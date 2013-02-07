/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.vegetation.impl;

import java.util.Collection;

import net.opengis.citygml.ImplicitRepresentationPropertyType;
import net.opengis.citygml.vegetation.SolitaryVegetationObjectType;
import net.opengis.citygml.vegetation.VegetationPackage;
import net.opengis.gml.GeometryPropertyType;
import net.opengis.gml.LengthType;

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
 * An implementation of the model object '<em><b>Solitary Vegetation Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getTrunkDiameter <em>Trunk Diameter</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getCrownDiameter <em>Crown Diameter</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getLod1Geometry <em>Lod1 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getLod2Geometry <em>Lod2 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getLod3Geometry <em>Lod3 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getLod4Geometry <em>Lod4 Geometry</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getLod1ImplicitRepresentation <em>Lod1 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getLod2ImplicitRepresentation <em>Lod2 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getLod3ImplicitRepresentation <em>Lod3 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getLod4ImplicitRepresentation <em>Lod4 Implicit Representation</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getGenericApplicationPropertyOfSolitaryVegetationObjectGroup <em>Generic Application Property Of Solitary Vegetation Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.vegetation.impl.SolitaryVegetationObjectTypeImpl#getGenericApplicationPropertyOfSolitaryVegetationObject <em>Generic Application Property Of Solitary Vegetation Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolitaryVegetationObjectTypeImpl extends AbstractVegetationObjectTypeImpl implements SolitaryVegetationObjectType {
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
	 * The default value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected String species = SPECIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected LengthType height;

	/**
	 * The cached value of the '{@link #getTrunkDiameter() <em>Trunk Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrunkDiameter()
	 * @generated
	 * @ordered
	 */
	protected LengthType trunkDiameter;

	/**
	 * The cached value of the '{@link #getCrownDiameter() <em>Crown Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrownDiameter()
	 * @generated
	 * @ordered
	 */
	protected LengthType crownDiameter;

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
	 * The cached value of the '{@link #getGenericApplicationPropertyOfSolitaryVegetationObjectGroup() <em>Generic Application Property Of Solitary Vegetation Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfSolitaryVegetationObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfSolitaryVegetationObjectGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolitaryVegetationObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VegetationPackage.Literals.SOLITARY_VEGETATION_OBJECT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__FUNCTION);
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(String newSpecies) {
		String oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__SPECIES, oldSpecies, species));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthType getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(LengthType newHeight, NotificationChain msgs) {
		LengthType oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT, oldHeight, newHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(LengthType newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT, newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthType getTrunkDiameter() {
		return trunkDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrunkDiameter(LengthType newTrunkDiameter, NotificationChain msgs) {
		LengthType oldTrunkDiameter = trunkDiameter;
		trunkDiameter = newTrunkDiameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER, oldTrunkDiameter, newTrunkDiameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrunkDiameter(LengthType newTrunkDiameter) {
		if (newTrunkDiameter != trunkDiameter) {
			NotificationChain msgs = null;
			if (trunkDiameter != null)
				msgs = ((InternalEObject)trunkDiameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER, null, msgs);
			if (newTrunkDiameter != null)
				msgs = ((InternalEObject)newTrunkDiameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER, null, msgs);
			msgs = basicSetTrunkDiameter(newTrunkDiameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER, newTrunkDiameter, newTrunkDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthType getCrownDiameter() {
		return crownDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrownDiameter(LengthType newCrownDiameter, NotificationChain msgs) {
		LengthType oldCrownDiameter = crownDiameter;
		crownDiameter = newCrownDiameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER, oldCrownDiameter, newCrownDiameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrownDiameter(LengthType newCrownDiameter) {
		if (newCrownDiameter != crownDiameter) {
			NotificationChain msgs = null;
			if (crownDiameter != null)
				msgs = ((InternalEObject)crownDiameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER, null, msgs);
			if (newCrownDiameter != null)
				msgs = ((InternalEObject)newCrownDiameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER, null, msgs);
			msgs = basicSetCrownDiameter(newCrownDiameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER, newCrownDiameter, newCrownDiameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY, oldLod1Geometry, newLod1Geometry);
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
				msgs = ((InternalEObject)lod1Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY, null, msgs);
			if (newLod1Geometry != null)
				msgs = ((InternalEObject)newLod1Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY, null, msgs);
			msgs = basicSetLod1Geometry(newLod1Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY, newLod1Geometry, newLod1Geometry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY, oldLod2Geometry, newLod2Geometry);
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
				msgs = ((InternalEObject)lod2Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY, null, msgs);
			if (newLod2Geometry != null)
				msgs = ((InternalEObject)newLod2Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY, null, msgs);
			msgs = basicSetLod2Geometry(newLod2Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY, newLod2Geometry, newLod2Geometry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY, oldLod3Geometry, newLod3Geometry);
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
				msgs = ((InternalEObject)lod3Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY, null, msgs);
			if (newLod3Geometry != null)
				msgs = ((InternalEObject)newLod3Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY, null, msgs);
			msgs = basicSetLod3Geometry(newLod3Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY, newLod3Geometry, newLod3Geometry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY, oldLod4Geometry, newLod4Geometry);
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
				msgs = ((InternalEObject)lod4Geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY, null, msgs);
			if (newLod4Geometry != null)
				msgs = ((InternalEObject)newLod4Geometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY, null, msgs);
			msgs = basicSetLod4Geometry(newLod4Geometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY, newLod4Geometry, newLod4Geometry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION, oldLod1ImplicitRepresentation, newLod1ImplicitRepresentation);
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
				msgs = ((InternalEObject)lod1ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod1ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod1ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod1ImplicitRepresentation(newLod1ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION, newLod1ImplicitRepresentation, newLod1ImplicitRepresentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION, oldLod2ImplicitRepresentation, newLod2ImplicitRepresentation);
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
				msgs = ((InternalEObject)lod2ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod2ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod2ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod2ImplicitRepresentation(newLod2ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION, newLod2ImplicitRepresentation, newLod2ImplicitRepresentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION, oldLod3ImplicitRepresentation, newLod3ImplicitRepresentation);
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
				msgs = ((InternalEObject)lod3ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod3ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod3ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod3ImplicitRepresentation(newLod3ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION, newLod3ImplicitRepresentation, newLod3ImplicitRepresentation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION, oldLod4ImplicitRepresentation, newLod4ImplicitRepresentation);
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
				msgs = ((InternalEObject)lod4ImplicitRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION, null, msgs);
			if (newLod4ImplicitRepresentation != null)
				msgs = ((InternalEObject)newLod4ImplicitRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION, null, msgs);
			msgs = basicSetLod4ImplicitRepresentation(newLod4ImplicitRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION, newLod4ImplicitRepresentation, newLod4ImplicitRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfSolitaryVegetationObjectGroup() {
		if (genericApplicationPropertyOfSolitaryVegetationObjectGroup == null) {
			genericApplicationPropertyOfSolitaryVegetationObjectGroup = new BasicFeatureMap(this, VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP);
		}
		return genericApplicationPropertyOfSolitaryVegetationObjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfSolitaryVegetationObject() {
		return getGenericApplicationPropertyOfSolitaryVegetationObjectGroup().list(VegetationPackage.Literals.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT:
				return basicSetHeight(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER:
				return basicSetTrunkDiameter(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER:
				return basicSetCrownDiameter(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY:
				return basicSetLod1Geometry(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY:
				return basicSetLod2Geometry(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY:
				return basicSetLod3Geometry(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY:
				return basicSetLod4Geometry(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return basicSetLod1ImplicitRepresentation(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return basicSetLod2ImplicitRepresentation(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return basicSetLod3ImplicitRepresentation(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return basicSetLod4ImplicitRepresentation(null, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfSolitaryVegetationObjectGroup()).basicRemove(otherEnd, msgs);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT:
				return ((InternalEList<?>)getGenericApplicationPropertyOfSolitaryVegetationObject()).basicRemove(otherEnd, msgs);
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
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CLASS:
				return getClass_();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__FUNCTION:
				return getFunction();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__SPECIES:
				return getSpecies();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT:
				return getHeight();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER:
				return getTrunkDiameter();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER:
				return getCrownDiameter();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY:
				return getLod1Geometry();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY:
				return getLod2Geometry();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY:
				return getLod3Geometry();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY:
				return getLod4Geometry();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return getLod1ImplicitRepresentation();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return getLod2ImplicitRepresentation();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return getLod3ImplicitRepresentation();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return getLod4ImplicitRepresentation();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP:
				if (coreType) return getGenericApplicationPropertyOfSolitaryVegetationObjectGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfSolitaryVegetationObjectGroup()).getWrapper();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT:
				return getGenericApplicationPropertyOfSolitaryVegetationObject();
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
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__SPECIES:
				setSpecies((String)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT:
				setHeight((LengthType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER:
				setTrunkDiameter((LengthType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER:
				setCrownDiameter((LengthType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY:
				setLod1Geometry((GeometryPropertyType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY:
				setLod2Geometry((GeometryPropertyType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY:
				setLod3Geometry((GeometryPropertyType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				setLod1ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				setLod2ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				setLod3ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				setLod4ImplicitRepresentation((ImplicitRepresentationPropertyType)newValue);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfSolitaryVegetationObjectGroup()).set(newValue);
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
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__SPECIES:
				setSpecies(SPECIES_EDEFAULT);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT:
				setHeight((LengthType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER:
				setTrunkDiameter((LengthType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER:
				setCrownDiameter((LengthType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY:
				setLod1Geometry((GeometryPropertyType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY:
				setLod2Geometry((GeometryPropertyType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY:
				setLod3Geometry((GeometryPropertyType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY:
				setLod4Geometry((GeometryPropertyType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				setLod1ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				setLod2ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				setLod3ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				setLod4ImplicitRepresentation((ImplicitRepresentationPropertyType)null);
				return;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP:
				getGenericApplicationPropertyOfSolitaryVegetationObjectGroup().clear();
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
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__SPECIES:
				return SPECIES_EDEFAULT == null ? species != null : !SPECIES_EDEFAULT.equals(species);
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__HEIGHT:
				return height != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__TRUNK_DIAMETER:
				return trunkDiameter != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__CROWN_DIAMETER:
				return crownDiameter != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_GEOMETRY:
				return lod1Geometry != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_GEOMETRY:
				return lod2Geometry != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_GEOMETRY:
				return lod3Geometry != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_GEOMETRY:
				return lod4Geometry != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD1_IMPLICIT_REPRESENTATION:
				return lod1ImplicitRepresentation != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD2_IMPLICIT_REPRESENTATION:
				return lod2ImplicitRepresentation != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD3_IMPLICIT_REPRESENTATION:
				return lod3ImplicitRepresentation != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__LOD4_IMPLICIT_REPRESENTATION:
				return lod4ImplicitRepresentation != null;
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT_GROUP:
				return genericApplicationPropertyOfSolitaryVegetationObjectGroup != null && !genericApplicationPropertyOfSolitaryVegetationObjectGroup.isEmpty();
			case VegetationPackage.SOLITARY_VEGETATION_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_SOLITARY_VEGETATION_OBJECT:
				return !getGenericApplicationPropertyOfSolitaryVegetationObject().isEmpty();
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
		result.append(", species: ");
		result.append(species);
		result.append(", genericApplicationPropertyOfSolitaryVegetationObjectGroup: ");
		result.append(genericApplicationPropertyOfSolitaryVegetationObjectGroup);
		result.append(')');
		return result.toString();
	}

} //SolitaryVegetationObjectTypeImpl
