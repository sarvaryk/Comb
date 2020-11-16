/**
 */
package comb.expression.metamodel.comb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.Literal#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends BasicElements {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"Signals an occurrence of an event or can be \"TRUE\" if the literal should return always true or \"FALSE\" if the literal should return always false."</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see comb.expression.metamodel.comb.CombPackage#getLiteral_Description()
	 * @model default="Signals an occurrence of an event or can be \"TRUE\" if the literal should return always true or \"FALSE\" if the literal should return always false." required="true" changeable="false"
	 * @generated
	 */
	String getDescription();

} // Literal
