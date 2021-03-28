/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existence After until </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.ExistenceAfter_until_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.ExistenceAfter_until_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getExistenceAfter_until_()
 * @model
 * @generated
 */
public interface ExistenceAfter_until_ extends ExistenceTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"G(<Q> -> (!(<R>) U <P>))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getExistenceAfter_until__Interpretation()
	 * @model default="G(&lt;Q&gt; -&gt; (!(&lt;R&gt;) U &lt;P&gt;))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.ExistenceAfter_until_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> eventually becomes true after <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded, but <R> may not ever become true) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getExistenceAfter_until__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; eventually becomes true after &lt;Q&gt; (the state in which &lt;Q&gt; becomes true is included) and &lt;R&gt; (the state in which &lt;R&gt; becomes true is excluded, but &lt;R&gt; may not ever become true) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // ExistenceAfter_until_
