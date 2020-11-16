/**
 */
package comb.expression.metamodel.comb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.Expression#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link comb.expression.metamodel.comb.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see comb.expression.metamodel.comb.CombPackage#getExpression_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElement();

} // Expression
