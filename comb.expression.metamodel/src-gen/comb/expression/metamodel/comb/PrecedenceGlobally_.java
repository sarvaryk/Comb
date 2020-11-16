/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Globally </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceGlobally_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceGlobally_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceGlobally_()
 * @model
 * @generated
 */
public interface PrecedenceGlobally_ extends PrecedenceWithoutParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"F<P> -> (!<P> U (<S> && !<P>))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceGlobally__Interpretation()
	 * @model default="F&lt;P&gt; -&gt; (!&lt;P&gt; U (&lt;S&gt; &amp;&amp; !&lt;P&gt;))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.PrecedenceGlobally_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <S> always precedes <P> (<P> must eventually become true) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceGlobally__Description()
	 * @model default="The expression described by this element becomes true if: &lt;S&gt; always precedes &lt;P&gt; (&lt;P&gt; must eventually become true) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // PrecedenceGlobally_
