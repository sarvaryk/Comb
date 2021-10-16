/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reach by with ADistance Less Than Or Equal To </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.Reach_by_withADistanceLessThanOrEqualTo_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.Reach_by_withADistanceLessThanOrEqualTo_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getReach_by_withADistanceLessThanOrEqualTo_()
 * @model
 * @generated
 */
public interface Reach_by_withADistanceLessThanOrEqualTo_ extends STRELOperatorsTwoParams, Spatial {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"<P> R[<high>] <Q>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getReach_by_withADistanceLessThanOrEqualTo__Interpretation()
	 * @model default="&lt;P&gt; R[&lt;high&gt;] &lt;Q&gt;" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Reach_by_withADistanceLessThanOrEqualTo_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: there exists a route through locations satisfying <P> (with a lentgth <= <high>) to a location which satisfies <Q>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getReach_by_withADistanceLessThanOrEqualTo__Description()
	 * @model default="The expression described by this element becomes true if: there exists a route through locations satisfying &lt;P&gt; (with a lentgth &lt;= &lt;high&gt;) to a location which satisfies &lt;Q&gt;" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Reach_by_withADistanceLessThanOrEqualTo_#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Reach_by_withADistanceLessThanOrEqualTo_
