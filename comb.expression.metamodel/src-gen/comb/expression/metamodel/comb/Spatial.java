/**
 */
package comb.expression.metamodel.comb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.Spatial#getD <em>D</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getSpatial()
 * @model abstract="true"
 * @generated
 */
public interface Spatial extends EObject {
	/**
	 * Returns the value of the '<em><b>D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' containment reference.
	 * @see #setD(Literal)
	 * @see comb.expression.metamodel.comb.CombPackage#getSpatial_D()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getD();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Spatial#getD <em>D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' containment reference.
	 * @see #getD()
	 * @generated
	 */
	void setD(Literal value);

} // Spatial
