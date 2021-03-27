/**
 */
package comb.expression.metamodel.comb.util;

import comb.expression.metamodel.comb.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see comb.expression.metamodel.comb.CombPackage
 * @generated
 */
public class CombSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CombPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombSwitch() {
		if (modelPackage == null) {
			modelPackage = CombPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CombPackage.PRECEDENCE_AFTER_UNTIL_: {
			PrecedenceAfter_until_ precedenceAfter_until_ = (PrecedenceAfter_until_) theEObject;
			T result = casePrecedenceAfter_until_(precedenceAfter_until_);
			if (result == null)
				result = casePrecedenceTwoParams(precedenceAfter_until_);
			if (result == null)
				result = casePrecedence(precedenceAfter_until_);
			if (result == null)
				result = caseOrder(precedenceAfter_until_);
			if (result == null)
				result = caseLTLPatternMappings(precedenceAfter_until_);
			if (result == null)
				result = caseLTLOperators(precedenceAfter_until_);
			if (result == null)
				result = caseElement(precedenceAfter_until_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE_AFTER_UNTIL_: {
			AbsenceAfter_until_ absenceAfter_until_ = (AbsenceAfter_until_) theEObject;
			T result = caseAbsenceAfter_until_(absenceAfter_until_);
			if (result == null)
				result = caseAbsenceTwoParams(absenceAfter_until_);
			if (result == null)
				result = caseAbsence(absenceAfter_until_);
			if (result == null)
				result = caseOccurrence(absenceAfter_until_);
			if (result == null)
				result = caseLTLPatternMappings(absenceAfter_until_);
			if (result == null)
				result = caseLTLOperators(absenceAfter_until_);
			if (result == null)
				result = caseElement(absenceAfter_until_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.PRECEDENCE: {
			Precedence precedence = (Precedence) theEObject;
			T result = casePrecedence(precedence);
			if (result == null)
				result = caseOrder(precedence);
			if (result == null)
				result = caseLTLPatternMappings(precedence);
			if (result == null)
				result = caseLTLOperators(precedence);
			if (result == null)
				result = caseElement(precedence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._UNTIL_: {
			_until_ _until_ = (_until_) theEObject;
			T result = case_until_(_until_);
			if (result == null)
				result = caseLTLOperatorsTwoParams(_until_);
			if (result == null)
				result = caseLTLOperators(_until_);
			if (result == null)
				result = caseElement(_until_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.PRECEDENCE_WITHOUT_PARAMS: {
			PrecedenceWithoutParams precedenceWithoutParams = (PrecedenceWithoutParams) theEObject;
			T result = casePrecedenceWithoutParams(precedenceWithoutParams);
			if (result == null)
				result = casePrecedence(precedenceWithoutParams);
			if (result == null)
				result = caseOrder(precedenceWithoutParams);
			if (result == null)
				result = caseLTLPatternMappings(precedenceWithoutParams);
			if (result == null)
				result = caseLTLOperators(precedenceWithoutParams);
			if (result == null)
				result = caseElement(precedenceWithoutParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.LTL_OPERATORS_ONE_PARAM: {
			LTLOperatorsOneParam ltlOperatorsOneParam = (LTLOperatorsOneParam) theEObject;
			T result = caseLTLOperatorsOneParam(ltlOperatorsOneParam);
			if (result == null)
				result = caseLTLOperators(ltlOperatorsOneParam);
			if (result == null)
				result = caseElement(ltlOperatorsOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY_BEFORE_: {
			UniversalityBefore_ universalityBefore_ = (UniversalityBefore_) theEObject;
			T result = caseUniversalityBefore_(universalityBefore_);
			if (result == null)
				result = caseUniversalityOneParam(universalityBefore_);
			if (result == null)
				result = caseUniversality(universalityBefore_);
			if (result == null)
				result = caseOccurrence(universalityBefore_);
			if (result == null)
				result = caseLTLPatternMappings(universalityBefore_);
			if (result == null)
				result = caseLTLOperators(universalityBefore_);
			if (result == null)
				result = caseElement(universalityBefore_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.PRECEDENCE_BEFORE_: {
			PrecedenceBefore_ precedenceBefore_ = (PrecedenceBefore_) theEObject;
			T result = casePrecedenceBefore_(precedenceBefore_);
			if (result == null)
				result = casePrecedenceOneParam(precedenceBefore_);
			if (result == null)
				result = casePrecedence(precedenceBefore_);
			if (result == null)
				result = caseOrder(precedenceBefore_);
			if (result == null)
				result = caseLTLPatternMappings(precedenceBefore_);
			if (result == null)
				result = caseLTLOperators(precedenceBefore_);
			if (result == null)
				result = caseElement(precedenceBefore_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE: {
			Absence absence = (Absence) theEObject;
			T result = caseAbsence(absence);
			if (result == null)
				result = caseOccurrence(absence);
			if (result == null)
				result = caseLTLPatternMappings(absence);
			if (result == null)
				result = caseLTLOperators(absence);
			if (result == null)
				result = caseElement(absence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY_AFTER_: {
			UniversalityAfter_ universalityAfter_ = (UniversalityAfter_) theEObject;
			T result = caseUniversalityAfter_(universalityAfter_);
			if (result == null)
				result = caseUniversalityOneParam(universalityAfter_);
			if (result == null)
				result = caseUniversality(universalityAfter_);
			if (result == null)
				result = caseOccurrence(universalityAfter_);
			if (result == null)
				result = caseLTLPatternMappings(universalityAfter_);
			if (result == null)
				result = caseLTLOperators(universalityAfter_);
			if (result == null)
				result = caseElement(universalityAfter_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTENCE_AFTER_: {
			BoundedExistenceAfter_ boundedExistenceAfter_ = (BoundedExistenceAfter_) theEObject;
			T result = caseBoundedExistenceAfter_(boundedExistenceAfter_);
			if (result == null)
				result = caseBoundedExistneceOneParam(boundedExistenceAfter_);
			if (result == null)
				result = caseBoundedExistence(boundedExistenceAfter_);
			if (result == null)
				result = caseOccurrence(boundedExistenceAfter_);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistenceAfter_);
			if (result == null)
				result = caseLTLOperators(boundedExistenceAfter_);
			if (result == null)
				result = caseElement(boundedExistenceAfter_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTENCE_BETWEEN_AND_: {
			BoundedExistenceBetween_and_ boundedExistenceBetween_and_ = (BoundedExistenceBetween_and_) theEObject;
			T result = caseBoundedExistenceBetween_and_(boundedExistenceBetween_and_);
			if (result == null)
				result = caseBoundedExistenceTwoParams(boundedExistenceBetween_and_);
			if (result == null)
				result = caseBoundedExistence(boundedExistenceBetween_and_);
			if (result == null)
				result = caseOccurrence(boundedExistenceBetween_and_);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistenceBetween_and_);
			if (result == null)
				result = caseLTLOperators(boundedExistenceBetween_and_);
			if (result == null)
				result = caseElement(boundedExistenceBetween_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTENCE_GLOBALLY_: {
			BoundedExistenceGlobally_ boundedExistenceGlobally_ = (BoundedExistenceGlobally_) theEObject;
			T result = caseBoundedExistenceGlobally_(boundedExistenceGlobally_);
			if (result == null)
				result = caseBoundedExistenceWithoutParams(boundedExistenceGlobally_);
			if (result == null)
				result = caseBoundedExistence(boundedExistenceGlobally_);
			if (result == null)
				result = caseOccurrence(boundedExistenceGlobally_);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistenceGlobally_);
			if (result == null)
				result = caseLTLOperators(boundedExistenceGlobally_);
			if (result == null)
				result = caseElement(boundedExistenceGlobally_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE_BEFORE_: {
			AbsenceBefore_ absenceBefore_ = (AbsenceBefore_) theEObject;
			T result = caseAbsenceBefore_(absenceBefore_);
			if (result == null)
				result = caseAbsenceOneParam(absenceBefore_);
			if (result == null)
				result = caseAbsence(absenceBefore_);
			if (result == null)
				result = caseOccurrence(absenceBefore_);
			if (result == null)
				result = caseLTLPatternMappings(absenceBefore_);
			if (result == null)
				result = caseLTLOperators(absenceBefore_);
			if (result == null)
				result = caseElement(absenceBefore_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY_BETWEEN_AND_: {
			UniversalityBetween_and_ universalityBetween_and_ = (UniversalityBetween_and_) theEObject;
			T result = caseUniversalityBetween_and_(universalityBetween_and_);
			if (result == null)
				result = caseUniversalityTwoParams(universalityBetween_and_);
			if (result == null)
				result = caseUniversality(universalityBetween_and_);
			if (result == null)
				result = caseOccurrence(universalityBetween_and_);
			if (result == null)
				result = caseLTLPatternMappings(universalityBetween_and_);
			if (result == null)
				result = caseLTLOperators(universalityBetween_and_);
			if (result == null)
				result = caseElement(universalityBetween_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE_TWO_PARAMS: {
			AbsenceTwoParams absenceTwoParams = (AbsenceTwoParams) theEObject;
			T result = caseAbsenceTwoParams(absenceTwoParams);
			if (result == null)
				result = caseAbsence(absenceTwoParams);
			if (result == null)
				result = caseOccurrence(absenceTwoParams);
			if (result == null)
				result = caseLTLPatternMappings(absenceTwoParams);
			if (result == null)
				result = caseLTLOperators(absenceTwoParams);
			if (result == null)
				result = caseElement(absenceTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTENCE_WITHOUR_PARAMS: {
			ExistenceWithourParams existenceWithourParams = (ExistenceWithourParams) theEObject;
			T result = caseExistenceWithourParams(existenceWithourParams);
			if (result == null)
				result = caseExistence(existenceWithourParams);
			if (result == null)
				result = caseOccurrence(existenceWithourParams);
			if (result == null)
				result = caseLTLPatternMappings(existenceWithourParams);
			if (result == null)
				result = caseLTLOperators(existenceWithourParams);
			if (result == null)
				result = caseElement(existenceWithourParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTNECE_ONE_PARAM: {
			BoundedExistneceOneParam boundedExistneceOneParam = (BoundedExistneceOneParam) theEObject;
			T result = caseBoundedExistneceOneParam(boundedExistneceOneParam);
			if (result == null)
				result = caseBoundedExistence(boundedExistneceOneParam);
			if (result == null)
				result = caseOccurrence(boundedExistneceOneParam);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistneceOneParam);
			if (result == null)
				result = caseLTLOperators(boundedExistneceOneParam);
			if (result == null)
				result = caseElement(boundedExistneceOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE_AFTER_UNTIL_: {
			ResponseAfter_until_ responseAfter_until_ = (ResponseAfter_until_) theEObject;
			T result = caseResponseAfter_until_(responseAfter_until_);
			if (result == null)
				result = caseResponseTwoParams(responseAfter_until_);
			if (result == null)
				result = caseResponse(responseAfter_until_);
			if (result == null)
				result = caseOrder(responseAfter_until_);
			if (result == null)
				result = caseLTLPatternMappings(responseAfter_until_);
			if (result == null)
				result = caseLTLOperators(responseAfter_until_);
			if (result == null)
				result = caseElement(responseAfter_until_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.LTL_OPERATORS: {
			LTLOperators ltlOperators = (LTLOperators) theEObject;
			T result = caseLTLOperators(ltlOperators);
			if (result == null)
				result = caseElement(ltlOperators);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOOLEAN_OPERATORS: {
			BooleanOperators booleanOperators = (BooleanOperators) theEObject;
			T result = caseBooleanOperators(booleanOperators);
			if (result == null)
				result = caseLTLOperators(booleanOperators);
			if (result == null)
				result = caseElement(booleanOperators);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.PRECEDENCE_AFTER_: {
			PrecedenceAfter_ precedenceAfter_ = (PrecedenceAfter_) theEObject;
			T result = casePrecedenceAfter_(precedenceAfter_);
			if (result == null)
				result = casePrecedenceOneParam(precedenceAfter_);
			if (result == null)
				result = casePrecedence(precedenceAfter_);
			if (result == null)
				result = caseOrder(precedenceAfter_);
			if (result == null)
				result = caseLTLPatternMappings(precedenceAfter_);
			if (result == null)
				result = caseLTLOperators(precedenceAfter_);
			if (result == null)
				result = caseElement(precedenceAfter_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ALWAYS_: {
			Always_ always_ = (Always_) theEObject;
			T result = caseAlways_(always_);
			if (result == null)
				result = caseLTLOperatorsOneParam(always_);
			if (result == null)
				result = caseLTLOperators(always_);
			if (result == null)
				result = caseElement(always_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE_WITHOUT_PARAMS: {
			AbsenceWithoutParams absenceWithoutParams = (AbsenceWithoutParams) theEObject;
			T result = caseAbsenceWithoutParams(absenceWithoutParams);
			if (result == null)
				result = caseAbsence(absenceWithoutParams);
			if (result == null)
				result = caseOccurrence(absenceWithoutParams);
			if (result == null)
				result = caseLTLPatternMappings(absenceWithoutParams);
			if (result == null)
				result = caseLTLOperators(absenceWithoutParams);
			if (result == null)
				result = caseElement(absenceWithoutParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE_BETWEEN_AND_: {
			ResponseBetween_and_ responseBetween_and_ = (ResponseBetween_and_) theEObject;
			T result = caseResponseBetween_and_(responseBetween_and_);
			if (result == null)
				result = caseResponseTwoParams(responseBetween_and_);
			if (result == null)
				result = caseResponse(responseBetween_and_);
			if (result == null)
				result = caseOrder(responseBetween_and_);
			if (result == null)
				result = caseLTLPatternMappings(responseBetween_and_);
			if (result == null)
				result = caseLTLOperators(responseBetween_and_);
			if (result == null)
				result = caseElement(responseBetween_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE_AFTER_: {
			ResponseAfter_ responseAfter_ = (ResponseAfter_) theEObject;
			T result = caseResponseAfter_(responseAfter_);
			if (result == null)
				result = caseResponseOneParam(responseAfter_);
			if (result == null)
				result = caseResponse(responseAfter_);
			if (result == null)
				result = caseOrder(responseAfter_);
			if (result == null)
				result = caseLTLPatternMappings(responseAfter_);
			if (result == null)
				result = caseLTLOperators(responseAfter_);
			if (result == null)
				result = caseElement(responseAfter_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTENCE_WITHOUT_PARAMS: {
			BoundedExistenceWithoutParams boundedExistenceWithoutParams = (BoundedExistenceWithoutParams) theEObject;
			T result = caseBoundedExistenceWithoutParams(boundedExistenceWithoutParams);
			if (result == null)
				result = caseBoundedExistence(boundedExistenceWithoutParams);
			if (result == null)
				result = caseOccurrence(boundedExistenceWithoutParams);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistenceWithoutParams);
			if (result == null)
				result = caseLTLOperators(boundedExistenceWithoutParams);
			if (result == null)
				result = caseElement(boundedExistenceWithoutParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.PRECEDENCE_BETWEEN_AND_: {
			PrecedenceBetween_and_ precedenceBetween_and_ = (PrecedenceBetween_and_) theEObject;
			T result = casePrecedenceBetween_and_(precedenceBetween_and_);
			if (result == null)
				result = casePrecedenceTwoParams(precedenceBetween_and_);
			if (result == null)
				result = casePrecedence(precedenceBetween_and_);
			if (result == null)
				result = caseOrder(precedenceBetween_and_);
			if (result == null)
				result = caseLTLPatternMappings(precedenceBetween_and_);
			if (result == null)
				result = caseLTLOperators(precedenceBetween_and_);
			if (result == null)
				result = caseElement(precedenceBetween_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTENCE: {
			BoundedExistence boundedExistence = (BoundedExistence) theEObject;
			T result = caseBoundedExistence(boundedExistence);
			if (result == null)
				result = caseOccurrence(boundedExistence);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistence);
			if (result == null)
				result = caseLTLOperators(boundedExistence);
			if (result == null)
				result = caseElement(boundedExistence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ORDER: {
			Order order = (Order) theEObject;
			T result = caseOrder(order);
			if (result == null)
				result = caseLTLPatternMappings(order);
			if (result == null)
				result = caseLTLOperators(order);
			if (result == null)
				result = caseElement(order);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTENCE_BETWEEN_AND_: {
			ExistenceBetween_and_ existenceBetween_and_ = (ExistenceBetween_and_) theEObject;
			T result = caseExistenceBetween_and_(existenceBetween_and_);
			if (result == null)
				result = caseExistenceTwoParams(existenceBetween_and_);
			if (result == null)
				result = caseExistence(existenceBetween_and_);
			if (result == null)
				result = caseOccurrence(existenceBetween_and_);
			if (result == null)
				result = caseLTLPatternMappings(existenceBetween_and_);
			if (result == null)
				result = caseLTLOperators(existenceBetween_and_);
			if (result == null)
				result = caseElement(existenceBetween_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTENCE_AFTER_UNTIL_: {
			ExistenceAfter_until_ existenceAfter_until_ = (ExistenceAfter_until_) theEObject;
			T result = caseExistenceAfter_until_(existenceAfter_until_);
			if (result == null)
				result = caseExistenceTwoParams(existenceAfter_until_);
			if (result == null)
				result = caseExistence(existenceAfter_until_);
			if (result == null)
				result = caseOccurrence(existenceAfter_until_);
			if (result == null)
				result = caseLTLPatternMappings(existenceAfter_until_);
			if (result == null)
				result = caseLTLOperators(existenceAfter_until_);
			if (result == null)
				result = caseElement(existenceAfter_until_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE_BEFORE_: {
			ResponseBefore_ responseBefore_ = (ResponseBefore_) theEObject;
			T result = caseResponseBefore_(responseBefore_);
			if (result == null)
				result = caseResponseOneParam(responseBefore_);
			if (result == null)
				result = caseResponse(responseBefore_);
			if (result == null)
				result = caseOrder(responseBefore_);
			if (result == null)
				result = caseLTLPatternMappings(responseBefore_);
			if (result == null)
				result = caseLTLOperators(responseBefore_);
			if (result == null)
				result = caseElement(responseBefore_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY_TWO_PARAMS: {
			UniversalityTwoParams universalityTwoParams = (UniversalityTwoParams) theEObject;
			T result = caseUniversalityTwoParams(universalityTwoParams);
			if (result == null)
				result = caseUniversality(universalityTwoParams);
			if (result == null)
				result = caseOccurrence(universalityTwoParams);
			if (result == null)
				result = caseLTLPatternMappings(universalityTwoParams);
			if (result == null)
				result = caseLTLOperators(universalityTwoParams);
			if (result == null)
				result = caseElement(universalityTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._AND_: {
			_and_ _and_ = (_and_) theEObject;
			T result = case_and_(_and_);
			if (result == null)
				result = caseBooleanOperatorsTwoParams(_and_);
			if (result == null)
				result = caseBooleanOperators(_and_);
			if (result == null)
				result = caseLTLOperators(_and_);
			if (result == null)
				result = caseElement(_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE_GLOBALLY_: {
			AbsenceGlobally_ absenceGlobally_ = (AbsenceGlobally_) theEObject;
			T result = caseAbsenceGlobally_(absenceGlobally_);
			if (result == null)
				result = caseAbsenceWithoutParams(absenceGlobally_);
			if (result == null)
				result = caseAbsence(absenceGlobally_);
			if (result == null)
				result = caseOccurrence(absenceGlobally_);
			if (result == null)
				result = caseLTLPatternMappings(absenceGlobally_);
			if (result == null)
				result = caseLTLOperators(absenceGlobally_);
			if (result == null)
				result = caseElement(absenceGlobally_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE_BETWEEN_AND_: {
			AbsenceBetween_and_ absenceBetween_and_ = (AbsenceBetween_and_) theEObject;
			T result = caseAbsenceBetween_and_(absenceBetween_and_);
			if (result == null)
				result = caseAbsenceTwoParams(absenceBetween_and_);
			if (result == null)
				result = caseAbsence(absenceBetween_and_);
			if (result == null)
				result = caseOccurrence(absenceBetween_and_);
			if (result == null)
				result = caseLTLPatternMappings(absenceBetween_and_);
			if (result == null)
				result = caseLTLOperators(absenceBetween_and_);
			if (result == null)
				result = caseElement(absenceBetween_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTNECE_ONE_PARAM: {
			ExistneceOneParam existneceOneParam = (ExistneceOneParam) theEObject;
			T result = caseExistneceOneParam(existneceOneParam);
			if (result == null)
				result = caseExistence(existneceOneParam);
			if (result == null)
				result = caseOccurrence(existneceOneParam);
			if (result == null)
				result = caseLTLPatternMappings(existneceOneParam);
			if (result == null)
				result = caseLTLOperators(existneceOneParam);
			if (result == null)
				result = caseElement(existneceOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._OR_: {
			_or_ _or_ = (_or_) theEObject;
			T result = case_or_(_or_);
			if (result == null)
				result = caseBooleanOperatorsTwoParams(_or_);
			if (result == null)
				result = caseBooleanOperators(_or_);
			if (result == null)
				result = caseLTLOperators(_or_);
			if (result == null)
				result = caseElement(_or_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE: {
			Response response = (Response) theEObject;
			T result = caseResponse(response);
			if (result == null)
				result = caseOrder(response);
			if (result == null)
				result = caseLTLPatternMappings(response);
			if (result == null)
				result = caseLTLOperators(response);
			if (result == null)
				result = caseElement(response);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BASIC_ELEMENTS: {
			BasicElements basicElements = (BasicElements) theEObject;
			T result = caseBasicElements(basicElements);
			if (result == null)
				result = caseElement(basicElements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY_WITHOUT_PARAMS: {
			UniversalityWithoutParams universalityWithoutParams = (UniversalityWithoutParams) theEObject;
			T result = caseUniversalityWithoutParams(universalityWithoutParams);
			if (result == null)
				result = caseUniversality(universalityWithoutParams);
			if (result == null)
				result = caseOccurrence(universalityWithoutParams);
			if (result == null)
				result = caseLTLPatternMappings(universalityWithoutParams);
			if (result == null)
				result = caseLTLOperators(universalityWithoutParams);
			if (result == null)
				result = caseElement(universalityWithoutParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE_ONE_PARAM: {
			AbsenceOneParam absenceOneParam = (AbsenceOneParam) theEObject;
			T result = caseAbsenceOneParam(absenceOneParam);
			if (result == null)
				result = caseAbsence(absenceOneParam);
			if (result == null)
				result = caseOccurrence(absenceOneParam);
			if (result == null)
				result = caseLTLPatternMappings(absenceOneParam);
			if (result == null)
				result = caseLTLOperators(absenceOneParam);
			if (result == null)
				result = caseElement(absenceOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE_WITHOUT_PARAMS: {
			ResponseWithoutParams responseWithoutParams = (ResponseWithoutParams) theEObject;
			T result = caseResponseWithoutParams(responseWithoutParams);
			if (result == null)
				result = caseResponse(responseWithoutParams);
			if (result == null)
				result = caseOrder(responseWithoutParams);
			if (result == null)
				result = caseLTLPatternMappings(responseWithoutParams);
			if (result == null)
				result = caseLTLOperators(responseWithoutParams);
			if (result == null)
				result = caseElement(responseWithoutParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTENCE_AFTER_UNTIL_: {
			BoundedExistenceAfter_until_ boundedExistenceAfter_until_ = (BoundedExistenceAfter_until_) theEObject;
			T result = caseBoundedExistenceAfter_until_(boundedExistenceAfter_until_);
			if (result == null)
				result = caseBoundedExistenceTwoParams(boundedExistenceAfter_until_);
			if (result == null)
				result = caseBoundedExistence(boundedExistenceAfter_until_);
			if (result == null)
				result = caseOccurrence(boundedExistenceAfter_until_);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistenceAfter_until_);
			if (result == null)
				result = caseLTLOperators(boundedExistenceAfter_until_);
			if (result == null)
				result = caseElement(boundedExistenceAfter_until_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTENCE_AFTER_: {
			ExistenceAfter_ existenceAfter_ = (ExistenceAfter_) theEObject;
			T result = caseExistenceAfter_(existenceAfter_);
			if (result == null)
				result = caseExistneceOneParam(existenceAfter_);
			if (result == null)
				result = caseExistence(existenceAfter_);
			if (result == null)
				result = caseOccurrence(existenceAfter_);
			if (result == null)
				result = caseLTLPatternMappings(existenceAfter_);
			if (result == null)
				result = caseLTLOperators(existenceAfter_);
			if (result == null)
				result = caseElement(existenceAfter_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOOLEAN_OPERATORS_TWO_PARAMS: {
			BooleanOperatorsTwoParams booleanOperatorsTwoParams = (BooleanOperatorsTwoParams) theEObject;
			T result = caseBooleanOperatorsTwoParams(booleanOperatorsTwoParams);
			if (result == null)
				result = caseBooleanOperators(booleanOperatorsTwoParams);
			if (result == null)
				result = caseLTLOperators(booleanOperatorsTwoParams);
			if (result == null)
				result = caseElement(booleanOperatorsTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOOLEAN_OPERATORS_ONE_PARAM: {
			BooleanOperatorsOneParam booleanOperatorsOneParam = (BooleanOperatorsOneParam) theEObject;
			T result = caseBooleanOperatorsOneParam(booleanOperatorsOneParam);
			if (result == null)
				result = caseBooleanOperators(booleanOperatorsOneParam);
			if (result == null)
				result = caseLTLOperators(booleanOperatorsOneParam);
			if (result == null)
				result = caseElement(booleanOperatorsOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTENCE_TWO_PARAMS: {
			ExistenceTwoParams existenceTwoParams = (ExistenceTwoParams) theEObject;
			T result = caseExistenceTwoParams(existenceTwoParams);
			if (result == null)
				result = caseExistence(existenceTwoParams);
			if (result == null)
				result = caseOccurrence(existenceTwoParams);
			if (result == null)
				result = caseLTLPatternMappings(existenceTwoParams);
			if (result == null)
				result = caseLTLOperators(existenceTwoParams);
			if (result == null)
				result = caseElement(existenceTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTENCE: {
			Existence existence = (Existence) theEObject;
			T result = caseExistence(existence);
			if (result == null)
				result = caseOccurrence(existence);
			if (result == null)
				result = caseLTLPatternMappings(existence);
			if (result == null)
				result = caseLTLOperators(existence);
			if (result == null)
				result = caseElement(existence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY_AFTER_UNTIL_: {
			UniversalityAfter_until_ universalityAfter_until_ = (UniversalityAfter_until_) theEObject;
			T result = caseUniversalityAfter_until_(universalityAfter_until_);
			if (result == null)
				result = caseUniversalityTwoParams(universalityAfter_until_);
			if (result == null)
				result = caseUniversality(universalityAfter_until_);
			if (result == null)
				result = caseOccurrence(universalityAfter_until_);
			if (result == null)
				result = caseLTLPatternMappings(universalityAfter_until_);
			if (result == null)
				result = caseLTLOperators(universalityAfter_until_);
			if (result == null)
				result = caseElement(universalityAfter_until_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE_GLOBALLY_: {
			ResponseGlobally_ responseGlobally_ = (ResponseGlobally_) theEObject;
			T result = caseResponseGlobally_(responseGlobally_);
			if (result == null)
				result = caseResponseWithoutParams(responseGlobally_);
			if (result == null)
				result = caseResponse(responseGlobally_);
			if (result == null)
				result = caseOrder(responseGlobally_);
			if (result == null)
				result = caseLTLPatternMappings(responseGlobally_);
			if (result == null)
				result = caseLTLOperators(responseGlobally_);
			if (result == null)
				result = caseElement(responseGlobally_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTENCE_GLOBALLY_: {
			ExistenceGlobally_ existenceGlobally_ = (ExistenceGlobally_) theEObject;
			T result = caseExistenceGlobally_(existenceGlobally_);
			if (result == null)
				result = caseExistenceWithourParams(existenceGlobally_);
			if (result == null)
				result = caseExistence(existenceGlobally_);
			if (result == null)
				result = caseOccurrence(existenceGlobally_);
			if (result == null)
				result = caseLTLPatternMappings(existenceGlobally_);
			if (result == null)
				result = caseLTLOperators(existenceGlobally_);
			if (result == null)
				result = caseElement(existenceGlobally_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTENCE_BEFORE_: {
			BoundedExistenceBefore_ boundedExistenceBefore_ = (BoundedExistenceBefore_) theEObject;
			T result = caseBoundedExistenceBefore_(boundedExistenceBefore_);
			if (result == null)
				result = caseBoundedExistneceOneParam(boundedExistenceBefore_);
			if (result == null)
				result = caseBoundedExistence(boundedExistenceBefore_);
			if (result == null)
				result = caseOccurrence(boundedExistenceBefore_);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistenceBefore_);
			if (result == null)
				result = caseLTLOperators(boundedExistenceBefore_);
			if (result == null)
				result = caseElement(boundedExistenceBefore_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EVENTUALLY_: {
			Eventually_ eventually_ = (Eventually_) theEObject;
			T result = caseEventually_(eventually_);
			if (result == null)
				result = caseLTLOperatorsOneParam(eventually_);
			if (result == null)
				result = caseLTLOperators(eventually_);
			if (result == null)
				result = caseElement(eventually_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._IMPLIES_: {
			_implies_ _implies_ = (_implies_) theEObject;
			T result = case_implies_(_implies_);
			if (result == null)
				result = caseBooleanOperatorsTwoParams(_implies_);
			if (result == null)
				result = caseBooleanOperators(_implies_);
			if (result == null)
				result = caseLTLOperators(_implies_);
			if (result == null)
				result = caseElement(_implies_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY_GLOBALLY_: {
			UniversalityGlobally_ universalityGlobally_ = (UniversalityGlobally_) theEObject;
			T result = caseUniversalityGlobally_(universalityGlobally_);
			if (result == null)
				result = caseUniversalityWithoutParams(universalityGlobally_);
			if (result == null)
				result = caseUniversality(universalityGlobally_);
			if (result == null)
				result = caseOccurrence(universalityGlobally_);
			if (result == null)
				result = caseLTLPatternMappings(universalityGlobally_);
			if (result == null)
				result = caseLTLOperators(universalityGlobally_);
			if (result == null)
				result = caseElement(universalityGlobally_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.PRECEDENCE_TWO_PARAMS: {
			PrecedenceTwoParams precedenceTwoParams = (PrecedenceTwoParams) theEObject;
			T result = casePrecedenceTwoParams(precedenceTwoParams);
			if (result == null)
				result = casePrecedence(precedenceTwoParams);
			if (result == null)
				result = caseOrder(precedenceTwoParams);
			if (result == null)
				result = caseLTLPatternMappings(precedenceTwoParams);
			if (result == null)
				result = caseLTLOperators(precedenceTwoParams);
			if (result == null)
				result = caseElement(precedenceTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ABSENCE_AFTER_: {
			AbsenceAfter_ absenceAfter_ = (AbsenceAfter_) theEObject;
			T result = caseAbsenceAfter_(absenceAfter_);
			if (result == null)
				result = caseAbsenceOneParam(absenceAfter_);
			if (result == null)
				result = caseAbsence(absenceAfter_);
			if (result == null)
				result = caseOccurrence(absenceAfter_);
			if (result == null)
				result = caseLTLPatternMappings(absenceAfter_);
			if (result == null)
				result = caseLTLOperators(absenceAfter_);
			if (result == null)
				result = caseElement(absenceAfter_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY: {
			Universality universality = (Universality) theEObject;
			T result = caseUniversality(universality);
			if (result == null)
				result = caseOccurrence(universality);
			if (result == null)
				result = caseLTLPatternMappings(universality);
			if (result == null)
				result = caseLTLOperators(universality);
			if (result == null)
				result = caseElement(universality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.PRECEDENCE_ONE_PARAM: {
			PrecedenceOneParam precedenceOneParam = (PrecedenceOneParam) theEObject;
			T result = casePrecedenceOneParam(precedenceOneParam);
			if (result == null)
				result = casePrecedence(precedenceOneParam);
			if (result == null)
				result = caseOrder(precedenceOneParam);
			if (result == null)
				result = caseLTLPatternMappings(precedenceOneParam);
			if (result == null)
				result = caseLTLOperators(precedenceOneParam);
			if (result == null)
				result = caseElement(precedenceOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE_TWO_PARAMS: {
			ResponseTwoParams responseTwoParams = (ResponseTwoParams) theEObject;
			T result = caseResponseTwoParams(responseTwoParams);
			if (result == null)
				result = caseResponse(responseTwoParams);
			if (result == null)
				result = caseOrder(responseTwoParams);
			if (result == null)
				result = caseLTLPatternMappings(responseTwoParams);
			if (result == null)
				result = caseLTLOperators(responseTwoParams);
			if (result == null)
				result = caseElement(responseTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EXISTENCE_BEFORE_: {
			ExistenceBefore_ existenceBefore_ = (ExistenceBefore_) theEObject;
			T result = caseExistenceBefore_(existenceBefore_);
			if (result == null)
				result = caseExistneceOneParam(existenceBefore_);
			if (result == null)
				result = caseExistence(existenceBefore_);
			if (result == null)
				result = caseOccurrence(existenceBefore_);
			if (result == null)
				result = caseLTLPatternMappings(existenceBefore_);
			if (result == null)
				result = caseLTLOperators(existenceBefore_);
			if (result == null)
				result = caseElement(existenceBefore_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.OCCURRENCE: {
			Occurrence occurrence = (Occurrence) theEObject;
			T result = caseOccurrence(occurrence);
			if (result == null)
				result = caseLTLPatternMappings(occurrence);
			if (result == null)
				result = caseLTLOperators(occurrence);
			if (result == null)
				result = caseElement(occurrence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RESPONSE_ONE_PARAM: {
			ResponseOneParam responseOneParam = (ResponseOneParam) theEObject;
			T result = caseResponseOneParam(responseOneParam);
			if (result == null)
				result = caseResponse(responseOneParam);
			if (result == null)
				result = caseOrder(responseOneParam);
			if (result == null)
				result = caseLTLPatternMappings(responseOneParam);
			if (result == null)
				result = caseLTLOperators(responseOneParam);
			if (result == null)
				result = caseElement(responseOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.UNIVERSALITY_ONE_PARAM: {
			UniversalityOneParam universalityOneParam = (UniversalityOneParam) theEObject;
			T result = caseUniversalityOneParam(universalityOneParam);
			if (result == null)
				result = caseUniversality(universalityOneParam);
			if (result == null)
				result = caseOccurrence(universalityOneParam);
			if (result == null)
				result = caseLTLPatternMappings(universalityOneParam);
			if (result == null)
				result = caseLTLOperators(universalityOneParam);
			if (result == null)
				result = caseElement(universalityOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.PRECEDENCE_GLOBALLY_: {
			PrecedenceGlobally_ precedenceGlobally_ = (PrecedenceGlobally_) theEObject;
			T result = casePrecedenceGlobally_(precedenceGlobally_);
			if (result == null)
				result = casePrecedenceWithoutParams(precedenceGlobally_);
			if (result == null)
				result = casePrecedence(precedenceGlobally_);
			if (result == null)
				result = caseOrder(precedenceGlobally_);
			if (result == null)
				result = caseLTLPatternMappings(precedenceGlobally_);
			if (result == null)
				result = caseLTLOperators(precedenceGlobally_);
			if (result == null)
				result = caseElement(precedenceGlobally_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseBasicElements(literal);
			if (result == null)
				result = caseElement(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.NEXT_: {
			Next_ next_ = (Next_) theEObject;
			T result = caseNext_(next_);
			if (result == null)
				result = caseLTLOperatorsOneParam(next_);
			if (result == null)
				result = caseLTLOperators(next_);
			if (result == null)
				result = caseElement(next_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.BOUNDED_EXISTENCE_TWO_PARAMS: {
			BoundedExistenceTwoParams boundedExistenceTwoParams = (BoundedExistenceTwoParams) theEObject;
			T result = caseBoundedExistenceTwoParams(boundedExistenceTwoParams);
			if (result == null)
				result = caseBoundedExistence(boundedExistenceTwoParams);
			if (result == null)
				result = caseOccurrence(boundedExistenceTwoParams);
			if (result == null)
				result = caseLTLPatternMappings(boundedExistenceTwoParams);
			if (result == null)
				result = caseLTLOperators(boundedExistenceTwoParams);
			if (result == null)
				result = caseElement(boundedExistenceTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.NOT_: {
			Not_ not_ = (Not_) theEObject;
			T result = caseNot_(not_);
			if (result == null)
				result = caseBooleanOperatorsOneParam(not_);
			if (result == null)
				result = caseBooleanOperators(not_);
			if (result == null)
				result = caseLTLOperators(not_);
			if (result == null)
				result = caseElement(not_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ELEMENT: {
			Element element = (Element) theEObject;
			T result = caseElement(element);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.LTL_OPERATORS_TWO_PARAMS: {
			LTLOperatorsTwoParams ltlOperatorsTwoParams = (LTLOperatorsTwoParams) theEObject;
			T result = caseLTLOperatorsTwoParams(ltlOperatorsTwoParams);
			if (result == null)
				result = caseLTLOperators(ltlOperatorsTwoParams);
			if (result == null)
				result = caseElement(ltlOperatorsTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EVENTUALLY_WITHIN_AND_: {
			EventuallyWithin_and_ eventuallyWithin_and_ = (EventuallyWithin_and_) theEObject;
			T result = caseEventuallyWithin_and_(eventuallyWithin_and_);
			if (result == null)
				result = caseMITLOperatorsOneParam(eventuallyWithin_and_);
			if (result == null)
				result = caseMITLOperators(eventuallyWithin_and_);
			if (result == null)
				result = caseElement(eventuallyWithin_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._UNTIL_WITHIN_AND_: {
			_untilWithin_and_ _untilWithin_and_ = (_untilWithin_and_) theEObject;
			T result = case_untilWithin_and_(_untilWithin_and_);
			if (result == null)
				result = caseMITLOperatorsTwoParams(_untilWithin_and_);
			if (result == null)
				result = caseMITLOperators(_untilWithin_and_);
			if (result == null)
				result = caseElement(_untilWithin_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ALWAYS_WITHIN_AND_: {
			AlwaysWithin_and_ alwaysWithin_and_ = (AlwaysWithin_and_) theEObject;
			T result = caseAlwaysWithin_and_(alwaysWithin_and_);
			if (result == null)
				result = caseMITLOperatorsOneParam(alwaysWithin_and_);
			if (result == null)
				result = caseMITLOperators(alwaysWithin_and_);
			if (result == null)
				result = caseElement(alwaysWithin_and_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.MITL_OPERATORS: {
			MITLOperators mitlOperators = (MITLOperators) theEObject;
			T result = caseMITLOperators(mitlOperators);
			if (result == null)
				result = caseElement(mitlOperators);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.MITL_OPERATORS_ONE_PARAM: {
			MITLOperatorsOneParam mitlOperatorsOneParam = (MITLOperatorsOneParam) theEObject;
			T result = caseMITLOperatorsOneParam(mitlOperatorsOneParam);
			if (result == null)
				result = caseMITLOperators(mitlOperatorsOneParam);
			if (result == null)
				result = caseElement(mitlOperatorsOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.MITL_OPERATORS_TWO_PARAMS: {
			MITLOperatorsTwoParams mitlOperatorsTwoParams = (MITLOperatorsTwoParams) theEObject;
			T result = caseMITLOperatorsTwoParams(mitlOperatorsTwoParams);
			if (result == null)
				result = caseMITLOperators(mitlOperatorsTwoParams);
			if (result == null)
				result = caseElement(mitlOperatorsTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.COMB: {
			Comb comb = (Comb) theEObject;
			T result = caseComb(comb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.MTL_OPERATORS: {
			MTLOperators mtlOperators = (MTLOperators) theEObject;
			T result = caseMTLOperators(mtlOperators);
			if (result == null)
				result = caseElement(mtlOperators);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.MTL_OPERATORS_ONE_PARAM: {
			MTLOperatorsOneParam mtlOperatorsOneParam = (MTLOperatorsOneParam) theEObject;
			T result = caseMTLOperatorsOneParam(mtlOperatorsOneParam);
			if (result == null)
				result = caseMTLOperators(mtlOperatorsOneParam);
			if (result == null)
				result = caseElement(mtlOperatorsOneParam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.MTL_OPERATORS_TWO_PARAMS: {
			MTLOperatorsTwoParams mtlOperatorsTwoParams = (MTLOperatorsTwoParams) theEObject;
			T result = caseMTLOperatorsTwoParams(mtlOperatorsTwoParams);
			if (result == null)
				result = caseMTLOperators(mtlOperatorsTwoParams);
			if (result == null)
				result = caseElement(mtlOperatorsTwoParams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._UNTIL_WITHIN_: {
			_untilWithin_ _untilWithin_ = (_untilWithin_) theEObject;
			T result = case_untilWithin_(_untilWithin_);
			if (result == null)
				result = caseMTLOperatorsTwoParams(_untilWithin_);
			if (result == null)
				result = caseMTLOperators(_untilWithin_);
			if (result == null)
				result = caseElement(_untilWithin_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.ALWAYS_WITHIN_: {
			AlwaysWithin_ alwaysWithin_ = (AlwaysWithin_) theEObject;
			T result = caseAlwaysWithin_(alwaysWithin_);
			if (result == null)
				result = caseMTLOperatorsOneParam(alwaysWithin_);
			if (result == null)
				result = caseMTLOperators(alwaysWithin_);
			if (result == null)
				result = caseElement(alwaysWithin_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.EVENTUALLY_WITHIN_: {
			EventuallyWithin_ eventuallyWithin_ = (EventuallyWithin_) theEObject;
			T result = caseEventuallyWithin_(eventuallyWithin_);
			if (result == null)
				result = caseMTLOperatorsOneParam(eventuallyWithin_);
			if (result == null)
				result = caseMTLOperators(eventuallyWithin_);
			if (result == null)
				result = caseElement(eventuallyWithin_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.RELATION: {
			Relation relation = (Relation) theEObject;
			T result = caseRelation(relation);
			if (result == null)
				result = caseSTLOperators(relation);
			if (result == null)
				result = caseElement(relation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._LESS_THAN_: {
			_lessThan_ _lessThan_ = (_lessThan_) theEObject;
			T result = case_lessThan_(_lessThan_);
			if (result == null)
				result = caseRelation(_lessThan_);
			if (result == null)
				result = caseSTLOperators(_lessThan_);
			if (result == null)
				result = caseElement(_lessThan_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._LESS_THAN_OR_EQUAL_: {
			_lessThanOrEqual_ _lessThanOrEqual_ = (_lessThanOrEqual_) theEObject;
			T result = case_lessThanOrEqual_(_lessThanOrEqual_);
			if (result == null)
				result = caseRelation(_lessThanOrEqual_);
			if (result == null)
				result = caseSTLOperators(_lessThanOrEqual_);
			if (result == null)
				result = caseElement(_lessThanOrEqual_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._EQUAL_: {
			_equal_ _equal_ = (_equal_) theEObject;
			T result = case_equal_(_equal_);
			if (result == null)
				result = caseRelation(_equal_);
			if (result == null)
				result = caseSTLOperators(_equal_);
			if (result == null)
				result = caseElement(_equal_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._GREATER_THAN_: {
			_greaterThan_ _greaterThan_ = (_greaterThan_) theEObject;
			T result = case_greaterThan_(_greaterThan_);
			if (result == null)
				result = caseRelation(_greaterThan_);
			if (result == null)
				result = caseSTLOperators(_greaterThan_);
			if (result == null)
				result = caseElement(_greaterThan_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage._GREATER_THAN_OR_EQUAL_: {
			_greaterThanOrEqual_ _greaterThanOrEqual_ = (_greaterThanOrEqual_) theEObject;
			T result = case_greaterThanOrEqual_(_greaterThanOrEqual_);
			if (result == null)
				result = caseRelation(_greaterThanOrEqual_);
			if (result == null)
				result = caseSTLOperators(_greaterThanOrEqual_);
			if (result == null)
				result = caseElement(_greaterThanOrEqual_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.STL_OPERATORS: {
			STLOperators stlOperators = (STLOperators) theEObject;
			T result = caseSTLOperators(stlOperators);
			if (result == null)
				result = caseElement(stlOperators);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CombPackage.LTL_PATTERN_MAPPINGS: {
			LTLPatternMappings ltlPatternMappings = (LTLPatternMappings) theEObject;
			T result = caseLTLPatternMappings(ltlPatternMappings);
			if (result == null)
				result = caseLTLOperators(ltlPatternMappings);
			if (result == null)
				result = caseElement(ltlPatternMappings);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence After until </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence After until </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceAfter_until_(PrecedenceAfter_until_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence After until </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence After until </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsenceAfter_until_(AbsenceAfter_until_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedence(Precedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>until </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>until </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_until_(_until_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Without Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Without Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceWithoutParams(PrecedenceWithoutParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTL Operators One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTL Operators One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTLOperatorsOneParam(LTLOperatorsOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality Before </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality Before </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalityBefore_(UniversalityBefore_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Before </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Before </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceBefore_(PrecedenceBefore_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsence(Absence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality After </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality After </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalityAfter_(UniversalityAfter_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence After </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence After </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistenceAfter_(BoundedExistenceAfter_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence Between and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence Between and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistenceBetween_and_(BoundedExistenceBetween_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence Globally </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence Globally </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistenceGlobally_(BoundedExistenceGlobally_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence Before </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence Before </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsenceBefore_(AbsenceBefore_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality Between and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality Between and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalityBetween_and_(UniversalityBetween_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsenceTwoParams(AbsenceTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Withour Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Withour Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceWithourParams(ExistenceWithourParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existnece One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existnece One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistneceOneParam(BoundedExistneceOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response After until </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response After until </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseAfter_until_(ResponseAfter_until_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTL Operators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTL Operators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTLOperators(LTLOperators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperators(BooleanOperators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence After </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence After </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceAfter_(PrecedenceAfter_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlways_(Always_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence Without Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence Without Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsenceWithoutParams(AbsenceWithoutParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Between and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Between and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseBetween_and_(ResponseBetween_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response After </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response After </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseAfter_(ResponseAfter_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence Without Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence Without Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistenceWithoutParams(BoundedExistenceWithoutParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Between and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Between and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceBetween_and_(PrecedenceBetween_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistence(BoundedExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Between and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Between and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceBetween_and_(ExistenceBetween_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence After until </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence After until </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceAfter_until_(ExistenceAfter_until_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Before </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Before </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseBefore_(ResponseBefore_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalityTwoParams(UniversalityTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_and_(_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence Globally </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence Globally </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsenceGlobally_(AbsenceGlobally_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence Between and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence Between and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsenceBetween_and_(AbsenceBetween_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existnece One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existnece One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistneceOneParam(ExistneceOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>or </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>or </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_or_(_or_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicElements(BasicElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality Without Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality Without Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalityWithoutParams(UniversalityWithoutParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsenceOneParam(AbsenceOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Without Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Without Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseWithoutParams(ResponseWithoutParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence After until </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence After until </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistenceAfter_until_(BoundedExistenceAfter_until_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence After </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence After </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceAfter_(ExistenceAfter_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operators Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operators Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperatorsTwoParams(BooleanOperatorsTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operators One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operators One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanOperatorsOneParam(BooleanOperatorsOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceTwoParams(ExistenceTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistence(Existence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality After until </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality After until </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalityAfter_until_(UniversalityAfter_until_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Globally </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Globally </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseGlobally_(ResponseGlobally_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Globally </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Globally </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceGlobally_(ExistenceGlobally_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence Before </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence Before </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistenceBefore_(BoundedExistenceBefore_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eventually </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eventually </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventually_(Eventually_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>implies </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>implies </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_implies_(_implies_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality Globally </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality Globally </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalityGlobally_(UniversalityGlobally_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceTwoParams(PrecedenceTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence After </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence After </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsenceAfter_(AbsenceAfter_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversality(Universality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceOneParam(PrecedenceOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseTwoParams(ResponseTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence Before </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence Before </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistenceBefore_(ExistenceBefore_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrence(Occurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseOneParam(ResponseOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalityOneParam(UniversalityOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Globally </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Globally </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceGlobally_(PrecedenceGlobally_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNext_(Next_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistenceTwoParams(BoundedExistenceTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot_(Not_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTL Operators Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTL Operators Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTLOperatorsTwoParams(LTLOperatorsTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eventually Within and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eventually Within and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventuallyWithin_and_(EventuallyWithin_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>until Within and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>until Within and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_untilWithin_and_(_untilWithin_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always Within and </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always Within and </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlwaysWithin_and_(AlwaysWithin_and_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MITL Operators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MITL Operators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMITLOperators(MITLOperators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MITL Operators One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MITL Operators One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMITLOperatorsOneParam(MITLOperatorsOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MITL Operators Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MITL Operators Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMITLOperatorsTwoParams(MITLOperatorsTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComb(Comb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTL Operators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTL Operators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTLOperators(MTLOperators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTL Operators One Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTL Operators One Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTLOperatorsOneParam(MTLOperatorsOneParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MTL Operators Two Params</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MTL Operators Two Params</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMTLOperatorsTwoParams(MTLOperatorsTwoParams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>until Within </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>until Within </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_untilWithin_(_untilWithin_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Always Within </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Always Within </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlwaysWithin_(AlwaysWithin_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eventually Within </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eventually Within </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventuallyWithin_(EventuallyWithin_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>less Than </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>less Than </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_lessThan_(_lessThan_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>less Than Or Equal </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>less Than Or Equal </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_lessThanOrEqual_(_lessThanOrEqual_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>equal </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>equal </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_equal_(_equal_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>greater Than </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>greater Than </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_greaterThan_(_greaterThan_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>greater Than Or Equal </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>greater Than Or Equal </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T case_greaterThanOrEqual_(_greaterThanOrEqual_ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>STL Operators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>STL Operators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSTLOperators(STLOperators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LTL Pattern Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LTL Pattern Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLTLPatternMappings(LTLPatternMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CombSwitch
