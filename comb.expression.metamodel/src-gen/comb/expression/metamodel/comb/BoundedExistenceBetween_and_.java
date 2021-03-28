/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Existence Between and </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.BoundedExistenceBetween_and_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.BoundedExistenceBetween_and_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceBetween_and_()
 * @model
 * @generated
 */
public interface BoundedExistenceBetween_and_ extends BoundedExistenceTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"G((<Q> && F(<R>)) -> ((!(<P>) && !(<R>)) U (<R> || ((<P> && !(<R>)) U (<R> || ((!(<P>) && !(<R>)) U (<R> || ((<P> && !(<R>)) U (<R> || (!(<P>) U <R>))))))))))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceBetween_and__Interpretation()
	 * @model default="G((&lt;Q&gt; &amp;&amp; F(&lt;R&gt;)) -&gt; ((!(&lt;P&gt;) &amp;&amp; !(&lt;R&gt;)) U (&lt;R&gt; || ((&lt;P&gt; &amp;&amp; !(&lt;R&gt;)) U (&lt;R&gt; || ((!(&lt;P&gt;) &amp;&amp; !(&lt;R&gt;)) U (&lt;R&gt; || ((&lt;P&gt; &amp;&amp; !(&lt;R&gt;)) U (&lt;R&gt; || (!(&lt;P&gt;) U &lt;R&gt;))))))))))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.BoundedExistenceBetween_and_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> eventually becomes true exactly 2 times between <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceBetween_and__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; eventually becomes true exactly 2 times between &lt;Q&gt; (the state in which &lt;Q&gt; becomes true is included) and &lt;R&gt; (the state in which &lt;R&gt; becomes true is excluded) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // BoundedExistenceBetween_and_
