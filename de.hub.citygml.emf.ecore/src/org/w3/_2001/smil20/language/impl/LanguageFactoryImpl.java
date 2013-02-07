/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3._2001.smil20.language.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.w3._2001.smil20.language.AnimateColorType;
import org.w3._2001.smil20.language.AnimateMotionType;
import org.w3._2001.smil20.language.AnimateType;
import org.w3._2001.smil20.language.DocumentRoot;
import org.w3._2001.smil20.language.LanguageFactory;
import org.w3._2001.smil20.language.LanguagePackage;
import org.w3._2001.smil20.language.SetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageFactoryImpl extends EFactoryImpl implements LanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LanguageFactory init() {
		try {
			LanguageFactory theLanguageFactory = (LanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/2001/SMIL20/Language"); 
			if (theLanguageFactory != null) {
				return theLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LanguagePackage.ANIMATE_COLOR_TYPE: return createAnimateColorType();
			case LanguagePackage.ANIMATE_MOTION_TYPE: return createAnimateMotionType();
			case LanguagePackage.ANIMATE_TYPE: return createAnimateType();
			case LanguagePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case LanguagePackage.SET_TYPE: return createSetType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateColorType createAnimateColorType() {
		AnimateColorTypeImpl animateColorType = new AnimateColorTypeImpl();
		return animateColorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateMotionType createAnimateMotionType() {
		AnimateMotionTypeImpl animateMotionType = new AnimateMotionTypeImpl();
		return animateMotionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimateType createAnimateType() {
		AnimateTypeImpl animateType = new AnimateTypeImpl();
		return animateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguagePackage getLanguagePackage() {
		return (LanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LanguagePackage getPackage() {
		return LanguagePackage.eINSTANCE;
	}

} //LanguageFactoryImpl
