/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eventually Within </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.EventuallyWithin_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.EventuallyWithin_#getDescription <em>Description</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.EventuallyWithin_#getH <em>H</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getEventuallyWithin_()
 * @model
 * @generated
 */
public interface EventuallyWithin_ extends MTLOperatorsOneParam {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"F[<high>](<P>)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getEventuallyWithin__Interpretation()
	 * @model default="F[&lt;high&gt;](&lt;P&gt;)" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.EventuallyWithin_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> eventually becomes true within <high> time units in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getEventuallyWithin__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; eventually becomes true within &lt;high&gt; time units in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' containment reference.
	 * @see #setH(Literal)
	 * @see comb.expression.metamodel.comb.CombPackage#getEventuallyWithin__H()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getH();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.EventuallyWithin_#getH <em>H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H</em>' containment reference.
	 * @see #getH()
	 * @generated
	 */
	void setH(Literal value);

} // EventuallyWithin_
