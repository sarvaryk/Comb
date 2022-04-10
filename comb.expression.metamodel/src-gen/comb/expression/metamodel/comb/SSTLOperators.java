/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SSTL Operators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.SSTLOperators#getP <em>P</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getSSTLOperators()
 * @model abstract="true"
 * @generated
 */
public interface SSTLOperators extends Element {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(Element)
	 * @see comb.expression.metamodel.comb.CombPackage#getSSTLOperators_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getP();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.SSTLOperators#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(Element value);

} // SSTLOperators
