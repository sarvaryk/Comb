/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Existence Before </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.ExistenceBefore_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.ExistenceBefore_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getExistenceBefore_()
 * @model
 * @generated
 */
public interface ExistenceBefore_ extends ExistneceOneParam {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"F<Q> -> (!<Q> U <P>)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getExistenceBefore__Interpretation()
	 * @model default="F&lt;Q&gt; -&gt; (!&lt;Q&gt; U &lt;P&gt;)" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.ExistenceBefore_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> eventually becomes true before <Q> (the state in which <Q> becomes true is excluded, but <Q> must eventually become true) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getExistenceBefore__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; eventually becomes true before &lt;Q&gt; (the state in which &lt;Q&gt; becomes true is excluded, but &lt;Q&gt; must eventually become true) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // ExistenceBefore_
