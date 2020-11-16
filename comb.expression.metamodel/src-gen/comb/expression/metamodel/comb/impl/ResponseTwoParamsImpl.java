/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.Element;
import comb.expression.metamodel.comb.ResponseTwoParams;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Two Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl.ResponseTwoParamsImpl#getQ <em>Q</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.ResponseTwoParamsImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResponseTwoParamsImpl extends ResponseImpl implements ResponseTwoParams {
	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected Element q;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected Element r;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseTwoParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals.RESPONSE_TWO_PARAMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetR(Element newR, NotificationChain msgs) {
		Element oldR = r;
		r = newR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CombPackage.RESPONSE_TWO_PARAMS__R, oldR, newR);
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
	public void setR(Element newR) {
		if (newR != r) {
			NotificationChain msgs = null;
			if (r != null)
				msgs = ((InternalEObject) r).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.RESPONSE_TWO_PARAMS__R, null, msgs);
			if (newR != null)
				msgs = ((InternalEObject) newR).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.RESPONSE_TWO_PARAMS__R, null, msgs);
			msgs = basicSetR(newR, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.RESPONSE_TWO_PARAMS__R, newR, newR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CombPackage.RESPONSE_TWO_PARAMS__Q:
			return basicSetQ(null, msgs);
		case CombPackage.RESPONSE_TWO_PARAMS__R:
			return basicSetR(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ(Element newQ, NotificationChain msgs) {
		Element oldQ = q;
		q = newQ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CombPackage.RESPONSE_TWO_PARAMS__Q, oldQ, newQ);
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
	public void setQ(Element newQ) {
		if (newQ != q) {
			NotificationChain msgs = null;
			if (q != null)
				msgs = ((InternalEObject) q).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.RESPONSE_TWO_PARAMS__Q, null, msgs);
			if (newQ != null)
				msgs = ((InternalEObject) newQ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.RESPONSE_TWO_PARAMS__Q, null, msgs);
			msgs = basicSetQ(newQ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.RESPONSE_TWO_PARAMS__Q, newQ, newQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CombPackage.RESPONSE_TWO_PARAMS__Q:
			return getQ();
		case CombPackage.RESPONSE_TWO_PARAMS__R:
			return getR();
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
		case CombPackage.RESPONSE_TWO_PARAMS__Q:
			setQ((Element) newValue);
			return;
		case CombPackage.RESPONSE_TWO_PARAMS__R:
			setR((Element) newValue);
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
		case CombPackage.RESPONSE_TWO_PARAMS__Q:
			setQ((Element) null);
			return;
		case CombPackage.RESPONSE_TWO_PARAMS__R:
			setR((Element) null);
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
		case CombPackage.RESPONSE_TWO_PARAMS__Q:
			return q != null;
		case CombPackage.RESPONSE_TWO_PARAMS__R:
			return r != null;
		}
		return super.eIsSet(featureID);
	}

} //ResponseTwoParamsImpl
