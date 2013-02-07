/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.building.impl;

import java.math.BigInteger;
import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.citygml.AddressPropertyType;
import net.opengis.citygml.building.AbstractBuildingType;
import net.opengis.citygml.building.BoundarySurfacePropertyType;
import net.opengis.citygml.building.BuildingInstallationPropertyType;
import net.opengis.citygml.building.BuildingPackage;
import net.opengis.citygml.building.BuildingPartPropertyType;
import net.opengis.citygml.building.IntBuildingInstallationPropertyType;
import net.opengis.citygml.building.InteriorRoomPropertyType;
import net.opengis.citygml.impl.AbstractSiteTypeImpl;
import net.opengis.gml.LengthType;
import net.opengis.gml.MeasureOrNullListType;
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
 * An implementation of the model object '<em><b>Abstract Building Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getYearOfConstruction <em>Year Of Construction</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getYearOfDemolition <em>Year Of Demolition</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getRoofType <em>Roof Type</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getMeasuredHeight <em>Measured Height</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getStoreysAboveGround <em>Storeys Above Ground</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getStoreysBelowGround <em>Storeys Below Ground</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getStoreyHeightsAboveGround <em>Storey Heights Above Ground</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getStoreyHeightsBelowGround <em>Storey Heights Below Ground</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod1Solid <em>Lod1 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod1MultiSurface <em>Lod1 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod1TerrainIntersection <em>Lod1 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod2Solid <em>Lod2 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod2MultiSurface <em>Lod2 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod2MultiCurve <em>Lod2 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod2TerrainIntersection <em>Lod2 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getOuterBuildingInstallation <em>Outer Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getInteriorBuildingInstallation <em>Interior Building Installation</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getBoundedBy1 <em>Bounded By1</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod3Solid <em>Lod3 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod3MultiSurface <em>Lod3 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod3MultiCurve <em>Lod3 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod3TerrainIntersection <em>Lod3 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod4Solid <em>Lod4 Solid</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod4MultiSurface <em>Lod4 Multi Surface</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod4MultiCurve <em>Lod4 Multi Curve</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getLod4TerrainIntersection <em>Lod4 Terrain Intersection</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getInteriorRoom <em>Interior Room</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getConsistsOfBuildingPart <em>Consists Of Building Part</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getGenericApplicationPropertyOfAbstractBuildingGroup <em>Generic Application Property Of Abstract Building Group</em>}</li>
 *   <li>{@link net.opengis.citygml.building.impl.AbstractBuildingTypeImpl#getGenericApplicationPropertyOfAbstractBuilding <em>Generic Application Property Of Abstract Building</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractBuildingTypeImpl extends AbstractSiteTypeImpl implements AbstractBuildingType {
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
	 * The default value of the '{@link #getYearOfConstruction() <em>Year Of Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfConstruction()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar YEAR_OF_CONSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearOfConstruction() <em>Year Of Construction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfConstruction()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar yearOfConstruction = YEAR_OF_CONSTRUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearOfDemolition() <em>Year Of Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfDemolition()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar YEAR_OF_DEMOLITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYearOfDemolition() <em>Year Of Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfDemolition()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar yearOfDemolition = YEAR_OF_DEMOLITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoofType() <em>Roof Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoofType()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoofType() <em>Roof Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoofType()
	 * @generated
	 * @ordered
	 */
	protected String roofType = ROOF_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasuredHeight() <em>Measured Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasuredHeight()
	 * @generated
	 * @ordered
	 */
	protected LengthType measuredHeight;

	/**
	 * The default value of the '{@link #getStoreysAboveGround() <em>Storeys Above Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreysAboveGround()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STOREYS_ABOVE_GROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreysAboveGround() <em>Storeys Above Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreysAboveGround()
	 * @generated
	 * @ordered
	 */
	protected BigInteger storeysAboveGround = STOREYS_ABOVE_GROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreysBelowGround() <em>Storeys Below Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreysBelowGround()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger STOREYS_BELOW_GROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreysBelowGround() <em>Storeys Below Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreysBelowGround()
	 * @generated
	 * @ordered
	 */
	protected BigInteger storeysBelowGround = STOREYS_BELOW_GROUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStoreyHeightsAboveGround() <em>Storey Heights Above Ground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreyHeightsAboveGround()
	 * @generated
	 * @ordered
	 */
	protected MeasureOrNullListType storeyHeightsAboveGround;

	/**
	 * The cached value of the '{@link #getStoreyHeightsBelowGround() <em>Storey Heights Below Ground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreyHeightsBelowGround()
	 * @generated
	 * @ordered
	 */
	protected MeasureOrNullListType storeyHeightsBelowGround;

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
	 * The cached value of the '{@link #getLod1MultiSurface() <em>Lod1 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod1MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod1MultiSurface;

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
	 * The cached value of the '{@link #getLod2Solid() <em>Lod2 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2Solid()
	 * @generated
	 * @ordered
	 */
	protected SolidPropertyType lod2Solid;

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
	 * The cached value of the '{@link #getLod2MultiCurve() <em>Lod2 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod2MultiCurve()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod2MultiCurve;

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
	 * The cached value of the '{@link #getOuterBuildingInstallation() <em>Outer Building Installation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBuildingInstallation()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildingInstallationPropertyType> outerBuildingInstallation;

	/**
	 * The cached value of the '{@link #getInteriorBuildingInstallation() <em>Interior Building Installation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorBuildingInstallation()
	 * @generated
	 * @ordered
	 */
	protected EList<IntBuildingInstallationPropertyType> interiorBuildingInstallation;

	/**
	 * The cached value of the '{@link #getBoundedBy1() <em>Bounded By1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedBy1()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundarySurfacePropertyType> boundedBy1;

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
	 * The cached value of the '{@link #getLod3MultiSurface() <em>Lod3 Multi Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3MultiSurface()
	 * @generated
	 * @ordered
	 */
	protected MultiSurfacePropertyType lod3MultiSurface;

	/**
	 * The cached value of the '{@link #getLod3MultiCurve() <em>Lod3 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod3MultiCurve()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod3MultiCurve;

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
	 * The cached value of the '{@link #getLod4Solid() <em>Lod4 Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4Solid()
	 * @generated
	 * @ordered
	 */
	protected SolidPropertyType lod4Solid;

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
	 * The cached value of the '{@link #getLod4MultiCurve() <em>Lod4 Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod4MultiCurve()
	 * @generated
	 * @ordered
	 */
	protected MultiCurvePropertyType lod4MultiCurve;

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
	 * The cached value of the '{@link #getInteriorRoom() <em>Interior Room</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<InteriorRoomPropertyType> interiorRoom;

	/**
	 * The cached value of the '{@link #getConsistsOfBuildingPart() <em>Consists Of Building Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOfBuildingPart()
	 * @generated
	 * @ordered
	 */
	protected EList<BuildingPartPropertyType> consistsOfBuildingPart;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressPropertyType> address;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfAbstractBuildingGroup() <em>Generic Application Property Of Abstract Building Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfAbstractBuildingGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfAbstractBuildingGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractBuildingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFunction() {
		if (function == null) {
			function = new EDataTypeEList<String>(String.class, this, BuildingPackage.ABSTRACT_BUILDING_TYPE__FUNCTION);
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
			usage = new EDataTypeEList<String>(String.class, this, BuildingPackage.ABSTRACT_BUILDING_TYPE__USAGE);
		}
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getYearOfConstruction() {
		return yearOfConstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearOfConstruction(XMLGregorianCalendar newYearOfConstruction) {
		XMLGregorianCalendar oldYearOfConstruction = yearOfConstruction;
		yearOfConstruction = newYearOfConstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION, oldYearOfConstruction, yearOfConstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getYearOfDemolition() {
		return yearOfDemolition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYearOfDemolition(XMLGregorianCalendar newYearOfDemolition) {
		XMLGregorianCalendar oldYearOfDemolition = yearOfDemolition;
		yearOfDemolition = newYearOfDemolition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION, oldYearOfDemolition, yearOfDemolition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoofType() {
		return roofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoofType(String newRoofType) {
		String oldRoofType = roofType;
		roofType = newRoofType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__ROOF_TYPE, oldRoofType, roofType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthType getMeasuredHeight() {
		return measuredHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasuredHeight(LengthType newMeasuredHeight, NotificationChain msgs) {
		LengthType oldMeasuredHeight = measuredHeight;
		measuredHeight = newMeasuredHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT, oldMeasuredHeight, newMeasuredHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredHeight(LengthType newMeasuredHeight) {
		if (newMeasuredHeight != measuredHeight) {
			NotificationChain msgs = null;
			if (measuredHeight != null)
				msgs = ((InternalEObject)measuredHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT, null, msgs);
			if (newMeasuredHeight != null)
				msgs = ((InternalEObject)newMeasuredHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT, null, msgs);
			msgs = basicSetMeasuredHeight(newMeasuredHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT, newMeasuredHeight, newMeasuredHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStoreysAboveGround() {
		return storeysAboveGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreysAboveGround(BigInteger newStoreysAboveGround) {
		BigInteger oldStoreysAboveGround = storeysAboveGround;
		storeysAboveGround = newStoreysAboveGround;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND, oldStoreysAboveGround, storeysAboveGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getStoreysBelowGround() {
		return storeysBelowGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreysBelowGround(BigInteger newStoreysBelowGround) {
		BigInteger oldStoreysBelowGround = storeysBelowGround;
		storeysBelowGround = newStoreysBelowGround;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND, oldStoreysBelowGround, storeysBelowGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureOrNullListType getStoreyHeightsAboveGround() {
		return storeyHeightsAboveGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoreyHeightsAboveGround(MeasureOrNullListType newStoreyHeightsAboveGround, NotificationChain msgs) {
		MeasureOrNullListType oldStoreyHeightsAboveGround = storeyHeightsAboveGround;
		storeyHeightsAboveGround = newStoreyHeightsAboveGround;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND, oldStoreyHeightsAboveGround, newStoreyHeightsAboveGround);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreyHeightsAboveGround(MeasureOrNullListType newStoreyHeightsAboveGround) {
		if (newStoreyHeightsAboveGround != storeyHeightsAboveGround) {
			NotificationChain msgs = null;
			if (storeyHeightsAboveGround != null)
				msgs = ((InternalEObject)storeyHeightsAboveGround).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND, null, msgs);
			if (newStoreyHeightsAboveGround != null)
				msgs = ((InternalEObject)newStoreyHeightsAboveGround).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND, null, msgs);
			msgs = basicSetStoreyHeightsAboveGround(newStoreyHeightsAboveGround, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND, newStoreyHeightsAboveGround, newStoreyHeightsAboveGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureOrNullListType getStoreyHeightsBelowGround() {
		return storeyHeightsBelowGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoreyHeightsBelowGround(MeasureOrNullListType newStoreyHeightsBelowGround, NotificationChain msgs) {
		MeasureOrNullListType oldStoreyHeightsBelowGround = storeyHeightsBelowGround;
		storeyHeightsBelowGround = newStoreyHeightsBelowGround;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND, oldStoreyHeightsBelowGround, newStoreyHeightsBelowGround);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreyHeightsBelowGround(MeasureOrNullListType newStoreyHeightsBelowGround) {
		if (newStoreyHeightsBelowGround != storeyHeightsBelowGround) {
			NotificationChain msgs = null;
			if (storeyHeightsBelowGround != null)
				msgs = ((InternalEObject)storeyHeightsBelowGround).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND, null, msgs);
			if (newStoreyHeightsBelowGround != null)
				msgs = ((InternalEObject)newStoreyHeightsBelowGround).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND, null, msgs);
			msgs = basicSetStoreyHeightsBelowGround(newStoreyHeightsBelowGround, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND, newStoreyHeightsBelowGround, newStoreyHeightsBelowGround));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID, oldLod1Solid, newLod1Solid);
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
				msgs = ((InternalEObject)lod1Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID, null, msgs);
			if (newLod1Solid != null)
				msgs = ((InternalEObject)newLod1Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID, null, msgs);
			msgs = basicSetLod1Solid(newLod1Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID, newLod1Solid, newLod1Solid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE, oldLod1MultiSurface, newLod1MultiSurface);
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
				msgs = ((InternalEObject)lod1MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			if (newLod1MultiSurface != null)
				msgs = ((InternalEObject)newLod1MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod1MultiSurface(newLod1MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE, newLod1MultiSurface, newLod1MultiSurface));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION, oldLod1TerrainIntersection, newLod1TerrainIntersection);
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
				msgs = ((InternalEObject)lod1TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION, null, msgs);
			if (newLod1TerrainIntersection != null)
				msgs = ((InternalEObject)newLod1TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod1TerrainIntersection(newLod1TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION, newLod1TerrainIntersection, newLod1TerrainIntersection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID, oldLod2Solid, newLod2Solid);
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
				msgs = ((InternalEObject)lod2Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID, null, msgs);
			if (newLod2Solid != null)
				msgs = ((InternalEObject)newLod2Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID, null, msgs);
			msgs = basicSetLod2Solid(newLod2Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID, newLod2Solid, newLod2Solid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE, oldLod2MultiSurface, newLod2MultiSurface);
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
				msgs = ((InternalEObject)lod2MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			if (newLod2MultiSurface != null)
				msgs = ((InternalEObject)newLod2MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod2MultiSurface(newLod2MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE, newLod2MultiSurface, newLod2MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod2MultiCurve() {
		return lod2MultiCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod2MultiCurve(MultiCurvePropertyType newLod2MultiCurve, NotificationChain msgs) {
		MultiCurvePropertyType oldLod2MultiCurve = lod2MultiCurve;
		lod2MultiCurve = newLod2MultiCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE, oldLod2MultiCurve, newLod2MultiCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod2MultiCurve(MultiCurvePropertyType newLod2MultiCurve) {
		if (newLod2MultiCurve != lod2MultiCurve) {
			NotificationChain msgs = null;
			if (lod2MultiCurve != null)
				msgs = ((InternalEObject)lod2MultiCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE, null, msgs);
			if (newLod2MultiCurve != null)
				msgs = ((InternalEObject)newLod2MultiCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE, null, msgs);
			msgs = basicSetLod2MultiCurve(newLod2MultiCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE, newLod2MultiCurve, newLod2MultiCurve));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION, oldLod2TerrainIntersection, newLod2TerrainIntersection);
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
				msgs = ((InternalEObject)lod2TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION, null, msgs);
			if (newLod2TerrainIntersection != null)
				msgs = ((InternalEObject)newLod2TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod2TerrainIntersection(newLod2TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION, newLod2TerrainIntersection, newLod2TerrainIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildingInstallationPropertyType> getOuterBuildingInstallation() {
		if (outerBuildingInstallation == null) {
			outerBuildingInstallation = new EObjectContainmentEList<BuildingInstallationPropertyType>(BuildingInstallationPropertyType.class, this, BuildingPackage.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION);
		}
		return outerBuildingInstallation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntBuildingInstallationPropertyType> getInteriorBuildingInstallation() {
		if (interiorBuildingInstallation == null) {
			interiorBuildingInstallation = new EObjectContainmentEList<IntBuildingInstallationPropertyType>(IntBuildingInstallationPropertyType.class, this, BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION);
		}
		return interiorBuildingInstallation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundarySurfacePropertyType> getBoundedBy1() {
		if (boundedBy1 == null) {
			boundedBy1 = new EObjectContainmentEList<BoundarySurfacePropertyType>(BoundarySurfacePropertyType.class, this, BuildingPackage.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1);
		}
		return boundedBy1;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID, oldLod3Solid, newLod3Solid);
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
				msgs = ((InternalEObject)lod3Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID, null, msgs);
			if (newLod3Solid != null)
				msgs = ((InternalEObject)newLod3Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID, null, msgs);
			msgs = basicSetLod3Solid(newLod3Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID, newLod3Solid, newLod3Solid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE, oldLod3MultiSurface, newLod3MultiSurface);
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
				msgs = ((InternalEObject)lod3MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			if (newLod3MultiSurface != null)
				msgs = ((InternalEObject)newLod3MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod3MultiSurface(newLod3MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE, newLod3MultiSurface, newLod3MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod3MultiCurve() {
		return lod3MultiCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod3MultiCurve(MultiCurvePropertyType newLod3MultiCurve, NotificationChain msgs) {
		MultiCurvePropertyType oldLod3MultiCurve = lod3MultiCurve;
		lod3MultiCurve = newLod3MultiCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE, oldLod3MultiCurve, newLod3MultiCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod3MultiCurve(MultiCurvePropertyType newLod3MultiCurve) {
		if (newLod3MultiCurve != lod3MultiCurve) {
			NotificationChain msgs = null;
			if (lod3MultiCurve != null)
				msgs = ((InternalEObject)lod3MultiCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE, null, msgs);
			if (newLod3MultiCurve != null)
				msgs = ((InternalEObject)newLod3MultiCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE, null, msgs);
			msgs = basicSetLod3MultiCurve(newLod3MultiCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE, newLod3MultiCurve, newLod3MultiCurve));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION, oldLod3TerrainIntersection, newLod3TerrainIntersection);
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
				msgs = ((InternalEObject)lod3TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION, null, msgs);
			if (newLod3TerrainIntersection != null)
				msgs = ((InternalEObject)newLod3TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod3TerrainIntersection(newLod3TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION, newLod3TerrainIntersection, newLod3TerrainIntersection));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID, oldLod4Solid, newLod4Solid);
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
				msgs = ((InternalEObject)lod4Solid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID, null, msgs);
			if (newLod4Solid != null)
				msgs = ((InternalEObject)newLod4Solid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID, null, msgs);
			msgs = basicSetLod4Solid(newLod4Solid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID, newLod4Solid, newLod4Solid));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE, oldLod4MultiSurface, newLod4MultiSurface);
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
				msgs = ((InternalEObject)lod4MultiSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			if (newLod4MultiSurface != null)
				msgs = ((InternalEObject)newLod4MultiSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE, null, msgs);
			msgs = basicSetLod4MultiSurface(newLod4MultiSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE, newLod4MultiSurface, newLod4MultiSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiCurvePropertyType getLod4MultiCurve() {
		return lod4MultiCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod4MultiCurve(MultiCurvePropertyType newLod4MultiCurve, NotificationChain msgs) {
		MultiCurvePropertyType oldLod4MultiCurve = lod4MultiCurve;
		lod4MultiCurve = newLod4MultiCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE, oldLod4MultiCurve, newLod4MultiCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod4MultiCurve(MultiCurvePropertyType newLod4MultiCurve) {
		if (newLod4MultiCurve != lod4MultiCurve) {
			NotificationChain msgs = null;
			if (lod4MultiCurve != null)
				msgs = ((InternalEObject)lod4MultiCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE, null, msgs);
			if (newLod4MultiCurve != null)
				msgs = ((InternalEObject)newLod4MultiCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE, null, msgs);
			msgs = basicSetLod4MultiCurve(newLod4MultiCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE, newLod4MultiCurve, newLod4MultiCurve));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION, oldLod4TerrainIntersection, newLod4TerrainIntersection);
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
				msgs = ((InternalEObject)lod4TerrainIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION, null, msgs);
			if (newLod4TerrainIntersection != null)
				msgs = ((InternalEObject)newLod4TerrainIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION, null, msgs);
			msgs = basicSetLod4TerrainIntersection(newLod4TerrainIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION, newLod4TerrainIntersection, newLod4TerrainIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteriorRoomPropertyType> getInteriorRoom() {
		if (interiorRoom == null) {
			interiorRoom = new EObjectContainmentEList<InteriorRoomPropertyType>(InteriorRoomPropertyType.class, this, BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM);
		}
		return interiorRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BuildingPartPropertyType> getConsistsOfBuildingPart() {
		if (consistsOfBuildingPart == null) {
			consistsOfBuildingPart = new EObjectContainmentEList<BuildingPartPropertyType>(BuildingPartPropertyType.class, this, BuildingPackage.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART);
		}
		return consistsOfBuildingPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressPropertyType> getAddress() {
		if (address == null) {
			address = new EObjectContainmentEList<AddressPropertyType>(AddressPropertyType.class, this, BuildingPackage.ABSTRACT_BUILDING_TYPE__ADDRESS);
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfAbstractBuildingGroup() {
		if (genericApplicationPropertyOfAbstractBuildingGroup == null) {
			genericApplicationPropertyOfAbstractBuildingGroup = new BasicFeatureMap(this, BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP);
		}
		return genericApplicationPropertyOfAbstractBuildingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfAbstractBuilding() {
		return getGenericApplicationPropertyOfAbstractBuildingGroup().list(BuildingPackage.Literals.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT:
				return basicSetMeasuredHeight(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND:
				return basicSetStoreyHeightsAboveGround(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND:
				return basicSetStoreyHeightsBelowGround(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID:
				return basicSetLod1Solid(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE:
				return basicSetLod1MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION:
				return basicSetLod1TerrainIntersection(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID:
				return basicSetLod2Solid(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE:
				return basicSetLod2MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE:
				return basicSetLod2MultiCurve(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION:
				return basicSetLod2TerrainIntersection(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION:
				return ((InternalEList<?>)getOuterBuildingInstallation()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION:
				return ((InternalEList<?>)getInteriorBuildingInstallation()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1:
				return ((InternalEList<?>)getBoundedBy1()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID:
				return basicSetLod3Solid(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE:
				return basicSetLod3MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE:
				return basicSetLod3MultiCurve(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION:
				return basicSetLod3TerrainIntersection(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID:
				return basicSetLod4Solid(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE:
				return basicSetLod4MultiSurface(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE:
				return basicSetLod4MultiCurve(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION:
				return basicSetLod4TerrainIntersection(null, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM:
				return ((InternalEList<?>)getInteriorRoom()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART:
				return ((InternalEList<?>)getConsistsOfBuildingPart()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfAbstractBuildingGroup()).basicRemove(otherEnd, msgs);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING:
				return ((InternalEList<?>)getGenericApplicationPropertyOfAbstractBuilding()).basicRemove(otherEnd, msgs);
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
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CLASS:
				return getClass_();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__FUNCTION:
				return getFunction();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__USAGE:
				return getUsage();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION:
				return getYearOfConstruction();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION:
				return getYearOfDemolition();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ROOF_TYPE:
				return getRoofType();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT:
				return getMeasuredHeight();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND:
				return getStoreysAboveGround();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND:
				return getStoreysBelowGround();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND:
				return getStoreyHeightsAboveGround();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND:
				return getStoreyHeightsBelowGround();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID:
				return getLod1Solid();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE:
				return getLod1MultiSurface();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION:
				return getLod1TerrainIntersection();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID:
				return getLod2Solid();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE:
				return getLod2MultiSurface();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE:
				return getLod2MultiCurve();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION:
				return getLod2TerrainIntersection();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION:
				return getOuterBuildingInstallation();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION:
				return getInteriorBuildingInstallation();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1:
				return getBoundedBy1();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID:
				return getLod3Solid();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE:
				return getLod3MultiSurface();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE:
				return getLod3MultiCurve();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION:
				return getLod3TerrainIntersection();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID:
				return getLod4Solid();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE:
				return getLod4MultiSurface();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE:
				return getLod4MultiCurve();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION:
				return getLod4TerrainIntersection();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM:
				return getInteriorRoom();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART:
				return getConsistsOfBuildingPart();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ADDRESS:
				return getAddress();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP:
				if (coreType) return getGenericApplicationPropertyOfAbstractBuildingGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfAbstractBuildingGroup()).getWrapper();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING:
				return getGenericApplicationPropertyOfAbstractBuilding();
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
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__USAGE:
				getUsage().clear();
				getUsage().addAll((Collection<? extends String>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION:
				setYearOfConstruction((XMLGregorianCalendar)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION:
				setYearOfDemolition((XMLGregorianCalendar)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ROOF_TYPE:
				setRoofType((String)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT:
				setMeasuredHeight((LengthType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND:
				setStoreysAboveGround((BigInteger)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND:
				setStoreysBelowGround((BigInteger)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND:
				setStoreyHeightsAboveGround((MeasureOrNullListType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND:
				setStoreyHeightsBelowGround((MeasureOrNullListType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID:
				setLod1Solid((SolidPropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION:
				setLod1TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID:
				setLod2Solid((SolidPropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE:
				setLod2MultiCurve((MultiCurvePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION:
				setLod2TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION:
				getOuterBuildingInstallation().clear();
				getOuterBuildingInstallation().addAll((Collection<? extends BuildingInstallationPropertyType>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION:
				getInteriorBuildingInstallation().clear();
				getInteriorBuildingInstallation().addAll((Collection<? extends IntBuildingInstallationPropertyType>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1:
				getBoundedBy1().clear();
				getBoundedBy1().addAll((Collection<? extends BoundarySurfacePropertyType>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID:
				setLod3Solid((SolidPropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE:
				setLod3MultiCurve((MultiCurvePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION:
				setLod3TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID:
				setLod4Solid((SolidPropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE:
				setLod4MultiCurve((MultiCurvePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION:
				setLod4TerrainIntersection((MultiCurvePropertyType)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM:
				getInteriorRoom().clear();
				getInteriorRoom().addAll((Collection<? extends InteriorRoomPropertyType>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART:
				getConsistsOfBuildingPart().clear();
				getConsistsOfBuildingPart().addAll((Collection<? extends BuildingPartPropertyType>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressPropertyType>)newValue);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfAbstractBuildingGroup()).set(newValue);
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
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__USAGE:
				getUsage().clear();
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION:
				setYearOfConstruction(YEAR_OF_CONSTRUCTION_EDEFAULT);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION:
				setYearOfDemolition(YEAR_OF_DEMOLITION_EDEFAULT);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ROOF_TYPE:
				setRoofType(ROOF_TYPE_EDEFAULT);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT:
				setMeasuredHeight((LengthType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND:
				setStoreysAboveGround(STOREYS_ABOVE_GROUND_EDEFAULT);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND:
				setStoreysBelowGround(STOREYS_BELOW_GROUND_EDEFAULT);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND:
				setStoreyHeightsAboveGround((MeasureOrNullListType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND:
				setStoreyHeightsBelowGround((MeasureOrNullListType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID:
				setLod1Solid((SolidPropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE:
				setLod1MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION:
				setLod1TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID:
				setLod2Solid((SolidPropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE:
				setLod2MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE:
				setLod2MultiCurve((MultiCurvePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION:
				setLod2TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION:
				getOuterBuildingInstallation().clear();
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION:
				getInteriorBuildingInstallation().clear();
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1:
				getBoundedBy1().clear();
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID:
				setLod3Solid((SolidPropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE:
				setLod3MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE:
				setLod3MultiCurve((MultiCurvePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION:
				setLod3TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID:
				setLod4Solid((SolidPropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE:
				setLod4MultiSurface((MultiSurfacePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE:
				setLod4MultiCurve((MultiCurvePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION:
				setLod4TerrainIntersection((MultiCurvePropertyType)null);
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM:
				getInteriorRoom().clear();
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART:
				getConsistsOfBuildingPart().clear();
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP:
				getGenericApplicationPropertyOfAbstractBuildingGroup().clear();
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
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__USAGE:
				return usage != null && !usage.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_CONSTRUCTION:
				return YEAR_OF_CONSTRUCTION_EDEFAULT == null ? yearOfConstruction != null : !YEAR_OF_CONSTRUCTION_EDEFAULT.equals(yearOfConstruction);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__YEAR_OF_DEMOLITION:
				return YEAR_OF_DEMOLITION_EDEFAULT == null ? yearOfDemolition != null : !YEAR_OF_DEMOLITION_EDEFAULT.equals(yearOfDemolition);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ROOF_TYPE:
				return ROOF_TYPE_EDEFAULT == null ? roofType != null : !ROOF_TYPE_EDEFAULT.equals(roofType);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__MEASURED_HEIGHT:
				return measuredHeight != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_ABOVE_GROUND:
				return STOREYS_ABOVE_GROUND_EDEFAULT == null ? storeysAboveGround != null : !STOREYS_ABOVE_GROUND_EDEFAULT.equals(storeysAboveGround);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREYS_BELOW_GROUND:
				return STOREYS_BELOW_GROUND_EDEFAULT == null ? storeysBelowGround != null : !STOREYS_BELOW_GROUND_EDEFAULT.equals(storeysBelowGround);
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_ABOVE_GROUND:
				return storeyHeightsAboveGround != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__STOREY_HEIGHTS_BELOW_GROUND:
				return storeyHeightsBelowGround != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_SOLID:
				return lod1Solid != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_MULTI_SURFACE:
				return lod1MultiSurface != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD1_TERRAIN_INTERSECTION:
				return lod1TerrainIntersection != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_SOLID:
				return lod2Solid != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_SURFACE:
				return lod2MultiSurface != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_MULTI_CURVE:
				return lod2MultiCurve != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD2_TERRAIN_INTERSECTION:
				return lod2TerrainIntersection != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__OUTER_BUILDING_INSTALLATION:
				return outerBuildingInstallation != null && !outerBuildingInstallation.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_BUILDING_INSTALLATION:
				return interiorBuildingInstallation != null && !interiorBuildingInstallation.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__BOUNDED_BY1:
				return boundedBy1 != null && !boundedBy1.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_SOLID:
				return lod3Solid != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_SURFACE:
				return lod3MultiSurface != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_MULTI_CURVE:
				return lod3MultiCurve != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD3_TERRAIN_INTERSECTION:
				return lod3TerrainIntersection != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_SOLID:
				return lod4Solid != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_SURFACE:
				return lod4MultiSurface != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_MULTI_CURVE:
				return lod4MultiCurve != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__LOD4_TERRAIN_INTERSECTION:
				return lod4TerrainIntersection != null;
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__INTERIOR_ROOM:
				return interiorRoom != null && !interiorRoom.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__CONSISTS_OF_BUILDING_PART:
				return consistsOfBuildingPart != null && !consistsOfBuildingPart.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__ADDRESS:
				return address != null && !address.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING_GROUP:
				return genericApplicationPropertyOfAbstractBuildingGroup != null && !genericApplicationPropertyOfAbstractBuildingGroup.isEmpty();
			case BuildingPackage.ABSTRACT_BUILDING_TYPE__GENERIC_APPLICATION_PROPERTY_OF_ABSTRACT_BUILDING:
				return !getGenericApplicationPropertyOfAbstractBuilding().isEmpty();
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
		result.append(", yearOfConstruction: ");
		result.append(yearOfConstruction);
		result.append(", yearOfDemolition: ");
		result.append(yearOfDemolition);
		result.append(", roofType: ");
		result.append(roofType);
		result.append(", storeysAboveGround: ");
		result.append(storeysAboveGround);
		result.append(", storeysBelowGround: ");
		result.append(storeysBelowGround);
		result.append(", genericApplicationPropertyOfAbstractBuildingGroup: ");
		result.append(genericApplicationPropertyOfAbstractBuildingGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractBuildingTypeImpl
