/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existence Between and </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.ExistenceBetween_and_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.ExistenceBetween_and_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getExistenceBetween_and_()
 * @model
 * @generated
 */
public interface ExistenceBetween_and_ extends ExistenceTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"G((<Q> && F<R>) -> (!<R> U <P>))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getExistenceBetween_and__Interpretation()
	 * @model default="G((&lt;Q&gt; &amp;&amp; F&lt;R&gt;) -&gt; (!&lt;R&gt; U &lt;P&gt;))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.ExistenceBetween_and_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> eventually becomes true between <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getExistenceBetween_and__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; eventually becomes true between &lt;Q&gt; (the state in which &lt;Q&gt; becomes true is included) and &lt;R&gt; (the state in which &lt;R&gt; becomes true is excluded) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // ExistenceBetween_and_
