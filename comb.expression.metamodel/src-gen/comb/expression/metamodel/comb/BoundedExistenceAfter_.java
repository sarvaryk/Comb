/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Existence After </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.BoundedExistenceAfter_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.BoundedExistenceAfter_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceAfter_()
 * @model
 * @generated
 */
public interface BoundedExistenceAfter_ extends BoundedExistneceOneParam {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"F(<Q>) -> (!(<Q>) U (<Q> && (!(<P>) W (<P> W (!(<P>) W (<P> W G(!(<P>))))))))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceAfter__Interpretation()
	 * @model default="F(&lt;Q&gt;) -&gt; (!(&lt;Q&gt;) U (&lt;Q&gt; &amp;&amp; (!(&lt;P&gt;) W (&lt;P&gt; W (!(&lt;P&gt;) W (&lt;P&gt; W G(!(&lt;P&gt;))))))))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> eventually becomes true exactly 2 times after <Q> (the state in which <Q> becomes true is included) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getBoundedExistenceAfter__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; eventually becomes true exactly 2 times after &lt;Q&gt; (the state in which &lt;Q&gt; becomes true is included) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // BoundedExistenceAfter_
