/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.Order#getS <em>S</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getOrder()
 * @model abstract="true"
 * @generated
 */
public interface Order extends LTLPatternMappings {
	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference.
	 * @see #setS(Element)
	 * @see comb.expression.metamodel.comb.CombPackage#getOrder_S()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Element getS();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Order#getS <em>S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' containment reference.
	 * @see #getS()
	 * @generated
	 */
	void setS(Element value);

} // Order
