/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.Relation#getP <em>P</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.Relation#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends STLOperators {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(Literal)
	 * @see comb.expression.metamodel.comb.CombPackage#getRelation_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getP();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Relation#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(Literal value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference.
	 * @see #setQ(Literal)
	 * @see comb.expression.metamodel.comb.CombPackage#getRelation_Q()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getQ();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Relation#getQ <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' containment reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Literal value);

} // Relation
