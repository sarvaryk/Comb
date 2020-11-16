/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>until Within and 2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb._untilWithin_and_2#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb._untilWithin_and_2#getDescription <em>Description</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb._untilWithin_and_2#getL <em>L</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb._untilWithin_and_2#getH <em>H</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#get_untilWithin_and_2()
 * @model
 * @generated
 */
public interface _untilWithin_and_2 extends MITLOperatorsTwoParams {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"<P> U[<low>, <high>] <Q>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#get_untilWithin_and_2_Interpretation()
	 * @model default="&lt;P&gt; U[&lt;low&gt;, &lt;high&gt;] &lt;Q&gt;" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb._untilWithin_and_2#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> is true until <Q> becomes true between <low> and <high> timeunits in the given sub-expression."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#get_untilWithin_and_2_Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; is true until &lt;Q&gt; becomes true between &lt;low&gt; and &lt;high&gt; timeunits in the given sub-expression." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' containment reference.
	 * @see #setL(Literal)
	 * @see comb.expression.metamodel.comb.CombPackage#get_untilWithin_and_2_L()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getL();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb._untilWithin_and_2#getL <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' containment reference.
	 * @see #getL()
	 * @generated
	 */
	void setL(Literal value);

	/**
	 * Returns the value of the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' containment reference.
	 * @see #setH(Literal)
	 * @see comb.expression.metamodel.comb.CombPackage#get_untilWithin_and_2_H()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getH();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb._untilWithin_and_2#getH <em>H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H</em>' containment reference.
	 * @see #getH()
	 * @generated
	 */
	void setH(Literal value);

} // _untilWithin_and_2
