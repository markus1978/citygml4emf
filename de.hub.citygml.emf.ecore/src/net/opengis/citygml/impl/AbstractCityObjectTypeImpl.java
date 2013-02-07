/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.citygml.AbstractCityObjectType;
import net.opengis.citygml.CitygmlPackage;
import net.opengis.citygml.ExternalReferenceType;
import net.opengis.citygml.GeneralizationRelationType;
import net.opengis.gml.impl.AbstractFeatureTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract City Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.opengis.citygml.impl.AbstractCityObjectTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AbstractCityObjectTypeImpl#getTerminationDate <em>Termination Date</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AbstractCityObjectTypeImpl#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AbstractCityObjectTypeImpl#getGeneralizesTo <em>Generalizes To</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AbstractCityObjectTypeImpl#getGenericApplicationPropertyOfCityObjectGroup <em>Generic Application Property Of City Object Group</em>}</li>
 *   <li>{@link net.opengis.citygml.impl.AbstractCityObjectTypeImpl#getGenericApplicationPropertyOfCityObject <em>Generic Application Property Of City Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractCityObjectTypeImpl extends AbstractFeatureTypeImpl implements AbstractCityObjectType {
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminationDate() <em>Termination Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TERMINATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationDate() <em>Termination Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar terminationDate = TERMINATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReferenceType> externalReference;

	/**
	 * The cached value of the '{@link #getGeneralizesTo() <em>Generalizes To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationRelationType> generalizesTo;

	/**
	 * The cached value of the '{@link #getGenericApplicationPropertyOfCityObjectGroup() <em>Generic Application Property Of City Object Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericApplicationPropertyOfCityObjectGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap genericApplicationPropertyOfCityObjectGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCityObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitygmlPackage.Literals.ABSTRACT_CITY_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(XMLGregorianCalendar newCreationDate) {
		XMLGregorianCalendar oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTerminationDate() {
		return terminationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationDate(XMLGregorianCalendar newTerminationDate) {
		XMLGregorianCalendar oldTerminationDate = terminationDate;
		terminationDate = newTerminationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE, oldTerminationDate, terminationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalReferenceType> getExternalReference() {
		if (externalReference == null) {
			externalReference = new EObjectContainmentEList<ExternalReferenceType>(ExternalReferenceType.class, this, CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE);
		}
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationRelationType> getGeneralizesTo() {
		if (generalizesTo == null) {
			generalizesTo = new EObjectContainmentEList<GeneralizationRelationType>(GeneralizationRelationType.class, this, CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO);
		}
		return generalizesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenericApplicationPropertyOfCityObjectGroup() {
		if (genericApplicationPropertyOfCityObjectGroup == null) {
			genericApplicationPropertyOfCityObjectGroup = new BasicFeatureMap(this, CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP);
		}
		return genericApplicationPropertyOfCityObjectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGenericApplicationPropertyOfCityObject() {
		return getGenericApplicationPropertyOfCityObjectGroup().list(CitygmlPackage.Literals.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE:
				return ((InternalEList<?>)getExternalReference()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO:
				return ((InternalEList<?>)getGeneralizesTo()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCityObjectGroup()).basicRemove(otherEnd, msgs);
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT:
				return ((InternalEList<?>)getGenericApplicationPropertyOfCityObject()).basicRemove(otherEnd, msgs);
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
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE:
				return getCreationDate();
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE:
				return getTerminationDate();
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE:
				return getExternalReference();
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO:
				return getGeneralizesTo();
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP:
				if (coreType) return getGenericApplicationPropertyOfCityObjectGroup();
				return ((FeatureMap.Internal)getGenericApplicationPropertyOfCityObjectGroup()).getWrapper();
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT:
				return getGenericApplicationPropertyOfCityObject();
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
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE:
				setCreationDate((XMLGregorianCalendar)newValue);
				return;
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE:
				setTerminationDate((XMLGregorianCalendar)newValue);
				return;
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE:
				getExternalReference().clear();
				getExternalReference().addAll((Collection<? extends ExternalReferenceType>)newValue);
				return;
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO:
				getGeneralizesTo().clear();
				getGeneralizesTo().addAll((Collection<? extends GeneralizationRelationType>)newValue);
				return;
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP:
				((FeatureMap.Internal)getGenericApplicationPropertyOfCityObjectGroup()).set(newValue);
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
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE:
				setTerminationDate(TERMINATION_DATE_EDEFAULT);
				return;
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE:
				getExternalReference().clear();
				return;
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO:
				getGeneralizesTo().clear();
				return;
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP:
				getGenericApplicationPropertyOfCityObjectGroup().clear();
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
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__TERMINATION_DATE:
				return TERMINATION_DATE_EDEFAULT == null ? terminationDate != null : !TERMINATION_DATE_EDEFAULT.equals(terminationDate);
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__EXTERNAL_REFERENCE:
				return externalReference != null && !externalReference.isEmpty();
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERALIZES_TO:
				return generalizesTo != null && !generalizesTo.isEmpty();
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT_GROUP:
				return genericApplicationPropertyOfCityObjectGroup != null && !genericApplicationPropertyOfCityObjectGroup.isEmpty();
			case CitygmlPackage.ABSTRACT_CITY_OBJECT_TYPE__GENERIC_APPLICATION_PROPERTY_OF_CITY_OBJECT:
				return !getGenericApplicationPropertyOfCityObject().isEmpty();
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
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(", terminationDate: ");
		result.append(terminationDate);
		result.append(", genericApplicationPropertyOfCityObjectGroup: ");
		result.append(genericApplicationPropertyOfCityObjectGroup);
		result.append(')');
		return result.toString();
	}

} //AbstractCityObjectTypeImpl
