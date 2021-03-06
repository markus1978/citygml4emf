/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.CompositeCurveType;
import net.opengis.gml.CompositeSolidType;
import net.opengis.gml.CompositeSurfaceType;
import net.opengis.gml.GeometricComplexPropertyType;
import net.opengis.gml.GeometricComplexType;
import net.opengis.gml.GmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometric Complex Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getGeometricComplex <em>Geometric Complex</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getCompositeCurve <em>Composite Curve</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getCompositeSurface <em>Composite Surface</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getCompositeSolid <em>Composite Solid</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getActuate <em>Actuate</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getRemoteSchema <em>Remote Schema</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getShow <em>Show</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.gml.impl.GeometricComplexPropertyTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometricComplexPropertyTypeImpl extends EObjectImpl implements GeometricComplexPropertyType {
	/**
	 * The cached value of the '{@link #getGeometricComplex() <em>Geometric Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricComplex()
	 * @generated
	 * @ordered
	 */
	protected GeometricComplexType geometricComplex;

	/**
	 * The cached value of the '{@link #getCompositeCurve() <em>Composite Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeCurve()
	 * @generated
	 * @ordered
	 */
	protected CompositeCurveType compositeCurve;

	/**
	 * The cached value of the '{@link #getCompositeSurface() <em>Composite Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSurface()
	 * @generated
	 * @ordered
	 */
	protected CompositeSurfaceType compositeSurface;

	/**
	 * The cached value of the '{@link #getCompositeSolid() <em>Composite Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeSolid()
	 * @generated
	 * @ordered
	 */
	protected CompositeSolidType compositeSolid;

	/**
	 * The default value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected static final ActuateType ACTUATE_EDEFAULT = ActuateType.ON_LOAD;

	/**
	 * The cached value of the '{@link #getActuate() <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuate()
	 * @generated
	 * @ordered
	 */
	protected ActuateType actuate = ACTUATE_EDEFAULT;

	/**
	 * This is true if the Actuate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actuateESet;

	/**
	 * The default value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArcrole() <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcrole()
	 * @generated
	 * @ordered
	 */
	protected String arcrole = ARCROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteSchema() <em>Remote Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteSchema()
	 * @generated
	 * @ordered
	 */
	protected String remoteSchema = REMOTE_SCHEMA_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final ShowType SHOW_EDEFAULT = ShowType.NEW;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected ShowType show = SHOW_EDEFAULT;

	/**
	 * This is true if the Show attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean showESet;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "simple";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometricComplexPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getGeometricComplexPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometricComplexType getGeometricComplex() {
		return geometricComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometricComplex(GeometricComplexType newGeometricComplex, NotificationChain msgs) {
		GeometricComplexType oldGeometricComplex = geometricComplex;
		geometricComplex = newGeometricComplex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX, oldGeometricComplex, newGeometricComplex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometricComplex(GeometricComplexType newGeometricComplex) {
		if (newGeometricComplex != geometricComplex) {
			NotificationChain msgs = null;
			if (geometricComplex != null)
				msgs = ((InternalEObject)geometricComplex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX, null, msgs);
			if (newGeometricComplex != null)
				msgs = ((InternalEObject)newGeometricComplex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX, null, msgs);
			msgs = basicSetGeometricComplex(newGeometricComplex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX, newGeometricComplex, newGeometricComplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCurveType getCompositeCurve() {
		return compositeCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeCurve(CompositeCurveType newCompositeCurve, NotificationChain msgs) {
		CompositeCurveType oldCompositeCurve = compositeCurve;
		compositeCurve = newCompositeCurve;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE, oldCompositeCurve, newCompositeCurve);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeCurve(CompositeCurveType newCompositeCurve) {
		if (newCompositeCurve != compositeCurve) {
			NotificationChain msgs = null;
			if (compositeCurve != null)
				msgs = ((InternalEObject)compositeCurve).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE, null, msgs);
			if (newCompositeCurve != null)
				msgs = ((InternalEObject)newCompositeCurve).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE, null, msgs);
			msgs = basicSetCompositeCurve(newCompositeCurve, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE, newCompositeCurve, newCompositeCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSurfaceType getCompositeSurface() {
		return compositeSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeSurface(CompositeSurfaceType newCompositeSurface, NotificationChain msgs) {
		CompositeSurfaceType oldCompositeSurface = compositeSurface;
		compositeSurface = newCompositeSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE, oldCompositeSurface, newCompositeSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeSurface(CompositeSurfaceType newCompositeSurface) {
		if (newCompositeSurface != compositeSurface) {
			NotificationChain msgs = null;
			if (compositeSurface != null)
				msgs = ((InternalEObject)compositeSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE, null, msgs);
			if (newCompositeSurface != null)
				msgs = ((InternalEObject)newCompositeSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE, null, msgs);
			msgs = basicSetCompositeSurface(newCompositeSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE, newCompositeSurface, newCompositeSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSolidType getCompositeSolid() {
		return compositeSolid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeSolid(CompositeSolidType newCompositeSolid, NotificationChain msgs) {
		CompositeSolidType oldCompositeSolid = compositeSolid;
		compositeSolid = newCompositeSolid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID, oldCompositeSolid, newCompositeSolid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeSolid(CompositeSolidType newCompositeSolid) {
		if (newCompositeSolid != compositeSolid) {
			NotificationChain msgs = null;
			if (compositeSolid != null)
				msgs = ((InternalEObject)compositeSolid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID, null, msgs);
			if (newCompositeSolid != null)
				msgs = ((InternalEObject)newCompositeSolid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID, null, msgs);
			msgs = basicSetCompositeSolid(newCompositeSolid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID, newCompositeSolid, newCompositeSolid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuateType getActuate() {
		return actuate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuate(ActuateType newActuate) {
		ActuateType oldActuate = actuate;
		actuate = newActuate == null ? ACTUATE_EDEFAULT : newActuate;
		boolean oldActuateESet = actuateESet;
		actuateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ACTUATE, oldActuate, actuate, !oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActuate() {
		ActuateType oldActuate = actuate;
		boolean oldActuateESet = actuateESet;
		actuate = ACTUATE_EDEFAULT;
		actuateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ACTUATE, oldActuate, ACTUATE_EDEFAULT, oldActuateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActuate() {
		return actuateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArcrole() {
		return arcrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArcrole(String newArcrole) {
		String oldArcrole = arcrole;
		arcrole = newArcrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ARCROLE, oldArcrole, arcrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoteSchema() {
		return remoteSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoteSchema(String newRemoteSchema) {
		String oldRemoteSchema = remoteSchema;
		remoteSchema = newRemoteSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__REMOTE_SCHEMA, oldRemoteSchema, remoteSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowType getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(ShowType newShow) {
		ShowType oldShow = show;
		show = newShow == null ? SHOW_EDEFAULT : newShow;
		boolean oldShowESet = showESet;
		showESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__SHOW, oldShow, show, !oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShow() {
		ShowType oldShow = show;
		boolean oldShowESet = showESet;
		show = SHOW_EDEFAULT;
		showESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__SHOW, oldShow, SHOW_EDEFAULT, oldShowESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShow() {
		return showESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX:
				return basicSetGeometricComplex(null, msgs);
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE:
				return basicSetCompositeCurve(null, msgs);
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE:
				return basicSetCompositeSurface(null, msgs);
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID:
				return basicSetCompositeSolid(null, msgs);
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
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX:
				return getGeometricComplex();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE:
				return getCompositeCurve();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE:
				return getCompositeSurface();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID:
				return getCompositeSolid();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ACTUATE:
				return getActuate();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ARCROLE:
				return getArcrole();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__HREF:
				return getHref();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__REMOTE_SCHEMA:
				return getRemoteSchema();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ROLE:
				return getRole();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__SHOW:
				return getShow();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TITLE:
				return getTitle();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TYPE:
				return getType();
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
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX:
				setGeometricComplex((GeometricComplexType)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE:
				setCompositeCurve((CompositeCurveType)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE:
				setCompositeSurface((CompositeSurfaceType)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID:
				setCompositeSolid((CompositeSolidType)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ACTUATE:
				setActuate((ActuateType)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ARCROLE:
				setArcrole((String)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__HREF:
				setHref((String)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__REMOTE_SCHEMA:
				setRemoteSchema((String)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__SHOW:
				setShow((ShowType)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TYPE:
				setType((String)newValue);
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
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX:
				setGeometricComplex((GeometricComplexType)null);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE:
				setCompositeCurve((CompositeCurveType)null);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE:
				setCompositeSurface((CompositeSurfaceType)null);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID:
				setCompositeSolid((CompositeSolidType)null);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ACTUATE:
				unsetActuate();
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ARCROLE:
				setArcrole(ARCROLE_EDEFAULT);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__REMOTE_SCHEMA:
				setRemoteSchema(REMOTE_SCHEMA_EDEFAULT);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__SHOW:
				unsetShow();
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TYPE:
				unsetType();
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
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__GEOMETRIC_COMPLEX:
				return geometricComplex != null;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_CURVE:
				return compositeCurve != null;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SURFACE:
				return compositeSurface != null;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__COMPOSITE_SOLID:
				return compositeSolid != null;
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ACTUATE:
				return isSetActuate();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ARCROLE:
				return ARCROLE_EDEFAULT == null ? arcrole != null : !ARCROLE_EDEFAULT.equals(arcrole);
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__REMOTE_SCHEMA:
				return REMOTE_SCHEMA_EDEFAULT == null ? remoteSchema != null : !REMOTE_SCHEMA_EDEFAULT.equals(remoteSchema);
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__SHOW:
				return isSetShow();
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GmlPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE__TYPE:
				return isSetType();
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
		result.append(" (actuate: ");
		if (actuateESet) result.append(actuate); else result.append("<unset>");
		result.append(", arcrole: ");
		result.append(arcrole);
		result.append(", href: ");
		result.append(href);
		result.append(", remoteSchema: ");
		result.append(remoteSchema);
		result.append(", role: ");
		result.append(role);
		result.append(", show: ");
		if (showESet) result.append(show); else result.append("<unset>");
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GeometricComplexPropertyTypeImpl
