/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.opengis.citygml.util.CitygmlAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CitygmlItemProviderAdapterFactory extends CitygmlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitygmlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.AddressPropertyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressPropertyTypeItemProvider addressPropertyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.AddressPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressPropertyTypeAdapter() {
		if (addressPropertyTypeItemProvider == null) {
			addressPropertyTypeItemProvider = new AddressPropertyTypeItemProvider(this);
		}

		return addressPropertyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.AddressType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressTypeItemProvider addressTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddressTypeAdapter() {
		if (addressTypeItemProvider == null) {
			addressTypeItemProvider = new AddressTypeItemProvider(this);
		}

		return addressTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.CityModelType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CityModelTypeItemProvider cityModelTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.CityModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCityModelTypeAdapter() {
		if (cityModelTypeItemProvider == null) {
			cityModelTypeItemProvider = new CityModelTypeItemProvider(this);
		}

		return cityModelTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.ExternalObjectReferenceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalObjectReferenceTypeItemProvider externalObjectReferenceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.ExternalObjectReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalObjectReferenceTypeAdapter() {
		if (externalObjectReferenceTypeItemProvider == null) {
			externalObjectReferenceTypeItemProvider = new ExternalObjectReferenceTypeItemProvider(this);
		}

		return externalObjectReferenceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.ExternalReferenceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceTypeItemProvider externalReferenceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.ExternalReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalReferenceTypeAdapter() {
		if (externalReferenceTypeItemProvider == null) {
			externalReferenceTypeItemProvider = new ExternalReferenceTypeItemProvider(this);
		}

		return externalReferenceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.GeneralizationRelationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationRelationTypeItemProvider generalizationRelationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.GeneralizationRelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralizationRelationTypeAdapter() {
		if (generalizationRelationTypeItemProvider == null) {
			generalizationRelationTypeItemProvider = new GeneralizationRelationTypeItemProvider(this);
		}

		return generalizationRelationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.ImplicitGeometryType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitGeometryTypeItemProvider implicitGeometryTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.ImplicitGeometryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplicitGeometryTypeAdapter() {
		if (implicitGeometryTypeItemProvider == null) {
			implicitGeometryTypeItemProvider = new ImplicitGeometryTypeItemProvider(this);
		}

		return implicitGeometryTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.ImplicitRepresentationPropertyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplicitRepresentationPropertyTypeItemProvider implicitRepresentationPropertyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.ImplicitRepresentationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImplicitRepresentationPropertyTypeAdapter() {
		if (implicitRepresentationPropertyTypeItemProvider == null) {
			implicitRepresentationPropertyTypeItemProvider = new ImplicitRepresentationPropertyTypeItemProvider(this);
		}

		return implicitRepresentationPropertyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.XalAddressPropertyType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XalAddressPropertyTypeItemProvider xalAddressPropertyTypeItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.XalAddressPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXalAddressPropertyTypeAdapter() {
		if (xalAddressPropertyTypeItemProvider == null) {
			xalAddressPropertyTypeItemProvider = new XalAddressPropertyTypeItemProvider(this);
		}

		return xalAddressPropertyTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.opengis.citygml.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link net.opengis.citygml.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (addressPropertyTypeItemProvider != null) addressPropertyTypeItemProvider.dispose();
		if (addressTypeItemProvider != null) addressTypeItemProvider.dispose();
		if (cityModelTypeItemProvider != null) cityModelTypeItemProvider.dispose();
		if (externalObjectReferenceTypeItemProvider != null) externalObjectReferenceTypeItemProvider.dispose();
		if (externalReferenceTypeItemProvider != null) externalReferenceTypeItemProvider.dispose();
		if (generalizationRelationTypeItemProvider != null) generalizationRelationTypeItemProvider.dispose();
		if (implicitGeometryTypeItemProvider != null) implicitGeometryTypeItemProvider.dispose();
		if (implicitRepresentationPropertyTypeItemProvider != null) implicitRepresentationPropertyTypeItemProvider.dispose();
		if (xalAddressPropertyTypeItemProvider != null) xalAddressPropertyTypeItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
	}

}