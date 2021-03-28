/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absence After until </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.AbsenceAfter_until_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.AbsenceAfter_until_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getAbsenceAfter_until_()
 * @model
 * @generated
 */
public interface AbsenceAfter_until_ extends AbsenceTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"G(<Q> -> !(<P>) U (<R> | G(!(<P>))))"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getAbsenceAfter_until__Interpretation()
	 * @model default="G(&lt;Q&gt; -&gt; !(&lt;P&gt;) U (&lt;R&gt; | G(!(&lt;P&gt;))))" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.AbsenceAfter_until_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> is always false after <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded, but <R> may not ever become true) in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getAbsenceAfter_until__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; is always false after &lt;Q&gt; (the state in which &lt;Q&gt; becomes true is included) and &lt;R&gt; (the state in which &lt;R&gt; becomes true is excluded, but &lt;R&gt; may not ever become true) in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // AbsenceAfter_until_
