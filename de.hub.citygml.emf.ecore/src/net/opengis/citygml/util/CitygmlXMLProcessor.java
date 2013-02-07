/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.opengis.citygml.util;

import java.util.Map;

import net.opengis.citygml.CitygmlPackage;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CitygmlXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitygmlXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CitygmlPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CitygmlResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CitygmlResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CitygmlResourceFactoryImpl());
		}
		return registrations;
	}

} //CitygmlXMLProcessor
