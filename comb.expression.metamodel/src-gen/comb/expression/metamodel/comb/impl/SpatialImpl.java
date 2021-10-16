/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.Literal;
import comb.expression.metamodel.comb.Spatial;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link comb.expression.metamodel.comb.impl.SpatialImpl#getH <em>H</em>}</li>
 *   <li>{@link comb.expression.metamodel.comb.impl.SpatialImpl#getL <em>L</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpatialImpl extends MinimalEObjectImpl.Container implements Spatial {
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
	 * The cached value of the '{@link #getL() <em>L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL()
	 * @generated
	 * @ordered
	 */
	protected Literal l;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CombPackage.Literals.SPATIAL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CombPackage.SPATIAL__H, oldH,
					newH);
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
				msgs = ((InternalEObject) h).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CombPackage.SPATIAL__H, null,
						msgs);
			if (newH != null)
				msgs = ((InternalEObject) newH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CombPackage.SPATIAL__H, null,
						msgs);
			msgs = basicSetH(newH, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.SPATIAL__H, newH, newH));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CombPackage.SPATIAL__L, oldL,
					newL);
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
				msgs = ((InternalEObject) l).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CombPackage.SPATIAL__L, null,
						msgs);
			if (newL != null)
				msgs = ((InternalEObject) newL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CombPackage.SPATIAL__L, null,
						msgs);
			msgs = basicSetL(newL, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CombPackage.SPATIAL__L, newL, newL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CombPackage.SPATIAL__H:
			return basicSetH(null, msgs);
		case CombPackage.SPATIAL__L:
			return basicSetL(null, msgs);
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
		case CombPackage.SPATIAL__H:
			return getH();
		case CombPackage.SPATIAL__L:
			return getL();
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
		case CombPackage.SPATIAL__H:
			setH((Literal) newValue);
			return;
		case CombPackage.SPATIAL__L:
			setL((Literal) newValue);
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
		case CombPackage.SPATIAL__H:
			setH((Literal) null);
			return;
		case CombPackage.SPATIAL__L:
			setL((Literal) null);
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
		case CombPackage.SPATIAL__H:
			return h != null;
		case CombPackage.SPATIAL__L:
			return l != null;
		}
		return super.eIsSet(featureID);
	}

} //SpatialImpl
