/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>less Than </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb._lessThan_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb._lessThan_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#get_lessThan_()
 * @model
 * @generated
 */
public interface _lessThan_ extends Relation {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"<P> < <Q>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#get_lessThan__Interpretation()
	 * @model default="&lt;P&gt; &lt; &lt;Q&gt;" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb._lessThan_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: <P> is less than (<) <Q>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see comb.expression.metamodel.comb.CombPackage#get_lessThan__Description()
	 * @model default="The expression described by this element becomes true if: &lt;P&gt; is less than (&lt;) &lt;Q&gt;" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb._lessThan_#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // _lessThan_
