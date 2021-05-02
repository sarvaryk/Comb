/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>equal </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb._equal_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb._equal_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#get_equal_()
 * @model
 * @generated
 */
public interface _equal_ extends Relation {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"<P> = <Q>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#get_equal__Interpretation()
	 * @model default="&lt;P&gt; = &lt;Q&gt;" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb._equal_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> is less equal to (=) <Q>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see comb.expression.metamodel.comb.CombPackage#get_equal__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; is less equal to (=) &lt;Q&gt;" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb._equal_#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // _equal_
