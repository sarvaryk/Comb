/**
 */
package comb.expression.metamodel.comb.util;

import comb.expression.metamodel.comb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see comb.expression.metamodel.comb.CombPackage
 * @generated
 */
public class CombAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CombPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CombPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombSwitch<Adapter> modelSwitch = new CombSwitch<Adapter>() {
		@Override
		public Adapter casePrecedenceAfter_until_(PrecedenceAfter_until_ object) {
			return createPrecedenceAfter_until_Adapter();
		}

		@Override
		public Adapter caseAbsenceAfter_until_(AbsenceAfter_until_ object) {
			return createAbsenceAfter_until_Adapter();
		}

		@Override
		public Adapter casePrecedence(Precedence object) {
			return createPrecedenceAdapter();
		}

		@Override
		public Adapter case_until_(_until_ object) {
			return create_until_Adapter();
		}

		@Override
		public Adapter casePrecedenceWithoutParams(PrecedenceWithoutParams object) {
			return createPrecedenceWithoutParamsAdapter();
		}

		@Override
		public Adapter caseLTLOperatorsOneParam(LTLOperatorsOneParam object) {
			return createLTLOperatorsOneParamAdapter();
		}

		@Override
		public Adapter caseUniversalityBefore_(UniversalityBefore_ object) {
			return createUniversalityBefore_Adapter();
		}

		@Override
		public Adapter casePrecedenceBefore_(PrecedenceBefore_ object) {
			return createPrecedenceBefore_Adapter();
		}

		@Override
		public Adapter caseAbsence(Absence object) {
			return createAbsenceAdapter();
		}

		@Override
		public Adapter caseUniversalityAfter_(UniversalityAfter_ object) {
			return createUniversalityAfter_Adapter();
		}

		@Override
		public Adapter caseBoundedExistenceAfter_(BoundedExistenceAfter_ object) {
			return createBoundedExistenceAfter_Adapter();
		}

		@Override
		public Adapter caseBoundedExistenceBetween_and_(BoundedExistenceBetween_and_ object) {
			return createBoundedExistenceBetween_and_Adapter();
		}

		@Override
		public Adapter caseBoundedExistenceGlobally_(BoundedExistenceGlobally_ object) {
			return createBoundedExistenceGlobally_Adapter();
		}

		@Override
		public Adapter caseAbsenceBefore_(AbsenceBefore_ object) {
			return createAbsenceBefore_Adapter();
		}

		@Override
		public Adapter caseUniversalityBetween_and_(UniversalityBetween_and_ object) {
			return createUniversalityBetween_and_Adapter();
		}

		@Override
		public Adapter caseAbsenceTwoParams(AbsenceTwoParams object) {
			return createAbsenceTwoParamsAdapter();
		}

		@Override
		public Adapter caseExistenceWithourParams(ExistenceWithourParams object) {
			return createExistenceWithourParamsAdapter();
		}

		@Override
		public Adapter caseBoundedExistneceOneParam(BoundedExistneceOneParam object) {
			return createBoundedExistneceOneParamAdapter();
		}

		@Override
		public Adapter caseResponseAfter_until_(ResponseAfter_until_ object) {
			return createResponseAfter_until_Adapter();
		}

		@Override
		public Adapter caseLTLOperators(LTLOperators object) {
			return createLTLOperatorsAdapter();
		}

		@Override
		public Adapter caseBooleanOperators(BooleanOperators object) {
			return createBooleanOperatorsAdapter();
		}

		@Override
		public Adapter casePrecedenceAfter_(PrecedenceAfter_ object) {
			return createPrecedenceAfter_Adapter();
		}

		@Override
		public Adapter caseAlways_(Always_ object) {
			return createAlways_Adapter();
		}

		@Override
		public Adapter caseAbsenceWithoutParams(AbsenceWithoutParams object) {
			return createAbsenceWithoutParamsAdapter();
		}

		@Override
		public Adapter caseResponseBetween_and_(ResponseBetween_and_ object) {
			return createResponseBetween_and_Adapter();
		}

		@Override
		public Adapter caseResponseAfter_(ResponseAfter_ object) {
			return createResponseAfter_Adapter();
		}

		@Override
		public Adapter caseBoundedExistenceWithoutParams(BoundedExistenceWithoutParams object) {
			return createBoundedExistenceWithoutParamsAdapter();
		}

		@Override
		public Adapter casePrecedenceBetween_and_(PrecedenceBetween_and_ object) {
			return createPrecedenceBetween_and_Adapter();
		}

		@Override
		public Adapter caseBoundedExistence(BoundedExistence object) {
			return createBoundedExistenceAdapter();
		}

		@Override
		public Adapter caseOrder(Order object) {
			return createOrderAdapter();
		}

		@Override
		public Adapter caseExistenceBetween_and_(ExistenceBetween_and_ object) {
			return createExistenceBetween_and_Adapter();
		}

		@Override
		public Adapter caseExistenceAfter_until_(ExistenceAfter_until_ object) {
			return createExistenceAfter_until_Adapter();
		}

		@Override
		public Adapter caseResponseBefore_(ResponseBefore_ object) {
			return createResponseBefore_Adapter();
		}

		@Override
		public Adapter caseUniversalityTwoParams(UniversalityTwoParams object) {
			return createUniversalityTwoParamsAdapter();
		}

		@Override
		public Adapter case_and_(_and_ object) {
			return create_and_Adapter();
		}

		@Override
		public Adapter caseAbsenceGlobally_(AbsenceGlobally_ object) {
			return createAbsenceGlobally_Adapter();
		}

		@Override
		public Adapter caseAbsenceBetween_and_(AbsenceBetween_and_ object) {
			return createAbsenceBetween_and_Adapter();
		}

		@Override
		public Adapter caseExistneceOneParam(ExistneceOneParam object) {
			return createExistneceOneParamAdapter();
		}

		@Override
		public Adapter case_or_(_or_ object) {
			return create_or_Adapter();
		}

		@Override
		public Adapter caseResponse(Response object) {
			return createResponseAdapter();
		}

		@Override
		public Adapter caseBasicElements(BasicElements object) {
			return createBasicElementsAdapter();
		}

		@Override
		public Adapter caseUniversalityWithoutParams(UniversalityWithoutParams object) {
			return createUniversalityWithoutParamsAdapter();
		}

		@Override
		public Adapter caseAbsenceOneParam(AbsenceOneParam object) {
			return createAbsenceOneParamAdapter();
		}

		@Override
		public Adapter caseResponseWithoutParams(ResponseWithoutParams object) {
			return createResponseWithoutParamsAdapter();
		}

		@Override
		public Adapter caseBoundedExistenceAfter_until_(BoundedExistenceAfter_until_ object) {
			return createBoundedExistenceAfter_until_Adapter();
		}

		@Override
		public Adapter caseExistenceAfter_(ExistenceAfter_ object) {
			return createExistenceAfter_Adapter();
		}

		@Override
		public Adapter caseBooleanOperatorsTwoParams(BooleanOperatorsTwoParams object) {
			return createBooleanOperatorsTwoParamsAdapter();
		}

		@Override
		public Adapter caseBooleanOperatorsOneParam(BooleanOperatorsOneParam object) {
			return createBooleanOperatorsOneParamAdapter();
		}

		@Override
		public Adapter caseExistenceTwoParams(ExistenceTwoParams object) {
			return createExistenceTwoParamsAdapter();
		}

		@Override
		public Adapter caseExistence(Existence object) {
			return createExistenceAdapter();
		}

		@Override
		public Adapter caseUniversalityAfter_until_(UniversalityAfter_until_ object) {
			return createUniversalityAfter_until_Adapter();
		}

		@Override
		public Adapter caseResponseGlobally_(ResponseGlobally_ object) {
			return createResponseGlobally_Adapter();
		}

		@Override
		public Adapter caseExistenceGlobally_(ExistenceGlobally_ object) {
			return createExistenceGlobally_Adapter();
		}

		@Override
		public Adapter caseBoundedExistenceBefore_(BoundedExistenceBefore_ object) {
			return createBoundedExistenceBefore_Adapter();
		}

		@Override
		public Adapter caseEventually_(Eventually_ object) {
			return createEventually_Adapter();
		}

		@Override
		public Adapter case_implies_(_implies_ object) {
			return create_implies_Adapter();
		}

		@Override
		public Adapter caseUniversalityGlobally_(UniversalityGlobally_ object) {
			return createUniversalityGlobally_Adapter();
		}

		@Override
		public Adapter casePrecedenceTwoParams(PrecedenceTwoParams object) {
			return createPrecedenceTwoParamsAdapter();
		}

		@Override
		public Adapter caseAbsenceAfter_(AbsenceAfter_ object) {
			return createAbsenceAfter_Adapter();
		}

		@Override
		public Adapter caseUniversality(Universality object) {
			return createUniversalityAdapter();
		}

		@Override
		public Adapter casePrecedenceOneParam(PrecedenceOneParam object) {
			return createPrecedenceOneParamAdapter();
		}

		@Override
		public Adapter caseResponseTwoParams(ResponseTwoParams object) {
			return createResponseTwoParamsAdapter();
		}

		@Override
		public Adapter caseExistenceBefore_(ExistenceBefore_ object) {
			return createExistenceBefore_Adapter();
		}

		@Override
		public Adapter caseOccurrence(Occurrence object) {
			return createOccurrenceAdapter();
		}

		@Override
		public Adapter caseResponseOneParam(ResponseOneParam object) {
			return createResponseOneParamAdapter();
		}

		@Override
		public Adapter caseUniversalityOneParam(UniversalityOneParam object) {
			return createUniversalityOneParamAdapter();
		}

		@Override
		public Adapter casePrecedenceGlobally_(PrecedenceGlobally_ object) {
			return createPrecedenceGlobally_Adapter();
		}

		@Override
		public Adapter caseLiteral(Literal object) {
			return createLiteralAdapter();
		}

		@Override
		public Adapter caseNext_(Next_ object) {
			return createNext_Adapter();
		}

		@Override
		public Adapter caseBoundedExistenceTwoParams(BoundedExistenceTwoParams object) {
			return createBoundedExistenceTwoParamsAdapter();
		}

		@Override
		public Adapter caseNot_(Not_ object) {
			return createNot_Adapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseLTLOperatorsTwoParams(LTLOperatorsTwoParams object) {
			return createLTLOperatorsTwoParamsAdapter();
		}

		@Override
		public Adapter caseEventuallyWithin_and_(EventuallyWithin_and_ object) {
			return createEventuallyWithin_and_Adapter();
		}

		@Override
		public Adapter case_untilWithin_and_(_untilWithin_and_ object) {
			return create_untilWithin_and_Adapter();
		}

		@Override
		public Adapter caseAlwaysWithin_and_(AlwaysWithin_and_ object) {
			return createAlwaysWithin_and_Adapter();
		}

		@Override
		public Adapter caseMITLOperators(MITLOperators object) {
			return createMITLOperatorsAdapter();
		}

		@Override
		public Adapter caseMITLOperatorsOneParam(MITLOperatorsOneParam object) {
			return createMITLOperatorsOneParamAdapter();
		}

		@Override
		public Adapter caseMITLOperatorsTwoParams(MITLOperatorsTwoParams object) {
			return createMITLOperatorsTwoParamsAdapter();
		}

		@Override
		public Adapter caseComb(Comb object) {
			return createCombAdapter();
		}

		@Override
		public Adapter case_untilWithin_(_untilWithin_ object) {
			return create_untilWithin_Adapter();
		}

		@Override
		public Adapter caseAlwaysWithin_(AlwaysWithin_ object) {
			return createAlwaysWithin_Adapter();
		}

		@Override
		public Adapter caseEventuallyWithin_(EventuallyWithin_ object) {
			return createEventuallyWithin_Adapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter case_lessThan_(_lessThan_ object) {
			return create_lessThan_Adapter();
		}

		@Override
		public Adapter case_lessThanOrEqual_(_lessThanOrEqual_ object) {
			return create_lessThanOrEqual_Adapter();
		}

		@Override
		public Adapter case_equal_(_equal_ object) {
			return create_equal_Adapter();
		}

		@Override
		public Adapter case_greaterThan_(_greaterThan_ object) {
			return create_greaterThan_Adapter();
		}

		@Override
		public Adapter case_greaterThanOrEqual_(_greaterThanOrEqual_ object) {
			return create_greaterThanOrEqual_Adapter();
		}

		@Override
		public Adapter caseSTLOperators(STLOperators object) {
			return createSTLOperatorsAdapter();
		}

		@Override
		public Adapter caseLTLPatternMappings(LTLPatternMappings object) {
			return createLTLPatternMappingsAdapter();
		}

		@Override
		public Adapter case_weakUntil_(_weakUntil_ object) {
			return create_weakUntil_Adapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.PrecedenceAfter_until_ <em>Precedence After until </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.PrecedenceAfter_until_
	 * @generated
	 */
	public Adapter createPrecedenceAfter_until_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AbsenceAfter_until_ <em>Absence After until </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AbsenceAfter_until_
	 * @generated
	 */
	public Adapter createAbsenceAfter_until_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Precedence
	 * @generated
	 */
	public Adapter createPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._until_ <em>until </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._until_
	 * @generated
	 */
	public Adapter create_until_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.PrecedenceWithoutParams <em>Precedence Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.PrecedenceWithoutParams
	 * @generated
	 */
	public Adapter createPrecedenceWithoutParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.LTLOperatorsOneParam <em>LTL Operators One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.LTLOperatorsOneParam
	 * @generated
	 */
	public Adapter createLTLOperatorsOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.UniversalityBefore_ <em>Universality Before </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.UniversalityBefore_
	 * @generated
	 */
	public Adapter createUniversalityBefore_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.PrecedenceBefore_ <em>Precedence Before </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.PrecedenceBefore_
	 * @generated
	 */
	public Adapter createPrecedenceBefore_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Absence <em>Absence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Absence
	 * @generated
	 */
	public Adapter createAbsenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.UniversalityAfter_ <em>Universality After </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.UniversalityAfter_
	 * @generated
	 */
	public Adapter createUniversalityAfter_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_ <em>Bounded Existence After </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistenceAfter_
	 * @generated
	 */
	public Adapter createBoundedExistenceAfter_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistenceBetween_and_ <em>Bounded Existence Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistenceBetween_and_
	 * @generated
	 */
	public Adapter createBoundedExistenceBetween_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistenceGlobally_ <em>Bounded Existence Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistenceGlobally_
	 * @generated
	 */
	public Adapter createBoundedExistenceGlobally_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AbsenceBefore_ <em>Absence Before </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AbsenceBefore_
	 * @generated
	 */
	public Adapter createAbsenceBefore_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.UniversalityBetween_and_ <em>Universality Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.UniversalityBetween_and_
	 * @generated
	 */
	public Adapter createUniversalityBetween_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AbsenceTwoParams <em>Absence Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AbsenceTwoParams
	 * @generated
	 */
	public Adapter createAbsenceTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ExistenceWithourParams <em>Existence Withour Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ExistenceWithourParams
	 * @generated
	 */
	public Adapter createExistenceWithourParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistneceOneParam <em>Bounded Existnece One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistneceOneParam
	 * @generated
	 */
	public Adapter createBoundedExistneceOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ResponseAfter_until_ <em>Response After until </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ResponseAfter_until_
	 * @generated
	 */
	public Adapter createResponseAfter_until_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.LTLOperators <em>LTL Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.LTLOperators
	 * @generated
	 */
	public Adapter createLTLOperatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BooleanOperators <em>Boolean Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BooleanOperators
	 * @generated
	 */
	public Adapter createBooleanOperatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.PrecedenceAfter_ <em>Precedence After </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.PrecedenceAfter_
	 * @generated
	 */
	public Adapter createPrecedenceAfter_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Always_ <em>Always </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Always_
	 * @generated
	 */
	public Adapter createAlways_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AbsenceWithoutParams <em>Absence Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AbsenceWithoutParams
	 * @generated
	 */
	public Adapter createAbsenceWithoutParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ResponseBetween_and_ <em>Response Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ResponseBetween_and_
	 * @generated
	 */
	public Adapter createResponseBetween_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ResponseAfter_ <em>Response After </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ResponseAfter_
	 * @generated
	 */
	public Adapter createResponseAfter_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistenceWithoutParams <em>Bounded Existence Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistenceWithoutParams
	 * @generated
	 */
	public Adapter createBoundedExistenceWithoutParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.PrecedenceBetween_and_ <em>Precedence Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.PrecedenceBetween_and_
	 * @generated
	 */
	public Adapter createPrecedenceBetween_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistence <em>Bounded Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistence
	 * @generated
	 */
	public Adapter createBoundedExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ExistenceBetween_and_ <em>Existence Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ExistenceBetween_and_
	 * @generated
	 */
	public Adapter createExistenceBetween_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ExistenceAfter_until_ <em>Existence After until </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ExistenceAfter_until_
	 * @generated
	 */
	public Adapter createExistenceAfter_until_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ResponseBefore_ <em>Response Before </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ResponseBefore_
	 * @generated
	 */
	public Adapter createResponseBefore_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.UniversalityTwoParams <em>Universality Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.UniversalityTwoParams
	 * @generated
	 */
	public Adapter createUniversalityTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._and_ <em>and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._and_
	 * @generated
	 */
	public Adapter create_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AbsenceGlobally_ <em>Absence Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AbsenceGlobally_
	 * @generated
	 */
	public Adapter createAbsenceGlobally_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AbsenceBetween_and_ <em>Absence Between and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AbsenceBetween_and_
	 * @generated
	 */
	public Adapter createAbsenceBetween_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ExistneceOneParam <em>Existnece One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ExistneceOneParam
	 * @generated
	 */
	public Adapter createExistneceOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._or_ <em>or </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._or_
	 * @generated
	 */
	public Adapter create_or_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BasicElements <em>Basic Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BasicElements
	 * @generated
	 */
	public Adapter createBasicElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.UniversalityWithoutParams <em>Universality Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.UniversalityWithoutParams
	 * @generated
	 */
	public Adapter createUniversalityWithoutParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AbsenceOneParam <em>Absence One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AbsenceOneParam
	 * @generated
	 */
	public Adapter createAbsenceOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ResponseWithoutParams <em>Response Without Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ResponseWithoutParams
	 * @generated
	 */
	public Adapter createResponseWithoutParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistenceAfter_until_ <em>Bounded Existence After until </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistenceAfter_until_
	 * @generated
	 */
	public Adapter createBoundedExistenceAfter_until_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ExistenceAfter_ <em>Existence After </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ExistenceAfter_
	 * @generated
	 */
	public Adapter createExistenceAfter_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BooleanOperatorsTwoParams <em>Boolean Operators Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BooleanOperatorsTwoParams
	 * @generated
	 */
	public Adapter createBooleanOperatorsTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BooleanOperatorsOneParam <em>Boolean Operators One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BooleanOperatorsOneParam
	 * @generated
	 */
	public Adapter createBooleanOperatorsOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ExistenceTwoParams <em>Existence Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ExistenceTwoParams
	 * @generated
	 */
	public Adapter createExistenceTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Existence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Existence
	 * @generated
	 */
	public Adapter createExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.UniversalityAfter_until_ <em>Universality After until </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.UniversalityAfter_until_
	 * @generated
	 */
	public Adapter createUniversalityAfter_until_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ResponseGlobally_ <em>Response Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ResponseGlobally_
	 * @generated
	 */
	public Adapter createResponseGlobally_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ExistenceGlobally_ <em>Existence Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ExistenceGlobally_
	 * @generated
	 */
	public Adapter createExistenceGlobally_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistenceBefore_ <em>Bounded Existence Before </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistenceBefore_
	 * @generated
	 */
	public Adapter createBoundedExistenceBefore_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Eventually_ <em>Eventually </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Eventually_
	 * @generated
	 */
	public Adapter createEventually_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._implies_ <em>implies </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._implies_
	 * @generated
	 */
	public Adapter create_implies_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.UniversalityGlobally_ <em>Universality Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.UniversalityGlobally_
	 * @generated
	 */
	public Adapter createUniversalityGlobally_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.PrecedenceTwoParams <em>Precedence Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.PrecedenceTwoParams
	 * @generated
	 */
	public Adapter createPrecedenceTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AbsenceAfter_ <em>Absence After </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AbsenceAfter_
	 * @generated
	 */
	public Adapter createAbsenceAfter_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Universality <em>Universality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Universality
	 * @generated
	 */
	public Adapter createUniversalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.PrecedenceOneParam <em>Precedence One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.PrecedenceOneParam
	 * @generated
	 */
	public Adapter createPrecedenceOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ResponseTwoParams <em>Response Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ResponseTwoParams
	 * @generated
	 */
	public Adapter createResponseTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ExistenceBefore_ <em>Existence Before </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ExistenceBefore_
	 * @generated
	 */
	public Adapter createExistenceBefore_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Occurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Occurrence
	 * @generated
	 */
	public Adapter createOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.ResponseOneParam <em>Response One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.ResponseOneParam
	 * @generated
	 */
	public Adapter createResponseOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.UniversalityOneParam <em>Universality One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.UniversalityOneParam
	 * @generated
	 */
	public Adapter createUniversalityOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.PrecedenceGlobally_ <em>Precedence Globally </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.PrecedenceGlobally_
	 * @generated
	 */
	public Adapter createPrecedenceGlobally_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Next_ <em>Next </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Next_
	 * @generated
	 */
	public Adapter createNext_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.BoundedExistenceTwoParams <em>Bounded Existence Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.BoundedExistenceTwoParams
	 * @generated
	 */
	public Adapter createBoundedExistenceTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Not_ <em>Not </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Not_
	 * @generated
	 */
	public Adapter createNot_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.LTLOperatorsTwoParams <em>LTL Operators Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.LTLOperatorsTwoParams
	 * @generated
	 */
	public Adapter createLTLOperatorsTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.EventuallyWithin_and_ <em>Eventually Within and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_and_
	 * @generated
	 */
	public Adapter createEventuallyWithin_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._untilWithin_and_ <em>until Within and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._untilWithin_and_
	 * @generated
	 */
	public Adapter create_untilWithin_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AlwaysWithin_and_ <em>Always Within and </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_and_
	 * @generated
	 */
	public Adapter createAlwaysWithin_and_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.MITLOperators <em>MITL Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.MITLOperators
	 * @generated
	 */
	public Adapter createMITLOperatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.MITLOperatorsOneParam <em>MITL Operators One Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.MITLOperatorsOneParam
	 * @generated
	 */
	public Adapter createMITLOperatorsOneParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.MITLOperatorsTwoParams <em>MITL Operators Two Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.MITLOperatorsTwoParams
	 * @generated
	 */
	public Adapter createMITLOperatorsTwoParamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Comb <em>Comb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Comb
	 * @generated
	 */
	public Adapter createCombAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._untilWithin_ <em>until Within </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._untilWithin_
	 * @generated
	 */
	public Adapter create_untilWithin_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.AlwaysWithin_ <em>Always Within </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.AlwaysWithin_
	 * @generated
	 */
	public Adapter createAlwaysWithin_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.EventuallyWithin_ <em>Eventually Within </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.EventuallyWithin_
	 * @generated
	 */
	public Adapter createEventuallyWithin_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._lessThan_ <em>less Than </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._lessThan_
	 * @generated
	 */
	public Adapter create_lessThan_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._lessThanOrEqual_ <em>less Than Or Equal </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._lessThanOrEqual_
	 * @generated
	 */
	public Adapter create_lessThanOrEqual_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._equal_ <em>equal </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._equal_
	 * @generated
	 */
	public Adapter create_equal_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._greaterThan_ <em>greater Than </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._greaterThan_
	 * @generated
	 */
	public Adapter create_greaterThan_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._greaterThanOrEqual_ <em>greater Than Or Equal </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._greaterThanOrEqual_
	 * @generated
	 */
	public Adapter create_greaterThanOrEqual_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.STLOperators <em>STL Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.STLOperators
	 * @generated
	 */
	public Adapter createSTLOperatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb.LTLPatternMappings <em>LTL Pattern Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb.LTLPatternMappings
	 * @generated
	 */
	public Adapter createLTLPatternMappingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comb.expression.metamodel.comb._weakUntil_ <em>weak Until </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comb.expression.metamodel.comb._weakUntil_
	 * @generated
	 */
	public Adapter create_weakUntil_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CombAdapterFactory
