/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence After until </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceAfter_until_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceAfter_until_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceAfter_until_()
 * @model
 * @generated
 */
public interface PrecedenceAfter_until_ extends PrecedenceTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"G(<Q> -> ((!<P> U (<S> || <R>)) || G!<P>))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceAfter_until__Interpretation()
	 * @model default="G(&lt;Q&gt; -&gt; ((!&lt;P&gt; U (&lt;S&gt; || &lt;R&gt;)) || G!&lt;P&gt;))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.PrecedenceAfter_until_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: after <Q>, <S> (<S> may not become true) must precede <P> until <R> becomes true in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceAfter_until__Description()
	 * @model default="The expression described by this element becomes true if: after &lt;Q&gt;, &lt;S&gt; (&lt;S&gt; may not become true) must precede &lt;P&gt; until &lt;R&gt; becomes true in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // PrecedenceAfter_until_
