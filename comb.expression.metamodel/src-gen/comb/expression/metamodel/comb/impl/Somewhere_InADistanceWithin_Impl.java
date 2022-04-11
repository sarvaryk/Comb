/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.Literal;
import comb.expression.metamodel.comb.Somewhere_InADistanceWithin_;
import comb.expression.metamodel.comb.Spatial;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Somewhere In ADistance Within </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl.Somewhere_InADistanceWithin_Impl#getD <em>D</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.Somewhere_InADistanceWithin_Impl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.Somewhere_InADistanceWithin_Impl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Somewhere_InADistanceWithin_Impl extends SSTLOperatorOneParamImpl implements Somewhere_InADistanceWithin_ {
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
	protected static final String INTERPRETATION_EDEFAULT = "SO[<dist>] <P>";

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
	protected static final String DESCRIPTION_EDEFAULT = "The expression described by this element becomes true if: there exists a route (with a lentgth <= <dist>) to a location which satisfies <P>";

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
	protected Somewhere_InADistanceWithin_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals.SOMEWHERE_IN_ADISTANCE_WITHIN_;
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
					CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D, oldD, newD);
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
						EOPPOSITE_FEATURE_BASE - CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D, null, msgs);
			if (newD != null)
				msgs = ((InternalEObject) newD).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D, null, msgs);
			msgs = basicSetD(newD, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D, newD,
					newD));
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
					CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___INTERPRETATION, oldInterpretation, interpretation));
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
					CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D:
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
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D:
			return getD();
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___INTERPRETATION:
			return getInterpretation();
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___DESCRIPTION:
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
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D:
			setD((Literal) newValue);
			return;
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___INTERPRETATION:
			setInterpretation((String) newValue);
			return;
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___DESCRIPTION:
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
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D:
			setD((Literal) null);
			return;
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___INTERPRETATION:
			setInterpretation(INTERPRETATION_EDEFAULT);
			return;
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___DESCRIPTION:
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
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D:
			return d != null;
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___INTERPRETATION:
			return INTERPRETATION_EDEFAULT == null ? interpretation != null
					: !INTERPRETATION_EDEFAULT.equals(interpretation);
		case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___DESCRIPTION:
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
			case CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D:
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
				return CombPackage.SOMEWHERE_IN_ADISTANCE_WITHIN___D;
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

} //Somewhere_InADistanceWithin_Impl
