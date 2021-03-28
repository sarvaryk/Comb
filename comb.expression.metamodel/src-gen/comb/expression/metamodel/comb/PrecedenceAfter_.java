/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precedence After </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceAfter_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.PrecedenceAfter_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceAfter_()
 * @model
 * @generated
 */
public interface PrecedenceAfter_ extends PrecedenceOneParam {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"G(!(<Q>)) || F(<Q> && (!(<P>) U (<S> || G(!(<P>)))))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceAfter__Interpretation()
	 * @model default="G(!(&lt;Q&gt;)) || F(&lt;Q&gt; &amp;&amp; (!(&lt;P&gt;) U (&lt;S&gt; || G(!(&lt;P&gt;)))))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.PrecedenceAfter_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <S> (<S> may not become true) precedes <P> after <Q> (<Q> may not become true)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getPrecedenceAfter__Description()
	 * @model default="The expression described by this element becomes true if: &lt;S&gt; (&lt;S&gt; may not become true) precedes &lt;P&gt; after &lt;Q&gt; (&lt;Q&gt; may not become true)" required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // PrecedenceAfter_
