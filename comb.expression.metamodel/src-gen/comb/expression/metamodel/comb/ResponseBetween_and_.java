/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Between and </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.ResponseBetween_and_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.ResponseBetween_and_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getResponseBetween_and_()
 * @model
 * @generated
 */
public interface ResponseBetween_and_ extends ResponseTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"G((<Q> && F(<R>)) -> (<P> -> (!(<R>) U <S>)) U <R>)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getResponseBetween_and__Interpretation()
	 * @model default="G((&lt;Q&gt; &amp;&amp; F(&lt;R&gt;)) -&gt; (&lt;P&gt; -&gt; (!(&lt;R&gt;) U &lt;S&gt;)) U &lt;R&gt;)" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.ResponseBetween_and_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> becomes true and <S> becomes true too between <Q> and <R>in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getResponseBetween_and__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; becomes true and &lt;S&gt; becomes true too between &lt;Q&gt; and &lt;R&gt;in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // ResponseBetween_and_
