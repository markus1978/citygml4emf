/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oasis.xAL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Number Range Occurrence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.oasis.xAL.XALPackage#getNumberRangeOccurrenceType()
 * @model extendedMetaData="name='NumberRangeOccurrence_._type'"
 * @generated
 */
public enum NumberRangeOccurrenceType implements Enumerator {
	/**
	 * The '<em><b>Before Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_NAME(0, "BeforeName", "BeforeName"),

	/**
	 * The '<em><b>After Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_NAME(1, "AfterName", "AfterName"),

	/**
	 * The '<em><b>Before Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE_TYPE(2, "BeforeType", "BeforeType"),

	/**
	 * The '<em><b>After Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER_TYPE(3, "AfterType", "AfterType");

	/**
	 * The '<em><b>Before Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_NAME
	 * @model name="BeforeName"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_NAME_VALUE = 0;

	/**
	 * The '<em><b>After Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After Name</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_NAME
	 * @model name="AfterName"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_NAME_VALUE = 1;

	/**
	 * The '<em><b>Before Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Before Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEFORE_TYPE
	 * @model name="BeforeType"
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_TYPE_VALUE = 2;

	/**
	 * The '<em><b>After Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>After Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFTER_TYPE
	 * @model name="AfterType"
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_TYPE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Number Range Occurrence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NumberRangeOccurrenceType[] VALUES_ARRAY =
		new NumberRangeOccurrenceType[] {
			BEFORE_NAME,
			AFTER_NAME,
			BEFORE_TYPE,
			AFTER_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Number Range Occurrence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NumberRangeOccurrenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Number Range Occurrence Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumberRangeOccurrenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumberRangeOccurrenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Number Range Occurrence Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumberRangeOccurrenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumberRangeOccurrenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Number Range Occurrence Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumberRangeOccurrenceType get(int value) {
		switch (value) {
			case BEFORE_NAME_VALUE: return BEFORE_NAME;
			case AFTER_NAME_VALUE: return AFTER_NAME;
			case BEFORE_TYPE_VALUE: return BEFORE_TYPE;
			case AFTER_TYPE_VALUE: return AFTER_TYPE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NumberRangeOccurrenceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NumberRangeOccurrenceType
