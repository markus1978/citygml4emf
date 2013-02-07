/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL.provider;


import java.util.Collection;
import java.util.List;

import net.opengis.citygml.building.provider.CityGMLEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.oasis.xAL.DocumentRoot;
import org.oasis.xAL.XALFactory;
import org.oasis.xAL.XALPackage;

/**
 * This is the item provider adapter for a {@link org.oasis.xAL.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_AddressDetails());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_AddressLine());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_AdministrativeArea());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_CountryName());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_Department());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_Locality());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_PostalCode());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_PostBox());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_PostOffice());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_Premise());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumber());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberPrefix());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberSuffix());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_Thoroughfare());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumber());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberPrefix());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberSuffix());
			childrenFeatures.add(XALPackage.eINSTANCE.getDocumentRoot_XAL());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case XALPackage.DOCUMENT_ROOT__ADDRESS_DETAILS:
			case XALPackage.DOCUMENT_ROOT__ADDRESS_LINE:
			case XALPackage.DOCUMENT_ROOT__ADMINISTRATIVE_AREA:
			case XALPackage.DOCUMENT_ROOT__COUNTRY_NAME:
			case XALPackage.DOCUMENT_ROOT__DEPARTMENT:
			case XALPackage.DOCUMENT_ROOT__LOCALITY:
			case XALPackage.DOCUMENT_ROOT__POSTAL_CODE:
			case XALPackage.DOCUMENT_ROOT__POST_BOX:
			case XALPackage.DOCUMENT_ROOT__POST_OFFICE:
			case XALPackage.DOCUMENT_ROOT__PREMISE:
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER:
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX:
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX:
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE:
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER:
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX:
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX:
			case XALPackage.DOCUMENT_ROOT__XAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_AddressDetails(),
				 XALFactory.eINSTANCE.createAddressDetails()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_AddressLine(),
				 XALFactory.eINSTANCE.createAddressLineType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_AdministrativeArea(),
				 XALFactory.eINSTANCE.createAdministrativeAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_CountryName(),
				 XALFactory.eINSTANCE.createCountryNameType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_Department(),
				 XALFactory.eINSTANCE.createDepartmentType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_Locality(),
				 XALFactory.eINSTANCE.createLocalityType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_PostalCode(),
				 XALFactory.eINSTANCE.createPostalCodeType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_PostBox(),
				 XALFactory.eINSTANCE.createPostBoxType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_PostOffice(),
				 XALFactory.eINSTANCE.createPostOfficeType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_Premise(),
				 XALFactory.eINSTANCE.createPremiseType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumber(),
				 XALFactory.eINSTANCE.createPremiseNumberType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberPrefix(),
				 XALFactory.eINSTANCE.createPremiseNumberPrefixType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberSuffix(),
				 XALFactory.eINSTANCE.createPremiseNumberSuffixType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_Thoroughfare(),
				 XALFactory.eINSTANCE.createThoroughfareType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumber(),
				 XALFactory.eINSTANCE.createThoroughfareNumberType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberPrefix(),
				 XALFactory.eINSTANCE.createThoroughfareNumberPrefixType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberSuffix(),
				 XALFactory.eINSTANCE.createThoroughfareNumberSuffixType()));

		newChildDescriptors.add
			(createChildParameter
				(XALPackage.eINSTANCE.getDocumentRoot_XAL(),
				 XALFactory.eINSTANCE.createXALType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CityGMLEditPlugin.INSTANCE;
	}

}
