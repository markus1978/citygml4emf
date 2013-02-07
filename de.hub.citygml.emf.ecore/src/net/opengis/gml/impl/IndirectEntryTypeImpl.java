/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.gml.impl;

import net.opengis.gml.DefinitionProxyType;
import net.opengis.gml.GmlPackage;
import net.opengis.gml.IndirectEntryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indirect Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.gml.impl.IndirectEntryTypeImpl#getDefinitionProxy <em>Definition Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndirectEntryTypeImpl extends EObjectImpl implements IndirectEntryType {
	/**
	 * The cached value of the '{@link #getDefinitionProxy() <em>Definition Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionProxy()
	 * @generated
	 * @ordered
	 */
	protected DefinitionProxyType definitionProxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndirectEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GmlPackage.eINSTANCE.getIndirectEntryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionProxyType getDefinitionProxy() {
		return definitionProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitionProxy(DefinitionProxyType newDefinitionProxy, NotificationChain msgs) {
		DefinitionProxyType oldDefinitionProxy = definitionProxy;
		definitionProxy = newDefinitionProxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY, oldDefinitionProxy, newDefinitionProxy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionProxy(DefinitionProxyType newDefinitionProxy) {
		if (newDefinitionProxy != definitionProxy) {
			NotificationChain msgs = null;
			if (definitionProxy != null)
				msgs = ((InternalEObject)definitionProxy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY, null, msgs);
			if (newDefinitionProxy != null)
				msgs = ((InternalEObject)newDefinitionProxy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY, null, msgs);
			msgs = basicSetDefinitionProxy(newDefinitionProxy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY, newDefinitionProxy, newDefinitionProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				return basicSetDefinitionProxy(null, msgs);
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
			case GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				return getDefinitionProxy();
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
			case GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				setDefinitionProxy((DefinitionProxyType)newValue);
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
			case GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				setDefinitionProxy((DefinitionProxyType)null);
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
			case GmlPackage.INDIRECT_ENTRY_TYPE__DEFINITION_PROXY:
				return definitionProxy != null;
		}
		return super.eIsSet(featureID);
	}

} //IndirectEntryTypeImpl
