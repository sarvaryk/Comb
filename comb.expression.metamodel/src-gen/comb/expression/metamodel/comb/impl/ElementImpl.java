/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.Element;
import comb.expression.metamodel.comb.Literal;
import comb.expression.metamodel.comb.LogicGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.ElementImpl#getSubtreeInterpretation <em>Subtree Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.ElementImpl#getLogicGroup <em>Logic Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * 
	 * 
	 * @generated NOT
	 */
	public Element getP() {
		return null;
	}

	/**
	 * 
	 * 
	 * @generated NOT
	 */
	public Element getQ() {
		return null;
	}

	/**
	 * 
	 * 
	 * @generated NOT
	 */
	public Element getR() {
		return null;
	}

	/**
	 * 
	 * 
	 * @generated NOT
	 */
	public Element getS() {
		return null;
	}

	/**
	 * 
	 * 
	 * @generated NOT
	 */
	public Literal getH() {
		return null;
	}

	/**
	 * 
	 * 
	 * @generated NOT
	 */
	public Literal getL() {
		return null;
	}

	/**
	 * 
	 * 
	 * @generated NOT
	 */
	public String getInterpretation() {
		return null;
	}

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtreeInterpretation() <em>Subtree Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtreeInterpretation()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTREE_INTERPRETATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtreeInterpretation() <em>Subtree Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtreeInterpretation()
	 * @generated
	 * @ordered
	 */
	protected String subtreeInterpretation = SUBTREE_INTERPRETATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicGroup() <em>Logic Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicGroup()
	 * @generated
	 * @ordered
	 */
	protected static final LogicGroup LOGIC_GROUP_EDEFAULT = LogicGroup.LTL;

	/**
	 * The cached value of the '{@link #getLogicGroup() <em>Logic Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicGroup()
	 * @generated
	 * @ordered
	 */
	protected LogicGroup logicGroup = LOGIC_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubtreeInterpretation() {
		return subtreeInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtreeInterpretation(String newSubtreeInterpretation) {
		String oldSubtreeInterpretation = subtreeInterpretation;
		subtreeInterpretation = newSubtreeInterpretation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.ELEMENT__SUBTREE_INTERPRETATION,
					oldSubtreeInterpretation, subtreeInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicGroup getLogicGroup() {
		return logicGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicGroup(LogicGroup newLogicGroup) {
		LogicGroup oldLogicGroup = logicGroup;
		logicGroup = newLogicGroup == null ? LOGIC_GROUP_EDEFAULT : newLogicGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.ELEMENT__LOGIC_GROUP, oldLogicGroup,
					logicGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CombPackage.ELEMENT__NAME:
			return getName();
		case CombPackage.ELEMENT__SUBTREE_INTERPRETATION:
			return getSubtreeInterpretation();
		case CombPackage.ELEMENT__LOGIC_GROUP:
			return getLogicGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CombPackage.ELEMENT__NAME:
			setName((String) newValue);
			return;
		case CombPackage.ELEMENT__SUBTREE_INTERPRETATION:
			setSubtreeInterpretation((String) newValue);
			return;
		case CombPackage.ELEMENT__LOGIC_GROUP:
			setLogicGroup((LogicGroup) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CombPackage.ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CombPackage.ELEMENT__SUBTREE_INTERPRETATION:
			setSubtreeInterpretation(SUBTREE_INTERPRETATION_EDEFAULT);
			return;
		case CombPackage.ELEMENT__LOGIC_GROUP:
			setLogicGroup(LOGIC_GROUP_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CombPackage.ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CombPackage.ELEMENT__SUBTREE_INTERPRETATION:
			return SUBTREE_INTERPRETATION_EDEFAULT == null ? subtreeInterpretation != null
					: !SUBTREE_INTERPRETATION_EDEFAULT.equals(subtreeInterpretation);
		case CombPackage.ELEMENT__LOGIC_GROUP:
			return logicGroup != LOGIC_GROUP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", subtreeInterpretation: ");
		result.append(subtreeInterpretation);
		result.append(", logicGroup: ");
		result.append(logicGroup);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
