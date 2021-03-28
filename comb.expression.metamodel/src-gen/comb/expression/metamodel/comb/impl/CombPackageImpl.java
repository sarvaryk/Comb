/**
 */
package comb.expression.metamodel.comb.impl;

import comb.expression.metamodel.comb.Absence;
import comb.expression.metamodel.comb.AbsenceAfter_;
import comb.expression.metamodel.comb.AbsenceAfter_until_;
import comb.expression.metamodel.comb.AbsenceBefore_;
import comb.expression.metamodel.comb.AbsenceBetween_and_;
import comb.expression.metamodel.comb.AbsenceGlobally_;
import comb.expression.metamodel.comb.AbsenceOneParam;
import comb.expression.metamodel.comb.AbsenceTwoParams;
import comb.expression.metamodel.comb.AbsenceWithoutParams;
import comb.expression.metamodel.comb.AlwaysWithin_;
import comb.expression.metamodel.comb.AlwaysWithin_and_;
import comb.expression.metamodel.comb.Always_;
import comb.expression.metamodel.comb.BasicElements;
import comb.expression.metamodel.comb.BooleanOperators;
import comb.expression.metamodel.comb.BooleanOperatorsOneParam;
import comb.expression.metamodel.comb.BooleanOperatorsTwoParams;
import comb.expression.metamodel.comb.BoundedExistence;
import comb.expression.metamodel.comb.BoundedExistenceAfter_;
import comb.expression.metamodel.comb.BoundedExistenceAfter_until_;
import comb.expression.metamodel.comb.BoundedExistenceBefore_;
import comb.expression.metamodel.comb.BoundedExistenceBetween_and_;
import comb.expression.metamodel.comb.BoundedExistenceGlobally_;
import comb.expression.metamodel.comb.BoundedExistenceTwoParams;
import comb.expression.metamodel.comb.BoundedExistenceWithoutParams;
import comb.expression.metamodel.comb.BoundedExistneceOneParam;
import comb.expression.metamodel.comb.Comb;
import comb.expression.metamodel.comb.CombFactory;
import comb.expression.metamodel.comb.CombPackage;
import comb.expression.metamodel.comb.Element;
import comb.expression.metamodel.comb.EventuallyWithin_;
import comb.expression.metamodel.comb.EventuallyWithin_and_;
import comb.expression.metamodel.comb.Eventually_;
import comb.expression.metamodel.comb.Existence;
import comb.expression.metamodel.comb.ExistenceAfter_;
import comb.expression.metamodel.comb.ExistenceAfter_until_;
import comb.expression.metamodel.comb.ExistenceBefore_;
import comb.expression.metamodel.comb.ExistenceBetween_and_;
import comb.expression.metamodel.comb.ExistenceGlobally_;
import comb.expression.metamodel.comb.ExistenceTwoParams;
import comb.expression.metamodel.comb.ExistenceWithourParams;
import comb.expression.metamodel.comb.ExistneceOneParam;
import comb.expression.metamodel.comb.LTLOperators;
import comb.expression.metamodel.comb.LTLOperatorsOneParam;
import comb.expression.metamodel.comb.LTLOperatorsTwoParams;
import comb.expression.metamodel.comb.LTLPatternMappings;
import comb.expression.metamodel.comb.Literal;
import comb.expression.metamodel.comb.LogicGroup;
import comb.expression.metamodel.comb.MITLOperators;
import comb.expression.metamodel.comb.MITLOperatorsOneParam;
import comb.expression.metamodel.comb.MITLOperatorsTwoParams;
import comb.expression.metamodel.comb.MTLOperators;
import comb.expression.metamodel.comb.MTLOperatorsOneParam;
import comb.expression.metamodel.comb.MTLOperatorsTwoParams;
import comb.expression.metamodel.comb.Next_;
import comb.expression.metamodel.comb.Not_;
import comb.expression.metamodel.comb.Occurrence;
import comb.expression.metamodel.comb.Order;
import comb.expression.metamodel.comb.Precedence;
import comb.expression.metamodel.comb.PrecedenceAfter_;
import comb.expression.metamodel.comb.PrecedenceAfter_until_;
import comb.expression.metamodel.comb.PrecedenceBefore_;
import comb.expression.metamodel.comb.PrecedenceBetween_and_;
import comb.expression.metamodel.comb.PrecedenceGlobally_;
import comb.expression.metamodel.comb.PrecedenceOneParam;
import comb.expression.metamodel.comb.PrecedenceTwoParams;
import comb.expression.metamodel.comb.PrecedenceWithoutParams;
import comb.expression.metamodel.comb.Relation;
import comb.expression.metamodel.comb.Response;
import comb.expression.metamodel.comb.ResponseAfter_;
import comb.expression.metamodel.comb.ResponseAfter_until_;
import comb.expression.metamodel.comb.ResponseBefore_;
import comb.expression.metamodel.comb.ResponseBetween_and_;
import comb.expression.metamodel.comb.ResponseGlobally_;
import comb.expression.metamodel.comb.ResponseOneParam;
import comb.expression.metamodel.comb.ResponseTwoParams;
import comb.expression.metamodel.comb.ResponseWithoutParams;
import comb.expression.metamodel.comb.STLOperators;
import comb.expression.metamodel.comb.SupportedOutput;
import comb.expression.metamodel.comb.Universality;
import comb.expression.metamodel.comb.UniversalityAfter_;
import comb.expression.metamodel.comb.UniversalityAfter_until_;
import comb.expression.metamodel.comb.UniversalityBefore_;
import comb.expression.metamodel.comb.UniversalityBetween_and_;
import comb.expression.metamodel.comb.UniversalityGlobally_;
import comb.expression.metamodel.comb.UniversalityOneParam;
import comb.expression.metamodel.comb.UniversalityTwoParams;
import comb.expression.metamodel.comb.UniversalityWithoutParams;
import comb.expression.metamodel.comb._and_;
import comb.expression.metamodel.comb._equal_;
import comb.expression.metamodel.comb._greaterThanOrEqual_;
import comb.expression.metamodel.comb._greaterThan_;
import comb.expression.metamodel.comb._implies_;
import comb.expression.metamodel.comb._lessThanOrEqual_;
import comb.expression.metamodel.comb._lessThan_;
import comb.expression.metamodel.comb._or_;
import comb.expression.metamodel.comb._untilWithin_;
import comb.expression.metamodel.comb._untilWithin_and_;
import comb.expression.metamodel.comb._until_;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CombPackageImpl extends EPackageImpl implements CombPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceAfter_until_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceAfter_until_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _until_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceWithoutParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlOperatorsOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityBefore_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceBefore_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityAfter_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceAfter_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceBetween_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceGlobally_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceBefore_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityBetween_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceWithourParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistneceOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseAfter_until_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlOperatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceAfter_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass always_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceWithoutParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseBetween_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseAfter_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceWithoutParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceBetween_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceBetween_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceAfter_until_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseBefore_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceGlobally_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceBetween_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existneceOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _or_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityWithoutParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseWithoutParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceAfter_until_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceAfter_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorsTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanOperatorsOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityAfter_until_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseGlobally_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceGlobally_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceBefore_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventually_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _implies_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityGlobally_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceAfter_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceBefore_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceGlobally_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass next_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass not_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlOperatorsTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventuallyWithin_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _untilWithin_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alwaysWithin_and_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitlOperatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitlOperatorsOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitlOperatorsTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtlOperatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtlOperatorsOneParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtlOperatorsTwoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _untilWithin_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alwaysWithin_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventuallyWithin_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _lessThan_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _lessThanOrEqual_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _equal_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _greaterThan_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass _greaterThanOrEqual_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stlOperatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlPatternMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicGroupEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supportedOutputEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see comb.expression.metamodel.comb.CombPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CombPackageImpl() {
		super(eNS_URI, CombFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CombPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CombPackage init() {
		if (isInited)
			return (CombPackage) EPackage.Registry.INSTANCE.getEPackage(CombPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCombPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CombPackageImpl theCombPackage = registeredCombPackage instanceof CombPackageImpl
				? (CombPackageImpl) registeredCombPackage
				: new CombPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCombPackage.createPackageContents();

		// Initialize created meta-data
		theCombPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCombPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CombPackage.eNS_URI, theCombPackage);
		return theCombPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceAfter_until_() {
		return precedenceAfter_until_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceAfter_until__Interpretation() {
		return (EAttribute) precedenceAfter_until_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceAfter_until__Description() {
		return (EAttribute) precedenceAfter_until_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsenceAfter_until_() {
		return absenceAfter_until_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceAfter_until__Interpretation() {
		return (EAttribute) absenceAfter_until_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceAfter_until__Description() {
		return (EAttribute) absenceAfter_until_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedence() {
		return precedenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_until_() {
		return _until_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_until__Interpretation() {
		return (EAttribute) _until_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_until__Description() {
		return (EAttribute) _until_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceWithoutParams() {
		return precedenceWithoutParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTLOperatorsOneParam() {
		return ltlOperatorsOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalityBefore_() {
		return universalityBefore_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityBefore__Interpretation() {
		return (EAttribute) universalityBefore_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityBefore__Description() {
		return (EAttribute) universalityBefore_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceBefore_() {
		return precedenceBefore_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceBefore__Interpretation() {
		return (EAttribute) precedenceBefore_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceBefore__Description() {
		return (EAttribute) precedenceBefore_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsence() {
		return absenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalityAfter_() {
		return universalityAfter_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityAfter__Interpretation() {
		return (EAttribute) universalityAfter_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityAfter__Description() {
		return (EAttribute) universalityAfter_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistenceAfter_() {
		return boundedExistenceAfter_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceAfter__Interpretation() {
		return (EAttribute) boundedExistenceAfter_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceAfter__Description() {
		return (EAttribute) boundedExistenceAfter_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistenceBetween_and_() {
		return boundedExistenceBetween_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceBetween_and__Interpretation() {
		return (EAttribute) boundedExistenceBetween_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceBetween_and__Description() {
		return (EAttribute) boundedExistenceBetween_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistenceGlobally_() {
		return boundedExistenceGlobally_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceGlobally__Interpretation() {
		return (EAttribute) boundedExistenceGlobally_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceGlobally__Description() {
		return (EAttribute) boundedExistenceGlobally_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsenceBefore_() {
		return absenceBefore_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceBefore__Interpretation() {
		return (EAttribute) absenceBefore_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceBefore__Description() {
		return (EAttribute) absenceBefore_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalityBetween_and_() {
		return universalityBetween_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityBetween_and__Interpretation() {
		return (EAttribute) universalityBetween_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityBetween_and__Description() {
		return (EAttribute) universalityBetween_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsenceTwoParams() {
		return absenceTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbsenceTwoParams_R() {
		return (EReference) absenceTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbsenceTwoParams_Q() {
		return (EReference) absenceTwoParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistenceWithourParams() {
		return existenceWithourParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistneceOneParam() {
		return boundedExistneceOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundedExistneceOneParam_Q() {
		return (EReference) boundedExistneceOneParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseAfter_until_() {
		return responseAfter_until_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseAfter_until__Interpretation() {
		return (EAttribute) responseAfter_until_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseAfter_until__Description() {
		return (EAttribute) responseAfter_until_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTLOperators() {
		return ltlOperatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTLOperators_P() {
		return (EReference) ltlOperatorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanOperators() {
		return booleanOperatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceAfter_() {
		return precedenceAfter_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceAfter__Interpretation() {
		return (EAttribute) precedenceAfter_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceAfter__Description() {
		return (EAttribute) precedenceAfter_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlways_() {
		return always_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlways__Interpretation() {
		return (EAttribute) always_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlways__Description() {
		return (EAttribute) always_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsenceWithoutParams() {
		return absenceWithoutParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseBetween_and_() {
		return responseBetween_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseBetween_and__Interpretation() {
		return (EAttribute) responseBetween_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseBetween_and__Description() {
		return (EAttribute) responseBetween_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseAfter_() {
		return responseAfter_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseAfter__Interpretation() {
		return (EAttribute) responseAfter_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseAfter__Description() {
		return (EAttribute) responseAfter_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistenceWithoutParams() {
		return boundedExistenceWithoutParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceBetween_and_() {
		return precedenceBetween_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceBetween_and__Interpretation() {
		return (EAttribute) precedenceBetween_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceBetween_and__Description() {
		return (EAttribute) precedenceBetween_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistence() {
		return boundedExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_S() {
		return (EReference) orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistenceBetween_and_() {
		return existenceBetween_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceBetween_and__Interpretation() {
		return (EAttribute) existenceBetween_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceBetween_and__Description() {
		return (EAttribute) existenceBetween_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistenceAfter_until_() {
		return existenceAfter_until_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceAfter_until__Interpretation() {
		return (EAttribute) existenceAfter_until_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceAfter_until__Description() {
		return (EAttribute) existenceAfter_until_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseBefore_() {
		return responseBefore_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseBefore__Interpretation() {
		return (EAttribute) responseBefore_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseBefore__Description() {
		return (EAttribute) responseBefore_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalityTwoParams() {
		return universalityTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversalityTwoParams_Q() {
		return (EReference) universalityTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversalityTwoParams_R() {
		return (EReference) universalityTwoParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_and_() {
		return _and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_and__Interpretation() {
		return (EAttribute) _and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_and__Description() {
		return (EAttribute) _and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsenceGlobally_() {
		return absenceGlobally_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceGlobally__Interpretation() {
		return (EAttribute) absenceGlobally_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceGlobally__Description() {
		return (EAttribute) absenceGlobally_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsenceBetween_and_() {
		return absenceBetween_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceBetween_and__Interpretation() {
		return (EAttribute) absenceBetween_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceBetween_and__Description() {
		return (EAttribute) absenceBetween_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistneceOneParam() {
		return existneceOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExistneceOneParam_Q() {
		return (EReference) existneceOneParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_or_() {
		return _or_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_or__Interpretation() {
		return (EAttribute) _or_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_or__Description() {
		return (EAttribute) _or_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicElements() {
		return basicElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalityWithoutParams() {
		return universalityWithoutParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsenceOneParam() {
		return absenceOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbsenceOneParam_Q() {
		return (EReference) absenceOneParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseWithoutParams() {
		return responseWithoutParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistenceAfter_until_() {
		return boundedExistenceAfter_until_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceAfter_until__Interpretation() {
		return (EAttribute) boundedExistenceAfter_until_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceAfter_until__Description() {
		return (EAttribute) boundedExistenceAfter_until_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistenceAfter_() {
		return existenceAfter_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceAfter__Interpretation() {
		return (EAttribute) existenceAfter_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceAfter__Description() {
		return (EAttribute) existenceAfter_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanOperatorsTwoParams() {
		return booleanOperatorsTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanOperatorsTwoParams_Q() {
		return (EReference) booleanOperatorsTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanOperatorsOneParam() {
		return booleanOperatorsOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistenceTwoParams() {
		return existenceTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExistenceTwoParams_R() {
		return (EReference) existenceTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExistenceTwoParams_Q() {
		return (EReference) existenceTwoParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistence() {
		return existenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalityAfter_until_() {
		return universalityAfter_until_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityAfter_until__Interpretation() {
		return (EAttribute) universalityAfter_until_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityAfter_until__Description() {
		return (EAttribute) universalityAfter_until_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseGlobally_() {
		return responseGlobally_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseGlobally__Interpretation() {
		return (EAttribute) responseGlobally_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponseGlobally__Description() {
		return (EAttribute) responseGlobally_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistenceGlobally_() {
		return existenceGlobally_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceGlobally__Interpretation() {
		return (EAttribute) existenceGlobally_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceGlobally__Description() {
		return (EAttribute) existenceGlobally_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistenceBefore_() {
		return boundedExistenceBefore_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceBefore__Interpretation() {
		return (EAttribute) boundedExistenceBefore_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistenceBefore__Description() {
		return (EAttribute) boundedExistenceBefore_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventually_() {
		return eventually_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventually__Interpretation() {
		return (EAttribute) eventually_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventually__Description() {
		return (EAttribute) eventually_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_implies_() {
		return _implies_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_implies__Interpretation() {
		return (EAttribute) _implies_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_implies__Description() {
		return (EAttribute) _implies_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalityGlobally_() {
		return universalityGlobally_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityGlobally__Interpretation() {
		return (EAttribute) universalityGlobally_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniversalityGlobally__Description() {
		return (EAttribute) universalityGlobally_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceTwoParams() {
		return precedenceTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrecedenceTwoParams_Q() {
		return (EReference) precedenceTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrecedenceTwoParams_R() {
		return (EReference) precedenceTwoParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsenceAfter_() {
		return absenceAfter_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceAfter__Interpretation() {
		return (EAttribute) absenceAfter_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbsenceAfter__Description() {
		return (EAttribute) absenceAfter_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversality() {
		return universalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceOneParam() {
		return precedenceOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrecedenceOneParam_Q() {
		return (EReference) precedenceOneParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseTwoParams() {
		return responseTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseTwoParams_Q() {
		return (EReference) responseTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseTwoParams_R() {
		return (EReference) responseTwoParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistenceBefore_() {
		return existenceBefore_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceBefore__Interpretation() {
		return (EAttribute) existenceBefore_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExistenceBefore__Description() {
		return (EAttribute) existenceBefore_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOccurrence() {
		return occurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseOneParam() {
		return responseOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponseOneParam_Q() {
		return (EReference) responseOneParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversalityOneParam() {
		return universalityOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversalityOneParam_Q() {
		return (EReference) universalityOneParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceGlobally_() {
		return precedenceGlobally_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceGlobally__Interpretation() {
		return (EAttribute) precedenceGlobally_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrecedenceGlobally__Description() {
		return (EAttribute) precedenceGlobally_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteral_Description() {
		return (EAttribute) literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNext_() {
		return next_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNext__Interpretation() {
		return (EAttribute) next_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNext__Description() {
		return (EAttribute) next_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistenceTwoParams() {
		return boundedExistenceTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundedExistenceTwoParams_Q() {
		return (EReference) boundedExistenceTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundedExistenceTwoParams_R() {
		return (EReference) boundedExistenceTwoParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNot_() {
		return not_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNot__Interpretation() {
		return (EAttribute) not_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNot__Description() {
		return (EAttribute) not_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_SubtreeInterpretations() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_LogicGroup() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTLOperatorsTwoParams() {
		return ltlOperatorsTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTLOperatorsTwoParams_Q() {
		return (EReference) ltlOperatorsTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventuallyWithin_and_() {
		return eventuallyWithin_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventuallyWithin_and__Interpretation() {
		return (EAttribute) eventuallyWithin_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventuallyWithin_and__Description() {
		return (EAttribute) eventuallyWithin_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventuallyWithin_and__L() {
		return (EReference) eventuallyWithin_and_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventuallyWithin_and__H() {
		return (EReference) eventuallyWithin_and_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_untilWithin_and_() {
		return _untilWithin_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_untilWithin_and__Interpretation() {
		return (EAttribute) _untilWithin_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_untilWithin_and__Description() {
		return (EAttribute) _untilWithin_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference get_untilWithin_and__L() {
		return (EReference) _untilWithin_and_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference get_untilWithin_and__H() {
		return (EReference) _untilWithin_and_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlwaysWithin_and_() {
		return alwaysWithin_and_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlwaysWithin_and__Interpretation() {
		return (EAttribute) alwaysWithin_and_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlwaysWithin_and__Description() {
		return (EAttribute) alwaysWithin_and_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlwaysWithin_and__L() {
		return (EReference) alwaysWithin_and_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlwaysWithin_and__H() {
		return (EReference) alwaysWithin_and_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMITLOperators() {
		return mitlOperatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMITLOperators_P() {
		return (EReference) mitlOperatorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMITLOperatorsOneParam() {
		return mitlOperatorsOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMITLOperatorsTwoParams() {
		return mitlOperatorsTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMITLOperatorsTwoParams_Q() {
		return (EReference) mitlOperatorsTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComb() {
		return combEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComb_Element() {
		return (EReference) combEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMTLOperators() {
		return mtlOperatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMTLOperators_P() {
		return (EReference) mtlOperatorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMTLOperatorsOneParam() {
		return mtlOperatorsOneParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMTLOperatorsTwoParams() {
		return mtlOperatorsTwoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMTLOperatorsTwoParams_Q() {
		return (EReference) mtlOperatorsTwoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_untilWithin_() {
		return _untilWithin_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_untilWithin__Interpretation() {
		return (EAttribute) _untilWithin_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_untilWithin__Description() {
		return (EAttribute) _untilWithin_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference get_untilWithin__H() {
		return (EReference) _untilWithin_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlwaysWithin_() {
		return alwaysWithin_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlwaysWithin__Interpretation() {
		return (EAttribute) alwaysWithin_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlwaysWithin__Description() {
		return (EAttribute) alwaysWithin_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlwaysWithin__H() {
		return (EReference) alwaysWithin_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventuallyWithin_() {
		return eventuallyWithin_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventuallyWithin__Interpretation() {
		return (EAttribute) eventuallyWithin_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventuallyWithin__Description() {
		return (EAttribute) eventuallyWithin_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventuallyWithin__H() {
		return (EReference) eventuallyWithin_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_P() {
		return (EReference) relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_Q() {
		return (EReference) relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_lessThan_() {
		return _lessThan_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_lessThan__Description() {
		return (EAttribute) _lessThan_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_lessThan__Interpretation() {
		return (EAttribute) _lessThan_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_lessThanOrEqual_() {
		return _lessThanOrEqual_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_lessThanOrEqual__Interpretation() {
		return (EAttribute) _lessThanOrEqual_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_lessThanOrEqual__Description() {
		return (EAttribute) _lessThanOrEqual_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_equal_() {
		return _equal_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_equal__Description() {
		return (EAttribute) _equal_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_equal__Interpretation() {
		return (EAttribute) _equal_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_greaterThan_() {
		return _greaterThan_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_greaterThan__Description() {
		return (EAttribute) _greaterThan_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_greaterThan__Interpretation() {
		return (EAttribute) _greaterThan_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass get_greaterThanOrEqual_() {
		return _greaterThanOrEqual_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_greaterThanOrEqual__Description() {
		return (EAttribute) _greaterThanOrEqual_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute get_greaterThanOrEqual__Interpretation() {
		return (EAttribute) _greaterThanOrEqual_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSTLOperators() {
		return stlOperatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTLPatternMappings() {
		return ltlPatternMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLogicGroup() {
		return logicGroupEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSupportedOutput() {
		return supportedOutputEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CombFactory getCombFactory() {
		return (CombFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		precedenceAfter_until_EClass = createEClass(PRECEDENCE_AFTER_UNTIL_);
		createEAttribute(precedenceAfter_until_EClass, PRECEDENCE_AFTER_UNTIL___INTERPRETATION);
		createEAttribute(precedenceAfter_until_EClass, PRECEDENCE_AFTER_UNTIL___DESCRIPTION);

		absenceAfter_until_EClass = createEClass(ABSENCE_AFTER_UNTIL_);
		createEAttribute(absenceAfter_until_EClass, ABSENCE_AFTER_UNTIL___INTERPRETATION);
		createEAttribute(absenceAfter_until_EClass, ABSENCE_AFTER_UNTIL___DESCRIPTION);

		precedenceEClass = createEClass(PRECEDENCE);

		_until_EClass = createEClass(_UNTIL_);
		createEAttribute(_until_EClass, _UNTIL___INTERPRETATION);
		createEAttribute(_until_EClass, _UNTIL___DESCRIPTION);

		precedenceWithoutParamsEClass = createEClass(PRECEDENCE_WITHOUT_PARAMS);

		ltlOperatorsOneParamEClass = createEClass(LTL_OPERATORS_ONE_PARAM);

		universalityBefore_EClass = createEClass(UNIVERSALITY_BEFORE_);
		createEAttribute(universalityBefore_EClass, UNIVERSALITY_BEFORE___INTERPRETATION);
		createEAttribute(universalityBefore_EClass, UNIVERSALITY_BEFORE___DESCRIPTION);

		precedenceBefore_EClass = createEClass(PRECEDENCE_BEFORE_);
		createEAttribute(precedenceBefore_EClass, PRECEDENCE_BEFORE___INTERPRETATION);
		createEAttribute(precedenceBefore_EClass, PRECEDENCE_BEFORE___DESCRIPTION);

		absenceEClass = createEClass(ABSENCE);

		universalityAfter_EClass = createEClass(UNIVERSALITY_AFTER_);
		createEAttribute(universalityAfter_EClass, UNIVERSALITY_AFTER___INTERPRETATION);
		createEAttribute(universalityAfter_EClass, UNIVERSALITY_AFTER___DESCRIPTION);

		boundedExistenceAfter_EClass = createEClass(BOUNDED_EXISTENCE_AFTER_);
		createEAttribute(boundedExistenceAfter_EClass, BOUNDED_EXISTENCE_AFTER___INTERPRETATION);
		createEAttribute(boundedExistenceAfter_EClass, BOUNDED_EXISTENCE_AFTER___DESCRIPTION);

		boundedExistenceBetween_and_EClass = createEClass(BOUNDED_EXISTENCE_BETWEEN_AND_);
		createEAttribute(boundedExistenceBetween_and_EClass, BOUNDED_EXISTENCE_BETWEEN_AND___INTERPRETATION);
		createEAttribute(boundedExistenceBetween_and_EClass, BOUNDED_EXISTENCE_BETWEEN_AND___DESCRIPTION);

		boundedExistenceGlobally_EClass = createEClass(BOUNDED_EXISTENCE_GLOBALLY_);
		createEAttribute(boundedExistenceGlobally_EClass, BOUNDED_EXISTENCE_GLOBALLY___INTERPRETATION);
		createEAttribute(boundedExistenceGlobally_EClass, BOUNDED_EXISTENCE_GLOBALLY___DESCRIPTION);

		absenceBefore_EClass = createEClass(ABSENCE_BEFORE_);
		createEAttribute(absenceBefore_EClass, ABSENCE_BEFORE___INTERPRETATION);
		createEAttribute(absenceBefore_EClass, ABSENCE_BEFORE___DESCRIPTION);

		universalityBetween_and_EClass = createEClass(UNIVERSALITY_BETWEEN_AND_);
		createEAttribute(universalityBetween_and_EClass, UNIVERSALITY_BETWEEN_AND___INTERPRETATION);
		createEAttribute(universalityBetween_and_EClass, UNIVERSALITY_BETWEEN_AND___DESCRIPTION);

		absenceTwoParamsEClass = createEClass(ABSENCE_TWO_PARAMS);
		createEReference(absenceTwoParamsEClass, ABSENCE_TWO_PARAMS__R);
		createEReference(absenceTwoParamsEClass, ABSENCE_TWO_PARAMS__Q);

		existenceWithourParamsEClass = createEClass(EXISTENCE_WITHOUR_PARAMS);

		boundedExistneceOneParamEClass = createEClass(BOUNDED_EXISTNECE_ONE_PARAM);
		createEReference(boundedExistneceOneParamEClass, BOUNDED_EXISTNECE_ONE_PARAM__Q);

		responseAfter_until_EClass = createEClass(RESPONSE_AFTER_UNTIL_);
		createEAttribute(responseAfter_until_EClass, RESPONSE_AFTER_UNTIL___INTERPRETATION);
		createEAttribute(responseAfter_until_EClass, RESPONSE_AFTER_UNTIL___DESCRIPTION);

		ltlOperatorsEClass = createEClass(LTL_OPERATORS);
		createEReference(ltlOperatorsEClass, LTL_OPERATORS__P);

		booleanOperatorsEClass = createEClass(BOOLEAN_OPERATORS);

		precedenceAfter_EClass = createEClass(PRECEDENCE_AFTER_);
		createEAttribute(precedenceAfter_EClass, PRECEDENCE_AFTER___INTERPRETATION);
		createEAttribute(precedenceAfter_EClass, PRECEDENCE_AFTER___DESCRIPTION);

		always_EClass = createEClass(ALWAYS_);
		createEAttribute(always_EClass, ALWAYS___INTERPRETATION);
		createEAttribute(always_EClass, ALWAYS___DESCRIPTION);

		absenceWithoutParamsEClass = createEClass(ABSENCE_WITHOUT_PARAMS);

		responseBetween_and_EClass = createEClass(RESPONSE_BETWEEN_AND_);
		createEAttribute(responseBetween_and_EClass, RESPONSE_BETWEEN_AND___INTERPRETATION);
		createEAttribute(responseBetween_and_EClass, RESPONSE_BETWEEN_AND___DESCRIPTION);

		responseAfter_EClass = createEClass(RESPONSE_AFTER_);
		createEAttribute(responseAfter_EClass, RESPONSE_AFTER___INTERPRETATION);
		createEAttribute(responseAfter_EClass, RESPONSE_AFTER___DESCRIPTION);

		boundedExistenceWithoutParamsEClass = createEClass(BOUNDED_EXISTENCE_WITHOUT_PARAMS);

		precedenceBetween_and_EClass = createEClass(PRECEDENCE_BETWEEN_AND_);
		createEAttribute(precedenceBetween_and_EClass, PRECEDENCE_BETWEEN_AND___INTERPRETATION);
		createEAttribute(precedenceBetween_and_EClass, PRECEDENCE_BETWEEN_AND___DESCRIPTION);

		boundedExistenceEClass = createEClass(BOUNDED_EXISTENCE);

		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__S);

		existenceBetween_and_EClass = createEClass(EXISTENCE_BETWEEN_AND_);
		createEAttribute(existenceBetween_and_EClass, EXISTENCE_BETWEEN_AND___INTERPRETATION);
		createEAttribute(existenceBetween_and_EClass, EXISTENCE_BETWEEN_AND___DESCRIPTION);

		existenceAfter_until_EClass = createEClass(EXISTENCE_AFTER_UNTIL_);
		createEAttribute(existenceAfter_until_EClass, EXISTENCE_AFTER_UNTIL___INTERPRETATION);
		createEAttribute(existenceAfter_until_EClass, EXISTENCE_AFTER_UNTIL___DESCRIPTION);

		responseBefore_EClass = createEClass(RESPONSE_BEFORE_);
		createEAttribute(responseBefore_EClass, RESPONSE_BEFORE___INTERPRETATION);
		createEAttribute(responseBefore_EClass, RESPONSE_BEFORE___DESCRIPTION);

		universalityTwoParamsEClass = createEClass(UNIVERSALITY_TWO_PARAMS);
		createEReference(universalityTwoParamsEClass, UNIVERSALITY_TWO_PARAMS__Q);
		createEReference(universalityTwoParamsEClass, UNIVERSALITY_TWO_PARAMS__R);

		_and_EClass = createEClass(_AND_);
		createEAttribute(_and_EClass, _AND___INTERPRETATION);
		createEAttribute(_and_EClass, _AND___DESCRIPTION);

		absenceGlobally_EClass = createEClass(ABSENCE_GLOBALLY_);
		createEAttribute(absenceGlobally_EClass, ABSENCE_GLOBALLY___INTERPRETATION);
		createEAttribute(absenceGlobally_EClass, ABSENCE_GLOBALLY___DESCRIPTION);

		absenceBetween_and_EClass = createEClass(ABSENCE_BETWEEN_AND_);
		createEAttribute(absenceBetween_and_EClass, ABSENCE_BETWEEN_AND___INTERPRETATION);
		createEAttribute(absenceBetween_and_EClass, ABSENCE_BETWEEN_AND___DESCRIPTION);

		existneceOneParamEClass = createEClass(EXISTNECE_ONE_PARAM);
		createEReference(existneceOneParamEClass, EXISTNECE_ONE_PARAM__Q);

		_or_EClass = createEClass(_OR_);
		createEAttribute(_or_EClass, _OR___INTERPRETATION);
		createEAttribute(_or_EClass, _OR___DESCRIPTION);

		responseEClass = createEClass(RESPONSE);

		basicElementsEClass = createEClass(BASIC_ELEMENTS);

		universalityWithoutParamsEClass = createEClass(UNIVERSALITY_WITHOUT_PARAMS);

		absenceOneParamEClass = createEClass(ABSENCE_ONE_PARAM);
		createEReference(absenceOneParamEClass, ABSENCE_ONE_PARAM__Q);

		responseWithoutParamsEClass = createEClass(RESPONSE_WITHOUT_PARAMS);

		boundedExistenceAfter_until_EClass = createEClass(BOUNDED_EXISTENCE_AFTER_UNTIL_);
		createEAttribute(boundedExistenceAfter_until_EClass, BOUNDED_EXISTENCE_AFTER_UNTIL___INTERPRETATION);
		createEAttribute(boundedExistenceAfter_until_EClass, BOUNDED_EXISTENCE_AFTER_UNTIL___DESCRIPTION);

		existenceAfter_EClass = createEClass(EXISTENCE_AFTER_);
		createEAttribute(existenceAfter_EClass, EXISTENCE_AFTER___INTERPRETATION);
		createEAttribute(existenceAfter_EClass, EXISTENCE_AFTER___DESCRIPTION);

		booleanOperatorsTwoParamsEClass = createEClass(BOOLEAN_OPERATORS_TWO_PARAMS);
		createEReference(booleanOperatorsTwoParamsEClass, BOOLEAN_OPERATORS_TWO_PARAMS__Q);

		booleanOperatorsOneParamEClass = createEClass(BOOLEAN_OPERATORS_ONE_PARAM);

		existenceTwoParamsEClass = createEClass(EXISTENCE_TWO_PARAMS);
		createEReference(existenceTwoParamsEClass, EXISTENCE_TWO_PARAMS__R);
		createEReference(existenceTwoParamsEClass, EXISTENCE_TWO_PARAMS__Q);

		existenceEClass = createEClass(EXISTENCE);

		universalityAfter_until_EClass = createEClass(UNIVERSALITY_AFTER_UNTIL_);
		createEAttribute(universalityAfter_until_EClass, UNIVERSALITY_AFTER_UNTIL___INTERPRETATION);
		createEAttribute(universalityAfter_until_EClass, UNIVERSALITY_AFTER_UNTIL___DESCRIPTION);

		responseGlobally_EClass = createEClass(RESPONSE_GLOBALLY_);
		createEAttribute(responseGlobally_EClass, RESPONSE_GLOBALLY___INTERPRETATION);
		createEAttribute(responseGlobally_EClass, RESPONSE_GLOBALLY___DESCRIPTION);

		existenceGlobally_EClass = createEClass(EXISTENCE_GLOBALLY_);
		createEAttribute(existenceGlobally_EClass, EXISTENCE_GLOBALLY___INTERPRETATION);
		createEAttribute(existenceGlobally_EClass, EXISTENCE_GLOBALLY___DESCRIPTION);

		boundedExistenceBefore_EClass = createEClass(BOUNDED_EXISTENCE_BEFORE_);
		createEAttribute(boundedExistenceBefore_EClass, BOUNDED_EXISTENCE_BEFORE___INTERPRETATION);
		createEAttribute(boundedExistenceBefore_EClass, BOUNDED_EXISTENCE_BEFORE___DESCRIPTION);

		eventually_EClass = createEClass(EVENTUALLY_);
		createEAttribute(eventually_EClass, EVENTUALLY___INTERPRETATION);
		createEAttribute(eventually_EClass, EVENTUALLY___DESCRIPTION);

		_implies_EClass = createEClass(_IMPLIES_);
		createEAttribute(_implies_EClass, _IMPLIES___INTERPRETATION);
		createEAttribute(_implies_EClass, _IMPLIES___DESCRIPTION);

		universalityGlobally_EClass = createEClass(UNIVERSALITY_GLOBALLY_);
		createEAttribute(universalityGlobally_EClass, UNIVERSALITY_GLOBALLY___INTERPRETATION);
		createEAttribute(universalityGlobally_EClass, UNIVERSALITY_GLOBALLY___DESCRIPTION);

		precedenceTwoParamsEClass = createEClass(PRECEDENCE_TWO_PARAMS);
		createEReference(precedenceTwoParamsEClass, PRECEDENCE_TWO_PARAMS__Q);
		createEReference(precedenceTwoParamsEClass, PRECEDENCE_TWO_PARAMS__R);

		absenceAfter_EClass = createEClass(ABSENCE_AFTER_);
		createEAttribute(absenceAfter_EClass, ABSENCE_AFTER___INTERPRETATION);
		createEAttribute(absenceAfter_EClass, ABSENCE_AFTER___DESCRIPTION);

		universalityEClass = createEClass(UNIVERSALITY);

		precedenceOneParamEClass = createEClass(PRECEDENCE_ONE_PARAM);
		createEReference(precedenceOneParamEClass, PRECEDENCE_ONE_PARAM__Q);

		responseTwoParamsEClass = createEClass(RESPONSE_TWO_PARAMS);
		createEReference(responseTwoParamsEClass, RESPONSE_TWO_PARAMS__Q);
		createEReference(responseTwoParamsEClass, RESPONSE_TWO_PARAMS__R);

		existenceBefore_EClass = createEClass(EXISTENCE_BEFORE_);
		createEAttribute(existenceBefore_EClass, EXISTENCE_BEFORE___INTERPRETATION);
		createEAttribute(existenceBefore_EClass, EXISTENCE_BEFORE___DESCRIPTION);

		occurrenceEClass = createEClass(OCCURRENCE);

		responseOneParamEClass = createEClass(RESPONSE_ONE_PARAM);
		createEReference(responseOneParamEClass, RESPONSE_ONE_PARAM__Q);

		universalityOneParamEClass = createEClass(UNIVERSALITY_ONE_PARAM);
		createEReference(universalityOneParamEClass, UNIVERSALITY_ONE_PARAM__Q);

		precedenceGlobally_EClass = createEClass(PRECEDENCE_GLOBALLY_);
		createEAttribute(precedenceGlobally_EClass, PRECEDENCE_GLOBALLY___INTERPRETATION);
		createEAttribute(precedenceGlobally_EClass, PRECEDENCE_GLOBALLY___DESCRIPTION);

		literalEClass = createEClass(LITERAL);
		createEAttribute(literalEClass, LITERAL__DESCRIPTION);

		next_EClass = createEClass(NEXT_);
		createEAttribute(next_EClass, NEXT___INTERPRETATION);
		createEAttribute(next_EClass, NEXT___DESCRIPTION);

		boundedExistenceTwoParamsEClass = createEClass(BOUNDED_EXISTENCE_TWO_PARAMS);
		createEReference(boundedExistenceTwoParamsEClass, BOUNDED_EXISTENCE_TWO_PARAMS__Q);
		createEReference(boundedExistenceTwoParamsEClass, BOUNDED_EXISTENCE_TWO_PARAMS__R);

		not_EClass = createEClass(NOT_);
		createEAttribute(not_EClass, NOT___INTERPRETATION);
		createEAttribute(not_EClass, NOT___DESCRIPTION);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__SUBTREE_INTERPRETATIONS);
		createEAttribute(elementEClass, ELEMENT__LOGIC_GROUP);

		ltlOperatorsTwoParamsEClass = createEClass(LTL_OPERATORS_TWO_PARAMS);
		createEReference(ltlOperatorsTwoParamsEClass, LTL_OPERATORS_TWO_PARAMS__Q);

		eventuallyWithin_and_EClass = createEClass(EVENTUALLY_WITHIN_AND_);
		createEAttribute(eventuallyWithin_and_EClass, EVENTUALLY_WITHIN_AND___INTERPRETATION);
		createEAttribute(eventuallyWithin_and_EClass, EVENTUALLY_WITHIN_AND___DESCRIPTION);
		createEReference(eventuallyWithin_and_EClass, EVENTUALLY_WITHIN_AND___L);
		createEReference(eventuallyWithin_and_EClass, EVENTUALLY_WITHIN_AND___H);

		_untilWithin_and_EClass = createEClass(_UNTIL_WITHIN_AND_);
		createEAttribute(_untilWithin_and_EClass, _UNTIL_WITHIN_AND___INTERPRETATION);
		createEAttribute(_untilWithin_and_EClass, _UNTIL_WITHIN_AND___DESCRIPTION);
		createEReference(_untilWithin_and_EClass, _UNTIL_WITHIN_AND___L);
		createEReference(_untilWithin_and_EClass, _UNTIL_WITHIN_AND___H);

		alwaysWithin_and_EClass = createEClass(ALWAYS_WITHIN_AND_);
		createEAttribute(alwaysWithin_and_EClass, ALWAYS_WITHIN_AND___INTERPRETATION);
		createEAttribute(alwaysWithin_and_EClass, ALWAYS_WITHIN_AND___DESCRIPTION);
		createEReference(alwaysWithin_and_EClass, ALWAYS_WITHIN_AND___L);
		createEReference(alwaysWithin_and_EClass, ALWAYS_WITHIN_AND___H);

		mitlOperatorsEClass = createEClass(MITL_OPERATORS);
		createEReference(mitlOperatorsEClass, MITL_OPERATORS__P);

		mitlOperatorsOneParamEClass = createEClass(MITL_OPERATORS_ONE_PARAM);

		mitlOperatorsTwoParamsEClass = createEClass(MITL_OPERATORS_TWO_PARAMS);
		createEReference(mitlOperatorsTwoParamsEClass, MITL_OPERATORS_TWO_PARAMS__Q);

		combEClass = createEClass(COMB);
		createEReference(combEClass, COMB__ELEMENT);

		mtlOperatorsEClass = createEClass(MTL_OPERATORS);
		createEReference(mtlOperatorsEClass, MTL_OPERATORS__P);

		mtlOperatorsOneParamEClass = createEClass(MTL_OPERATORS_ONE_PARAM);

		mtlOperatorsTwoParamsEClass = createEClass(MTL_OPERATORS_TWO_PARAMS);
		createEReference(mtlOperatorsTwoParamsEClass, MTL_OPERATORS_TWO_PARAMS__Q);

		_untilWithin_EClass = createEClass(_UNTIL_WITHIN_);
		createEAttribute(_untilWithin_EClass, _UNTIL_WITHIN___INTERPRETATION);
		createEAttribute(_untilWithin_EClass, _UNTIL_WITHIN___DESCRIPTION);
		createEReference(_untilWithin_EClass, _UNTIL_WITHIN___H);

		alwaysWithin_EClass = createEClass(ALWAYS_WITHIN_);
		createEAttribute(alwaysWithin_EClass, ALWAYS_WITHIN___INTERPRETATION);
		createEAttribute(alwaysWithin_EClass, ALWAYS_WITHIN___DESCRIPTION);
		createEReference(alwaysWithin_EClass, ALWAYS_WITHIN___H);

		eventuallyWithin_EClass = createEClass(EVENTUALLY_WITHIN_);
		createEAttribute(eventuallyWithin_EClass, EVENTUALLY_WITHIN___INTERPRETATION);
		createEAttribute(eventuallyWithin_EClass, EVENTUALLY_WITHIN___DESCRIPTION);
		createEReference(eventuallyWithin_EClass, EVENTUALLY_WITHIN___H);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__P);
		createEReference(relationEClass, RELATION__Q);

		_lessThan_EClass = createEClass(_LESS_THAN_);
		createEAttribute(_lessThan_EClass, _LESS_THAN___INTERPRETATION);
		createEAttribute(_lessThan_EClass, _LESS_THAN___DESCRIPTION);

		_lessThanOrEqual_EClass = createEClass(_LESS_THAN_OR_EQUAL_);
		createEAttribute(_lessThanOrEqual_EClass, _LESS_THAN_OR_EQUAL___INTERPRETATION);
		createEAttribute(_lessThanOrEqual_EClass, _LESS_THAN_OR_EQUAL___DESCRIPTION);

		_equal_EClass = createEClass(_EQUAL_);
		createEAttribute(_equal_EClass, _EQUAL___INTERPRETATION);
		createEAttribute(_equal_EClass, _EQUAL___DESCRIPTION);

		_greaterThan_EClass = createEClass(_GREATER_THAN_);
		createEAttribute(_greaterThan_EClass, _GREATER_THAN___INTERPRETATION);
		createEAttribute(_greaterThan_EClass, _GREATER_THAN___DESCRIPTION);

		_greaterThanOrEqual_EClass = createEClass(_GREATER_THAN_OR_EQUAL_);
		createEAttribute(_greaterThanOrEqual_EClass, _GREATER_THAN_OR_EQUAL___INTERPRETATION);
		createEAttribute(_greaterThanOrEqual_EClass, _GREATER_THAN_OR_EQUAL___DESCRIPTION);

		stlOperatorsEClass = createEClass(STL_OPERATORS);

		ltlPatternMappingsEClass = createEClass(LTL_PATTERN_MAPPINGS);

		// Create enums
		logicGroupEEnum = createEEnum(LOGIC_GROUP);
		supportedOutputEEnum = createEEnum(SUPPORTED_OUTPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		precedenceAfter_until_EClass.getESuperTypes().add(this.getPrecedenceTwoParams());
		absenceAfter_until_EClass.getESuperTypes().add(this.getAbsenceTwoParams());
		precedenceEClass.getESuperTypes().add(this.getOrder());
		_until_EClass.getESuperTypes().add(this.getLTLOperatorsTwoParams());
		precedenceWithoutParamsEClass.getESuperTypes().add(this.getPrecedence());
		ltlOperatorsOneParamEClass.getESuperTypes().add(this.getLTLOperators());
		universalityBefore_EClass.getESuperTypes().add(this.getUniversalityOneParam());
		precedenceBefore_EClass.getESuperTypes().add(this.getPrecedenceOneParam());
		absenceEClass.getESuperTypes().add(this.getOccurrence());
		universalityAfter_EClass.getESuperTypes().add(this.getUniversalityOneParam());
		boundedExistenceAfter_EClass.getESuperTypes().add(this.getBoundedExistneceOneParam());
		boundedExistenceBetween_and_EClass.getESuperTypes().add(this.getBoundedExistenceTwoParams());
		boundedExistenceGlobally_EClass.getESuperTypes().add(this.getBoundedExistenceWithoutParams());
		absenceBefore_EClass.getESuperTypes().add(this.getAbsenceOneParam());
		universalityBetween_and_EClass.getESuperTypes().add(this.getUniversalityTwoParams());
		absenceTwoParamsEClass.getESuperTypes().add(this.getAbsence());
		existenceWithourParamsEClass.getESuperTypes().add(this.getExistence());
		boundedExistneceOneParamEClass.getESuperTypes().add(this.getBoundedExistence());
		responseAfter_until_EClass.getESuperTypes().add(this.getResponseTwoParams());
		ltlOperatorsEClass.getESuperTypes().add(this.getElement());
		booleanOperatorsEClass.getESuperTypes().add(this.getLTLOperators());
		precedenceAfter_EClass.getESuperTypes().add(this.getPrecedenceOneParam());
		always_EClass.getESuperTypes().add(this.getLTLOperatorsOneParam());
		absenceWithoutParamsEClass.getESuperTypes().add(this.getAbsence());
		responseBetween_and_EClass.getESuperTypes().add(this.getResponseTwoParams());
		responseAfter_EClass.getESuperTypes().add(this.getResponseOneParam());
		boundedExistenceWithoutParamsEClass.getESuperTypes().add(this.getBoundedExistence());
		precedenceBetween_and_EClass.getESuperTypes().add(this.getPrecedenceTwoParams());
		boundedExistenceEClass.getESuperTypes().add(this.getOccurrence());
		orderEClass.getESuperTypes().add(this.getLTLPatternMappings());
		existenceBetween_and_EClass.getESuperTypes().add(this.getExistenceTwoParams());
		existenceAfter_until_EClass.getESuperTypes().add(this.getExistenceTwoParams());
		responseBefore_EClass.getESuperTypes().add(this.getResponseOneParam());
		universalityTwoParamsEClass.getESuperTypes().add(this.getUniversality());
		_and_EClass.getESuperTypes().add(this.getBooleanOperatorsTwoParams());
		absenceGlobally_EClass.getESuperTypes().add(this.getAbsenceWithoutParams());
		absenceBetween_and_EClass.getESuperTypes().add(this.getAbsenceTwoParams());
		existneceOneParamEClass.getESuperTypes().add(this.getExistence());
		_or_EClass.getESuperTypes().add(this.getBooleanOperatorsTwoParams());
		responseEClass.getESuperTypes().add(this.getOrder());
		basicElementsEClass.getESuperTypes().add(this.getElement());
		universalityWithoutParamsEClass.getESuperTypes().add(this.getUniversality());
		absenceOneParamEClass.getESuperTypes().add(this.getAbsence());
		responseWithoutParamsEClass.getESuperTypes().add(this.getResponse());
		boundedExistenceAfter_until_EClass.getESuperTypes().add(this.getBoundedExistenceTwoParams());
		existenceAfter_EClass.getESuperTypes().add(this.getExistneceOneParam());
		booleanOperatorsTwoParamsEClass.getESuperTypes().add(this.getBooleanOperators());
		booleanOperatorsOneParamEClass.getESuperTypes().add(this.getBooleanOperators());
		existenceTwoParamsEClass.getESuperTypes().add(this.getExistence());
		existenceEClass.getESuperTypes().add(this.getOccurrence());
		universalityAfter_until_EClass.getESuperTypes().add(this.getUniversalityTwoParams());
		responseGlobally_EClass.getESuperTypes().add(this.getResponseWithoutParams());
		existenceGlobally_EClass.getESuperTypes().add(this.getExistenceWithourParams());
		boundedExistenceBefore_EClass.getESuperTypes().add(this.getBoundedExistneceOneParam());
		eventually_EClass.getESuperTypes().add(this.getLTLOperatorsOneParam());
		_implies_EClass.getESuperTypes().add(this.getBooleanOperatorsTwoParams());
		universalityGlobally_EClass.getESuperTypes().add(this.getUniversalityWithoutParams());
		precedenceTwoParamsEClass.getESuperTypes().add(this.getPrecedence());
		absenceAfter_EClass.getESuperTypes().add(this.getAbsenceOneParam());
		universalityEClass.getESuperTypes().add(this.getOccurrence());
		precedenceOneParamEClass.getESuperTypes().add(this.getPrecedence());
		responseTwoParamsEClass.getESuperTypes().add(this.getResponse());
		existenceBefore_EClass.getESuperTypes().add(this.getExistneceOneParam());
		occurrenceEClass.getESuperTypes().add(this.getLTLPatternMappings());
		responseOneParamEClass.getESuperTypes().add(this.getResponse());
		universalityOneParamEClass.getESuperTypes().add(this.getUniversality());
		precedenceGlobally_EClass.getESuperTypes().add(this.getPrecedenceWithoutParams());
		literalEClass.getESuperTypes().add(this.getBasicElements());
		next_EClass.getESuperTypes().add(this.getLTLOperatorsOneParam());
		boundedExistenceTwoParamsEClass.getESuperTypes().add(this.getBoundedExistence());
		not_EClass.getESuperTypes().add(this.getBooleanOperatorsOneParam());
		ltlOperatorsTwoParamsEClass.getESuperTypes().add(this.getLTLOperators());
		eventuallyWithin_and_EClass.getESuperTypes().add(this.getMITLOperatorsOneParam());
		_untilWithin_and_EClass.getESuperTypes().add(this.getMITLOperatorsTwoParams());
		alwaysWithin_and_EClass.getESuperTypes().add(this.getMITLOperatorsOneParam());
		mitlOperatorsEClass.getESuperTypes().add(this.getElement());
		mitlOperatorsOneParamEClass.getESuperTypes().add(this.getMITLOperators());
		mitlOperatorsTwoParamsEClass.getESuperTypes().add(this.getMITLOperators());
		mtlOperatorsEClass.getESuperTypes().add(this.getElement());
		mtlOperatorsOneParamEClass.getESuperTypes().add(this.getMTLOperators());
		mtlOperatorsTwoParamsEClass.getESuperTypes().add(this.getMTLOperators());
		_untilWithin_EClass.getESuperTypes().add(this.getMTLOperatorsTwoParams());
		alwaysWithin_EClass.getESuperTypes().add(this.getMTLOperatorsOneParam());
		eventuallyWithin_EClass.getESuperTypes().add(this.getMTLOperatorsOneParam());
		relationEClass.getESuperTypes().add(this.getSTLOperators());
		_lessThan_EClass.getESuperTypes().add(this.getRelation());
		_lessThanOrEqual_EClass.getESuperTypes().add(this.getRelation());
		_equal_EClass.getESuperTypes().add(this.getRelation());
		_greaterThan_EClass.getESuperTypes().add(this.getRelation());
		_greaterThanOrEqual_EClass.getESuperTypes().add(this.getRelation());
		stlOperatorsEClass.getESuperTypes().add(this.getElement());
		ltlPatternMappingsEClass.getESuperTypes().add(this.getElement());
		ltlPatternMappingsEClass.getESuperTypes().add(this.getLTLOperators());

		// Initialize classes, features, and operations; add parameters
		initEClass(precedenceAfter_until_EClass, PrecedenceAfter_until_.class, "PrecedenceAfter_until_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedenceAfter_until__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> ((!(<P>) U (<S> || <R>)) || G(!(<P>))))", 1, 1, PrecedenceAfter_until_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedenceAfter_until__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: after <Q>, <S> (<S> may not become true) must precede <P> until <R> becomes true in the given sub-expression.",
				1, 1, PrecedenceAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absenceAfter_until_EClass, AbsenceAfter_until_.class, "AbsenceAfter_until_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsenceAfter_until__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> !(<P>) U (<R> | G(!(<P>))))", 1, 1, AbsenceAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsenceAfter_until__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always false after <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded, but <R> may not ever become true) in the given sub-expression.",
				1, 1, AbsenceAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceEClass, Precedence.class, "Precedence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(_until_EClass, _until_.class, "_until_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_until__Interpretation(), ecorePackage.getEString(), "interpretation", "<P> U <Q>", 1, 1,
				_until_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(get_until__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is true until <Q> becomes true in the given sub-expression.",
				1, 1, _until_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(precedenceWithoutParamsEClass, PrecedenceWithoutParams.class, "PrecedenceWithoutParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ltlOperatorsOneParamEClass, LTLOperatorsOneParam.class, "LTLOperatorsOneParam", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(universalityBefore_EClass, UniversalityBefore_.class, "UniversalityBefore_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversalityBefore__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F(<Q>) -> (<P> U <Q>)", 1, 1, UniversalityBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversalityBefore__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always true before <Q> (the state in which <Q> becomes true is excluded, but <Q> must eventually become true) in the given sub-expression.",
				1, 1, UniversalityBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceBefore_EClass, PrecedenceBefore_.class, "PrecedenceBefore_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedenceBefore__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F(<Q>) -> (!(<P>) U (<S> || <Q>))", 1, 1, PrecedenceBefore_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedenceBefore__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> does not precede <S> (<S> may not become true) before <Q> (<Q> must eventually become true) in the given sub-expression.",
				1, 1, PrecedenceBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absenceEClass, Absence.class, "Absence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(universalityAfter_EClass, UniversalityAfter_.class, "UniversalityAfter_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversalityAfter__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> G(<P>))", 1, 1, UniversalityAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversalityAfter__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always true after <Q> (the state in which <Q> becomes true is included) in the given sub-expression.",
				1, 1, UniversalityAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedExistenceAfter_EClass, BoundedExistenceAfter_.class, "BoundedExistenceAfter_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedExistenceAfter__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F(<Q>) -> (!(<Q>) U (<Q> && (!(<P>) W (<P> W (!(<P>) W (<P> W G(!(<P>))))))))", 1, 1,
				BoundedExistenceAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedExistenceAfter__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true exactly 2 times after <Q> (the state in which <Q> becomes true is included) in the given sub-expression.",
				1, 1, BoundedExistenceAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedExistenceBetween_and_EClass, BoundedExistenceBetween_and_.class,
				"BoundedExistenceBetween_and_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedExistenceBetween_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G((<Q> && F(<R>)) -> ((!(<P>) && !(<R>)) U (<R> || ((<P> && !(<R>)) U (<R> || ((!(<P>) && !(<R>)) U (<R> || ((<P> && !(<R>)) U (<R> || (!(<P>) U <R>))))))))))",
				1, 1, BoundedExistenceBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedExistenceBetween_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true exactly 2 times between <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded) in the given sub-expression.",
				1, 1, BoundedExistenceBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedExistenceGlobally_EClass, BoundedExistenceGlobally_.class, "BoundedExistenceGlobally_",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedExistenceGlobally__Interpretation(), ecorePackage.getEString(), "interpretation",
				"(!(<P>) W (<P> W (!(<P>) W (<P> W G(!(<P>))))))", 1, 1, BoundedExistenceGlobally_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedExistenceGlobally__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true exactly 2 times in the given sub-expression.",
				1, 1, BoundedExistenceGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absenceBefore_EClass, AbsenceBefore_.class, "AbsenceBefore_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsenceBefore__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F(<Q>) -> (!(<P>) U <Q>)", 1, 1, AbsenceBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsenceBefore__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always false before <Q> (the state in which <Q> becomes true is excluded, but <Q> must eventually become true) in the given sub-expression.",
				1, 1, AbsenceBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalityBetween_and_EClass, UniversalityBetween_and_.class, "UniversalityBetween_and_",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversalityBetween_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G((<Q> && F(<R>)) -> <P> U <R>)", 1, 1, UniversalityBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversalityBetween_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always true between <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded) in the given sub-expression.",
				1, 1, UniversalityBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absenceTwoParamsEClass, AbsenceTwoParams.class, "AbsenceTwoParams", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsenceTwoParams_R(), this.getElement(), null, "R", null, 1, 1, AbsenceTwoParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbsenceTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1, AbsenceTwoParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceWithourParamsEClass, ExistenceWithourParams.class, "ExistenceWithourParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundedExistneceOneParamEClass, BoundedExistneceOneParam.class, "BoundedExistneceOneParam",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedExistneceOneParam_Q(), this.getElement(), null, "Q", null, 1, 1,
				BoundedExistneceOneParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseAfter_until_EClass, ResponseAfter_until_.class, "ResponseAfter_until_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseAfter_until__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> ((<P> -> (!(<R>) U <S>)) U <R>) || G(<P> -> (!(<R>) U <S>)))", 1, 1,
				ResponseAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseAfter_until__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: after <Q>, <P> becomes true and <S> becomes true too until <R> becomes true in the given sub-expression.",
				1, 1, ResponseAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltlOperatorsEClass, LTLOperators.class, "LTLOperators", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLTLOperators_P(), this.getElement(), null, "P", null, 1, 1, LTLOperators.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(booleanOperatorsEClass, BooleanOperators.class, "BooleanOperators", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(precedenceAfter_EClass, PrecedenceAfter_.class, "PrecedenceAfter_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedenceAfter__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(!(<Q>)) || F(<Q> && (!(<P>) U (<S> || G(!(<P>)))))", 1, 1, PrecedenceAfter_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedenceAfter__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <S> (<S> may not become true) precedes <P> after <Q> (<Q> may not become true)",
				1, 1, PrecedenceAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(always_EClass, Always_.class, "Always_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlways__Interpretation(), ecorePackage.getEString(), "interpretation", "G(<P>)", 1, 1,
				Always_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlways__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always true in the given sub-expression.",
				1, 1, Always_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(absenceWithoutParamsEClass, AbsenceWithoutParams.class, "AbsenceWithoutParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseBetween_and_EClass, ResponseBetween_and_.class, "ResponseBetween_and_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseBetween_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G((<Q> && F(<R>)) -> (<P> -> (!(<R>) U <S>)) U <R>)", 1, 1, ResponseBetween_and_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseBetween_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> becomes true and <S> becomes true too between <Q> and <R>in the given sub-expression.",
				1, 1, ResponseBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseAfter_EClass, ResponseAfter_.class, "ResponseAfter_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseAfter__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> G(<P> -> F(<S>)))", 1, 1, ResponseAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseAfter__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: after <Q>, <P> becomes true and eventually <S> becomes true too in the given sub-expression.",
				1, 1, ResponseAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedExistenceWithoutParamsEClass, BoundedExistenceWithoutParams.class,
				"BoundedExistenceWithoutParams", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(precedenceBetween_and_EClass, PrecedenceBetween_and_.class, "PrecedenceBetween_and_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedenceBetween_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G((<Q> && F(<R>)) -> (!(<P>) U (<S> || <R>)))", 1, 1, PrecedenceBetween_and_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedenceBetween_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <S> (<S> may not become true) precedes <P> between <Q> and <R>",
				1, 1, PrecedenceBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedExistenceEClass, BoundedExistence.class, "BoundedExistence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderEClass, Order.class, "Order", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_S(), this.getElement(), null, "S", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceBetween_and_EClass, ExistenceBetween_and_.class, "ExistenceBetween_and_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistenceBetween_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G((<Q> && F(<R>)) -> (!(<R>) U <P>))", 1, 1, ExistenceBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExistenceBetween_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true between <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded) in the given sub-expression.",
				1, 1, ExistenceBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceAfter_until_EClass, ExistenceAfter_until_.class, "ExistenceAfter_until_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistenceAfter_until__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> (!(<R>) U <P>))", 1, 1, ExistenceAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExistenceAfter_until__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true after <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded, but <R> may not ever become true) in the given sub-expression.",
				1, 1, ExistenceAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseBefore_EClass, ResponseBefore_.class, "ResponseBefore_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseBefore__Interpretation(), ecorePackage.getEString(), "interpretation",
				"(<P> -> (!(<Q>) U <S>)) U (<Q> || G(!(<Q>)))", 1, 1, ResponseBefore_.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseBefore__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> becomes true and <S> becomes true too before <Q> (<Q> may not become true) in the given sub-expression.",
				1, 1, ResponseBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalityTwoParamsEClass, UniversalityTwoParams.class, "UniversalityTwoParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversalityTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1,
				UniversalityTwoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversalityTwoParams_R(), this.getElement(), null, "R", null, 1, 1,
				UniversalityTwoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_and_EClass, _and_.class, "_and_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_and__Interpretation(), ecorePackage.getEString(), "interpretation", "<P> && <Q>", 1, 1,
				_and_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(get_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> and <Q> becomes true in the given sub-expression.",
				1, 1, _and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(absenceGlobally_EClass, AbsenceGlobally_.class, "AbsenceGlobally_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsenceGlobally__Interpretation(), ecorePackage.getEString(), "interpretation", "G(!(<P>))",
				1, 1, AbsenceGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsenceGlobally__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always false in the given sub-expression.",
				1, 1, AbsenceGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absenceBetween_and_EClass, AbsenceBetween_and_.class, "AbsenceBetween_and_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsenceBetween_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G((<Q> && F(<R>)) -> !(<P>) U <R>)", 1, 1, AbsenceBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsenceBetween_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always false between <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded) in the given sub-expression.",
				1, 1, AbsenceBetween_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existneceOneParamEClass, ExistneceOneParam.class, "ExistneceOneParam", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistneceOneParam_Q(), this.getElement(), null, "Q", null, 1, 1, ExistneceOneParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_or_EClass, _or_.class, "_or_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_or__Interpretation(), ecorePackage.getEString(), "interpretation", "<P> || <Q>", 1, 1,
				_or_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(get_or__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> or <Q> becomes true in the given sub-expression.",
				1, 1, _or_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicElementsEClass, BasicElements.class, "BasicElements", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(universalityWithoutParamsEClass, UniversalityWithoutParams.class, "UniversalityWithoutParams",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(absenceOneParamEClass, AbsenceOneParam.class, "AbsenceOneParam", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsenceOneParam_Q(), this.getElement(), null, "Q", null, 1, 1, AbsenceOneParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseWithoutParamsEClass, ResponseWithoutParams.class, "ResponseWithoutParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundedExistenceAfter_until_EClass, BoundedExistenceAfter_until_.class,
				"BoundedExistenceAfter_until_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedExistenceAfter_until__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> ((!(<P>) && !(<R>)) U (<R> || ((<P> && !(<R>)) U (<R> || ((!(<P>) && !(<R>)) U (<R> || ((<P> && !(<R>)) (<R> || (!(<P>) W <R>) || G(<P>))))))))))",
				1, 1, BoundedExistenceAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedExistenceAfter_until__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true exactly 2 times after <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded, but <R> may not ever become true) in the given sub-expression.",
				1, 1, BoundedExistenceAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceAfter_EClass, ExistenceAfter_.class, "ExistenceAfter_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistenceAfter__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(!(<Q>)) || F(<Q> && F(<P>)))", 1, 1, ExistenceAfter_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExistenceAfter__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true after <Q> (the state in which <Q> becomes true is included) in the given sub-expression.",
				1, 1, ExistenceAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanOperatorsTwoParamsEClass, BooleanOperatorsTwoParams.class, "BooleanOperatorsTwoParams",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanOperatorsTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1,
				BooleanOperatorsTwoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanOperatorsOneParamEClass, BooleanOperatorsOneParam.class, "BooleanOperatorsOneParam",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(existenceTwoParamsEClass, ExistenceTwoParams.class, "ExistenceTwoParams", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistenceTwoParams_R(), this.getElement(), null, "R", null, 1, 1, ExistenceTwoParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExistenceTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1, ExistenceTwoParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceEClass, Existence.class, "Existence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(universalityAfter_until_EClass, UniversalityAfter_until_.class, "UniversalityAfter_until_",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversalityAfter_until__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> <P> U (<R> || G(<P>)))", 1, 1, UniversalityAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversalityAfter_until__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always true after <Q> (the state in which <Q> becomes true is included) and <R> (the state in which <R> becomes true is excluded, but <R> may not ever become true) in the given sub-expression.",
				1, 1, UniversalityAfter_until_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseGlobally_EClass, ResponseGlobally_.class, "ResponseGlobally_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseGlobally__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<P> -> F(<S>))", 1, 1, ResponseGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponseGlobally__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> becomes true and eventually <S> becomes true too in the given sub-expression.",
				1, 1, ResponseGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceGlobally_EClass, ExistenceGlobally_.class, "ExistenceGlobally_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistenceGlobally__Interpretation(), ecorePackage.getEString(), "interpretation", "F(<P>)", 1,
				1, ExistenceGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExistenceGlobally__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true in the given sub-expression.",
				1, 1, ExistenceGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundedExistenceBefore_EClass, BoundedExistenceBefore_.class, "BoundedExistenceBefore_",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedExistenceBefore__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F(<Q>) -> ((!(<P>) && !(<Q>)) U (<Q> || ((<P> && !(<Q>)) U (<Q> || ((!(<P>) && !(<Q>)) U (<Q> || ((<P> && !(<Q>)) U (<Q> | (!(<P>) U <Q>)))))))))",
				1, 1, BoundedExistenceBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundedExistenceBefore__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true exactly 2 times before <Q> (the state in which <Q> becomes true is excluded, but <Q> must eventually become true) in the given sub-expression.",
				1, 1, BoundedExistenceBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventually_EClass, Eventually_.class, "Eventually_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventually__Interpretation(), ecorePackage.getEString(), "interpretation", "F(<P>)", 1, 1,
				Eventually_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventually__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true in the given sub-expression.",
				1, 1, Eventually_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(_implies_EClass, _implies_.class, "_implies_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_implies__Interpretation(), ecorePackage.getEString(), "interpretation", "!(<P>) || <Q>", 1,
				1, _implies_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(get_implies__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> becomes true then <Q> becomes true in the given sub-expression.",
				1, 1, _implies_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(universalityGlobally_EClass, UniversalityGlobally_.class, "UniversalityGlobally_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversalityGlobally__Interpretation(), ecorePackage.getEString(), "interpretation", "G(<P>)",
				1, 1, UniversalityGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversalityGlobally__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always true in the given sub-expression.",
				1, 1, UniversalityGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceTwoParamsEClass, PrecedenceTwoParams.class, "PrecedenceTwoParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrecedenceTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1, PrecedenceTwoParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecedenceTwoParams_R(), this.getElement(), null, "R", null, 1, 1, PrecedenceTwoParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absenceAfter_EClass, AbsenceAfter_.class, "AbsenceAfter_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbsenceAfter__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G(<Q> -> !(<P>))", 1, 1, AbsenceAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsenceAfter__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always false after <Q> (the state in which <Q> becomes true is included) in the given sub-expression.",
				1, 1, AbsenceAfter_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalityEClass, Universality.class, "Universality", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(precedenceOneParamEClass, PrecedenceOneParam.class, "PrecedenceOneParam", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrecedenceOneParam_Q(), this.getElement(), null, "Q", null, 1, 1, PrecedenceOneParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseTwoParamsEClass, ResponseTwoParams.class, "ResponseTwoParams", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1, ResponseTwoParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponseTwoParams_R(), this.getElement(), null, "R", null, 1, 1, ResponseTwoParams.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceBefore_EClass, ExistenceBefore_.class, "ExistenceBefore_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistenceBefore__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F(<Q>) -> (!(<Q>) U <P>)", 1, 1, ExistenceBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExistenceBefore__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true before <Q> (the state in which <Q> becomes true is excluded, but <Q> must eventually become true) in the given sub-expression.",
				1, 1, ExistenceBefore_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occurrenceEClass, Occurrence.class, "Occurrence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(responseOneParamEClass, ResponseOneParam.class, "ResponseOneParam", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseOneParam_Q(), this.getElement(), null, "Q", null, 1, 1, ResponseOneParam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalityOneParamEClass, UniversalityOneParam.class, "UniversalityOneParam", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversalityOneParam_Q(), this.getElement(), null, "Q", null, 1, 1,
				UniversalityOneParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceGlobally_EClass, PrecedenceGlobally_.class, "PrecedenceGlobally_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecedenceGlobally__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F(<P>) -> (!(<P>) U (<S> && !(<P>)))", 1, 1, PrecedenceGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrecedenceGlobally__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <S> always precedes <P> (<P> must eventually become true) in the given sub-expression.",
				1, 1, PrecedenceGlobally_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Description(), ecorePackage.getEString(), "description",
				"Signals an occurrence of an event or can be \"TRUE\" if the literal should return always true or \"FALSE\" if the literal should return always false. Literals can also represent numerical values and comparators.",
				1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(next_EClass, Next_.class, "Next_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNext__Interpretation(), ecorePackage.getEString(), "interpretation", "X(<P>)", 1, 1,
				Next_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNext__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> becomes true in the next state in the given sub-expression.",
				1, 1, Next_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(boundedExistenceTwoParamsEClass, BoundedExistenceTwoParams.class, "BoundedExistenceTwoParams",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundedExistenceTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1,
				BoundedExistenceTwoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundedExistenceTwoParams_R(), this.getElement(), null, "R", null, 1, 1,
				BoundedExistenceTwoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(not_EClass, Not_.class, "Not_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNot__Interpretation(), ecorePackage.getEString(), "interpretation", "!(<P>)", 1, 1,
				Not_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getNot__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is false in the given sub-expression.",
				1, 1, Not_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_SubtreeInterpretations(), ecorePackage.getEString(), "subtreeInterpretations", null,
				1, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_LogicGroup(), this.getLogicGroup(), "logicGroup", "LITERAL", 1, 1, Element.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltlOperatorsTwoParamsEClass, LTLOperatorsTwoParams.class, "LTLOperatorsTwoParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLTLOperatorsTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1,
				LTLOperatorsTwoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventuallyWithin_and_EClass, EventuallyWithin_and_.class, "EventuallyWithin_and_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventuallyWithin_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F[<low>, <high>](<P>)", 1, 1, EventuallyWithin_and_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventuallyWithin_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true within <low> and <high> time units in the given sub-expression.",
				1, 1, EventuallyWithin_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventuallyWithin_and__L(), this.getLiteral(), null, "L", null, 1, 1,
				EventuallyWithin_and_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventuallyWithin_and__H(), this.getLiteral(), null, "H", null, 1, 1,
				EventuallyWithin_and_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_untilWithin_and_EClass, _untilWithin_and_.class, "_untilWithin_and_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_untilWithin_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"<P> U[<low>, <high>] <Q>", 1, 1, _untilWithin_and_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(get_untilWithin_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is true until <Q> becomes true between <low> and <high> timeunits in the given sub-expression.",
				1, 1, _untilWithin_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(get_untilWithin_and__L(), this.getLiteral(), null, "L", null, 1, 1, _untilWithin_and_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(get_untilWithin_and__H(), this.getLiteral(), null, "H", null, 1, 1, _untilWithin_and_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alwaysWithin_and_EClass, AlwaysWithin_and_.class, "AlwaysWithin_and_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlwaysWithin_and__Interpretation(), ecorePackage.getEString(), "interpretation",
				"G[<low>, <high>](<P>)", 1, 1, AlwaysWithin_and_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlwaysWithin_and__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always true within <low> and <high> time units in the given sub-expression.",
				1, 1, AlwaysWithin_and_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlwaysWithin_and__L(), this.getLiteral(), null, "L", null, 1, 1, AlwaysWithin_and_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlwaysWithin_and__H(), this.getLiteral(), null, "H", null, 1, 1, AlwaysWithin_and_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mitlOperatorsEClass, MITLOperators.class, "MITLOperators", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMITLOperators_P(), this.getElement(), null, "P", null, 1, 1, MITLOperators.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mitlOperatorsOneParamEClass, MITLOperatorsOneParam.class, "MITLOperatorsOneParam", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mitlOperatorsTwoParamsEClass, MITLOperatorsTwoParams.class, "MITLOperatorsTwoParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMITLOperatorsTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1,
				MITLOperatorsTwoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combEClass, Comb.class, "Comb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComb_Element(), this.getElement(), null, "element", null, 0, -1, Comb.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mtlOperatorsEClass, MTLOperators.class, "MTLOperators", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMTLOperators_P(), this.getElement(), null, "P", null, 1, 1, MTLOperators.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mtlOperatorsOneParamEClass, MTLOperatorsOneParam.class, "MTLOperatorsOneParam", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mtlOperatorsTwoParamsEClass, MTLOperatorsTwoParams.class, "MTLOperatorsTwoParams", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMTLOperatorsTwoParams_Q(), this.getElement(), null, "Q", null, 1, 1,
				MTLOperatorsTwoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(_untilWithin_EClass, _untilWithin_.class, "_untilWithin_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_untilWithin__Interpretation(), ecorePackage.getEString(), "interpretation",
				"<P> U[<high>] <Q>", 1, 1, _untilWithin_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(get_untilWithin__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is true until <Q> becomes true within <high> timeunits in the given sub-expression.",
				1, 1, _untilWithin_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(get_untilWithin__H(), this.getLiteral(), null, "H", null, 1, 1, _untilWithin_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alwaysWithin_EClass, AlwaysWithin_.class, "AlwaysWithin_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlwaysWithin__Interpretation(), ecorePackage.getEString(), "interpretation", "G[<high>](<P>)",
				1, 1, AlwaysWithin_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlwaysWithin__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is always true within <high> time units in the given sub-expression.",
				1, 1, AlwaysWithin_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlwaysWithin__H(), this.getLiteral(), null, "H", null, 1, 1, AlwaysWithin_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventuallyWithin_EClass, EventuallyWithin_.class, "EventuallyWithin_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventuallyWithin__Interpretation(), ecorePackage.getEString(), "interpretation",
				"F[<high>](<P>)", 1, 1, EventuallyWithin_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventuallyWithin__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> eventually becomes true within <high> time units in the given sub-expression.",
				1, 1, EventuallyWithin_.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventuallyWithin__H(), this.getLiteral(), null, "H", null, 1, 1, EventuallyWithin_.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_P(), this.getLiteral(), null, "P", null, 1, 1, Relation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRelation_Q(), this.getLiteral(), null, "Q", null, 1, 1, Relation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(_lessThan_EClass, _lessThan_.class, "_lessThan_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_lessThan__Interpretation(), ecorePackage.getEString(), "interpretation", "<P> < <Q>", 1, 1,
				_lessThan_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(get_lessThan__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is less than (<) <Q>", 1, 1,
				_lessThan_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(_lessThanOrEqual_EClass, _lessThanOrEqual_.class, "_lessThanOrEqual_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_lessThanOrEqual__Interpretation(), ecorePackage.getEString(), "interpretation", "<P> <= <Q>",
				1, 1, _lessThanOrEqual_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(get_lessThanOrEqual__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is less than or equal to (<=) <Q>", 1, 1,
				_lessThanOrEqual_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(_equal_EClass, _equal_.class, "_equal_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_equal__Interpretation(), ecorePackage.getEString(), "interpretation", "<P> = <Q>", 1, 1,
				_equal_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(get_equal__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is less equal to (=) <Q>", 1, 1,
				_equal_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(_greaterThan_EClass, _greaterThan_.class, "_greaterThan_", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_greaterThan__Interpretation(), ecorePackage.getEString(), "interpretation", "<P> > <Q>", 1,
				1, _greaterThan_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(get_greaterThan__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is greater than (>) <Q>", 1, 1,
				_greaterThan_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(_greaterThanOrEqual_EClass, _greaterThanOrEqual_.class, "_greaterThanOrEqual_", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(get_greaterThanOrEqual__Interpretation(), ecorePackage.getEString(), "interpretation",
				"<P> >= <Q>", 1, 1, _greaterThanOrEqual_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(get_greaterThanOrEqual__Description(), ecorePackage.getEString(), "description",
				"The expression described by this element becomes true if: <P> is greater than or equal to (>=) <Q>", 1,
				1, _greaterThanOrEqual_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stlOperatorsEClass, STLOperators.class, "STLOperators", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ltlPatternMappingsEClass, LTLPatternMappings.class, "LTLPatternMappings", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(logicGroupEEnum, LogicGroup.class, "LogicGroup");
		addEEnumLiteral(logicGroupEEnum, LogicGroup.LITERAL);
		addEEnumLiteral(logicGroupEEnum, LogicGroup.LTL);
		addEEnumLiteral(logicGroupEEnum, LogicGroup.MTL);
		addEEnumLiteral(logicGroupEEnum, LogicGroup.MITL);
		addEEnumLiteral(logicGroupEEnum, LogicGroup.STL);

		initEEnum(supportedOutputEEnum, SupportedOutput.class, "SupportedOutput");
		addEEnumLiteral(supportedOutputEEnum, SupportedOutput.COMB);
		addEEnumLiteral(supportedOutputEEnum, SupportedOutput.SPOT);
		addEEnumLiteral(supportedOutputEEnum, SupportedOutput.UPPAAL);
		addEEnumLiteral(supportedOutputEEnum, SupportedOutput.NU_SMV);
		addEEnumLiteral(supportedOutputEEnum, SupportedOutput.SPIN);

		// Create resource
		createResource(eNS_URI);
	}

} //CombPackageImpl
