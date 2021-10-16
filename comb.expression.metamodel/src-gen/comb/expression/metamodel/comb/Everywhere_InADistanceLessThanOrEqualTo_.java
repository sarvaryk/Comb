/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Everywhere In ADistance Less Than Or Equal To </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.Everywhere_InADistanceLessThanOrEqualTo_#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.Everywhere_InADistanceLessThanOrEqualTo_#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getEverywhere_InADistanceLessThanOrEqualTo_()
 * @model
 * @generated
 */
public interface Everywhere_InADistanceLessThanOrEqualTo_ extends STRELOperatorOneParam, Spatial {
	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The default value is <code>"EV[<high>] <P>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getEverywhere_InADistanceLessThanOrEqualTo__Interpretation()
	 * @model default="EV[&lt;high&gt;] &lt;P&gt;" required="true"
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Everywhere_InADistanceLessThanOrEqualTo_#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"The expression described by this element becomes true if: there exists a location, from which every location (in a distance of <= <high>) satisfy <P>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getEverywhere_InADistanceLessThanOrEqualTo__Description()
	 * @model default="The expression described by this element becomes true if: there exists a location, from which every location (in a distance of &lt;= &lt;high&gt;) satisfy &lt;P&gt;" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Everywhere_InADistanceLessThanOrEqualTo_#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Everywhere_InADistanceLessThanOrEqualTo_
