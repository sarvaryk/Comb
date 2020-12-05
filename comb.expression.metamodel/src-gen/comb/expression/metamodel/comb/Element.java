/**
 */
package comb.expression.metamodel.comb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.Element#getName <em>Name</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.Element#getSubtreeInterpretation <em>Subtree Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.Element#getLogicGroup <em>Logic Group</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subtree Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtree Interpretation</em>' attribute.
	 * @see #setSubtreeInterpretation(String)
	 * @see comb.expression.metamodel.comb.CombPackage#getElement_SubtreeInterpretation()
	 * @model required="true"
	 * @generated
	 */
	String getSubtreeInterpretation();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Element#getSubtreeInterpretation <em>Subtree Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtree Interpretation</em>' attribute.
	 * @see #getSubtreeInterpretation()
	 * @generated
	 */
	void setSubtreeInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Logic Group</b></em>' attribute.
	 * The default value is <code>"LTL"</code>.
	 * The literals are from the enumeration {@link comb.expression.metamodel.comb.LogicGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Group</em>' attribute.
	 * @see comb.expression.metamodel.comb.LogicGroup
	 * @see #setLogicGroup(LogicGroup)
	 * @see comb.expression.metamodel.comb.CombPackage#getElement_LogicGroup()
	 * @model default="LTL" required="true"
	 * @generated
	 */
	LogicGroup getLogicGroup();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Element#getLogicGroup <em>Logic Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic Group</em>' attribute.
	 * @see comb.expression.metamodel.comb.LogicGroup
	 * @see #getLogicGroup()
	 * @generated
	 */
	void setLogicGroup(LogicGroup value);

} // Element
