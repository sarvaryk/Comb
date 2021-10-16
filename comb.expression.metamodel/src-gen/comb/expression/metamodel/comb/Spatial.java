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
 *   <li>{@link comb.expression.metamodel.comb.Spatial#getH <em>H</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.Spatial#getL <em>L</em>}</li>
 * </ul>
 *
 * @see comb.expression.metamodel.comb.CombPackage#getSpatial()
 * @model abstract="true"
 * @generated
 */
public interface Spatial extends EObject {
	/**
	 * Returns the value of the '<em><b>H</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' containment reference.
	 * @see #setH(Literal)
	 * @see comb.expression.metamodel.comb.CombPackage#getSpatial_H()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getH();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Spatial#getH <em>H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H</em>' containment reference.
	 * @see #getH()
	 * @generated
	 */
	void setH(Literal value);

	/**
	 * Returns the value of the '<em><b>L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L</em>' containment reference.
	 * @see #setL(Literal)
	 * @see comb.expression.metamodel.comb.CombPackage#getSpatial_L()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getL();

	/**
	 * Sets the value of the '{@link comb.expression.metamodel.comb.Spatial#getL <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L</em>' containment reference.
	 * @see #getL()
	 * @generated
	 */
	void setL(Literal value);

} // Spatial
