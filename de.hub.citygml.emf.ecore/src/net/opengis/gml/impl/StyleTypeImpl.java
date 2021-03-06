/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.FeatureStylePropertyType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.GraphStylePropertyType;
import net.opengis.gml.StyleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.StyleTypeImpl#getFeatureStyle <em>Feature Style</em>}</li>
 *   <li>{@link net.opengis.gml.impl.StyleTypeImpl#getGraphStyle <em>Graph Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleTypeImpl extends AbstractStyleTypeImpl implements StyleType {
	/**
	 * The cached value of the '{@link #getFeatureStyle() <em>Feature Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureStylePropertyType> featureStyle;

	/**
	 * The cached value of the '{@link #getGraphStyle() <em>Graph Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphStyle()
	 * @generated
	 * @ordered
	 */
	protected GraphStylePropertyType graphStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getStyleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureStylePropertyType> getFeatureStyle() {
		if (featureStyle == null) {
			featureStyle = new EObjectContainmentEList<FeatureStylePropertyType>(FeatureStylePropertyType.class, this, GmlPackage.STYLE_TYPE__FEATURE_STYLE);
		}
		return featureStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphStylePropertyType getGraphStyle() {
		return graphStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGraphStyle(GraphStylePropertyType newGraphStyle, NotificationChain msgs) {
		GraphStylePropertyType oldGraphStyle = graphStyle;
		graphStyle = newGraphStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.STYLE_TYPE__GRAPH_STYLE, oldGraphStyle, newGraphStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphStyle(GraphStylePropertyType newGraphStyle) {
		if (newGraphStyle != graphStyle) {
			NotificationChain msgs = null;
			if (graphStyle != null)
				msgs = ((InternalEObject)graphStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.STYLE_TYPE__GRAPH_STYLE, null, msgs);
			if (newGraphStyle != null)
				msgs = ((InternalEObject)newGraphStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.STYLE_TYPE__GRAPH_STYLE, null, msgs);
			msgs = basicSetGraphStyle(newGraphStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.STYLE_TYPE__GRAPH_STYLE, newGraphStyle, newGraphStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.STYLE_TYPE__FEATURE_STYLE:
				return ((InternalEList<?>)getFeatureStyle()).basicRemove(otherEnd, msgs);
			case GmlPackage.STYLE_TYPE__GRAPH_STYLE:
				return basicSetGraphStyle(null, msgs);
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
			case GmlPackage.STYLE_TYPE__FEATURE_STYLE:
				return getFeatureStyle();
			case GmlPackage.STYLE_TYPE__GRAPH_STYLE:
				return getGraphStyle();
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
			case GmlPackage.STYLE_TYPE__FEATURE_STYLE:
				getFeatureStyle().clear();
				getFeatureStyle().addAll((Collection<? extends FeatureStylePropertyType>)newValue);
				return;
			case GmlPackage.STYLE_TYPE__GRAPH_STYLE:
				setGraphStyle((GraphStylePropertyType)newValue);
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
			case GmlPackage.STYLE_TYPE__FEATURE_STYLE:
				getFeatureStyle().clear();
				return;
			case GmlPackage.STYLE_TYPE__GRAPH_STYLE:
				setGraphStyle((GraphStylePropertyType)null);
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
			case GmlPackage.STYLE_TYPE__FEATURE_STYLE:
				return featureStyle != null && !featureStyle.isEmpty();
			case GmlPackage.STYLE_TYPE__GRAPH_STYLE:
				return graphStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //StyleTypeImpl
