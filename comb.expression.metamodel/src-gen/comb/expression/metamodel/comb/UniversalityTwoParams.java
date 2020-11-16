/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universality Two Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.UniversalityTwoParams#getQ <em>Q</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.UniversalityTwoParams#getR <em>R</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getUniversalityTwoParams()
 * @model abstract="true"
 * @generated
 */
public interface UniversalityTwoParams extends Universality {
	/**
	 * Returns the value of the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' containment reference.
	 * @see #setR(Element)
	 * @see comb.expression.metamodel.comb.CombPackage#getUniversalityTwoParams_R()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getR();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.UniversalityTwoParams#getR <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' containment reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(Element value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference.
	 * @see #setQ(Element)
	 * @see comb.expression.metamodel.comb.CombPackage#getUniversalityTwoParams_Q()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getQ();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.UniversalityTwoParams#getQ <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' containment reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Element value);

} // UniversalityTwoParams
