/**
 */
package comb.expression.metamodel.comb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Supported Output</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see comb.expression.metamodel.comb.CombPackage#getSupportedOutput()
 * @model
 * @generated
 */
public enum SupportedOutput implements Enumerator {
	/**
	 * The '<em><b>Comb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMB_VALUE
	 * @generated
	 * @ordered
	 */
	COMB(0, "Comb", "Comb"),

	/**
	 * The '<em><b>Spot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOT_VALUE
	 * @generated
	 * @ordered
	 */
	SPOT(1, "Spot", "Spot"),

	/**
	 * The '<em><b>Uppaal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPAAL_VALUE
	 * @generated
	 * @ordered
	 */
	UPPAAL(2, "Uppaal", "Uppaal"),

	/**
	 * The '<em><b>Nu SMV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NU_SMV_VALUE
	 * @generated
	 * @ordered
	 */
	NU_SMV(3, "NuSMV", "NuSMV"),

	/**
	 * The '<em><b>Spin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIN_VALUE
	 * @generated
	 * @ordered
	 */
	SPIN(4, "Spin", "Spin");

	/**
	 * The '<em><b>Comb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMB
	 * @model name="Comb"
	 * @generated
	 * @ordered
	 */
	public static final int COMB_VALUE = 0;

	/**
	 * The '<em><b>Spot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOT
	 * @model name="Spot"
	 * @generated
	 * @ordered
	 */
	public static final int SPOT_VALUE = 1;

	/**
	 * The '<em><b>Uppaal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPAAL
	 * @model name="Uppaal"
	 * @generated
	 * @ordered
	 */
	public static final int UPPAAL_VALUE = 2;

	/**
	 * The '<em><b>Nu SMV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NU_SMV
	 * @model name="NuSMV"
	 * @generated
	 * @ordered
	 */
	public static final int NU_SMV_VALUE = 3;

	/**
	 * The '<em><b>Spin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPIN
	 * @model name="Spin"
	 * @generated
	 * @ordered
	 */
	public static final int SPIN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Supported Output</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SupportedOutput[] VALUES_ARRAY = new SupportedOutput[] { COMB, SPOT, UPPAAL, NU_SMV, SPIN, };

	/**
	 * A public read-only list of all the '<em><b>Supported Output</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SupportedOutput> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Supported Output</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SupportedOutput get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SupportedOutput result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supported Output</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SupportedOutput getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SupportedOutput result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Supported Output</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SupportedOutput get(int value) {
		switch (value) {
		case COMB_VALUE:
			return COMB;
		case SPOT_VALUE:
			return SPOT;
		case UPPAAL_VALUE:
			return UPPAAL;
		case NU_SMV_VALUE:
			return NU_SMV;
		case SPIN_VALUE:
			return SPIN;
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
	private SupportedOutput(int value, String name, String literal) {
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

} //SupportedOutput
