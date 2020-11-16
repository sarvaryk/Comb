/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.EventuallyWithin_and_;
import comb.expression.metamodel.comb.Literal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eventually Within and </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl#getL <em>L</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.EventuallyWithin_and_Impl#getH <em>H</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventuallyWithin_and_Impl extends MITLOperatorsOneParamImpl implements EventuallyWithin_and_ {
	/**
	 * The default value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETATION_EDEFAULT = "F[<low>, <high>](<P>)";

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
	protected static final String DESCRIPTION_EDEFAULT = "The expression described by this element becomes true if: <P> eventually becomes true within <low> and <high> time units in the given sub-expression.";

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
	 * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected Literal l;

	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected Literal h;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventuallyWithin_and_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals.EVENTUALLY_WITHIN_AND_;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.EVENTUALLY_WITHIN_AND___INTERPRETATION,
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
	public Literal getL() {
		return l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetL(Literal newL, NotificationChain msgs) {
		Literal oldL = l;
		l = newL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CombPackage.EVENTUALLY_WITHIN_AND___L, oldL, newL);
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
	public void setL(Literal newL) {
		if (newL != l) {
			NotificationChain msgs = null;
			if (l != null)
				msgs = ((InternalEObject) l).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.EVENTUALLY_WITHIN_AND___L, null, msgs);
			if (newL != null)
				msgs = ((InternalEObject) newL).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.EVENTUALLY_WITHIN_AND___L, null, msgs);
			msgs = basicSetL(newL, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.EVENTUALLY_WITHIN_AND___L, newL, newL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getH() {
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetH(Literal newH, NotificationChain msgs) {
		Literal oldH = h;
		h = newH;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CombPackage.EVENTUALLY_WITHIN_AND___H, oldH, newH);
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
	public void setH(Literal newH) {
		if (newH != h) {
			NotificationChain msgs = null;
			if (h != null)
				msgs = ((InternalEObject) h).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.EVENTUALLY_WITHIN_AND___H, null, msgs);
			if (newH != null)
				msgs = ((InternalEObject) newH).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.EVENTUALLY_WITHIN_AND___H, null, msgs);
			msgs = basicSetH(newH, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.EVENTUALLY_WITHIN_AND___H, newH, newH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CombPackage.EVENTUALLY_WITHIN_AND___L:
			return basicSetL(null, msgs);
		case CombPackage.EVENTUALLY_WITHIN_AND___H:
			return basicSetH(null, msgs);
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
		case CombPackage.EVENTUALLY_WITHIN_AND___INTERPRETATION:
			return getInterpretation();
		case CombPackage.EVENTUALLY_WITHIN_AND___DESCRIPTION:
			return getDescription();
		case CombPackage.EVENTUALLY_WITHIN_AND___L:
			return getL();
		case CombPackage.EVENTUALLY_WITHIN_AND___H:
			return getH();
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
		case CombPackage.EVENTUALLY_WITHIN_AND___INTERPRETATION:
			setInterpretation((String) newValue);
			return;
		case CombPackage.EVENTUALLY_WITHIN_AND___L:
			setL((Literal) newValue);
			return;
		case CombPackage.EVENTUALLY_WITHIN_AND___H:
			setH((Literal) newValue);
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
		case CombPackage.EVENTUALLY_WITHIN_AND___INTERPRETATION:
			setInterpretation(INTERPRETATION_EDEFAULT);
			return;
		case CombPackage.EVENTUALLY_WITHIN_AND___L:
			setL((Literal) null);
			return;
		case CombPackage.EVENTUALLY_WITHIN_AND___H:
			setH((Literal) null);
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
		case CombPackage.EVENTUALLY_WITHIN_AND___INTERPRETATION:
			return INTERPRETATION_EDEFAULT == null ? interpretation != null
					: !INTERPRETATION_EDEFAULT.equals(interpretation);
		case CombPackage.EVENTUALLY_WITHIN_AND___DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CombPackage.EVENTUALLY_WITHIN_AND___L:
			return l != null;
		case CombPackage.EVENTUALLY_WITHIN_AND___H:
			return h != null;
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

} //EventuallyWithin_and_Impl
