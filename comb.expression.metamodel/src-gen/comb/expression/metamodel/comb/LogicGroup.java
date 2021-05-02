/**
 */
package comb.expression.metamodel.comb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Logic Group</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see comb.expression.metamodel.comb.CombPackage#getLogicGroup()
 * @model
 * @generated
 */
public enum LogicGroup implements Enumerator {
	/**
	 * The '<em><b>LITERAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(0, "LITERAL", "LITERAL"),

	/**
	 * The '<em><b>LTL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTL_VALUE
	 * @generated
	 * @ordered
	 */
	LTL(1, "LTL", "LTL"),

	/**
	 * The '<em><b>MTL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTL_VALUE
	 * @generated
	 * @ordered
	 */
	MTL(2, "MTL", "MTL"),

	/**
	 * The '<em><b>MITL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITL_VALUE
	 * @generated
	 * @ordered
	 */
	MITL(3, "MITL", "MITL"),

	/**
	 * The '<em><b>STL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STL_VALUE
	 * @generated
	 * @ordered
	 */
	STL(4, "STL", "STL");

	/**
	 * The '<em><b>LITERAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 0;

	/**
	 * The '<em><b>LTL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LTL_VALUE = 1;

	/**
	 * The '<em><b>MTL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MTL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MTL_VALUE = 2;

	/**
	 * The '<em><b>MITL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITL_VALUE = 3;

	/**
	 * The '<em><b>STL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Logic Group</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LogicGroup[] VALUES_ARRAY = new LogicGroup[] { LITERAL, LTL, MTL, MITL, STL, };

	/**
	 * A public read-only list of all the '<em><b>Logic Group</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LogicGroup> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Logic Group</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicGroup get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogicGroup result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logic Group</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicGroup getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogicGroup result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Logic Group</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogicGroup get(int value) {
		switch (value) {
		case LITERAL_VALUE:
			return LITERAL;
		case LTL_VALUE:
			return LTL;
		case MTL_VALUE:
			return MTL;
		case MITL_VALUE:
			return MITL;
		case STL_VALUE:
			return STL;
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
	private LogicGroup(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //LogicGroup
