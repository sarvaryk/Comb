/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.Element;
import comb.expression.metamodel.comb.PrecedenceOneParam;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precedence One Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl.PrecedenceOneParamImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PrecedenceOneParamImpl extends PrecedenceImpl implements PrecedenceOneParam {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrecedenceOneParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals.PRECEDENCE_ONE_PARAM;
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
					CombPackage.PRECEDENCE_ONE_PARAM__Q, oldQ, newQ);
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
						EOPPOSITE_FEATURE_BASE - CombPackage.PRECEDENCE_ONE_PARAM__Q, null, msgs);
			if (newQ != null)
				msgs = ((InternalEObject) newQ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CombPackage.PRECEDENCE_ONE_PARAM__Q, null, msgs);
			msgs = basicSetQ(newQ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.PRECEDENCE_ONE_PARAM__Q, newQ, newQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CombPackage.PRECEDENCE_ONE_PARAM__Q:
			return basicSetQ(null, msgs);
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
		case CombPackage.PRECEDENCE_ONE_PARAM__Q:
			return getQ();
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
		case CombPackage.PRECEDENCE_ONE_PARAM__Q:
			setQ((Element) newValue);
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
		case CombPackage.PRECEDENCE_ONE_PARAM__Q:
			setQ((Element) null);
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
		case CombPackage.PRECEDENCE_ONE_PARAM__Q:
			return q != null;
		}
		return super.eIsSet(featureID);
	}

} //PrecedenceOneParamImpl
