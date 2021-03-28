/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Before </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.ResponseBefore_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.ResponseBefore_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getResponseBefore_()
 * @model
 * @generated
 */
public interface ResponseBefore_ extends ResponseOneParam {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"(<P> -> (!(<Q>) U <S>)) U (<Q> || G(!(<Q>)))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getResponseBefore__Interpretation()
	 * @model default="(&lt;P&gt; -&gt; (!(&lt;Q&gt;) U &lt;S&gt;)) U (&lt;Q&gt; || G(!(&lt;Q&gt;)))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.ResponseBefore_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> becomes true and <S> becomes true too before <Q> (<Q> may not become true) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getResponseBefore__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; becomes true and &lt;S&gt; becomes true too before &lt;Q&gt; (&lt;Q&gt; may not become true) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // ResponseBefore_
