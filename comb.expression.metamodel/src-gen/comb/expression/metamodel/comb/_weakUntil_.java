/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>weak Until </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb._weakUntil_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb._weakUntil_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#get_weakUntil_()
 * @model
 * @generated
 */
public interface _weakUntil_ extends LTLOperatorsTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"<P> W <Q>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#get_weakUntil__Interpretation()
	 * @model default="&lt;P&gt; W &lt;Q&gt;" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb._weakUntil_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> is true until <Q> becomes true or <P> stays always true in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#get_weakUntil__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; is true until &lt;Q&gt; becomes true or &lt;P&gt; stays always true in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // _weakUntil_
