/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.Literal;
import comb.expression.metamodel.comb.Relation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl.RelationImpl#getP <em>P</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.RelationImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationImpl extends STLOperatorsImpl implements Relation {
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected Literal p;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected Literal q;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(Literal newP, NotificationChain msgs) {
		Literal oldP = p;
		p = newP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CombPackage.RELATION__P,
					oldP, newP);
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
	public void setP(Literal newP) {
		if (newP != p) {
			NotificationChain msgs = null;
			if (p != null)
				msgs = ((InternalEObject) p).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CombPackage.RELATION__P,
						null, msgs);
			if (newP != null)
				msgs = ((InternalEObject) newP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CombPackage.RELATION__P,
						null, msgs);
			msgs = basicSetP(newP, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.RELATION__P, newP, newP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ(Literal newQ, NotificationChain msgs) {
		Literal oldQ = q;
		q = newQ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CombPackage.RELATION__Q,
					oldQ, newQ);
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
	public void setQ(Literal newQ) {
		if (newQ != q) {
			NotificationChain msgs = null;
			if (q != null)
				msgs = ((InternalEObject) q).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CombPackage.RELATION__Q,
						null, msgs);
			if (newQ != null)
				msgs = ((InternalEObject) newQ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CombPackage.RELATION__Q,
						null, msgs);
			msgs = basicSetQ(newQ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.RELATION__Q, newQ, newQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CombPackage.RELATION__P:
			return basicSetP(null, msgs);
		case CombPackage.RELATION__Q:
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
		case CombPackage.RELATION__P:
			return getP();
		case CombPackage.RELATION__Q:
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
		case CombPackage.RELATION__P:
			setP((Literal) newValue);
			return;
		case CombPackage.RELATION__Q:
			setQ((Literal) newValue);
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
		case CombPackage.RELATION__P:
			setP((Literal) null);
			return;
		case CombPackage.RELATION__Q:
			setQ((Literal) null);
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
		case CombPackage.RELATION__P:
			return p != null;
		case CombPackage.RELATION__Q:
			return q != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationImpl
