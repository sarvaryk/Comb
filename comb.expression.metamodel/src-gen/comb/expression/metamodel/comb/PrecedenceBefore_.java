/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Before </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceBefore_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceBefore_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceBefore_()
 * @model
 * @generated
 */
public interface PrecedenceBefore_ extends PrecedenceOneParam {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"F<Q> -> (!<P> U (<S> || <Q>))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceBefore__Interpretation()
	 * @model default="F&lt;Q&gt; -&gt; (!&lt;P&gt; U (&lt;S&gt; || &lt;Q&gt;))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.PrecedenceBefore_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> does not precede <S> (<S> may not become true) before <Q> (<Q> must eventually become true) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceBefore__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; does not precede &lt;S&gt; (&lt;S&gt; may not become true) before &lt;Q&gt; (&lt;Q&gt; must eventually become true) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // PrecedenceBefore_
