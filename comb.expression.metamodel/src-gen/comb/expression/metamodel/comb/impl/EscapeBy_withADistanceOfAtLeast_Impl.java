/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.EscapeBy_withADistanceOfAtLeast_;
import comb.expression.metamodel.comb.Literal;
import comb.expression.metamodel.comb.Spatial;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escape By with ADistance Of At Least </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl.EscapeBy_withADistanceOfAtLeast_Impl#getD <em>D</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.EscapeBy_withADistanceOfAtLeast_Impl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.EscapeBy_withADistanceOfAtLeast_Impl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EscapeBy_withADistanceOfAtLeast_Impl extends STRELOperatorOneParamImpl
		implements EscapeBy_withADistanceOfAtLeast_ {
	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected Literal d;

	/**
	 * The default value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETATION_EDEFAULT = "E[<dist>] <P>";

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
	protected static final String DESCRIPTION_EDEFAULT = "The expression described by this element becomes true if: there exists a route through locations satisfying <P> (with a lentgth >= <dist>)";

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
	protected EscapeBy_withADistanceOfAtLeast_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetD(Literal newD, NotificationChain msgs) {
		Literal oldD = d;
		d = newD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D, oldD, newD);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setD(Literal newD) {
		if (newD != d) {
			NotificationChain msgs = null;
			if (d != null)
				msgs = ((InternalEObject) d).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D, null, msgs);
			if (newD != null)
				msgs = ((InternalEObject) newD).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D, null, msgs);
			msgs = basicSetD(newD, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D,
					newD, newD));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___INTERPRETATION, oldInterpretation,
					interpretation));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D:
			return basicSetD(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D:
			return getD();
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___INTERPRETATION:
			return getInterpretation();
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___DESCRIPTION:
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
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D:
			setD((Literal) newValue);
			return;
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___INTERPRETATION:
			setInterpretation((String) newValue);
			return;
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___DESCRIPTION:
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
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D:
			setD((Literal) null);
			return;
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___INTERPRETATION:
			setInterpretation(INTERPRETATION_EDEFAULT);
			return;
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___DESCRIPTION:
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
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D:
			return d != null;
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___INTERPRETATION:
			return INTERPRETATION_EDEFAULT == null ? interpretation != null
					: !INTERPRETATION_EDEFAULT.equals(interpretation);
		case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___DESCRIPTION:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Spatial.class) {
			switch (derivedFeatureID) {
			case CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D:
				return CombPackage.SPATIAL__D;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Spatial.class) {
			switch (baseFeatureID) {
			case CombPackage.SPATIAL__D:
				return CombPackage.ESCAPE_BY_WITH_ADISTANCE_OF_AT_LEAST___D;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //EscapeBy_withADistanceOfAtLeast_Impl
