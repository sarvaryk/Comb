/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence Between and </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceBetween_and_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceBetween_and_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceBetween_and_()
 * @model
 * @generated
 */
public interface PrecedenceBetween_and_ extends PrecedenceTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"G((<Q> && F<R>) -> (!<P> U (<S> || <R>)))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceBetween_and__Interpretation()
	 * @model default="G((&lt;Q&gt; &amp;&amp; F&lt;R&gt;) -&gt; (!&lt;P&gt; U (&lt;S&gt; || &lt;R&gt;)))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.PrecedenceBetween_and_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <S> (<S> may not become true) precedes <P> between <Q> and <R>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceBetween_and__Description()
	 * @model default="The expression described by this element becomes true if: &lt;S&gt; (&lt;S&gt; may not become true) precedes &lt;P&gt; between &lt;Q&gt; and &lt;R&gt;" required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // PrecedenceBetween_and_
