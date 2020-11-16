/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LTL Operators Two Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.LTLOperatorsTwoParams#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getLTLOperatorsTwoParams()
 * @model abstract="true"
 * @generated
 */
public interface LTLOperatorsTwoParams extends LTLOperators {
	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference.
	 * @see #setQ(Element)
	 * @see comb.expression.metamodel.comb.CombPackage#getLTLOperatorsTwoParams_Q()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getQ();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.LTLOperatorsTwoParams#getQ <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' containment reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Element value);

} // LTLOperatorsTwoParams
