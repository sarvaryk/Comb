/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb._lessThan_;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>less Than </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl._lessThan_Impl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl._lessThan_Impl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class _lessThan_Impl extends RelationImpl implements _lessThan_ {
	/**
	 * The default value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETATION_EDEFAULT = "<P> < <Q>";

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected String interpretation = INTERPRETATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "The expression described by this element becomes true if: <P> is less than (<) <Q>";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _lessThan_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals._LESS_THAN_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpretation(String newInterpretation) {
		String oldInterpretation = interpretation;
		interpretation = newInterpretation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage._LESS_THAN___INTERPRETATION,
					oldInterpretation, interpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage._LESS_THAN___DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CombPackage._LESS_THAN___INTERPRETATION:
			return getInterpretation();
		case CombPackage._LESS_THAN___DESCRIPTION:
			return getDescription();
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
		case CombPackage._LESS_THAN___INTERPRETATION:
			setInterpretation((String) newValue);
			return;
		case CombPackage._LESS_THAN___DESCRIPTION:
			setDescription((String) newValue);
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
		case CombPackage._LESS_THAN___INTERPRETATION:
			setInterpretation(INTERPRETATION_EDEFAULT);
			return;
		case CombPackage._LESS_THAN___DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case CombPackage._LESS_THAN___INTERPRETATION:
			return INTERPRETATION_EDEFAULT == null ? interpretation != null
					: !INTERPRETATION_EDEFAULT.equals(interpretation);
		case CombPackage._LESS_THAN___DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (interpretation: ");
		result.append(interpretation);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //_lessThan_Impl
