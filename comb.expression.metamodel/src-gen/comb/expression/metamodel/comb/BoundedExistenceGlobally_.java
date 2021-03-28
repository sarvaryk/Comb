/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Existence Globally </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.BoundedExistenceGlobally_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.BoundedExistenceGlobally_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceGlobally_()
 * @model
 * @generated
 */
public interface BoundedExistenceGlobally_ extends BoundedExistenceWithoutParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"(!(<P>) W (<P> W (!(<P>) W (<P> W G(!(<P>))))))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceGlobally__Interpretation()
	 * @model default="(!(&lt;P&gt;) W (&lt;P&gt; W (!(&lt;P&gt;) W (&lt;P&gt; W G(!(&lt;P&gt;))))))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.BoundedExistenceGlobally_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> eventually becomes true exactly 2 times in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceGlobally__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; eventually becomes true exactly 2 times in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // BoundedExistenceGlobally_
