/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CombFactoryImpl extends EFactoryImpl implements CombFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CombFactory init() {
		try {
			CombFactory theCombFactory = (CombFactory) EPackage.Registry.INSTANCE.getEFactory(CombPackage.eNS_URI);
			if (theCombFactory != null) {
				return theCombFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CombFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CombPackage.PRECEDENCE_AFTER_UNTIL_:
			return createPrecedenceAfter_until_();
		case CombPackage.ABSENCE_AFTER_UNTIL_:
			return createAbsenceAfter_until_();
		case CombPackage._UNTIL_:
			return create_until_();
		case CombPackage.UNIVERSALITY_BEFORE_:
			return createUniversalityBefore_();
		case CombPackage.PRECEDENCE_BEFORE_:
			return createPrecedenceBefore_();
		case CombPackage.UNIVERSALITY_AFTER_:
			return createUniversalityAfter_();
		case CombPackage.BOUNDED_EXISTENCE_AFTER_:
			return createBoundedExistenceAfter_();
		case CombPackage.BOUNDED_EXISTENCE_BETWEEN_AND_:
			return createBoundedExistenceBetween_and_();
		case CombPackage.BOUNDED_EXISTENCE_GLOBALLY_:
			return createBoundedExistenceGlobally_();
		case CombPackage.ABSENCE_BEFORE_:
			return createAbsenceBefore_();
		case CombPackage.UNIVERSALITY_BETWEEN_AND_:
			return createUniversalityBetween_and_();
		case CombPackage.RESPONSE_AFTER_UNTIL_:
			return createResponseAfter_until_();
		case CombPackage.PRECEDENCE_AFTER_:
			return createPrecedenceAfter_();
		case CombPackage.ALWAYS_:
			return createAlways_();
		case CombPackage.RESPONSE_BETWEEN_AND_:
			return createResponseBetween_and_();
		case CombPackage.RESPONSE_AFTER_:
			return createResponseAfter_();
		case CombPackage.PRECEDENCE_BETWEEN_AND_:
			return createPrecedenceBetween_and_();
		case CombPackage.EXISTENCE_BETWEEN_AND_:
			return createExistenceBetween_and_();
		case CombPackage.EXISTENCE_AFTER_UNTIL_:
			return createExistenceAfter_until_();
		case CombPackage.RESPONSE_BEFORE_:
			return createResponseBefore_();
		case CombPackage._AND_:
			return create_and_();
		case CombPackage.ABSENCE_GLOBALLY_:
			return createAbsenceGlobally_();
		case CombPackage.ABSENCE_BETWEEN_AND_:
			return createAbsenceBetween_and_();
		case CombPackage._OR_:
			return create_or_();
		case CombPackage.BOUNDED_EXISTENCE_AFTER_UNTIL_:
			return createBoundedExistenceAfter_until_();
		case CombPackage.EXISTENCE_AFTER_:
			return createExistenceAfter_();
		case CombPackage.UNIVERSALITY_AFTER_UNTIL_:
			return createUniversalityAfter_until_();
		case CombPackage.RESPONSE_GLOBALLY_:
			return createResponseGlobally_();
		case CombPackage.EXISTENCE_GLOBALLY_:
			return createExistenceGlobally_();
		case CombPackage.BOUNDED_EXISTENCE_BEFORE_:
			return createBoundedExistenceBefore_();
		case CombPackage.EVENTUALLY_:
			return createEventually_();
		case CombPackage._IMPLIES_:
			return create_implies_();
		case CombPackage.UNIVERSALITY_GLOBALLY_:
			return createUniversalityGlobally_();
		case CombPackage.ABSENCE_AFTER_:
			return createAbsenceAfter_();
		case CombPackage.EXISTENCE_BEFORE_:
			return createExistenceBefore_();
		case CombPackage.PRECEDENCE_GLOBALLY_:
			return createPrecedenceGlobally_();
		case CombPackage.LITERAL:
			return createLiteral();
		case CombPackage.NEXT_:
			return createNext_();
		case CombPackage.NOT_:
			return createNot_();
		case CombPackage.EVENTUALLY_WITHIN_AND_:
			return createEventuallyWithin_and_();
		case CombPackage._UNTIL_WITHIN_AND_:
			return create_untilWithin_and_();
		case CombPackage.ALWAYS_WITHIN_AND_:
			return createAlwaysWithin_and_();
		case CombPackage.COMB:
			return createComb();
		case CombPackage._UNTIL_WITHIN_:
			return create_untilWithin_();
		case CombPackage.ALWAYS_WITHIN_:
			return createAlwaysWithin_();
		case CombPackage.EVENTUALLY_WITHIN_:
			return createEventuallyWithin_();
		case CombPackage._LESS_THAN_:
			return create_lessThan_();
		case CombPackage._LESS_THAN_OR_EQUAL_:
			return create_lessThanOrEqual_();
		case CombPackage._EQUAL_:
			return create_equal_();
		case CombPackage._GREATER_THAN_:
			return create_greaterThan_();
		case CombPackage._GREATER_THAN_OR_EQUAL_:
			return create_greaterThanOrEqual_();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CombPackage.LOGIC_GROUP:
			return createLogicGroupFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CombPackage.LOGIC_GROUP:
			return convertLogicGroupToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrecedenceAfter_until_ createPrecedenceAfter_until_() {
		PrecedenceAfter_until_Impl precedenceAfter_until_ = new PrecedenceAfter_until_Impl();
		return precedenceAfter_until_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsenceAfter_until_ createAbsenceAfter_until_() {
		AbsenceAfter_until_Impl absenceAfter_until_ = new AbsenceAfter_until_Impl();
		return absenceAfter_until_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _until_ create_until_() {
		_until_Impl _until_ = new _until_Impl();
		return _until_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversalityBefore_ createUniversalityBefore_() {
		UniversalityBefore_Impl universalityBefore_ = new UniversalityBefore_Impl();
		return universalityBefore_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrecedenceBefore_ createPrecedenceBefore_() {
		PrecedenceBefore_Impl precedenceBefore_ = new PrecedenceBefore_Impl();
		return precedenceBefore_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversalityAfter_ createUniversalityAfter_() {
		UniversalityAfter_Impl universalityAfter_ = new UniversalityAfter_Impl();
		return universalityAfter_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedExistenceAfter_ createBoundedExistenceAfter_() {
		BoundedExistenceAfter_Impl boundedExistenceAfter_ = new BoundedExistenceAfter_Impl();
		return boundedExistenceAfter_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedExistenceBetween_and_ createBoundedExistenceBetween_and_() {
		BoundedExistenceBetween_and_Impl boundedExistenceBetween_and_ = new BoundedExistenceBetween_and_Impl();
		return boundedExistenceBetween_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedExistenceGlobally_ createBoundedExistenceGlobally_() {
		BoundedExistenceGlobally_Impl boundedExistenceGlobally_ = new BoundedExistenceGlobally_Impl();
		return boundedExistenceGlobally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsenceBefore_ createAbsenceBefore_() {
		AbsenceBefore_Impl absenceBefore_ = new AbsenceBefore_Impl();
		return absenceBefore_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversalityBetween_and_ createUniversalityBetween_and_() {
		UniversalityBetween_and_Impl universalityBetween_and_ = new UniversalityBetween_and_Impl();
		return universalityBetween_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseAfter_until_ createResponseAfter_until_() {
		ResponseAfter_until_Impl responseAfter_until_ = new ResponseAfter_until_Impl();
		return responseAfter_until_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrecedenceAfter_ createPrecedenceAfter_() {
		PrecedenceAfter_Impl precedenceAfter_ = new PrecedenceAfter_Impl();
		return precedenceAfter_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Always_ createAlways_() {
		Always_Impl always_ = new Always_Impl();
		return always_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseBetween_and_ createResponseBetween_and_() {
		ResponseBetween_and_Impl responseBetween_and_ = new ResponseBetween_and_Impl();
		return responseBetween_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseAfter_ createResponseAfter_() {
		ResponseAfter_Impl responseAfter_ = new ResponseAfter_Impl();
		return responseAfter_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrecedenceBetween_and_ createPrecedenceBetween_and_() {
		PrecedenceBetween_and_Impl precedenceBetween_and_ = new PrecedenceBetween_and_Impl();
		return precedenceBetween_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExistenceBetween_and_ createExistenceBetween_and_() {
		ExistenceBetween_and_Impl existenceBetween_and_ = new ExistenceBetween_and_Impl();
		return existenceBetween_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExistenceAfter_until_ createExistenceAfter_until_() {
		ExistenceAfter_until_Impl existenceAfter_until_ = new ExistenceAfter_until_Impl();
		return existenceAfter_until_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseBefore_ createResponseBefore_() {
		ResponseBefore_Impl responseBefore_ = new ResponseBefore_Impl();
		return responseBefore_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _and_ create_and_() {
		_and_Impl _and_ = new _and_Impl();
		return _and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsenceGlobally_ createAbsenceGlobally_() {
		AbsenceGlobally_Impl absenceGlobally_ = new AbsenceGlobally_Impl();
		return absenceGlobally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsenceBetween_and_ createAbsenceBetween_and_() {
		AbsenceBetween_and_Impl absenceBetween_and_ = new AbsenceBetween_and_Impl();
		return absenceBetween_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _or_ create_or_() {
		_or_Impl _or_ = new _or_Impl();
		return _or_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedExistenceAfter_until_ createBoundedExistenceAfter_until_() {
		BoundedExistenceAfter_until_Impl boundedExistenceAfter_until_ = new BoundedExistenceAfter_until_Impl();
		return boundedExistenceAfter_until_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExistenceAfter_ createExistenceAfter_() {
		ExistenceAfter_Impl existenceAfter_ = new ExistenceAfter_Impl();
		return existenceAfter_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversalityAfter_until_ createUniversalityAfter_until_() {
		UniversalityAfter_until_Impl universalityAfter_until_ = new UniversalityAfter_until_Impl();
		return universalityAfter_until_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseGlobally_ createResponseGlobally_() {
		ResponseGlobally_Impl responseGlobally_ = new ResponseGlobally_Impl();
		return responseGlobally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExistenceGlobally_ createExistenceGlobally_() {
		ExistenceGlobally_Impl existenceGlobally_ = new ExistenceGlobally_Impl();
		return existenceGlobally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedExistenceBefore_ createBoundedExistenceBefore_() {
		BoundedExistenceBefore_Impl boundedExistenceBefore_ = new BoundedExistenceBefore_Impl();
		return boundedExistenceBefore_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eventually_ createEventually_() {
		Eventually_Impl eventually_ = new Eventually_Impl();
		return eventually_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _implies_ create_implies_() {
		_implies_Impl _implies_ = new _implies_Impl();
		return _implies_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversalityGlobally_ createUniversalityGlobally_() {
		UniversalityGlobally_Impl universalityGlobally_ = new UniversalityGlobally_Impl();
		return universalityGlobally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsenceAfter_ createAbsenceAfter_() {
		AbsenceAfter_Impl absenceAfter_ = new AbsenceAfter_Impl();
		return absenceAfter_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExistenceBefore_ createExistenceBefore_() {
		ExistenceBefore_Impl existenceBefore_ = new ExistenceBefore_Impl();
		return existenceBefore_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrecedenceGlobally_ createPrecedenceGlobally_() {
		PrecedenceGlobally_Impl precedenceGlobally_ = new PrecedenceGlobally_Impl();
		return precedenceGlobally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Next_ createNext_() {
		Next_Impl next_ = new Next_Impl();
		return next_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Not_ createNot_() {
		Not_Impl not_ = new Not_Impl();
		return not_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventuallyWithin_and_ createEventuallyWithin_and_() {
		EventuallyWithin_and_Impl eventuallyWithin_and_ = new EventuallyWithin_and_Impl();
		return eventuallyWithin_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _untilWithin_and_ create_untilWithin_and_() {
		_untilWithin_and_Impl _untilWithin_and_ = new _untilWithin_and_Impl();
		return _untilWithin_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlwaysWithin_and_ createAlwaysWithin_and_() {
		AlwaysWithin_and_Impl alwaysWithin_and_ = new AlwaysWithin_and_Impl();
		return alwaysWithin_and_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comb createComb() {
		CombImpl comb = new CombImpl();
		return comb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _untilWithin_ create_untilWithin_() {
		_untilWithin_Impl _untilWithin_ = new _untilWithin_Impl();
		return _untilWithin_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlwaysWithin_ createAlwaysWithin_() {
		AlwaysWithin_Impl alwaysWithin_ = new AlwaysWithin_Impl();
		return alwaysWithin_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventuallyWithin_ createEventuallyWithin_() {
		EventuallyWithin_Impl eventuallyWithin_ = new EventuallyWithin_Impl();
		return eventuallyWithin_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _lessThan_ create_lessThan_() {
		_lessThan_Impl _lessThan_ = new _lessThan_Impl();
		return _lessThan_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _lessThanOrEqual_ create_lessThanOrEqual_() {
		_lessThanOrEqual_Impl _lessThanOrEqual_ = new _lessThanOrEqual_Impl();
		return _lessThanOrEqual_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _equal_ create_equal_() {
		_equal_Impl _equal_ = new _equal_Impl();
		return _equal_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _greaterThan_ create_greaterThan_() {
		_greaterThan_Impl _greaterThan_ = new _greaterThan_Impl();
		return _greaterThan_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public _greaterThanOrEqual_ create_greaterThanOrEqual_() {
		_greaterThanOrEqual_Impl _greaterThanOrEqual_ = new _greaterThanOrEqual_Impl();
		return _greaterThanOrEqual_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicGroup createLogicGroupFromString(EDataType eDataType, String initialValue) {
		LogicGroup result = LogicGroup.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicGroupToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombPackage getCombPackage() {
		return (CombPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CombPackage getPackage() {
		return CombPackage.eINSTANCE;
	}

} //CombFactoryImpl
